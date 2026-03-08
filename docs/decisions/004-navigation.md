# Navigation

**Status: Decided**  
**Date: 2025/03/08**

## Rationale

The current application uses a string-based navigation approach that lacks compile-time safety,
making it prone to runtime crashes from typos or incorrect argument parsing. Furthermore, the
tablet-first nature of the app requires a navigation structure that preserves the
state of multiple top-level destinations (Dashboard, Daily Log, Project Tracker) while providing a
consistent "Shell" (Scaffold) that adapts to different window sizes.

**Investigation Note:** An initial technical spike was conducted to explore the differences between
legacy string-based routing and the modern Type-Safe API. This "code as investigation" revealed that
while string-based routing is simpler for small prototypes, it becomes unmanageable as the app
grows. The investigation also explored the experimental Navigation 3 proposal but concluded that
Navigation 2.8.0+ offers the best balance of modern type safety and framework stability for this
project.

## Decision

We will implement Type-Safe Navigation using Jetpack Navigation 2.8.0+ and Kotlin Serialization.
This will be integrated into a hoisted Scaffold Architecture to manage global UI elements and
authentication states.

### 1. Type-Safe Routing

We will define all destinations as `@Serializable` Kotlin objects or data classes.

- Root Destinations: `Dashboard`, `DailyLog`, and `ProjectTracker` will be defined as objects.
- Parameterized Routes: Any screen requiring data (e.g. `ProjectDetail(val id: String)`) will use
  a data class.
- Implementation: We will use the `composable<T>` and `navController.navigate(T)` APIs, which
  eliminate the need for manual string route construction.

### 2. Authentication Guard (Gatekeeper)

Navigation will be state-driven based on the user's authentication status.

- The `NavHost` will conditionally set its `startDestination` based on an observed AuthState.
  Upon successful login, the `Login` route will be popped inclusively from the backstack to
  prevent users from navigating back to the authentication screen.

### 3. Adaptive Scaffold Shell

The `MainActivity` will host a Material 3 `Scaffold` wrapped in a `DismissibleNavigationDrawer`.

- **Persistent Navigation:** A `NavigationRail` will provide icon-only access when collapsed, while
  the `DismissibleNavigationDrawer` will push the content grid when expanded .
- **State Preservation:** We will use `saveState = true` and `restoreState = true` when switching
  between top-level destinations to ensure UI states like scroll positions are maintained .

### 4. Future Work

- **Modal/Side Sheet:** The Profile reference will be implemented as a ModalBottomSheet or a custom Side Sheet overlay. This will be managed as transient UI state rather than a navigation
  destination to keep the backstack clean.
- **Deep Linking:** Once the type-safe structure is stable, we will add `navDeepLink` support to the
  serializable routes to allow external URI navigation.

## Consequences

- **Easier:** Refactoring routes becomes a compiler-checked task; argument passing is now type-safe
  and automatic; tablet-specific layout transitions are centralized in the Scaffold.
- **Difficult:** Requires the `kotlinx-serialization` plugin and slightly more initial boilerplate
  for defining route classes. It also requires careful management of `WindowInsets` to ensure the
  adaptive UI elements do not overlap with system bars.

# App Architecture

**Status: Decided**
**Date: *2025/07/20***

## Raionale

Before feature development can begin, a clear and consistent architecture pattern must be chosen to ensure the project
has a solid technical foundation. This decision will guide how UI state is *managed*, how user interactions are
*handled*, and how business logic is *separated* from the view layer.

### Architectural Candidates

The two primary candidates considered were Model-View-ViewModel (MVVM) and Model-View-Intent (MVI).

1. MVVM is a well-established pattern that separates the View from business logic via a ViewModel, which exposes state
   through observable streams.
2. MVI is a stricter, unidirectional pattern that models the UI with a single state object and processes user actions as
   explicit "Intents."

### Developer's Prior Experience

My professional experience includes working with both architectures. While I have more experience using MVI on a
large-scale application, my exposure to MVVM has been more limited. Other than pure enjoyment, a key goal of this
project is growth. Therefore, choosing an architecture that I am less familiar with in a modern context (Jetpack
Compose) presents a valuable learning opportunity.

## Decision

We will be using **Model-View-VIewModel (MVVM)** for this project.

This decision is based on the following reasons:

1. **Simplicity and Pragmatism:** MVVM has a lower barrier to entry and aligns better with the goal of this being a
   learning project.
2. **Target Audience:** MVVM is ideally suited for small-medium sized applications.
3. **Official Recommendation**: MVVM is recommended by Google and is referenced in
   their [developer docs](https://developer.android.com/topic/architecture/recommendations).

## Consequences

MVVM, will not only enable development of good quality software. It will also ensure that more time can be dedicated to
exploring other design principles and further learning's.

Should the app become too large, or handling of state too complex, we would need to revist the underlying Architecture
and adjust as more information is available and pain points/limitations have been identified.
- **Mitigation:** For the current scope, this is not a concern. This decision can be revisited as the architecture becomes
a significant pain point.

# Dependency Injection

**Status: Decided**
**Date: *2025/08/11***

## Rationale

As the application grows, manually creating and passing dependencies (e.g., Repositories, API
clients) to various components like ViewModels becomes cumbersome and error-prone. This tight
coupling makes the codebase difficult to maintain, scale, and test.

To address this, a dependency injection (DI) framework is necessary to automate the management of
object creation and lifecycles. The primary candidates considered were Hilt (Google's recommended,
compile-time framework) and Koin (a popular, lightweight runtime framework). The goal is to select a
single framework to ensure consistency and focus development effort on product features rather than
tooling debates.

## Decision

The project will use Hilt as its dependency injection framework. This decision is based on the
following key factors:

1. Industry Standard: Hilt is the officially recommended DI library for modern Android development
   by Google, ensuring excellent documentation, community support, and integration with Jetpack
   libraries.
2. Compile-Time Safety: Hilt validates the entire dependency graph at compile time. This catches
   configuration errors during the build process, preventing a whole class of potential runtime
   crashes and increasing overall application stability.
3. Reduced Long-Term Maintenance: While Hilt requires more initial setup, its compile-time
   guarantees and clear structure reduce the time spent debugging DI issues, allowing for a greater
   focus on building and refining product features.

## Consequences

What becomes easier:

- Adding or changing dependencies: The process is standardized and validated by the compiler,
  reducing the risk of human error.
- Testing: Components become easier to test in isolation, as mock dependencies can be easily
  provided in test environments.
- Onboarding and Scalability: The architecture is clear and follows a well-documented standard,
  making it easier to scale the project or for others to understand the codebase.

What becomes more difficult:

- Initial Setup: Hilt has more initial boilerplate compared to Koin, requiring annotations in the
  Application class, Activities/Fragments, and the setup of Gradle plugins.
- Build Times: The compile-time code generation can lead to slightly longer build times, especially
  as the project grows.
- Learning Curve: For a developer new to Dagger/Hilt, the concepts can be more complex to grasp than
  Koin's simpler API. 
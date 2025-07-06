# Project.kt
Rediscovering the craft of software engineering, one Composable at a time.

## Why
I've found that in my day-to-day job, I'm not able to craft high-quality software that is technical first. More and more, it seems that I'm needing to jungle company politics and changing business requirements. Which inevitably leads to unnecessary and avoidable delays.

As a Senior Software Engineer, this comes with the job. Yet, I would like to take a step back in my own personal capacity and craft exceptional software. After all, as a former lead of mine once told me; "I have a level of excellence that is hard to find in the industry".

This is what I would like to explore a little more. With the end goal being a project for learning, enjoyment and professional growth.

Lastly, I do miss the Kotlin programming language. As my specialty is Mobile Development, I would like to explore Jetpack Compose for tablets. Something that I have never done before.

## What
To start out, I would like to craft three features. Three features that encompass the building blocks for a great mobile app. These being:
1. **Project Tracker:** A landing page with a list of personal projects and a visual chart showing their status.
2. **Daily Log:** A place to create, save locally and share these simple daily notes.
3. **Smart Profile:** A profile screen featuring a live weather widget and an app-wide theme toggle.

All in all, it will encompass the following functionality

| Feature | MVVM | 3rd Party Lib | Native Func. | HTTP Calls | Animation |
| - | - | - | - | - | - |
| Project Tracker | ✅ | ✅ | | | ✅ |
| Daily Log |	✅ | | ✅ | | |		
| Smart Profile |	✅| | |  ✅ 	| |

## How
My current philosophy in life is not to re-create or re-invent the wheel. Rather to use what is already out there. To use what is tried and tested. As such, the Tech Stack would be as follows:
- **Architecture:** MVVM, Repository Pattern and Hilt
- **UI:** Jetpack Compose, Material 3 and Tablet-first layouts
- **Data Strategy:** Fake/Mock data layer to focus on the app itself. Where necessary using a targeted approach for a DB (local) and a Weather API (remote).
- **Process:** Github for source control, ADRs for key decisions and a Kanban board for task management.

The last point there is imperative with the approach that I plan on taking. I've found that in the past when working on a personal project I don't get very far as I don't know what it is that I would like to build. Nor how I will go about building it. As such, I would like to take time to plan out the what it is that I will be building. Then when I get the time to work on this, I know what it is that I need to build.

Think of this as me being the Product Owner, Business Analysts and Engineer all in one package.

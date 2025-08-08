# 🚀 Jetpack Compose Tuts

Jetpack Compose is **Android’s modern toolkit for building native UI**. It simplifies and
accelerates UI development on Android with **less code**, **powerful tools**, and **intuitive Kotlin
APIs**.

---

## 📌 What is Jetpack Compose?

Jetpack Compose is a **declarative UI framework** developed by Google, allowing developers to
describe their UI in Kotlin code rather than using XML layout files.

Instead of inflating views from XML, you **write composable functions** that generate UI components.
Jetpack Compose takes care of the rendering and efficiently updates the UI when the underlying data
changes.

---

## 🔍 Jetpack Compose vs XML-based UI

| Feature               | Jetpack Compose                            | XML + Views (Traditional)                   |
|-----------------------|--------------------------------------------|---------------------------------------------|
| **Language**          | Pure Kotlin                                | XML for layout + Kotlin/Java for logic      |
| **UI Paradigm**       | Declarative                                | Imperative                                  |
| **Boilerplate Code**  | Minimal                                    | Requires more code for updates/binding      |
| **Live Previews**     | Built-in with Android Studio               | Limited, slower preview                     |
| **UI State Handling** | Built-in state management (`remember`)     | Requires tools like LiveData or ViewModel   |
| **Performance**       | Highly optimized with recomposition        | Can be less efficient due to view inflation |
| **Learning Curve**    | Easier if familiar with Kotlin             | Requires learning XML + View system         |
| **Theming & Styling** | Unified with Material Design 3             | Separate styles and themes XML              |
| **Interoperability**  | Can coexist with Views (via `AndroidView`) | Fully XML-based                             |

---

## 💡 Why Use Jetpack Compose?

- Faster development with real-time previews
- Cleaner, more readable code
- Easier UI testing and prototyping
- Fully supports Material Design
- Highly flexible for dynamic UIs

## 🔄 Interoperability with XML

You don't need to rewrite your whole app. Jetpack Compose can coexist with existing XML views:

- Use AndroidView to embed Views inside Compose
- Use ComposeView in XML to host Compose UIs
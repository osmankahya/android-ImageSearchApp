<h2>Image Search App</h2>  

We will build an app that can search the [Unsplash API](https://unsplash.com/developers) for images and display them in a RecyclerView.

## API
- [Unsplash API](https://unsplash.com/developers)

## Prerequisite
- minSdkVersion: 21
- Add Api_key from [Unsplash API](https://unsplash.com/developers) to gradle.properties named API_KEY
  
## Libraries
This app takes use of the following libraries:
- [View Binding](https://developer.android.com/topic/libraries/view-binding) - allows you to more easily write code that interacts with views
- [Retrofit with Coroutines](https://github.com/square/retrofit) - type safe http client with coroutines support
- [Gson](https://github.com/google/gson) - A Java serialization/deserialization library to convert Java Objects into JSON and back
- [Glide](https://github.com/bumptech/glide) - image loading
- [Paging 3](https://developer.android.com/topic/libraries/architecture/paging/v3-overview) - helps you load and display pages of data from a larger dataset from local storage or over network
- [Navigation Component](https://developer.android.com/guide/navigation) - allow users to navigate across, into, and back out from the different pieces of content within your app
- [Dependency injection with Dagger Hilt](https://github.com/square/okhttp/blob/master/okhttp-logging-interceptor/README.md) - Hilt is a dependency injection library for Android that reduces the boilerplate of doing manual dependency injection in your project.

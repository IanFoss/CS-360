Briefly summarize the requirements and goals of the app you developed. What user needs was this app designed to address?

The requirements and goals of the app was to create an app that manages inventory for a warehouse. The app required the use of a database to store user accounts as well as inventory items. Users needed to be able to log in to an account, or create an account if they do not have one. Inventory items needed to be present in a grid format that displays the item's information. Required functionality included the ability to add new items to the grid, delete items from the grid, and change the quantity of a particular item. This app also needed to request the user's permission for SMS usage, so that they can receive text message alerts for low inventory. If the user does not give permission, the app still needs to function normally, just without sending a text message for low inventory. The needs this app is designed to address are keeping track of inventory products and their quantities, notifying employees of low inventories, as well as adding and removing items from the inventory.



What screens and features were necessary to support user needs and produce a user-centered UI for the app? How did your UI designs keep users in mind? Why were your designs successful?

One necessary screen was the login screen. This is the first screen the user sees when starting the app. This provided a simple UI for the user to log in to their account. The text "New User? Click Here." provided an easy way for the user to create an account. Tapping this text makes the fields for the account creation appear. Hiding those fields unless necessary simplifies the UI and prevents cognitive overload. The user can immediately log in to the app on the same screen after creating the account, making account creation and navigation efficient. The other necessary screen was the inventory screen. This screen shows the grid layout with all the items in the inventory. This is a vertically scrollable layout with easy to read text. The floating action button intuitively guides the user to add a new item to the inventory. Tapping this button brings up a dialog where the user enters the items information, clicks save, and then the item immediately appears in the grid. The trash can icon provides an intuitive way to remove an item with a single click. Tapping the item brings up a dialog where the user can change the item's quantity. These screens provide a clear hierarchy and intuitive action elements for the user, enabling a smooth user experience.



How did you approach the process of coding your app? What techniques or strategies did you use? How could those techniques or strategies be applied in the future?

The approach I took was to first develop a simple layout for each screen, just enough to know what the screen is used for. Then I coded the logic for the interactive elements present in the screen, creating text watchers and on click listeners to verify/validate text and perform necessary functions like navigating to the inventory screen or bringing up the dialog to create a new item. My strategy was to write the minimal amount of code to get the application working the way I wanted, and then to style and adjust elements as necessary to make a final polished look. This strategy could be applied in the future in the context of developing an application that integrates with a database, as this one did. My screens were already created, and dummy data was used to populate the grid. While this provided a learning experience in refactoring the application to obtain user and inventory item data from a database, my strategy of ensuring the database works before completing every other aspect of the app would have been ideal.



How did you test to ensure your code was functional? Why is this process important, and what did it reveal?

To test my code, I frequently ran the code using the Android emulator. This was essential because it helped me find errors early in the development process. There were several instances where my logic was incorrect, or I used the wrong method call to accomplish something, and the application crashed. If I had waited until late in the development process to run the app in the emulator, this would have created an insurmountable amount of technical debt, and made the debugging process much more difficult than it needed to be.



Consider the full app design and development process from initial planning to finalization. Where did you have to innovate to overcome a challenge?

An area where I needed to think outside of the box was in creating the log in screen. I thought having a logo for the app and a minimalist login screen was a good idea, and so there was barely any room to create fields for a user to create an account. Because of this, I decided to have some clickable text that would change the text input fields and create account button's visibilities from invisible to visible. This made the create account form appear only when the user clicked the text, which saved space on the screen and provided a clean user interface.



In what specific component of your mobile app were you particularly successful in demonstrating your knowledge, skills, and experience?

I believe using the recyclerview as the grid for the inventory items was a successful demonstration of skills. The recyclerview is today's standard for contained, scrollable views, and so decorating it to look like a grid while providing a performant and memory efficient way to see the inventory was strategic. There was a learning curve in getting the recyclerview setup in learning how the adapter and viewholder classes worked. In the end, I thought this was a fulfilling demonstration of my progress in learning Android development.

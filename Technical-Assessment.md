1. Differences between a stack and a queue:
   Both a stack and a queue are data structures responsible for storing a collection of elements,  but they operate differently when it comes to adding and deleting elements.
   A stack follows the LIFO principle (LAST IN, FIRST OUT), which means that the last inserted element is the first to come out. We can think of it as a stack of plates: we add new plates on top and remove the most recently added one from the top. On the other hand, a queue is based on the FIFO principle (FIRST IN, FIRST OUT), which implies that the element that's added first to the list is also the first one to be removed from it. It is like a line at a ticket counter: the person who arrives first gets served first.
   Some real-life scenarios where each of them are used appropriately: In text editors, performing an action such as typing is stored in a stack. Pressing "Undo" reverses the most recent action by popping it off the stack.  Similarly, navigating through web pages: when clicking the back button, the most recently visited page is popped out from the stack. The queue structure is used for other scenarios, such as printing multiple documents: the are queued up and the printer processes them in the order they were received.

2. Differences between an array and a linked list:
   An array stores elements in contiguous memory locations, while in a linked list each node contains a data element and a pointer to the next node in the sequence. Given the fact that linked lists are dynamic in size, they are suitable for scenarios where the size of the collection changes frequently. Another advantage refers to the efficient insertion and removing elements, which are fast and flexible, because it involves adjusting pointers, rather than moving large blocks of memory (which is needed in case of an array). However, one disadvantage comes when accessing elements which requires traversing the list from the beginning, which can be slower compared to arrays, especially for large lists. Moving on to arrays, they are suitable for scenarios where random access to elements is frequently required, such as searching or sorting algorithms, but they are not recommended  when the size of the collection varies, because arrays have a fixed size and resizing it often involves creating a new array and copying elements over, which can be inefficient.

3. HTTP vs HTTPS:
   HTTP is a protocol used for communication between a client (usually a web browser) and a server. It is a stateless protocol because each request from a client to the server is treated independently. The requests and responses are text-based, which makes them easily to interpret, but not as secured as it should be, which represents the main difference between HTTP and HTTPS as HTTPS is an extended version of the first protocol, but used for secure communication. In other words, HTTPS adds an extra layer of security by encrypting the data exchanged between the client and server, making it safer for transmitting sensitive information.

4. Examples of common HTTP response codes:
   200 OK -it indicates that the request has succeeded.
   401 Unauthorized -the request requires user authentication
   404 Not Found -the server cannot find the requested resource
   500 Internal Server Error -the server is temporarily unable to handle the request

5. Difference between authorization and authentication:
   Authorization and authentication are both very important components of security systems. Authentication is the process of verifying the identity of a user. For example, when logging in to a website by entering the username and password, the website verifies the correctness of the credentials provided against its database. If the credentials match, the system grants you access to the account. On the other hand, authorization is the process of determining what actions a user is allowed to access or perform after successful authentication.

6. Explaining to a 5-year-old how the WWW works:
   This is how I would explain it: "Imagine that you have a play-day at a friends' house who has a lot of toys and games. Each toy or game is kept in a special box called a website. When you want to play with a toy or game, you ask your friend (your computer or tablet) to take you to the right box, because your friend knows where all the boxes are and how to get to them. Once you're at the right box, you can open it up and start playing! And just like there are many toys and games in the playground, there are lots of different websites on the World Wide Web, each with its own fun things to see and do!"
   







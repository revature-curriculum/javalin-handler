## Javalin Handler
---
### Description
In this lab we will cover how to use handlers within your Javalin web application.

---
### Steps
1. In src -> main -> java -> Main.java, create a String ArrayList called characters. Make sure to make this arraylist static and create it outside the main method. 
2. In the same class, following the movie example, complete the implementation for the characterHandler.
   - Add at least 4 characters to your arraylist
   - Use ctx.render() to display the characters arraylist.
   - Use the .toString() method of ArrayList in the ctx.render() method to display a string representation of the ArrayList on the webpage.
4. Add a '/favcharacters' route that can be used along with the characterHandler.
5. Connect the new route you just created to the characterHandler.
---
### Sample Output
```
[Tony Stark, Jinx, Steven Stone, Tadashi Hamada]
```
---

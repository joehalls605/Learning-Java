/*
Immutable vs Mutable Objects

Mutable Objects
Mutable objects are those whose state (i.e., the value of fields) can be changed after they are created. 
Examples of mutable objects in Java include instances of classes like StringBuilder, ArrayList, and HashMap.
*/

ArrayList<String> list = new ArrayList<>();
list.add("A");
list.add("B");
list.set(1, "C"); // Modifies the list

/*
Immutable objects, on the other hand, cannot have their state changed after they are created. Once an immutable object is instantiated, it cannot be modified. 
The most common example of an immutable object in Java is the String class.
*/

String str = "Hello";
String newStr = str.concat(" World"); // Does not modify `str`, creates a new String `newStr`

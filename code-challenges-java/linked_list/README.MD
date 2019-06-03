# Array Shift Summary


## Challenge Description
Create a linked list with a head node that has values and points to the next node in the list.

## Approach & Efficiency
I created a constructor node with the properties for the value and next. Instantiate the head node then create the pointer values for the next node in the list. Once that new node gets created then set the head node to be that newly created node. While the very first node created will point to null.

Time complexity is O(1).
Space complexity is O(1).

## API
Insert() - Takes in a value as an arguement and adds a new node with that value to the head of the list.
Includes() - Takes in a value as argument and returns true when it finds that value in the linked list.
Print() - Takes in no arguments and returns an ArrayList of the current Node values in the linked list.

## Solution

[Link to Code](./src/main/java/linked_list/Library.java)

[Link to Test Code](./src/test/java/linked_list/LibraryTest.java)

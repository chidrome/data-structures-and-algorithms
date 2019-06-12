# FIFO Animal Shelter


## Challenge Description
Create a class called AnimalShelter which holds only dogs and cats. The shelter operates using a first-in, first-out approach.
Implement the following methods:
* enqueue(animal): adds animal to the shelter. animal can be either a dog or a cat object.
* dequeue(pref): returns either a dog or a cat. If pref is not "dog" or "cat" then return null.

## Approach & Efficiency
I created cat and dog classes and created nodes to add(enqueue()) dogs or cats or remove(dequeue()) cats or dogs.


**Enqueue**
* Time is O(1)
* Space is O(n)

**Dequeue**
* Time is O(1)
* Space is O(n)


## API
enqueue()

dequeue()



## Solution

[Link to Code](./src/main/java/fifo_animal_shelter/AnimalShelter.java)

[Link to Test Code](./src/test/java/fifo_animal_shelter/AppTest.java)

![Challenge 10 WB](./assets/code_challlenge_10.jpg)


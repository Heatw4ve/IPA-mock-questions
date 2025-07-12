# Java: Photographer

Create a class Photographer with the following attributes:

id - int

name - String

specialization - String

rating - double

Write getters, setters, and parameterized constructors in the above mentioned attribute sequence as required.

Create a class Solution with the main method.

Implement two statuc methods - countPhotographersBySpecialization and getSecondHighestRatedPhotographer - in the Solution class.

1. countPhotographersBySpecialization: Create a static method with the mentioned name in Solution class. This method will take an array of Photographer objects and a String specialization as input. Return the count of photographers who match the given specialization (case-insensitive). If none found, return 0.
2. getSecondHighestRatedPhotographer: Create a static method with the mentioned name in Solution class. The method will take an array of Photographer objects as input. It should return the Photographer object with te second highest rating. If multiple photographers have the same rating, return the first one among them in input order. If there is no second highest (i.e. only one unique rating or fewer than two photographers), return null.

These methods should be called from main method.

Write code to perform the following tasks:

1. Take the necessary input and call countPhotographersBySpecialization. If the returned value is greater than 0, print: "Number of photographers in `<specialization>: <value>`"
   Else, print: "No photographers found in given specialization."
2. Take the necessary input and call getSecondHighestRatedPhotographer. Print in the mentioned format:
   id-`<id>`
   name-`<name>`
   specialization-`<specialization>`
   rating-`<rating>`
   Else, print: "Second highest rated Photographer not available"

Note: All string comparisons are case insensitive.

Sample Input 1:

```
4
101
Meera
Wildlife
4.1
102
Raj
Portrait
4.2
103
Aritra
wildlife
4.5
104
Veer
Fashion
4.8
Wildlife
```

Sample Output 1:

```
Number of photographers in Wildlife: 2
id-103
name-Aritra
specialization-wildlife
rating-4.5
```

Sample Input 2:

```
4
101
Meera
Wildlife
4.9
102
Raj
Portrait
4.2
103
Aritra
wildlife
4.5
104
Veer
Fashion
4.8
Home Decor
```

Sample Output 2:

```
No photographers found for the given specialization.
id-104
name-Veer
specialization-Fashion
rating-4.8
```

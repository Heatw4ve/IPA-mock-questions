# Java : Journalist

Create a class Journalist with below attributes

id - int

name - String

experience - int (in years)

region - String

Write getters, setters, and parameterized constructors in the above mentioned attribute sequence as required.

Create a class Solution with the main method.

Implement two statuc methods -

findAverageExperienceByRegion and searchJournalistById in the Solution class.

1. findAverageExperienceByRegion:
   Create a static method with the mentioned name in the Solution class. This method will take an array of Journalist objects and a String region name as input and return the average experience of journalists belonging to the given region (case-insensitive match).
   If no Journalist is found from that region, return 0.
2. searchJournalistById:
   Create a static method with the mentioned name in the Solution class. This method will take an array of Journalist objects and an int id as input and return the Journalist object having the mentioned id if found; else return null.

These methods should be called from the main method.

Write code to perform the following tasks:

1. Take the necessary input and call findAverageExperienceByRegion. If the returned value is greater than 0, the main method should print: "Average experience: `<value>"`else, print: "No journalists found from the given region."
2. Take the necessary input and call searchJournalistById. If the returned value is not null, the main method should print the journalist object details in the format:
   id-`<id>`
   name-`<name>`
   experience-`<experience>`
   region-`<region>`
   Else, print: "No Journalist found with the given id."

The above mentioned static methods should be called from the main method. All string comparisons need to be case-insensitive.

Sample Input 1:

```
3
201
Ravi
10
South
202
Leena
6
North
203
Amit
8
South
South
202
```

Sample Output 1:

```
Average experience: 9.0
id-202
name-Leena
experience-6
region-North
```

Sample Input 2:

```
3
201
Ravi
10
South
202
Leena
6
North
203
Amit
8
South
South
209
```

Sample Output 2:

```
Average experience: 9.0
No journalist found with the given id.
```

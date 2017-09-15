# Portal-Interview

For Task 2, I created 2 Java classes to help me check for scheduling conflicts. The first class, Schedule, makes it so I can create instances of objects with an event name, a date, start time, and end time (each with a get and set so that I could avoid returning null when I printed out which events conflict each other). I represented the date as 6 digits, similar to 02/20/98 without the "/", which allowed me to keep a uniform way of checking dates in this century against each other. I represented the time as military numbers since 3pm and 3am would have made the code more complicated and I wanted to keep it as an int. Then, I created an array filled with 8 Schedule objects in earliest to latest occurance (since I was sorting the events by the one next to it) and embedded a forloop in another forloop to compare two events and check for first the same date and then overlapping times. 

(To check Task 2, run ConflictFinder because it just calls on Schedule.)

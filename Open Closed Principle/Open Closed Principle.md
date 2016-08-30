# Open Closed Principle

We want to be able to cope with changes in the behaviour of our code, but making the smallest possible changes to the source code as possible to achieve this. We don't a tiny alteration in how our program runs to cause us to have to update hundreds of lines of code.

The Open Closed Principle encourages us to keep our code "open for extension but closed for modification". We seen this with dependency inversion - we can pass in different behaviours to a class without altering it directly. 

The template pattern is another great example of this - we can change the behaviour of a super class by delegating methods to the subclass. The superclass doesn't have to change, but can be used effectively to abstract away details from the subclass.

## Before

A Gymnast and a Boxer are both athletes that compete in events. Entering an event has a specific turn of events: 

1. Warm up
2. Compete
3. Calculate Points
4. Recieve Medal

These have to happen in this order. This is a fairly crude example with the same point system being used for assigning medals to both Gymnasts and Boxers.

We can see there is a lot of duplication - both the Gymnast and Boxer have a points property and both have the same prepare(), compete() and recieveMedal() methods. This is not DRY. If we want to add another type of Athlete, we need create a whole new class and duplicate all of these methods, just for the sake of adding a slightly different points calculation.

If we change the prepare() method on the Boxer, we also need to change it in the Gymnast since they are both meant to be the same. The classes are **open for modification** since any changes to the other class means it has to be updated. Entering an event cannot be easily extended, since any new action must be added to both a Gymnast and a Boxer.

## After

All of the common methods have been pushed up into the new Athlete abstract class. There is an abstract method caluclatePoints() that delegates it's implementation to the Gymnast and the Boxer. This sets the points property which is used in the recieveMedal() method of the Athlete class.

This is super cool, since adding a new type of Athlete is dead easy. We just extend the Athlete class and write the required calculatePoints() method. The Athlete class is **closed for modification** since it has all of the running order information inside of it and we do not need to alter the source code to add a new type of athlete. If we didn't have the source code for an Athlete, we could still make a Swimmer that extends it.

The Athlete is **open for extension** since we can implement the calculatePoints() method on the class extending it, to define what the behaviour should be without touching the source code of the parent class which is responsible for running the enterEvent() method.



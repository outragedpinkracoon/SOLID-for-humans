## S - Single Responsiblity Principle (SRP)

We should aim to make our classes only responsible for one coherent set of properties with related behaviours. We don't want our class to be affected by changes that should not concern it because it's full of properties and methods that really don't belong there, and may change more than the class itself needs to. (What? It's fine, the code example will help).

If we adhere to the **loose coupling, high cohesion** principles, we should have code that adheres to the SRP.

## Before

We have an Athlete that has a totalDistance property that rightfully belongs there, and it has a run() method which belongs there which increments with this property.

However, it also has a writeDistanceLog() which is a bit naughty. Should the Athlete be responsible for this? Should the athlete care how the log is written? This is current breaking quite a few rules:

* It's tightly coupled to the System.out console logging. What if we want to write to a file? We'd have to **change** the class.
* The Athlete is tied to this implmentation. If we change the message we log, the Athlete has to **change**.

We've identified at least 2 reasons for the Athlete to change, none of which even relates to the state of the Athlete - the run() method or totalDistance property. We could imagine the Athlete having to change if we added a new behaviour, like sprint() or drinkWater(), but having to alter it's source code because we want to write to a file instead of the console feels wrong.

## After

In the refactored version, the athlete only has 1 method run() which we would expect. The code to handle logging the distance has been **abstracted away** to an AthleteConsoleLog. We don't care how the log achieves it goal, all we care about is that the athlete has some way to make a log entry.

Now, if we want to change the way the athlete logs to use a file instead of the console we **don't need to change the Athlete class itself**. If we want to change the message in the log, **we don't need to change the Athlete itself**.

This is great news, since all the athlete has to care about is it's own properties and methods that act on them. Not the specifics of how the log works.



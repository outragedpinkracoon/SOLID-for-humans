# Interface Segregation

We should always favour smaller **highly cohesive** interfaces over larger less specific ones. A larger set of methods on an interface can result in breaking the Liskov Substitution principles, since the class using it may not need all of the methods defined on it and choose to do nothing, throw an exception etc

We shouldn't force methods onto classes that they do not need.

## Before 

The Sprinter is implementing the Olympian interface. It uses the drinkWater(), sprint() and jumpHurdle() methods as we'd expect. However, the interface also has a bunch of other completely unrelated methods like swim() and pedal() which are useless to the Sprinter, but the Sprinter **must** implement them to use the Olympian type.

This results in lots of unused methods and throwing exceptions, which is untidy and breaks the Liskov Substitution Principle.

This interface has **too low cohesion**.

## After

The Olympian interface has been spread out into 3 separate, highly cohesive, interfaces of related behaviour.

The sprinter only has to implement the methods of an Olympic Runner, which make sense for it.
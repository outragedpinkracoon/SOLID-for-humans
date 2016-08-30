# Liskov Substitution

Whenever we choose to extend an abstract class or implement an interface, we are saying that we will adhere to the contract. We must implement all the methods to allow the class using the contract act to as if it is the super class type it has been given. This is easier explained with an example.

## Bad

Our AthleteLog has a distance() method, so we expect both the AthleteConsoleLog and AthleteFileLog that implement it to have a distance method that does something sensible. 

All we know in our Athlete is that the AthleteLog interface has a distance() method that we are going to use. Anything that can be declared as an AthleteLog type must provide this implementation for us to use, so we can swap in and out different classes if we need to.

E.g both of these are valid:

```
AthleteLog log = new AthleteConsoleLog();
AthleteLog log = new AthleteFileLog();

```

Both the AthleteConsoleLog and AthleteFileLog can be declared as an AthleteLog. Thus, we expect both of them to have a distance() method, just like AthleteLog says it should.

However we are in for a nasty surprise...

When we use the AthleteConsoleLog, we get a horrible RuntimeException. Why? It turns out the nasty programmer who implemented the interface and made us **trust** that the implementation was in the AthleteConsoleClass, **adhering to the contract**, threw an exception instead of doing something sensbile and making the logging happen.

This breaks the Liskov Substitution principle. Any class implementing AthleteLog **must** have a valid implementation of distance(). If it doesn't, then it should not be using the interface in the first place. We can't trust AthleteConsoleLog to be used in conjunction with AthleteLog as a type, as we declared in the example above.

We don't want to give other developers a nasty surprise when they try to use our class, which is pretending to be adhering to acontract when it's really not.

This also applies to overloading superclass methods and making them throw errors or return unexpected things.

## Good

In the good example, both the AthleteConsoleLog and the AthleteFileLog have valid distance() methods, and can both be interchanged with AthleteLog as a type. All is good. NO missing methods, no weird returns. We can trust it to do what we expect from an AthleteLog, which is to run the distance() method it promises to us.
# Dependency Inversion

A dependency is another class that our class needs to use in order to function.

Dependency Inversion is where we never "new" anything up in a class, and we pass it in from the class that instantiates it. This stops code having an opinion about the implementation details of a dependency.

## Before

The Athlete is newing up an AthleteConsole log itself. It is taking ownership over this and deciding what kind of implementation it should use. It's having **an opinion** about how the internals of another class works that it relies on. In this case, we want a log that writes to the terminal.

The problem with this, is that if we decide we want a different kind of log that writes to a file? We'd have to **change** the actual Athlete and new up a different kind of log. What if we have 2 athletes that log in different ways? Nightmare.

An Athlete doesn't really want to have to care about what kind of log it's using, it just wants to use it.

## After

The Athlete has been changed to rely on **an interface** AthleteLog instead of a **concrete class** AthleteConsoleLog. This allows us to pass any class which implements this interface into the Athlete when we create it. This means we can easily change the kind of log an Athlete writes, by passing it a valid class.

In the runner, we pass a new Athlete an AthleteConsoleLog. We then create a new Athlete that uses an AthleteFileLog. We have changed the behaviour of an Athlete without modifying the source code of the Athlete itself.
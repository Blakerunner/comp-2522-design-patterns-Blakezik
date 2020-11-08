# Factory Method - Design Pattern

#### Blake Michalzik A01084417



Creational design pattern.

Factory method intents to provide an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.



Let's imagine we're creating a party management addon for an role-playing game. We may create the addon to handle adding any `Role` to our party, a lot of our code will now sit in our `Role` class.

However after leveling up a bit we're running into more dangers dungeons! We need to be more specific about what roles we have in our party in order to stand a chance.

Adding a new class to the program isn't simple for the fact the code is tightly coupled to the existing `Role` class.

If we wanted to add a `TankRole` class it would require changes to the codebase, more so if we wanted to add additional classes like `HealerRole` and `DpsRole` we're going to have to do this all again. The result and future cycle makes for poor code quality.



#### Principles

Factory Method to the rescue! This pattern suggests we replace direct object construction calls with calls to to special factory method.

- Objects returned from factory methods are commonly referred to as _products_.

- Due to the fact we're going to be returning different base classes to be used by the superclass, subclasses must either have a common base class or an interface. 
- As long as all product classes implement a common interface, you can pass their objects to the client code without breaking it.



#### Implementation

So we've identified we've got an issue and we've got a design pattern we want to implement to our codebase, so lets have a look at what that would look like.

Here's an UML example of our party management addon now using a Factory Method.

<iframe frameborder="0" style="width:100%;height:611px;" src="https://viewer.diagrams.net/?highlight=0000ff&edit=_blank&layers=1&nav=1&title=factory_method_01.drawio#Uhttps%3A%2F%2Fdrive.google.com%2Fuc%3Fid%3D1-QqhCpFWKP3-oTEetvgFGVlugKrwaYgk%26export%3Ddownload"></iframe>

Our Factory Method has `FindRole` that is designed to return a role to our `PartyManager` to be part of the `party`.
Each of the 3 concrete class constructors ( `FindTank` `FindHealer` `FindDps `) override our `FindRole.addRole()` method and return a new object relative to the class that we're trying to find. 

What's interesting here is we can expand, for example, the `FindTank` class for extra functionality, maybe we need a `Tank` with a lot of fire resistance for the next dungeon? We can add this functionality without coupling `PartyManager` or complicating `Tank` while still being able to return dynamic class types.

Additionally our 'Roles' all implement our `PartyMember` interface, allowing `PartyManager` to treat each object with consistency. This will allow `PartyManager.summonParty(party)` to summon every member that's within our party. Amazing!



#### When to use

- Use the Factory Method when you don’t know beforehand the exact types and dependencies of the objects your code should work with.

- Use the Factory Method when you want to provide users of your library or framework with a way to extend its internal components.

    

| Pros                                                         | Cons                                                         |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| Avoiding tight coupling between the creator and the concrete products. | Code may become more complicated since you need to introduce new subclasses to implement the pattern. |
| You can move the product creation code into one place in the program, making the code easier to extend. |                                                              |
| You can introduce new types of products (subclasses) into the program without breaking existing client code. |                                                              |



#### Related Patterns

[Abstract Factory](https://refactoring.guru/design-patterns/abstract-factory) and Simple Factory design patterns are the most closely associated to the Factory Method.

## Resources

https://en.wikipedia.org/wiki/Factory_method_pattern

https://www.journaldev.com/1392/factory-design-pattern-in-java

https://refactoring.guru/design-patterns/factory-method

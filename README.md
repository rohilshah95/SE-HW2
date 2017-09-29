# Patterns+Selenium Testing

### Object Oriented Patterns

#### Creational Patterns
##### 1. Abstract Factory
It provides an interface for creating families of dependent objects without explicitly specifying their concrete class by creating a hierarchy that summarizes many platforms.

The client is decoupled from any of the specifics of the concrete products. The factory objects of the Abstract Factory is responsible for creating the services for the entire product family. Clients do not created the objects, instead they ask the factory to do it for them.

The factory object is usually implemented as a singleton since the services provided by it are so extensive.

They are often implemented with factory methods but can also be implemented using prototypes. 

The Abstract Factory design pattern solves problems like:
* How can an application be independent of how its objects are created?
* How can a class be independent of how the objects it requires are created?
* How can families of related or dependent objects be created?

The Abstract Factory design pattern describes how to solve such problems:
* Encapsulate object creation in a separate object. That is, define an interface for creating objects, and implement the interface.
* A class delegates object creation to a factory object instead of creating objects directly.

This makes a class independent of how its objects are created. A class can be configured with a factory object, which it uses to create objects, and even more, the factory object can be exchanged at run-time.



##### 2. Factory Method
It defines an interface for creating an object, but instead of instantiating, it lets its subclasses decide which class to instantiate.
Factory method creates objects similar to how algorithms are implemented using a Template Method; All the standard behavior is specified in the superclass and then the creation details are delegated to the subclasses that are supplied by the client. 

When do you use a factory pattern:
* When you do not know ahead of time what class object do we need
* All the classes are in the same subclass hierarchy
* To centralize class selection code
* When the developer doesn’t want the user to know every subclass
* To encapsulate object creation. 

Factory methods are created usually through inheritance. The developers generally start with the less complex Factory method, but evolve towards Abstract Factory or Prototypes as the designer realizes the flexibility of the design.

The Factory Method design pattern solves problems like:
* How can an object be created so that subclasses can redefine which class to instantiate?
* How can a class defer instantiation to subclasses?
* The Factory Method design pattern describes how to solve such problems:
* Define a separate operation for creating an object.
* Create an object by calling a factory method.


#### Structural Patterns
##### 1. Adapter 
Adapter patterns work as a bridge between incompatible interfaces. It involves a single class which is responsible for joining the functionalities of incompatible interfaces. 

In literal real world terms, an adapter is a means to reuse something old. We have adapters for everything like converting USB-C to USB 2.0, SD card to USB, etc. Adapters are all about creating an intermediate abstraction that translates an old component to the new system.

The Adapter design pattern solves problems like:
* How can a class be reused that does not have an interface that a client requires?
* How can classes that have incompatible interfaces work together?
* How can an alternative interface be provided for a class?

The Adapter design pattern describes how to solve such problems:
* Define a separate Adapter class that converts the interface of a class into another interface clients require.
* Work through an Adapter to work with classes that do not have the required interface.
* The key idea in this pattern is to work through a separate Adapter that adapts the interface of an class without changing it.

Clients don't know whether they work with a Target class directly or through an Adapter with a class that has not the Target interface.

##### 2. Facade
Facade provides a unified interface to a set of interfaces in a subsystem. They define a higher level interface that makes it very easy to use the the entire subsystem.

Facades are used to encapsulate the entire complex subsystem into a single interface object. Customers generally see a facade while ordering from a catalog. The customer service agent acts as a facade between the client and the billing, order and shipping departments of the companies.

Facades create a new interface while Adapters are used for old interfaces. Facades, too are used as a Singleton since one one facade object is needed for the system. 

What problems can the Facade design pattern solve?
* To make a complex subsystem easier to use, a simple interface should be provided for a set of interfaces in the subsystem.
* The dependencies on a subsystem should be minimized.

Clients that access a complex subsystem directly refer to many different objects having different interfaces, which makes the clients hard to implement, change, test, and reuse.

What solution does the Facade design pattern describe?
Define a Facade object that
* implements a simple interface in terms of the interfaces in the subsystem and
* may perform additional functionality before/after forwarding a request.

This enables to work through a Facade object to minimize the dependencies on a subsystem.

#### Behavioral Patterns 
##### 1. Mediator
Mediator defines objects that encapsulates how a set of objects interact by providing loose coupling by keeping objects from referring to each other and also lets you change their interaction. Mediator promotes the many to many between interacting peers.

Mediators let us address how we can decouple senders and receivers by having them reference each other indirectly. A mediator object encapsulates the communication between other other objects by leveraging the Observer for dynamically registering colleagues and communicating with them. 

What problems can the Mediator design pattern solve?
* Tight coupling between a set of interacting objects should avoided.
* It should be possible to change the interaction between a set of objects independently.

Defining a set of interacting objects by accessing and updating each other directly is inflexible because it tightly couples the objects to each other and makes it impossible to change the interaction independently from the objects. And it stops the objects from being reusable and makes them hard to test.

Tightly coupled objects are hard to implement, change, test, and reuse because they refer to and know about many different objects.

What solution does the Mediator design pattern describe?
* Define a separate object that encapsulates the interaction between a set of objects.
* Objects delegate their interaction to a mediator object instead of interacting with each other directly.

The objects interact with each other indirectly through a mediator object that controls and coordinates the interaction.
This makes the objects loosely coupled. They only refer to and know about their mediator object and have no explicit knowledge of each other.

##### 2. Template Method
Template Methods are used to define a skeleton of an algorithm by deferring some steps to the client subclasses. Template methods are used in frameworks that implements the invariant pieces of the domains architecture and has placeholders for all the necessary client customizations.

Template Methods use the inheritance property of an algorithm by modifying the logic of the entire class. Factory Method is a specialization of the Template Method.

The template method pattern occurs frequently, at least in its simplest case, where a method calls only one abstract method when using object oriented languages. If a software writer uses a polymorphic method at all, this design pattern may be a rather natural consequence. This is because a method calling an abstract or polymorphic function is simply the reason for being of the abstract or polymorphic method. The template method pattern may be used to add immediate present value to the software or with a vision to enhancements in the future.

The template method is used for the following reasons:
* Let subclasses implement varying behavior (through method overriding).
* Avoid duplication in the code: the general workflow structure is implemented once in the abstract class's algorithm, and necessary variations are implemented in the subclasses.
Control at what point(s) subclassing is allowed. As opposed to a simple polymorphic override, where the base method would be entirely rewritten allowing radical change to the workflow, only the specific details of the workflow are allowed to change.


### Selenium Testing
The code for the selenium testing code is uploaded: [Here](https://github.ncsu.edu/rshah8/HW2/raw/master/WebTest.java)

References: [https://en.wikipedia.org/wiki/Software_design_pattern](https://en.wikipedia.org/wiki/Software_design_pattern),  [https://sourcemaking.com/design_patterns](https://sourcemaking.com/design_patterns), Head First Design Patterns Book by Elisabeth Freeman and Kathy Sierra


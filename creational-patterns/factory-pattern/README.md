# Factory Design Pattern
The **Factory Design Pattern** is a **creational design pattern** that provides a way to create objects without specifying their exact class. It defines an interface for creating objects but lets subclasses decide which class to instantiate. This pattern promotes loose coupling between client code and the classes it uses.

**Key Features:**

1. **Encapsulation of Object Creation**:

    The object creation logic is centralized in a factory method or class, making it easy to manage and extend.

2. **Loose Coupling**:

    The client code depends only on an abstract interface, not on concrete classes.

3. **Polymorphism**:

    The pattern allows the creation of different types of objects through a common interface or base class.

**Components:**

1. **Product**:

    The interface or abstract class that defines the type of object the factory will create.

2. **Concrete Product**:

    The actual implementation of the product.

3. **Creator (Factory)**:

    The abstract class or interface that declares the factory method.

4. **Concrete Creator**:

    Implements the factory method to return an instance of the corresponding concrete product.

**Advantages:**

1. Enhances **code reusability** and **maintainability**.

2. Makes the system **scalable** by adding new products without modifying existing code.

3. Promotes **abstraction** in object creation.

**Use Cases:**

1. When a class doesn’t know which subclass it needs to create.

2. When the creation logic is complex or needs to be centralized.

3. To enforce consistent object creation.

**In short, the Factory Pattern simplifies object creation and promotes flexibility in code design.**
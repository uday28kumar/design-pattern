# Prototype Design Pattern
The **Prototype Design Pattern** is a creational design pattern used to create duplicate objects while ensuring performance. Instead of creating new instances from scratch, it clones an existing object. This pattern is particularly useful when the cost of creating a new object is high (e.g., involving complex initialization or computation).

**Key Features:**

- **Shallow Copy:** Copies the object but not the objects referred to by the fields.
- **Deep Copy:** Copies the object along with the objects referred to by its fields.

**Advantages:**
- Avoids costly object creation.
- Reduces the need for subclassing.
- Adds flexibility in object creation.

**Use Cases:**
- When creating an object is resource-intensive.
- When an object has a fixed set of properties but needs to be duplicated multiple times with slight variations.


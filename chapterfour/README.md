# Chapter Four — inheritance, overloading, and constructors

Each package contains a separate example. Start with the entry point listed below.

## Suggested study order

1. **withoutinheritance** — duplicated employee and manager fields without inheritance. Entry point: `MainWithOutInheritance.java`.
2. **withinheritance** — `Manager extends Employee`, inherited fields, overriding, and `super.getDetails()`. Entry point: `Main.java`.
3. **overloading** — methods with the same name and different parameter lists. Entry point: `Overloading.java`.
4. **varargs** — variable arguments, arrays, and overloaded varargs methods. Start with `VarargsExample.java`, then `Overloading2.java`.
5. **constructorchaining** — constructors in the hierarchy `A -> B -> C`. Entry point: `ConstructorChaining.java`. Creating a `C` prints A, B, and C in that order.
6. **constructoroverloading** — overloaded constructors and delegation through `this(...)`. Entry point: `OverloadingConstructorExample.java`. The separate `Manager.java` extends its nested `Employee` class and calls `super(name, salary)`.
7. **objectinheritance** — implicit inheritance from `Object` and the default implementations of `toString()`, `equals()`, and `hashCode()`. Entry point: `ObjectInheritanceExample.java`; supporting class: `Person.java`.

## Object inheritance

Writing `extends Object` is optional when a class does not specify another superclass. The `Person` example intentionally omits it.

With the default `Object.equals()`, two references to the same object are equal. Two separate `Person` objects with the same field values are not equal by default.

Package names match their folders and use lowercase. Public class names match their Java filenames.

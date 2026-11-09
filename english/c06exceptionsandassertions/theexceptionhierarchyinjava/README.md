# The Exception Hierarchy in Java

![Java inheritance tree showing Object, Throwable, and the Exception and Error branches](exception-hierarchy.png)

Each branch shows which classes inherit from a common parent. For example, `ArithmeticException` extends `RuntimeException`, so a `catch (RuntimeException e)` block can catch an `ArithmeticException`.

`IOException` is a checked exception. When a method you call declares `throws IOException`, you must catch it or declare it in your own method with `throws`. Java does not require either for `RuntimeException` or its subclasses.

## Common Java Exceptions

![Table of ten common Java exceptions and when they occur](./common-exceptions.png)

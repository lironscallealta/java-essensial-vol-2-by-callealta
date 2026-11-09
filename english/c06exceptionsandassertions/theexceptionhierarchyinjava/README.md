# The Exception Hierarchy in Java

![Java inheritance tree showing Object, Throwable, and the Exception and Error branches](exception-hierarchy.png)

Each branch shows which classes inherit from a common parent. For example, `ArithmeticException` extends `RuntimeException`, so a `catch (RuntimeException e)` block can catch an `ArithmeticException`.

`IOException` is a checked exception. When a method you call declares `throws IOException`, you must catch it or declare it in your own method with `throws`. Java does not require either for `RuntimeException` or its subclasses.

## Common Java Exceptions

![Table of ten common Java exceptions and when they occur](common-exceptions.png)

| Exception name | When it occurs |
| --- | --- |
| `NullPointerException` | Code accesses an instance field or calls an instance method through a null reference. |
| `ArrayIndexOutOfBoundsException` | Code accesses an array with a negative index or an index greater than or equal to its length. |
| `ArithmeticException` | An invalid arithmetic operation occurs, such as integer division by zero. |
| `ClassCastException` | Code casts an object to a type it is not an instance of. |
| `IOException` | An input or output operation fails, such as reading or writing a file. |
| `FileNotFoundException` | A file cannot be opened, for example because it does not exist. It extends `IOException`. |
| `NumberFormatException` | A string cannot be parsed as the requested numeric type. |
| `IllegalArgumentException` | A method receives an invalid argument. |
| `InterruptedException` | A thread is interrupted while sleeping, waiting, or performing another interruptible operation. |
| `SQLException` | A database access error or another SQL-related error occurs. |

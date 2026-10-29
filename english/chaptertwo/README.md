# Chapter Two — variables, references, and constructors

The topic folders contain reference examples. `codingtask` contains the exercise and your work in progress.

## Suggested study order

1. **variablesandscope/**: local variables, block scope, and type inference.
2. **methods/**: parameters and arguments.
3. **referencesandpassbyvalue/**: object references and pass-by-value.
4. **constructors/**: constructors, using `this`, and copying objects.
5. **codingtask/**: practice combining the chapter's concepts.

## variablesandscope

- Run `LocalVariableExample.java` to see variables declared inside a method.
- Run `BlockScopeExample.java` to see the scope of a variable inside an `if` block.
- Run `VarExample.java` to see how Java infers a local variable's type with `var` (requires Java 10 or later).

## methods

Run `MethodWithParameters.java`: the `greet` method receives a parameter and is called with different arguments.

## referencesandpassbyvalue

- Run **ReferenceAssignmentExample.java** (formerly `Main.java`): compares two references to the same object with creating another object containing the same data.
- Run **PassByValueExample.java** (formerly `PassTest.java`): compares changing a number, reassigning a reference inside a method, and modifying a field of the referenced object. Java passes arguments by value, including when that value is a reference.
- **Person.java** is the supporting class shared by both examples.

Personal answers to the book's questions (page 102) are stored in a comment in `Answering.java`.

## constructors

- Run **ConstructorExample.java**: a no-argument constructor calls another constructor through `this(...)`, and both share age validation. The supporting class `ExamplePerson` is in the same file.
- Run **CopyConstructorExample.java** (formerly `TestPersonTwo.java`): uses `PersonTwo.addAge()`, which calls the copy constructor to create another person with a different age.
- **PersonTwo.java** is the supporting class for the copy example.

## codingtask

This follows the same format as chapterthree:

- **assignment/codingtaskone/Assignment.java**: the original exercise instructions, extracted from the existing comments.
- **doing/codingtaskone/CodingTask.java**: your current implementation. It includes the supporting class `PersonFour` in the same file.

This chapter has one task. To add another, create `codingtasktwo` inside both `assignment` and `doing`.

Runnable examples have a `main` method. Refer to the supporting classes to understand how each example works.

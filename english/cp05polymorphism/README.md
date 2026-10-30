# Chapter Five — polymorphism

## Suggested study order

1. **Inheritance hierarchy**: open [Test.java](inheritancehierarchy/Test.java). It creates Manager, Engineer, Secretary, and Director objects through EmployeeExampleTwo references and calls getDetails(). The comment includes the book's UML diagram.
2. **Upcasting and shared references**: open [SharedReferenceExample.java](upcasting/SharedReferenceExample.java). Two references share one Manager object; modifying its department through one reference is visible through the other.
3. **Downcasting**: open [TestEmployee2.java](downcasting/TestEmployee2.java). Compare upcasting, explicit casts, and type checks with instanceof before calling subclass methods.
4. **Heterogeneous arrays**: open [HeterogeneousArray.java](heterogeneousarray/HeterogeneousArray.java). It stores different employee subclasses in one array. The comments explain four ways to initialize an array. This example currently creates the array without printing output.

## Coding tasks

These tasks are ready for you to implement. The instructions and supplied book code are kept in `assignment`; your starter classes are in `doing`.

### Coding Task 1 — Student Scholarship

- Read [Assignment.java](codingtask/assignment/codingtaskone/Assignment.java): requirements, UML, supplied test class and expected output.
- Work in [Student.java](codingtask/doing/codingtaskone/Student.java) and [PartialScholar.java](codingtask/doing/codingtaskone/PartialScholar.java).
- The supplied [TestStudent.java](codingtask/doing/codingtaskone/TestStudent.java) is preserved inside a block comment. After implementing the classes, remove that comment to enable the test. Keep the supplied test logic unchanged.

### Coding Task 2 — The Animal Kingdom

- Read [Assignment.java](codingtask/assignment/codingtasktwo/Assignment.java): requirements, supplied structure and expected output.
- Work in [Animal.java](codingtask/doing/codingtasktwo/Animal.java), [Dog.java](codingtask/doing/codingtasktwo/Dog.java), [Cat.java](codingtask/doing/codingtasktwo/Cat.java) and [Bird.java](codingtask/doing/codingtasktwo/Bird.java).
- [AnimalKingdom.java](codingtask/doing/codingtasktwo/AnimalKingdom.java) contains the supplied demonstration code inside a block comment. Enable it after implementing the animal methods.

The supplied drivers are commented out only to keep the project compilable while the starter classes are empty. No exercise solution has been added. All Java files declare their own package; do not copy a package declaration from another chapter.

## Run an example

Click one of the Java file links above to open it in your editor. Choose **Run Java** or **Run** above its main method. Keep the repository folder open as the Java project root so packages and imports can be resolved.

The supporting classes are in the same topic folders. These examples use the `english.cp05polymorphism` packages.

[Back to the project guide](../../README.md) · [Spanish version](../../espanol/cp05polimorfismo/README.md)

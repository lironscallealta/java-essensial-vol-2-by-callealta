# Example: Java packages and imports

This folder contains a reference example for studying how classes in different packages are organized and used.

## Where to start

Open `importexamples/PackageImportsExample.java` and run its `main` method. That file brings together the different ways of accessing the classes in this example.

## What each folder represents

- `suba/A.java`: class A, used through `import english.chapterthree.packages.suba.*;`.
- `suba/subaa/AA.java`: class AA inside a subpackage, used through an explicit import.
- `subb/B.java`: class B, used through its fully qualified name: `english.chapterthree.packages.subb.B`.
- `subc/C.java`: class C, used through another import with `*`.
- `importexamples/PackageImportsExample.java`: the program that uses all four classes.

## What to remember

1. `package` declares the package a class belongs to. In this project, it matches the folders relative to the root.
2. `import` lets you refer to a class by its simple name, such as `AA`.
3. An import with `*` lets you use accessible types in that package, but does not include its subpackages.
4. You can also use a class's fully qualified name without importing it.

## What happens when you run it

The program creates the objects and calls `printMe()`. The methods are empty, so no text appears in the console. They are used to practice package structure and check that the references to the classes compile.

# Enunciado del ejercicio — Chapter Two

Texto original extraído de los comentarios de CodingTask.java. Tu implementación actual está en ../../Doing/CodingTaskOne/CodingTask.java.

Objective:
Write a Java program that demonstrates your understanding of primitive data
types, reference data types, user-defined classes, reference assignments,
pass-by-value, local variable scopes, and the this reference.

Requirements:
1. Create a User-Defined Class named Person:
Define a class Person with the following attributes: String name and an int
age.
Include the following methods in the Person class:
● Constructor to accept a String name and int age value to initialize name
and
age attributes.
● updateAge() method that accepts a Person object and an int value to update
the age of the passed person object.
● incrementAge() method that increments the age of the current person and
returns the updated person object.
● displayInfo() method that prints the name and age of the person.
2. Main Program:
Create a Person object and initialize it with a name and age values as stated
in the constructor.
Pass the Person object to a method to update its age using updateAge().
Use incrementAge() to increment the age of the Person object and assign it to
a new reference variable.
Demonstrate the effect of changing the reference variable and local variable
scope on the Person object.
Use the this keyword within the Person class to handle method reuse.

Getting Started
===============

In this exercise we practice using some of the basic and common syntax found 
in pretty much any Scala code you'll look at.

Assignment
----------

We already have a class called *Person* and some unit tests for it. The 
objective of this exercise is to edit *Person.scala* so that it passes its 
unit tests. Take a look at *PersonSpec.scala* to see what your implementation 
should do.

Naming Conventions
------------------

The naming convention for source files in Scala is the following:

*   When a source file contains only one class (and optionally its companion 
    object too), the file name is in camel case with first letter capitalized, 
    i.e. the same as in Java (for example, *PersonSpec.scala*).

*   When a source file contains multiple classes/objects, the file name is in 
    camel case with first letter in lower case (for example, 
    *visibilityExample.scala*)

Hints
-----

Some helpful hints for the exercise:

*   Scala does not have static methods. Instead methods which are not 
    associated with a particular instance of the class live in the companion 
    object of the class.

*   Annotation scala.beans.BeanProperty is useful for automatic implementation 
    of JavaBeans-style getter/setter APIs.

*   Refer to *visibilityExample.scala* to see examples of visibility in Scala.

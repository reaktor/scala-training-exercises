Traits
======

Let's introduce Scala's *traits* with a quote from *Programming in Scala* 
by Martin Odersky, Lex Spoon, and Bill Venners (Artima Press, 2008):

    "Traits are a fundamental unit of code reuse in Scala. A trait 
     encapsulates method and field definitions, which can then be 
     reused by mixing them into classes. Unlike class inheritance, 
     in which each class must inherit from just one superclass, a 
     class can mix in any number of traits."

Another way to put it would be that traits are interfaces on steroids or
interfaces that can optionally provide an (possibly partial) implementation, 
too. Here's a brief example of what traits looks like in action:

    trait Reversible {
      def content: Seq[Any]
      def reverse = content.reverse
    }
    
    class Patch(val patch: String) extends Reversible {
      override def content = patch
    }
    
    new Patch("whatever").reverse  // yields Seq[Any] = revetahw

In the above example, the *Patch* class mixes in a trait called 
*Reversible*, which defines two methods:

    * An abstract method named _content_ that *Patch* needs to implement.
    * A concrete method named _reverse_ that *Patch* can use.

That's probably enough background information for us to get started with 
the next exercise assignment.

Assignment
----------

Your task is to make the provided tests pass by implementing a trait called 
*Initiallable* and using it in class called *Name*. These sources are
located under *src/main/scala*.

To see what the trait should do, skim through the provided tests in 
*src/test/scala* and try to run them. When all tests are passing, your work
is done.

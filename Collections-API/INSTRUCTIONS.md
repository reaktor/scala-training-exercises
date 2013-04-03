Scala Collections
=================

One of the most immediate productivity boosts a Java programmer will realize
when getting to grips with Scala is the endless power of its Collections API.

With one foot standing solid in the functional programming realm, Scala gives
us the kind of concise means of transforming data structures that functions
as first-class citizens allows.

For example, filtering out a subset of a list does not require *for* loops or 
awkward anonymous classes implementing a one-method predicate interface for 
accepting/rejecting candidate objects. Instead, such cases can be handled by 
passing in a block (a tiny function):

    messages.filter(_.createdAt <= expiryThreshold)

Similarly, transforming a list of objects into a list of different objects
does not require creating an empty list, looping through the existing list,
and adding to the newly created list. Instead, all this basic stuff is baked
into the collections API:

    messages.map(_.content.toString)

Most of the commonly used collection-related operations you'll need happen
to reside in a trait called *scala.collection.Seq*. If you haven't done so
by now, it's probably a good idea to bookmark the 
[Scala Standard Library API](http://www.scala-lang.org/api/current/index.html)
to your browser for easy reference. 

Assignment
----------

The goal with this assignment is to make some tests pass using the various
collection API methods provided by *scala.collection.Seq* and friends.

The tests in question can be found under *src/test/scala*. We've provided a
partial implementation under *src/main/scala* and your job is to fill in the
missing bits inside *ScalaCollectionsExample.scala*.

Peek inside *FamilySpec.scala* to find out how the *Family* class should 
behave and make it so!

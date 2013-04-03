Pattern Matching
================

Another "new" feature Scala has to offer for programmers coming from Java and
its ilk is *pattern matching*. Here's a trivial example of what pattern 
matching looks like in Scala code:

    case class Person(name: String, gender: String)
    
    val wording = party match {
      case Person(_, "male") => "he"
      case Person(_, "female") => "she"
      case List(Person(_, "male")) => "he"
      case List(Person(_, "female")) => "she"
      case List(Person(_, _), _*) => "they"
      case "king" => "his highness"
      case "queen" => "her highness"
      case _ => party
    }

At first the above might look just like the switch-case feature we know from
programming languages like Java. Scala's pattern matching is much more 
powerful than that, though.

Notice how Scala's *selector match { alternatives }* syntax accepts not just
primitives but also various types such as case classes like *Person*, lists of
case classes, constants such as *"king"* or *"queen"*, and wildcards 
designated by an underscore (*_*).

There's much more to pattern matching than this but we should go a long way
with this knowledge already so let's take a look at our next assignment.

Assignment
----------

Your task is to make the provided tests pass using an implementation that
employs pattern matching. The tests can be found inside *src/test/scala* and
your implementation should go into the partial implementation we've provided 
in *src/main/scala/survival/survival.scala*.

Hint: use pattern matching against a _List_ of things.

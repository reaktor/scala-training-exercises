Implicits
=========

One of Scala's unique features is *implicit conversions* (or just 'implicits'
for short). What we're converting is *types* and it's not a new concept as 
such by any means. In fact, if you've programmed in Java the odds are that 
you've seen it happen thousands of times already in code like this:

    System.out.println("The following is a number: " + 123);

Seeing the above statement, Java converts the literal integer 123 (or any 
other non-String type) into a String and then concatenates the two String 
objects.

Scala lets you add similar automatic type conversions. This can be really 
useful when you find yourself needing to translate, for example, similar 
(but not identical) domain objects back and forth between different API's.

Assignment
----------

Your task is to make the provided tests pass using an implicit conversion. 
The tests in question can be found inside *src/test/scala*. There's a class
named *ImplicitSticksSpec.scala* and it contains just one test, which is 
currently commented out (because it wouldn't compile). Uncomment that test, 
and make it compile and pass by implementing the appropriate implicit 
conversion from a Scala *Int* into a *sticks.Sticks* object inside 
*ImplicitSticks.scala*.

Naming Conventions
------------------

There's no particular rules or constraints for how to name your implicit 
conversion functions. The Scala community has more or less standardized on a 
particular way of naming such functions, however, using the format 
"source2target". E.g. an implicit conversion from Int to String would be 
called "int2String" and a conversion from String to Int would be "string2Int".
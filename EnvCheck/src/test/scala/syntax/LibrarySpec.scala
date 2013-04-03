package syntax

import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith

@RunWith(classOf[JUnitRunner])
class LibrarySpec extends FunSuite {

  // Let's define some fixture objects
  val unspeakable = new Book("JFK and the Unspeakable", List("James W. Douglass"))
  val kennedyConspiracy = new Book("The Kennedy Conspiracy", List("Bill Sloan"))
  val harveyAndLee = new Book("Harvey and Lee: How the CIA Framed Oswald", List("John Armstrong"))
  val mindOfAssassin = new Book("The Mind of an Assassin", List("Isaac Don Levine"))
  val myLife = new Book("My Life", List("Bill Clinton"))
  val americanEvita = new Book("American Evita: Hillary Clinton's Path to Power", List("Christopher Andersen"))
  val timeToKill = new Book("A Time To Kill", List("John Grisham"))

  // Let's create a Library with the constructor:
  val clinton = new Library("Bill Clinton's library", List(myLife, americanEvita, timeToKill))

  // ...and another Library with a factory method on the companion object:
  val jfk = Library.create("JFK's library")
  jfk.add(unspeakable)
    .add(kennedyConspiracy)
    .add(harveyAndLee)
    .add(mindOfAssassin)

  // Now let's define some automated tests!

  test("Libraries should contain the books they've received") {
    assert(jfk.books.contains(unspeakable))
    assert(jfk.books.contains(kennedyConspiracy))
    assert(jfk.books.contains(harveyAndLee))
    assert(jfk.books.contains(mindOfAssassin))
    assert(clinton.books.contains(myLife))
    assert(clinton.books.contains(americanEvita))
    assert(clinton.books.contains(timeToKill))
  }

  test("Books should always be sorted alphabetically") {
    val library = Library.create("The Public Library")
    library.add(new Book(title = "Beta", authors = List("Bob")))
    library.add(new Book(authors = List("Alf"), title = "Alpha"))
    library.add(new Book("Gamma", List("Guy")))
    val expectedOrder = List("Alpha", "Beta", "Functional Programming in Scala", "Gamma", "Programming Scala")
    assert(library.books.map(_.title) === expectedOrder)
  }

  test("Libraries should index their books") {
    assert(jfk.index()('H') === List(harveyAndLee))
    assert(jfk.index()('J') === List(unspeakable))
    assert(jfk.index()('T') === List(kennedyConspiracy, mindOfAssassin))
  }
}

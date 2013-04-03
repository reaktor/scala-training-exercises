package syntax

/**
 * This is a regular Scala class
 * (a single source file can define multiple classes)
 */
class Book(val title: String,
           val authors: List[String]) extends Ordered[Book] {

  def compare(that: Book): Int = { this.title compare that.title }

  override def toString = "'" ++ title ++ "' by " ++ authors.mkString(", ")
}

/**
 * Here's another regular class...
 */
class Library(val name: String, var books: List[Book] = Nil) {

  // Everything in the class's body makes up its constructor
  books = books.sorted
  add(new Book("Functional Programming in Scala", List("Paul Chiusano", "Rúnar Bjarnason")))
  add(new Book("Programming Scala", List("Venkat Subramaniam")))

  /**
   * Here's a method. It produces an index of the library,
   * grouped by the first letter of a book's name.
   */
  def index(): Map[Char, List[Book]] = {
    return books.sorted.groupBy(_.title.head)
  }

  /**
   * Another method for adding a book to the library.
   * Notice how we've omitted the explicit return type
   * and instead let the compiler figure it out.
   */
  def add(book: Book) = {
    books = (books ::: List(book)).sorted // concatenating lists with ':::'
    this
  }

  /**
   * This is how we override a method. For example,
   * let's make toString() return something sensible.
   */
  override def toString = {
    name ++ " contains " ++ index.toString // concatenating strings with '++'
  }
}

/**
 * Scala classes have a "companion object". For now, think of this as
 * a collection of static methods for the class by the same name.
 *
 * These methods can be invoked like Library.create(...) just like
 * you would invoke static methods in Java.
 */
object Library {
  def create(name: String): Library = new Library(name, Nil)
}
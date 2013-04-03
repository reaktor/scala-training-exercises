package people

import scala.beans.BeanProperty

class Person(name: String, @BeanProperty var age: Int) {
  def nameWithoutLetter(letter: Char): String = {
    name
  }
}

object Person {
  val DefaultAge = 18
  def createWithDefaultAge(name: String): Person = null
}
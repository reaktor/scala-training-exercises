package initials

import org.scalatest.FlatSpec
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith

@RunWith(classOf[JUnitRunner])
class NameSpec extends FlatSpec {

  val beyonce = new Name("Beyonce")
  val odersky = new Name("Martin Odersky")
  val kennedy = new Name("John Fitzgerald Kennedy")
  val tolkien = new Name("John Ronald Reuel Tolkien")

  "toString" should "print the full name" in {
    assert(tolkien.toString === tolkien.name)
  }

  "name" should "print the full name" in {
    assert(odersky.name === "Martin Odersky")
    assert(tolkien.name === "John Ronald Reuel Tolkien")
  }

  "initials" should "initial all names" in {
    assert(odersky.initials === "M.O.")
    assert(kennedy.initials === "J.F.K.")
    assert(tolkien.initials === "J.R.R.T.")
  }

  "firstInitials" should "initial all but the last name" in {
    pending // uncomment the following assertions and remove this line
    //    assert(odersky.firstInitials === "M. Odersky")
    //    assert(kennedy.firstInitials === "J.F. Kennedy")
    //    assert(tolkien.firstInitials === "J.R.R. Tolkien")
  }

  "middleInitials" should "initial only middle names" in {
    pending // uncomment the following assertions and remove this line
    //    assert(odersky.middleInitials === "Martin Odersky")
    //    assert(kennedy.middleInitials === "John F. Kennedy")
    //    assert(tolkien.middleInitials === "John R.R. Tolkien")
  }

  "single stage names" should "be treated like last names" in {
    pending // uncomment the following assertions and remove this line
    //    assert(beyonce.initials === "B.")
    //    assert(beyonce.firstInitials === "Beyonce")
    //    assert(beyonce.middleInitials === "Beyonce")
  }
}
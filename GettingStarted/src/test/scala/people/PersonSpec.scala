package people

import org.scalatest.FlatSpec
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith

@RunWith(classOf[JUnitRunner])
class PersonSpec extends FlatSpec {
  val jack = new Person("Jack", 35)
  val jill = Person.createWithDefaultAge("Jill")

  "A Person created via constructor" should "have the age given as parameter" in {
    assert(jack.getAge === 35)
  }

  "A Person created via factory method" should "have the default age" in {
    pending
  }

  "Any person" should "be able to provide its name without the specified letter" in {
    pending
  }

  it should "be able to change its age later" in {
    pending
  }
}

package family

import org.scalatest.FunSpec
import org.scalatest.BeforeAndAfter
import org.scalatest.OneInstancePerTest
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith

@RunWith(classOf[JUnitRunner])
class FamilySpec extends FunSpec with BeforeAndAfter with OneInstancePerTest {

	val family = new Family("The Simpsons")
	
	// parents
	val mom = new Person(Female, "Marge", 43)
	val dad = new Person(Male, "Homer", 46)
	
	// children
	val daughter = new Person(Female, "Lisa", 18)
	val son = new Person(Male, "Bart", 17)
	val baby = new Person(Female, "Maggie", 1)

	// pets
	val cat = new Cat("Whiskers")
	val dog = new Dog("Spot")

	before {
		family.add(mom).add(dad).add(daughter).add(son).add(baby).add(cat).add(dog)
	}

	it("only counts humans to its 'size'") {
		// pending // remove this line when you're ready to start working on this step!
		assert(family.size === 5)
	}
	
	it("considers all non-people as pets") {
		assert(family.pets().size === 2)
	}

	it("considers people under 18 as children") {
		assert(family.adults().size === 3)
		assert(family.children().size === 2)
	}
	
	it("counts the collective age of family members") {
		assert(family.age() === 43 + 46 + 18 + 17 + 1)
	}
	
	it("prints out females first, age descending") {
		assert(family.toString === "The Simpsons are Marge, Lisa, Maggie, Homer and Bart")
	}
}
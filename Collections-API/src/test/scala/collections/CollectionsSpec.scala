package collections

import org.scalatest.FlatSpec
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith

@RunWith(classOf[JUnitRunner])
class CollectionsSpec extends FlatSpec {
  val list = List(288, 3, 49, 52, -4, -1, 177, 18, -63, 8, 35, 27)
  val implementation = new ScalaCollections

  it should "keepOnlyEvenNumbers" in {
    assert(List(288, 52, -4, 18, 8) === implementation.keepOnlyEvenNumbers(list))
  }

  it should "doubleEachNumber" in {
    assert(List(576, 6, 98, 104, -8, -2, 354, 36, -126, 16, 70, 54) === implementation.doubleEachNumber(list))
  }

  it should "sortByAbsoluteValue" in {
    assert(List(-1, 3, -4, 8, 18, 27, 35, 49, 52, -63, 177, 288) === implementation.sortByAbsoluteValue(list))
  }

  it should "groupByNumberOfDigits" in {
    val groups = implementation.groupByNumberOfDigits(list)
    assert(List(3, -4, -1, 8) === groups(1))
    assert(List(49, 52, 18, -63, 35, 27) === groups(2))
    assert(List(288, 177) === groups(3))
  }

  it should "sumOfNumbers" in {
    assert(589 === implementation.sumOfNumbers(list))
  }

  it should "deltasOfNumbers" in {
    assert(List(285, 46, 3, 56, 3, 178, 159, 81, 71, 27, 8) === implementation.deltasOfNumbers(list))
  }
}

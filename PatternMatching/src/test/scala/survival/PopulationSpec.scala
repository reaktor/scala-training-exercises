package survival

import org.scalatest.FlatSpec
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith
import scala.collection.JavaConversions._

@RunWith(classOf[JUnitRunner])
class PopulationSpec extends FlatSpec {

  "A lone wolf" should "starve to death" in {
    val before = List(Wolf("Pekka", 1, 80))
    val expected = List()
    assertPopulationEvolvesAsExpected(before, expected)
  }

  "A lone lamb" should "grow and get older" in {
    val before = List(Lamb("Liisa", 1, 60))
    val after = ScalaPopulation.next(before)
    val expected = List(Lamb("Liisa", 2, 61))
    assertPopulationEvolvesAsExpected(before, expected)
  }

  "Two wolves next to each other" should "fight and bigger wolf one should win" in {
    val before = List(Wolf("Pekka", 1, 80), Wolf("Jussi", 1, 85))
    val after = ScalaPopulation.next(before)
    val expected = List(Wolf("Jussi", 2, 85))
    assertPopulationEvolvesAsExpected(before, expected)
  }

  "Wolf next to a lamb" should "eat the lamb and gain its weight" in {
    val before = List(Wolf("Pekka", 1, 80), Lamb("Liisa", 1, 60))
    val after = ScalaPopulation.next(before)
    val expected = List(Wolf("Pekka", 2, 140))
    assertPopulationEvolvesAsExpected(before, expected)
  }

  "Lamb next to a wolf" should "get eaten and the wolf should gain its weight" in {
    val before = List(Lamb("Liisa", 1, 60), Wolf("Pekka", 1, 80))
    val after = ScalaPopulation.next(before)
    val expected = List(Wolf("Pekka", 2, 140))
    assertPopulationEvolvesAsExpected(before, expected)
  }

  "Two lambs" should "live together happily and grow bigger and older" in {
    val before = List(Lamb("Liisa", 1, 60), Lamb("Maija", 1, 55))
    val after = ScalaPopulation.next(before)
    val expected = List(Lamb("Liisa", 2, 61), Lamb("Maija", 2, 56))
    assertPopulationEvolvesAsExpected(before, expected)
  }

  def assertPopulationEvolvesAsExpected(initial: List[Animal], expected: List[Animal]) {
    assert(new ScalaPopulation(initial).nextGeneration.animals.toArray.toList === expected)
  }
}

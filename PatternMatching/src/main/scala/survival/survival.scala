package survival

sealed abstract class Animal {
  def name: String
  def age: Int
  def weight: Int
}
case class Wolf(val name: String, val age: Int, val weight: Int) extends Animal
case class Lamb(val name: String, val age: Int, val weight: Int) extends Animal

trait Population {
  def nextGeneration: Population
  def animals: List[Animal]
}

case class ScalaPopulation(myAnimals: List[Animal]) extends Population {
  def nextGeneration: Population = {
    ScalaPopulation(ScalaPopulation.next(myAnimals))
  }

  def animals: List[Animal] = {
    myAnimals
  }
}

object ScalaPopulation {
  /**
   * The next stage of evolution in the given animal population.
   */
  def next(animals: List[Animal]): List[Animal] = {
    animals
  }
}
package people

class Target(val immutable: String, var mutable: String, default: String)

class AccessingClass {
  def accessObjectProperties {
    val t = new Target("immutable", "mutable", "default")

    println(t.immutable)
    // This does not compile
    // immutable = "changed"

    println(t.mutable)
    t.mutable = "changed"
    println(t.mutable)

    // This does not compile
    // println(t.default)
  }

  def accessLocalVariables {
    val immutable = "immutable"
    var mutable = "mutable"

    println(immutable)
    // This does not compile
    // immutable = "changed"

    println(mutable)
    mutable = "changed"
    println(mutable)
  }
}

object VisibilityExample {
  def main(args: Array[String]) {
    val ac = new AccessingClass
    ac.accessObjectProperties
    ac.accessLocalVariables
  }
}
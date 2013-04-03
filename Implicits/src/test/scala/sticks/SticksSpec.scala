package sticks

import org.scalatest.FlatSpec
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith

@RunWith(classOf[JUnitRunner])
class SticksSpec extends FlatSpec {
  "Sticks" should "prints its sticks as a String" in {
    assert(new Sticks(3).sticks == "|||")
  }
}
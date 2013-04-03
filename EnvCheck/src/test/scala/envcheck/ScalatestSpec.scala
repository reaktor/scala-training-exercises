package envcheck

import org.scalatest.FlatSpec

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class ScalatestSpec extends FlatSpec {
	"This code" should "compile and run" in {
		assert(Math.random() < 2)
	}
}

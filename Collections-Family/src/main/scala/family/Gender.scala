package family

sealed trait Gender

object Male extends Gender { override def toString: String = "M" }
object Female extends Gender { override def toString: String = "F" }
object Confused extends Gender { override def toString: String = "?" }

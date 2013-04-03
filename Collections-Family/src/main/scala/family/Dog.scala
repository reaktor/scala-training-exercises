package family

class Dog(val name: String) extends Pet with FamilyMember {
	def greet = "Woof!"
}
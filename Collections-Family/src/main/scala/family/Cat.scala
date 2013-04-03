package family

class Cat(val name: String) extends Pet with FamilyMember {
	def greet = "Meow!"
}
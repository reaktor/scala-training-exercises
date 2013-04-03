package wordcount

class Title(val title: String) extends DatabaseEntity with WordCountable {
	def content = title
}
package wordcount

class Chapter(val title: Title, val paragraphs: Seq[Paragraph]) extends DatabaseEntity with WordCountable {
  def content = {
    "" // TODO: chapter content should be the title plus the paragraphs' content
  }
}
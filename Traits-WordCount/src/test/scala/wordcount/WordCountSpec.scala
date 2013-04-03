package wordcount

import org.scalatest.FlatSpec
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith

@RunWith(classOf[JUnitRunner])
class WordCountSpec extends FlatSpec {

  val title = new Title("Programming in Scala")
  val paragraph1 = new Paragraph("Scala is a JVM language.")
  val paragraph2 = new Paragraph("It packs a serious punch.")
  val chapter = new Chapter(title, List(paragraph1, paragraph2))

  "title" should "count its words" in {
    assert(title.wordCount === 3)
  }

  "paragraph" should "count its words" in {
    assert(paragraph1.wordCount === 5)
  }

  "chapter" should "count its words" in {
    assert(chapter.wordCount === 3 + 5 + 5)
  }

  "title" should "ignore words 'a', 'an' and 'the' from its word count" in {
    assert(new Title("An apple a day keeps the doctor away").wordCount === 5)
  }

  "title and paragraph" should "count dashed words separately" in {
    assert(new Title("Scala is mind-blowing awesome").wordCount === 5)
    assert(new Paragraph("Scala is mind-blowing awesome").wordCount === 5)
  }
}
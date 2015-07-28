object HelloWorld extends App {
  val version = 1
  println(s"Hello, World v$version!")

  val names = List("Kitty", "Tom", "Silvester", "Razor")
  val cats = names.map(_ ++ " cat")
  for (cat <- cats) println(cat)
}

object HeloWorldJavaStyle {
  def main(args: Array[String]) = println("Hi! java style")
}
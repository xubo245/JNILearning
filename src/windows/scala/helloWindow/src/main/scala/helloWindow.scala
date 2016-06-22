/**
  * Created by xubo on 2016/6/22.
  */

class helloWindow {
  @native
  def add(a: Int, b: Int): Int

  @native
  def hello(): String
}

object helloWindow {
  System.loadLibrary("helloWindow")
  def main(args: Array[String]) {
    val helloWindow1 = new helloWindow
    println(helloWindow1.hello + ", 5 + 5 = " + helloWindow1.add(5, 5))
  }
}

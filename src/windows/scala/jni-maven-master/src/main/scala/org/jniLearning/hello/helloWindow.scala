/**
  * Created by xubo on 2016/11/24.
  * 原来在根路径，一包了这个包中，但没加package
  * 运行时加上：
  -Djava.library.path=lib/.
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
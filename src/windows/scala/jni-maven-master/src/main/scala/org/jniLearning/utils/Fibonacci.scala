package org.jniLearning.utils

/**
  * Created by xubo on 2016/11/25.
  * 运行时加上：
  * -Djava.library.path=lib/.
  */
class Fibonacci {

  @native
  def compute(intput: Int): Int
}

object Fibonacci {
  System.loadLibrary("Fibonacci")

  def main(args: Array[String]) {
    val fibonacci = new Fibonacci()
    println(fibonacci.compute(10))
  }

  def run(input: Int): Int = {
    val fibonacci = new Fibonacci
    return fibonacci.compute(input)
  }
}

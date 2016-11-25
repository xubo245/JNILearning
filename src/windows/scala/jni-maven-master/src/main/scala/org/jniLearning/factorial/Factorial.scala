package org.jniLearning.factorial

/**
  * Created by xubo on 2016/11/25.
  */
class Factorial {

  @native
  def run(a: Int): Int

  @native
  def hello(): String
}

object Factorial {

  System.loadLibrary("Factorial")

  def main(args: Array[String]) {
    val factorial = new Factorial
    println(factorial.hello + ", 5! = " + factorial.run(5))
    println(compute(10))
  }

  def compute(input: Int): Int = {
    val factorial = new Factorial
    return factorial.run(input)
  }
}

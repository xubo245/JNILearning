package org.jniLearning.utils

/**
  * Created by xubo on 2016/11/25.
  * 运行时加上：
  * -Djava.library.path=lib/.
  */
object FibonacciSuite {
  def main(args: Array[String]) {
    val N = 45
    for (i <- 1 to N) {
      val start = System.currentTimeMillis()
      val result = Fibonacci.run(i)
      val end = System.currentTimeMillis()
      println("C    :" + i + ":" + result + " time=" + (end - start) + "ms")

      val start2 = System.currentTimeMillis()
      val result2 = FibonacciScala.run(i)
      val end2 = System.currentTimeMillis()
      println("Scala:" + i + ":" + result2 + " time=" + (end2 - start2) + "ms")

    }
  }
}

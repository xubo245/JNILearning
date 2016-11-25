package org.jniLearning.factorial.test

import org.jniLearning.factorial.Factorial

/**
  * Created by xubo on 2016/11/25.
  */
object FactorialSuite {

  def main(args: Array[String]) {
    val N = 15
    var arr = Array.ofDim[BigInt](N, 2)

    for (i <- 1 to N) {
      arr(i - 1)(0) = BigInt.apply(i)
      arr(i - 1)(1) =BigInt.apply(Factorial.compute(i))
      println(arr(i - 1)(0) + "!=" + arr(i - 1)(1))
    }
  }

}

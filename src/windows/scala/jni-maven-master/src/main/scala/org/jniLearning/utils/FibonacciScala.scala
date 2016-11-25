package org.jniLearning.utils

/**
  * Created by xubo on 2016/11/25.
  */
object FibonacciScala {
  def run(input: Int): Int = {
    if (input == 1) {
      1
    } else if (input == 2) {
      2
    } else {
      run(input - 1) + run(input - 2)
    }
  }
}

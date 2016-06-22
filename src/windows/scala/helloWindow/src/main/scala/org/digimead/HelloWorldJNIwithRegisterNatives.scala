package org.digimead

object HelloWorldJNIwithRegisterNatives {

  System.loadLibrary("HelloWorldJNIwithRegisterNatives")


  @native
  def add(a: Int, b: Int): Int

  @native
  def hello(): String

  def main(args: Array[String]) {
    println(hello + ", 5 + 5 = " + add(5, 5))
  }
}


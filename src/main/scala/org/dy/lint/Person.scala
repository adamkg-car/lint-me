package org.dy.lint

import org.dy.lint.Cat

object Hi {
  def main(args: Array[String]) = {
    var a = 123
    val d = 3 / 0
    val c = new Cat
    if(true){
      a = 2
    }else{
      a= 3
    }
    println("Hi Lint me23!")
  }
}
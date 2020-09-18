package cn.segema.learn.basic

import scala.collection.immutable.HashSet

class SetDemo {

}

object SetDemo {
  def main(args: Array[String]): Unit = {

    val set1 = new HashSet[Int]()
    val set2 = set1 + 1
    val set3 = set2 ++ Set(2, 3, 4)
    println(set1)
    println(set3)

  }
}
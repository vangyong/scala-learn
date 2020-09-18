package cn.segema.learn.basic

import scala.collection.mutable.ListBuffer

class ListDemo {

}

object ListDemo {
  def main(args: Array[String]): Unit = {

    val list1 = ListBuffer(1, 2, 3)
    list1 += 4
    println(list1)

  }
}
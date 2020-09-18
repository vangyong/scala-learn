package cn.segema.learn.basic

import scala.collection.immutable.HashMap

class MapDemo {

}

object MapDemo {
  def main(args: Array[String]): Unit = {

    // Map映射
    //    val map1 = Map("scala" -> 1, "Java" -> 2, "python" -> 3)
    //    println(map1("Java"))
    //    println(map1.getOrElse("C#", 8))
    //
    //    var map2 = new HashMap[String, String]()
    //    map2("scala") = 1
    //    map2 += (("java", 2), ("python", 3))
    //    map2 += ("C++" -> 5)
    //    map2 -= "java"

    // 拉链 zip
    val arr1 = Array("scala", "java", "yuwen")
    val arr2 = Array(1, 2, 3)
    val res = arr1 zip arr2
    println(res)

    val list1 = List(1, 2, 3)
    val list2 = 0 :: list1
    println(list2)
  }
}
package cn.segema.learn.scala

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer
import scala.collection.mutable._

class BaseDemo1 {

}

object BaseDemo1 {
  def main(args: Array[String]): Unit = {

    //数组
        val arr1 = new Array[Int](3)
        println(arr1.toBuffer)

        val  arr2 = Array("java","C#","shuxue")
        println(arr2.toBuffer)
        println(arr2(2))

    //    val arr3 =ArrayBuffer[Int]()
    //    arr3+=1
    //    arr3+=(2,3,4)
    //    arr3++=Array(5,6)
    //    arr3++=ArrayBuffer(7,8)
    //    arr3.insert(0,-1,4,5)
    //    arr3.remove(0,2)

    //    println(arr3.toBuffer)
    //
    //    val arr4 = Array(1,2,3,4,5,6,7,8,9)
    //    //for (i<-arr4) println(i)
    //
    //    //for(i<-0 until arr4.length) println(arr4(i))
    //
    //    for(i<- (0 until arr4.length).reverse) println(arr4(i))
    //
    //    val res = for(i<-arr4) yield  i*10
    //
    //    println(res.sum)
    //res.sorted

    //    val map1 = Map("scala"->1,"Java"->2,"python"->3)
    //    map1("Java") = 6
    //    println(map1("Java"))
    //    println(map1.getOrElse("C#",8))
    //
    //    val t = ("scala",100L,("spark",1))
    //    t._1
    //    println(t._1)
    //    println(t._3._1)
    //
    //    val t,(a,b,c,d) = ("scala",100L,("spark",1))

    //toMap
    //zip
    //    val arr1 = Array("scala","java","yuwen")
    //    val arr2 = Array(1,2,3)
    //    val res = arr1 zip arr2

    //    val list1 = List(1,2,3)
    //    val list2 = 0::list1
    //    println(list2)

    //    val list1 = ListBuffer(1,2,3)
    //    list1 +=4
    //    println(list1)

    //    val set1 = new HashSet[Int]()
    //    val set2 = set1 +1
    //    val set3 = set2++ Set(2,3,4)
    //    println(set1)
    //    println(set3)
    //
    //    set3 -= 4
    //    set3.remove(2)
    //    println(set3)

    val map1 = new HashMap[String, Int]()
    map1("scala") = 1


    map1 += (("java", 2), ("python", 3))
    map1.put("c++", 5)

    map1 -= "java"
    map1.remove("C++")
    println(map1)
  }
}
package cn.segema.learn.basic

class YieldDemo {

}

object YieldDemo {
  def main(args: Array[String]): Unit = {
    val arr = Array("java", "scala", "C#")
    for (i <- arr) println(i)
    for (i <- 1 to 3; j <- 1 to 3 if (i != j)) println(i * 10 + j)
    val res = for (i <- 1 until 10) yield i
    println(res)
  }
}


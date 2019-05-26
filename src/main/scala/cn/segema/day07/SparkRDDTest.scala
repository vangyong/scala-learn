package cn.segema.day07

import org.apache.spark.{SparkConf, SparkContext}


object SparkRDDTest {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("SparkRDDTest").setMaster("local")
    val sc = new SparkContext(conf)

    val rdd1 = sc.parallelize(List(5, 6, 7, 3, 8, 2, 9, 1, 10))

    val res = rdd1.map(_ * 2).sortBy(x => x, true)
    println(res.collect().toBuffer)
    //val red =rdd1.filter()
  }

}

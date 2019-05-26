package cn.segema.day01.spark

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object SparkWC {

  def main(args: Array[String]): Unit = {

    //配置信息类
    val conf: SparkConf =new SparkConf().setAppName("SparkWC")//.setMaster("local[1]")
    //上下文对象
    val sc:SparkContext = new SparkContext(conf)

    //读取数据
    val lines = sc.textFile(args(0))

    val words:RDD[String] = lines.flatMap(_.split(" "))

    val paired:RDD[(String,Int)] = words.map((_,1))

    val reduced:RDD[(String,Int)] = paired.reduceByKey(_+_)
    val res:RDD[(String,Int)] = reduced.sortBy(_._2,false)

//    res.saveAsTestFile(args(1))
    println(res.collect().toBuffer)

    //结束任务
    sc.stop()


  }

}

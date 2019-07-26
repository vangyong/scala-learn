package cn.segema.learn.spark

import org.apache.spark.SparkConf
import org.apache.spark.storage.StorageLevel
import org.apache.spark.streaming.{Seconds, StreamingContext}

object NetworkWordCount {

  def main(args: Array[String]): Unit = {
    val host: String = "192.168.33.135"
    val port: Int = 7077

    //1、配置sparkConf
    val sparkConf = new SparkConf().setAppName("NetWorkWordCount").setMaster("node1")
    //2、构造StreamingContext
    val ssc = new StreamingContext(sparkConf, Seconds(5))
    ssc.sparkContext.setLogLevel("WARN")
    //3、输入
    val lines = ssc.socketTextStream(host, port, StorageLevel.MEMORY_AND_DISK_SER)
    //4、计算
    val words = lines.flatMap(_.split(""))
    val sordCounts = words.map(x => (x, 1)).reduceByKeyAndWindow(_ + _, Seconds(20))
    //5、输出
    sordCounts.print(10)
    //6、启动
    ssc.start()
    //7、终止
    ssc.awaitTermination()
  }

}

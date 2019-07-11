package cn.segema.learn.spark
import org.apache.spark.SparkConf
import org.apache.spark.streaming.kafka.KafkaUtils
import org.apache.spark.streaming.{Seconds, StreamingContext}

object StreamKafka {

  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setMaster("local[2]").setAppName("kafka")
    val stream = new StreamingContext(conf,Seconds(5))
    stream.checkpoint("D://stkafka")  //采集日志存储信息,容错性
    val zk = "192.168.188.130:2181,192.168.188.131:2181,192.168.188.132:2181"//zekeeper地址
    val topic = Map("test"->3); //test为kafka的主题名称,可以是多个同时采集
    val groupId = "spark_kafka" //名称任意
    val text = KafkaUtils.createStream(stream,zk,groupId,topic)
    text.print()
    stream.start()
    stream.awaitTermination()
    stream.stop()
  }

}

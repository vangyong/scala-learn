package cn.segema.learn.spark

import kafka.serializer.StringDecoder
import org.apache.spark.SparkConf
import org.apache.spark.streaming.kafka.KafkaUtils
import org.apache.spark.streaming.{Seconds, StreamingContext}

object StreamKafkaDirectStream {

  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setMaster("local[2]").setAppName("kafkaRedict")
    val stream = new StreamingContext(conf,Seconds(10))
    val topic = Set("test")
    val brokers = "192.168.188.130:9092,192.168.188.131:9092,192.168.188.132:9092"
    val kafkaParams = Map[String,String]("metadata.broker.list" -> brokers,
      "serializer.class" -> "kafka.serializer.StringDecoder")
    val text = KafkaUtils.createDirectStream[String,String,StringDecoder,StringDecoder](stream,kafkaParams,topic)
    text.print()
    stream.start()
    stream.awaitTermination()
    stream.stop()
  }

}

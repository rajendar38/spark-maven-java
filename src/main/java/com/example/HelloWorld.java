package com.example;

import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.SparkConf;

public class HelloWorld {
    public static void main(String[] args) {
        SparkConf conf = new SparkConf().setAppName("HelloWorld");
        JavaSparkContext sc = new JavaSparkContext(conf);

        System.out.println("Hello from native Java Spark job!");

        // Trigger executors
        JavaRDD<Integer> rdd = sc.parallelize(java.util.Arrays.asList(1,2,3,4,5,6,7,8,9,10), 2);
        int sum = rdd.reduce((a,b) -> a+b);
        System.out.println("Sum = " + sum);

        sc.close();
    }
}

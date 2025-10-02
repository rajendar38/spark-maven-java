# Use Spark 3.4.0 image
FROM apache/spark:3.4.0

# Switch to root to copy files
USER root

# Copy the JAR from Maven target folder
COPY target/helloworld-spark-1.0-SNAPSHOT.jar /opt/spark/jars/helloworld-java.jar

# Switch back to non-root user (185 is default in many Spark images)
USER 185

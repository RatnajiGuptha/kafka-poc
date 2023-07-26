# Kafka Run Commands in local system

## Set the kafka bin path to environment variables
### Start Zookeeper Server
   > zookeeper-server-start "D:\softwares\kafka_2.13-3.3.1\config\zookeeper.properties"  
     
### Start Kafka Server
   > kafka-server-start "D:\softwares\kafka_2.13-3.3.1\config\server.properties"   

### Create a topic
  > kafka-topics --create --topic topic_name --partitions 3 --replication-factor 1 --bootstrap-server localhost:9092
 
### list out all topic names
   > kafka-topics --bootstrap-server localhost:9092 --list

### Produce message
  >kafka-console-producer --topic topic_demo --bootstrap-server localhost:9092

## consume message
  > kafka-console-consumer --topic topic_demo --from-beginning --bootstrap-server localhost:9092


##  Work with kafka without setting the path 
### Start Zookeeper Server
  > .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties 
     
### Start Kafka Server
   > .\bin\windows\kafka-server-start.bat .\config\server.properties

### Create a topic
  > .\bin\windows\kafka-topics.bat --create --topic topic_demo --partitions 3 --replication-factor 1 --bootstrap-server localhost:9092
 
### list out all topic names
   > .\bin\windows\kafka-topics.bat --bootstrap-server localhost:9092 --list

### Produce message
  > .\bin\windows\kafka-console-producer.bat --topic topic_demo --bootstrap-server localhost:9092

## consume message
  > .\bin\windows\kafka-console-consumer.bat --topic topic_demo --from-beginning --bootstrap-server localhost:9092



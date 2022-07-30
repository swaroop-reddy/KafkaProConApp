# Getting Started
## Start Kafka Server 
### command 

#### Zookeeper server start

bin/zookeeper-server-start.sh config/zookeeper.properties

#### Kafka server start

JMX_PORT=8004 bin/kafka-server-start.sh config/server.properties

#### Kafka create topic

bin/kafka-topics.sh --create --bootstrap-server  localhost:9092  --replication-factor 1 --partitions 1 --topic ExampleTopic

#### Producer start :
bin/kafka-console-producer.sh --broker-list localhost:9092 -topic ExampleTopic

#### Consumer Start :

bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic ExampleTopic --from-beginning

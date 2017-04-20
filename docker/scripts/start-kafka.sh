#!/bin/sh

if [ -z "$KAFKA_HOME" ]; then
    KAFKA_HOME=/opt/kafka
    echo "No KAFKA_HOME found. Set to $KAFKA_HOME"
fi

echo "Starting zookeeper..."
sh $KAFKA_HOME/bin/zookeeper-server-start.sh $KAFKA_HOME/config/zookeeper.properties &

echo "Starting kafka..."
sh $KAFKA_HOME/bin/kafka-server-start.sh $KAFKA_HOME/config/server.properties

echo "You're welcome"


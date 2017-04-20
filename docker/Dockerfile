
FROM openjdk:8-jre

ENV ZOOKEEPER_VERSION 3.4.10
ENV SCALA_VERSION 2.11
ENV KAFKA_VERSION 0.10.2.0

RUN wget -q http://apache.mirror.iphh.net/zookeeper/stable/zookeeper-$ZOOKEEPER_VERSION.tar.gz -O /tmp/zookeeper-$ZOOKEEPER_VERSION.tar.gz && \
    tar xfz /tmp/zookeeper-$ZOOKEEPER_VERSION.tar.gz -C /opt && \
    rm -f /tmp/zookeeper-$ZOOKEEPER_VERSION.tar.gz && \
    ln -s /opt/zookeeper-$ZOOKEEPER_VERSION /opt/zookeeper && \
    wget -q http://apache.mirror.iphh.net/kafka/$KAFKA_VERSION/kafka_$SCALA_VERSION-$KAFKA_VERSION.tgz -O /tmp/kafka_$SCALA_VERSION-$KAFKA_VERSION.tgz && \
    tar xfz /tmp/kafka_$SCALA_VERSION-$KAFKA_VERSION.tgz -C /opt && \
    rm -f /tmp/kafka_$SCALA_VERSION-$KAFKA_VERSION.tgz && \
    ln -s /opt/kafka_$SCALA_VERSION-$KAFKA_VERSION /opt/kafka

EXPOSE 2181 9092

ADD config/server.properties /opt/kafka/config/server.properties
ADD config/zookeeper.properties /opt/kafka/config/zookeeper.properties
ADD scripts/start-kafka.sh /usr/bin/start-kafka.sh

CMD ["/usr/bin/start-kafka.sh"]



package br.com.alura;

import java.util.Properties;
import java.util.Map;
import java.util.Properties;

public class NewOrderMain {
    public static void main(String[] args) {
        var producer = new KafkaProducer<String, String>(properties());
    }

    private static Properties properties() {
        var properties = new Properties();
        properties.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092"); //Estabelecer conexão com servidor Kafka
        properties.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName()); //Serializador de String para byte para a Key do Map
        properties.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName()); //Serializador de String para byte para o Value do Map
        return properties;
    }
}

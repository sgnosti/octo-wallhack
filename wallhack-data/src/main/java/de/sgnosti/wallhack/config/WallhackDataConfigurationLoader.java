package de.sgnosti.wallhack.config;

import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;

/**
 * Utility class to read configuration
 * 
 * @author sgnosti
 *
 */
public final class WallhackDataConfigurationLoader {

	private static final String KAFKA_CONFIG_FILE = "kafka.config.file";
	private static final String TWITTER_CONFIG_FILE = "twitter.config.file";
	private static final String KAFKA_TOPIC_PROPERTY = "kafka.topic";
	private static final String KAFKA_STATUS_KEY_PROPERTY = "kafka.status.key";
	private static final String TWITTER_TRACKS_PROPERTY = "twitter.tracks";
	private static final String KAFKA_TIMEOUT_PROPERTY = "kafka.timeout.ms";
	private static final String TWITTER_TIMEOUT_PROPERTY = "twitter.timeout.ms";
	private static final String CASSANDRA_HOST_PROPERTY = "cassandra.host";
	private static final String CASSANDRA_KEYSPACE_PROPERTY = "cassandra.keyspace";
	private static final String CASSANDRA_MSG_TABLE_PROPERTY = "cassandra.message.table";


	private WallhackDataConfigurationLoader() {
	}

	/**
	 * Load the properties file into a configuration object
	 * 
	 * @param file
	 *            the properties file
	 * @return a configuration object
	 * @throws ConfigurationException
	 */
	public static WallhackDataConfiguration load(String file) throws ConfigurationException {

		final Configurations configurations = new Configurations();
		final PropertiesConfiguration propertiesConfiguration = configurations.properties(file);

		final WallhackDataConfiguration config = new WallhackDataConfiguration();
		config.setKafkaConfigFile(propertiesConfiguration.getString(KAFKA_CONFIG_FILE));
		config.setTwitterConfigFile(propertiesConfiguration.getString(TWITTER_CONFIG_FILE));
		config.setKafkaTopic(propertiesConfiguration.getString(KAFKA_TOPIC_PROPERTY));
		config.setKafkaStatusKey(propertiesConfiguration.getString(KAFKA_STATUS_KEY_PROPERTY));
		config.setTwitterTracks(propertiesConfiguration.getList(String.class, TWITTER_TRACKS_PROPERTY));
		config.setKafkaTimeout(propertiesConfiguration.getLong(KAFKA_TIMEOUT_PROPERTY));
		config.setTwitterTimeout(propertiesConfiguration.getLong(TWITTER_TIMEOUT_PROPERTY));
		config.setCassandraHost(propertiesConfiguration.getString(CASSANDRA_HOST_PROPERTY));
		config.setCassandraKeyspace(propertiesConfiguration.getString(CASSANDRA_KEYSPACE_PROPERTY));
		config.setCassandraMessageTable(propertiesConfiguration.getString(CASSANDRA_MSG_TABLE_PROPERTY));

		return config;
	}

}

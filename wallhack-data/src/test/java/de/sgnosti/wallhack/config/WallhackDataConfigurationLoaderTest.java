package de.sgnosti.wallhack.config;

import static org.junit.Assert.*;

import org.apache.commons.configuration2.ex.ConfigurationException;
import org.junit.Test;

public class WallhackDataConfigurationLoaderTest {

	@Test
	public void configurationCanBeLoaded() throws ConfigurationException {
		final WallhackDataConfiguration config = WallhackDataConfigurationLoader.load("config.properties");
		assertNotNull(config.getKafkaConfigFile());
		assertNotNull(config.getKafkaStatusKey());
		assertNotNull(config.getKafkaTimeout());
		assertNotNull(config.getKafkaTopic());
		assertNotNull(config.getTwitterConfigFile());
		assertNotNull(config.getTwitterTimeout());
		assertNotNull(config.getTwitterTracks());
		assertNotNull(config.getKafkaConfigFile());
		assertNotNull(config.getCassandraHost());
		assertNotNull(config.getCassandraKeyspace());
		assertNotNull(config.getCassandraMessageTable());
	}
}

package de.sgnosti.wallhack.config;

import java.util.List;

/**
 * Application configuration
 * 
 * @author sgnosti TODO: make this class final and use a Builder
 */
public class WallhackDataConfiguration {

	private String kafkaConfigFile = null;
	private String twitterConfigFile = null;
	private String kafkaTopic = null;
	private String kafkaStatusKey = null;
	private List<String> twitterTracks = null;
	private long kafkaTimeout;
	private long twitterTimeout;
	private String cassandraHost;
	private String cassandraKeyspace;
	private String cassandraMessageTable;

	public String getKafkaConfigFile() {
		return kafkaConfigFile;
	}

	public void setKafkaConfigFile(String kafkaConfigFile) {
		this.kafkaConfigFile = kafkaConfigFile;
	}
	public String getTwitterConfigFile() {
		return twitterConfigFile;
	}

	public void setTwitterConfigFile(String twitterConfigFile) {
		this.twitterConfigFile = twitterConfigFile;
	}
	public String getKafkaTopic() {
		return kafkaTopic;
	}

	public void setKafkaTopic(String kafkaTopic) {
		this.kafkaTopic = kafkaTopic;
	}
	public String getKafkaStatusKey() {
		return kafkaStatusKey;
	}

	public void setKafkaStatusKey(String kafkaStatusKey) {
		this.kafkaStatusKey = kafkaStatusKey;
	}

	public List<String> getTwitterTracks() {
		return twitterTracks;
	}

	public void setTwitterTracks(List<String> twitterTracks) {
		this.twitterTracks = twitterTracks;
	}

	public long getKafkaTimeout() {
		return kafkaTimeout;
	}

	public void setKafkaTimeout(long kafkaTimeout) {
		this.kafkaTimeout = kafkaTimeout;
	}

	public long getTwitterTimeout() {
		return twitterTimeout;
	}

	public void setTwitterTimeout(long twitterTimeout) {
		this.twitterTimeout = twitterTimeout;
	}

	public String getCassandraHost() {
		return cassandraHost;
	}

	public void setCassandraHost(String cassandraHost) {
		this.cassandraHost = cassandraHost;
	}

	public String getCassandraKeyspace() {
		return cassandraKeyspace;
	}

	public void setCassandraKeyspace(String cassandraKeyspace) {
		this.cassandraKeyspace = cassandraKeyspace;
	}

	public String getCassandraMessageTable() {
		return cassandraMessageTable;
	}

	public void setCassandraMessageTable(String cassandraMessageTable) {
		this.cassandraMessageTable = cassandraMessageTable;
	}

}

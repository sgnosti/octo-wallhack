package de.sgnosti.wallhack.writer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.datastax.driver.core.BoundStatement;
import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.PreparedStatement;
import com.datastax.driver.core.Session;

import de.sgnosti.wallhack.config.WallhackDataConfiguration;

public class CassandraWriter {
	private static final Logger LOGGER = LoggerFactory.getLogger(CassandraWriter.class);

	private final WallhackDataConfiguration config;
	private Cluster cluster;
	private Session session;

	private PreparedStatement insertStmt;

	public CassandraWriter(WallhackDataConfiguration config) {
		this.config = config;
	}

	public void start() {
		LOGGER.debug("Open Cassandra session");
		cluster = Cluster.builder().addContactPoint(config.getCassandraHost()).build();
		session = cluster.connect(config.getCassandraKeyspace());
		insertStmt = session
				.prepare("insert into " + config.getCassandraMessageTable() + "(id, content) values (uuid(), ?)");
	}

	public void write(String message) {
		final BoundStatement stmt = insertStmt.bind();
		stmt.setString("content", message);
		session.executeAsync(stmt);
	}

	public void close() {
		LOGGER.debug("Close Cassandra session");
		session.close();
		cluster.close();
	}
}

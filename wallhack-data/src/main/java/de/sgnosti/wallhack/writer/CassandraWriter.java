package de.sgnosti.wallhack.writer;

import java.util.UUID;

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

	private PreparedStatement insertCorruptStmt;

	public CassandraWriter(WallhackDataConfiguration config) {
		this.config = config;
	}

	public void start() {
		LOGGER.debug("Open Cassandra session");
		cluster = Cluster.builder().addContactPoint(config.getCassandraHost()).build();
		session = cluster.connect(config.getCassandraKeyspace());
		insertStmt = session
				.prepare("insert into " + config.getCassandraMessageTable() + "(id, content) values (?, ?)");

		insertCorruptStmt = session.prepare("insert into corrupt_message (id, content) values (uuid(), ?)");

	}

	public UUID write(final String content) {
		final BoundStatement stmt = insertStmt.bind();
		final UUID uuid = UUID.randomUUID();
		stmt.setUUID("id", uuid);
		stmt.setString("content", content);
		session.executeAsync(stmt);
		return uuid;
	}

	public void close() {
		LOGGER.debug("Close Cassandra session");
		session.close();
		cluster.close();
	}

	public void writeCorrupt(String value) {
		final BoundStatement stmt = insertCorruptStmt.bind();
		stmt.setString("content", value);
		session.executeAsync(stmt);
	}
}

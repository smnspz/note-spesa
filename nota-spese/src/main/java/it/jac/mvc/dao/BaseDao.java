package it.jac.mvc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import it.jac.mvc.exception.DatabaseException;
import it.jac.mvc.util.DataSourceUtil;

public class BaseDao {

	private static final Logger log = LogManager.getLogger(BaseDao.class);
	
	private static final String jdbcUrl = "jdbc:mysql://localhost:3396/nota_spese";
	private static final String dbUser = "root";
	private static final String dbPassword = "Gattogiorgio1";
	
	public Connection getConnection() {

		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection(jdbcUrl, dbUser, dbPassword);
			log.debug("Connessione OK");

		} catch (ClassNotFoundException | SQLException e) {
			log.error("Error opening connection", e);
			throw new DatabaseException("Error opening connection", e);
		}

		return conn;
		
		// Connessione con HIKARI
		
//		try {
//			Connection connection = DataSourceUtil.getConnection();
//			
//			log.info("auto-commit " + connection.getAutoCommit());
//			
//			return connection;
//		} catch (SQLException e) {
//			log.error("Error retrieving connection", e);
//			throw new DatabaseException("Error retrieving connection", e);
//		}

	}
}

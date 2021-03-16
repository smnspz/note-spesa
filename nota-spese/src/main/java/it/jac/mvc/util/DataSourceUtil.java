package it.jac.mvc.util;

import java.sql.Connection;
import java.sql.SQLException;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class DataSourceUtil {

	private static HikariDataSource ds;
	
	private DataSourceUtil() {}
	
	public static Connection getConnection() throws SQLException {
		
		if(ds == null) {
			
			HikariConfig config = new HikariConfig();
			config.setDriverClassName("com.mysql.cj.jdbc.Driver");
			config.setJdbcUrl("jdbc:mysql://localhost:3396/albumfoto");
			config.setUsername("root");
			config.setPassword("Gattogiorgio1");
			config.setMinimumIdle(15);
			config.setMaximumPoolSize(30);
			
			ds = new HikariDataSource(config);
			
		}
		
		return ds.getConnection();
	}
}

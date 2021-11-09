package com.mansourbens.department;

import org.h2.tools.Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.annotation.PostConstruct;
import java.sql.SQLException;

@SpringBootApplication
public class DepartmentServiceApplication {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(DepartmentServiceApplication.class, args);
	}


	@Bean(initMethod = "start", destroyMethod = "stop")
	public Server inMemoryH2DatabaseaServer() throws SQLException {
		return Server.createTcpServer(
				"-tcp", "-tcpAllowOthers", "-tcpPort", "9090");
	}

	@PostConstruct
	private void initDb() {
		jdbcTemplate.query("select id,first_name,last_name from user",
				(rs, i) -> {
					System.out.println(String.format("id : %s,first_name : %s,last_name : %s",
							rs.getString("id"),
							rs.getString("first_name"),
							rs.getString("last_name")));
					return null;
				});
	}
}

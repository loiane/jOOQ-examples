package com.loiane.test;

import static com.loiane.mysql.generatedclasses.tables.Country.COUNTRY;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

public class TestConnection {

	public static void main(String[] args) {
		Connection conn = null;

		String userName = "root";
		String password = "root";
		String url = "jdbc:mysql://localhost:3306/world";

		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(url, userName, password);

			//buscando dados no banco
			DSLContext create = DSL.using(conn, SQLDialect.MYSQL);
			Result<Record> result = create.select().from(COUNTRY).fetch();

			//iterando os resultados
			for (Record r : result) {
				String code = r.getValue(COUNTRY.CODE);
				String name = r.getValue(COUNTRY.NAME);

				System.out.println("Codigo: " + code + " name: " + name);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException ignore) {
				}
			}
		}

	}
}

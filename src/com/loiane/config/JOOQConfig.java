package com.loiane.config;

import org.jooq.util.GenerationTool;
import org.jooq.util.jaxb.Configuration;
import org.jooq.util.jaxb.Database;
import org.jooq.util.jaxb.Generator;
import org.jooq.util.jaxb.Jdbc;
import org.jooq.util.jaxb.Target;

public class JOOQConfig {

	public static void main(String[] args) throws Exception {
		Configuration configuration = new Configuration()
		    .withJdbc(new Jdbc()
		        .withDriver("com.mysql.jdbc.Driver")
		        .withUrl("jdbc:mysql://localhost:3306/world")
		        .withUser("root")
		        .withPassword("root"))
		    .withGenerator(new Generator()
		        .withName("org.jooq.util.DefaultGenerator")
		        .withDatabase(new Database()
		            .withName("org.jooq.util.mysql.MySQLDatabase")
		            .withIncludes(".*")
		            .withExcludes("")
		            .withInputSchema("world"))
		        .withTarget(new Target()
		            .withPackageName("com.loiane.mysql.generatedclasses")
		            .withDirectory("/Users/loiane/Documents/workspace/jOOQ-examples/src")));

		GenerationTool.main(configuration);
	}

}
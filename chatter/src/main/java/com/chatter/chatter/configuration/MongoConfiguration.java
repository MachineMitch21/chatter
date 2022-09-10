package com.chatter.chatter.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;

@Configuration
public class MongoConfiguration extends AbstractMongoClientConfiguration {

	@Override
	protected String getDatabaseName() {
		return "chatter";
	}

	@Override
	protected void configureClientSettings(MongoClientSettings.Builder builder) {
		ConnectionString connectionString = new ConnectionString("mongodb+srv://schuttm:kow1QN87doMJPmUN@testcluster.aekex3n.mongodb.net/?retryWrites=true&w=majority");
		builder.applyConnectionString(connectionString);
	} 
	
}

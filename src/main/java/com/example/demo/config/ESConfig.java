	package com.example.demo.config;

import java.io.File;
import java.io.IOException;
import java.net.InetAddress;

import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.TransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@Configuration
@EnableElasticsearchRepositories(basePackages="com.example.demo.repository")
public class ESConfig {

	
	
/*	@Bean
	public ElasticsearchOperations operations() throws IOException {
		File tempFile= File.createTempFile("/usr/share/elasticsearch/", Long.toString(System.currentTimeMillis()));
		Settings.Builder sb= Settings.builder()
				 .put("cluster.name", "elasticsearch")
         .put("http.enabled", "true") 
         //.put("index.number_of_shards", "1")
         .put("path.data", new File(tempFile, "data").getAbsolutePath()) 
         .put("path.logs", new File(tempFile, "logs").getAbsolutePath()) 
         .put("path.work", new File(tempFile, "work").getAbsolutePath()) 
         .put("path.home", tempFile.getAbsolutePath()); 
		TransportClient client= new PreBuiltTransportClient(sb.build());
		 client.addTransportAddress(new TransportAddress(InetAddress.getByName("52.66.197.127"), 9300));
		 return new ElasticsearchTemplate(client);
				 
	}*/
}

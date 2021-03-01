package com.example.fileUploadExample;

import com.example.fileUploadExample.config.FileStorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({FileStorageProperties.class})
public class FileUploadExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(FileUploadExampleApplication.class, args);
	}

}

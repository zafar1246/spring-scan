package com.apiscan.ZScan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages ="com.apiscan.controllers")
public class ZScanApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZScanApplication.class, args);
	}

}

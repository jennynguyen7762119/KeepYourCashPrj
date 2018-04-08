/**
 * 
 */
package com.kyc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @author otocon
 *
 */
@SpringBootApplication
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class })
@ComponentScan(basePackages = "com.kyc")
public class KeepYourCashApplication {
	public static void main(String[] args) {
		ApplicationContext applicationContext =
	            SpringApplication.run(KeepYourCashApplication.class, args);
		//SpringApplication.run(KeepYourCashApplication.class, args);
		for (String name: applicationContext.getBeanDefinitionNames()) {
            System.out.println(name);
        }
	}
}

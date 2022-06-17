package com.zira.restaurant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class ZiraApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZiraApplication.class, args);
	}

}

//{
//"firstName":"Harsh",
//"lastName":"Singh",
//"emailId":"monkmind8@gmail.com",
//"designation":"Chef",
//"phoneNumber":9999999999
//}

//{
//"firstName":"Arpit",
//"lastName":"Jaiswal",
//"emailId":"aj11@gmail.com",
//"designation":"Staff",
//"phoneNumber":9999999890
//}




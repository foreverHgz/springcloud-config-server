package com.springcloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author forever_hgz
 */
@EnableConfigServer
@SpringBootApplication
public class SpringCloudConfigApplication {
    public static void main(String[] args) {
        // http://localhost:8080/redis/swagger-ui/index.html
        // http://127.0.0.1:8080/redis/swagger-ui/index.html
        // http://192.168.31.163:8080/redis/swagger-ui/index.html
        // http://192.168.95.1:8080/redis/swagger-ui/index.html
        // http://192.168.253.1:8080/redis/swagger-ui/index.html
        SpringApplication.run(SpringCloudConfigApplication.class, args);
    }

}

package com.springcloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author forever_hgz
 */
@EnableConfigServer
@EnableEurekaClient
@SpringBootApplication
public class SpringCloudConfigApplication {
    public static void main(String[] args) {
        // http://localhost:8081/springcloud-config-server/actuator/configserver
        // http://127.0.0.1:8081/springcloud-config-server/actuator/configserver
        // http://192.168.31.163:8081/springcloud-config-server/actuator/configserver
        // http://192.168.95.1:8081/springcloud-config-server/actuator/configserver
        // http://192.168.253.1:8081/springcloud-config-server/actuator/configserver
        // http://127.0.0.1:8081/springcloud-config-server/actuator/configserver
        // http://127.0.0.1:8081/springcloud-config-server/actuator/refresh
        // http://127.0.0.1:8081/springcloud-config-server/secondconfig/dev/master
        // http://127.0.0.1:8081/springcloud-config-server/secondconfig/refresh
        SpringApplication.run(SpringCloudConfigApplication.class, args);
    }

}

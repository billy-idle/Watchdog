package com.github.watchdog;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@EnableAdminServer
@SpringBootApplication
public class WatchdogApplication {

    public static void main(String[] args) {
        SpringApplication.run(WatchdogApplication.class, args);
    }

}

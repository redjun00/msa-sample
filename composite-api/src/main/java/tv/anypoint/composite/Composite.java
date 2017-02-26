package tv.anypoint.composite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
//@EnableFeignClients
public class Composite {

    public static void main(String[] args) {
        SpringApplication.run(Composite.class, args);
    }
}

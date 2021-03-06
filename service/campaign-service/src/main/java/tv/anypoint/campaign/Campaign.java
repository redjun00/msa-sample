package tv.anypoint.campaign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Campaign {

    public static void main(String[] args) {
        SpringApplication.run(Campaign.class, args);
    }
}

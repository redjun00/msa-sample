package tv.anypoint.asset;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Asset {

    public static void main(String[] args) {
        SpringApplication.run(Asset.class, args);
    }
}

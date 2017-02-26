package tv.anypoint.device;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Device {

    public static void main(String[] args) {
        SpringApplication.run(Device.class, args);
    }
}

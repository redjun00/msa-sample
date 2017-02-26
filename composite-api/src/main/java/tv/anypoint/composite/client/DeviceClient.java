package tv.anypoint.composite.client;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Component
public class DeviceClient {

    private static final String SERVICE_URL = "http://device-service";

    @Autowired
    private RestTemplate restTemplate;

    public String getDevice(long id) {

        String url = new StringBuilder()
                .append(SERVICE_URL)
                .append("/device")
                .append("/")
                .append(id)
                .toString();

        String device = restTemplate.getForObject(url, String.class);
        log.info("url: {}, device: {}", url, device);
        return device;
    }
}

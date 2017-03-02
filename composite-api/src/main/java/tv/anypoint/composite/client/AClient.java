package tv.anypoint.composite.client;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Component
public class AClient {

    private static final String SERVICE_URL = "http://a-service";

    @Autowired
    private RestTemplate restTemplate;

    public String getA(long id){
        String url = new StringBuilder()
                .append(SERVICE_URL)
                .append("/a-service")
                .append("/")
                .append(id)
                .toString();

        String a = restTemplate.getForObject(url, String.class);
        log.info("url: {}, a: {}", url, a);
        return a;
    }
}

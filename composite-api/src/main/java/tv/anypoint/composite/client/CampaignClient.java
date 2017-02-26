package tv.anypoint.composite.client;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Component
public class CampaignClient {

    private static final String SERVICE_URL = "http://campaign-service";

    @Autowired
    private RestTemplate restTemplate;

    public String getCampaign(long id) {

        String url = new StringBuilder()
                .append(SERVICE_URL)
                .append("/campaign")
                .append("/")
                .append(id)
                .toString();

        String campaign = restTemplate.getForObject(url, String.class);
        log.info("url: {}, campaign: {}", url, campaign);
        return campaign;
    }
}

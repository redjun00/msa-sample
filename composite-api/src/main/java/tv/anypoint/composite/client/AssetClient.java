package tv.anypoint.composite.client;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Component
//@RibbonClient(name = "asset-service")
public class AssetClient {

    private static final String SERVICE_URL = "http://asset-service";

    @Autowired
    private RestTemplate restTemplate;

    public String getAsset(long id) {
        log.info("Composite web AssetClient: {}", id);

        String url = new StringBuilder()
                .append(SERVICE_URL)
                .append("/asset")
                .append("/")
                .append(id)
                .toString();

        String asset = restTemplate.getForObject(url, String.class);
        log.info("url: {}, asset: {}", url, asset);
        return asset;
    }
}

package tv.anypoint.composite.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tv.anypoint.composite.client.AssetClient;

@Slf4j
@RestController
@RequestMapping("/asset")
public class AssetController {

    @Autowired
    private AssetClient assetClient;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String getAsset(@PathVariable("id") long id) {
        log.info("Composite web AssetController: {}", id);
        return assetClient.getAsset(id);
    }
}

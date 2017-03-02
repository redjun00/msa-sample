package tv.anypoint.composite.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tv.anypoint.composite.client.CampaignClient;

@Slf4j
@RestController
@RequestMapping("/campaign")
public class CampaignController {

    @Autowired
    private CampaignClient campaignClient;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String getCampaign(@PathVariable("id") long id) {

        log.info("Composite web getCampaign() id: {}", id);
        return campaignClient.getCampaign(id);
    }
}

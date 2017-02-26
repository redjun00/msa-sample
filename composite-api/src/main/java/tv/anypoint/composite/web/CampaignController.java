package tv.anypoint.composite.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tv.anypoint.composite.client.CampaignClient;

@RestController
@RequestMapping("/campaign")
public class CampaignController {

    @Autowired
    private CampaignClient campaignClient;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String getCampaign(@PathVariable("id") long id) {
        return campaignClient.getCampaign(id);
    }
}

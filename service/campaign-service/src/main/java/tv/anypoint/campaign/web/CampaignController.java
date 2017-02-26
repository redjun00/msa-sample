package tv.anypoint.campaign.web;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/campaign")
public class CampaignController {

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String getAsset(@PathVariable("id") long id) {
        return "{\"campaign\": {\"id\": " + id + "}}";
    }
}

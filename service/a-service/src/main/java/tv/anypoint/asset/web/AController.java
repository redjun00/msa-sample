package tv.anypoint.asset.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/a-service")
public class AController {

    private static String TAG = "A-Controller";

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String getAsset(@PathVariable("id") long id) {

        log.info("device service called. id={}",id);
        return "{\"a\": {\"id\": " + id + "}}";
    }
}

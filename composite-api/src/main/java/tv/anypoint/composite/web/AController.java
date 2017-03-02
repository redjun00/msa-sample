package tv.anypoint.composite.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tv.anypoint.composite.client.AClient;

@Slf4j
@RestController
@RequestMapping("/a-service")
public class AController {

    @Autowired
    private AClient aClient;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String getA(@PathVariable("id") long id){
        log.info("AController getA() id={}", id);
        return aClient.getA(id);
    }
}

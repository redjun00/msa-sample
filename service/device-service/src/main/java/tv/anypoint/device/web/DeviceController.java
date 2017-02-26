package tv.anypoint.device.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/device")
public class DeviceController {

    private static String TAG = "DeviceController";

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String getAsset(@PathVariable("id") long id) {

        log.info("device service called. id={}",id);
        return "{\"device\": {\"id\": " + id + "}}";
    }
}

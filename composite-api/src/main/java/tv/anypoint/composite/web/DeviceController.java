package tv.anypoint.composite.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tv.anypoint.composite.client.DeviceClient;

@Slf4j
@RestController
@RequestMapping("/device")
public class DeviceController {

    @Autowired
    private DeviceClient deviceClient;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String getDevice(@PathVariable("id") long id) {
        log.info("Composite web getDevice() id: {}", id);
        return deviceClient.getDevice(id);
    }
}

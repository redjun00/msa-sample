package tv.anypoint.composite.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tv.anypoint.composite.client.DeviceClient;

@RestController
@RequestMapping("/device")
public class DeviceController {

    @Autowired
    private DeviceClient deviceClient;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String getDevice(@PathVariable("id") long id) {
        return deviceClient.getDevice(id);
    }
}

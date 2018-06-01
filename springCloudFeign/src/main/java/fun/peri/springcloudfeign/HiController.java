package fun.peri.springcloudfeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    final
    private SchedualServiceHi schedualServiceHi;

    @Autowired
    public HiController(SchedualServiceHi schedualServiceHi) {
        this.schedualServiceHi = schedualServiceHi;
    }

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String sayHi(@RequestParam String name) {
        return schedualServiceHi.sayHiFromClientOne(name);
    }
}

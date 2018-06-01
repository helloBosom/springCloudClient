package fun.peri.springcloudribbon;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    //开启熔断器
    @HystrixCommand(fallbackMethod = "helloError")
    public String helloService(String name) {
        return restTemplate.getForObject("http://client/home?name=" + name, String.class);
    }

    public String helloError(String name) {
        return "hello , " + name + " , it's a error";
    }

}

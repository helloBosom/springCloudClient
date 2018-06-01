package fun.peri.zipkin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
@SpringBootApplication
public class ZipkinApplication {

    private Logger logger = Logger.getLogger(ZipkinApplication.class.getName());

    public static void main(String[] args) {
        SpringApplication.run(ZipkinApplication.class, args);
    }

    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @RequestMapping("/hi")
    public String callHome() {
        logger.log(Level.INFO, "calling trace service-hi");
        return restTemplate.getForObject("http://localhost:8772/miya", String.class);
    }

    @RequestMapping("/info")
    public String info() {
        logger.log(Level.INFO, "calling trace service-hi");
        return "i'm service-hi";
    }

    @Bean
    public AlwaysSampler defaultSampler() {
        return new AlwaysSampler();
    }
}

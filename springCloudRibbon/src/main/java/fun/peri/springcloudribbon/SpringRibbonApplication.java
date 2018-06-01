package fun.peri.springcloudribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

// 注册
@EnableDiscoveryClient
@SpringBootApplication
//断路器 开启Hystrix
@EnableHystrix
@EnableHystrixDashboard
public class SpringRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringRibbonApplication.class, args);
    }

    //注入bean
    @Bean
    //开启负载均衡
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}

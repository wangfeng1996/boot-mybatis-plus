package cn.ymxdy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author wangfeng
 */
@SpringBootApplication
@MapperScan(basePackages = {"cn.ymxdy.mapper"})
public class BootMyabtisPlusApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootMyabtisPlusApplication.class, args);
    }

}

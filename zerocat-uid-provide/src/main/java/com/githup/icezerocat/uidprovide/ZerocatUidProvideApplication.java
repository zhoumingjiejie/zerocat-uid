package com.githup.icezerocat.uidprovide;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 0.0.0
 */
@SpringBootApplication(scanBasePackages = {"com.baidu.fsg.uid","com.githup.icezerocat"})
@MapperScan("com.baidu.fsg.uid.worker.dao")
public class ZerocatUidProvideApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZerocatUidProvideApplication.class, args);
    }

}

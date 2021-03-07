package com.guanghui.payment;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@Slf4j
@MapperScan(value = "com.guanghui.payment.mapper")
@ServletComponentScan(value = "com.guanghui.payment")
public class PaymentApplication {
    public static void main(String[] args){
        SpringApplication.run(PaymentApplication.class,args);
    }
}

package com.payment.Payment_Service;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "Payment_Service")
public class ProjectConfig {
}

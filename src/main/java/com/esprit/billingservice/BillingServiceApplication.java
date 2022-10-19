package com.esprit.billingservice;

import com.esprit.billingservice.services.InvoiceService;
import com.esprit.billingservice.dto.InvoiceRequestDTO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;

@SpringBootApplication
@EnableFeignClients
public class BillingServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BillingServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(InvoiceService invoiceService){
        return args -> {
            invoiceService.newInvoice(new InvoiceRequestDTO(new BigDecimal(8700),"1"));
            invoiceService.newInvoice(new InvoiceRequestDTO(new BigDecimal(5400),"2"));
        };
    }
}

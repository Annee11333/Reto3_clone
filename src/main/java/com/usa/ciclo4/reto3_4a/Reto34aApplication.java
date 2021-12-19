package com.usa.ciclo4.reto3_4a;


import com.usa.ciclo4.reto3_4a.repository.crudRepository.OrderCrudRepository;
import com.usa.ciclo4.reto3_4a.repository.crudRepository.ProductCrudRepository;
import com.usa.ciclo4.reto3_4a.repository.crudRepository.UserCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Reto34aApplication {
    @Autowired
    private ProductCrudRepository productCrudRepository;
    @Autowired
    private UserCrudRepository userCrudRepository;
    @Autowired
    private OrderCrudRepository orderCrudRepository;
    public static void main(String[] args) {

        SpringApplication.run(Reto34aApplication.class, args);
    }


}

package com.usa.ciclo4.reto3_4a.repository.crudRepository;

import com.usa.ciclo4.reto3_4a.model.Order;
import com.usa.ciclo4.reto3_4a.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Date;
import java.util.List;

public interface OrderCrudRepository extends MongoRepository<Order,Integer> {
    List<Order> findBySalesManZone(String zone);
    List<Order> findBySalesManId(Integer id);
    List<Order> findBySalesManIdAndStatus(Integer id,String status);
    List<Order> findByRegisterDayAndSalesManId(Date registerDay, Integer id );
}

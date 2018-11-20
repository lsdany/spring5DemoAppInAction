package com.springboot.springinaction5.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.springboot.springinaction5.domain.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {
	
	//List<Order> findByDeliveryZip(String deliveryZip);

}

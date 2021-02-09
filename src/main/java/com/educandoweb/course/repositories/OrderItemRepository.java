package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.OrderItem;



//Instancia um ObjetoRepository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}

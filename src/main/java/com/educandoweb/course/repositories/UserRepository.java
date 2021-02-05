package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.User;



//Instancia um ObjetoRepository
public interface UserRepository extends JpaRepository<User, Long>{
	
}

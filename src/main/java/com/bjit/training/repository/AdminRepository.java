package com.bjit.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bjit.training.model.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long>{
	Admin findByEmail(String email);
}

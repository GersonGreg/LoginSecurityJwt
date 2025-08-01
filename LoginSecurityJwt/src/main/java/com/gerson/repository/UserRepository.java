package com.gerson.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gerson.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User ,Long>{

	Optional<User> findByUsername(String username);
}

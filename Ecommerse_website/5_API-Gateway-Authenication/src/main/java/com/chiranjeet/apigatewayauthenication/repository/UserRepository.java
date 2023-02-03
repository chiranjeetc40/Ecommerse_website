package com.chiranjeet.apigatewayauthenication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.chiranjeet.apigatewayauthenication.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
	User findByUsername(String username);

	@Query(value = "select userid from user where username=?1", nativeQuery = true)
	int getUserID(String username);
}

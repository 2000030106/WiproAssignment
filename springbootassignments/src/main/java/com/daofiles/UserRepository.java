package com.daofiles;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootprograms.User;

@Repository

public interface UserRepository extends JpaRepository<User, Integer> {

}

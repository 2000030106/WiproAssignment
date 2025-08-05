package com.daofiles;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootprograms.Client;

public interface ClientRepository extends JpaRepository<Client, Integer>
{

}

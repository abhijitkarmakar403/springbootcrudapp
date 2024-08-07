package com.practice.springboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.practice.springboot.model.UserDetails;

@Repository
public interface UserDetailsRepo extends CrudRepository<UserDetails,Integer> {

}

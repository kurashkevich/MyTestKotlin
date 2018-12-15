package com.mykotlin.demo.repository;

import com.mykotlin.demo.domain.User;
import org.springframework.data.repository.CrudRepository;

 public interface JavaUserRepository extends CrudRepository<User, Long> {
     public User findUserById(Long id);
}

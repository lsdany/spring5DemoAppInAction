package com.springboot.springinaction5.repositories;

import com.springboot.springinaction5.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String userName);

}

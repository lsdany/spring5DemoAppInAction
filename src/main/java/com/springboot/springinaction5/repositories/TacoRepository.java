package com.springboot.springinaction5.repositories;

import org.springframework.data.repository.CrudRepository;

import com.springboot.springinaction5.domain.Taco;

public interface TacoRepository extends CrudRepository<Taco, Long> {

}

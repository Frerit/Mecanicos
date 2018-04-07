package com.juliancuadros.meca.mecanicos.repository;

import com.juliancuadros.meca.mecanicos.model.Users;

import org.springframework.data.repository.CrudRepository;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<Users, Long> {

}
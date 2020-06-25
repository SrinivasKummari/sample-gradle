package com.codelunatic.sample.gradle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codelunatic.sample.gradle.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}

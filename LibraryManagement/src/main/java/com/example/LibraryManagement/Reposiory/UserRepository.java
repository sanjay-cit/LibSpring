package com.example.LibraryManagement.Reposiory;

import com.example.LibraryManagement.Entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Integer> {

}

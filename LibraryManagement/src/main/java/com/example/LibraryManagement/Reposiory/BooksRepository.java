package com.example.LibraryManagement.Reposiory;

import com.example.LibraryManagement.Entity.BooksEntity;
import org.springframework.data.repository.CrudRepository;

public interface BooksRepository extends CrudRepository<BooksEntity, Integer> {

}

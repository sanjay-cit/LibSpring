package com.example.LibraryManagement.Reposiory;

import com.example.LibraryManagement.Entity.HistoryEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface HistoryRepository extends CrudRepository<HistoryEntity, Integer> {

    Optional<HistoryEntity> findByUseridAndBookid(Integer userid, Integer bookid);

}

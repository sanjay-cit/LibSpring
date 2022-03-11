package com.example.LibraryManagement.Service;

import com.example.LibraryManagement.Dto.Books;
import com.example.LibraryManagement.Dto.User;
import com.example.LibraryManagement.Dto.UserBookHistory;
import com.example.LibraryManagement.Entity.BooksEntity;
import com.example.LibraryManagement.Entity.HistoryEntity;
import com.example.LibraryManagement.Entity.UserEntity;
import com.example.LibraryManagement.Reposiory.BooksRepository;
import com.example.LibraryManagement.Reposiory.HistoryRepository;
import com.example.LibraryManagement.Reposiory.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class LibraryServiceImpl implements LibraryService {

    @Autowired
    BooksRepository booksRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    HistoryRepository historyRepository;

    @Override
    public void addBook(Books books) {
        booksRepository.save(new BooksEntity(books.getId(),books.getName(),books.getWriter(),books.getSummary(),books.getCategory()));
    }

    @Override
    public void addUser(User user) {
        userRepository.save(new UserEntity(user.getId(), user.getName(), user.getAddress(), user.getPh_no()));
    }

    @Override
    public void issueBook(UserBookHistory userBookHistory){
        historyRepository.save(new HistoryEntity(userBookHistory.getId(), userBookHistory.getUserid(), userBookHistory.getBookid(), LocalDate.now().toString(),null));
    }

    @Override
    public void returnBook(UserBookHistory userBookHistory1) {

        Optional<HistoryEntity> byUseridAndBookid = historyRepository.findByUseridAndBookid(userBookHistory1.getUserid(), userBookHistory1.getBookid());
        if(byUseridAndBookid.isPresent()){
            HistoryEntity historyEntity = byUseridAndBookid.get();
            historyEntity.setE_date(LocalDate.now().toString());
            historyRepository.save(historyEntity);
        }
    }
}

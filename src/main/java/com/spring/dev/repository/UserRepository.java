package com.spring.dev.repository;

import com.spring.dev.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
@Repository
public interface  UserRepository  extends JpaRepository<User,Integer> {
   // Custom query
   // @Query("SELECT b FROM User b WHERE b.email =: email")
    //List<User> findByPublishedDateAfter(@Param("date") String email);
    //public User findByEmail(String email);

}

package com.bronzeisunbreakable.api.repository.pagesrepos.home;

import com.bronzeisunbreakable.api.model.pages.home.HomePage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface HomePageRepo extends JpaRepository<HomePage, Integer> {
   @Query(
           value="select id, maintitle, subtitle, body from home_entry",
           nativeQuery = true)
   HomePage getHomePage();
}
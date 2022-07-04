package com.bronzeisunbreakable.api.repository.pagesrepos.home;

import com.bronzeisunbreakable.api.model.pages.home.HomePageMedia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HomePageMediaRepo extends JpaRepository<HomePageMedia, Integer> {
   @Query(
           value = "select id, idh as id_entry, url from media_home_entry",
           nativeQuery = true)
   List<HomePageMedia> getHomePageMedia();
   /*@Query(
           value="select id, idh as id_entry, url from media_home_entry where id = ?1",
           nativeQuery = true)
   HomePageMedia getHomePageMediaId(Long id);*/
}
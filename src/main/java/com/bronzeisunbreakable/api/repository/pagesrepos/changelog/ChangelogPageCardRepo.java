package com.bronzeisunbreakable.api.repository.pagesrepos.changelog;

import com.bronzeisunbreakable.api.model.pages.changelog.card.ChangelogCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChangelogPageCardRepo extends JpaRepository<ChangelogCard, Integer> {
   @Query(
           value = "select id, title, body, severity from changelog_entry",
           nativeQuery = true)
   List<ChangelogCard> getChangelogPageCards();
   @Query(
           value="select id, title, body, severity from changelog_entry where id = ?1",
           nativeQuery = true)
   ChangelogCard getChangelogPageCardId(Long id);
}
package com.bronzeisunbreakable.api.repository.pagesrepos.changelog;

import com.bronzeisunbreakable.api.model.pages.changelog.card.ChangelogCardMedia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChangelogPageCardMediaRepo extends JpaRepository<ChangelogCardMedia, Integer> {
   @Query(
           value = "select id, idc as id_card, url from media_changelog_entry",
           nativeQuery = true)
   List<ChangelogCardMedia> getChangelogPageCardsMedia();
   @Query(
           value="select id, idc as id_card, url from media_changelog_entry where id = ?1",
           nativeQuery = true)
   ChangelogCardMedia getChangelogPageCardMediaId(Long id);
}
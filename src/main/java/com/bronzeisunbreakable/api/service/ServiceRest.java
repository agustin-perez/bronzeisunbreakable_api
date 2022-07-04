package com.bronzeisunbreakable.api.service;

import com.bronzeisunbreakable.api.model.pages.changelog.card.ChangelogCard;
import com.bronzeisunbreakable.api.model.pages.changelog.card.ChangelogCardMedia;
import com.bronzeisunbreakable.api.model.pages.home.HomePage;
import com.bronzeisunbreakable.api.model.pages.home.HomePageMedia;
import com.bronzeisunbreakable.api.repository.pagesrepos.changelog.ChangelogPageCardMediaRepo;
import com.bronzeisunbreakable.api.repository.pagesrepos.changelog.ChangelogPageCardRepo;
import com.bronzeisunbreakable.api.repository.pagesrepos.home.HomePageMediaRepo;
import com.bronzeisunbreakable.api.repository.pagesrepos.home.HomePageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ServiceRest {

    @Autowired
    private HomePageRepo HomePageRepo;
    @Autowired
    private HomePageMediaRepo HomePageMediaRepo;
    @Autowired
    private ChangelogPageCardRepo ChangelogPageCardRepo;
    @Autowired
    private ChangelogPageCardMediaRepo ChangelogPageCardMediaRepo;

    public HomePage getHomePage(){
        return HomePageRepo.getHomePage();
    }

    public List<HomePageMedia> getHomePageMedia(){
        return HomePageMediaRepo.getHomePageMedia();
    }

    public List<ChangelogCard> getChangelogPageCards(){
        return ChangelogPageCardRepo.getChangelogPageCards();
    }

    public ChangelogCard getChangelogPageCardId(Long id){
        return ChangelogPageCardRepo.getChangelogPageCardId(id);
    }

    public List<ChangelogCardMedia> getChangelogPageCardsMedia(){
        return ChangelogPageCardMediaRepo.getChangelogPageCardsMedia();
    }

    public ChangelogCardMedia getChangelogPageCardMediaId(Long id){
        return ChangelogPageCardMediaRepo.getChangelogPageCardMediaId(id);
    }
}

package com.bronzeisunbreakable.api.controller;

import com.bronzeisunbreakable.api.model.pages.changelog.card.ChangelogCardMedia;
import com.bronzeisunbreakable.api.model.pages.home.HomePage;
import com.bronzeisunbreakable.api.model.pages.changelog.card.ChangelogCard;
import com.bronzeisunbreakable.api.model.pages.home.HomePageMedia;
import com.bronzeisunbreakable.api.service.ServiceRest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping(value = "/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
public class Controller {
    @Autowired
    private ServiceRest ServiceRest;

    @GetMapping("/pages/home")
    @CrossOrigin
    public @ResponseBody HomePage getHomePage(){
        return ServiceRest.getHomePage();

    }

    @GetMapping("/pages/home/media")
    @CrossOrigin
    public @ResponseBody List<HomePageMedia> getHomeMedia(){
        return ServiceRest.getHomePageMedia();

    }

    @GetMapping("/pages/changelog")
    @CrossOrigin
    public @ResponseBody List<ChangelogCard> getChangelogPage(){
        return ServiceRest.getChangelogPageCards();
    }

    @GetMapping("/pages/changelog/{id}")
    @CrossOrigin
    public @ResponseBody ChangelogCard getChangelogPageId(@PathVariable Long id){
        return ServiceRest.getChangelogPageCardId(id);
    }

    @GetMapping("/pages/changelog/media")
    @CrossOrigin
    public @ResponseBody List<ChangelogCardMedia> getChangelogMedia(){
        return ServiceRest.getChangelogPageCardsMedia();
    }

    @GetMapping("/pages/changelog/media/{id}")
    @CrossOrigin
    public @ResponseBody ChangelogCardMedia getChangelogMediaId(@PathVariable Long id){
        return ServiceRest.getChangelogPageCardMediaId(id);
    }

    @GetMapping("/test")
    @CrossOrigin
    public @ResponseBody ArrayList<String> about(){
        ArrayList<String> pageDataList = new ArrayList<>();
        pageDataList.add("json value");
        pageDataList.add("json value");
      return pageDataList;
    }
}
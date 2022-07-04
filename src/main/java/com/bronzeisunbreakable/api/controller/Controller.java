package com.bronzeisunbreakable.api.controller;

import com.bronzeisunbreakable.api.model.pages.ChangelogMedia;
import com.bronzeisunbreakable.api.model.pages.Home;
import com.bronzeisunbreakable.api.model.pages.Changelog;
import com.bronzeisunbreakable.api.model.pages.HomeMedia;
import com.bronzeisunbreakable.api.service.ServicioRest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping(value = "/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
public class Controller {
    @Autowired
    private ServicioRest ServicioRest;


    @GetMapping("/pages/home")
    @CrossOrigin
    public @ResponseBody Home getHomePage(){
        return ServicioRest.getHomePage();

    }

    @GetMapping("/pages/home/media")
    @CrossOrigin
    public @ResponseBody HomeMedia getHomeMedia(){
        return ServicioRest.getHomeMedia();

    }

    @GetMapping("/pages/changelog")
    @CrossOrigin
    public @ResponseBody Changelog getChangelogPage(){
        return ServicioRest.getChangelogPage();
    }

    @GetMapping("/pages/changelog/{id}")
    @CrossOrigin
    public @ResponseBody Changelog getChangelogPageId(@PathVariable Long id){
        return ServicioRest.getChangelogPageId(id);
    }

    @GetMapping("/pages/changelog/media")
    @CrossOrigin
    public @ResponseBody ChangelogMedia getChangelogMedia(){
        return ServicioRest.getChangelogMedia();
    }

    @GetMapping("/pages/changelog/media/{id}")
    @CrossOrigin
    public @ResponseBody ChangelogMedia getChangelogMediaId(@PathVariable Long id){
        return ServicioRest.getChangelogMediaId(id);
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
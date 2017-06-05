package com.miedzinski195659.tweetTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by lm on 10.05.2017.
 */
@RestController
public class TweetController {

    private final TweetService tweetService;

    @Autowired
    TweetController(TweetService tweetService) {
        this.tweetService = tweetService;
    }

    @RequestMapping(value = "/tweet", method = RequestMethod.GET)
    public List<Tweet> getAll() {
        return tweetService.findAll();
    }

    @RequestMapping(value = "/tweet", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public void addTweet(@RequestBody Tweet tweet) {
        tweetService.save(tweet);
    }

}

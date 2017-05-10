package com.miedzinski195659.tweetTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by lm on 10.05.2017.
 */
@RestController
@RequestMapping(value = "/tweet")
public class TweetController {

    private final TweetService tweetService;

    @Autowired
    TweetController(TweetService tweetService) {
        this.tweetService = tweetService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Tweet> getAll() {
        return tweetService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public void addTweet(Tweet tweet) {
        tweetService.save(tweet);
    }
}

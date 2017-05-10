package com.miedzinski195659.tweetTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lm on 10.05.2017.
 */
@Service
public class MongoDBTweetService implements TweetService {

    private final TweetRepository tweetRepository;

    @Autowired
    MongoDBTweetService(TweetRepository tweetRepository) {
        this.tweetRepository = tweetRepository;
    }

    @Override
    public List<Tweet> findAll() {
        return tweetRepository.findAll();
    }

    @Override
    public void save(Tweet tweet) {
        tweetRepository.save(tweet);
    }
}

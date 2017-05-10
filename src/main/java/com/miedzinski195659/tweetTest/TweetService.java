package com.miedzinski195659.tweetTest;

import java.util.List;

/**
 * Created by lm on 10.05.2017.
 */
public interface TweetService {
    List<Tweet> findAll();

    void save(Tweet tweet);
}

package com.miedzinski195659.tweetTest;

import org.springframework.data.repository.Repository;

import java.util.List;

/**
 * Created by lm on 10.05.2017.
 */
public interface TweetRepository extends Repository<Tweet, String> {
    List<Tweet> findAll();

    void save(Tweet tweet);
}

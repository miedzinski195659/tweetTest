package com.miedzinski195659.tweetTest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lm on 10.05.2017.
 */
@RestController
public class TweetController {
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(){
        return "Hello";
    }
}

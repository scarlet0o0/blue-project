package com.rainbow.blue.controller;

import com.rainbow.blue.mapper.PostMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class PostController {
    private final PostMapper postMapper;

    @GetMapping(value = "/")
    public void postTest() {
        System.out.println(postMapper.AllList());

    }

}

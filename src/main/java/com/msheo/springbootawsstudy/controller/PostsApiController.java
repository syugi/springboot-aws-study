package com.msheo.springbootawsstudy.controller;

import com.msheo.springbootawsstudy.dto.PostsResponseDto;
import com.msheo.springbootawsstudy.dto.PostsSaveRequestDto;
import com.msheo.springbootawsstudy.dto.PostsUpdateRequestDto;
import com.msheo.springbootawsstudy.service.PostsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PostsApiController {

    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto) {
        return postsService.save(requestDto);
    }

    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto) {
        return postsService.update(id, requestDto);
    }

    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto findById(@PathVariable Long id) {
        return postsService.findById(id);
    }
}

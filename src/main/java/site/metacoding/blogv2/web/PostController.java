package site.metacoding.blogv2.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;
import site.metacoding.blogv2.service.PostService;

@RequiredArgsConstructor
@Controller
public class PostController {
    private final PostService postService;

    @GetMapping({ "/", "/post" })
    public String home() {
        return "post/list";
    }
}
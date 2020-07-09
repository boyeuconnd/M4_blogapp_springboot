package cg.blog.blogapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogController {
    @GetMapping("")
    public String getIndex() {
        return "index";
    }
}

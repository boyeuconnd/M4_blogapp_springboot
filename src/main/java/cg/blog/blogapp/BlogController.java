package cg.blog.blogapp;

import cg.blog.blogapp.models.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Optional;

@Controller
public class BlogController {

    @Autowired
    private BlogRepository blogRepository;

    @GetMapping("")
    public String getIndex(Model model) {

        Optional<Blog> blog = blogRepository.findById(1L);

        String title = "";
        if (blog.isPresent()) {
            title = blog.get().getTitle();
        }

        
        model.addAttribute("title", title);

        return "index";
    }
}

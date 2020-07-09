package cg.blog.blogapp;

import cg.blog.blogapp.models.Blog;
import org.springframework.data.repository.CrudRepository;

public interface BlogRepository extends CrudRepository<Blog, Long> {
}

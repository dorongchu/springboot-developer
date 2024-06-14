package me.ilhyemong.springbootdeveloper.repository;

import me.ilhyemong.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}

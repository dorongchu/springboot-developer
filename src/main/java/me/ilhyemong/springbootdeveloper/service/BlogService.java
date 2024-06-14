package me.ilhyemong.springbootdeveloper.service;

import lombok.RequiredArgsConstructor;
import me.ilhyemong.springbootdeveloper.domain.Article;
import me.ilhyemong.springbootdeveloper.dto.AddArticleRequest;
import me.ilhyemong.springbootdeveloper.repository.BlogRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BlogService {
    private final BlogRepository blogRepository;

    public Article save(AddArticleRequest request) {
        return blogRepository.save(request.toEntity());
    }
}

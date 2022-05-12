package com.aca.homework.week18.website.service.impl;

import com.aca.homework.week18.website.entity.Post;
import com.aca.homework.week18.website.entity.User;
import com.aca.homework.week18.website.repository.PostRepository;
import com.aca.homework.week18.website.repository.UserRepository;
import com.aca.homework.week18.website.service.core.PostService;
import com.aca.homework.week18.website.service.core.params.CreatePostParams;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostServiceImpl implements PostService {
    private PostRepository postRepository;
    private UserRepository userRepository;

    public PostServiceImpl(PostRepository postRepository, UserRepository userRepository) {
        this.postRepository = postRepository;
        this.userRepository = userRepository;
    }

    @Override
    public Post create(CreatePostParams params) {
        User user = new UserServiceImpl(userRepository).getById(params.getUserId());
        Post post = new Post(params.getTitle(),params.getDescription(),user);
        postRepository.save(post);
        return post;
    }

    @Override
    public Post getById(Long id) {
        Optional<Post> byId = postRepository.findById(id);
        if(!byId.isPresent()) {
            throw new RuntimeException("User with such an id doesn't exist");
        }
        return byId.get();
    }

    @Override
    public List<Post> getAllById(Long id) {
        List<Post> allById = postRepository.findAllByUserId(id);
        return allById;
    }
}

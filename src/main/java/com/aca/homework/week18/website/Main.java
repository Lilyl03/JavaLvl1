package com.aca.homework.week18.website;

import com.aca.homework.week18.website.facade.impl.PostFacadeImpl;
import com.aca.homework.week18.website.facade.impl.UserFacadeImpl;
import com.aca.homework.week18.website.facade.request.AllUserPostsRequestDto;
import com.aca.homework.week18.website.facade.request.ImageCreationRequestDto;
import com.aca.homework.week18.website.facade.request.PostCreationRequestDto;
import com.aca.homework.week18.website.facade.request.UserSignUpRequestDto;
import com.aca.homework.week18.website.repository.ImageRepository;
import com.aca.homework.week18.website.repository.PostRepository;
import com.aca.homework.week18.website.repository.UserRepository;
import com.aca.homework.week18.website.service.core.ImageService;
import com.aca.homework.week18.website.service.core.PostService;
import com.aca.homework.week18.website.service.core.UserService;
import com.aca.homework.week18.website.service.impl.ImageServiceImpl;
import com.aca.homework.week18.website.service.impl.PostServiceImpl;
import com.aca.homework.week18.website.service.impl.UserServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        final ConfigurableApplicationContext context = SpringApplication.run(Main.class, args);
        UserRepository userRepository = context.getBean(UserRepository.class);
        PostRepository postRepository = context.getBean(PostRepository.class);
        ImageRepository imageRepository = context.getBean(ImageRepository.class);
        UserService userService = new UserServiceImpl(userRepository);
        PostService postService = new PostServiceImpl(postRepository,userRepository);
        ImageService imageService = new ImageServiceImpl(postRepository,imageRepository,userRepository);
        new UserFacadeImpl(
                userService,userRepository
        ).signUp(new UserSignUpRequestDto("L","f","lsfd","bhfsej"));
        PostFacadeImpl postFacade = new PostFacadeImpl(
                imageRepository, userRepository, postRepository,
                imageService, postService, userService
        );
        postFacade.create(new PostCreationRequestDto(1L,"Title", "desc"));

        postFacade.uploadImage(new ImageCreationRequestDto(1L,"jsfgn"));
        postFacade.uploadImage(new ImageCreationRequestDto(1L,"dgfg"));
        postFacade.uploadImage(new ImageCreationRequestDto(1L,"dgrgc"));
        postFacade.uploadImage(new ImageCreationRequestDto(1L,"gdffg"));
        postFacade.uploadImage(new ImageCreationRequestDto(1L,"gdffg"));


        System.out.println(postFacade.getAllUserPosts(new AllUserPostsRequestDto(1L)));
    }
}

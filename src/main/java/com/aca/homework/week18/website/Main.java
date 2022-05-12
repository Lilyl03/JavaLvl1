package com.aca.homework.week18.website;

import com.aca.homework.week18.website.facade.core.PostFacade;
import com.aca.homework.week18.website.facade.core.UserFacade;
import com.aca.homework.week18.website.facade.request.AllUserPostsRequestDto;
import com.aca.homework.week18.website.facade.request.ImageCreationRequestDto;
import com.aca.homework.week18.website.facade.request.PostCreationRequestDto;
import com.aca.homework.week18.website.facade.request.UserSignUpRequestDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        final ConfigurableApplicationContext context = SpringApplication.run(Main.class, args);
        UserFacade userFacade = context.getBean(UserFacade.class);
        userFacade.signUp(new UserSignUpRequestDto("L","f","lsfd","bhfsej"));
        PostFacade postFacade = context.getBean(PostFacade.class);
        postFacade.create(new PostCreationRequestDto(1L,"Title", "desc"));

        postFacade.uploadImage(new ImageCreationRequestDto(1L,"jsfgn"));
        postFacade.uploadImage(new ImageCreationRequestDto(1L,"dgfg"));
        postFacade.uploadImage(new ImageCreationRequestDto(1L,"dgrgc"));
        postFacade.uploadImage(new ImageCreationRequestDto(1L,"gdffg"));
        postFacade.uploadImage(new ImageCreationRequestDto(1L,"gdffg"));


        System.out.println(postFacade.getAllUserPosts(new AllUserPostsRequestDto(1L)));
    }
}

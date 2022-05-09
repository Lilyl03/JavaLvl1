package com.aca.homework.week18.website.repository;


import com.aca.homework.week18.website.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post,Long> {
    List<Post> findAllByUserId(Long id);
}

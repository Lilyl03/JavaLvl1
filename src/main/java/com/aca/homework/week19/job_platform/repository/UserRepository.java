package com.aca.homework.week19.job_platform.repository;

import com.aca.homework.week19.job_platform.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByFirstNameAndLastNameAndUsername(String firstname, String lastname, String username);
}

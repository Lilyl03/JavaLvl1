package com.aca.homework.week19.job_platform.repository;

import com.aca.homework.week19.job_platform.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends JpaRepository<Employee, Long> {
    boolean existsByUserId(Long userId);
}

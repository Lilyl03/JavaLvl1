package com.aca.homework.week19.job_platform.repository;

import com.aca.homework.week19.job_platform.entity.Organization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganizationRepository extends JpaRepository<Organization, Long> {
    boolean existsByEid(String eid);
}

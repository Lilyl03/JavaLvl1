package com.aca.homework.exam.exam3.repository;

import com.aca.homework.exam.exam3.entity.User;
import com.aca.homework.exam.exam3.entity.UserPlateNumber;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserPlateNumberRepository extends JpaRepository<UserPlateNumber, Long> {
    UserPlateNumber findByNumberPlate(String NumberPlate);
}

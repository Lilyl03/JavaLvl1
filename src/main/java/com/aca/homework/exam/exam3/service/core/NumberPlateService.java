package com.aca.homework.exam.exam3.service.core;

import com.aca.homework.exam.exam3.entity.NumberPlate;
import com.aca.homework.exam.exam3.service.core.params.CreateNumberPlateParams;

import java.sql.SQLException;

public interface NumberPlateService {
    NumberPlate create(CreateNumberPlateParams params);
}

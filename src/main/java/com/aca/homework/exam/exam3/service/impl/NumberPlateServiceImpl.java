package com.aca.homework.exam.exam3.service.impl;

import com.aca.homework.exam.exam3.entity.NumberPlate;
import com.aca.homework.exam.exam3.generator.NumberPlateGenerator;
import com.aca.homework.exam.exam3.repository.NumberPlateRepository;
import com.aca.homework.exam.exam3.service.core.NumberPlateService;
import com.aca.homework.exam.exam3.service.core.params.CreateNumberPlateParams;
import org.springframework.context.ConfigurableApplicationContext;

public class NumberPlateServiceImpl implements NumberPlateService {
    private final NumberPlateRepository numberPlateRepository;
    private ConfigurableApplicationContext context;

    public NumberPlateServiceImpl(NumberPlateRepository numberPlateRepository) {
        this.numberPlateRepository = numberPlateRepository;
    }

    @Override
    public NumberPlate create(CreateNumberPlateParams params) {
        NumberPlate numberPlate = new NumberPlate(params.getNumberPlate());
        try {
            NumberPlateGenerator.generate(context);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return numberPlate;
    }


}
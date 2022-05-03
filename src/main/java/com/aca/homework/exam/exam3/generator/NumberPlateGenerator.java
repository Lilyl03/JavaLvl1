package com.aca.homework.exam.exam3.generator;

import com.aca.homework.exam.exam3.entity.NumberPlate;
import com.aca.homework.exam.exam3.repository.NumberPlateRepository;
import org.springframework.context.ConfigurableApplicationContext;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

public class NumberPlateGenerator {
    private static char[] arrayForX = {'A', 'B', 'C'};
    private static ArrayBlockingQueue<String> arrayBlockingQueue = new ArrayBlockingQueue<>(9000);

    public static void generate(ConfigurableApplicationContext context) throws InterruptedException {
        List<Thread> threads = new ArrayList<>();
        for (int j = 0; j < 9000; j++) {
            Thread thread = new Thread(createRunnable(context));
            thread.start();
            threads.add(thread);
        }
        for (Thread thread : threads) {
            thread.join();
        }
    }

    private static  String createPlateNumber(){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 2; i++) {
            int intForX = new Random().nextInt(3);
            stringBuilder.append(arrayForX[intForX]);
        }
        for (int i = 0; i < 3; i++) {
            int intForY = new Random().nextInt(10);
            stringBuilder.append(intForY);
        }
        return stringBuilder.toString();
    }

    private static Runnable createRunnable(ConfigurableApplicationContext context) throws InterruptedException {
        return new Runnable() {
            @Override
            public void run() {
                String plateNumber = createPlateNumber();
                if (!arrayBlockingQueue.contains(plateNumber)) {
                    arrayBlockingQueue.add(plateNumber);
                    NumberPlateRepository numberPlateRepository = context.getBean(NumberPlateRepository.class); ;
                    try {
                        numberPlateRepository.save(new NumberPlate(arrayBlockingQueue.take()));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        };
    }


}

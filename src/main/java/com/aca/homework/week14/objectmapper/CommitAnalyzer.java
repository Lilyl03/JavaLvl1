package com.aca.homework.week14.objectmapper;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.function.Supplier;

public class CommitAnalyzer {
    private Supplier<String> filePath;

    public CommitAnalyzer(Supplier<String> filePath) {
        this.filePath = filePath;
    }

    @JsonProperty("total")
    private int total;
    @JsonProperty("week")
    private long week;
    @JsonProperty("days")
    private int[] days;

    private int getTotal() {
        return total;
    }

    private void setTotal(int total) {
        this.total = total;
    }

    public CommitAnalyzer() {
    }

    public int count() throws IOException {
        int sum = 0;
        ObjectMapper objectMapper = new ObjectMapper();
        List<CommitAnalyzer> listCar = objectMapper.readValue(new File(this.filePath.get()), new TypeReference<List<CommitAnalyzer>>() {
        });
        for (CommitAnalyzer commitAnalyzer : listCar) {
            sum += commitAnalyzer.getTotal();
        }
        return sum;
    }
}
package com.aca.homework.week20.retrofit.cat;

import java.util.Objects;

public class CatFactsResponse {
    private String fact;
    private Long length;

    public CatFactsResponse(String fact, Long length) {
        this.fact = fact;
        this.length = length;
    }

    public String getFact() {
        return fact;
    }

    public void setFact(String fact) {
        this.fact = fact;
    }

    public Long getLength() {
        return length;
    }

    public void setLength(Long length) {
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CatFactsResponse that = (CatFactsResponse) o;
        return Objects.equals(fact, that.fact) && Objects.equals(length, that.length);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fact, length);
    }

    @Override
    public String toString() {
        return "CatFactsResponse{" +
                "fact='" + fact + '\'' +
                ", length=" + length +
                '}';
    }
}

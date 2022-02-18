package com.aca.homework.week5.exam;

public class ExamTest {
    private final boolean flag;
    private final String username;

    public ExamTest(String username, boolean flag) {
        this.username = username;
        this.flag = flag;
    }

    public static void main(String[] args) {
        ExamTest passedExamTest = new PassedExamTest("smart-username");
        System.out.println(passedExamTest);
        ExamTest failedExamTest = new FailedExamTest("username1");
        System.out.println(failedExamTest);

    }

    @Override
    public String toString() {
        return "passed = " + flag +
                ", username= " + username;
    }
}

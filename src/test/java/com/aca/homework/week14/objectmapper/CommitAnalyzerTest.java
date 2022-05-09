//package com.aca.homework.week14.objectmapper;
//
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeEach;
//
//
//import java.io.IOException;
//import java.util.function.Supplier;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class CommitAnalyzerTest {
//    public CommitAnalyzerTestitAnalyzer testSubject;
//    @BeforeEach
//    public void init(){
//        testSubject = new CommitAnalyzer(new Supplier<String>() {
//            @Override
//            public String get() {
//                return "/home/luser/IdeaProjects/JavaLvl1/src/main/java/com/aca/homework/week14/objectmapper/commits-data.json";
//            }
//        });
//    }
//
//
//    @Test
//    public void testCount() throws IOException {
//        Assertions.assertEquals(301,testSubject.count());
//    }
//
//}
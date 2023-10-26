package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
//import ru.netology.services.WorkSchedule;

public class WorkScheduleTest {

    @ParameterizedTest
//    @CsvSource({
//            "2,100000,60000,150000",
//            "3,10000,3000,20000"
//    })
    @CsvFileSource(files = "src/test/resources/count.csv")
    public void MorelSalary(int expected, int income, int expenses, int threshold) {
        WorkSchedule service = new WorkSchedule();


        //int expected = 2;
        int count = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, count);


    }

//    @Test
//    void MinimalSalary() {
//       WorkSchedule service = new WorkSchedule();
//        {
//
//            int expected = 3;
//            int count = service.calculate(10_000, 3_000, 20_000);
//            Assertions.assertEquals(expected, count);
//
//        }


}




package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//import ru.netology.services.WorkSchedule;

public class WorkScheduleTest {

    @Test
    void MorelSalary() {
        WorkSchedule service = new WorkSchedule();
        {

            int expected = 2;
            int count = service.calculate(100_000, 60_000, 150_000);
            Assertions.assertEquals(expected, count);

        }


    }

    @Test
    void MinimalSalary() {
        WorkSchedule service = new WorkSchedule();
        {

            int expected = 3;
            int count = service.calculate(10_000, 3_000, 20_000);
            Assertions.assertEquals(expected, count);

        }


    }

}


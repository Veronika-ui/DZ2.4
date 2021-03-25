package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class statServiceTest {

    @Test
    void sum() {
        statServiceTest service = new statServiceTest();

        long[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.sum(months);

        assertEquals(expected, actual);
    }

    }





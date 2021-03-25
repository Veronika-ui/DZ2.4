package ru.netology.stats;

public class statService {
    public long Sum(long[] months) {

        long sum = 0;
        for (long month : months) {

            sum += month;
        }
        return sum;

    }

package ru.netology.stats;

public class StatsService {

    public int sumSales(long[] sales) {
        int sumMonth = 0;
        for (long sale : sales) {
            sumMonth += sale;

        }
        return sumMonth;
    }

    public double middleSales(long[] sales) {
        double middleSum = 0;
        double sumMonth = 0;

        sumMonth = sumSales(sales);
        middleSum = sumMonth / sales.length;

        return middleSum;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int index = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = index;
            }
            index = index + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int index = 0;

        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = index;
            }
            index = index + 1;
        }
        return maxMonth + 1;
    }

    public int lessThanMiddleSales(long[] sales) {
        int lessMiddleMonth = 0;
        double middleSum = middleSales(sales);

        for (long sale : sales) {
            if (sale <= middleSum) {
                lessMiddleMonth++;
            }
        }
        return lessMiddleMonth;
    }

    public int aboveMiddleSales(long[] sales) {
        int aboveMiddleMonth = 0;
        double middleSum = middleSales(sales);

        for (long sale : sales) {
            if (sale >= middleSum) {
                aboveMiddleMonth++;
            }
        }
        return aboveMiddleMonth;
    }

}
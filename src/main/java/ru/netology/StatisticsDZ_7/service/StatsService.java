package ru.netology.StatisticsDZ_7.service;

public class StatsService {

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public long totalOfAllSales(long[] sales) { //сумма всех продаж
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public long averageSumOfAllSales(long[] sales) { //средняя сумма всех продаж
        long sum = totalOfAllSales(sales);
        return sum / 12;

    }

    public int maxSales(int[] sales) { //максимальные продажи
        int maxMonth = 0;
        int month = 0;

        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public long minAverageAmount(long[] sales) { //количество продаж ниже среднего
        long averageAmount = averageSumOfAllSales(sales); //присвоили переменной среднее значение из метода averageSumOfAllSales
        int minAverageAmount = 0;

        for (long sale : sales) {
            if (sale < averageAmount) {
                minAverageAmount++;
            }
        }
        return minAverageAmount;
    }

    public long maxAverageAmount(long[] sales) { //количество продаж ниже среднего
        long averageAmount = averageSumOfAllSales(sales); //присвоили переменной среднее значение из метода averageSumOfAllSales
        int maxAverageAmount = 0;

        for (long sale : sales) {
            if (sale > averageAmount) {
                maxAverageAmount++;
            }
        }
        return maxAverageAmount;
    }
}


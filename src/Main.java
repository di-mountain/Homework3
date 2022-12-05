public class Main {
    public static void main(String[] args) {
        int a = 17838;
        byte b = -125;
        short c = 32374;
        long d = 123456789;
        float e = 3.3437557f;
        double f = -56.654434365d;
        System.out.println("Задача 1");
        System.out.println("Значение переменной a с типом int равно " + a);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной c с типом short равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной f с типом double равно " + f);

        System.out.println("Задача 2");
        e = 27.12f;
        d = 987678965549L;
        f = 2.786;
        boolean x = false;
        a = 569;
        c = -159;
        int a1 = 27897;
        b = 67;
        System.out.println("Значение переменной a с типом int равно " + a);
        System.out.println("Значение переменной a1 с типом int равно " + a1);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной c с типом short равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной f с типом double равно " + f);
        System.out.println("Значение переменной x с типом boolean равно " + x);

        System.out.println("Задача 3");
        int class1 = 23;
        int class2 = 27;
        int class3 = 30;
        int paper = 480;
        int paperPerOne = paper / (class1 + class2 + class3);
        System.out.println("На каждого ученика рассчитано " + paperPerOne + " листов бумаги");

        System.out.println("Задача 4");
        int perfomancePer2min = 16;
        int perfomancePer1min = perfomancePer2min / 2;
        int perfomancePer20min = perfomancePer1min * 20;
        int perfomancePer1day = perfomancePer1min * 60 * 24;
        int perfomancePer3day = perfomancePer1day * 3;
        int perfomancePer1month = perfomancePer1day * 30;
        System.out.println("За 20 минут машина произвела бутылок " + perfomancePer20min + " штук");
        System.out.println("За 1 сутки машина произвела бутылок " + perfomancePer1day + " штук");
        System.out.println("За 3 суток машина произвела бутылок " + perfomancePer3day + " штук");
        System.out.println("За 1 месяц машина произвела бутылок " + perfomancePer1month + " штук");

        System.out.println("Задача 5");
        byte summarAmountOfPaint = 120;
        byte amountOfWhitePaintPerClass = 2;
        byte amountOfBrownPaintPerClass = 4;
        int amountOfPaintPerClass = amountOfWhitePaintPerClass + amountOfBrownPaintPerClass;
        int amountOfClasses = summarAmountOfPaint / amountOfPaintPerClass;
        int amountOfWhitePaint = amountOfWhitePaintPerClass * amountOfClasses;
        int amountOfBrownPaint = amountOfBrownPaintPerClass * amountOfClasses;
        System.out.println("В школе, где " + amountOfClasses + " классов, нужно " + amountOfWhitePaint + " банок белой краски и " + amountOfBrownPaint + " банок коричневой краски");

        System.out.println("Задача 6");
        int amountBananas = 5;
        int weight1BananaInGr = 80;
        int milkVolumeInMl = 200;
        int weightMilk100MlInGr = 105;
        int amountIcecream = 2;
        int weight1IcecreamInGr = 100;
        int amountEggs = 4;
        int weight1EggInGr = 70;
        int weightCoctailInGr = amountBananas * weight1BananaInGr + milkVolumeInMl / 100 * weightMilk100MlInGr + amountIcecream * weight1IcecreamInGr + amountEggs * weight1EggInGr;
        float weightCoctailInKg = weightCoctailInGr / 1000f;
        System.out.println("Общий вес завтрака составляет " + weightCoctailInGr + " граммов или " + weightCoctailInKg + " килограммов");

        System.out.println("Задача 7");
        int extraWeightKg = 7;
        int lostWeightPer1DayGr_1 = 250;
        int lostWeightPer1DayGr_2 = 500;
        float amountOfDaysToLostWeight_1 = extraWeightKg * 1000f / lostWeightPer1DayGr_1;
        float amountOfDaysToLostWeight_2 = extraWeightKg * 1000f / lostWeightPer1DayGr_2;
        System.out.println("Если спортсмен будет терять в день " + lostWeightPer1DayGr_1 + " граммов, то ему потребуется в среднем " + amountOfDaysToLostWeight_1 + " дней, чтобы скинуть " + extraWeightKg + " килограмм");
        System.out.println("Если спортсмен будет терять в день " + lostWeightPer1DayGr_2 + " граммов, то ему потребуется в среднем " + amountOfDaysToLostWeight_2 + " дней, чтобы скинуть " + extraWeightKg + " килограмм");
    }
}
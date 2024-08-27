public class Main {
    public static void main(String[] args) {
        //Задача №1
        byte maxByte = 126;
        short maxShort = 32767;
        int maxInt = 2147483647;
        long maxLong = 9223372036854775807L;
        float randomFloat = 23.01234F;
        double randomDouble = 22.0123456789101112;
        System.out.println("Значение переменной maxByte с типом byte равно " + maxByte);
        System.out.println("Значение переменной maxShort с типом short равно " + maxShort);
        System.out.println("Значение переменной maxInt с типом int равно " + maxInt);
        System.out.println("Значение переменной maxLong с типом long равно " + maxLong);
        System.out.println("Значение переменной randomFloat с типом float равно " + randomFloat);
        System.out.println("Значение переменной randomDouble с типом double равно " + randomDouble);
        System.out.println();

        //Задача №2
        float a = 27.12f;
        long b = 987678965549L;
        double c = 2.786;
        short d = 569;
        short e = -159;
        int f = 27897;
        byte g = 67;

        //Задача №3
        byte firstClass = 23;
        byte secondClass = 27;
        byte thirdClass = 30;
        short totalPaper = 480;
        int totalStudents = firstClass + secondClass + thirdClass;
        int paperForStudent = totalPaper / totalStudents;
        System.out.println("На каждого ученика рассчитано " + paperForStudent + " листов бумаги.");
        System.out.println();

        //Задача №4
        byte twoMinutesBottles = 16;
        int oneMinuteBottles = twoMinutesBottles / 2;
        int twentyMinutesBottles = oneMinuteBottles * 20;
        int oneHourBottles = twentyMinutesBottles * 3;
        int oneDayBottles = oneHourBottles * 24;
        int threeDaysBottles = oneDayBottles * 3;
        int oneMonthBottles = threeDaysBottles * 10;
        System.out.println("За 20 минут машина произвела " + twentyMinutesBottles + " штук бутылок.");
        System.out.println("За сутки машина произвела " + oneDayBottles + " штук бутылок.");
        System.out.println("За 3 дня машина произвела " + threeDaysBottles + " штук бутылок.");
        System.out.println("За месяц машина произвела " + oneMonthBottles + " штук бутылок.");
        System.out.println();

        //Задача №5
        byte totalCans = 120;
        byte whiteCansClassroom = 2;
        byte brownCansClassroom = 4;
        int totalCansClassroom = whiteCansClassroom + brownCansClassroom;
        int totalClassrooms = totalCans / totalCansClassroom;
        int totalWhite = whiteCansClassroom * totalClassrooms;
        int totalBrown = brownCansClassroom * totalClassrooms;
        System.out.println("В школе, где " + totalClassrooms + " классов, нужно " + totalWhite + " банок белой краски и " + totalBrown + " Банок коричневой краски.");
        System.out.println();

        //Задача №6
        byte bananas = 5;
        byte oneBananaWeight = 80;
        int totalBanana = bananas * oneBananaWeight;
        short milk = 200;
        byte onePortionMilk = 100;
        byte onePortionMilkWeight = 105;
        int numberOfPortion = milk / onePortionMilk;
        int totalMilk = onePortionMilkWeight * numberOfPortion;
        byte iceCream = 2;
        byte iceCreamWeight = 100;
        int totalIceCream = iceCream * iceCreamWeight;
        byte eggs = 4;
        byte eggsWeight = 70;
        int totalEggs = eggs * eggsWeight;
        int dinnerWeight = totalMilk + totalBanana + totalIceCream + totalEggs;
        int grPerKg = 1000;
        float weightKg = dinnerWeight / (float) grPerKg;
        System.out.println("Вес такого завтрака составляет " + dinnerWeight + " грамм или " + weightKg + " килограмм.");
        System.out.println();

        //Задача №7
       byte totalWeight = 7;
       int totalWeightGr = totalWeight * grPerKg;
       int firstRation = 250;
       int secondRation = 500;
       int firstRationDays = totalWeightGr / firstRation;
       int secondRationDays = totalWeightGr / secondRation;
       float averageRation = (float) (firstRation + secondRation) / 2;
       float averageRationDays = totalWeightGr / averageRation;
        System.out.println("Если спортсмен будет терять 250 грамм в день, то ему понадобится " + firstRationDays + " дней, чтобы сбросить 7 кг.");
        System.out.println("Если спортсмен будет терять 500 грамм в день, то ему понадобится " + secondRationDays + " дней, чтобы сбросить 7 кг.");
        System.out.println("В среднем, для того, чтобы сбросить 7 кг, спортсмену понадобится " + averageRationDays + " дней.");
        System.out.println();

        //Задача №8
        int salaryMaria = 67760;
        int salaryDenis = 83960;
        int salaryKristina = 76230;
        float increase = 0.1f;
        float newSalaryMaria = salaryMaria + salaryMaria * increase;
        float newSalaryDenis = salaryDenis + salaryDenis * increase;
        float newSalaryKristina = salaryKristina + salaryKristina * increase;
        float oldIncomeMaria = salaryMaria * 12;
        float newIncomeMaria = newSalaryMaria * 12;
        float incomeDifferenceMaria = newIncomeMaria - oldIncomeMaria;
        float oldIncomeDenis = salaryDenis * 12;
        float newIncomeDenis = newSalaryDenis * 12;
        float incomeDifferenceDenis = newIncomeDenis - oldIncomeDenis;
        float oldIncomeKristina = salaryKristina * 12;
        float newIncomeKristina = newSalaryKristina * 12;
        float incomeDifferenceKristina = newIncomeKristina - oldIncomeKristina;
        System.out.println("Мария теперь получает " + newSalaryMaria + " рублей. Годовой доход вырос на " + incomeDifferenceMaria + " рублей.");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + incomeDifferenceDenis + " рублей.");
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на " + incomeDifferenceKristina + " рублей.");














    }
}
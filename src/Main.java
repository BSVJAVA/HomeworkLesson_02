public class Main {
    public static void main(String[] args) {
        //Задача №1
        byte varByte = 127;
        short varShort = 32767;
        int varInt = -2147483648;
        long varLong = -100;
        float varFloat = 100.456789F;
        double varDouble = -327.548;
        System.out.println("Значение переменной varByte с типом byte равно " + varByte);
        System.out.println("Значение переменной varShort с типом short равно " + varShort);
        System.out.println("Значение переменной varInt с типом int равно " + varInt);
        System.out.println("Значение переменной varLong с типом long равно " + varLong);
        System.out.println("Значение переменной varFloat с типом float равно " + varFloat);
        System.out.println("Значение переменной varDouble с типом double равно " + varDouble);
        //Задача №2
        float amFloat = 27.12F;
        long amLong = 987678965549L;
        float amFloat2 = 2.786F;
        short amShort = 569;
        short amShort2 = -159;
        short amShort3 = 27897;
        byte amByte = 67;
        //Задача №3
        short studentA = 23;
        short studentB = 27;
        short studentC = 30;
        short numSheet = 480;
        int numStudent = numSheet / (studentA + studentB + studentC);
        System.out.println("На каждого ученика рассчитано " + numStudent + " листов бумаги");
        //Задача №4
        byte prodMin;      //Производительность или скорость работы машины в минуту.
        int perfMachine;   //Производительность машины за определяемое время.
        prodMin = 16 / 2;
        perfMachine = prodMin * 20;
        System.out.println("За 20 минут машина произвела " + perfMachine + " штук бутылок");
        perfMachine = prodMin * 24 * 60;
        System.out.println("За сутки машина произвела " + perfMachine + " штук бутылок");
        perfMachine = perfMachine * 3;
        System.out.println("За 3 дня машина произвела " + perfMachine + " штук бутылок");
        perfMachine = prodMin * 30 * 24 * 60;
        System.out.println("За месяц машина произвела " + perfMachine + " штук бутылок");
        //Задача №5
        int whitePot;             //Общее количество банок с белой краской
        int brownPot;             //Общее количество банок с коричневой краской
        byte quanClass;            //Общее количество классов
        quanClass = 120 / (2 + 4); //Определяем общее количество классов
        whitePot = quanClass * 2;
        brownPot = quanClass * 4;
        System.out.println("В школе, где " + quanClass + " классов, нужно " + whitePot + " банок белой краски и " + brownPot + " банок коричневой краски");
        //Задача №6
        short banan = 5 * 80;            //Масса бананов в граммах
        short milk = (200 / 100) * 105;  //Масса молока в граммах
        short iceCream = 2 * 100;        //Масса мороженого в граммах
        short egg = 4 * 70;              //Масса яиц в граммах
        float breakfast = banan + milk + iceCream + egg;   //Масса завтрака в граммах
        System.out.println("Масса завтрака в граммах - " + breakfast);
        breakfast = breakfast / 1000;    //Перевод в килограммы
        System.out.println("Масса завтрака в килограммах - " + breakfast);
        //Задача №7
        short weightLossMin = 250;   //Потеря 250 грамм в день
        short weightLossMax = 500;   //Потеря 500 грамм в день
        short weightLoss = 7 * 1000; //Суммарный вес, который нужно сбросить сппортсмену
        int days = weightLoss / weightLossMin; //Нужное количество дней для сброса массы, при 250гр/день
        System.out.println("При потере массы 250гр в день, нужно " + days + " дней для сброса 7 кг");
        days = weightLoss / weightLossMax; //Нужное количество дней для сброса массы, при 500гр/день
        System.out.println("При потере массы 500гр в день, нужно " + days + " дней для сброса 7 кг");
        float days1 = 2 * weightLoss / (weightLossMin + weightLossMax);
        System.out.println("В среднем потребуется " + days1 + " дней, чтобы сбросить 7 кг");
        //Задача №8
        int zpMonMacha = 67760;   //Зарплата Маши в месяц
        int zpMonDenis = 83690;   //Зарплата Дениса в месяц
        int zpMonKrist = 76230;   //Зарплата Кристины в месяц
        float rais = 0.1F;         //Надбавка к зарплате в долях процента
        float zpMonNew = zpMonMacha * (1 + rais); //Вычисление месячной зарплаты после прибавки
        float zpYearHei = zpMonMacha * rais * 12; //Вычисление годового прироста
        System.out.println("Маша теперь получает " + zpMonNew + " рублей в месяц. Годовой доход вырос на " + zpYearHei + " рублей");
        zpMonNew = zpMonDenis * (1 + rais); //Вычисление месячной зарплаты с учётом прибавки
        zpYearHei = zpMonDenis * rais * 12; //Вычисление годовой прибавки
        System.out.println("Денис теперь получает " + zpMonNew + " рублей в месяц. Годовой доход вырос на " + zpYearHei + " рублей");
        zpMonNew = zpMonKrist * (1 + rais); //Вычисление месячной зарплаты с учётом прибавки
        zpYearHei = zpMonKrist * rais * 12; //Вычисление годовой прибавки
        System.out.println("Кристина теперь получает " + zpMonNew + " рублей в месяц. Годовой доход вырос на " + zpYearHei + " рублей");
    }
}
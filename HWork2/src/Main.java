public class Main {
    public static void main(String[] args) {
        var Task= (" Задание1 ");
        System.out.println(Task);
        int Bananas = 500;
        System.out.println(Bananas);
        byte Apples = 100;
        System.out.println(Apples);
        short Pineapples = 300;
        System.out.println(Pineapples);
        long Oranges = 1000;
        System.out.println(Oranges);
        float Cucumbers = 200f;
        System.out.println( Cucumbers);
        double Tomatoes = 2.99;
        System.out.println(Tomatoes);

        var TaskTwo= (" Задание2 ");
        System.out.println(TaskTwo);
        float sugar = 27.12f;
        System.out.println(sugar);
       long m = 987678965549L;
        System.out.println(m);
        double salt = 2.786;
        System.out.println(salt);
       var Taks= (" false ");
        System.out.println(Taks);
        short zero = 569;
        System.out.println(zero);
        short one = -159;
        System.out.println(one);
        short two = 27897;
        System.out.println(two);
        byte free = 67;
        System.out.println(free);
        var taskFree= (" Задание3 ");
        System.out.println(taskFree);
        int lubov = 23;
        System.out.println(" в классе Людмилы Павловны "  + lubov +  " учеников ");
        byte  anna = 27;
        System.out.println(" в классе Анны Сергеевна "   + anna +   " учеников ");
        short katya = 30;
        System.out.println(" в классе Екатерины Андреевны "  + katya +  " учеников ");
        long total = (lubov + anna + katya);
        System.out.println(" Во всех классах "  + total +  " учеников ");
        short totalPaper= 480;
        System.out.println(" Бумаги всего "  + totalPaper +  " листов  на всех учеников ");
        long student = (totalPaper/total);
        System.out.println(" На каждого ученика рассчитано " + student +  " листов бумаги ");
        var taskFour= (" Задание 4 ");
        System.out.println(taskFour);
        byte bottle = 16;
        byte timeMinutes = 2;
        System.out.println(" За " + timeMinutes + " минуты машина произвела бутылок " + bottle + " штук ");
        short twoTime = 20;
        int bottleTwo = (bottle * twoTime )/timeMinutes;
        System.out.println(" За " + twoTime + " минуты машина произвела бутылок " + bottleTwo + " штук ");
        byte oneDay = 24;
        int oneDayMinutes = (oneDay*60);
        int totalOneDay = (oneDayMinutes * bottle )/2;
        System.out.println(" За " + oneDay + " часа  машина произвела бутылок " + totalOneDay + " штук ");
        byte freeDay = (3 * 24);
        long freeDayMinutes = (freeDay*60);
        float totalFreeDay = (freeDayMinutes * bottle) / timeMinutes;
        System.out.println(" За " + freeDay  + " часа  машина произвела бутылок " + totalFreeDay + " штук ");
        byte monthDay = 30;
        long oneMonth = (totalOneDay * monthDay);
        System.out.println(" За " + monthDay + " дней  машина произвела бутылок " + oneMonth + " штук ");
        var taskFive= (" Задание 5 ");
        System.out.println(taskFive);
        byte cansNeed = 120;
        byte oneClassW = 2;
        byte oneClassBrown = 4;
        int classTotal = oneClassW + oneClassBrown;
        System.out.println("Всего в школе на один класс уходит " + classTotal + " банок ");
        int schoolClass = (cansNeed / classTotal);
        int whitePaint = (schoolClass * 2 );
        int brownPaint = (schoolClass * 4);
        System.out.println("В школе, где " + classTotal + " классов, нужно " + whitePaint + " банок белой краски и " + brownPaint + " банок коричневой краски ");
        var taskSix= (" Задание 6 ");
        System.out.println(taskSix);
        short bananas = ( 5 * 80 );
        short milk = ( 2 * 105 );
        short iceCream = ( 2 * 100);
        short egg = (4 * 70);
        int cocktail = (bananas + milk + iceCream + egg);
        double gramm = 1000.0;
        double cocktailKg = (cocktail / gramm);
        System.out.println (" Общий весь коктеля у спортсмена составляет "+ cocktailKg + " кг!" );
        var taskSeven= (" Задание 7 ");
        System.out.println(taskSeven);
        byte loseWeightKg = 7;
        short loseWeightGr = 7000;
        short weightMinGr = 250;
        short weightMaxGr = 500;
        float average = (weightMaxGr + weightMinGr)/2;
        int dayMin = (loseWeightGr/weightMinGr);
        System.out.println("Если спортсмен бутет терять в весе " + weightMinGr + " грамм, то ему понадобиться " + dayMin + " дней " );
         int dayMax = (loseWeightGr / weightMaxGr );
        System.out.println("Если спортсмен бутет терять в весе " + weightMaxGr + " грамм, то ему понадобиться " + dayMax + " дней " );
        float dayAverage = (loseWeightGr / average);
        System.out.println ( "В среднем спортсмет теряет " + average + " грамм в день, значит ему в среднем ему понадобиться " + dayAverage + " дней " );
        var taskEight= (" Задание 8 ");
        System.out.println(taskEight);
        int mashaIncome = 67760;
        double allowance = 0.1;
        double incomeNewMasha = (mashaIncome * allowance) + mashaIncome;
        double differenceMasha = (incomeNewMasha  - mashaIncome);
        System.out.println("Маша теперь получает " + incomeNewMasha + " рублей.Годовой доход вырос на " + differenceMasha +" рублей");
        int denisIncome = 83690;
        double incomeNewDenis = (denisIncome * 0.1)+denisIncome;
        double differenceDenis = (incomeNewDenis - denisIncome );
        System.out.println("Денис теперь получает " + incomeNewDenis + " рублей.Годовой доход вырос на " + differenceDenis + " рублей");
        int kristinaIncome = 76230;
        int incomeNewKristina = (kristinaIncome / 10 ) + kristinaIncome;
        int difference = (incomeNewKristina - kristinaIncome );
        System.out.println("Кристина теперь получает " + incomeNewKristina + " рублей.Годовой доход вырос на " + difference + " рублей");
























































    }
}
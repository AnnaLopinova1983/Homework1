public class Main {
    public static void main(String[] args) {
       var FirstFighter = 78.2;
       var SecondFighter = 82.7;
       var TotalWeight = FirstFighter + SecondFighter;
        System.out.println("Ощий вес двух бойцов " + TotalWeight + "кг");
        var DifferenceScales = SecondFighter - FirstFighter;
        System.out.println("Разница между весами бойцов " + DifferenceScales + "кг");
        var DifferenceBetween = (TotalWeight + DifferenceScales) % TotalWeight;
        System.out.println("Второй боец тяжелее первого на " + DifferenceBetween + "кг");

        var Hour = 640;
        var WorkerWorks = 8;
        var AllEmployees = (Hour / WorkerWorks  );
        System.out.println("Всего работников в компании " + AllEmployees +  " человек ");
        var AddedWorkers = 94;
        var BecameWorkers = AllEmployees + AddedWorkers;
        System.out.println("Всего стало работников в компании " + BecameWorkers +  " человек ");
         var Decision = BecameWorkers * WorkerWorks;
        System.out.println("Если в компании работает " + BecameWorkers +  " человек, то всего " + Decision + " часов работы может быть поделено между сотрудниками" );












    }
}
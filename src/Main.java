public class Main {
    public static void main(String[] args) {
        System.out.println("Типы Переменных");
        System.out.println("-------");
        System.out.println("Задача №1");
        int apple = 102364;
        byte orange = 84;
        short pine = 17236;
        long birch = 3152348765L;
        float weight = 2.298F;
        double height = 1.45454212454;
        System.out.println("Значение переменной apple с типом int равно " + apple);
        System.out.println("Значение переменной orange с типом byte равно " + orange);
        System.out.println("Значение переменной pine с типом short равно " + pine);
        System.out.println("Значение переменной birch с типом long равно " + birch);
        System.out.println("Значение переменной weight с типом float равно " + weight);
        System.out.println("Значение переменной height с типом double равно " + height);
        System.out.println("-------");
        System.out.println("Задача №2");
        float a = 27.12f;
        long b = 987678965549L;
        double c = 2.786;
        short d = 569;
        short e = -159;
        int f = 27897;
        byte g = 67;
        System.out.println("Значение переменной a с типом float равно " + a);
        System.out.println("Значение переменной b с типом long равно " + b);
        System.out.println("Значение переменной c с типом double равно " + c);
        System.out.println("Значение переменной d с типом short равно " + d);
        System.out.println("Значение переменной e с типом short равно " + e);
        System.out.println("Значение переменной f с типом int равно " + f);
        System.out.println("Значение переменной g с типом byte равно " + g);
        System.out.println("-------");
        System.out.println("Задача №3");
        byte studLp = 23;
        byte studAs = 27;
        byte studEa = 30;
        System.out.println("Людмила Павловна - " + studLp + " ученика");
        System.out.println("Анна Сергеевна - " + studAs + " учеников");
        System.out.println("Екатерина Андреевна - " + studEa + " учеников");
        short totalPaper = 480;
        System.out.println("Закуплено на всех " + totalPaper + " листов бумаги");
        int studPaper = totalPaper / (studLp + studAs + studEa);
        System.out.println("На каждого ученика рассчитано " + studPaper + " листов бумаги");
    }
}
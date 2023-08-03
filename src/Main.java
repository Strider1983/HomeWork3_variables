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
        System.out.println("-------");
        System.out.println("Задача №4");
        byte bottles = 16;
        byte time = 2;
        System.out.println("Производительность машины для изготовления бутылок - " + bottles + " бутылок за " + time + " минуты");
        int time20 = bottles / time * 20;
        int timeDay = bottles / time * 60 * 24;
        int time3Day = bottles / time * 60 * 24 * 3;
        int timeMonth = bottles / time * 60 * 24 * 30;
        System.out.println("За 20 минут машина произвела " + time20 + " штук бутылок");
        System.out.println("За сутки машина произвела " + timeDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + time3Day + " штук бутылок");
        System.out.println("За месяц машина произвела " + timeMonth + " штук бутылок");

        System.out.println("-------");
        System.out.println("Задача №5");
        byte totalPots = 120;
        System.out.println("Всего необходимо " + totalPots + " банок краски");
        byte potWhite = 2;
        byte potBrown = 4;
        System.out.println("На каждый кабинет уйдет " + potWhite + " банки белой краски и " + potBrown + " банки коричневой краски");
        int cabins = totalPots / (potWhite + potBrown);
        int potsWhite = potWhite * cabins;
        int potsBrown = potBrown * cabins;
        System.out.println("В школе, где " + cabins + " классов, нужно " + potsWhite + " банок белой краски и " + potsBrown + " банок коричневой краски");

        System.out.println("-------");
        System.out.println("Задача №6");
        byte bananas = 5;
        int bananaWeight = bananas * 80;
        short milk = 200;
        int milkWeight = milk / 100 * 105;
        byte icecream = 2;
        int icecreamWeight = icecream * 100;
        byte eggs = 4;
        int eggWeight = eggs * 70;
        int totalWeight = bananaWeight + milkWeight + icecreamWeight + eggWeight;
        float totalWeightK = totalWeight / 1000F;
        System.out.println("Рецепт спортзавтрака:");
        System.out.println("Бананы - " + bananas + "шт., вес " + bananaWeight + " грамм");
        System.out.println("Молоко - " + milk + "мл., вес " + milkWeight + " грамм");
        System.out.println("Мороженое-пломбир - " + icecream + "брикета., вес " + icecreamWeight + " грамм");
        System.out.println("Яйца сырые - " + eggs + "шт., вес " + eggWeight + " грамм");
        System.out.println("Вес спортзавтрака - " + totalWeight + " грамм");
        System.out.println("Вес спортзавтрака - " + totalWeightK + " килограмм");

    }
}
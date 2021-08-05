package Lesson_HW;

public class Start {
    public static void main(String[] args) {

        Animal[] animals = {
                new Cat("Василий", 500),
                new Cat("Варвара", 80),
                new Cat("Анфиса", 200),
                new Dog("Дава", 280, 9),
                new Dog("Финик", 150, 7)
        };

        int [] dist_Value_Run = {250, 600, 400, 120};
        int [] dist_Value_Swim = {12, 4, 9, 1};

        for (int i = 0; i < animals.length; i++) {
            for (int j = 0; j < dist_Value_Run.length; j++){
            System.out.println(animals[i].run(dist_Value_Run[j]));
            System.out.println(animals[i].swim(dist_Value_Swim[j]));
        }
    }
}
}



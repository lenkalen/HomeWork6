package Lesson_HW;

public class Cat extends Animal {

    public Cat(String name, int maxDist_To_Run) {
//        Вызываю конструктор родителя
        super("Кот", name, maxDist_To_Run, 0);
    }


    @Override
    protected String swim(int dist_To_Swim) {
        return this.type + " " + this.name + " проплыл " + this.getmaxDist_To_Swim() + " метров" + ", " +
                "потому что не умеет плавать, " + "так как он " + this.type;
    }
}


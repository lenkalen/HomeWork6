package Lesson_HW;

public class Animal {
    protected String type; // Тип животного
    protected String name; // Кличка животного
    private int maxDist_To_Run; //max забег i- го объекта
    private int maxDist_To_Swim;//max заплыв i- го объекта

    Animal(String type, String name, int maxDist_To_Run, int maxDist_To_Swim) {
        this.type = type;
        this.name = name;
        this.maxDist_To_Run = maxDist_To_Run;
        this.maxDist_To_Swim = maxDist_To_Swim;
    }

    String getType() {
        return this.type;
    }
    String getName() {
        return this.name;
    }
    int getmaxDist_To_Run() {
        return this.maxDist_To_Run;
    }
    int getmaxDist_To_Swim() {
        return this.maxDist_To_Swim;
    }

    protected String run(int dist_To_Run) {
        int dist_checked = max_dist(this.maxDist_To_Run, dist_To_Run);
        return this.type + " " + this.name + " пробежал " + dist_checked + " метров";
    }

    protected String swim(int dist_To_Swim) {
        int dist_checked = max_dist(this.maxDist_To_Swim, dist_To_Swim);
        return this.type + " " + this.name + " проплыл " + dist_checked + " метров";
        }

    private int max_dist(int animal_dist, int proposed_dist) {
        if (animal_dist > proposed_dist) {
            return proposed_dist;
        }
        else {
            return animal_dist;
        }
    }
}

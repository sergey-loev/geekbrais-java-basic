package geekbrains.basic.lesson6;

public abstract class Animal {

    private String Name;
    private static int animalCount;
    private static int dogCount;
    private static int catCount;

    public Animal(String Name){
        this.Name = Name;
        animalCount++;
    }

    public abstract void run(int distance);
    public abstract void swim(int distance);

    public abstract String getName();

    public static int getAnimalCount() { return animalCount; }
    public static int getDogCount() { return dogCount; }
    public static int getCatCount() { return catCount;}

    public static void addDogCount() { dogCount++; }
    public static void addCatCount() { catCount++;}

}

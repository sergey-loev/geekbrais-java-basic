package geekbrains.basic.lesson6;

public abstract class Animal {

    private String Name;

    public Animal(String Name){
        this.Name= Name;
    }

    public abstract void run(int distance);
    public abstract void swim(int distance);

    public String getName() {
        return Name;
    }
}

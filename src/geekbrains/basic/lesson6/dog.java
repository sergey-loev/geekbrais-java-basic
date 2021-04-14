package geekbrains.basic.lesson6;

public class dog extends Animal{

    private String Name;
    private final int maxRanDistance = 500;
    private final int maxRSwimDistance = 10;

    public dog(String Name){
        super(Name);
        super.addDogCount();
        this.Name = Name;
    }
    @Override
    public void run(int distance) {
        if (distance <= maxRanDistance)
            System.out.printf("%s пробежал %d м.\n", this.Name, distance);
        else
            System.out.printf("%s пробежал %d м. и устал.\n", this.Name, maxRanDistance);
    }
    @Override
    public void swim(int distance) {
        if(distance<=maxRSwimDistance)
            System.out.printf("%s проплыл %d м.\n", this.Name, distance);
        else
            System.out.printf("%s проплыл %d м. и устал.\n", this.Name, maxRSwimDistance);

    }

    @Override
    public String getName() {
        return this.Name;
    }
}

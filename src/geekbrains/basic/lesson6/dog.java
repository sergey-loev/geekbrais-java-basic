package geekbrains.basic.lesson6;

public class dog extends Animal{
    private int maxRanDistance;
    private int maxRSwimDistance;

    public dog(String Name){
        super(Name);
        maxRanDistance=500;
        maxRSwimDistance=10;
    }
    @Override
    public void run(int distance) {
        if (distance <= maxRanDistance)
            System.out.printf("%s пробежал %d м.\n", super.getName(), distance);
        else
            System.out.printf("%s пробежал %d м. и устал.\n", super.getName(), maxRanDistance);
    }
    @Override
    public void swim(int distance) {
        if(distance<=maxRSwimDistance)
            System.out.printf("%s проплыл %d м.\n", super.getName(), distance);
        else
            System.out.printf("%s проплыл %d м. и устал.\n", super.getName(), maxRSwimDistance);

    }


}

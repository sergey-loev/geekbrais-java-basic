package geekbrains.basic.lesson6;

import javax.naming.Name;

public class cat extends Animal {

    private String Name;
    private final int maxRanDistance = 200;
    private final int maxRSwimDistance = 0;

    public cat(String Name){
        super(Name);
        super.addCatCount();
        this.Name = Name;
    }

    @Override
    public void run(int distance) {
        if (distance <= maxRanDistance)
            System.out.printf("%s пробежал %d м.\n", this.Name, distance);
        else
            System.out.printf("%s пробежал %d м. и устал.\n",  this.Name, maxRanDistance);
    }
    @Override
    public void swim(int distance) {
        if(distance <= maxRSwimDistance && maxRSwimDistance > 0)
            System.out.printf("%s проплыл %d м.\n",  this.Name, distance);//на тот случай если коту все таки придется когда то проплыть несколько метров
        else if(maxRSwimDistance != 0)
            System.out.printf("%s проплыл %d м. и устал.\n",  this.Name, maxRSwimDistance);//проверим тот ли это случай
        else
            System.out.printf("%s не любит плавать.\n",  this.Name);
    }
    @Override
    public String getName() { return this.Name;}
}

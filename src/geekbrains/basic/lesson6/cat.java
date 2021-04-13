package geekbrains.basic.lesson6;

import javax.naming.Name;

public class cat extends Animal {
    private int maxRanDistance;
    private int maxRSwimDistance;

    public cat(String Name){
        super(Name);
        maxRanDistance=200;
        maxRSwimDistance=0;
    }

    @Override
    public void run(int distance) {
        if (distance <= maxRanDistance)
            System.out.printf("%s пробежал %d м.\n", super.getName(), distance);
        else
            System.out.printf("%s пробежал %d м. и устал.\n",  super.getName(), maxRanDistance);
    }
    @Override
    public void swim(int distance) {
        if(distance<=maxRSwimDistance)
            System.out.printf("%s проплыл %d м.\n",  super.getName(), distance);//на тот случай если коту все таки придется когда то проплыть несколько метров
        else if(maxRSwimDistance != 0)
            System.out.printf("%s проплыл %d м. и устал.\n",  super.getName(), maxRSwimDistance);//проверим тот ли это случай
        else
            System.out.printf("%s не любит плавать.\n",  super.getName());
    }

}

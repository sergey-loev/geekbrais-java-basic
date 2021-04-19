package com.company;

public class Cat {
    private boolean isFed;

    public void eat(Plate plate){
        isFed = plate.decrease(6);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "isFed=" + isFed +
                '}';
    }
}

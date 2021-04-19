package com.company;

public class Plate {
    private final int capacity = 15;
    private int size = capacity;

    public boolean decrease(int request){
        if(request <= size){
            size -= request;
            return true;
        }
        return false;
    }
    public void add(){
        addFull();
    }
    public void add(int income){
        int tmpSize = income + size;

        if(tmpSize >= capacity) addFull();
        else size = tmpSize;
    }

    private void addFull(){
        size = capacity;
    }


    @Override
    public String toString() {
        return "Plate{" +
                "capacity=" + capacity +
                ", size=" + size +
                '}';
    }
}

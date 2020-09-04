package com.example.counter;

public class Counter {
    int value;

    public Counter(int value) {
        this.value = value;
    }

    public Counter(){

    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    public void reset(){
        value = 0;
    }
    public void increment(){
        value++;
    }
    public void increaseRandomNum()
    {
        value += Math.random() * 100 + 1;
    }
}

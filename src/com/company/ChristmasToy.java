package com.company;

import java.util.Objects;

public class ChristmasToy {
    private int size;
    private String color;

    public ChristmasToy(int size,String color){
        this.size=size;
        this.color=color;
    }
    public static ChristmasToy creatToy(int size,String color){
        ChristmasToy toy = new ChristmasToy(size,color);
        return toy;
    }



    //----------------------------------------
    public int getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }
    //----------------------------------------
    public void setSize(int size) {
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChristmasToy toy = (ChristmasToy) o;
        return size == toy.size &&
                Objects.equals(color, toy.color);
    }

    @Override
    public int hashCode() {

        return Objects.hash(size, color);
    }

    @Override
    public String toString() {
        return "ChristmasToy{" +
                "size=" + size +
                ", color='" + color + '\'' +
                '}';
    }
}

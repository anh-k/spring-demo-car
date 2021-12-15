package fr.anh.springdemo.config.model;

import org.springframework.stereotype.Component;

@Component
public abstract class Vehicle {
    private ColorEnum color;
    private float weight;

    public Vehicle() {

    }

    public Vehicle(ColorEnum color, float weight) {
        this.color = color;
        this.weight = weight;
    }

    public ColorEnum getColor() {
        return color;
    }

    public void setColor(ColorEnum color) {
        this.color = color;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "color=" + color +
                ", weight=" + weight +
                '}';
    }
}

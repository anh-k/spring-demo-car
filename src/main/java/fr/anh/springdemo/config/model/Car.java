package fr.anh.springdemo.config.model;

import org.springframework.stereotype.Component;

@Component
public class Car extends Vehicle {

    private String brand;

    public Car() {

    }

    public Car(ColorEnum color, float weight, String brand) {
        super(color, weight);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

}

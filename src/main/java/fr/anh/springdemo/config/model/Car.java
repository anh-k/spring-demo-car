package fr.anh.springdemo.config.model;

import org.springframework.context.annotation.Bean;
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

    @Bean
    public ColorEnum color() {
        return ColorEnum.BLUE;
    }

    @Bean
    public Float weight() {
        return 2402984F;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

}

package fr.anh.springdemo.config;

import fr.anh.springdemo.config.model.Car;
import fr.anh.springdemo.config.model.ColorEnum;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("fr.anh.springdemo")
public class AppConfig {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Car car = context.getBean(Car.class);
        car.setBrand("Tesla");
        StringBuilder carStringBuilder = new StringBuilder();
        carStringBuilder
                .append("[CAR] ")
                .append("brand: " + car.getBrand())
                .append(", color: " + car.color())
        .append(", weight: " + car.weight());

        System.out.println(carStringBuilder);
    }
}

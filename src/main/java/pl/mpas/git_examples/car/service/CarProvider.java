package pl.mpas.git_examples.car.service;

import pl.mpas.git_examples.car.model.Car;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class CarProvider {

    public static List<Car> getMyCars() {
        return Arrays.asList(
                new Car("Skoda", "Fabia", "czerwony", new BigDecimal(100000), 2000),
                new Car("Hyundai", "Tukson", "czarny", new BigDecimal(231231), 5000),
                new Car("Hyundai", "Elantra", "bialy", new BigDecimal(20000), 3000),
                new Car("BMW", "E20", "czerwony", new BigDecimal(300000), 1000),
                new Car("Opel", "Astra", "niebieski", new BigDecimal(40000), 2000)
        );
    }



}

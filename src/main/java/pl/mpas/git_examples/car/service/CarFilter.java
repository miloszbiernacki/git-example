package pl.mpas.git_examples.car.service;

import pl.mpas.git_examples.car.model.Car;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CarFilter {

    static  public List<Car> findcarsofcolor(List<Car> cars, String colors) {
        List<Car> result = new ArrayList<>();
        for(Car car:cars)
        {
            if(car.getColor().equals(colors));
            result.add(car);
        }
        return result;
}

    static public List<Car> findcarsofcolorJava8(List<Car> cars, String colors) {


  return  cars.stream()
            .filter(car -> car.getColor().equals(colors))
            .collect(Collectors.toList());

     //   return Collections.emptyList();
}

    static public List<Car> findcarsofengine(List<Car> cars, int engine, BigDecimal price) {


        return  cars.stream()
                .filter(car -> car.getEngine()>= engine )
                .filter(car -> car.getPrice().compareTo(price) < 0 )
                .collect(Collectors.toList());

        //   return Collections.emptyList();
    }

   static public List<Car> filtercars(List<Car> cars, Predicate<Car> myfilter) {

        return cars.stream()
                .filter(myfilter)
                .collect(Collectors.toList());
    }


    public static void main(String[] args) {
        filtercars(CarProvider.getMyCars(),car -> car.getBrand().equals("Skoda"))
                .forEach(car -> System.out.println(car));


    }

}

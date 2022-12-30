package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService{

    List<Car> cars = new ArrayList<>();
    {
        cars.add(new Car(140, 800, "car1"));
        cars.add(new Car(180, 1000, "car2"));
        cars.add(new Car(120, 700, "car3"));
        cars.add(new Car(160, 900, "car4"));
        cars.add(new Car(200, 1200, "car5"));
    }

    @Override
    public List<Car> carList(int num) {
        return cars.stream().limit(num).toList();
    }
}
package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {

    private final List<Car> cars =
            List.of(new Car("BMW", "525", 20),
                    new Car("Mercedes", "S-Class", 15),
                    new Car("Cherry", "Tiggo", 10),
                    new Car("Audi", "A8", 5),
                    new Car("Toyota", "Camry", 65));

    @Override
    public List<Car> getCars(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());


    }
}

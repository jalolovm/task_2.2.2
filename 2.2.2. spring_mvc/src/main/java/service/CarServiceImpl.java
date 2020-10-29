package service;

import Model.Car;

import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {
    @Override
    public List<Car> limit(List<Car> list1, int limit) {
        return list1.stream()
                .limit(limit)
                .collect(Collectors.toList());
    }
}

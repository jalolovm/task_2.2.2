package service;

import Model.Car;

import java.util.List;

public interface CarService {
    public List<Car> limit(List<Car> list1, int limit);
}

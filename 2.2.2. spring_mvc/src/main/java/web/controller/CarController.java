package web.controller;

import Model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    CarServiceImpl carService = new CarServiceImpl();

    @GetMapping("/cars")
    public String getCars(@RequestParam(value = "count" , defaultValue = "5") int count, Model model) {
        Car car1 = new Car("Skoda Rapid", 2020, "G 526 AF");
        Car car2 = new Car("Lada Largus", 2017, "I 627 LC");
        Car car3 = new Car("Volkswagen Polo", 2018, "A 335 FM");
        Car car4 = new Car("Nissan Qashqai", 2015, "D 731 PQ");
        Car car5 = new Car("Toyota Corolla", 2017, "O 961 MG");

        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);

        model.addAttribute("carsTable", carService.limit(cars, count));

        return "cars";
    }
}

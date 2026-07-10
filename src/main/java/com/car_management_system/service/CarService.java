package com.car_management_system.service;

import com.car_management_system.entity.Car;

import java.util.List;

public interface CarService {
    Car saveCar(Car car);
    List<Car>getAllCars();
    Car getCarById(Long id);
    Car updateCar(Long id,Car car);
    void deleteCar(Long id);
}

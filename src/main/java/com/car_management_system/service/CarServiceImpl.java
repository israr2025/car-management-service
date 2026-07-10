package com.car_management_system.service;

import com.car_management_system.entity.Car;
import com.car_management_system.repository.CarRepository;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;


@Service
public class CarServiceImpl implements CarService{

    private static final Logger logger =LoggerFactory.getLogger(CarServiceImpl.class);


    private final CarRepository carRepository;

    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }
    @Override
    public Car saveCar(Car car){
        logger.info("Saving new car:{}",car.getBrand());
        return carRepository.save(car);
    }

    @Override
    public List<Car> getAllCars() {
        logger.info("Fetching all cars");
        return carRepository.findAll();
    }

    @Override
    public Car getCarById(Long id) {
       logger.info("Searching car with id {}",id);
       return carRepository.findById(id)
               .orElseThrow(() ->{
                   logger.error("Car not found with id{},id");
                   return new RuntimeException("Car not found with id"+id);
               });
    }

    @Override
    public Car updateCar(Long id, Car car) {
        return null;
    }

    @Override
    public void deleteCar(Long id) {

    }
}

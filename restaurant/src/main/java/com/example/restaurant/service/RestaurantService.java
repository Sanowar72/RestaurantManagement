package com.example.restaurant.service;

import com.example.restaurant.model.Restautant;
import com.example.restaurant.repository.RestaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {
    @Autowired
    RestaurantRepo restaurantRepo;

    public List<Restautant> getAll() {
       return restaurantRepo.getAll();
    }

    public void AddAll(List<Restautant> restautants) {
        restaurantRepo.AddAll(restautants);
    }

    public void deleteById(int id) {
        restaurantRepo.deleteById(id);
    }

    public void updateById(int id, String specialization) {
        restaurantRepo.updateById(id,specialization);
    }

    public Restautant getById(int id) {
        return restaurantRepo.getById(id);
    }
}

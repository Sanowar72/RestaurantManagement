package com.example.restaurant.controller;

import com.example.restaurant.model.Restautant;
import com.example.restaurant.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestaurantController {
    @Autowired
    RestaurantService restaurantService;

    @GetMapping("alllist")
    public List<Restautant> getAll(){
        return restaurantService.getAll();
    }

    @GetMapping("{id}")
    public Restautant getById(@PathVariable int id){
        return restaurantService.getById(id);
    }

    @PostMapping("restaurants")
    public String AddAll(@RequestBody List<Restautant> restautants){
        restaurantService.AddAll(restautants);
        return "restaurants added...";
    }

    @PutMapping("{id}/{specialization}")
    public String updateById(@PathVariable int id,@PathVariable String specialization){
        restaurantService.updateById(id,specialization);
        return "seccessfully updated....";
    }
    @DeleteMapping("{id}")
    public String deleteById(@PathVariable int id){
        restaurantService.deleteById(id);
        return "restaurants deleted ....";
    }
}

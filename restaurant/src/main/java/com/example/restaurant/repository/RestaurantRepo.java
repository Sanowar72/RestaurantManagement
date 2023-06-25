package com.example.restaurant.repository;

import com.example.restaurant.RestaurantApplication;
import com.example.restaurant.model.Restautant;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RestaurantRepo {
    List<Restautant> restautantList=new ArrayList<>();
    public RestaurantRepo(){
        restautantList.add(new Restautant(0,"sonu's Kitchen","banglore",22,"korma"));
    }

    public List<Restautant> getAll() {
        return restautantList;
    }

    public void AddAll(List<Restautant> restautants) {
        restautantList.addAll(restautants);
    }

    public List<Restautant> deleteById(int id) {
        boolean found = false;
        for (Restautant ele : restautantList) {
            if (ele.getRestaurantId() == id) {
                restautantList.remove(ele);
                found = true;
                break;
            }
        }

        if (!found) {
            throw new IllegalArgumentException("Restaurant with ID " + id + " not found.");
        }

        return restautantList;
    }

    public void updateById(int id, String specialization) {
        boolean found = false;
        for (Restautant ele : restautantList) {
            if (ele.getRestaurantId() == id) {
                ele.setRestaurantSpecialization(specialization);
                found = true;
                break;
            }
        }

        if (!found) {
            throw new IllegalArgumentException("Restaurant with ID " + id + " not found.");
        }
    }

    public Restautant getById(int id) {
        boolean found = false;
        for (Restautant ele : restautantList) {
            if (ele.getRestaurantId() == id) {
                found = true;
                return ele;
            }
        }

        if (!found) {
            throw new IllegalArgumentException("Restaurant with ID " + id + " not found.");
        }
        return null;
    }
}

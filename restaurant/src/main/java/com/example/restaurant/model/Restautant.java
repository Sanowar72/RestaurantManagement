package com.example.restaurant.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Restautant {
    private int restaurantId;
    private String restaurantName;
    private String restaurantAddress;
    private int restaurantStaff;
    private String restaurantSpecialization;
}

package com.metr.api.controllers;

import com.metr.api.models.Customer;
import com.metr.api.models.Location;
import com.metr.api.services.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LocationController {

    @Autowired
    private LocationService locationService;

    @RequestMapping(value = "/location/{id}", method = RequestMethod.GET)
    public Location getLocationById(@PathVariable Long id){
        return null;
    }

    @RequestMapping(value = "/locations", method = RequestMethod.GET)
    public List<Location> getAllLocations(){
        return null;
    }

    public List<Location> getNearestAvailableLocations(Location location){
        return null;
    }

    public List<Location> getPastLocationHistory(){
        return null;
    }

    public void createLocation(Location location){

    }

    public void updateLocation(Location location){

    }

    public void deactivateLocation(Location location){

    }

    public void activateLocation(Location location){

    }




}

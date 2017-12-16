package com.metr.api.controllers;

import com.metr.api.models.*;
import com.metr.api.services.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@RestController
public class LocationController {

    @Autowired
    private LocationService locationService;

    @RequestMapping(value = "/location/{locationId}", method = RequestMethod.GET)
    public LocationDetails getLocationById(@PathVariable Long locationId){
        return locationService.getLocationDetailsById(locationId);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/locations", method = RequestMethod.GET)
    public List<Location> getAllLocations(){

        return locationService.getAllLocations();
    }

    @RequestMapping(value = "/location/availability", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public List<LocationResponse> getNearestAvailableLocations(@RequestBody LocationRequest locationRequest){
        return locationService.getLocationsWithSearchCriteria(locationRequest);
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

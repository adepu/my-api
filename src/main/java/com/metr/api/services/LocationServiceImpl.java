package com.metr.api.services;

import com.metr.api.models.Location;
import com.metr.api.repositories.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class LocationServiceImpl implements LocationService {

    private LocationRepository locationRepository;

    public LocationServiceImpl(@Autowired LocationRepository locationRepository){
        this.locationRepository = locationRepository;
    }

    @Override
    public List<Location> getAllLocations() {
        return locationRepository.getAllLocations();
    }

    @Override
    public List<Location> getLocationsWithSearchCriteria(LocalDate reservationStartDate, LocalDate reservationEndDate, Location location) {
        return null;
    }

    @Override
    public Location createLocation(Location location) {
        return null;
    }

    @Override
    public Location updateLocation(Location location) {
        return null;
    }

    @Override
    public Location deactivateLocation(Location location) {
        return null;
    }

    @Override
    public Location activateLocation(Location location) {
        return null;
    }
}

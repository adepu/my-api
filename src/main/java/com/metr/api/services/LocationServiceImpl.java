package com.metr.api.services;

import com.metr.api.models.Location;
import com.metr.api.models.LocationDetails;
import com.metr.api.models.LocationRequest;
import com.metr.api.models.LocationResponse;
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
    public List<LocationResponse> getLocationsWithSearchCriteria(LocationRequest locationRequest) {
        return locationRepository.getLocationsWithSearchCriteria(locationRequest);
    }

    @Override
    public LocationDetails getLocationDetailsById(Long locationId) {
        return locationRepository.getLocationDetailsById(locationId);
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

package com.metr.api.services;

import com.metr.api.models.Location;

import java.time.LocalDate;
import java.util.List;

public interface LocationService {

    List<Location> getAllLocations();

    List<Location> getLocationsWithSearchCriteria(LocalDate reservationStartDate, LocalDate reservationEndDate, Location location);

    Location createLocation(Location location);

    Location updateLocation(Location location);

    Location deactivateLocation(Location location);

    Location activateLocation(Location location);

}

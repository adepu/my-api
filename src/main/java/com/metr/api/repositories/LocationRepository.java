package com.metr.api.repositories;

import com.metr.api.models.Location;

import java.time.LocalDate;
import java.util.List;

public interface LocationRepository {

    List<Location> getAllLocations();

    List<Location> getLocationsWithSearchCriteria(LocalDate reservationStartDate, LocalDate reservationEndDate, Location location);

    Location createLocation(Location location);

    Location updateLocation(Location location);

    Location deactivateLocation(Location location);

    Location activateLocation(Location location);
}

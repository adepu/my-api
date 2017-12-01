package com.metr.api.repositories;

import com.metr.api.models.Location;
import com.metr.api.models.LocationDetails;
import com.metr.api.models.LocationRequest;
import com.metr.api.models.LocationResponse;

import java.time.LocalDate;
import java.util.List;

public interface LocationRepository {

    List<Location> getAllLocations();

    List<LocationResponse> getLocationsWithSearchCriteria(LocationRequest locationRequest);

    LocationDetails getLocationDetailsById(Long locationId);

    Location createLocation(Location location);

    Location updateLocation(Location location);

    Location deactivateLocation(Location location);

    Location activateLocation(Location location);
}

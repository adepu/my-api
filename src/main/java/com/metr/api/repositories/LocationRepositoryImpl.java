package com.metr.api.repositories;

import com.metr.api.models.Location;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Repository
public class LocationRepositoryImpl implements LocationRepository {

    private static final String GET_AVAILABLE_LOCATIONS = "";

    @Override
    public List<Location> getAllLocations() {
        return getLocations();
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

    private List<Location> getLocations() {

        List<Location> locations = new ArrayList<>();

        Location location1 = new Location();
        Location location2 = new Location();
        Location location3 = new Location();
        Location location4 = new Location();

        location1.setLatitude(40.755125);
        location1.setLongitude(-73.981349);

        location2.setLatitude(40.753223);
        location2.setLongitude(-73.9807);

        location3.setLatitude(40.752894);
        location3.setLongitude(-73.984063);

        location4.setLatitude(40.75469);
        location4.setLongitude(-73.985474);

        locations.add(location1);
        locations.add(location2);
        locations.add(location3);
        locations.add(location4);

        return locations;
    }


}

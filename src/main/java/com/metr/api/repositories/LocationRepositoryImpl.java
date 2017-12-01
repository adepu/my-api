package com.metr.api.repositories;

import com.metr.api.models.Location;
import com.metr.api.models.LocationDetails;
import com.metr.api.models.LocationRequest;
import com.metr.api.models.LocationResponse;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
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
    public List<LocationResponse> getLocationsWithSearchCriteria(LocationRequest locationRequest) {
        return getLocationResponses();
    }

    @Override
    public LocationDetails getLocationDetailsById(Long locationId) {
        return getLocationDetails(locationId);
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

    private List<LocationResponse> getLocationResponses(){
        List<LocationResponse> locationResponseList = new ArrayList<>();

        LocationResponse locationResponse1 = new LocationResponse();
        LocationResponse locationResponse2 = new LocationResponse();
        LocationResponse locationResponse3 = new LocationResponse();
        LocationResponse locationResponse4 = new LocationResponse();

        locationResponse1.setLatitude(40.755125);
        locationResponse1.setLongitude(-73.981349);
        locationResponse1.setLocationId(1l);
        locationResponse1.setLocationTitle("Princeton Club of New York");
        locationResponse1.setLocationPrice(new BigDecimal(12.00));
        locationResponse1.setLocationRating(4.5);
        locationResponse1.setLocationDescription("Princeton Club of New York");

        locationResponse2.setLatitude(40.753223);
        locationResponse2.setLongitude(-73.9807);
        locationResponse2.setLocationId(2l);
        locationResponse2.setLocationTitle("Pilates on Fifth");
        locationResponse2.setLocationPrice(new BigDecimal(13.00));
        locationResponse2.setLocationRating(4.7);
        locationResponse2.setLocationDescription("Pilates on Fifth");

        locationResponse3.setLatitude(40.752894);
        locationResponse3.setLongitude(-73.984063);
        locationResponse3.setLocationId(3l);
        locationResponse3.setLocationTitle("Koi Bryant Park");
        locationResponse3.setLocationPrice(new BigDecimal(14.00));
        locationResponse3.setLocationRating(4.2);
        locationResponse3.setLocationDescription("Koi Bryant Park");

        locationResponse4.setLatitude(40.75469);
        locationResponse4.setLongitude(-73.985474);
        locationResponse4.setLocationId(4l);
        locationResponse4.setLocationTitle("Juice Press");
        locationResponse4.setLocationPrice(new BigDecimal(15.00));
        locationResponse4.setLocationRating(4.9);
        locationResponse4.setLocationDescription("Juice Press");

        locationResponseList.add(locationResponse1);
        locationResponseList.add(locationResponse2);
        locationResponseList.add(locationResponse3);
        locationResponseList.add(locationResponse4);

        return locationResponseList;
    }

    private LocationDetails getLocationDetails(Long locationId){

        List<LocationDetails> locationDetailsList = new ArrayList<>();

        Location location1 = new Location();
        Location location2 = new Location();
        Location location3 = new Location();
        Location location4 = new Location();

        location1.setLatitude(40.755125);
        location1.setLongitude(-73.981349);
        location1.setLocationId(1l);
        location1.setOwnerId(1l);

        location2.setLatitude(40.753223);
        location2.setLongitude(-73.9807);
        location2.setLocationId(2l);
        location2.setOwnerId(2l);

        location3.setLatitude(40.752894);
        location3.setLongitude(-73.984063);
        location3.setLocationId(3l);
        location3.setOwnerId(3l);

        location4.setLatitude(40.75469);
        location4.setLongitude(-73.985474);
        location4.setLocationId(4l);
        location4.setOwnerId(4l);

        LocationDetails locationDetails1 = new LocationDetails();
        LocationDetails locationDetails2 = new LocationDetails();
        LocationDetails locationDetails3 = new LocationDetails();
        LocationDetails locationDetails4 = new LocationDetails();

        locationDetails1.setLocation(location1);
        locationDetails1.setOwnerFirstName("Freddie");
        locationDetails1.setOwnerLastName("Freeman");

        locationDetails2.setLocation(location2);
        locationDetails2.setOwnerFirstName("Varun");
        locationDetails2.setOwnerLastName("Iyer");

        locationDetails3.setLocation(location3);
        locationDetails3.setOwnerFirstName("Dani");
        locationDetails3.setOwnerLastName("Choi");

        locationDetails4.setLocation(location4);
        locationDetails4.setOwnerFirstName("Tim");
        locationDetails4.setOwnerLastName("Thomas");

        locationDetailsList.add(locationDetails1);
        locationDetailsList.add(locationDetails2);
        locationDetailsList.add(locationDetails3);
        locationDetailsList.add(locationDetails4);


        return locationDetailsList.get(locationId.intValue()-1);

    }


}

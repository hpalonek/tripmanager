package pl.edu.agh.mwo;
import java.util.*;

public class TripManager {
	private HashMap<String,Trip> tripList;
	
	public TripManager() {
		tripList = new HashMap<String,Trip>();
	}
	
	public void add(Trip trip) throws TripAlreadyExistsException {
		if (tripList.get(trip.getName()) != null) {
			throw new TripAlreadyExistsException();
		}
		else {
			tripList.put(trip.getName(),trip);
		}
	}
	
	public HashMap<String,Trip> getTrips() {
		return tripList;
	}

	public void remove(String name) {
		tripList.remove(name);
	}
	
	public Trip findTrip(String keyword) {
		for (Trip trip : tripList.values()){
			if (trip.getName().contains(keyword)) {
				return trip;
			}
			if (trip.getDescription().contains(keyword)) {
				return trip;
			}
			for (Photo photo :trip.getPhotos()) {
				if (photo.getComment().contains(keyword)) {
					return trip;
				}
			}
		}
		return null;
		
	}
	
}

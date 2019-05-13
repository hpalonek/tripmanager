package pl.edu.agh.mwo;

import java.awt.List;
import java.util.Collection;
import java.util.LinkedList;

public class Trip {
	private String name;
	private String description;
	private Collection<Photo> photoList;
	
	
	public Trip(String name, String description) {
		this.name = name;
		this.description = description;
		photoList = new LinkedList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public void addPhoto(Photo photo) {
		photoList.add(photo);
	}
	
	public Collection<Photo> getPhotos() {
		return photoList;
	}
}

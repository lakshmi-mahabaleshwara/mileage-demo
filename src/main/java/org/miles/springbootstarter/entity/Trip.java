package org.miles.springbootstarter.entity;

public class Trip {
	
	private Integer tripId;
    private Integer mediaId;
    private String description;
    
    public Trip(){};
    
	public Trip(Integer tripId, Integer mediaId, String description) {
		super();
		this.tripId = tripId;
		this.mediaId = mediaId;
		this.description = description;
	}
	public Integer getTripId() {
		return tripId;
	}
	public void setTripId(Integer tripId) {
		this.tripId = tripId;
	}
	public Integer getMediaId() {
		return mediaId;
	}
	public void setMediaId(Integer mediaId) {
		this.mediaId = mediaId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
    
    
    
	

}

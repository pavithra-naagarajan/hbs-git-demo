package com.revature.hbs.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="rooms")
public class Room {
	private Long roomNumber;
	private int floorNumber;
	
	private String roomSize;
	private String roomType;
	private int roomPrice;
	private String roomView;
	
	public Room() {
		
	}

	public Room( Long roomNumber, int floorNumber,String roomSize, String roomType, int roomPrice, String roomView) {
		super();
		this.floorNumber = floorNumber;
		this.roomNumber = roomNumber;
		this.roomSize = roomSize;
		this.roomType = roomType;
		this.roomPrice = roomPrice;
		this.roomView = roomView;
	}

	public int getFloorNumber() {
		return floorNumber;
	}

	public void setFloorNumber(int floorNumber) {
		this.floorNumber = floorNumber;
	}

	public Long getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Long roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getRoomSize() {
		return roomSize;
	}

	public void setRoomSize(String roomSize) {
		this.roomSize = roomSize;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public int getRoomPrice() {
		return roomPrice;
	}

	public void setRoomPrice(int roomPrice) {
		this.roomPrice = roomPrice;
	}

	public String getRoomView() {
		return roomView;
	}

	public void setRoomView(String roomView) {
		this.roomView = roomView;
	}

	@Override
	public String toString() {
		return "Room [floorNumber=" + floorNumber + ", roomNumber=" + roomNumber + ", roomSize=" + roomSize
				+ ", roomType=" + roomType + ", roomPrice=" + roomPrice + ", roomView=" + roomView + "]";
	}

	
}

package com.cap.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document
public class BookOrder {

	@Id
	private String bid;
	private String userId;
	private String userName;
	private int trainNumber;
	private String trainName;
	private String ticketType;
	private double amnt;
	private String stratpoint;
	private String endpoint;
	private String time;
	private int quantity;
	public BookOrder(String bid, String userId, String userName, int trainNumber, String trainName, String ticketType,
			double amnt, String stratpoint, String endpoint, String time, int quantity) {
		super();
		this.bid = bid;
		this.userId = userId;
		this.userName = userName;
		this.trainNumber = trainNumber;
		this.trainName = trainName;
		this.ticketType = ticketType;
		this.amnt = amnt;
		this.stratpoint = stratpoint;
		this.endpoint = endpoint;
		this.time = time;
		this.quantity = quantity;
	}
	public BookOrder() {
		// TODO Auto-generated constructor stub
	}
	public String getBid() {
		return bid;
	}
	public void setBid(String bid) {
		this.bid = bid;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getTrainNumber() {
		return trainNumber;
	}
	public void setTrainNumber(int trainNumber) {
		this.trainNumber = trainNumber;
	}
	public String getTrainName() {
		return trainName;
	}
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	public String getTicketType() {
		return ticketType;
	}
	public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}
	public double getAmnt() {
		return amnt;
	}
	public void setAmnt(double amnt) {
		this.amnt = amnt;
	}
	public String getStratpoint() {
		return stratpoint;
	}
	public void setStratpoint(String stratpoint) {
		this.stratpoint = stratpoint;
	}
	public String getEndpoint() {
		return endpoint;
	}
	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "BookOrder [bid=" + bid + ", userId=" + userId + ", userName=" + userName + ", trainNumber="
				+ trainNumber + ", trainName=" + trainName + ", ticketType=" + ticketType + ", amnt=" + amnt
				+ ", stratpoint=" + stratpoint + ", endpoint=" + endpoint + ", time=" + time + ", quantity=" + quantity
				+ "]";
	}
	
	
}

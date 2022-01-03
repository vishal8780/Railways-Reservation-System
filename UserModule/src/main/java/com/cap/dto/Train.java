package com.cap.dto;

public class Train {
	
	private Integer  trainNum;
	private String  trainName;
	private String startLoc;
	private String endLoc;
	private Integer seat;
	private String time;
	private double firstAc;
	private double secondAc;
	private double thirdAc;
	private double sleeper;
	public Train(Integer trainNum, String trainName, String startLoc, String endLoc, Integer seat, String time,
			double firstAc, double secondAc, double thirdAc, double sleeper) {
		super();
		this.trainNum = trainNum;
		this.trainName = trainName;
		this.startLoc = startLoc;
		this.endLoc = endLoc;
		this.seat = seat;
		this.time = time;
		this.firstAc = firstAc;
		this.secondAc = secondAc;
		this.thirdAc = thirdAc;
		this.sleeper = sleeper;
	}
	public Train() {
		// TODO Auto-generated constructor stub
	}
	public Integer getTrainNum() {
		return trainNum;
	}
	public void setTrainNum(Integer trainNum) {
		this.trainNum = trainNum;
	}
	public String getTrainName() {
		return trainName;
	}
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	public String getStartLoc() {
		return startLoc;
	}
	public void setStartLoc(String startLoc) {
		this.startLoc = startLoc;
	}
	public String getEndLoc() {
		return endLoc;
	}
	public void setEndLoc(String endLoc) {
		this.endLoc = endLoc;
	}
	public Integer getSeat() {
		return seat;
	}
	public void setSeat(Integer seat) {
		this.seat = seat;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public double getFirstAc() {
		return firstAc;
	}
	public void setFirstAc(double firstAc) {
		this.firstAc = firstAc;
	}
	public double getSecondAc() {
		return secondAc;
	}
	public void setSecondAc(double secondAc) {
		this.secondAc = secondAc;
	}
	public double getThirdAc() {
		return thirdAc;
	}
	public void setThirdAc(double thirdAc) {
		this.thirdAc = thirdAc;
	}
	public double getSleeper() {
		return sleeper;
	}
	public void setSleeper(double sleeper) {
		this.sleeper = sleeper;
	}
	@Override
	public String toString() {
		return "Train [trainNum=" + trainNum + ", trainName=" + trainName + ", startLoc=" + startLoc + ", endLoc="
				+ endLoc + ", seat=" + seat + ", time=" + time + ", firstAc=" + firstAc + ", secondAc=" + secondAc
				+ ", thirdAc=" + thirdAc + ", sleeper=" + sleeper + "]";
	}
}
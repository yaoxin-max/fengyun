package com.yx.model;

public class Car {
	//Brand, model, price, fuel consumption, mileage, fuel tank volume, remaining fuel
	//品牌,车型,价格,油耗,里程数,油箱容积,剩余油量
	private String Brand;//品牌
	private String model;//车型
	private double price;//价格
	private double fuelConsumption;//油耗
	private double mileage;//里程
	private double fuelTankVolume;//油箱容积
	private double remainingFuel;//剩余油量
	
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getFuelConsumption() {
		return fuelConsumption;
	}
	public void setFuelConsumption(double fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}
	public double getMileage() {
		return mileage;
	}
	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
	public double getFuelTankVolume() {
		return fuelTankVolume;
	}
	public void setFuelTankVolume(double fuelTankVolume) {
		this.fuelTankVolume = fuelTankVolume;
	}
	public double getRemainingFuel() {
		return remainingFuel;
	}
	public void setRemainingFuel(double remainingFuel) {
		this.remainingFuel = remainingFuel;
	}
	
	public Car(String brand, String model, double price, double fuelConsumption, double mileage, double fuelTankVolume,double remainingFuel) {
		Brand = brand;
		this.model = model;
		this.price = price;
		this.fuelConsumption = fuelConsumption;
		this.mileage = mileage;
		this.fuelTankVolume = fuelTankVolume;
		this.remainingFuel = remainingFuel;
	}
	public Car(){
		
	}
	//剩余油量
	public void show(double fuelConsumption,double mileage){
		 double kilomRe =( mileage /100)* fuelConsumption;
		 remainingFuel=(int) (remainingFuel- kilomRe);
		 System.out.println("剩余油量："+remainingFuel);
		
	}
	
	

}

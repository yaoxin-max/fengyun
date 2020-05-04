package com.yx.test;

import com.yx.model.Car;

public class CarTest {
	//品牌,车型,价格,油耗,里程数,油箱容积,剩余油量
	public static void main(String[] args) {
		Car car = new Car("Audi", "A6L", 500000, 2.0, 10000, 400, 200);
		car.show(1000, car.getFuelConsumption());
	}	
}

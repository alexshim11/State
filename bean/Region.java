package state.bean;

import state.bean.City;

public class Region {

	private String name;
	private double area;
	private City[] cities;

	private int cityCounter = 0;

	public Region(String name, double area, int numOfCities) {
		this.name = name;
		this.area = area;
		cities = new City[numOfCities];

	}

	public String getName() {
		return name;
	}

	public double getArea() {
		return area;
	}

	public City[] getCities() {
		return cities;
	}

	public void addCity(City city) {
		
		if (cityCounter < cities.length) {
			cities[cityCounter] = city;
			cityCounter++;

		} 
	}
}

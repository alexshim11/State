package state.bean;

import state.bean.Region;
import state.bean.City;

public class State {

	private String name;
	private String capital;
	private Region[] regions;

	private int regionCounter = 0;

	public State(String name, String capital, int numOfRegions) {
		this.name = name;
		this.capital = capital;
		regions = new Region[numOfRegions];
	}

	public String getName() {
		return name;
	}

	public String getCapital() {
		return capital;
	}

	public Region[] getRegion() {
		return regions;
	}

	public void addRegion(Region region) {

		if (regionCounter < regions.length) {
			regions[regionCounter] = region;
			regionCounter++;
		}
	}
}

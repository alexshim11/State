package state.logic;

import state.bean.State;
import state.bean.City;
import state.bean.Region;

public class Maps {

	public static void showStateInfo(State state) {

		System.out.println("State name:" + " " + state.getName());
		System.out.println("Capital is " + " " + state.getCapital());

	}

	public static void showFullInfo(State state) {
		Region[] regions = state.getRegion();

		System.out.println("Regions: ");
		for (Region region : regions) {

			if (region != null) {
				System.out.println(region.getName() + ": ");
				City[] cities = region.getCities();
				for (City city : cities) {
					System.out.println("\t" + city.getName());
				}
			}
		}

	}
}

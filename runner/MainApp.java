package state.runner;

import state.bean.City;
import state.bean.Region;
import state.bean.State;
import state.logic.Maps;

public class MainApp {

	public static void main(String[] args) {

		Region brestskiy = new Region("brestkiy", 1.0, 2);
		Region vitebskiy = new Region("vitebskiy", 2.0, 2);

		City brest = new City("Brest");
		City pinsk = new City("Pinsk");
		City vitebsk = new City("Vitebsk");
		City polozk = new City("Polozk");
		City bobruisk = new City("Bobruisk");

		brestskiy.addCity(brest);
		brestskiy.addCity(pinsk);

		vitebskiy.addCity(vitebsk);
		vitebskiy.addCity(polozk);
		vitebskiy.addCity(bobruisk);

		State state = new State("Belarus", "Minsk", 2);

		state.addRegion(brestskiy);
		state.addRegion(vitebskiy);

		Maps.showStateInfo(state);
		Maps.showFullInfo(state);

	}
}
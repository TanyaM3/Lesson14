package by.epam.homework.less14.view;

import java.util.List;

import by.epam.homework.less14.bean.Treasure;
import by.epam.homework.less14.bean.TreasureHouse;

public class TreasureHouseConsoleOutput {

	public void print(String title, TreasureHouse th) {
		System.out.println(title);
		List<Treasure> treasures = th.getTreasures();
		for (int i = 0; i < treasures.size(); i++) {
			System.out.println(treasures.get(i).getName() + ", price " + treasures.get(i).getPrice());
		}
	}

	public void print(String title, List<Treasure> treasures) {
		System.out.println(title);
		for (int i = 0; i < treasures.size(); i++) {
			System.out.println(treasures.get(i).getName() + ", price " + treasures.get(i).getPrice());
		}
	}

	public void print(String title, Treasure treasure) {
		System.out.println(title);
		System.out.println(treasure.getName() + ", price " + treasure.getPrice());
	}
}
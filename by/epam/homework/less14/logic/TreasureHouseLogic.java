package by.epam.homework.less14.logic;

import java.util.ArrayList;
import java.util.List;

import by.epam.homework.less14.bean.Treasure;
import by.epam.homework.less14.bean.TreasureHouse;

public class TreasureHouseLogic {
	
	public List<Treasure> mostExpensive(TreasureHouse th) {
		List<Treasure> treasures = th.getTreasures();
		List<Treasure> mostExpensive = new ArrayList<Treasure>();
		int max = 0;
		for(int i = 0; i < treasures.size(); i++) {
			if(treasures.get(i).getPrice() == max) {
				mostExpensive.add(treasures.get(i));
			} 
			else if(treasures.get(i).getPrice() > max) {
				max = treasures.get(i).getPrice();
				mostExpensive.clear();
				mostExpensive.add(treasures.get(i));	
			}
		}
		return mostExpensive;
	}
	
	public List<Treasure> byPrice(TreasureHouse th, int price) {
		List<Treasure> byPrice = new ArrayList<Treasure>();
		List<Treasure> treasures = th.getTreasures();
		for (int i = 0; i < treasures.size(); i++) {
			if (price == treasures.get(i).getPrice()) {
				byPrice.add(treasures.get(i));
			}
		}
		return byPrice;
	}
}
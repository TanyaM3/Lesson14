package by.epam.homework.less14.main;

import java.util.List;

import by.epam.homework.less14.bean.Treasure;
import by.epam.homework.less14.bean.TreasureHouse;
import by.epam.homework.less14.logic.TreasureHouseLogic;
import by.epam.homework.less14.view.TreasureHouseConsoleOutput;

public class Main {

	public static void main(String[] args) {
		TreasureHouseLogic logic = new TreasureHouseLogic();
		TreasureHouseConsoleOutput output = new TreasureHouseConsoleOutput();
		
		TreasureHouse th = new TreasureHouse();
		th.add(new Treasure("Ring", 1000, "gold ring"));
		th.add(new Treasure("Necklace", 1000, "diamond necklace"));
		th.add(new Treasure("Earings", 870, "gold earrings with emeralds"));
		th.add(new Treasure("Bracelet", 990, "gold bracelet with pearls"));
		th.add(new Treasure("Сrown", 2500, "gold crown"));
		th.add(new Treasure("Lamp", 2500, "gold lamp"));
		
		List<Treasure> treasures = logic.byPrice(th, 1000);
		output.print("Treasures with price 1000:", treasures);	
	}
}
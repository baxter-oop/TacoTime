package testProject;

import java.util.*;

public class Taco {
	Map<String, Number> toppings = new HashMap<String, Number>();
	
	
	public void AddTopping(String toppingName, float cost) {
		toppings.put(toppingName, cost);
	}

	public void RemoveTopping(String toppingName) {
		toppings.remove(toppingName);
	}
	
	
	public Taco Clone() {
		Taco outTaco = new Taco();
		
		for(String topping: toppings.keySet()){
			outTaco.AddTopping(topping, (float) toppings.get(topping));
		}
		
		return outTaco;
		
	}
	
	public String ShowToppings() {
		String outString = "";
		for (String topping : toppings.keySet()){
			if(outString != "") {
				outString += "\n";
			}
			outString += topping;
		}
		return outString;
	}
	public float ShowTacoCost() {
		float totalCost = 0f;
		
		for(Number cost: toppings.values()){
			totalCost += (float) cost;
		}
		return totalCost;
	}
}
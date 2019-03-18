package construction;

public class ConstructionCost {
	public double costOfConstruction(int standard, double sqft) {
		switch(standard) {
		case 1: return (sqft * 1200);
		case 2: return (sqft * 1500);
		case 3: return (sqft * 1800);
		case 4: return(sqft * 2500);				
		}
		return 0;
	}

}

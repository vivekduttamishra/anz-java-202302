package in.conceptarchitect.animals.mammals;

import in.conceptarchitect.animals.Pet;
import in.conceptarchitect.commons.Rideable;
import in.conceptarchitect.commons.SpecialBehavior;

public class Horse extends Mammal implements Rideable,Pet{

	public String eat() {
		return this+" is a grass eater";
	}
	
	@SpecialBehavior
	public String ride() {
		return this+" is an ancient Ride";
	}

}

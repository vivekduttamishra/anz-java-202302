package in.conceptarchitect.animals.mammals;

import in.conceptarchitect.animals.Hunter;
import in.conceptarchitect.animals.Pet;
import in.conceptarchitect.commons.SpecialBehavior;

public class Dog extends Mammal implements Pet,Hunter{

	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return this+" is a flesh eater";
	}
	@Override
	public String move() {
		// TODO Auto-generated method stub
		return this+" moves on land";
	}
	@Override
	@SpecialBehavior
	public String hunt() {
		// TODO Auto-generated method stub
		return this+" is a friendly neighborhood hunter";
	}
	
	@SpecialBehavior
	public String humanCompanion() {
		return this+" is a great human companion";
	}
	
	
	

}

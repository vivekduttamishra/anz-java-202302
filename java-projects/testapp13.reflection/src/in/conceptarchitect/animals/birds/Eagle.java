package in.conceptarchitect.animals.birds;

import in.conceptarchitect.animals.Hunter;

public class Eagle extends Bird implements Hunter{
	
	

	public String hunt() {
		return this+" is great flying hunter";
	}

	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return this+" is a flesh eater";
	}
	

}



public class Car extends Vehicle{
	
	//instance variables
	private int numDoors;
	private int numPass;
	
	//constructor
	public Car(String aMake, String aModel, String aPlate, int aNumDoors, int aNumPass){
		
		super(aMake, aModel, aPlate);
		this.numDoors = aNumDoors;
		this.numPass = aNumPass;
	}
	
	//getters
	public int getNumDoors(){
		return this.numDoors;
	}
	
	public int getNumPass(){
		return this.numPass;
	}
	
	//simple toString
	public String toString(){
		String theString = "";
		theString = String.format("%d-door %s %s with license %s.", this.numDoors, super.getMake(), super.getModel(), super.getPlate());
		return theString;
	}
	
	//toEquals
	public boolean equals(Object obj){
		if (!(obj instanceof Car)){
			return false;
		}
		
		Car otherCar = (Car) obj;
		
		if(this.numDoors == otherCar.getNumDoors() && this.numPass == otherCar.getNumPass()){
			return super.equals(otherCar);
		}
		else{
			return false;
		}
	}
	
	//copy method
	public Car copy(){
		String aMake = super.getMake();
		String aModel = super.getModel();
		String aPlate = super.getPlate();
		int numDoors = this.numDoors;
		int numPass = this.numPass;
		
		Car theCopy = new Car(aMake, aModel, aPlate, numDoors, numPass);
		
		return theCopy;
	}
}
		
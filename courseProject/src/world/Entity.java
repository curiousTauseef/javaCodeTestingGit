package world;

public class Entity {
	static int nextId = 0;
	//Entity will model both living and non living entities
	//Properties that remain constant during the entire execution
	//of program : if living or non-living
	
	//man : living, age, money
	
	final int id;
	//final String firstName, lastName;
	String firstName, lastName;
	String spouseFirstName;
	boolean type;
	int gridNumber;
	
	//Earlier I had two cons for Entity, then ran into problem
	//as living entity for keanu was invoking the constructor for non livng type
	//make two constructor methods to denote living and non living entities
	//Entity(String fn, String ln,boolean pType,LivingEntity pObjLivEnt) {

	Entity(String fn, String ln,String sn,boolean pType) {
		id = nextId;
		nextId++;
		
		firstName = fn;
		lastName = ln;
		spouseFirstName = sn;
		
		this.type = pType;
		System.out.println("Constructor invoked for  adding living entities ");
		//pObjLivEnt = (LivingEntity) this;
		//System.out.println("display first name for added living entities "+firstName);
		
	}
	
	
	Entity(String fn, boolean pType) {
		id = nextId;
		nextId++;
		
		firstName = fn;
		this.type = pType;
		System.out.println("Constructor invoked for  addding non living entities ");

	}
	
	
	String getFirstName() {
		return firstName;
	}
	
	String getLastName() {
		return lastName;
	}
	
	void registerForGrid(Grid c) {
		c.registerEntity(this);
	}
	
	void unregisterForGrid(Grid c) {
		c.unregisterEntity(this);
	}
	
	
}
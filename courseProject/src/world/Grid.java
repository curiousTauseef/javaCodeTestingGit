package world;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;      // Useful for traversing a HashSet
import java.util.List;
import java.util.Random;
import java.util.StringJoiner;

import world.Program.Gender;
import world.Program;


class Grid  {
	static int nextId = 0;
	
	final int id;
	final String name;
	final HashSet<Entity> registeredEntitys = 
			new HashSet<Entity>();
	int[] arrIdsOfLandsForPplMovement;
	static int[] volcanoGridIds;
	
	static List<Integer> listOfGridsWithMarriagePossibility = new ArrayList<>();
	
	Grid(String n) {
		id = nextId;
		//arrIdsOfLandsForPplMovement[nextId] = this.id;
		nextId++;
		

		
		name = n;
	}
	
	String getName() {
		return name;
	}
	
	void registerEntity(Entity s) {
		registeredEntitys.add(s);

		s.gridNumber = this.id;
		
		if(s.type == true){
			LivingEntity pObjLivEnt1 = (LivingEntity) s; 
			if(pObjLivEnt1.getMaritalStatus() == false){
				System.out.println("Registering unmarried entity"+pObjLivEnt1.firstName);
				Grid.listOfGridsWithMarriagePossibility.add(this.id);
			
			}
		}
		
		
		/*
		NonLivingEntity pObjNonLivEnt1 = (NonLivingEntity) s; 
		if(pObjNonLivEnt1.getCategory() == "VOLCANO"){
			
			volcanoGridIds[] = 
		}
		*/
		
	}
	
	void unregisterEntity(Entity s) {
		registeredEntitys.remove(s);
		//s.gridNumber = NULL;
	}
	
	void displayEntitys(){
		 // create an iterator
		   Iterator iterator = registeredEntitys.iterator(); 
		      
		   // check values
		   while (iterator.hasNext()){
		   System.out.println("ValueEntity: "+iterator.next() + " ");  
		   }
	}
	
	void displayEntitysAsArray(){
		
		Entity[] a = registeredEntitys.toArray( new Entity[registeredEntitys.size()] );
		      
		   // check values
		  // while (iterator.hasNext()){
		  // System.out.println("Value: "+iterator.next() + " ");  
		  // }
		
		//http://javatutorialhq.com/java/example-source-code/array/convert-set-array/
		for(Entity s: a){
			// printing the contents of our array
			System.out.println(s.firstName);
		}
	}
	
	void displayEntitysAsSingleString(){
		
		Entity[] a = registeredEntitys.toArray( new Entity[registeredEntitys.size()] );
		      
		   // check values
		  // while (iterator.hasNext()){
		  // System.out.println("Value: "+iterator.next() + " ");  
		  // }
		 StringJoiner sj = new StringJoiner(":", "[", "]");
		 //sj.add("George").add("Sally").add("Fred");
		 
		//http://javatutorialhq.com/java/example-source-code/array/convert-set-array/
		for(Entity s: a){
			// printing the contents of our array
			//System.out.println(s.firstName);
			sj.add(s.firstName);
		}
		String desiredString = sj.toString();
		System.out.println(desiredString);
	}
	
	void displayLivingEntitysAsSingleString(){
		
		Entity[] a = registeredEntitys.toArray( new Entity[registeredEntitys.size()] );
		//LivingEntity[] a = registeredEntitys.toArray( new LivingEntity[registeredEntitys.size()] );
		//System.out.println("Display living entities as single string ");
		   // check values
		  // while (iterator.hasNext()){
		  // System.out.println("Value: "+iterator.next() + " ");  
		  // }
		 StringJoiner sj = new StringJoiner(":", "[", "]");
		 //sj.add("George").add("Sally").add("Fred");
		 
		//http://javatutorialhq.com/java/example-source-code/array/convert-set-array/
		for(Entity s: a){
			
			if(s.type == true){
				//LivingEntity a = Entity s;	
				LivingEntity pObjLivEnt = (LivingEntity) s;
				
				// printing the contents of our array
				//System.out.println(s.firstName);
				sj.add(s.firstName);
				sj.add(s.lastName);
				sj.add("Entity ID");
				sj.add(String.valueOf(s.id));
				sj.add("GridNo");
				sj.add(String.valueOf(s.gridNumber));
				sj.add("Age");
				sj.add(String.valueOf(pObjLivEnt.getAge()));
				sj.add("Gendr");
				sj.add(String.valueOf(pObjLivEnt.getGender()));
				sj.add("Money");
				sj.add(String.valueOf(pObjLivEnt.getMoney()));
				sj.add("SexualPref");
				sj.add(String.valueOf(pObjLivEnt.getSexualPref()));
				sj.add("MaritalStatus");
				sj.add(String.valueOf(pObjLivEnt.getMaritalStatus()));
				sj.add("LivingStatus");
				sj.add(String.valueOf(pObjLivEnt.getLivingStatus()));
				sj.add("CanMove");
				sj.add(String.valueOf(pObjLivEnt.getMovementStatus()));

				//sj.add(pObjLivEnt.eAge);
				//sj.add(s.age);
			
			}
			

			//sj.add(s.firstName);
			//String str = String.valueOf(s.type);
			//sj.add(str);

		}
		String desiredString = sj.toString();
		System.out.println(desiredString);
	}
	
	public String returnLivingEntitysAsSingleString(){
		
		Entity[] a = registeredEntitys.toArray( new Entity[registeredEntitys.size()] );
		//LivingEntity[] a = registeredEntitys.toArray( new LivingEntity[registeredEntitys.size()] );
		//System.out.println("Display living entities as single string ");
		   // check values
		  // while (iterator.hasNext()){
		  // System.out.println("Value: "+iterator.next() + " ");  
		  // }
		 StringJoiner sj = new StringJoiner(":", "[", "]");
		 //sj.add("George").add("Sally").add("Fred");
		 
		//http://javatutorialhq.com/java/example-source-code/array/convert-set-array/
		for(Entity s: a){
			
			if(s.type == true){
				//LivingEntity a = Entity s;	
				LivingEntity pObjLivEnt = (LivingEntity) s;
				
				// printing the contents of our array
				//System.out.println(s.firstName);
				sj.add(s.firstName);
				//sj.add(s.lastName);
				//sj.add("Entity ID");
				//sj.add(String.valueOf(s.id));
				//sj.add("GridNo");
				//sj.add(String.valueOf(s.gridNumber));
				//sj.add("Age");
				//sj.add(String.valueOf(pObjLivEnt.getAge()));
				//sj.add("Gendr");
				//sj.add(String.valueOf(pObjLivEnt.getGender()));
				//sj.add("Money");
				//sj.add(String.valueOf(pObjLivEnt.getMoney()));
				//sj.add("SexualPref");
				//sj.add(String.valueOf(pObjLivEnt.getSexualPref()));
				//sj.add("MaritalStatus");
				//sj.add(String.valueOf(pObjLivEnt.getMaritalStatus()));
				//sj.add("LivingStatus");
				//sj.add(String.valueOf(pObjLivEnt.getLivingStatus()));
				//sj.add("CanMove");
				//sj.add(String.valueOf(pObjLivEnt.getMovementStatus()));

				//sj.add(pObjLivEnt.eAge);
				//sj.add(s.age);
			
			}
			

			//sj.add(s.firstName);
			//String str = String.valueOf(s.type);
			//sj.add(str);

		}
		String desiredString = sj.toString();
		return(desiredString);
	}
	
void displayNonLivingEntitysAsSingleString(){
		
		Entity[] a = registeredEntitys.toArray( new Entity[registeredEntitys.size()] );
		//LivingEntity[] a = registeredEntitys.toArray( new LivingEntity[registeredEntitys.size()] );
		System.out.println("Display non living entities as single string ");
		   // check values
		  // while (iterator.hasNext()){
		  // System.out.println("Value: "+iterator.next() + " ");  
		  // }
		 StringJoiner sj = new StringJoiner(":", "[", "]");
		 //sj.add("George").add("Sally").add("Fred");
		 
		//http://javatutorialhq.com/java/example-source-code/array/convert-set-array/
		 
		for(Entity s: a){
			
			if(s.type == false){
				//LivingEntity a = Entity s;	
				//LivingEntity pObjLivEnt = (LivingEntity) s;
				
				// printing the contents of our array
				//System.out.println(s.firstName);
				sj.add(s.firstName);
				
				sj.add("Entity ID");
				sj.add(String.valueOf(s.id));
				sj.add("GridNo");
				sj.add(String.valueOf(s.gridNumber));
				NonLivingEntity pObjNonLivEnt1 = (NonLivingEntity) s; 
				/*
				if(pObjNonLivEnt1.getCategory() == "VOLCANO"){
					
					sj.add(String.valueOf(pObjNonLivEnt1.eCategory));
				}
				*/
				sj.add("Category");
				sj.add(String.valueOf(pObjNonLivEnt1.getCategory()));
				

				//sj.add(pObjLivEnt.eAge);
				//sj.add(s.age);
			
			}
			

			//sj.add(s.firstName);
			//String str = String.valueOf(s.type);
			//sj.add(str);

		}
		String desiredString = sj.toString();
		System.out.println(desiredString);
	}
	
	void updateAgeOfAllLivingEntities(){
		
		Entity[] b = registeredEntitys.toArray( new Entity[registeredEntitys.size()] );
		//System.out.println("Update Age of all living entities for grid "+this.id);

		 StringJoiner sj = new StringJoiner(":", "[", "]");
		 //sj.add("George").add("Sally").add("Fred");
		 
		//http://javatutorialhq.com/java/example-source-code/array/convert-set-array/
		for(Entity t: b){
			
			if(t.type == true){
				//System.out.println("Update Age for an entity iteration ");
				//LivingEntity a = Entity s;	
				LivingEntity pObjLivEnt1 = (LivingEntity) t; 
				//checkk here that living entity has an age field
				//else u will run into exception
				//use a try catch here
				pObjLivEnt1.increaseAge();
				// printing the contents of our array
				//System.out.println(s.firstName);
				sj.add(t.firstName);
				sj.add(t.lastName);
				sj.add("Entity ID");
				sj.add(String.valueOf(t.id));
				sj.add("GridNo");
				sj.add(String.valueOf(t.gridNumber));
				sj.add("NewAge");
				sj.add(String.valueOf(pObjLivEnt1.getAge()));
				
			
			}
			else{
				continue;
			}
			

			//sj.add(s.firstName);
			//String str = String.valueOf(s.type);
			//sj.add(str);

		}
		//System.out.println("Update Age For loop ends for grid "+this.id);

		String desiredString = sj.toString();
		//System.out.println(desiredString);
	}
	
	void displayMaleEntities(){
		
		Entity[] b = registeredEntitys.toArray( new Entity[registeredEntitys.size()] );
		//System.out.println("Update Age of all living entities for grid "+this.id);

		 StringJoiner sj = new StringJoiner(":", "[", "]");
		 //sj.add("George").add("Sally").add("Fred");
		 
		//http://javatutorialhq.com/java/example-source-code/array/convert-set-array/
		for(Entity t: b){
			
			if(t.type == true){
				//System.out.println("Update Age for an entity iteration ");
				//LivingEntity a = Entity s;	
				LivingEntity pObjLivEnt1 = (LivingEntity) t; 
				if(pObjLivEnt1.getGender() == "MALE"){
					sj.add(t.firstName);
					sj.add(t.lastName);
					sj.add("Entity ID");
					sj.add(String.valueOf(t.id));
					sj.add("GridNo");
					sj.add(String.valueOf(t.gridNumber));
					
				}
			
			}

		}
		//System.out.println("Update Age For loop ends for grid "+this.id);

		String desiredString = sj.toString();
		System.out.println(desiredString);
	}
	
	void naturalDeathForCertainLivingEntities(){
		
		Entity[] b = registeredEntitys.toArray( new Entity[registeredEntitys.size()] );
		//System.out.println("Natural Death for living entities for grid "+this.id);

		StringJoiner sj = new StringJoiner(":", "[", "]");

		Random rand = new Random();
			
		 
		//http://javatutorialhq.com/java/example-source-code/array/convert-set-array/
		for(Entity t: b){
			
			if(t.type == true){
				//System.out.println("Update Age for an entity iteration ");
				//LivingEntity a = Entity s;	
				LivingEntity pObjLivEnt1 = (LivingEntity) t; 
				//get a random number between 70 and 90
				//if person's age matches this random number
				//they die
				//else if their age is 90 they die
				int randomNumber = rand.nextInt(20) ;//gen no between 0 and 19, inclusive
				int deathAge = randomNumber + 70;
				//pObjLivEnt1.increaseAge();
				int ageOfLivingEntity = pObjLivEnt1.getAge();

		        if((ageOfLivingEntity == deathAge) || (ageOfLivingEntity == 90)){
		        	System.out.println("Dies : "+pObjLivEnt1.firstName);
		        	this.unregisterEntity(t);
		        }
				
				// printing the contents of our array
				//System.out.println(s.firstName);
				//sj.add(t.firstName);
				//sj.add(t.lastName);
				//sj.add("Entity ID");
				//sj.add(String.valueOf(t.id));
				//sj.add("GridNo");
				//sj.add(String.valueOf(t.gridNumber));
				//sj.add("NewAge");
				//sj.add(String.valueOf(pObjLivEnt1.getAge()));
				
			
			}
			else{
				continue;
			}
			

			//sj.add(s.firstName);
			//String str = String.valueOf(s.type);
			//sj.add(str);

		}
		//System.out.println("Update Age For loop ends for grid "+this.id);

		//String desiredString = sj.toString();
		//System.out.println(desiredString);
	}
	
void updateMarriagePropertyOfEntities(){
		
		Entity[] b = registeredEntitys.toArray( new Entity[registeredEntitys.size()] );
		//System.out.println("Update Age of all living entities for grid "+this.id);

		 StringJoiner sj = new StringJoiner(":", "[", "]");
		 //sj.add("George").add("Sally").add("Fred");
		 
		//http://javatutorialhq.com/java/example-source-code/array/convert-set-array/
		for(Entity t: b){
			
			if(t.type == true){
				//System.out.println("Update Age for an entity iteration ");
				//LivingEntity a = Entity s;	
				LivingEntity pObjLivEnt1 = (LivingEntity) t; 
				//checkk here that living entity has an age field
				//else u will run into exception
				//use a try catch here
				int age = pObjLivEnt1.getAge();
		        if((age >= 18) && (pObjLivEnt1.getMaritalStatus() == false)){
		        	//means chhild has grown and eligilbel to marry
		        	//so change sexual preferences
		        	pObjLivEnt1.setSexualPref(true);

		        }
				
				// printing the contents of our array
				//System.out.println(s.firstName);
				sj.add(t.firstName);
				sj.add(t.lastName);
				sj.add("Entity ID");
				sj.add(String.valueOf(t.id));
				sj.add("GridNo");
				sj.add(String.valueOf(t.gridNumber));
				sj.add("NewAge");
				sj.add(String.valueOf(pObjLivEnt1.getAge()));
				
			
			}
			else{
				continue;
			}
			

			//sj.add(s.firstName);
			//String str = String.valueOf(s.type);
			//sj.add(str);

		}
		//System.out.println("Update Age For loop ends for grid "+this.id);

		String desiredString = sj.toString();
		//System.out.println(desiredString);
	}

void showGridsWithMarriageablePeople(){
	
	Entity[] b = this.registeredEntitys.toArray( new Entity[registeredEntitys.size()] );
	//System.out.println("Update Age of all living entities for grid "+this.id);
	System.out.println("Currently the marriage grid array list has following elements:"+listOfGridsWithMarriagePossibility);
	 StringJoiner sj = new StringJoiner(":", "[", "]");
	 //sj.add("George").add("Sally").add("Fred");
	 
	//http://javatutorialhq.com/java/example-source-code/array/convert-set-array/
	 int flagForDeletion = 1;
	for(Entity t: b){
		
		if(t.type == true){
			//System.out.println("Update Age for an entity iteration ");
			//LivingEntity a = Entity s;	
			LivingEntity pObjLivEnt1 = (LivingEntity) t; 

	        if((pObjLivEnt1.getMaritalStatus() == false) && (pObjLivEnt1.getSexualPref() == true)){
	        	//means chhild has grown and eligilbel to marry
	        	//so change sexual preferences
	        	//pObjLivEnt1.setSexualPref(true);
	        	flagForDeletion = 0;

	        }
			
		
		
		}
		else{
			continue;
		}
		

		//sj.add(s.firstName);
		//String str = String.valueOf(s.type);
		//sj.add(str);

	}
	
	int numberofitems = listOfGridsWithMarriagePossibility.size();
	numberofitems--;
	if (flagForDeletion == 1){
		for (int i = 0; i < numberofitems; i++) {
			
			int getGridID = listOfGridsWithMarriagePossibility.get(i);
			if (getGridID == this.id){
				listOfGridsWithMarriagePossibility.remove(i);
			}
			
		}
	
	}
	
	//System.out.println("Update Age For loop ends for grid "+this.id);

	String desiredString = sj.toString();
	//System.out.println(desiredString);
}

void refreshListForGridsWithMarriageablePeople(){
	
	Entity[] b = registeredEntitys.toArray( new Entity[registeredEntitys.size()] );
	//System.out.println("Update Age of all living entities for grid "+this.id);
	//System.out.println("Currently the marriage grid array list has following elements:"+listOfGridsWithMarriagePossibility);
	 StringJoiner sj = new StringJoiner(":", "[", "]");
	 //sj.add("George").add("Sally").add("Fred");
	 
	//http://javatutorialhq.com/java/example-source-code/array/convert-set-array/
	for(Entity t: b){
		
		if(t.type == true){
			//System.out.println("Update Age for an entity iteration ");
			//LivingEntity a = Entity s;	
			LivingEntity pObjLivEnt1 = (LivingEntity) t; 
			//checkk here that living entity has an age field
			//else u will run into exception
			//use a try catch here
			int age = pObjLivEnt1.getAge();
	        if((age >= 18) && (pObjLivEnt1.getMaritalStatus() == false)){
	        	//means chhild has grown and eligilbel to marry
	        	//so change sexual preferences
	        	pObjLivEnt1.setSexualPref(true);

	        }
			
			// printing the contents of our array
			//System.out.println(s.firstName);
			sj.add(t.firstName);
			sj.add(t.lastName);
			sj.add("Entity ID");
			sj.add(String.valueOf(t.id));
			sj.add("GridNo");
			sj.add(String.valueOf(t.gridNumber));
			sj.add("NewAge");
			sj.add(String.valueOf(pObjLivEnt1.getAge()));
			
		
		}
		else{
			continue;
		}
		

		//sj.add(s.firstName);
		//String str = String.valueOf(s.type);
		//sj.add(str);

	}
	//System.out.println("Update Age For loop ends for grid "+this.id);

	String desiredString = sj.toString();
	//System.out.println(desiredString);
}
	

void marriageEventHappen(){
	
	Entity[] b = registeredEntitys.toArray( new Entity[registeredEntitys.size()] );
	//System.out.println("Update Age of all living entities for grid "+this.id);
	//System.out.println("Currently the marriage grid array list has following elements:"+listOfGridsWithMarriagePossibility);
	 StringJoiner sj = new StringJoiner(":", "[", "]");
	 //sj.add("George").add("Sally").add("Fred");
 	//LivingEntity pMaleLivEntToMarry = new LivingEntity("", name, name, false, id, null, id, false, false, false, false);
	//LivingEntity pFemaleLivEntToMarry = new LivingEntity("", name, name, false, id, null, id, false, false, false, false);;
	LivingEntity pMaleLivEntToMarry = null;
	LivingEntity pFemaleLivEntToMarry = null;
	//http://javatutorialhq.com/java/example-source-code/array/convert-set-array/
	for(Entity t: b){
		
		if(t.type == true){
			//System.out.println("Update Age for an entity iteration ");
			//LivingEntity a = Entity s;	
			LivingEntity pObjLivEnt1 = (LivingEntity) t; 
			//checkk here that living entity has an age field
			//else u will run into exception
			//use a try catch here
			int age = pObjLivEnt1.getAge();
	        if((age >= 18) && 
	        		(pObjLivEnt1.getMaritalStatus() == false) &&
	        		(pObjLivEnt1.getSexualPref() == true)&&
	        		(pObjLivEnt1.getGender() == "MALE")){
	        	//means chhild has grown and eligilbel to marry
	        	//so change sexual preferences
	        	pMaleLivEntToMarry = pObjLivEnt1;
	        	break;
	        }

			// printing the contents of our array
			//System.out.println(s.firstName);
			sj.add(t.firstName);
			sj.add(t.lastName);
			sj.add("Entity ID");
			sj.add(String.valueOf(t.id));
			sj.add("GridNo");
			sj.add(String.valueOf(t.gridNumber));
			sj.add("NewAge");
			sj.add(String.valueOf(pObjLivEnt1.getAge()));
			
		
		}
		else{
			continue;
		}
		


	}
	
	//http://javatutorialhq.com/java/example-source-code/array/convert-set-array/
	for(Entity t: b){
		
		if(t.type == true){
			//System.out.println("Update Age for an entity iteration ");
			//LivingEntity a = Entity s;	
			LivingEntity pObjLivEnt1 = (LivingEntity) t; 
			//checkk here that living entity has an age field
			//else u will run into exception
			//use a try catch here
			int age = pObjLivEnt1.getAge();
	        if((age >= 18) && 
	        		(pObjLivEnt1.getMaritalStatus() == false) &&
	        		(pObjLivEnt1.getSexualPref() == true)&&
	        		(pObjLivEnt1.getGender() == "FEMALE")){
	        	//means chhild has grown and eligilbel to marry
	        	//so change sexual preferences
	        	pFemaleLivEntToMarry = pObjLivEnt1;
	        	break;

	        }
	        
	        
			
			// printing the contents of our array
			//System.out.println(s.firstName);
			sj.add(t.firstName);
			sj.add(t.lastName);
			sj.add("Entity ID");
			sj.add(String.valueOf(t.id));
			sj.add("GridNo");
			sj.add(String.valueOf(t.gridNumber));
			sj.add("NewAge");
			sj.add(String.valueOf(pObjLivEnt1.getAge()));
			
		
		}
		else{
			continue;
		}
		

	}//end of for for female
	
	//http://stackoverflow.com/questions/850878/does-setting-java-objects-to-null-do-anything-anymore
	if((pMaleLivEntToMarry != null)&&(pFemaleLivEntToMarry != null)){
	System.out.println("Male "+pMaleLivEntToMarry.firstName);
	System.out.println("marries ");
	System.out.println("Female "+pFemaleLivEntToMarry.firstName);
	
	//change of properties due to marriaage
	pMaleLivEntToMarry.setMaritalStatus(true);
	pFemaleLivEntToMarry.setMaritalStatus(true);
	}
	
	
	
	
	
	
	//System.out.println("Update Age For loop ends for grid "+this.id);

	String desiredString = sj.toString();
	//System.out.println(desiredString);
}
void checkAndMovePpl(Grid fromObj,Grid ToObj){
		
	//cellist = new Grid[15]; 
	Grid fromGridCellEl ;//= new Grid();
	Grid toGridCellEl;
	//following gives - cannot make a static ref to non static field world.Program.cellist
	//fromGridCellEl = world.Program.cellist[from];
	
	
		Entity[] fromEnt = fromObj.registeredEntitys.toArray( new Entity[registeredEntitys.size()] );
		Entity[] toEnt = ToObj.registeredEntitys.toArray( new Entity[registeredEntitys.size()] );
		//System.out.println("Update Age of all living entities for grid "+this.id);

		 StringJoiner sj = new StringJoiner(":", "[", "]");
		 //sj.add("George").add("Sally").add("Fred");
		 
		//http://javatutorialhq.com/java/example-source-code/array/convert-set-array/
		for(Entity t: fromEnt){
			
			if(t.type == true){
				
				//System.out.println("Update Age for an entity iteration ");
				//LivingEntity a = Entity s;	
				LivingEntity pObjLivEnt1 = (LivingEntity) t; 
				if(pObjLivEnt1.getMovementStatus() == true){
					System.out.println("To be moved"+t.firstName);
					fromObj.unregisterEntity(t);
					ToObj.registerEntity(t);

				}

				
			
			}


			//sj.add(s.firstName);
			//String str = String.valueOf(s.type);
			//sj.add(str);

		}
		System.out.println("Moved from grid "+this.id);

		//String desiredString = sj.toString();
		//System.out.println(desiredString);
	}

/*
void getEntityObjForGridID(int gridId){
	
	Grid gridObj = null;
	
	for (int i = 0; i < cellist.length; i++) {
		//System.out.println( cellist[i].name );
		//p("No of entities for cell");
		System.out.println("No of entities for cell number "+i );
		System.out.println( cellist[i].nrOfRegisteredEntitys() );
		System.out.println("Their Names and Properties: ");
		//System.out.println( cellist[i].registeredEntitys );
		 //cellist[i].displayEntitys() ;
		 //cellist[i].displayEntitysAsArray() ;
		 cellist[i].displayEntitysAsSingleString();
		 

		 //System.out.println( cellist[i].registeredEntitys.man.firstName );
		}
	gridObj.id = gridId;
	Entity[] b = gridObj.registeredEntitys.toArray( new Entity[registeredEntitys.size()] );

		

		 StringJoiner sj = new StringJoiner(":", "[", "]");
		 //sj.add("George").add("Sally").add("Fred");
		 
		//http://javatutorialhq.com/java/example-source-code/array/convert-set-array/
		for(Entity t: b){
			
			if(t.type == true){
				//System.out.println("Update Age for an entity iteration ");
				//LivingEntity a = Entity s;	
				LivingEntity pObjLivEnt1 = (LivingEntity) t; 
				if(pObjLivEnt1.getGender() == "MALE"){
					sj.add(t.firstName);
					sj.add(t.lastName);
					sj.add("Entity ID");
					sj.add(String.valueOf(t.id));
					sj.add("GridNo");
					sj.add(String.valueOf(t.gridNumber));
					
				}

				
			
			}


			//sj.add(s.firstName);
			//String str = String.valueOf(s.type);
			//sj.add(str);

		}
		//System.out.println("Update Age For loop ends for grid "+this.id);

		String desiredString = sj.toString();
		System.out.println(desiredString);
	}
	*/

int getListOfVolcanoGrids(){
	
	Entity[] a = this.registeredEntitys.toArray( new Entity[registeredEntitys.size()] );
	//LivingEntity[] a = registeredEntitys.toArray( new LivingEntity[registeredEntitys.size()] );
	System.out.println("getListOfVolcanoGrids ");
	int list = -1;

	 
	for(Entity s: a){
		
		if(s.type == false){

			NonLivingEntity pObjNonLivEnt1 = (NonLivingEntity) s; 
			
			if(pObjNonLivEnt1.getCategory() == "VOLCANO"){
				
				System.out.println("Volcano Name"+pObjNonLivEnt1.firstName);
				//sj.add(String.valueOf(pObjNonLivEnt1.eCategory));
				list = this.id;
				return list;
			}
			else
				return -1;
			

			

			//sj.add(pObjLivEnt.eAge);
			//sj.add(s.age);
		
		}
		

		//sj.add(s.firstName);
		//String str = String.valueOf(s.type);
		//sj.add(str);

	}
	return list;

}

void unregisterPeopleDueToVolcanicEruption(){
	
	Entity[] a = this.registeredEntitys.toArray( new Entity[registeredEntitys.size()] );
	//LivingEntity[] a = registeredEntitys.toArray( new LivingEntity[registeredEntitys.size()] );
	System.out.println("unregisterPeopleDueToVolcanicEruption for grid "+this.id);
	int list = -1;
	this.displayLivingEntitysAsSingleString();
	 
	for(Entity s: a){
		
		if(s.type == true){
			
			this.unregisterEntity(s);
		
		
		}
		System.out.println("Died thus new ppl on this grid are ");
		this.displayLivingEntitysAsSingleString();
		
		
	}

}
	
	
	/*
	void displayGridLandsForPeopleMovement(){
		Entity[] a = registeredEntitys.toArray( new Entity[registeredEntitys.size()] );
		for(Entity s: a){
			LivingEntity pObjLivEnt = (LivingEntity) s;
			
			if(pObjLivEnt.getMovementStatus() == true){
				//LivingEntity a = Entity s;	
				LivingEntity pObjLivEnt = (LivingEntity) s;
				
				
				arrIdsOfLandsForPplMovement = this.id;
				// printing the contents of our array
				//System.out.println(s.firstName);
				sj.add(s.firstName);
				sj.add(s.lastName);
				sj.add("Age");
				sj.add(String.valueOf(pObjLivEnt.getAge()));
				sj.add("Gendr");
				sj.add(String.valueOf(pObjLivEnt.getGender()));
				sj.add("Money");
				sj.add(String.valueOf(pObjLivEnt.getMoney()));
				sj.add("SexualPref");
				sj.add(String.valueOf(pObjLivEnt.getSexualPref()));
				sj.add("MaritalStatus");
				sj.add(String.valueOf(pObjLivEnt.getMaritalStatus()));
				sj.add("LivingStatus");
				sj.add(String.valueOf(pObjLivEnt.getLivingStatus()));
				//sj.add(pObjLivEnt.eAge);
				//sj.add(s.age);
			
			}
			

			//sj.add(s.firstName);
			//String str = String.valueOf(s.type);
			//sj.add(str);

		}
		System.out.println("Display living entities as single string ");
		
		
	}
	
	*/
	
	HashSet<Entity> registeredEntitys() {
		 System.out.print( "HashSet: " );
	
		return registeredEntitys;
	}
	
	int nrOfRegisteredEntitys() {
		return registeredEntitys.size();
	}
}

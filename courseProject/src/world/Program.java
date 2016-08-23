package world;


import java.awt.GridLayout;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

//Using Java's libraries to create a simple game engine
//http://compsci.ca/v3/viewtopic.php?t=25991

public class Program {
	
	static int timeSteps;
	static boolean isRunning = true;
	static int fps = 30;
	
	public enum Gender {
		MALE,FEMALE;
		
	}
	public enum NonLivingCategory {
		VOLCANO,CASINO,PIANO;
		
	}
	
	//Thread GUIThread = new Runnable() {
	static Thread GUIThread = new Thread(new Runnable() {
		//class GUIThread extends Thread{
	//public class GUIRunnable implements Runnable {
		JFrame frame = new JFrame("Bart Java Project World Simulation");
		JLabel[] arrayBtn; 
		void displayGUI() {
			// the frame that contains the components
			arrayBtn = new JLabel[16];
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    // set the size of the frame
		    frame.setSize(350, 350);
		    
		    // set the rows and cols of the grid, as well the distances between them
		    GridLayout grid = new GridLayout(5, 3, 10, 10);
		    // what layout we want to use for our frame
		    frame.setLayout(grid);
		    
		    // add a text field with a specified text to the frame
		    JTextArea text = new JTextArea();
	        text.setText("KU Leuven");
	        text.setEditable(false);
	        frame.add(text);
		    
	        // add buttons to the frame
		    frame.add(new JLabel("Grid"));
		    frame.add(new JLabel("World"));
		    frame.add(new JLabel("Below"));

		   // arrayBtn = new JTextArea[10];
		    // add JLabels dynamically
		    for(int i=0; i < arrayBtn.length; i++) {
		    	String text1 = cellist[i].returnLivingEntitysAsSingleString();
		    	//arrayBtn[i] = new JLabel(Integer.toString(i));
		       	//arrayBtn[i] = new JLabel(String.cellist[0].displayLivingEntitysAsSingleString());
		    	arrayBtn[i] = new JLabel(text1);
		    	frame.add(arrayBtn[i]);
		    }//for loop ends
		    frame.setVisible(true);
		    
		    // add JLabels dynamicallyr loop ends
		   
		}// displayGUI ends
		
		
		public void run() {
			displayGUI();
	        while(true)
	        {
	                long time = System.currentTimeMillis();

	                //updateCertainEvents();// aging, money update, 
	                //showStateOfLandForHappenedEvent();
	               
	                //  delay for each frame  -   time it took for one frame
	                time = (100000 / fps) - (System.currentTimeMillis() - time);
	               
	                if (time > 0)
	                {
	                        try
	                        {
	                                Thread.sleep(time);
	                                for(int i=0; i < arrayBtn.length; i++) {
	                    		    	String text1 = cellist[i].returnLivingEntitysAsSingleString();
	                    		    	//arrayBtn[i] = new JLabel(Integer.toString(i));
	                    		       	//arrayBtn[i] = new JLabel(String.cellist[0].displayLivingEntitysAsSingleString());
	                    		    	arrayBtn[i].setText(text1);
	                    		    }
	                    		    frame.repaint();
	                        	    
	                                
	                        }
	                        catch(Exception e){}
	                }//end of if looop
	                
	        } //end of while loop
			
		} //run ends
		
		
	});
	
	//Earlier this was static but then I changed it to make it available to Grid
	static Grid[] cellist; // Declare a variable of type Student[].
	//public Grid[] cellist; // Declare a variable of type Student[].

	private void doSimulation() {
		/*
	    if (creatureVec.size() < 2) {
	      announce("You need at least 2 creatures. Please place more!");
	      return;
	    }
	    */
	    int steps = 0;
	    
	    /*
	    // read the text in the stepsField to find how many steps in the animation
	    try{
	      steps = Integer.parseInt(stepsField.getText().trim());
	    } catch (NumberFormatException ex) {
	    
		announce("Formatting error in Steps text field. Try again");
	      return;
	    }
	    announce("Running...");

         */
	    // loop for the right number of animation steps
	    for(int step = 1; step<=steps; step++) {

	      // display the Creatures at their new location
	     // world.consoleDisplay();
	    
	    }

	    
	    
	  }
	
	
	public static void main(String[] args) {
		p("Welcome to the world simulation");
		p("--------------------------------------------");
		p("");
		
		
		
		cellist = new Grid[16]; // The variable now points to an array.
		
		for ( int i = 0; i < 16; i++ ) {
			cellist[i] = new Grid("World Grid Cell Creation  ");
			}
		//Once we have done this, each classlist[i] points to an object of type Grid. If we want
		//to talk about the name of student number 3, we can use classlist[3].name. The average
		//for student number i can be computed by calling classlist[i].getAverage(). You can do
		//anything with classlist[i] that you could do with any other variable of type Student.
		
		p("Creating entities...");
		//Entity man = new Entity("Drogo", "Man", enum LIVING);
		//Entity man1 = new Entity("Drogo", "Man",true);
		//Entity woman1 = new Entity("Danerys", "Woman",true);
		//Entity child1 = new Entity("Faria", "Child",true);
		//Entity volcano1 = new Entity("HelenaVolcano",false);
		
		LivingEntity man0 = new LivingEntity("Drogo","Khal","Danerys",true, 50,Gender.MALE,5000,true,true,true,false);
		LivingEntity woman0 = new LivingEntity("Danerys","Khal","Drogo",true, 44,Gender.FEMALE,6000,true,true,true,false);
		LivingEntity child0 = new LivingEntity("Faria","Khal","",true, 10,Gender.FEMALE,100,true,false,true,false);
		//Entity child1 = new Entity("Faria", "Child",true);
		//if u use the following while doing  		cellist[0].registerEntity(volcano0);
		//then it gives an error -
		//Display non living entities as single string 
		//java.lang.ClassCastException: world.Entity cannot be cast to world.NonLivingEntity
		//Entity volcano0 = new Entity("HelenaVolcano",false);
		//So better use the following : 
		NonLivingEntity volcano0 = new NonLivingEntity("HelenaVolcano",false,NonLivingCategory.VOLCANO);
		
		/*
		Entity man2 = new Entity("Jack", "Man",true);
		Entity woman2 = new Entity("Rebecca", "Woman",true);
		Entity child2 = new Entity("Lilly", "Child",true);
		Entity volcano2 = new Entity("SumatraVolcano",false);
		*/
		LivingEntity man1 = new LivingEntity("Jack", "Man","Rebecca",true,35,Gender.MALE,15000,true,true,true,false);
		LivingEntity woman1 = new LivingEntity("Rebecca", "Woman","Jack",true,27,Gender.FEMALE,6000,true,true,true,false);
		LivingEntity child1 = new LivingEntity("Lilly", "Child","",true,8,Gender.FEMALE,100,true,false,true,false);
		//Entity volcano1 = new Entity("SumatraVolcano",false);
		NonLivingEntity volcano1 = new NonLivingEntity("SumatraVolcano",false,NonLivingCategory.VOLCANO);
		
		/*
		Entity man3 = new Entity("Lujian", "Man",true);
		Entity woman3 = new Entity("Li", "Woman",true);
		Entity child3 = new Entity("Chen", "Child",true);
		Entity casino3 = new Entity("CasinoDomino", false);
		*/
		LivingEntity man2 = new LivingEntity("Lujian", "Man","Li",true,32,Gender.MALE,17000,true,true,true,false);
		LivingEntity woman2 = new LivingEntity("Li", "Woman","Lujian",true,26,Gender.FEMALE,8000,true,true,true,false);
		LivingEntity child2 = new LivingEntity("Chen", "Child","",true,8,Gender.MALE,500,true,false,true,false);
		NonLivingEntity casino2 = new NonLivingEntity("CasinoDomino", false,NonLivingCategory.CASINO);
		
		LivingEntity man3 = new LivingEntity("Jack", "Man","Rebecca",true,37,Gender.MALE,37000,true,true,true,false);
		LivingEntity woman3 = new LivingEntity("Rebecca", "Woman","Jack",true,26,Gender.FEMALE,8000,true,true,true,false);
		
		//make Tom move and marry lisa
		LivingEntity man4 = new LivingEntity("Tom", "Man","",true,24,Gender.MALE,37000,true,false,true,true);
		LivingEntity woman4 = new LivingEntity("Selena", "Woman","",true,26,Gender.FEMALE,9000,true,false,true,true);
		
		LivingEntity man5 = new LivingEntity("Hugh", "Man","",true,23,Gender.MALE,18000,true,false,true,true);
		LivingEntity woman5 = new LivingEntity("Lisa", "Woman","",true,18,Gender.FEMALE,7000,true,false,true,true);
		
		
		//public LivingEntity(String firstName,String lastName,boolean livingType, int age,
			//boolean gender,int money,boolean sexualPref,boolean isMarried,boolean stillAlive,canMove){
		LivingEntity man7 = new LivingEntity("Keanu","Reeves","",true, 45, Gender.MALE,100,true,false,true,true);
		
		LivingEntity man8 = new LivingEntity("Arif", "Man","",true,30,Gender.MALE,18500,true,false,true,true);
		LivingEntity woman8 = new LivingEntity("Sarah", "Woman","",true,22,Gender.FEMALE,7000,true,false,true,true);
		
		LivingEntity man9 = new LivingEntity("Tauseef", "Man","",true,30,Gender.MALE,19500,true,false,true,true);
		LivingEntity woman9 = new LivingEntity("Kira", "Woman","",true,25,Gender.FEMALE,7500,true,false,true,true);
		
		LivingEntity man10 = new LivingEntity("Keith", "Man","",true,33,Gender.MALE,29500,true,false,true,true);
		LivingEntity woman10 = new LivingEntity("Somy", "Woman","",true,28,Gender.FEMALE,10500,true,false,true,true);
		
		LivingEntity man11 = new LivingEntity("Wasim", "Man","",true,27,Gender.MALE,29500,true,false,true,true);
		LivingEntity woman11 = new LivingEntity("Farah", "Woman","",true,24,Gender.FEMALE,10500,true,false,true,true);
		
		
		p("");
		
		p("Registering entities with cells of Grid...");
		//student1.registerForCourse(courseA);
		//student1.registerForCourse(courseB);
		//courseA.registerStudent(student2);
		
	
		cellist[0].registerEntity(man0);
		cellist[0].registerEntity(woman0);
		cellist[0].registerEntity(child0);
		cellist[0].registerEntity(volcano0);
		
		cellist[1].registerEntity(woman1);
		cellist[1].registerEntity(child1);
		cellist[1].registerEntity(man1);
		cellist[1].registerEntity(volcano1);
		
		
		cellist[2].registerEntity(man2);
		cellist[2].registerEntity(woman2);
		cellist[2].registerEntity(child2);
		cellist[2].registerEntity(casino2);
		
		cellist[3].registerEntity(man3);
		cellist[3].registerEntity(woman3);
		
		cellist[4].registerEntity(man4);
		cellist[4].registerEntity(woman4);
		
		cellist[5].registerEntity(man5);
		cellist[5].registerEntity(woman5);
		
		
		cellist[7].registerEntity(man7);
		//cellist[5].registerEntity(woman6);
		
		cellist[8].registerEntity(man8);
		cellist[8].registerEntity(woman8);
		
		cellist[9].registerEntity(man9);
		cellist[9].registerEntity(woman9);
		
		cellist[10].registerEntity(man10);
		cellist[10].registerEntity(woman10);

		cellist[11].registerEntity(man11);
		cellist[11].registerEntity(woman11);

		
		

		
		//cellist[2].registerEntity(man);
		
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
		System.out.println("Display living entities ");

		cellist[7].displayLivingEntitysAsSingleString();
		cellist[0].displayLivingEntitysAsSingleString();
		cellist[0].displayNonLivingEntitysAsSingleString();
		cellist[1].displayNonLivingEntitysAsSingleString();
		cellist[2].displayNonLivingEntitysAsSingleString();
	//	p("- courseA number of students: "+courseA.nrOfRegisteredStudents());
	//	p("- courseB number of students: "+courseB.nrOfRegisteredStudents());
		
		
		//simulation run
		//simulationRun1();
		GUIThread.start();
		simulationRun2();
		for (timeSteps = 200; timeSteps > 0; timeSteps--) {

			System.out.println("For loop time step time Step "+timeSteps );
				if(timeSteps ==0){
				continue;
				}

			}
		isRunning = false;
		
		//call for 2D display in main()
		


		
		//simulationRun2();
		
		
	}//main ends here
	
	//method for printing a given String to the console
	static void p(String l) {
		System.out.println(l);
	}
	
	//event driven vs time driven simulation
	//http://artemis.wszib.edu.pl/~sloot/1_4.html
	//http://www.cs.toronto.edu/~heap/270F02/node51.html
	static void simulationRun1(){
		
		//http://stackoverflow.com/questions/26953460/75-probability-in-java?lq=1
		Random rand = new Random();
		for (int i = 100; i >0; i--) {

			 
			 int val = rand.nextInt(4) + 1;
			 if (val == 1) { 
				 // <-- 1/4 of the time.
				 System.out.println("1/4 probability event happens with val of i= "+i );
			 } else { // <-- 3/4 of the time.
				 System.out.println("3/4 probability event happens with val of i= val= "+i);
				 System.out.println("number generated is  val= "+val);
			 }

			 //System.out.println( cellist[i].registeredEntitys.man.firstName );
			}
		
	
	}
	
	//http://compsci.ca/v3/viewtopic.php?t=25991
	static void simulationRun2(){
	        //initialize();
	       
	        while(isRunning)
	        {
	                long time = System.currentTimeMillis();
	                System.out.println("simulation Run time Step "+timeSteps );
	                makeEventHappen();
	                updateCertainEvents();// aging, money update, 
	                //showStateOfLandForHappenedEvent();
	               
	                //  delay for each frame  -   time it took for one frame
	                time = (100000 / fps) - (System.currentTimeMillis() - time);
	               
	                if (time > 0)
	                {
	                        try
	                        {
	                                Thread.sleep(time);
	                        }
	                        catch(Exception e){}
	                }
	                
	        }
	       
	        //setVisible(false);
	} //end of simulationRun2
	
	static void makeEventHappen(){
		
		Event gridEvent = new Event();
		Random rand = new Random();
		//System.out.println("makeEventHappen");
		
		
		 int randomNumber = rand.nextInt(12) ;
		 int newtestno = 12;
		System.out.println("random no"+randomNumber);
		 /*
		 if (val == 1) { 
			 // <-- 1/4 of the time.
			 System.out.println("1/4 probability event happens with val =1" );
		 } else { // <-- 3/4 of the time.
			 System.out.println("3/4 probability event happens  ");
			 System.out.println("number generated is  val= "+val);
		 }
		 
		 */
		 
		 //http://stackoverflow.com/questions/12358968/how-do-i-generate-random-letters-in-java-based-on-probability?rq=1
		
		 switch (randomNumber)
		 {
		     case 0:
		    	 System.out.println("Marriage Event Happen");	 
		    	 cellist[0].displayEntitysAsSingleString();
		//    	 int rnd = new Random().nextInt(Grid.listOfGridsWithMarriagePossibility.length);
		    	 int random = Grid.listOfGridsWithMarriagePossibility.get(new Random().nextInt(Grid.listOfGridsWithMarriagePossibility.size()));
		    	 System.out.println("random grid chosen for marriage :"+random);
		    	 cellist[random].marriageEventHappen();
		         //decide that you want J
		     break;
		     case 1:
		    	 
		     case 2:
		     case 3:
		     case 4:
		      
		    	 System.out.println("Movement of People Event Happen $$");
		    	 // from the list of grid lands, keep list of ppl who r single, without a  family
		    	 //choose a land from above such list, move any person
		    	 //gettwo randomNo
		    	 int noOfGridFrom = rand.nextInt(16) ;
		    	 cellist[noOfGridFrom].displayLivingEntitysAsSingleString();
		    	// int noOfGridTo = noOfGridFrom + 1;
		    	 int noOfGridTo = rand.nextInt(16) ;
		    	 //int noOfGridTo = 0;
		    	 Grid fromObj,ToObj;
		    	 fromObj = cellist[noOfGridFrom];
		    	 ToObj = cellist[noOfGridTo];
		    	 cellist[noOfGridFrom].checkAndMovePpl(fromObj,ToObj);
		    	 //cellist[noOfGridFrom].displayLivingEntitysAsSingleString();
		    	 cellist[noOfGridTo].displayLivingEntitysAsSingleString();

		    	 
		    	 //checkIfPPlCanMove
		    	 //movePPl
		  
		     case 5:
		     case 6:
			      
		    	 System.out.println("Casino Visit Event Happen");
		    	 break;
		    	 
		
		    	 
		  
		     case 7:
		     case 8:
			      
		    	 System.out.println("Childbirth Event Happen");
		    	 
		    	 
		    	 break;
		    	 
		    	 
		    	 
		     case 9:
		    	 System.out.println("Death Event Happen");
		    	 break;
		    	 
		    	 
		    	 
		     case 10:
		    	 System.out.println("Volcanic Eruption Event Happen");
		    	 //get list of grid ids that have volcano
		    	 int[] volcanoGridIds = new int[2];// = "NULL";
		    	 int j = 0;
		    	 int list;
		    	 for (int i = 0; i < cellist.length; i++) {
		    		 list = cellist[i].getListOfVolcanoGrids();
		    		 if (list >=0){
		    			 //http://stackoverflow.com/questions/13511702/int-array-initialization
		    			// while using volcanoGridIds[j] = list;
		    			// I face an error : local var volcanoGridIds may not have been intialised
		    			 volcanoGridIds[j] = list;
		    			 System.out.println("volcanoGridIds[j] added :"+list);
		    			 j++;
		    			 
		    		 };
		    	 }
		    	 //choose a random numbers
		    	 int randomVolcano = rand.nextInt(j) ;
		    	 //erupt theh volcano for the chose random number
		    	 System.out.println("Volcano Erupt on grid"+volcanoGridIds[randomVolcano]);
		    	 cellist[volcanoGridIds[randomVolcano]].displayLivingEntitysAsSingleString();
		    	 cellist[volcanoGridIds[randomVolcano]].unregisterPeopleDueToVolcanicEruption();
		    	 //continue;
		    	 
		     case 11:
			      
		    	 System.out.println("Murder Event Happen");
		    	 break;
		     case 12:
		    	 System.out.println("Falling Piano Event Happen");
		    	 
		    
		     break;
		 }
	
	} //end of makeEventHappen
	
	static void updateCertainEvents(){
		
		//Event gridEvent = new Event();
	
		// increase age of all entities by 1;
		 cellist[0].showGridsWithMarriageablePeople();
	
		for (int i = 0; i < cellist.length; i++) {

			 cellist[i].updateAgeOfAllLivingEntities();
			 cellist[i].updateMarriagePropertyOfEntities();
			 //cellist[i].showGridsWithMarriageablePeople();
			 cellist[i].refreshListForGridsWithMarriageablePeople();
			 
			// cellist[i].displayMaleEntities();
			 //a child grows and then when he reaches age of 18 can choose to marry
			 //so set sexual preferences
			 // earn money in each step
			 //lose money in each step
			 //death for some in each step
			 cellist[i].naturalDeathForCertainLivingEntities();
			 

			}
		

	
	}

}

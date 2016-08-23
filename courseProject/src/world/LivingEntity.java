package world;
import java.lang.annotation.*;

import world.Program.Gender;

public class LivingEntity extends Entity {
	private int eAge;
	//private boolean eGender;
	Gender eGender;
	private int eMoney;
	private boolean eSexualPref;
	private boolean eIsMarried;
	private boolean eStillAlive;
	private boolean eCanMove;
	LivingEntity pObjLivEnt;
	//Gender gender;


	 //http://stackoverflow.com/questions/16620354/difference-between-null-and-empty-string
	public LivingEntity(String firstName,String lastName,String spouseFirstName,boolean livingType, int age, Gender gender,int money,boolean sexualPref,boolean isMarried,boolean stillAlive,boolean canMove){
	//super(firstName,lastName,livingType,pObjLivEnt);
	super(firstName,lastName,spouseFirstName,livingType);//invokes the appropriate constructor of class Entity
	this.setAge(age);
	this.setGender(gender);
	this.setMoney(money);
	this.setSexualPref(sexualPref);
	this.setMaritalStatus(isMarried);
	this.setLivingStatus(stillAlive);
	this.setMovementStatus(canMove);
	
	
	}
	
	
	
	
	
	public void setAge(int age){
		this.eAge = age;
	}
	public int getAge(){
		return eAge;
	}
	
	public void setGender(Gender gender){
		
		this.eGender = gender;
	}
	
	public  String getGender(){
		if (this.eGender == Gender.MALE){
		return "MALE";
		}
		else
			return "FEMALE";
	}
	
	
	public void setMoney(int money){
		this.eMoney = money;
	}
	public int getMoney(){
		return eMoney;
	}
	
	public void setSexualPref(boolean sexualPref){
		this.eSexualPref = sexualPref;
	}
	public boolean getSexualPref(){
		return eSexualPref;
		
	}
	
	public void setMaritalStatus(boolean isMarried){
		this.eIsMarried = isMarried;
		this.eSexualPref = false;
	}
	public boolean getMaritalStatus(){
		return eIsMarried;
			
	}
	
	public void setLivingStatus(boolean stillAlive){
		this.eStillAlive = stillAlive;
	}
	public boolean getLivingStatus(){
		return eStillAlive;
			
	}
	
	public void setMovementStatus(boolean canMove){
		this.eCanMove = canMove;
	}
	public boolean getMovementStatus(){
		return eCanMove;
			
	}
	
	public void increaseAge(){
		this.eAge++;
	}

	
	//@Override
	//public
	
	
	

}

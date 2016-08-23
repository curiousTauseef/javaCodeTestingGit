package world;

import world.Program.Gender;
import world.Program.NonLivingCategory;

public class NonLivingEntity extends Entity {
	
	NonLivingCategory eCategory;
	
	public NonLivingEntity(String firstName,boolean livingType,NonLivingCategory category){
	//super(firstName,lastName,livingType,pObjLivEnt);
	super(firstName,livingType);
	
	this.setCategory(category);
	
	
	/*
	this.setCategory(age);
	this.setGender(gender);
	this.setMoney(money);
	this.setSexualPref(sexualPref);
	this.setMaritalStatus(isMarried);
	this.setLivingStatus(stillAlive);
	this.setMovementStatus(canMove);
	*/
	
	
	}
	
	public void setCategory(NonLivingCategory category){
		
		this.eCategory = category;
	}
	
	
	public  String getCategory(){
		if (this.eCategory == NonLivingCategory.VOLCANO){
		return "VOLCANO";
		}
		else if(this.eCategory == NonLivingCategory.CASINO){
			return "CASINO";
		}
		else
			return "PIANO";	
			
	}
	
	
	

}

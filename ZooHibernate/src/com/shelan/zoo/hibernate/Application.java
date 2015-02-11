package com.shelan.zoo.hibernate;

import java.util.Date;

import org.hibernate.Session;

import com.shelan.zoo.objects.Animal;
import com.shelan.zoo.objects.CageAllocation;
import com.shelan.zoo.util.HibernateUtilities;

public class Application {
	
	static Session session;
	
	public static void main(String[] args) {
		session=HibernateUtilities.getSessionFactory().openSession();
		
		session.beginTransaction();
		saveData();
		lodaData();
		session.getTransaction().commit();
		session.close();
		
		HibernateUtilities.getSessionFactory().close();
	}
	
	static void saveData(){
		Animal animal=new Animal();
		animal.setAnimalName("Sunila");
		animal.setAnimalAge(5);
		animal.setAnimalType("Tiger");
		animal.getCage().setCageNumber(1100);
		animal.getCage().setLocation("Grave Area");
		animal.getCageAllocations().add(new CageAllocation(new Date(), new Date(), "Cage Maintance"));
		session.save(animal);
		
		Animal animal1=new Animal();
		animal1.setAnimalName("Raaja");
		animal1.setAnimalAge(10);
		animal1.setAnimalType("Elephant");
		animal1.getCage().setCageNumber(2100);
		animal1.getCage().setLocation("Open Area");
		animal1.getCageAllocations().add(new CageAllocation(new Date(), new Date(), "New Open Area 2"));
		session.save(animal1);
		
	}
	
	static void lodaData(){
		Animal animal=(Animal) session.get(Animal.class, 1);
		animal.getCageAllocations().add(new CageAllocation(new Date(), new Date(), "Relocated to Previous"));
		System.out.println(animal.getAnimalName()+" - " +animal.getAnimalType()+" - "+animal.getAnimalAge());
		
		for (CageAllocation cageAllocation : animal.getCageAllocations()) {
			System.out.println(cageAllocation.getAllocatedDate() + " - " +cageAllocation.getDeAllocatedDate()+ " - "+ cageAllocation.getReason());
		}
	}
	
	
	
	

}

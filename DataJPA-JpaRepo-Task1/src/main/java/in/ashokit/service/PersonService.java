package in.ashokit.service;


import in.ashokit.Entity.Person;

import in.ashokit.repo.PersonRepo;

public class PersonService {
	
private PersonRepo personRepo;

public PersonService(PersonRepo repo) {
	this.personRepo=repo;
  }

public void savePerson() {
	System.out.println("Impl class:"+ personRepo.getClass().getName());
	
	Person p=new Person();
	
	p.setPid(11);
	p.setPname("mani");
	p.setGender("male");
	p.setDOB(01-01-2003);
	p.setPhoto(null);
	p.setResume(null);
	//inserting record based on given object
	personRepo.save(p);
	
	System.out.println("record saved...");
}

	
}




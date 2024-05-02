package in.ashokit.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import in.ashokit.PersonRepo;
import in.ashokit.entity.Person;
import in.ashokit.entity.PersonPK;

@Service
public class PersonService {
	@Autowired
	private PersonRepo personRepo;
	
	public void getPerson() {
		PersonPK pks=new PersonPK();
		pks.setPersonid(101);
		pks.setPassportNum("JKI2579YU");
		
	Optional<Person>findById=personRepo.findById(pks);
	
	if(findById.isPresent()) {
		Person person=findById.get();
		System.out.println(person);
	}
	}
	
	public void savePerson() {
		
		PersonPK pks=new PersonPK();
		pks.setPersonid(101);
		pks.setPassportNum("JKI2579YU");
		
		Person  p=new Person();
		p.setName("siri");
		p.setGender("female");
		p.setEmail("siri123@gmail.com");
		
		p.setPersonPK(pks);
		
		 personRepo.save(p);
		
		System.out.println("person saved...");
	}
	

}

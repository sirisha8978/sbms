package in.ashokit.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Passport;
import in.ashokit.entity.Person;
import in.ashokit.repo.PassPortRepository;
import in.ashokit.repo.PersonRepository;

@Service
public class PersonService {
	@Autowired 
   private PersonRepository personRepo;
	@Autowired
	private PassPortRepository passportRepo;
	
public void savePerson(){
	   Person p =new Person();
	   p.setName("sri");
	   p.setGender("female");
	   
	   //associating person with  passport
	   Passport pp=new Passport();
	   pp.setPassportNum("HI78y635");
	   pp.setIssuedDate(LocalDate.now());
	   pp.setExpdate(LocalDate.now().plusYears(10));
	   
	   //associating  passport with person
	   p.setPassport(pp);
	   pp.setPerson(p);
	   
	   //saving person record (parent)
	   personRepo.save(p);
	   
	   System.out.println("records inserted....");
   }

public void getperson() {
	personRepo.findById(1);
}	
	
}




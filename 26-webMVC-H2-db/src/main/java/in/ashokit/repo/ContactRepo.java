package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ashokit.entity.Contact;

@Repository
public interface ContactRepo extends JpaRepository<Contact,Integer> {

}

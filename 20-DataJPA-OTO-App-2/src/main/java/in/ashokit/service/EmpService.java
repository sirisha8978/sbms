package in.ashokit.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Address;
import in.ashokit.entity.Emp;
import in.ashokit.repo.AddressRepo;
import in.ashokit.repo.EmpRepo;

@Service
public class EmpService {

    @Autowired
    private EmpRepo empRepo;

    @Autowired
    private AddressRepo addrRepo;

  //  public void deleteEmp() {
   //     empRepo.deleteById(1); // deletes an employee by ID along with associated addresses
   // }

    public void getAddress() {
        addrRepo.findById(1); // retrieves an address by ID along with associated employee information
    }

    public void getEmp() {
        Optional<Emp> findById = empRepo.findById(1); // retrieves an employee by ID along with associated addresses
        if (findById.isPresent()) {
            Emp emp = findById.get();
            List<Address> addrList = emp.getAddrList();
        }
    }

    public void saveEmployee() {
        // Creating an employee
        Emp e = new Emp();
        e.setEname("madhu");
        e.setEsal(12000.00);

        // Creating addresses
        Address a1 = new Address();
//        a1.setCity("Hyd");
 //       a1.setState("TG");
//        a1.setCountry("India");
//        a1.setType("Present");

//        Address a2 = new Address();
//        a2.setCity("GNT");
//        a2.setState("AP");
//        a2.setCountry("India");
//        a2.setType("Permanent");
//
//        // Setting parent to child (associating addresses with employee)
//        a1.setEmp(e);
//        a2.setEmp(e);

        // Setting child addresses to parent employee
  //      e.setAddrList(Arrays.asList(a1, a2));

        // Saving the parent record (employee) along with associated addresses
        empRepo.save(e);
    }
}

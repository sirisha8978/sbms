package in.ashokit.repo;

import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Integer> {

}

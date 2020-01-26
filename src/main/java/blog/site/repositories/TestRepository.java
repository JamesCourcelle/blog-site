package blog.site.repositories;

import blog.site.entities.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TestRepository extends MongoRepository<Customer, String> {
    public Customer findByFirstName(String firstName);
    public List<Customer> findByLastName(String lastName);
}

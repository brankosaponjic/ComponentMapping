package brankosaponjic.componentmapping.repository;

import brankosaponjic.componentmapping.entity.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
}

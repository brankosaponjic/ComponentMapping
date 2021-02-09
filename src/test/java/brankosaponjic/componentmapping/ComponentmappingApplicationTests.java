package brankosaponjic.componentmapping;

import brankosaponjic.componentmapping.entity.Address;
import brankosaponjic.componentmapping.entity.Employee;
import brankosaponjic.componentmapping.repository.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ComponentmappingApplicationTests {

    @Autowired
    EmployeeRepository employeeRepository;

    @Test
    void testCreate() {
        Employee employee = new Employee();
        employee.setId(123);
        employee.setName("Jason");
        Address address = new Address();
        address.setStreet("West 6th Street");
        address.setCity("Austin");
        address.setState("TEXAS");
        address.setCountry("USA");
        address.setZipCode("78750");
        employee.setAddress(address);
        employeeRepository.save(employee);
    }

}

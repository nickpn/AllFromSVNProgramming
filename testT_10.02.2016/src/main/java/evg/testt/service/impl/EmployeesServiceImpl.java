package evg.testt.service.impl;

import evg.testt.dao.EmployeeDao;
import evg.testt.model.Employee;
import evg.testt.service.EmployeesService;
import org.springframework.stereotype.Service;

@Service
public class EmployeesServiceImpl extends BaseService<Employee, EmployeeDao> implements EmployeesService {

}

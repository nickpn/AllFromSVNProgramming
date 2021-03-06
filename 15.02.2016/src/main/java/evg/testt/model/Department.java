package evg.testt.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.CascadeType;
import java.util.*;

@Entity(name = "department")
public class Department extends BaseModel{

    private String name;

    @OneToMany(cascade = CascadeType.REMOVE, fetch = FetchType.EAGER, mappedBy = "department")

    private Set <Employee> employees;

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

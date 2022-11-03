package rest.dao;

import rest.entity.Employees;

import java.util.List;
public interface EmployeeDAO {
    public List<Employees> getAllEmployees() ;

    public void setEmployee(Employees employee);

    public Employees getEmployee(int id);

    public void deleteEmployee(int id);
}

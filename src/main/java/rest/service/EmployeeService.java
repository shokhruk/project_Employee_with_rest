package rest.service;

import rest.entity.Employees;

import java.util.List;

public interface EmployeeService {

    public List<Employees> getAllEmployees();

    public void setEmployee(Employees employee);

    public Employees getEmployee(int id);

    public void deleteEmployee(int id);
}

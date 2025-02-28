package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.impl.DepartmentDaoJDBC;
import model.entities.Department;

import java.sql.Connection;
import java.util.List;


public class Program2 {
    public static void main(String[] args) {
        DepartmentDao depDao = DaoFactory.CreateDepartmentDao();

        System.out.println("=== Test 1: department findById ===");
        Department depById = depDao.findById(3);
        System.out.println(depById);

        System.out.println("\n=== Test 2: department findAll ===");
        List<Department> allDep = depDao.findAll();

        for(Department dep : allDep) {
            System.out.println(dep);
        }

        System.out.println("\n=== Test 3: department deleteById ===");
        depDao.deleteById(1);
        System.out.println("Successfully deleted!");

        System.out.println("\n=== Test 4: department update ===");
        depById.setName("Games");
        depDao.update(depById);
        System.out.println("Update completed!");

        System.out.println("\n=== Test 5: department insert ===");
         Department newDep = new Department(null, "Food");
         depDao.insert(newDep);
        System.out.println("Inserted! New id = " + newDep.getId());
    }
}

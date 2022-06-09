package application;

import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("==== TESTE 1 : Department insert ====");
		Department newDepartment = new Department(null, "Music");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! new department: " + newDepartment.getId() + " - " + newDepartment.getName());
		System.out.println();
		
		System.out.println("==== TESTE 2 : Department update ====");
		newDepartment = departmentDao.findById(5);
		newDepartment.setName("Adm");
		departmentDao.update(newDepartment);
		System.out.println("Update completed");
		System.out.println();
		
		System.out.println("=== TESTE 3: Department findById ====");
		Department dep = departmentDao.findById(3);
		System.out.println(dep);
		System.out.println();
		
		System.out.println("=== TESTE 4: Department findAll ====");
		List<Department> list = new ArrayList<>();
		list = departmentDao.findAll();
		for (Department obj : list) {
			System.out.println(obj);
		}

	}

}

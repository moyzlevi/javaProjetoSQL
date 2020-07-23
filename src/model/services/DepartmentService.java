package model.services;

import java.util.ArrayList;
import java.util.List;

import model.entities.Department;

public class DepartmentService {
	
	public List<Department> findAll(){
		//mockData
		List<Department> ls = new ArrayList<>();
		ls.add(new Department(1, "Youtubers"));
		ls.add(new Department(2, "Streamers"));
		ls.add(new Department(3, "Developers"));
		
		return ls;
	}
}

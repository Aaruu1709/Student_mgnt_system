package com.Aaruu.StudentManagementSystem.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Aaruu.StudentManagementSystem.entity.Student;
import com.Aaruu.StudentManagementSystem.service.StudentService;
@Service
public class ServiceImpl implements StudentService{

	@Autowired
	com.Aaruu.StudentManagementSystem.repository.StudentRepository StudentRepository;
	@Override
	public List<Student> getAllStudents() {
		List<Student>list=StudentRepository.findAll();
		return list;
	}
	@Override
	public Student saveStudent(Student student) {
		return StudentRepository.save(student);	}
	@Override
	public Student getById(int id) {
		return StudentRepository.findById(id).get();
	}
	@Override
public void deleteById(int id) {
		StudentRepository.deleteById(id);
	}
	
	
	

}

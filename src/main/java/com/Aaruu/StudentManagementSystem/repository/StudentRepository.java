package com.Aaruu.StudentManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Aaruu.StudentManagementSystem.entity.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}

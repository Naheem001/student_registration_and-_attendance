package com.student.springboot.studentreg.datajpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.student.springboot.studentreg.entity.StudentRegistration;

@RepositoryRestResource(path="registrations")
public interface StudentRepository extends JpaRepository<StudentRegistration, Integer>{

}

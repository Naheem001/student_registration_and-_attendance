package com.student.springboot.studentreg.datajpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.student.springboot.studentreg.entity.StudentAttendance;

@RepositoryRestResource(path="attendances")
public interface StudentAttendanceRepository extends JpaRepository<StudentAttendance, Integer> {

}

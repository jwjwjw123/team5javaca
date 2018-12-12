package sg.iss.team5.service;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sg.iss.team5.model.Course;
import sg.iss.team5.repository.StudentRepository;
import sg.iss.team5.repository.UserRepository;


@Service
public class AdminServiceImpl implements AdminService {

	@Resource
	StudentRepository studentRepository;
	@Resource
	UserRepository userRepository;

	@Override
	public ArrayList<Course> findAllStudents() {
		return studentRepository.findAllStudents();
	}

	@Override
	@Transactional
	public Course findStudent(String sid) {
		Course student = studentRepository.findStudentById(sid);
		System.out.println(student.toString());
		return student;
	}

	@Override
	public Course createStudent(Course s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Course updateStudent(Course s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeStudent(Course s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Course> findStudentsByCriteria(Course student) {
		// TODO Auto-generated method stub
		return null;
	}

}
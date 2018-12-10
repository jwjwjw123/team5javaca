package sg.iss.team5.service;

import java.util.ArrayList;
import java.util.Date;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import sg.iss.team5.model.Module;
import sg.iss.team5.model.Student;
import sg.iss.team5.model.Studentcourse;
import sg.iss.team5.repository.ModuleRepository;
import sg.iss.team5.repository.StudentRepository;
import sg.iss.team5.repository.StudentcourseRepository;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

	@Resource
	private StudentcourseRepository studentcourseRepository;
	private ModuleRepository moduleRepository;
	
	public ArrayList<Studentcourse> findCourseByStudentId(String sid){
		return studentcourseRepository.findCourseByStudentId(sid);
	}
	
	public int saveStudentCourse(Studentcourse sc) {
		studentcourseRepository.save(sc);
		return 1;
	}
	
	public ArrayList<Module> findAllModule(){
		return (ArrayList<Module>)moduleRepository.findAll();
	}
	
	public ArrayList<Module> findModuleByStudentId(String sid){
		return moduleRepository.findModuleByStudentId(sid);
	}
	
	public ArrayList<Module> findModulebyAcademicYear(Date d){
		return moduleRepository.findModuleByAcademicYear(d);
	}
}

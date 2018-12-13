package sg.iss.team5.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sg.iss.team5.model.Module;
import sg.iss.team5.model.Student;
import sg.iss.team5.model.Studentcourse;
import sg.iss.team5.repository.ModuleRepository;
import sg.iss.team5.repository.StudentRepository;
import sg.iss.team5.repository.StudentcourseRepository;

@Service
//@Transactional
public class LecturerServiceImpl implements LecturerService {

	@Autowired
	private StudentcourseRepository studentcourseRepository;
	@Autowired
	private ModuleRepository moduleRepository;
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public ArrayList<Module> findModuleByLecturerId(String lid) {
		// TODO Auto-generated method stub
		return moduleRepository.findModuleByLecturerId(lid);
	}

	@Override
	public int gradeCourse(Studentcourse sc) {
		// TODO Auto-generated method stub
		studentcourseRepository.saveAndFlush(sc);
		return 1;
	}

	@Override
	public ArrayList<Module> findModuleByAcademicYear(Date year) {
		// TODO Auto-generated method stub
		return moduleRepository.findModuleByAcademicYear(year);
	}

	@Override
	public ArrayList<Module> findAllModule() {
		// TODO Auto-generated method stub
		return (ArrayList<Module>) moduleRepository.findAll();
	}

	@Override
	public Double findLecturerRatingByModuleId(String mid) {
		return studentcourseRepository.findLecturerRatingByModuleId(mid);
	}

	@Override
	public String findAttendanceByModuleId(String mid) {
		return studentcourseRepository.findAttendanceByModuleId(mid);
	}

	@Override
	public ArrayList<Studentcourse> findCourseByModuleId(String mid) {
		return (ArrayList<Studentcourse>) studentcourseRepository.findByModule_ModuleIDContaining(mid);
	}

	@Override
	public ArrayList<Module> findModuleIdbyLectid(String lid) {
		return (ArrayList<Module>) moduleRepository.findModuleByLecturerId(lid);
	}
	
	@Override
	public ArrayList<Studentcourse> findAllStudentcourse() {
		return studentcourseRepository.findAllStudentcourse();
	}

	@Override
	public Module findModuleByModuleID(String mid) {
		return moduleRepository.findByModuleID(mid);
	}

	@Override
	public Studentcourse createStudentcourse(Studentcourse studentcourse) {
		return studentcourseRepository.save(studentcourse);
	}
	
	
	@Override
	public ArrayList<Module> findPastModuleByLectId(String lid) {
		// TODO Auto-generated method stub
		return (ArrayList<Module>) moduleRepository.findPastModuleByLectId(lid);
	}

	@Override
	public Module updateModule(Module module) {
		return moduleRepository.save(module);
	}

	@Override
	public ArrayList<String> getAllModuleID() {
		return moduleRepository.getAllModuleID();
	}

	@Override
	public Student findStudentByStudentID(String sid) {
		return studentRepository.findByStudentID(sid);
	}

	@Override
	public Studentcourse findStudentcourseByPK(String sid, String mid) {
		return studentcourseRepository.findFirstByModule_ModuleIDAndStudent_StudentID(mid, sid);
	}
	@Override
	public ArrayList<Studentcourse> findModulesByLecturerId(String lid) {
		return (ArrayList<Studentcourse>) studentcourseRepository.findModulesByLecturerId(lid);
	}

	@Override
	public ArrayList<Module> findCurentModuleByLectId(String lid) {
		return (ArrayList<Module>) moduleRepository.findCurentModuleByLectId(lid);
	}

	@Override
	public ArrayList<String> getAllModuleIDForCurrentYear() {
		ArrayList<String> mList = new ArrayList<String>();
		ArrayList<String> newList = new ArrayList<String>();
		mList = moduleRepository.getAllModuleID();
		DateFormat df = new SimpleDateFormat("yy"); 
		String formattedDate = df.format(Calendar.getInstance().getTime());
		int num = mList.size();
		for (int i=0; i < num; i++) {
			if (mList.get(i).substring(2, 4).equals(formattedDate)){
				newList.add(mList.get(i));
			}
		}
		return newList;
	}
	

}
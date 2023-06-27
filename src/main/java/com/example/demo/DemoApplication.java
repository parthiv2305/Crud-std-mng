package com.example.demo;

import com.example.demo.dao.StudentRepository;
import com.example.demo.entities.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

		StudentRepository studentRepository = context.getBean(StudentRepository.class);

//		Create new student
		Student student = new Student();
		student.setFirstName("Abc");
		student.setLastName("Xyz");
		student.setEmail("abc@gmail.com");

		Student stud = studentRepository.save(student);

		System.out.println("Id : "+student.getId()+"\nFirst Name : "+ student.getFirstName()+"\nLast Name : "+ student.getLastName()+"\nEmail : "+ student.getEmail());

		Student student1=new Student();
		student1.setFirstName("Hello");
		student1.setLastName("Java");
		student1.setEmail("hello@gmail.com");

		Student student2=new Student();
		student2.setFirstName("Hello1");
		student2.setLastName("Java1");
		student2.setEmail("hello1@gmail.com");

//		Saving single student
		Student resStudent = studentRepository.save(student1);

//		List<Student> mulstudent=List.of(student1,student2);
//		Iterable<Student> res=studentRepository.saveAll(mulstudent);
//
//		res.forEach(student ->{
//			System.out.println(student);
//		});


//		Update student using id
//		Optional<Student> optional= studentRepository.findById(2L);
//		Student student = optional.get();
//
//		student.setFirstName("AAA");
//		student.setLastName("BBB");
//		student.setEmail("AAA@gmail.com");
//
//		studentRepository.save(student);

//		How to get all data using findAll
//		Iterable<Student> itr = studentRepository.findAll();
//		itr.forEach(student -> {
//			System.out.println(student);
//		});

//		Deleting the student
//		studentRepository.deleteById(4l);
//		System.out.println("Student Deleted..!!!");

	}

}

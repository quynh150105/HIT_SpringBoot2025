package org.spring.btvn_buoi3.Controller;

import org.spring.btvn_buoi3.Entity.Student;
import org.spring.btvn_buoi3.Repository.StudentRepository;
import org.spring.btvn_buoi3.Service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class StudentController {

    private final StudentRepository studentRepository;
    private StudentService studentService;

    public StudentController(StudentService studentService, StudentRepository studentRepository) {
        this.studentService = studentService;
        this.studentRepository = studentRepository;
    }

    // select
    @GetMapping("/")
    public String getStudents(Model model) {
        List<Student> students = studentService.selectAllStudents();
        model.addAttribute("students", students);
        return "index";
    }

    //hien form nhap
    @GetMapping("/add")
    public String showAddStudentForm(Model model) {
        model.addAttribute("student", new Student());
        return "add";
    }

    // lưu data
    @PostMapping("/save")
    public String saveStudent(@ModelAttribute("student") Student student) {
        studentService.saveStudent(student);
        return "redirect:/";
    }

    //hien form edit
    @GetMapping("/edit/{id}")
    public String EditForm(@PathVariable Long id, Model model) {
        Student student = studentRepository.findById(id).orElse(null);
        model.addAttribute("student",student);
        return "edit";
    }

    // lưu data
    @PostMapping("/edit/{id}")
    public String editStudent(@PathVariable Long id, @ModelAttribute("student") Student student) {
        Student students = studentRepository.findById(id).orElse(null);
        if (students != null) {
            students.setName(student.getName());
            students.setEmail(student.getEmail());
            students.setPhone(student.getPhone());
            students.setAddress(student.getAddress());
            studentRepository.save(student);
        }
        return "redirect:/";
    }

    // xóa
    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable("id") Long id) {
        studentRepository.deleteById(id);
        return "redirect:/";
    }
}

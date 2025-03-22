package org.spring.btvn_buoi2.Controller;

import jakarta.servlet.http.HttpServletRequest;
import org.spring.btvn_buoi2.Entity.Employee;
import org.spring.btvn_buoi2.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("")
    public String home(){
        return "index";
    }


    @GetMapping("/select")
    public String select(Model model) {
        List<Employee> employees = employeeService.getEmployees();
        model.addAttribute("employees", employees);
        return "employee-list";
    }

    @PostMapping("/insert")
    public String insert(@ModelAttribute Employee employee) {
        employeeService.createEmployee(employee);
        return "redirect:/employees/select";
    }

    @PostMapping("/update")
    public String updateEmployee(@ModelAttribute Employee employee) {
        employeeService.updateEmployee(employee);
        return "redirect:/employees/select"; // Trở về danh sách sau khi cập nhật
    }

    @GetMapping("/delete")
    public String deleteEmployee(@RequestParam("id") String id) {
        employeeService.deleteEmployee(id);
        return "redirect:/employees/select";
    }



}

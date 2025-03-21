package org.spring.btvn_buoi2.Controller;

import org.spring.btvn_buoi2.Entity.Employee;
import org.spring.btvn_buoi2.Service.EmployeeService;
import org.spring.btvn_buoi2.Service.impl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/select")
    public String getEmployee(Model model) {
        List<Employee> list = employeeService.getEmployees();
        model.addAttribute("employees", list);
        return "employees";
    }

    @GetMapping("/insert")
    public String insertEmployee(@ModelAttribute Employee employee){
        employeeService.createEmployee(employee);
        return "redirect:/employees";
    }

    @GetMapping("/update")
    public String updateEmployee(@ModelAttribute Employee employee){
        employeeService.updateEmployee(employee);
        return "redirect:/employees";
    }

    @GetMapping("/delete")
    public String deleteEmployee(@ModelAttribute Employee employee){
        employeeService.deleteEmployee(employee.getId());
        return "redirect:/employees";
    }



}

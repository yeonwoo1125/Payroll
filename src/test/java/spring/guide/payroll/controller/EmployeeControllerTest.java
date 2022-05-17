package spring.guide.payroll.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.transaction.annotation.Transactional;
import spring.guide.payroll.entity.Employee;
import spring.guide.payroll.entity.repository.EmployeeRepository;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

@SpringBootTest
@AutoConfigureMockMvc
class EmployeeControllerTest {

    @Autowired
    EmployeeRepository repository;

    MockMvc mockMvc;

    @Test
    void all() {

    }

    @Test
    void newEmployee() {

    }

    @Test
    void one() {

    }

    @Test
    void replaceEmployee() {
    }

    @Test
    void deleteEmployee() {
    }
}
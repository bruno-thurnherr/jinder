package ch.abbts.nds.swe.swdt.jinder.nottdd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    @DisplayName("Check if the employee is older")
    void isOfAge() {

        Employee employee = new Employee(55);
        boolean result = employee.isOfAge(60);

        assertFalse((result),"The employee should be older");
    }

    @Test
    @DisplayName("Check if the employee is same age")
    void isSameAge() {

        Employee employee = new Employee(55);
        boolean result = employee.isOfAge(55);

        assertFalse((result),"The employee should same age");
    }

    @Test
    @DisplayName("Check if the employee too young")
    void isTooYoung() {

        Employee employee = new Employee(55);
        boolean result = employee.isOfAge(50);

        assertTrue((result),"The employee should be younger");
    }
}
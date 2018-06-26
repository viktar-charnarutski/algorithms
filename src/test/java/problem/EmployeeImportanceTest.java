package problem;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 *
 */
public class EmployeeImportanceTest {

    private EmployeeImportance ins = new EmployeeImportance();
    private List<EmployeeImportance.Employee> employees = new ArrayList<>();


    @Before
    public void init() {
        EmployeeImportance.Employee e3 = new EmployeeImportance.Employee(3, 3, Collections.emptyList());
        EmployeeImportance.Employee e2 = new EmployeeImportance.Employee(2, 3, Collections.emptyList());

        List<Integer> subordinates = new ArrayList<>();
        subordinates.add(2);
        subordinates.add(3);
        EmployeeImportance.Employee e1 = new EmployeeImportance.Employee(1, 5, subordinates);

        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
    }

    @Test
    public void getImportance() {
        assertEquals(11, ins.getImportance(employees, 1));
    }
}
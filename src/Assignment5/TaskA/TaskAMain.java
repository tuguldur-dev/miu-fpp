package Assignment5.TaskA;

import java.util.Arrays;

public class TaskAMain {
    static void main() {
        DeptEmployee[] deptEmployees = DeptEmployeeData.getDeptData();
        print(deptEmployees);
        NameComparator comparator = new NameComparator();
        Arrays.sort(deptEmployees, comparator);
        print(deptEmployees);
    }

    static void print(DeptEmployee[] deptEmployees) {
        System.out.println("#########START");
        for (DeptEmployee deptEmployee : deptEmployees) {
            System.out.println(deptEmployee);
        }
        System.out.println("###########END");
    }
}

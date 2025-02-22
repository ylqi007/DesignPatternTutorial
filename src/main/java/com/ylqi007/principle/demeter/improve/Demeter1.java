package com.ylqi007.principle.demeter.improve;

import java.util.ArrayList;
import java.util.List;

public class Demeter1 {
    public static void main(String[] args) {
        System.out.println("使用Demeter Principle");
        SchoolManager schoolManager = new SchoolManager();
        schoolManager.printAllEmployee(new CollegeManager());
    }

}

// 管理学院员工的管理类
// 学校总部员工类
class Employee {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

// 学院员工类
class CollegeEmployee {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

// 管理学院员工的管理类
class CollegeManager {
    // 返回学院的所有员工
    public List<CollegeEmployee> getAllCollegeEmployee() {
        List<CollegeEmployee> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            CollegeEmployee employee = new CollegeEmployee();
            employee.setId("员工ID=" + i);
            list.add(employee);
        }
        return list;
    }

    // 输出学院员工的信息
    public void printAllCollegeEmployee() {
        //获取到学院员工: 将输出学院员工的方法，封装到CollegeManager中
        List<CollegeEmployee> list1 = getAllCollegeEmployee();
        System.out.println("------------学院员工------------");
        for (CollegeEmployee e : list1) {
            System.out.println(e.getId());
        }
    }
}


// 学校管理类
//分析 SchoolManager 类的直接朋友类有哪些 Employee、CollegeManager
//CollegeEmployee 不是 直接朋友 而是一个陌生类，这样违背了 迪米特法则
class SchoolManager {
    // 返回学校总部的员工
    public List<Employee> getAllEmployee() {
        List<Employee> list = new ArrayList<>();
        for(int i=0; i<5; i++) {
            Employee employee = new Employee();
            employee.setId("学校总部员工ID=" + i);
            list.add(employee);
        }
        return list;
    }

    // 输出学校总部和学院员工的信息(ID)
    public void printAllEmployee(CollegeManager collegeManager) {
        //获取到学院员工
        collegeManager.printAllCollegeEmployee();

        //获取到学校总部员工
        List<Employee> list2 = this.getAllEmployee();
        System.out.println("------------学校总部员工------------");
        for (Employee e : list2) {
            System.out.println(e.getId());
        }
    }
}


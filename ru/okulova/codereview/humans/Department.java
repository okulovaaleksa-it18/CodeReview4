package CodeReview4.ru.okulova.codereview.humans;

import java.util.ArrayList;
import java.util.List;

public class Department {
  private String name;
  private EmployeeUpdate boss;
  private List<EmployeeUpdate> employees;

  public Department() {
    this.name = "";
    this.boss = null;
    this.employees = new ArrayList<>();
  }

  public Department(String name) {
    this.name = name;
    this.boss = null;
    this.employees = new ArrayList<>();
  }

  public void addEmployee(EmployeeUpdate employee) {
    employees.add(employee);
  }

  public void setBoss(EmployeeUpdate boss) {
    //FIX_ME: исправлено форматирование
    //if (boss != null && boss.getDepartment()==this) {
    if (boss != null && boss.getDepartment() == this) {
      this.boss = boss;
    }
  }

  public EmployeeUpdate getBoss() {
    return boss;
  }

  public String getName() {
    return name;
  }

  public List<EmployeeUpdate> getEmployees() {
    return employees;
  }
}
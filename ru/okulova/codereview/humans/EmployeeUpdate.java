package CodeReview4.ru.okulova.codereview.humans;

import java.util.List;

public class EmployeeUpdate {
  private String name;
  private Department department;

  public EmployeeUpdate(String name, Department department) {
    this.name = name;
    this.department = department;
    if (department != null) {
      department.addEmployee(this);
    }
  }

  public Department getDepartment() {
    return department;
  }

  public boolean isBoss() {
    return this == department.getBoss();
  }

  public List<EmployeeUpdate> getDepartmentEmployees() {
    return department.getEmployees();
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    String bossName;
    //FIX_ME: убрали дублирование логики
    //if (department.getBoss() == this) {
    if (isBoss()) {
      return name + " - начальник отдела " + department.getName();
    }
    return name + " работает в отделе " + department.getName() +
            ", начальник - " +
            (department.getBoss() != null ? department.getBoss().getName() : "не назначен");
  }
}

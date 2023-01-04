class Employee {
    //Создайте класс Сотрудник, которая описывается именем (в строковой форме) и отделом,
    private String name;
    private Department department;

    public Employee(String name) {
        setName(name);
        this.department = null;
    }

    public Employee(String name, Department department) {
        setName(name);
        setDepartment(department);
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private boolean isBoss() {
        if (this.department != null && department.getDepartmentBoss() == this) {
            return true;
        } else return false;
    }

    @Override
    public String toString() {
        if (this.getDepartment() == null) return name +
                " не прикреплен к отделу";
        if (this.isBoss() == true) return name +
                " начальник отдела " + department;
        else return name +
                " работает в отделе " + department + ", начальник которого " + department.getDepartmentBossName();
    }
}
/*
в котором сотрудник работает, причем у каждого отдела есть название и начальник,
который также является Сотрудником. Сотрудник может быть приведен к текстовой форме вида:
“Имя работает в отделе Название, начальник которого Имя”.
В случае если сотрудник является руководителем отдела, то текстовая форма должна быть “Имя начальник отдела Название”.
Необходимо гарантировать, что Начальник отдела всегда работает в том отделе, где он начальник.
Задача считается решенной корректно, если выполняются требования инкапсуляции.
 */
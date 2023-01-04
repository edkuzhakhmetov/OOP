public class Department {
    private String departmentName;
    private Employee departmentBoss;

    //причем у каждого отдела есть название и начальник
    public Department(String departmentName, Employee boss) {
        setDepartmentName(departmentName);
        setBoss(boss);
    }

    public void setBoss(Employee boss) {
        this.departmentBoss = boss;
        boss.setDepartment(this);
        //boss.setIsBoss(true);
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public Employee getDepartmentBoss() {
        return departmentBoss;
    }
    public String getDepartmentBossName() {
        return departmentBoss.getName();
    }
    @Override
    public String toString() {
        return departmentName;
    }
}

public class Employee{
    private String name;
    private String department;
    private int id;
    private boolean working;

    public Employee(String name, String department, int id, boolean working) {
        this.name = name;
        this.department = department;
        this.id = id;
        this.working = working;
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", department='" + getDepartment() + "'" +
            ", id='" + getId() + "'" +
            ", working='" + isWorking() + "'" +
            "}";
    }

}
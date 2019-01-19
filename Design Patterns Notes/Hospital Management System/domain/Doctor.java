public class Doctor extends Employee{

    public Doctor(String name, String department, int id, boolean working){
        super(name, department, id, working);
        System.out.println("Doctor in action...");
    }

    @Override
    public void performDuties() {
        diagnosePatients();
        prescribeMedicine();
    }

    // Doctors
    private void prescribeMedicine(){
        System.out.println("Prescribe Medicine");
    }

    private void diagnosePatients(){
        System.out.println("Diagnosing Patient");   
    }

}
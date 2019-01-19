public class Nurse extends Employee{

    public Nurse(String name, String department, int id, boolean working){
        super(name, department, id, working);
        System.out.println("Nurse in action...");
    }

    @Override
    public void performDuties() {
        checkVitalSign();
        drawBlood();
        cleanPatientAres();
    }

    // Nurses
    private void checkVitalSign(){
        System.out.println("Checking Vitals");
    }

    private void drawBlood(){
        System.out.println("Drawing blood");
    }

    private void cleanPatientAres(){
        System.out.println("Cleaning Patient Area");
    }

}
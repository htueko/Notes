public class EmergencyRoomProcess{

    public static void main(String[] args) {
        HospitalManagement ERDirection = new HospitalManagement();
        Employee peggy = new Nurse("Peggy", "Emergency", 12, true);
        ERDirection.callUpon(peggy);
        Employee shady = new Doctor("Shady", "Emergency", 23, true);
        ERDirection.callUpon(shady);
    }

}
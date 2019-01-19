public class SchoolStuff {

    private void makeAnnouncements() {
        System.out.println("make announcements...");
    }

    private void takeAttendance() {
        System.out.println("took attendance...");
    }

    private void collectPaperWork() {
        System.out.println("collected paperwork...");
    }

    private void conductHallwayDuties() {
        System.out.println("conducted hallway duties...");
    }

    public void performOtherREsponsibilities() {
        makeAnnouncements();
        takeAttendance();
        collectPaperWork();
        conductHallwayDuties();
        performOtherREsponsibilities();
    }
}
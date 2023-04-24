public class Room {
    private int roomNom;
    private int capacity;
    private int enrollment;
    public Room(int roomNom, int capacity, int enrollment) {
        this.roomNom = roomNom;
        this.capacity = capacity;
        this.enrollment = enrollment;
    }
    public int getEnrollment() {
        return enrollment;
    }
    public int getCapacity() {
        return capacity;
    }
    public int getRoomNom() {
        return roomNom;
    }
    public int getLeftCapacity(){
        return getCapacity() - getEnrollment();
    }
    public boolean getIsCapacityLeft(){
        return getLeftCapacity()>0;
    }
}

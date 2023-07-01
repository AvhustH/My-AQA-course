package oop.Step7;

public class Manager  extends User implements PrintInfo{

    private String position;
    private String responsibilityDistrict;
    private String workPhoneNumber;

    public Manager(String firstName, String lastName, String email, String role, String position, String responsibilityDistrict,
            String workPhoneNumber) {
        super(firstName, lastName, email, role);
        this.position = position;
        this.responsibilityDistrict = responsibilityDistrict;
        this.workPhoneNumber = workPhoneNumber;
    }

    public Manager(String fullName, String email, String role, String position, String responsibilityDistrict,
            String workPhoneNumber) {
        super(fullName, email, role);
        this.position = position;
        this.responsibilityDistrict = responsibilityDistrict;
        this.workPhoneNumber = workPhoneNumber;
    }

    public String getPosition() {
        return position;
    }

    public String getResponsibilityDistrict() {
        return responsibilityDistrict;
    }

    public String getWorkPhoneNumber() {
        return workPhoneNumber;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setResponsibilityDistrict(String responsibilityDistrict) {
        this.responsibilityDistrict = responsibilityDistrict;
    }

    public void setWorkPhoneNumber(String workPhoneNumber) {
        this.workPhoneNumber = workPhoneNumber;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "position='" + position + '\'' +
                ", responsibilityDistrict='" + responsibilityDistrict + '\'' +
                ", workPhoneNumber='" + workPhoneNumber + '\'' +
                '}';
    }
    @Override
    public void printInfo() {
        System.out.println(toString());
    }
}

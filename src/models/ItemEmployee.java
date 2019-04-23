package models;

/**
 *
 * @author LLira
 */
public class ItemEmployee {

    private Integer employeeID;
    private String lastname;
    private String firstname;

    public ItemEmployee(Integer employeeID, String lastname, String firstname) {
        this.employeeID = employeeID;
        this.lastname = lastname;
        this.firstname = firstname;
    }

    public Integer getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(Integer employeeID) {
        this.employeeID = employeeID;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Override
    public String toString() {
        return this.getFirstname() + " " + this.getLastname();
    }

}//End class

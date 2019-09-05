package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author LLira
 */
@Entity
@Table(name = "Employees")
public class Employee {

    @Id
    @GeneratedValue
    private int employeeID;

    @Column(name = "LastName", nullable = false, length = 20)
    private String lastname;

    @Column(name = "[FirstName]", nullable = false, length = 10)
    private String firstname;

    @Column(name = "[Title]", nullable = false, length = 30)
    private String title;

    @Column(name = "BirthDate", nullable = false)
    private String birthdate;

    @Column(name = "HireDate", nullable = false)
    private String hiredate;

    public Employee() {
    }

    public Employee(int employeeID, String lastname, String firstname, String title,
            String birthdate, String hiredate) {
        this.employeeID = employeeID;
        this.lastname = lastname;
        this.firstname = firstname;
        this.title = title;
        this.birthdate = birthdate;
        this.hiredate = hiredate;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getHiredate() {
        return hiredate;
    }

    public void setHiredate(String hiredate) {
        this.hiredate = hiredate;
    }

    @Override
    public String toString() {
        return "Employee{" + "lastname=" + lastname + ", firstname=" + firstname + '}';
    }

}//End class

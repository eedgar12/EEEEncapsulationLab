package lab1;

import java.util.Date;

/**
 * In this lab your challenge is to fix the code in both classes to use
 * proper encapsulation and the four other best practices as explained by 
 * your instructor.
 *
 * @author      Jim Lombardo, WCTC Instructor
 * @version     1.01
 */
public class Employee {
    
    private String firstName;
    private String lastName;
    private String ssn;
    private Date birthDate;
    private boolean metWithHr;
    private boolean metDeptStaff;
    private boolean reviewedDeptPolicies;
    private boolean movedIn;
    private String cubeId;
    
    public Employee() {

    }
    
    public String getFirstName() {
        //needs validation
        return firstName;
    }

    public void setFirstName(String firstName) {
        //needs validation
        this.firstName = firstName;
    }

    public String getLastName() {
        //needs validation
        return lastName;
    }

    public void setLastName(String lastName) {
        //needs validation
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        //needs validation
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        //needs validation
        this.birthDate = birthDate;
    }

    public boolean isMovedIn() {
        return movedIn;
    }

    public void setMovedIn(boolean movedIn) {
        this.movedIn = movedIn;
    }

    public String getCubeId() {
        //needs validation
        return cubeId;
    }

    public void setCubeId(String cubeId) {
        //needs validation
        this.cubeId = cubeId;
    }

    public String getSsn() {
        //needs validation
        return ssn;
    }

    public void setSsn(String ssn) {
        //needs validation
        this.ssn = ssn;
    }
    

    

    // Assume this must be performed first
    private void meetWithHrForBenefitAndSalryInfo() {
        metWithHr = true;
    }

    // Assume this is must be performed second
    private void meetDepartmentStaff() {
        if(metWithHr) {
            metDeptStaff = true;
        } else {
            throw new IllegalStateException("Sorry, you cannot meet with "
                    + "department staff until you have met with HR.");
        }
    }

    // Assume this must be performed third
    private void reviewDeptPolicies() {
        if(metWithHr && metDeptStaff) {
            reviewedDeptPolicies = true;
        } else {
            throw new IllegalStateException("Sorry, you cannot review "
                    + " department policies until you have first met with HR "
                    + "and then with department staff.");
        }
    }

    // Assume this must be performed 4th
    private void moveIntoCubicle(String cubeId) {
        //needs validation for CubeId
        
        if(metWithHr && metDeptStaff && reviewedDeptPolicies) {
            
            /*Would there be a better way to do this so it doesn't have to pass 
             * parameters through several methods?  Should I use getCubeId() here?
             */
            
            this.cubeId = cubeId;
            this.movedIn = true;
        } else {
            throw new IllegalStateException("Sorry, you cannot move in to a "
                    + "cubicle until you have first met with HR "
                    + "and then with department staff, and then reviewed"
                    + "department policies.");
        }

    }

    
    public void newEmployeeProcess(String cubeID){
        meetWithHrForBenefitAndSalryInfo();
        meetDepartmentStaff();
        reviewDeptPolicies();
        moveIntoCubicle(cubeId);
    }
    
    
    public String getStatus() {
        if(metWithHr && metDeptStaff
           && reviewedDeptPolicies && movedIn) {
            return "Orientation is complete";
        } else {
            return "Orientation in progress...";
        }
    }
}

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

    public String getSsn() {
        //needs validation
        return ssn;
    }

    public void setSsn(String ssn) {
        //needs validation
        this.ssn = ssn;
    }

    public Date getBirthDate() {
        //needs validation
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        //needs validation
        this.birthDate = birthDate;
    }

    public boolean isMetWithHr() {
        //needs validation
        return metWithHr;
    }

    public void setMetWithHr(boolean metWithHr) {
        //needs validation
        this.metWithHr = metWithHr;
    }

    public boolean isMetDeptStaff() {
        //needs validation
        return metDeptStaff;
    }

    public void setMetDeptStaff(boolean metDeptStaff) {
        //needs validation
        this.metDeptStaff = metDeptStaff;
    }

    public boolean isReviewedDeptPolicies() {
        //needs validation
        return reviewedDeptPolicies;
    }

    public void setReviewedDeptPolicies(boolean reviewedDeptPolicies) {
        //needs validation
        this.reviewedDeptPolicies = reviewedDeptPolicies;
    }

    public boolean isMovedIn() {
        //needs validation
        return movedIn;
    }

    public void setMovedIn(boolean movedIn) {
        //needs validation
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
    
   

    

    // Assume this must be performed first
    private void meetWithHrForBenefitAndSalryInfo() {
        setMetWithHr(true);
    }

    // Assume this is must be performed second
    private void meetDepartmentStaff() {
        if(isMetWithHr()) {
            setMetDeptStaff(true);
        } else {
            throw new IllegalStateException("Sorry, you cannot meet with "
                    + "department staff until you have met with HR.");
        }
    }

    // Assume this must be performed third
    private void reviewDeptPolicies() {
        if(isMetWithHr() && isMetDeptStaff()) {
            setReviewedDeptPolicies(true);
        } else {
            throw new IllegalStateException("Sorry, you cannot review "
                    + " department policies until you have first met with HR "
                    + "and then with department staff.");
        }
    }

    // Assume this must be performed 4th
    private void moveIntoCubicle(String cubeId) {
        //needs validation for CubeId
        
        if(isMetWithHr() && isMetDeptStaff() && isReviewedDeptPolicies()) {
            
            /*Would there be a better way to do this so it doesn't have to pass 
             * parameters through several methods?  Should I use getCubeId() here?
             */
            
            setCubeId(cubeId);
            setMovedIn(true);
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
        if(isMetWithHr() && isMetDeptStaff()
           && isReviewedDeptPolicies() && isMovedIn()) {
            return "Orientation is complete";
        } else {
            return "Orientation in progress...";
        }
    }
}

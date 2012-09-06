/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Toshiba laptop
 */
public class Part {
    private String partNo;
    private String partDesc;
    private double partPrice;
    
    
    public String getPartNo() {
        return partNo;
    }

    public void setPartNo(String partNo) {
        //needs validation
        this.partNo = partNo;
        
    }
    
    public String getPartDesc() {
        return partDesc;
    }

    public void setPartDesc(String partDesc) {
        //needs validation
        this.partDesc = partDesc;
    }

    public double getPartPrice() {
        return partPrice;
    }

    public void setPartPrice(double partPrice) {
        //needs validation
        this.partPrice = partPrice;
    }
}

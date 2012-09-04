package lab3;

import java.awt.event.ActionListener;
import java.text.NumberFormat;
import javax.swing.*;

/**
 * This GUI class is simply a Java representation of the same project
 * presented in the Basic Logic & Programming (Visual Basic.Net) class.
 *
 * It is an example of a poorly designed program (architecturally speaking).
 * It violates many of the 5 basic design principles described recently by
 * your instructor. Your job is to fix as many of these problems as possible.
 * Don't worry if you see code that you don't understand (GUI-related, e.g.).
 * The problems are simple and easy to spot if you've done your homework and
 * listened to your instructor's presentation in class. The solution might be
 * to modify this code and/or add new classes.
 *
 * @author      Jim Lombardo, WCTC Instructor
 * @version     1.00
*/
public class MainGUI extends javax.swing.JFrame implements ActionListener {
    private final int MAX_RECS = 10;
    private final int NOT_FOUND = -1;

    private String partNo;
    private int foundIndex = NOT_FOUND;
    private String partDesc;
    private double partPrice;

    public String getPartNo() {
        //needs validation
        return partNo;
    }

    public void setPartNo(String partNo) {
        //needs validation
        this.partNo = partNo;
    }

    public int getFoundIndex() {
        //needs validation
        return foundIndex;
    }

    public void setFoundIndex(int foundIndex) {
        //needs validation
        this.foundIndex = foundIndex;
    }

    public String getPartDesc() {
        //needs validation
        return partDesc;
    }

    public void setPartDesc(String partDesc) {
        //needs validation
        this.partDesc = partDesc;
    }

    public double getPartPrice() {
        //needs validation
        return partPrice;
    }

    public void setPartPrice(double partPrice) {
        //needs validation
        this.partPrice = partPrice;
    }

    String[] partNums = new String[10];
    String[] partDescs = new String[10];
    double[] partPrices = new double[10];
    private int emptyRow;

    public int getEmptyRow() {
        //needs validation
        return emptyRow;
    }

    public void setEmptyRow(int emptyRow) {
        //needs validation
        this.emptyRow = emptyRow;
    }
    
    

    /** Creates new form MainGUI */
    public MainGUI() {
        initComponents();
        this.txtNewProdNo.requestFocus();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNewProdNo = new javax.swing.JTextField();
        txtNewProdDesc = new javax.swing.JTextField();
        txtNewProdPrice = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnEnterRecord = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listProducts = new javax.swing.JTextArea();
        btnDisplayList = new javax.swing.JButton();
        btnSortList = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        txtSearchPartNo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCurProdNo = new javax.swing.JTextField();
        txtCurDesc = new javax.swing.JTextField();
        txtCurPrice = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ACME Hardware Product Manager");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel1.setText("ACME Hardware");

        txtNewProdNo.setNextFocusableComponent(txtNewProdDesc);

        txtNewProdDesc.setNextFocusableComponent(txtNewProdPrice);

        txtNewProdPrice.setNextFocusableComponent(txtSearchPartNo);

        jLabel2.setText("Enter Product No:");

        jLabel3.setText("Enter Product Description:");

        jLabel4.setText("Enter Product Price:");

        btnEnterRecord.setText("Enter Record");
        btnEnterRecord.addActionListener(this);

        listProducts.setColumns(20);
        listProducts.setEditable(false);
        listProducts.setRows(5);
        listProducts.setFocusable(false);
        jScrollPane1.setViewportView(listProducts);

        btnDisplayList.setText("Display List");
        btnDisplayList.addActionListener(this);

        btnSortList.setText("Sort List");
        btnSortList.addActionListener(this);

        btnSearch.setText("Search");
        btnSearch.addActionListener(this);

        txtSearchPartNo.setNextFocusableComponent(txtCurDesc);

        jLabel5.setText("Enter Product Number to Search For:");

        txtCurProdNo.setEditable(false);
        txtCurProdNo.setFocusable(false);

        txtCurDesc.setNextFocusableComponent(txtCurPrice);

        jLabel6.setText("Current Product No:");

        jLabel7.setText("Current Desc:");

        jLabel8.setText("Current Price:");

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(this);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addGap(40, 40, 40)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtCurDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtCurPrice, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnUpdate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                                        .addComponent(txtCurProdNo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtNewProdNo, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3)
                                        .addComponent(txtNewProdDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4)
                                        .addComponent(txtNewProdPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(29, 29, 29)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                        .addContainerGap(68, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnSortList, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDisplayList, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEnterRecord, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(txtSearchPartNo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(167, 167, 167)))
                        .addGap(266, 266, 266))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtNewProdNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNewProdDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNewProdPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEnterRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDisplayList, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSortList, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtSearchPartNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtCurProdNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtCurDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtCurPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        this.getRootPane().setDefaultButton(btnEnterRecord);

        pack();
    }

    // Code for dispatching events from components to event handlers.

    public void actionPerformed(java.awt.event.ActionEvent evt) {
        if (evt.getSource() == btnEnterRecord) {
            MainGUI.this.btnEnterRecordActionPerformed(evt);
        }
        else if (evt.getSource() == btnDisplayList) {
            MainGUI.this.btnDisplayListActionPerformed(evt);
        }
        else if (evt.getSource() == btnSearch) {
            MainGUI.this.btnSearchActionPerformed(evt);
        }
        else if (evt.getSource() == btnUpdate) {
            MainGUI.this.btnUpdateActionPerformed(evt);
        }
        else if (evt.getSource() == btnSortList) {
            MainGUI.this.btnSortListActionPerformed(evt);
        }
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnterRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterRecordActionPerformed
        setFoundIndex(NOT_FOUND);

        setPartNo(this.txtNewProdNo.getText());
        setPartDesc(this.txtNewProdDesc.getText());
        try {
            setPartPrice(Double.parseDouble(this.txtNewProdPrice.getText()));
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Sorry, the price entry must be a whole or floating point number only.\n",
                    "Number Format Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (getEmptyRow() > 10) {
            JOptionPane.showMessageDialog(this, 
                    "Sorry, you have reach the maximum of 10 items.\n"
                    + "No more items can be saved.", "Maximum Reached", JOptionPane.WARNING_MESSAGE);

        } else if (getPartNo().length() == 0 || getPartDesc().length() == 0 
                || this.txtNewProdPrice.getText().length() == 0)
        {
            JOptionPane.showMessageDialog(this, 
                    "Sorry, you must complete all fields. Please try again.",
                    "Incomplete Part Entry", JOptionPane.WARNING_MESSAGE);
            this.txtNewProdNo.requestFocus();

        } else {
            partNums[getEmptyRow()] = getPartNo();
            partDescs[getEmptyRow()] = getPartDesc();
            partPrices[getEmptyRow()] = getPartPrice();
            setEmptyRow(getEmptyRow() + 1);
        }

        clearEntryFields();
        this.txtNewProdNo.requestFocus();
}//GEN-LAST:event_btnEnterRecordActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String searchNum = txtSearchPartNo.getText();
        if (searchNum != null && searchNum.length() > 0) {
            for (int i = 0; i < this.partNums.length; i++) {
                if (searchNum.equalsIgnoreCase(partNums[i])) {
                    foundIndex = i;
                    break;
                }
            }
           if (foundIndex == NOT_FOUND) {
                JOptionPane.showMessageDialog(this,
                    "Part Number not found. Please try again.",
                    "Not Found", JOptionPane.WARNING_MESSAGE);
           } else {
                txtCurProdNo.setText(partNums[foundIndex]);
                txtCurDesc.setText(partDescs[foundIndex]);
                txtCurPrice.setText("" + partPrices[foundIndex]);
           }
        } else {
                JOptionPane.showMessageDialog(this,
                    "Please enter a Part No. to search",
                    "Entry Missing", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnDisplayListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayListActionPerformed
        displayList();
    }//GEN-LAST:event_btnDisplayListActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if (foundIndex == NOT_FOUND) {
                JOptionPane.showMessageDialog(this,
                    "Part Number not found. Please try again.",
                    "Search Failure", JOptionPane.WARNING_MESSAGE);
        } else {
            partNums[foundIndex] = txtCurProdNo.getText();
            partDescs[foundIndex] = txtCurDesc.getText();
            partPrices[foundIndex] = Double.parseDouble(txtCurPrice.getText());
            displayList();
            JOptionPane.showMessageDialog(this,
                "Part updated successfully!",
                "Success Confirmation", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSortListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortListActionPerformed
        sortList();
    }//GEN-LAST:event_btnSortListActionPerformed

    private void displayList() {
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        listProducts.setText(""); // clear list
        listProducts.append("Part\tDesc\t\tPrice\n====\t====\t\t=====\n");
        for (int i = 0 ; i < getEmptyRow(); i++) {
            String rLine = partNums[i] + "\t"
                    + partDescs[i] + "\t\t" + nf.format(partPrices[i]) + "\n";
            listProducts.append(rLine);
        }
    }

    // Sort by partNumber
    private void sortList() {
        // Only perform the sort if we have records
        if(getEmptyRow() > 0) {
            // Bubble sort routine adapted from sample in text book...
            // Make sure the operations are peformed on all 3 arrays!
            for(int passNum = 1; passNum < getEmptyRow(); passNum++) {
                for(int i = 1; i <= getEmptyRow()-passNum; i++) {
                    String temp = "";
                    temp += partPrices[i-1];
                    partPrices[i-1] = partPrices[i];
                    partPrices[i] = Double.parseDouble(temp);

                    temp = partNums[i-1];
                    partNums[i-1] = partNums[i];
                    partNums[i] = temp;

                    temp = partDescs[i-1];
                    partDescs[i-1] = partDescs[i];
                    partDescs[i] = temp;
                }
            }
            // Once it's sorted, display in the list box
            displayList();
        } else {
            JOptionPane.showMessageDialog(this,
                    "Sorry, there are not items to sort", "Sort Error",
                    JOptionPane.WARNING_MESSAGE);
        }
    }

    private void clearEntryFields() {
        txtNewProdNo.setText("");
        txtNewProdDesc.setText("");
        txtNewProdPrice.setText("");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDisplayList;
    private javax.swing.JButton btnEnterRecord;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSortList;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea listProducts;
    private javax.swing.JTextField txtCurDesc;
    private javax.swing.JTextField txtCurPrice;
    private javax.swing.JTextField txtCurProdNo;
    private javax.swing.JTextField txtNewProdDesc;
    private javax.swing.JTextField txtNewProdNo;
    private javax.swing.JTextField txtNewProdPrice;
    private javax.swing.JTextField txtSearchPartNo;
    // End of variables declaration//GEN-END:variables

}

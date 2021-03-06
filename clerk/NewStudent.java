/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clerk;

import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import selects.QueryClassDetails;
import selects.QueryStudentDetails;
import javax.swing.Action;

/**
 *
 * @author franq
 */
public class NewStudent extends javax.swing.JFrame {

    /**
     * Creates new form NewStudent
     */
     private ArrayList<String> classnames,residencenames,meals,transport;
     private static int userid;
     private static java.util.Date today;
     
     private static Action getTransport;
     private static int classid;
     private static double newstudenttotalfee;
     private static int selectedresidence;
     
    public NewStudent(int usrid) {
        
          getTransport = new AbstractAction() {

            @Override
            public void actionPerformed(ActionEvent e) {
                  
            }
        };
          initComponents();
          this.setTitle("New Student");
          today = new java.util.Date();
          this.userid = usrid;
          classnames = QueryClassDetails.getClassNames();
          cmbclass.setModel(new DefaultComboBoxModel(classnames.toArray(new String[classnames.size()])));
          residencenames = QueryStudentDetails.getResidenceNames();
          cmbresidence.setModel(new DefaultComboBoxModel(residencenames.toArray(new String[residencenames.size()])));
         
         
          
          
          
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tfsurnamename = new javax.swing.JTextField();
        tffirstname = new javax.swing.JTextField();
        tflastname = new javax.swing.JTextField();
        cmbclass = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        jXDOB = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        cmbstaffgender1 = new javax.swing.JComboBox();
        cmbresidence = new javax.swing.JComboBox();
        cmbmeals = new javax.swing.JComboBox();
        cmbtransport = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        jbtcancel = new javax.swing.JButton();
        jbtsave = new javax.swing.JButton();
        jbtcancel1 = new javax.swing.JButton();
        jbtok = new javax.swing.JButton();
        lblsaved = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(selects.QueryMainDetails.setIcon());
        setResizable(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 240));
        jLabel6.setText("Enter The Student Details");

        jLabel8.setForeground(new java.awt.Color(0, 0, 240));
        jLabel8.setText("Surname");

        jLabel10.setForeground(new java.awt.Color(0, 0, 240));
        jLabel10.setText("First Name");

        jLabel11.setForeground(new java.awt.Color(0, 0, 240));
        jLabel11.setText("Last Name");

        jLabel12.setForeground(new java.awt.Color(0, 0, 240));
        jLabel12.setText("Gender");

        cmbclass.setEnabled(true);
        cmbclass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbclassActionPerformed(evt);
            }
        });

        jLabel13.setForeground(new java.awt.Color(0, 0, 240));
        jLabel13.setText("Date of Birth");

        jXDOB.setEnabled(true);

        jLabel14.setForeground(new java.awt.Color(0, 0, 240));
        jLabel14.setText("Class");

        jLabel15.setForeground(new java.awt.Color(0, 0, 240));
        jLabel15.setText("Residence");

        jLabel16.setForeground(new java.awt.Color(0, 0, 240));
        jLabel16.setText("Meals");

        cmbstaffgender1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Male", "Female" }));
        cmbstaffgender1.setEnabled(true);

        cmbresidence.setEnabled(true);

        cmbmeals.setEnabled(true);

        cmbtransport.setEnabled(true);

        jLabel18.setForeground(new java.awt.Color(0, 0, 240));
        jLabel18.setText("Transport");

        jbtcancel.setText("Continue");
        jbtcancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtcancelActionPerformed(evt);
            }
        });

        jbtsave.setText("Save");
        jbtsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtsaveActionPerformed(evt);
            }
        });

        jbtcancel1.setText("Cancel");
        jbtcancel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtcancel1ActionPerformed(evt);
            }
        });

        jbtok.setText("Ok");
        jbtok.setEnabled(false);
        jbtok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtokActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tfsurnamename)
                                .addComponent(tffirstname)
                                .addComponent(tflastname)
                                .addComponent(cmbstaffgender1, 0, 193, Short.MAX_VALUE))
                            .addComponent(jXDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(82, 82, 82)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                                .addComponent(cmbclass, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel16)
                                        .addComponent(jLabel18)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbresidence, 0, 208, Short.MAX_VALUE)
                                    .addComponent(cmbtransport, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbmeals, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jbtcancel1)
                        .addGap(139, 139, 139)
                        .addComponent(jbtok)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtsave)
                        .addGap(134, 134, 134)
                        .addComponent(jbtcancel)
                        .addGap(46, 46, 46)))
                .addGap(82, 82, 82))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tfsurnamename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(cmbclass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tffirstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(cmbresidence, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tflastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel18)
                    .addComponent(cmbtransport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbstaffgender1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel16)
                    .addComponent(cmbmeals, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jXDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtcancel1)
                    .addComponent(jbtsave)
                    .addComponent(jbtcancel)
                    .addComponent(jbtok))
                .addGap(28, 28, 28))
        );

        lblsaved.setForeground(new java.awt.Color(204, 0, 51));
        lblsaved.setText("Contacts Saved");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(276, 276, 276)
                .addComponent(jLabel6)
                .addGap(33, 33, 33)
                .addComponent(lblsaved)
                .addContainerGap(275, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblsaved))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtcancelActionPerformed
        // TODO add your handling code here:
        if(selects.QueryStudentDetails.getLastContact() != selects.QueryStudentDetails.getCurrentContactID())
        {
            JOptionPane.showMessageDialog(null,
                        "Please Save Student Details to Continue\n", "Warning",JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            NewStudentcontacts newcontacts = new NewStudentcontacts(userid);
            newcontacts.main(new String[9]);
            this.hide(); 
        }
       
    }//GEN-LAST:event_jbtcancelActionPerformed

    private void jbtsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtsaveActionPerformed

        
        // TODO add your handling code here:
        String surname, firstname, lastname,gender, dob, classidstr, residenceidstr, mealsidstr, transportidstr;
        int residenceid,mealsid,transportid, registeredby;
       //String surname, firstname, lastname,gender, dob, classid, residenceid, mealsid, transportid, registeredby;
        
       
       surname = tfsurnamename.getText().toUpperCase();
       firstname = tffirstname.getText().toUpperCase();
       lastname = tflastname.getText().toUpperCase();
       gender = cmbstaffgender1.getSelectedItem().toString().toUpperCase();
       
       java.util.Date utildate = jXDOB.getDate();
       java.sql.Date sqldate = new java.sql.Date(utildate.getYear(),utildate.getMonth(),utildate.getDate());
       java.sql.Date todaysqldate = new java.sql.Date(today.getYear(), today.getMonth(), today.getDate());
       dob = sqldate.toString().toUpperCase();
       
       //get the names of tehse variable below
       residenceidstr = cmbresidence.getSelectedItem().toString();
       selectedresidence = cmbresidence.getSelectedIndex();
       mealsidstr = cmbmeals.getSelectedItem().toString();
       transportidstr = cmbtransport.getSelectedItem().toString();
       registeredby = userid;
       
       //get the spefic ids     
       selects.QueryResidenceDetails.getResidenceNames();
       int residenceidid = selects.QueryResidenceDetails.listofnames.indexOf(residenceidstr);
       residenceid = Integer.parseInt(selects.QueryResidenceDetails.listofids.get(residenceidid).toString());
       
       selects.QueryMealsDetails.getMealDetails();
       int mealsidid = selects.QueryMealsDetails.listofnames.indexOf(mealsidstr);
       mealsid = Integer.parseInt(selects.QueryMealsDetails.listofids.get(mealsidid).toString());
       
       selects.QueryTransportDetails.getTranportDetails(this.classid);
       int transportidid = selects.QueryTransportDetails.listofnames.indexOf(transportidstr);
       transportid = Integer.parseInt(selects.QueryTransportDetails.listofids.get(transportidid).toString());
       
       if("".equals(surname))
       {
           JOptionPane.showMessageDialog(null,
                        "Please Enter Surname to Continue\n", "Warning",JOptionPane.WARNING_MESSAGE);
       }
       else if("".equals(firstname))
       {
           JOptionPane.showMessageDialog(null,
                        "Please Enter First Name to Continue\n", "Warning",JOptionPane.WARNING_MESSAGE);
       }
       else if("".equals(lastname))
       {
           JOptionPane.showMessageDialog(null,
                        "Please Enter Last Name to Continue\n", "Warning",JOptionPane.WARNING_MESSAGE);
       }
       else if("Select".equals(gender))
       {
           JOptionPane.showMessageDialog(null,
                        "Please Enter Gender to Continue\n", "Warning",JOptionPane.WARNING_MESSAGE);
       }
       else if("Select".equals(transportidstr))
       {
           JOptionPane.showMessageDialog(null,
                        "Please Enter Transport Details to Continue\n", "Warning",JOptionPane.WARNING_MESSAGE);
       }
        else if("".equals(dob)||dob==null||sqldate==todaysqldate)
        {
            JOptionPane.showMessageDialog(null,
                        "Please Enter Date of Birth to Continue\n", "Warning",JOptionPane.WARNING_MESSAGE);
        }
       else if("Select".equals(cmbclass.getSelectedItem().toString()))
       {
           JOptionPane.showMessageDialog(null,
                        "Please Enter Class Details to Continue\n", "Warning",JOptionPane.WARNING_MESSAGE);
       }
       else if("Select".equals(residenceidstr))
       {
           JOptionPane.showMessageDialog(null,
                        "Please Enter Residence Details to Continue\n", "Warning",JOptionPane.WARNING_MESSAGE);
       }
       else if("Select".equals(mealsidstr))
       {
           JOptionPane.showMessageDialog(null,
                        "Please Enter Meals Details to Continue\n", "Warning",JOptionPane.WARNING_MESSAGE);
       }
       else
       {
         try {
             sqlinserts.NewStudent.createNewStudent(surname, firstname, lastname,gender,dob,classid,residenceid,mealsid,transportid, registeredby);
             
             
             //update fee details
             //check residence details
             //if borderstudent
             if(selectedresidence != 1)
             {
                double feerequiredborders =  frigfactor.TotalFeeBorders.getTotalFeeBorders(residenceid, classid, cmbmeals.getSelectedItem().toString());
                sqlinserts.NewStudentFee.createBorderFee(feerequiredborders);
                sqlinserts.SetFeeBalance.setBorderStatement(0.00, feerequiredborders,getLastStudentID());
             }
             else
             {
                 double feerequieddayschoolars = frigfactor.TotalFeeDaySchool.getTotalFeeDayScholars(classid, cmbmeals.getSelectedItem().toString());
                 sqlinserts.NewStudentFee.createDayScholarFee(feerequieddayschoolars);
                 sqlinserts.SetFeeBalance.setNonBorderStatement(0.00, feerequieddayschoolars, getLastStudentID());
             }
             
             JOptionPane.showMessageDialog(null,
                        "Student Details Saved\n"
                     + "Press Ok to Continue", "Success",JOptionPane.INFORMATION_MESSAGE);
             clerk.Clerk.updateTable();
             jbtok.setEnabled(true);
             
         } catch (SQLException ex) {
             Logger.getLogger(NewStudent.class.getName()).log(Level.SEVERE, null, ex);
             
             if(ex.getErrorCode() == 1062)
                {
                    JOptionPane.showMessageDialog(null, "The Student Details You are Trying to Create Have Already Been Saved Before. \n" +
                        "Press Ok to continue", "Warning "+ex.getErrorCode(), JOptionPane.WARNING_MESSAGE);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Some unexpected error occured \n" +
                        "Please contact the system administrator", "Error ", JOptionPane.ERROR_MESSAGE);
                    this.hide();
                }

         }
       }
    }//GEN-LAST:event_jbtsaveActionPerformed

    private void jbtcancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtcancel1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jbtcancel1ActionPerformed

    private void cmbclassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbclassActionPerformed
                String classidstr = cmbclass.getSelectedItem().toString();
                selects.QueryClassDetails.getClassNames();
                int classidid = selects.QueryClassDetails.listofnames.indexOf(classidstr);
                classid = Integer.parseInt(selects.QueryClassDetails.listofids.get(classidid).toString());
                transport = QueryStudentDetails.getTransportNames(classid);
                cmbtransport.setModel(new DefaultComboBoxModel(transport.toArray(new String[transport.size()])));  
                
                 meals = QueryStudentDetails.getMealsNames(classid);
                 cmbmeals.setModel(new DefaultComboBoxModel(meals.toArray(new String[meals.size()])));
    }//GEN-LAST:event_cmbclassActionPerformed

    private void jbtokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtokActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jbtokActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new NewStudent(userid).setVisible(true);
            }
        });
    }
    
    
    public static long getLastStudentID()
      {
         DBConnection dbconn =new DBConnection();
            Connection conn = dbconn.vconnection;
            PreparedStatement pstmt;
            ResultSet rs;
            Long lastcontid=null;
           
            String Sql = "SELECT `ID` FROM `student` WHERE 1 ORDER BY `ID` DESC LIMIT 1;";
        try {            
            pstmt = conn.prepareStatement(Sql);
             rs = pstmt.executeQuery();
             rs.next();
             lastcontid = rs.getLong("ID");
        } catch (SQLException ex) {
            Logger.getLogger(QueryStudentDetails.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,
                "Some unexpected error occured\n"+
                "Was not able to load Student details\n"+
                "Please contact the systems administrator for assistance","Warning",JOptionPane.ERROR_MESSAGE);
        }
                     
       return lastcontid;
      }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbclass;
    private javax.swing.JComboBox cmbmeals;
    private javax.swing.JComboBox cmbresidence;
    private javax.swing.JComboBox cmbstaffgender1;
    private javax.swing.JComboBox cmbtransport;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private com.toedter.calendar.JDateChooser jXDOB;
    private javax.swing.JButton jbtcancel;
    private javax.swing.JButton jbtcancel1;
    private javax.swing.JButton jbtok;
    private javax.swing.JButton jbtsave;
    public javax.swing.JLabel lblsaved;
    private javax.swing.JTextField tffirstname;
    private javax.swing.JTextField tflastname;
    private javax.swing.JTextField tfsurnamename;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package RemoteDesktop.View;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


/**
*
* @author dangth&dongnh
*/

public class MainForm extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    private int count = 0;
    public MainForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        myAddress = new javax.swing.JPanel();
        lbMyAddress = new javax.swing.JLabel();
        yourIP = new javax.swing.JTextField();
        lbMyPassword = new javax.swing.JLabel();
        yourPass = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbMyAddress2 = new javax.swing.JLabel();
        yourPort = new javax.swing.JTextField();
        btnStopSV = new javax.swing.JButton();
        btnStartSV = new javax.swing.JButton();
        lbMyAddress4 = new javax.swing.JLabel();
        savePath = new javax.swing.JTextField();
        btnBrower = new javax.swing.JButton();
        btnNewButton = new javax.swing.JButton();
        Partner = new javax.swing.JPanel();
        lbMyAddress1 = new javax.swing.JLabel();
        ctIP = new javax.swing.JTextField();
        lbMyPassword1 = new javax.swing.JLabel();
        ctPass = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnSendFile = new javax.swing.JButton();
        dimension = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        lblScale = new javax.swing.JLabel();
        lbMyAddress3 = new javax.swing.JLabel();
        ctPort = new javax.swing.JTextField();
        btnCt = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(Toolkit.getDefaultToolkit().getImage(MainForm.class.getResource("/Image/icon.png")));
        setTitle("Remote Desktop v1.1 - Group 12 - D10CNPM2");
        setBackground(new java.awt.Color(8, 129, 218));
        setMinimumSize(new java.awt.Dimension(600, 450));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(630, 500));

        myAddress.setBackground(new java.awt.Color(0, 100, 253));
        myAddress.setForeground(new java.awt.Color(0, 100, 253));
        myAddress.setOpaque(false);

        lbMyAddress.setBackground(new java.awt.Color(255, 255, 255));
        lbMyAddress.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lbMyAddress.setForeground(new java.awt.Color(0, 100, 253));
        lbMyAddress.setText("My ID");

        yourIP.setEditable(false);
        yourIP.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        yourIP.setForeground(new java.awt.Color(0, 100, 253));
        yourIP.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        yourIP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        yourIP.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        lbMyPassword.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lbMyPassword.setForeground(new java.awt.Color(0, 100, 253));
        lbMyPassword.setText("Passwords");

        yourPass.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        yourPass.setForeground(new java.awt.Color(0, 100, 253));
        yourPass.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        yourPass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Please tell your partner's the following ID and password");

        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("if you would like to allow remote control");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 100, 253));
        jLabel3.setText("My Address");

        lbMyAddress2.setBackground(new java.awt.Color(255, 255, 255));
        lbMyAddress2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lbMyAddress2.setForeground(new java.awt.Color(0, 100, 253));
        lbMyAddress2.setText("My Port");

        yourPort.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        yourPort.setForeground(new java.awt.Color(0, 100, 253));
        yourPort.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        yourPort.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        yourPort.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        btnStopSV.setBackground(new java.awt.Color(204, 204, 204));
        btnStopSV.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnStopSV.setForeground(new java.awt.Color(0, 100, 253));
        btnStopSV.setText("CloseServer");
        btnStopSV.setToolTipText("");

        btnStartSV.setBackground(new java.awt.Color(204, 204, 204));
        btnStartSV.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnStartSV.setForeground(new java.awt.Color(0, 100, 253));
        btnStartSV.setText("StartServer");
        btnStartSV.setToolTipText("");

        lbMyAddress4.setBackground(new java.awt.Color(255, 255, 255));
        lbMyAddress4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lbMyAddress4.setForeground(new java.awt.Color(0, 100, 253));
        lbMyAddress4.setText("Save file");

        savePath.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        savePath.setForeground(new java.awt.Color(0, 100, 253));
        savePath.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        savePath.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        savePath.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        btnBrower.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBrower.setText("...");

        btnNewButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Refreshicon.png"))); // NOI18N

        javax.swing.GroupLayout myAddressLayout = new javax.swing.GroupLayout(myAddress);
        myAddress.setLayout(myAddressLayout);
        myAddressLayout.setHorizontalGroup(
            myAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myAddressLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(myAddressLayout.createSequentialGroup()
                .addGroup(myAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(myAddressLayout.createSequentialGroup()
                        .addGroup(myAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbMyPassword)
                            .addComponent(lbMyAddress))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(myAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(yourIP)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myAddressLayout.createSequentialGroup()
                                .addComponent(yourPass, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnNewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(myAddressLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(myAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                            .addGroup(myAddressLayout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(myAddressLayout.createSequentialGroup()
                        .addComponent(lbMyAddress4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(savePath, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBrower, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(myAddressLayout.createSequentialGroup()
                        .addComponent(btnStartSV, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnStopSV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(myAddressLayout.createSequentialGroup()
                        .addComponent(lbMyAddress2)
                        .addGap(30, 30, 30)
                        .addComponent(yourPort)))
                .addContainerGap())
        );
        myAddressLayout.setVerticalGroup(
            myAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myAddressLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(myAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yourIP, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbMyAddress))
                .addGap(18, 18, 18)
                .addGroup(myAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yourPort, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbMyAddress2))
                .addGap(18, 18, 18)
                .addGroup(myAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yourPass, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbMyPassword)
                    .addComponent(btnNewButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(myAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMyAddress4)
                    .addComponent(btnBrower)
                    .addComponent(savePath, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(myAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnStopSV, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStartSV, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        Partner.setBackground(new java.awt.Color(0, 100, 253));
        Partner.setForeground(new java.awt.Color(0, 100, 253));
        Partner.setOpaque(false);
        Partner.setPreferredSize(new java.awt.Dimension(305, 168));

        lbMyAddress1.setBackground(new java.awt.Color(255, 255, 255));
        lbMyAddress1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lbMyAddress1.setForeground(new java.awt.Color(0, 100, 253));
        lbMyAddress1.setText("PartnerID");

        ctIP.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        ctIP.setForeground(new java.awt.Color(0, 100, 253));
        ctIP.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        ctIP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        ctIP.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        lbMyPassword1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lbMyPassword1.setForeground(new java.awt.Color(0, 100, 253));
        lbMyPassword1.setText("Passwords");

        ctPass.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        ctPass.setForeground(new java.awt.Color(0, 100, 253));
        ctPass.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        ctPass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Please your Partner's ID and port  in order to control");

        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("the remote computer");

        btnSendFile.setBackground(new java.awt.Color(204, 204, 204));
        btnSendFile.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSendFile.setForeground(new java.awt.Color(0, 100, 253));
        btnSendFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/data-transfer.png"))); // NOI18N
        btnSendFile.setText("SendFile");

        dimension.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        dimension.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Default", "800 x 600", "1024 x 768", "1280 x 600", "1280 x 720", "1280 x 768", "1280 x 800", "1366 x 768", "1440 x 900", "1600 x 900", "1920 x 1080" }));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 100, 253));
        jLabel4.setText("Partner");

        lblScale.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblScale.setForeground(new java.awt.Color(0, 100, 253));
        lblScale.setText("Scale");

        lbMyAddress3.setBackground(new java.awt.Color(255, 255, 255));
        lbMyAddress3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lbMyAddress3.setForeground(new java.awt.Color(0, 100, 253));
        lbMyAddress3.setText("Partner Port");

        ctPort.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        ctPort.setForeground(new java.awt.Color(0, 100, 253));
        ctPort.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        ctPort.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        ctPort.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        btnCt.setBackground(new java.awt.Color(204, 204, 204));
        btnCt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCt.setForeground(new java.awt.Color(0, 100, 253));
        btnCt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/transfer.png"))); // NOI18N
        btnCt.setText("Connects");
        btnCt.setToolTipText("");

        javax.swing.GroupLayout PartnerLayout = new javax.swing.GroupLayout(Partner);
        Partner.setLayout(PartnerLayout);
        PartnerLayout.setHorizontalGroup(
            PartnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PartnerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PartnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PartnerLayout.createSequentialGroup()
                        .addGroup(PartnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PartnerLayout.createSequentialGroup()
                                .addGroup(PartnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PartnerLayout.createSequentialGroup()
                                        .addComponent(lblScale)
                                        .addGap(38, 38, 38))
                                    .addComponent(lbMyPassword1, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(27, 27, 27)
                                .addGroup(PartnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ctPass)
                                    .addComponent(dimension, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(PartnerLayout.createSequentialGroup()
                                .addComponent(btnCt, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSendFile))
                            .addGroup(PartnerLayout.createSequentialGroup()
                                .addGroup(PartnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbMyAddress3)
                                    .addComponent(lbMyAddress1))
                                .addGap(16, 16, 16)
                                .addGroup(PartnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ctIP)
                                    .addComponent(ctPort))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PartnerLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(PartnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PartnerLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addGroup(PartnerLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PartnerLayout.setVerticalGroup(
            PartnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PartnerLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(PartnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ctIP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbMyAddress1))
                .addGap(18, 18, 18)
                .addGroup(PartnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ctPort, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbMyAddress3))
                .addGap(18, 18, 18)
                .addGroup(PartnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ctPass, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbMyPassword1))
                .addGap(18, 18, 18)
                .addGroup(PartnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dimension, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblScale))
                .addGap(36, 36, 36)
                .addGroup(PartnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSendFile)
                    .addComponent(btnCt))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Copyright@_Group_12_D10CNPM2_TranHaiDang_NguyenHongDong_2013");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(myAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Partner, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jLabel5)
                .addContainerGap(123, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Partner, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(myAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addComponent(jLabel5)
                .addGap(23, 23, 23))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 520));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/background.jpg"))); // NOI18N
        background.setOpaque(true);
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, -1));

        setSize(new java.awt.Dimension(665, 557));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
     public void setctIP(String s) {
        ctIP.setText(s);
    }

    public void setctPort(String s) {
        ctPort.setText(s);
    }

    public void setctPass(String s) {
        ctPass.setText(s);
    }

    public void refreshPass(ActionListener a) {
        btnNewButton.addActionListener(a);
    }

    public void setYourIP(String s) {
        yourIP.setText(s);
    }

    public int getYourPort() {
        try {
            return Integer.parseInt(yourPort.getText());
        } catch (Exception e) {
            showMesseger("Port nhap ko hop le,port 999 se duoc dung");
            return 9999;
        }
    }

    public void setYourPass(String s) {
        yourPass.setText(s);
    }

    public String getYourPass() {
        return yourPass.getText();
    }

    public String getctIP() {
        return ctIP.getText();
    }

    public int getctPort() {
        try {
            return Integer.parseInt(ctPort.getText());
        } catch (Exception e) {
            return -1;
        }
    }

    public void setSavePatch(String s) {
        savePath.setText(s);
    }

    public String getSavePatch() {
        return savePath.getText();
    }

    public String getctPass() {
        return ctPass.getText();
    }

    public Dimension getDimension() {
        Dimension d = new Dimension();
        int k = dimension.getSelectedIndex();
        switch (k) {
            case 0:
                d.setSize(0, 0);
                break;
            case 1:
                d.setSize(800, 600);
                break;
            case 2:
                d.setSize(1024, 768);
                break;
            case 3:
                d.setSize(1280, 600);
                break;
            case 4:
                d.setSize(1280, 720);
                break;
            case 5:
                d.setSize(1280, 768);
                break;
            case 6:
                d.setSize(1280, 800);
                break;
            case 7:
                d.setSize(1366, 768);
                break;
            case 8:
                d.setSize(1440, 900);
                break;
            case 9:
                d.setSize(1600, 900);
                break;
            case 10:
                d.setSize(1920, 1080);
                break;
                
        }
        return d;
    }

    public File getSentFile() {
        JFileChooser jfc = new JFileChooser();
        if (jfc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            return jfc.getSelectedFile();
        }
        return null;
    }

    public File getSaveFilePatch() {
        JFileChooser jfc = new JFileChooser();
        jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        if (jfc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            return jfc.getSelectedFile();
        }
        return null;
    }

    public void ConnectListener(ActionListener a) {
        btnCt.addActionListener(a);
    }

    public void SendFileListener(ActionListener a) {
        btnSendFile.addActionListener(a);
    }

    public void BrowerFileListener(ActionListener a) {
        btnBrower.addActionListener(a);
    }

    public void StartServerListener(ActionListener a) {
        btnStartSV.addActionListener(a);
    }

    public void StopServerListener(ActionListener a) {
        btnStopSV.addActionListener(a);
    }

    public void showMesseger(String s) {
        JOptionPane.showMessageDialog(this, s);
    }

    public void setPort(String string) {
        yourPort.setText(string);
    }

    public void updateServerStatus() {
        btnStartSV.setEnabled(!btnStartSV.isEnabled());
        btnStopSV.setEnabled(!btnStopSV.isEnabled());
        btnNewButton.setEnabled(!btnNewButton.isEnabled());
        yourPass.setEditable(!yourPass.isEditable());
        yourPort.setEditable(!yourPort.isEditable());
    }

    public void updateClientStatus() {
        btnCt.setEnabled(!btnCt.isEnabled());
        btnSendFile.setEnabled(!btnSendFile.isEnabled());
        ctIP.setEditable(!ctIP.isEditable());
        ctPass.setEditable(!ctPass.isEditable());
        ctPort.setEditable(!ctPort.isEditable());
        dimension.setEnabled(!dimension.isEnabled());
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Partner;
    private javax.swing.JLabel background;
    private javax.swing.JButton btnBrower;
    private javax.swing.JButton btnCt;
    private javax.swing.JButton btnNewButton;
    private javax.swing.JButton btnSendFile;
    private javax.swing.JButton btnStartSV;
    private javax.swing.JButton btnStopSV;
    private javax.swing.JTextField ctIP;
    private javax.swing.JTextField ctPass;
    private javax.swing.JTextField ctPort;
    private javax.swing.JComboBox dimension;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbMyAddress;
    private javax.swing.JLabel lbMyAddress1;
    private javax.swing.JLabel lbMyAddress2;
    private javax.swing.JLabel lbMyAddress3;
    private javax.swing.JLabel lbMyAddress4;
    private javax.swing.JLabel lbMyPassword;
    private javax.swing.JLabel lbMyPassword1;
    private javax.swing.JLabel lblScale;
    private javax.swing.JPanel myAddress;
    private javax.swing.JTextField savePath;
    private javax.swing.JTextField yourIP;
    private javax.swing.JTextField yourPass;
    private javax.swing.JTextField yourPort;
    // End of variables declaration//GEN-END:variables
}
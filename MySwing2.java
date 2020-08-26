
package javaapplication2;
import java.awt.Desktop;
import java.net.URI;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import javax.swing.JLabel;


public class MySwing2 extends javax.swing.JFrame
{

       
    public MySwing2()
    {
    	setBackground(Color.GRAY);
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnlsmtcity = new javax.swing.JPanel();
        btnhist = new javax.swing.JButton();
        btnpht = new javax.swing.JButton();
        btncntt = new javax.swing.JButton();
        btnhome = new javax.swing.JButton();
        btnatm = new javax.swing.JButton();
        btnhot = new javax.swing.JButton();
        btnhosp = new javax.swing.JButton();
        btnmall = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlsmtcity.setBackground(Color.GRAY);
        
        pnlsmtcity.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SMART CITY NASHIK", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Calibri", 1, 36), new java.awt.Color(0, 102, 102))); // NOI18N

        btnhist.setText("HISTORY");
        btnhist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhistActionPerformed(evt);
            }
        });

        btnpht.setText("ATTRACTIONS");
        btnpht.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnphtActionPerformed(evt);
            }
        });

        btncntt.setText("CONTACT US");
        btncntt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncnttActionPerformed(evt);
            }
        });

        btnhome.setText("HOME");
        btnhome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnhomeMouseClicked(evt);
            }
        });
        btnhome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhomeActionPerformed(evt);
            }
        });

        btnatm.setText("ATM");
        btnatm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnatmActionPerformed(evt);
            }
        });

        btnhot.setText("HOTELS");
        btnhot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhotActionPerformed(evt);
            }
        });

        btnhosp.setText("HOSPITAL");
        btnhosp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhospActionPerformed(evt);
            }
        });

        btnmall.setText("MALLS");
        btnmall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmallActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlsmtcityLayout = new javax.swing.GroupLayout(pnlsmtcity);
        pnlsmtcityLayout.setHorizontalGroup(
        	pnlsmtcityLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(pnlsmtcityLayout.createSequentialGroup()
        			.addGap(143)
        			.addGroup(pnlsmtcityLayout.createParallelGroup(Alignment.LEADING, false)
        				.addComponent(btncntt, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(btnhot, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(btnhist, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(btnatm, GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
        			.addGap(177)
        			.addGroup(pnlsmtcityLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(pnlsmtcityLayout.createSequentialGroup()
        					.addComponent(btnhome, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))
        				.addGroup(pnlsmtcityLayout.createSequentialGroup()
        					.addGroup(pnlsmtcityLayout.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(btnpht, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
        						.addComponent(btnmall, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(btnhosp, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        					.addPreferredGap(ComponentPlacement.RELATED, 186, Short.MAX_VALUE)))
        			.addContainerGap())
        );
        pnlsmtcityLayout.setVerticalGroup(
        	pnlsmtcityLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(pnlsmtcityLayout.createSequentialGroup()
        			.addGap(119)
        			.addGroup(pnlsmtcityLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btnatm, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
        				.addComponent(btnpht, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE))
        			.addGap(48)
        			.addGroup(pnlsmtcityLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btnhist, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
        				.addComponent(btnmall, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(pnlsmtcityLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(pnlsmtcityLayout.createSequentialGroup()
        					.addGap(46)
        					.addGroup(pnlsmtcityLayout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(btnhot, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
        						.addComponent(btnhosp, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE))
        					.addGap(50)
        					.addGroup(pnlsmtcityLayout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(btnhome, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
        						.addComponent(btncntt, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE))
        					.addGap(426))
        				.addGroup(pnlsmtcityLayout.createSequentialGroup()
        					.addGap(139)
        					.addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE))))
        );
        pnlsmtcity.setLayout(pnlsmtcityLayout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        			.addContainerGap(39, Short.MAX_VALUE)
        			.addComponent(pnlsmtcity, GroupLayout.PREFERRED_SIZE, 796, GroupLayout.PREFERRED_SIZE)
        			.addGap(20))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(pnlsmtcity, GroupLayout.PREFERRED_SIZE, 826, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(47, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void btnhomeMouseClicked(java.awt.event.MouseEvent evt) {                                     
        
    }                                    

    private void btnhotActionPerformed(java.awt.event.ActionEvent evt) {                                       
     Desktop browser=Desktop.getDesktop();
     try
     {
         browser.browse(new URI("https://www.makemytrip.com/hotels/nashik-hotels.html"));
     }
     catch(Exception e)
     {
         System.out.println(e);
     }
    }                                      

    private void btnatmActionPerformed(java.awt.event.ActionEvent evt) {                                       
         Desktop browser=Desktop.getDesktop();
        try
        {
            browser.browse(new URI("https://www.justdial.com/Nashik/ATM/nct-10022961"));
        }
        catch(Exception err)
        {
            System.out.println(err);
        }
    }                                      

    private void btnhomeActionPerformed(java.awt.event.ActionEvent evt) {                                        
      new HOME().setVisible(true);
      dispose();
    }                                       

    private void btncnttActionPerformed(java.awt.event.ActionEvent evt) {                                        
        new contact_us().setVisible(true);
        dispose();
    }                                       

    private void btnhistActionPerformed(java.awt.event.ActionEvent evt) {                                        
        Desktop browser=Desktop.getDesktop();
        try
        {
            browser.browse(new URI("https://en.wikipedia.org/wiki/Nashik"));
        }
        catch(Exception err)
        {
            System.out.println(err);
        }
    }                                       

    private void btnphtActionPerformed(java.awt.event.ActionEvent evt) {                                       
        Desktop browser=Desktop.getDesktop();
        try
        {
            browser.browse(new URI("https://www.google.com/travel/things-to-do?g2lb=2502548%2C4258168%2C4260007%2C4270442%2C4274032%2C4291318%2C4305595%2C4306835%2C4308216%2C4317915%2C4326763%2C4328159%2C4329288%2C4333265%2C4357967%2C4358983%2C4360928%2C4364231%2C4366684%2C4366858%2C4369397%2C4371630%2C4270859%2C4284970%2C4291517%2C4307997%2C4356900&hl=en&gl=in&un=1&otf=1&dest_mid=%2Fm%2F037vkk&dest_state_type=main&dest_src=ts&tcfs=EgsKCS9tLzAzN3Zraw&sa=X&utm_campaign=sharing&utm_medium=link&utm_source=htls#ttdm=19.962637_73.755665_10&ttdmf=%252Fm%252F06dzn_"));
        }
        catch(Exception err)
        {
            System.out.println(err);
        }
    }                                      

    private void btnhospActionPerformed(java.awt.event.ActionEvent evt) {                                        
        Desktop browser=Desktop.getDesktop();
        try
        {
            browser.browse(new URI("https://www.justdial.com/Nashik/Hospitals/nct-10253670"));
        }
        catch(Exception err)
        {
            System.out.println(err);
        }
    }                                       

    private void btnmallActionPerformed(java.awt.event.ActionEvent evt) {                                        
    Desktop browser=Desktop.getDesktop();
      try
      {
          browser.browse(new URI("https://www.justdial.com/Nashik/Malls/nct-10310530"));
      }
      catch(Exception e)
      {
          System.out.println(e);
      }
    }                                       

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
            
		
      
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new MySwing2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnatm;
    private javax.swing.JButton btncntt;
    private javax.swing.JButton btnhist;
    private javax.swing.JButton btnhome;
    private javax.swing.JButton btnhosp;
    private javax.swing.JButton btnhot;
    private javax.swing.JButton btnmall;
    private javax.swing.JButton btnpht;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel pnlsmtcity;
    // End of variables declaration                   

    private void String() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

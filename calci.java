package calculator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class calci extends JFrame 
{
    int i;
    public calci() 
    {
        initComponents();
    }
    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        T3 = new javax.swing.JTextField();
        T1 = new javax.swing.JTextField();
        T2 = new javax.swing.JTextField();
        b0 = new javax.swing.JButton();
        bequal = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        badd = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        bsub = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        bmul = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        bdiv = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        clear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Sitka Subheading", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("CALCULATOR");

        T3.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        T3.setForeground(new java.awt.Color(102, 0, 102));

        T1.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        T1.setForeground(new java.awt.Color(255, 102, 0));
        T1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                T1MouseClicked(evt);
            }
        });

        T2.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        T2.setForeground(new java.awt.Color(255, 102, 0));
        T2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                T2MouseClicked(evt);
            }
        });

        b0.setBackground(new java.awt.Color(204, 252, 7));
        b0.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        b0.setForeground(java.awt.Color.magenta);
        b0.setText("0");
        b0.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 0), null, null));
        b0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t0(evt);
            }
        });

        bequal.setBackground(new java.awt.Color(204, 252, 7));
        bequal.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        bequal.setForeground(java.awt.Color.magenta);
        bequal.setText("=");
        bequal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 0), null, null));
        bequal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bequal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bequalActionPerformed(evt);
            }
        });

        b2.setBackground(new java.awt.Color(204, 252, 7));
        b2.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        b2.setForeground(java.awt.Color.magenta);
        b2.setText("2");
        b2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 0), null, null));
        b2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b1.setBackground(new java.awt.Color(204, 252, 7));
        b1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        b1.setForeground(java.awt.Color.magenta);
        b1.setText("1");
        b1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 0), null, null));
        b1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        badd.setBackground(new java.awt.Color(204, 252, 7));
        badd.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        badd.setForeground(java.awt.Color.magenta);
        badd.setText("+");
        badd.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 0), null, null));
        badd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        badd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baddActionPerformed(evt);
            }
        });

        b4.setBackground(new java.awt.Color(204, 252, 7));
        b4.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        b4.setForeground(java.awt.Color.magenta);
        b4.setText("4");
        b4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 0), null, null));
        b4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b5.setBackground(new java.awt.Color(204, 252, 7));
        b5.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        b5.setForeground(java.awt.Color.magenta);
        b5.setText("5");
        b5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 0), null, null));
        b5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        bsub.setBackground(new java.awt.Color(204, 252, 7));
        bsub.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        bsub.setForeground(java.awt.Color.magenta);
        bsub.setText("-");
        bsub.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 0), null, null));
        bsub.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bsub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsubActionPerformed(evt);
            }
        });

        b6.setBackground(new java.awt.Color(204, 252, 7));
        b6.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        b6.setForeground(java.awt.Color.magenta);
        b6.setText("6");
        b6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 0), null, null));
        b6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        b7.setBackground(new java.awt.Color(204, 252, 7));
        b7.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        b7.setForeground(java.awt.Color.magenta);
        b7.setText("7");
        b7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 0), null, null));
        b7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        bmul.setBackground(new java.awt.Color(204, 252, 7));
        bmul.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        bmul.setForeground(java.awt.Color.magenta);
        bmul.setText("*");
        bmul.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 0), null, null));
        bmul.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bmul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmulActionPerformed(evt);
            }
        });

        b8.setBackground(new java.awt.Color(204, 252, 7));
        b8.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        b8.setForeground(java.awt.Color.magenta);
        b8.setText("8");
        b8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 0), null, null));
        b8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        b3.setBackground(new java.awt.Color(204, 252, 7));
        b3.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        b3.setForeground(java.awt.Color.magenta);
        b3.setText("3");
        b3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 0), null, null));
        b3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        bdiv.setBackground(new java.awt.Color(204, 252, 7));
        bdiv.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        bdiv.setForeground(java.awt.Color.magenta);
        bdiv.setText("/");
        bdiv.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 0), null, null));
        bdiv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bdiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdivActionPerformed(evt);
            }
        });

        b9.setBackground(new java.awt.Color(204, 252, 7));
        b9.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        b9.setForeground(java.awt.Color.magenta);
        b9.setText("9");
        b9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 0), null, null));
        b9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Bright", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 153));
        jLabel3.setText("=");

        jLabel4.setFont(new java.awt.Font("Lucida Bright", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 153));
        jLabel4.setText(" ");

        clear.setBackground(new java.awt.Color(204, 252, 7));
        clear.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        clear.setForeground(java.awt.Color.magenta);
        clear.setText("C");
        clear.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 0), null, null));
        clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109))
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 115, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(T1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(b0, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(T2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(127, 127, 127))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bdiv, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bmul, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(badd, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bequal, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bsub, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(T3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(T1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bequal, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b0, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(badd, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bsub, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bmul, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bdiv, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(114, 114, 114))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bequalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bequalActionPerformed
        // TODO add your handling code here:
        int v3=0;
        try
        {
        v1=Integer.parseInt(T1.getText());
        v2=Integer.parseInt(T2.getText());
        if(operator.equals("+"))
            v3=v1+v2;
        else if(operator.equals("-"))
            v3=v1-v2;
        else if(operator.equals("*"))
            v3=v1*v2;
        else if(operator.equals("/"))
        { 
            try
            {
            if(v1==0)
                v3=0;
             v3=v1/v2;
            }
            catch(Exception e)
            {
                 JOptionPane.showMessageDialog(this,"Cant divide by Zero ");
                 clearActionPerformed(evt);
            }
            
        }
         
        }
        catch(Exception e)
        { 
            //JOptionPane.showMessageDialog(this,"Select an operator");
            if(T1.getText().isEmpty() || T2.getText().isEmpty() || jLabel4.getText().isEmpty())
            { 
                JOptionPane.showMessageDialog(this,"Enter both numbers ");
            } 
            else if(!(jLabel4.equals("+")) || !(jLabel4.equals("-")) || !(jLabel4.equals("*")) || !(jLabel4.equals("/")))
            {
                JOptionPane.showMessageDialog(this,"Select an operator "); 
            } 
        }
        String result=Integer.toString(v3);
        T3.setText(result); 
    }//GEN-LAST:event_bequalActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        // TODO add your handling code here:
        if(i==1)
        {
            if(T1.getText().isEmpty())
            {
                T1.setText(b2.getText());
            }
            else
            {
                T1.setText(T1.getText()+b2.getText());
            }
        }
        else if(i==0)
        {
            if(T2.getText().isEmpty())
            {
                   T2.setText(b2.getText());
            }
            else
            {
                T2.setText(T2.getText()+b2.getText());
            }
        }
    }//GEN-LAST:event_b2ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
          if(i==1)
        {
            if(T1.getText().isEmpty())
            {
                T1.setText(b1.getText());
            }
            else
            {
                T1.setText(T1.getText()+b1.getText());
            }
        }
        else if(i==0)
        {
            if(T2.getText().isEmpty())
            {
                   T2.setText(b1.getText());
            }
            else
            {
                T2.setText(T2.getText()+b1.getText());
            }
        }
    }//GEN-LAST:event_b1ActionPerformed

    private void baddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baddActionPerformed
        // TODO add your handling code here:
         jLabel4.setText("+");
         operator="+";
    }//GEN-LAST:event_baddActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        // TODO add your handling code here:
         if(i==1)
        {
            if(T1.getText().isEmpty())
            {
                T1.setText(b4.getText());
            }
            else
            {
                T1.setText(T1.getText()+b4.getText());
            }
        }
        else if(i==0)
        {
            if(T2.getText().isEmpty())
            {
                   T2.setText(b4.getText());
            }
            else
            {
                T2.setText(T2.getText()+b4.getText());
            }
        }
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        // TODO add your handling code here:
          if(i==1)
        {
            if(T1.getText().isEmpty())
            {
                T1.setText(b5.getText());
            }
            else
            {
                T1.setText(T1.getText()+b5.getText());
            }
        }
        else if(i==0)
        {
            if(T2.getText().isEmpty())
            {
                   T2.setText(b5.getText());
            }
            else
            {
                T2.setText(T2.getText()+b5.getText());
            }
        }
    }//GEN-LAST:event_b5ActionPerformed

    private void bsubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsubActionPerformed
        // TODO add your handling code here:
         jLabel4.setText("-");
         operator="-";
    }//GEN-LAST:event_bsubActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        // TODO add your handling code here:
          if(i==1)
        {
            if(T1.getText().isEmpty())
            {
                T1.setText(b6.getText());
            }
            else
            {
                T1.setText(T1.getText()+b6.getText());
            }
        }
        else if(i==0)
        {
            if(T2.getText().isEmpty())
            {
                   T2.setText(b6.getText());
            }
            else
            {
                T2.setText(T2.getText()+b6.getText());
            }
        }
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        // TODO add your handling code here:
         if(i==1)
        {
            if(T1.getText().isEmpty())
            {
                T1.setText(b7.getText());
            }
            else
            {
                T1.setText(T1.getText()+b7.getText());
            }
        }
        else if(i==0)
        {
            if(T2.getText().isEmpty())
            {
                   T2.setText(b7.getText());
            }
            else
            {
                T2.setText(T2.getText()+b7.getText());
            }
        }
    }//GEN-LAST:event_b7ActionPerformed

    private void bmulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmulActionPerformed
        // TODO add your handling code here:
         jLabel4.setText("*");
         operator="*";
    }//GEN-LAST:event_bmulActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        // TODO add your handling code here:
        if(i==1)
        {
            if(T1.getText().isEmpty())
            {
                T1.setText(b8.getText());
            }
            else
            {
                T1.setText(T1.getText()+b8.getText());
            }
        }
        else if(i==0)
        {
            if(T2.getText().isEmpty())
            {
                   T2.setText(b8.getText());
            }
            else
            {
                T2.setText(T2.getText()+b8.getText());
            }
        }
    }//GEN-LAST:event_b8ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        // TODO add your handling code here:
        if(i==1)
        {
            if(T1.getText().isEmpty())
            {
                T1.setText(b3.getText());
            }
            else
            {
                T1.setText(T1.getText()+b3.getText());
            }
        }
        else if(i==0)
        {
            if(T2.getText().isEmpty())
            {
                   T2.setText(b3.getText());
            }
            else
            {
                T2.setText(T2.getText()+b3.getText());
            }
        }
    }//GEN-LAST:event_b3ActionPerformed

    private void bdivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdivActionPerformed
        // TODO add your handling code here:
        jLabel4.setText("/");
        operator="/";
    }//GEN-LAST:event_bdivActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        // TODO add your handling code here:
         if(i==1)
        {
            if(T1.getText().isEmpty())
            {
                T1.setText(b9.getText());
            }
            else
            {
                T1.setText(T1.getText()+b9.getText());
            }
        }
        else if(i==0)
        {
            if(T2.getText().isEmpty())
            {
                   T2.setText(b9.getText());
            }
            else
            {
                T2.setText(T2.getText()+b9.getText());
            }
        }
    }//GEN-LAST:event_b9ActionPerformed

    private void t0(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t0
        // TODO add your handling code here:
        if(i==1)
        {
            if(T1.getText().isEmpty())
            {
                T1.setText(b0.getText());
            }
            else
            {
                T1.setText(T1.getText()+b0.getText());
            }
        }
        else if(i==0)
        {
            if(T2.getText().isEmpty())
            {
                   T2.setText(b0.getText());
            }
            else
            {
                T2.setText(T2.getText()+b0.getText());
            }
        }
    }//GEN-LAST:event_t0

    private void T1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T1MouseClicked
        // TODO add your handling code here:
        i=1;
    }//GEN-LAST:event_T1MouseClicked

    private void T2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T2MouseClicked
        // TODO add your handling code here:
        i=0;
    }//GEN-LAST:event_T2MouseClicked

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        T1.setText("");
        T2.setText(""); 
        T3.setText("");
        jLabel4.setText("");
    }//GEN-LAST:event_clearActionPerformed

    public static void main(String args[])
    { 
        calci c=new calci();
        c.setVisible(true);
    }
     int v1;
     int v2;
     String operator;
    //int i;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField T1;
    private javax.swing.JTextField T2;
    private javax.swing.JTextField T3;
    private javax.swing.JButton b0;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton badd;
    private javax.swing.JButton bdiv;
    private javax.swing.JButton bequal;
    private javax.swing.JButton bmul;
    private javax.swing.JButton bsub;
    private javax.swing.JButton clear;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}

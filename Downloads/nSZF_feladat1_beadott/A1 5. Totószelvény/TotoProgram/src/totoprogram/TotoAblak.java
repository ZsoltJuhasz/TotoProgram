package totoprogram;

import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class TotoAblak extends javax.swing.JFrame {

    // megjelenítendő adatok
    private TotoModell modell;
    
    public TotoAblak(TotoModell modell) {
        initComponents();
        this.modell = modell;
        megjelenit();
        setVisible(true);
    }

    public void megjelenit() {
        eredmenyekKiir();
        nyertesekKiir();
    }

    //  nyertes szelvény kiírása
    private void eredmenyekKiir() {
        char[] nyertesTippek = modell.getSzelvenyLista().get(0).getTIPPEK();
        lblEredmeny1.setText(nyertesTippek[0]+"");
        lblEredmeny2.setText(nyertesTippek[1]+"");
        lblEredmeny3.setText(nyertesTippek[2]+"");
        lblEredmeny4.setText(nyertesTippek[3]+"");
        lblEredmeny5.setText(nyertesTippek[4]+"");
        lblEredmeny6.setText(nyertesTippek[5]+"");
        lblEredmeny7.setText(nyertesTippek[6]+"");
        lblEredmeny8.setText(nyertesTippek[7]+"");
        lblEredmeny9.setText(nyertesTippek[8]+"");
        lblEredmeny10.setText(nyertesTippek[9]+"");
        lblEredmeny11.setText(nyertesTippek[10]+"");
        lblEredmeny12.setText(nyertesTippek[11]+"");
        lblEredmeny13.setText(nyertesTippek[12]+"");
        lblEredmeny14.setText(nyertesTippek[13]+"");
    }

    // nyertes szelvények számának kiírása
    private void nyertesekKiir() {
        txtAEredmeny14.setText(modell.getSzelvenyszamok(modell.getNyertesLista14()));
        txtAEredmeny13.setText(modell.getSzelvenyszamok(modell.getNyertesLista13()));
        txtAEredmeny12.setText(modell.getSzelvenyszamok(modell.getNyertesLista12()));
        txtAEredmeny11.setText(modell.getSzelvenyszamok(modell.getNyertesLista11()));
        txtAEredmeny10.setText(modell.getSzelvenyszamok(modell.getNyertesLista10()));
    }

    // megvizsgálja, hogy a paraméterben átvett string átalakítható e számmá és 1 - 500 000 között van, ha igen visszatér az átalakított számmal, ha nem 0 -val tér vissza a függvény
    private int joSzamE(String szoveg) {
        int szam;
        try {
            szam = Integer.parseInt(szoveg);
            if (szam < 1 || szam > 500000) {
                hibaAblak("A szám csak 1 és 500 000 közötti lehet !");
                szam = 0;
            }
        } catch (NumberFormatException e) {
            hibaAblak("Nem jó számot adtál meg!\n1 és 500 000 közötti egész számot adj meg !");
            szam = 0;
        }
        return szam;
    }

    public void hibaAblak(String hibaUzenet) {
        JOptionPane.showMessageDialog(this, hibaUzenet, "HIBA !", JOptionPane.ERROR_MESSAGE);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        label1 = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblEredmeny1 = new javax.swing.JLabel();
        lblEredmeny2 = new javax.swing.JLabel();
        lblEredmeny3 = new javax.swing.JLabel();
        lblEredmeny4 = new javax.swing.JLabel();
        lblEredmeny5 = new javax.swing.JLabel();
        lblEredmeny6 = new javax.swing.JLabel();
        lblEredmeny7 = new javax.swing.JLabel();
        lblEredmeny8 = new javax.swing.JLabel();
        lblEredmeny9 = new javax.swing.JLabel();
        lblEredmeny10 = new javax.swing.JLabel();
        lblEredmeny11 = new javax.swing.JLabel();
        lblEredmeny12 = new javax.swing.JLabel();
        lblEredmeny13 = new javax.swing.JLabel();
        lblEredmeny14 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAEredmeny10 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAEredmeny11 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAEredmeny12 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtAEredmeny13 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtAEredmeny14 = new javax.swing.JTextArea();
        jLabel36 = new javax.swing.JLabel();
        btnGeneral = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        txtMaxDb = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        label1.setText("label1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Toto program");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("1.");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("2.");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("3.");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("4.");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("7.");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("8.");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("6.");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("5.");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("11.");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setText("12.");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel11.setText("10.");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setText("9.");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel13.setText("13.");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel14.setText("13+1.");

        lblEredmeny1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        lblEredmeny2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        lblEredmeny3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        lblEredmeny4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        lblEredmeny5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        lblEredmeny6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        lblEredmeny7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        lblEredmeny8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        lblEredmeny9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        lblEredmeny10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        lblEredmeny11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        lblEredmeny12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        lblEredmeny13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        lblEredmeny14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jLabel29.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        jLabel29.setText("Heti eredmények");

        jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        jLabel30.setText("Nyertes szelvények");

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel31.setText("13+1.");

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel32.setText("13.");

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel33.setText("12.");

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel34.setText("11.");

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel35.setText("10.");

        txtAEredmeny10.setEditable(false);
        txtAEredmeny10.setColumns(20);
        txtAEredmeny10.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        txtAEredmeny10.setLineWrap(true);
        txtAEredmeny10.setRows(5);
        txtAEredmeny10.setBorder(null);
        txtAEredmeny10.setOpaque(false);
        jScrollPane1.setViewportView(txtAEredmeny10);

        txtAEredmeny11.setEditable(false);
        txtAEredmeny11.setColumns(20);
        txtAEredmeny11.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        txtAEredmeny11.setLineWrap(true);
        txtAEredmeny11.setRows(2);
        txtAEredmeny11.setBorder(null);
        txtAEredmeny11.setOpaque(false);
        jScrollPane2.setViewportView(txtAEredmeny11);

        txtAEredmeny12.setEditable(false);
        txtAEredmeny12.setColumns(20);
        txtAEredmeny12.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        txtAEredmeny12.setAutoscrolls(false);
        txtAEredmeny12.setOpaque(false);
        jScrollPane3.setViewportView(txtAEredmeny12);

        txtAEredmeny13.setEditable(false);
        txtAEredmeny13.setColumns(20);
        txtAEredmeny13.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        txtAEredmeny13.setAutoscrolls(false);
        txtAEredmeny13.setOpaque(false);
        jScrollPane4.setViewportView(txtAEredmeny13);

        txtAEredmeny14.setEditable(false);
        txtAEredmeny14.setColumns(20);
        txtAEredmeny14.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        txtAEredmeny14.setAutoscrolls(false);
        txtAEredmeny14.setOpaque(false);
        jScrollPane5.setViewportView(txtAEredmeny14);

        jLabel36.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        jLabel36.setText("Találat");

        btnGeneral.setText("Generálás");
        btnGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeneralActionPerformed(evt);
            }
        });

        jLabel15.setText("Maximum hány szelvényt generálhat:");

        txtMaxDb.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtMaxDb.setForeground(new java.awt.Color(102, 102, 102));
        txtMaxDb.setText("100000");
        txtMaxDb.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMaxDbFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMaxDbFocusLost(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(javax.swing.GroupLayout.Alignment.CENTER, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEredmeny1)
                            .addComponent(jLabel1))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEredmeny2)
                            .addComponent(jLabel2))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEredmeny3)
                            .addComponent(jLabel3))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEredmeny4)
                            .addComponent(jLabel4))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEredmeny5)
                            .addComponent(jLabel8))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEredmeny6)
                            .addComponent(jLabel7))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEredmeny7)
                            .addComponent(jLabel5))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEredmeny8)
                            .addComponent(jLabel6))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEredmeny9)
                            .addComponent(jLabel12))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEredmeny10)
                            .addComponent(jLabel11))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEredmeny11)
                            .addComponent(jLabel9))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(lblEredmeny12))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(lblEredmeny13))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEredmeny14)
                            .addComponent(jLabel14))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMaxDb, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel35)
                            .addComponent(jLabel34)
                            .addComponent(jLabel33)
                            .addComponent(jLabel32)
                            .addComponent(jLabel31)
                            .addComponent(jLabel36))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane1))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblEredmeny1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEredmeny2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEredmeny3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEredmeny4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEredmeny7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEredmeny8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEredmeny6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEredmeny5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEredmeny11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEredmeny12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEredmeny10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEredmeny9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEredmeny13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEredmeny14, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(jLabel36))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtMaxDb)
                    .addComponent(btnGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jScrollPane3, jScrollPane4, jScrollPane5});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtMaxDbFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMaxDbFocusGained
        txtMaxDb.setText("");
    }//GEN-LAST:event_txtMaxDbFocusGained

    private void txtMaxDbFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMaxDbFocusLost
        if (txtMaxDb.getText().isEmpty()) {
            txtMaxDb.setText(modell.getMAXSZELVENYDB() + "");
        }
    }//GEN-LAST:event_txtMaxDbFocusLost

    private void btnGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeneralActionPerformed
        String maxDbString = txtMaxDb.getText();
        int maxSzelvenyDb = joSzamE(maxDbString);
        if (maxSzelvenyDb > 0) {
            modell.listakUrit();
            modell.setMAXSZELVENYDB(maxSzelvenyDb);
            modell.adatokGeneral();
            megjelenit();
        }
    }//GEN-LAST:event_btnGeneralActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGeneral;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField jTextField1;
    private java.awt.Label label1;
    private javax.swing.JLabel lblEredmeny1;
    private javax.swing.JLabel lblEredmeny10;
    private javax.swing.JLabel lblEredmeny11;
    private javax.swing.JLabel lblEredmeny12;
    private javax.swing.JLabel lblEredmeny13;
    private javax.swing.JLabel lblEredmeny14;
    private javax.swing.JLabel lblEredmeny2;
    private javax.swing.JLabel lblEredmeny3;
    private javax.swing.JLabel lblEredmeny4;
    private javax.swing.JLabel lblEredmeny5;
    private javax.swing.JLabel lblEredmeny6;
    private javax.swing.JLabel lblEredmeny7;
    private javax.swing.JLabel lblEredmeny8;
    private javax.swing.JLabel lblEredmeny9;
    private javax.swing.JTextArea txtAEredmeny10;
    private javax.swing.JTextArea txtAEredmeny11;
    private javax.swing.JTextArea txtAEredmeny12;
    private javax.swing.JTextArea txtAEredmeny13;
    private javax.swing.JTextArea txtAEredmeny14;
    private javax.swing.JTextField txtMaxDb;
    // End of variables declaration//GEN-END:variables
}

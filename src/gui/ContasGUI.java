package gui;

//import com.itextpdf.io.font.woff2.Woff2Common.Table;
//import com.itextpdf.kernel.pdf.PdfDocument;
//import com.itextpdf.text.Document;
import dao.ContasDAO;
import java.io.*;
import java.sql.*;
import java.text.*;
import java.util.Date;
import java.util.Formatter;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Contas;

public class ContasGUI extends javax.swing.JFrame {

    /**
     * Creates new form ContasGUI
     */
    private static String usuario;
    
    public ContasGUI(Login l, String usuario) {
        //configurações iniciais
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        jTData.setDate(new Date(System.currentTimeMillis()));
        jTData1.setDate(new Date(System.currentTimeMillis()));
        jDateInicio.setDate(new Date(System.currentTimeMillis()));
        jDateFim.setDate(new Date(System.currentTimeMillis()));
        jTFJuros.setEnabled(false);
        jTFMulta.setEnabled(false);
        l.setVisible(false);
        l.setEnabled(false);

        this.usuario = usuario;
        jMenuItemNomeUsuario.setText(usuario);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jPopupMenu3 = new javax.swing.JPopupMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jDateInicio = new com.toedter.calendar.JDateChooser();
        jDateFim = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTValor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTData = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jTData1 = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jCheckBoxMulta = new javax.swing.JCheckBox();
        jCheckBoxJuros = new javax.swing.JCheckBox();
        jTFJuros = new javax.swing.JTextField();
        jTFMulta = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemNomeUsuario = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem7 = new javax.swing.JMenuItem();

        jLabel9.setText("jLabel9");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        jMenuItem5.setText("jMenuItem5");

        jMenuItem6.setText("jMenuItem6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton3.setText("CONSULTAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("até");

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuário", "Valor", "Pagamento", "Vencimento", "Juros", "Multa", "Novo Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable);
        if (jTable.getColumnModel().getColumnCount() > 0) {
            jTable.getColumnModel().getColumn(0).setResizable(false);
            jTable.getColumnModel().getColumn(1).setResizable(false);
            jTable.getColumnModel().getColumn(2).setResizable(false);
            jTable.getColumnModel().getColumn(3).setResizable(false);
            jTable.getColumnModel().getColumn(4).setResizable(false);
            jTable.getColumnModel().getColumn(5).setResizable(false);
            jTable.getColumnModel().getColumn(6).setResizable(false);
        }

        jButton2.setText("EXPORTAR TXT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pagamento", "Vencimento" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jDateInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(jDateFim, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 687, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jDateFim, jDateInicio});

        jTabbedPane2.addTab("CONSULTA", jPanel2);

        jButton1.setText("CADASTRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Valor do Boleto:*");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Data de Pagamento:*");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Data de Vencimento:*");

        jTData1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTData1FocusLost(evt);
            }
        });
        jTData1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTData1MouseClicked(evt);
            }
        });
        jTData1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTData1PropertyChange(evt);
            }
        });
        jTData1.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                jTData1VetoableChange(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setToolTipText("máximo: 500 caracteres");
        jTextArea1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextArea1KeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(jTextArea1);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Descrição:");

        jCheckBoxMulta.setText("Multa (%)");
        jCheckBoxMulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMultaActionPerformed(evt);
            }
        });

        jCheckBoxJuros.setText("Juros ao dia (%)");
        jCheckBoxJuros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxJurosActionPerformed(evt);
            }
        });

        jTFMulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFMultaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jCheckBoxMulta)
                                .addComponent(jCheckBoxJuros))
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTData1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTValor)
                            .addComponent(jTFMulta)
                            .addComponent(jTFJuros)
                            .addComponent(jTData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(82, 82, 82))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTData1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxJuros)
                    .addComponent(jTFJuros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxMulta)
                    .addComponent(jTFMulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );

        jTabbedPane2.addTab("CADASTRO", jPanel1);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );
        jDesktopPane1.setLayer(jTabbedPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jMenu2.setText("Usuário");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItemNomeUsuario.setText("admin");
        jMenu2.add(jMenuItemNomeUsuario);
        jMenu2.add(jSeparator1);

        jMenuItem7.setText("Sair");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // teste se o campo valor está vazio
        if ((jTValor.getText().isEmpty())) {
            JOptionPane.showMessageDialog(null, "Os campos * não podem estar vazios!");
        } else {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

            String vencimento = sdf.format(jTData1.getDate());
            String pagamento = sdf.format(jTData.getDate());

            ContasDAO dao = new ContasDAO();
            Contas contas = new Contas();
            try {

                double d = Double.parseDouble(jTValor.getText());
                d = Math.round(d * 100) / 100d;

                //adciona os valores para boleto e acrecimo
                contas.setBoletoValor(Double.toString(d));
                contas.setBoletoDataVencimento(vencimento);
                contas.setBoletoDataPagamento(pagamento);
                contas.setBoletoDescricao(jTextArea1.getText() + " ");
                contas.setUsuario(usuario);

                //seta os valores de acrecimo para 0 caso nao haja acrecimo
                contas.setAcrecimoJuros("0");
                contas.setAcrecimoMulta("0");
                contas.setAcrecimoNovoValor(Double.toString(d));

                try {//calculo da diferença de dias

                    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

                    Date dataPagamento = null;
                    Date dataVencimento = null;

                    dataPagamento = format.parse(pagamento);
                    dataVencimento = format.parse(vencimento);

                    long diff = dataPagamento.getTime() - dataVencimento.getTime();
                    long diffDays = diff / (24 * 60 * 60 * 1000);

                    String difDiasS = String.valueOf(diffDays);
                    int difDias = Integer.parseInt(difDiasS);

                    double juros = 0;
                    double multa = 0;

                    if (jCheckBoxJuros.isSelected()) {
                        juros = Double.parseDouble(jTFJuros.getText()) / 100;//juros
                        juros = Math.round(juros * 100) / 100d;
                    }
                    if (jCheckBoxMulta.isSelected()) {
                        multa = Double.parseDouble(jTFMulta.getText()) / 100;//calculo da multa
                        multa = Math.round(multa * 100) / 100d;

                    }
                    //teste se boleto está atrasado
                    if (dataPagamento.compareTo(dataVencimento) > 0 && (jCheckBoxMulta.isSelected()
                            || jCheckBoxJuros.isSelected())) {

                        double valorB = Double.parseDouble(jTValor.getText());
                        valorB = Math.round(valorB * 100) / 100d;

                        if (jCheckBoxJuros.isSelected()) {
                            juros = valorB * juros;//juros
                            juros = Math.round(juros * 100) / 100d;
                        }
                        if (jCheckBoxMulta.isSelected()) {
                            multa = valorB * multa;//calculo da multa
                            multa = Math.round(multa * 100) / 100d;
                        }

                        valorB += multa + juros;//calculo do novo valor 
                        valorB = Math.round(valorB * 100) / 100d;

                        //adiciona os valores de acrecimo
                        contas.setAcrecimoJuros(Double.toString(juros));
                        contas.setAcrecimoMulta(Double.toString(multa));
                        contas.setAcrecimoNovoValor(Double.toString(valorB));

                        JOptionPane.showMessageDialog(this, difDias + " dias de atraso: R$"
                                + Double.toString(juros) + " de juros, e R$" + Double.toString(multa)
                                + " de multa.\n Valor resultante: R$" + valorB);
                    }
                    int input = JOptionPane.showConfirmDialog(null,
                            "Tem certeza que deseja cadastrar ?", "",
                            JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
                    if (input == 0) {
                        //insere no banco os valores
                        contas.setBoletoCod(dao.Adiciona(contas));
                        dao.AdicionaAcrecimo(contas);

                        JOptionPane.showMessageDialog(this, "Pagamento Cadastrado com Sucesso!");

                        //reseta os campos
                        jTData.setDate(new Date(System.currentTimeMillis()));
                        jTValor.setText("");
                        jTFMulta.setText("");
                        jTFJuros.setText("");
                        jTextArea1.setText("");
                        jTFJuros.setEnabled(false);
                        jTFMulta.setEnabled(false);
                        jCheckBoxJuros.setSelected(false);
                        jCheckBoxMulta.setSelected(false);
                    }

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(this, "Juros e Multa devem ser números");
                    jTFMulta.setText("");
                    jTFJuros.setText("");

                } catch (ParseException ex) {
                    Logger.getLogger(ContasGUI.class.getName()).log(Level.SEVERE, null, ex);
                }

            } catch (NumberFormatException u) {
                JOptionPane.showMessageDialog(null, "Insira apenas Números Inteiros no Valor do Boleto!");
                jTValor.setText("");
            }

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //pega o interva das datas para consulta
        String sel = jComboBox2.getSelectedItem().toString();
        Date inicio = new Date();
        Date fim = new Date();
        inicio = jDateInicio.getDate();
        fim = jDateFim.getDate();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dataInicio = sdf.format(inicio);
        String dataFim = sdf.format(fim);

        ContasDAO cd = new ContasDAO();
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        
        model.setNumRows(0);
        String data = null;
        Date dData = null;

        try {
            ResultSet rs = cd.Consulta();

            //percorre o banco e preenche a tabela de consulta
            while (rs.next()) {
                Vector linhas = new Vector();
                //verifica o método de consulta
                if (sel.equals("Pagamento")) {
                    data = rs.getString("boleto_data_pagamento");
                } else {
                    data = rs.getString("boleto_data_vencimento");

                }
                dData = sdf.parse(data);
                if (dData.compareTo(sdf.parse(dataInicio)) >= 0 && dData.compareTo(sdf.parse(dataFim)) <= 0) {
                    linhas.add(rs.getString("fk_usuario_usuario"));
                    linhas.add(rs.getString("boleto_valor"));
                    linhas.add(rs.getString("boleto_data_pagamento"));
                    linhas.add(rs.getString("boleto_data_vencimento"));
                    linhas.add(rs.getString("acrecimo_juros"));
                    linhas.add(rs.getString("acrecimo_multa"));
                    linhas.add(rs.getString("acrecimo_novo_valor"));

                    model.addRow(linhas);
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(ContasGUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(ContasGUI.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextArea1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea1KeyTyped
        // TODO add your handling code here:
        //limita o tamanho da área de descricao para 500 caracteres
        String text = jTextArea1.getText();
        if (text.length() > 499) {
            JOptionPane.showMessageDialog(null, "Tamanho máximo: 500 caracteres");
        }
    }//GEN-LAST:event_jTextArea1KeyTyped

    private void jCheckBoxMultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMultaActionPerformed
        // TODO add your handling code here:
        //verifica se a data de vencimento esta acima da atual 
        Date data = new Date();
        if (jCheckBoxMulta.isSelected() && jTData1.getDate().compareTo(data) <= 0) {
            jTFMulta.setEnabled(true);
        } else {
            jTFMulta.setEnabled(false);
        }

    }//GEN-LAST:event_jCheckBoxMultaActionPerformed

    private void jTFMultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFMultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFMultaActionPerformed

    private void jCheckBoxJurosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxJurosActionPerformed
        // TODO add your handling code here
        //verifica se a data de vencimento esta acima da atual 

        Date data = new Date();
        if (jCheckBoxJuros.isSelected() && jTData1.getDate().compareTo(data) <= 0) {
            jTFJuros.setEnabled(true);
        } else {
            jTFJuros.setEnabled(false);
        }

    }//GEN-LAST:event_jCheckBoxJurosActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        JFileChooser jfc;
        jfc = new JFileChooser();
        jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        jfc.setAcceptAllFileFilterUsed(false);
        jfc.showOpenDialog(this);
        Date d = new Date();
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy-hh:mm:ss");
        String dS = df.format(d);
        
        //pega o caminho selecionado pelo usuário 
        String path = jfc.getSelectedFile().getPath();
        try {
            Formatter f = new Formatter(path + "/" + dS + ".txt");

            for (int i = 0; i < 7; i++) {
                if (i != 6 && i != 0) {
                    f.format(jTable.getColumnName(i) + "\t|  ");
                } else if (i == 0) {
                    f.format("|  " + jTable.getColumnName(i) + "\t|  ");
                } else {
                    f.format(jTable.getColumnName(i) + "\t");
                }
            }

            f.format("\n");

            f.format("+--------------+--------------+"
                    + "--------------+--------------+"
                    + "--------------+--------------+--------------\n");
            for (int i = 0; i < jTable.getRowCount(); i++) {
                for (int j = 0; j < jTable.getColumnCount(); j++) {
                    f.format("| " + jTable.getValueAt(i, j) + "\t");
                }
                f.format("\n");

                f.format("+--------------+--------------+"
                        + "--------------+--------------+"
                        + "--------------+--------------+--------------\n");
            }

            f.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(ContasGUI.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        //desabilita a tela de consulta/cadastro e habilita a tela de login
        this.setVisible(false);
        Login log = new Login();
        log.setVisible(true);

    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jTData1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTData1FocusLost
        // TODO add your handling code here:

    }//GEN-LAST:event_jTData1FocusLost

    private void jTData1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTData1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTData1MouseClicked

    private void jTData1VetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_jTData1VetoableChange
        // TODO add your handling code here:

    }//GEN-LAST:event_jTData1VetoableChange

    private void jTData1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTData1PropertyChange
        // TODO add your handling code here:

//         JOptionPane.showMessageDialog(null, "teest");
    }//GEN-LAST:event_jTData1PropertyChange

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

   
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
            java.util.logging.Logger.getLogger(ContasGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContasGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContasGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContasGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new ContasGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBoxJuros;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JCheckBox jCheckBoxMulta;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private com.toedter.calendar.JDateChooser jDateFim;
    private com.toedter.calendar.JDateChooser jDateInicio;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItemNomeUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JPopupMenu jPopupMenu3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private com.toedter.calendar.JDateChooser jTData;
    private com.toedter.calendar.JDateChooser jTData1;
    private javax.swing.JTextField jTFJuros;
    private javax.swing.JTextField jTFMulta;
    private javax.swing.JTextField jTValor;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

    void main() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

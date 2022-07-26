/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minimarket_hadi;
   import java.sql.Connection;
   import java.sql.ResultSet;
   import java.sql.SQLException;
   import java.sql.Statement;
   import javax.swing.JOptionPane;
   import javax.swing.table.DefaultTableModel;
   import java.text.SimpleDateFormat;
   import java.sql.PreparedStatement;
   import java.util.ArrayList;
   import java.util.List;
import koneksi.koneksi_hadi;

/**
 *
 * @author admin
 */
public class FormTransaksiPembelian_hadi extends javax.swing.JFrame {
    private Connection koneksi;
    private koneksi_hadi db = new koneksi_hadi();
    private PreparedStatement pst;
    public boolean databaru;
    private String sqldetail;

    /**
     * Creates new form FormTransaksiPembelian_hadi
     */
    public FormTransaksiPembelian_hadi() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nofaktur_hadi = new javax.swing.JTextField();
        kodebarang_hadi = new javax.swing.JComboBox<>();
        kode_supplierhadi = new javax.swing.JComboBox<>();
        jumlah_hadi = new javax.swing.JTextField();
        cari_hadi = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        kode_pegawaihadi = new javax.swing.JComboBox<>();
        pegawai_hadi = new javax.swing.JTextField();
        namabarang_hadi = new javax.swing.JTextField();
        harga_hadi = new javax.swing.JTextField();
        tambah = new javax.swing.JButton();
        search = new javax.swing.JButton();
        supplier_hadi = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_hadi = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        gtotal_hadi = new javax.swing.JTextField();
        exit = new javax.swing.JButton();
        add = new javax.swing.JButton();
        save = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        tanggal_hadi = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("FORM TRANSAKSI PEMBELIAN");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(280, 20, 230, 17);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("JUMLAH");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(520, 380, 80, 20);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("NO FAKTUR");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 100, 90, 15);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("TANGGAL");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 160, 90, 15);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("SUPPLIER");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 230, 90, 15);
        getContentPane().add(nofaktur_hadi);
        nofaktur_hadi.setBounds(120, 90, 240, 30);

        kodebarang_hadi.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                kodebarang_hadiItemStateChanged(evt);
            }
        });
        getContentPane().add(kodebarang_hadi);
        kodebarang_hadi.setBounds(30, 420, 90, 30);

        kode_supplierhadi.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                kode_supplierhadiItemStateChanged(evt);
            }
        });
        getContentPane().add(kode_supplierhadi);
        kode_supplierhadi.setBounds(120, 220, 140, 30);
        getContentPane().add(jumlah_hadi);
        jumlah_hadi.setBounds(480, 420, 130, 30);
        getContentPane().add(cari_hadi);
        cari_hadi.setBounds(540, 80, 180, 40);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("PEGAWAI");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 300, 90, 15);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("GRAND TOTAL");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 630, 90, 20);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText("NAMA BARANG");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(180, 380, 90, 20);

        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setText("HARGA");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(370, 380, 90, 20);

        kode_pegawaihadi.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                kode_pegawaihadiItemStateChanged(evt);
            }
        });
        getContentPane().add(kode_pegawaihadi);
        kode_pegawaihadi.setBounds(120, 290, 140, 30);
        getContentPane().add(pegawai_hadi);
        pegawai_hadi.setBounds(290, 290, 180, 30);
        getContentPane().add(namabarang_hadi);
        namabarang_hadi.setBounds(150, 420, 150, 30);
        getContentPane().add(harga_hadi);
        harga_hadi.setBounds(330, 420, 130, 30);

        tambah.setText("TAMBAH");
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });
        getContentPane().add(tambah);
        tambah.setBounds(650, 410, 80, 50);

        search.setText("SEARCH");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        getContentPane().add(search);
        search.setBounds(450, 90, 80, 25);
        getContentPane().add(supplier_hadi);
        supplier_hadi.setBounds(290, 220, 180, 30);

        tabel_hadi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Kode Barang", "Nama Barang", "Harga", "Jumlah", "Total"
            }
        ));
        jScrollPane1.setViewportView(tabel_hadi);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 490, 720, 110);

        jLabel10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel10.setText("KODE BARANG");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(30, 380, 90, 20);
        getContentPane().add(gtotal_hadi);
        gtotal_hadi.setBounds(130, 620, 120, 40);

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exit.png"))); // NOI18N
        exit.setText("EXIT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit);
        exit.setBounds(600, 690, 110, 39);

        add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add.png"))); // NOI18N
        add.setText("ADD");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        getContentPane().add(add);
        add.setBounds(30, 690, 90, 39);

        save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save.png"))); // NOI18N
        save.setText("SAVE");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        getContentPane().add(save);
        save.setBounds(130, 690, 100, 39);

        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/update.png"))); // NOI18N
        update.setText("UPDATE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update);
        update.setBounds(240, 690, 120, 39);

        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete.png"))); // NOI18N
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete);
        delete.setBounds(370, 690, 110, 39);

        cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancel.png"))); // NOI18N
        cancel.setText("CANCEL");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel);
        cancel.setBounds(480, 690, 110, 39);
        getContentPane().add(tanggal_hadi);
        tanggal_hadi.setBounds(120, 150, 160, 22);

        jLabel11.setFont(new java.awt.Font("Agency FB", 2, 14)); // NOI18N
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cpright.png"))); // NOI18N
        jLabel11.setText("Muhamad Hadi Saputra - 021200015");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(0, 760, 210, 48);

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 790, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 790, 70);

        setSize(new java.awt.Dimension(811, 860));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        // TODO add your handling code here:
        int jumlah;
         double harga, total;
         jumlah=Integer.parseInt(jumlah_hadi.getText());
         harga=Double.parseDouble(harga_hadi.getText());
         total=harga*jumlah;
    //Memasukkan data ke tabel        
          DefaultTableModel dataModel = (DefaultTableModel) tabel_hadi.getModel();
            List list = new ArrayList<>();
            tabel_hadi.setAutoCreateColumnsFromModel(true);
            list.add(kodebarang_hadi.getSelectedItem());
            list.add(namabarang_hadi.getText());
            list.add(harga_hadi.getText());
            list.add(jumlah_hadi.getText());
            list.add(total);
            dataModel.addRow(list.toArray());        
    //----------Kosongkan Field
           kodebarang_hadi.setSelectedIndex(0);
            namabarang_hadi.setText("");
            harga_hadi.setText("");
            jumlah_hadi.setText("");           
        
            
           double total_hitung = 0;
            for (int i = 0; i < tabel_hadi.getRowCount(); i++){
                double amount = Double.parseDouble(tabel_hadi.getValueAt(i, 4).toString());
                total_hitung += amount;
            }
            gtotal_hadi.setText(String.valueOf(total_hitung));
    
    }//GEN-LAST:event_tambahActionPerformed

    private void kode_supplierhadiItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_kode_supplierhadiItemStateChanged
        // TODO add your handling code here:
         String id;
        id=(String)kode_supplierhadi.getSelectedItem();
        supplier_hadi.setText(id);
        db.koneksiDatabase();
        try {
            String query = "SELECT * FROM tbsupplier_hadi where kode_supplier= '" + id + "'";
            Statement st = db.getKoneksi().createStatement();
            ResultSet rs = st.executeQuery(query);
            
            while (rs.next())
            {
               supplier_hadi.setText(rs.getString("nama_supplier"));
            }
        }
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Data Tidak Ditemukan !");
        }
    }//GEN-LAST:event_kode_supplierhadiItemStateChanged

    private void kode_pegawaihadiItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_kode_pegawaihadiItemStateChanged
        // TODO add your handling code here:
         String id;
        id=(String)kode_pegawaihadi.getSelectedItem();
        pegawai_hadi.setText(id);
        db.koneksiDatabase();
        try {
            String query = "SELECT * FROM tbpegawai_hadi where id_pegawai= '" + id + "'";
            Statement st = db.getKoneksi().createStatement();
            ResultSet rs = st.executeQuery(query);
            
            while (rs.next())
            {
               pegawai_hadi.setText(rs.getString("nama_pegawai"));
            }
        }
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Data Tidak Ditemukan !");
        }
    }//GEN-LAST:event_kode_pegawaihadiItemStateChanged

    private void kodebarang_hadiItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_kodebarang_hadiItemStateChanged
        // TODO add your handling code here:
         String id;
        id=(String)kodebarang_hadi.getSelectedItem();
        namabarang_hadi.setText(id);
        db.koneksiDatabase();
        try {
            String query = "SELECT * FROM tbbarang_hadi where kode_barang= '" + id + "'";
            Statement st = db.getKoneksi().createStatement();
            ResultSet rs = st.executeQuery(query);
            
            while (rs.next())
            {
               namabarang_hadi.setText(rs.getString("nama_barang"));
               harga_hadi.setText(rs.getString("harga_jual"));
            }
        }
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Data Tidak Ditemukan !");
        }
    }//GEN-LAST:event_kodebarang_hadiItemStateChanged

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        //ADD
        nofaktur_hadi.setText("");
        tanggal_hadi.setDate(null);
        kodebarang_hadi.setSelectedIndex(0);
        namabarang_hadi.setText("");
        kode_supplierhadi.setSelectedIndex(0);
        supplier_hadi.setText("");
        kode_pegawaihadi.setSelectedIndex(0);
        pegawai_hadi.setText("");
        harga_hadi.setText("");
        jumlah_hadi.setText("");
        gtotal_hadi.setText("");
        cari_hadi.setText("");
    }//GEN-LAST:event_addActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
        // Simpan Data Header Service
        
          db.koneksiDatabase();
          SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
          String kode_supplier, id_pegawai, kode_barang ;
          kode_supplier= (String) kode_supplierhadi.getSelectedItem();
          id_pegawai= (String) kode_pegawaihadi.getSelectedItem();
          boolean result = false;
          boolean resultdetail = false;

     // kode Simpan---------------
        String sql = "Insert Into tbheader_pembelianhadi Values ('" + nofaktur_hadi.getText() + "',  '" +
                                                                             sdf.format(tanggal_hadi.getDate()) + "','" +
                                                                             kode_supplier + "','" + 
                                                                             id_pegawai + "','" + 
                                                                             gtotal_hadi.getText() + "' )";
        try {
                  Statement st = db.getKoneksi().createStatement();
                  st.executeUpdate(sql);
                  result=true;
        
      
// Akhir Proses Simpan Header.......

      // Proses Simpan Detail

              int rows=tabel_hadi.getRowCount();
                String queryco = "Insert into tbdetail_pembelianhadi(no_faktur,kode_barang,harga_pembelian,jumlah_pembelian) values (?,?,?,?)";
                  pst = db.getKoneksi().prepareStatement(queryco);
                  db.getKoneksi().setAutoCommit(false);
              for(int row = 0; row<rows; row++)
              {  
                String nofaktur = (String)nofaktur_hadi.getText();
                String kodebarang = (String) tabel_hadi.getValueAt(row, 0);
                float harga = Float.parseFloat(tabel_hadi.getValueAt(row, 2).toString());
                int jumlah = Integer.parseInt(tabel_hadi.getValueAt(row, 3).toString());
                pst.setString(1, nofaktur);
                pst.setString(2, kodebarang);
                pst.setFloat(3, harga);
                pst.setInt(4, jumlah);
                pst.addBatch();
              }
                pst.executeBatch();
             db.getKoneksi().commit();
              JOptionPane.showMessageDialog(null, "Data Berhasil Di Simpan");
                  //simpan(); 
                  
                  textblank();
             
        }catch (SQLException e)
               {     
                   JOptionPane.showMessageDialog(null, e.getMessage());              
               }
    }//GEN-LAST:event_saveActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
         //CANCEL
        textblank();
    }//GEN-LAST:event_cancelActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
      getdata();
      tampil_ID();
      tampil_ID_2();
      tampil_ID_3();
    }//GEN-LAST:event_formWindowOpened

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
        db.koneksiDatabase();
        boolean result = false;

        try {
            String query = "SELECT * FROM tbheader_pembelianhadi where no_faktur = '" + cari_hadi.getText() + "'";
            Statement st = db.getKoneksi().createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                nofaktur_hadi.setText(rs.getString("no_faktur"));
                supplier_hadi.setText(rs.getString("kode_supplier"));
                pegawai_hadi.setText(rs.getString("id_pegawai"));
                jumlah_hadi.setText(rs.getString("total"));
                

            }
        }
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Data Tidak Ditemukan !");

        }
    }//GEN-LAST:event_searchActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        // Hapus Data
        db.koneksiDatabase();
        int ok=JOptionPane.showConfirmDialog(null,"Apakah Yakin Mendelete record ini???",
            "Confirmation",JOptionPane.YES_NO_CANCEL_OPTION);
        if (ok==0)
        {
            try
            {
                String sql = "Delete FROM tbheader_pembelianhadi where no_faktur  = '" + nofaktur_hadi.getText() + "'";
                Statement st = db.getKoneksi().createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Delete Data Sukses");
                //   tekskosong();
                getdata();
            }
            catch (SQLException e)
            {
                JOptionPane.showMessageDialog(null, "Delete Data Gagal");
            }
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
         db.koneksiDatabase();
          boolean result = false;
        
        try {
            String sql = "update tbheader_pembelianhadi SET no_faktur ='"+ nofaktur_hadi.getText()+
                "',kode_supplier = '" + supplier_hadi.getText()+
                 "',id_pegawai = '" + pegawai_hadi.getText()+
                 "' WHERE no_faktur = '"+nofaktur_hadi.getText()+
                "'";
            Statement st = db.getKoneksi().createStatement();
            st.executeUpdate(sql);
            result=true;
            JOptionPane.showMessageDialog(null, "Proses Update Sukses !");

            textblank();
            getdata();
            
          } catch (SQLException e)
             {     
                  JOptionPane.showMessageDialog(null, e.getMessage());              
             }
    }//GEN-LAST:event_updateActionPerformed
    public void getdata(){
        // Code Tampil Data
        DefaultTableModel tbm = new DefaultTableModel();
        //membuat nama kolom pada tabel
            tbm.addColumn("Kode Barang");
            tbm.addColumn("Nama Barang");
            tbm.addColumn("Harga");
            tbm.addColumn("Jumlah");
            tbm.addColumn("Total");
            tabel_hadi.setModel(tbm);
            db.koneksiDatabase();

               
    } 
            public void textblank()
            {
                nofaktur_hadi.setText("");
                tanggal_hadi.setDate(null);
                kodebarang_hadi.setSelectedIndex(0);
                namabarang_hadi.setText("");
                kode_supplierhadi.setSelectedIndex(0);
                supplier_hadi.setText("");
                kode_pegawaihadi.setSelectedIndex(0);
                pegawai_hadi.setText("");
                harga_hadi.setText("");
                jumlah_hadi.setText("");
                gtotal_hadi.setText("");
                cari_hadi.setText("");
            } 
            
            
            
            // Procedure Menampilkan Data Ke Combo Box        
    public void tampil_ID(){
              
         try
          {
            String query = "SELECT * FROM tbanggota_hadi group by id_anggotahadi";
            Statement st = db.getKoneksi().createStatement();
            ResultSet rs = st.executeQuery(query);
            kode_supplierhadi.addItem("Pilih Data Supplier");
            while (rs.next()) 
              {                       
               kode_supplierhadi.addItem(rs.getString("kode_supplier"));
              
             }
          }   
         
        catch(Exception ex)
        {     
        }  
    }    
  
              
    public void tampil_ID_2(){
              
         try
          {
            String query = "SELECT * FROM tbpegawai_hadi group by id_pegawai";
            Statement st = db.getKoneksi().createStatement();
            ResultSet rs = st.executeQuery(query);
            kode_pegawaihadi.addItem("Pilih Data Pegawai");
            while (rs.next()) 
              {                       
               kode_pegawaihadi.addItem(rs.getString("id_pegawai"));
              
             }
          }   
         
        catch(Exception ex)
        {     
        } 
    }
    
    public void tampil_ID_3(){
              
         try
          {
            String query = "SELECT * FROM tbbarang_hadi group by kode_barang";
            Statement st = db.getKoneksi().createStatement();
            ResultSet rs = st.executeQuery(query);
            kodebarang_hadi.addItem(" Pilih Data Barang");
            while (rs.next()) 
              {                       
               kodebarang_hadi.addItem(rs.getString("kode_barang"));
              
             }
          }   
         
        catch(Exception ex)
        {     
        } 
    }
    
    
void  simpan()
    {
      int a = 0;
          sqldetail = "INSERT INTO tbdetail_pembelianhadi "+
                   "VALUES"+
                          "('"+nofaktur_hadi.getText() +"', "+
                          "'"+ tabel_hadi.getValueAt(a,0).toString() +"', "+
                          "'"+tabel_hadi.getValueAt(a,2).toString() +"', "+
                          "'"+tabel_hadi.getValueAt(a,3).toString() +"' )";
    }

    public void reset_tabel(){
        String kode_barang, harga, jumlah, total = null;
        kode_barang=(String)kode_supplierhadi.getSelectedItem();
        namabarang_hadi.setText(kode_barang);
        harga = harga_hadi.getText();
        jumlah = jumlah_hadi.getText();
        total = (total);
        DefaultTableModel mod = (DefaultTableModel) tabel_hadi.getModel();
            Object[] data = new Object[5];
            data[0]=kode_barang;
            data[2]=harga;
            data[3]=jumlah;
            data[4]=total;
            for( int i = mod.getRowCount() - 1; i >= 0; i-- )
            {
                mod = (DefaultTableModel) tabel_hadi.getModel();
                mod.removeRow(i);
            }
            }
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
            java.util.logging.Logger.getLogger(FormTransaksiPembelian_hadi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormTransaksiPembelian_hadi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormTransaksiPembelian_hadi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormTransaksiPembelian_hadi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormTransaksiPembelian_hadi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton cancel;
    private javax.swing.JTextField cari_hadi;
    private javax.swing.JButton delete;
    private javax.swing.JButton exit;
    private javax.swing.JTextField gtotal_hadi;
    private javax.swing.JTextField harga_hadi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jumlah_hadi;
    private javax.swing.JComboBox<String> kode_pegawaihadi;
    private javax.swing.JComboBox<String> kode_supplierhadi;
    private javax.swing.JComboBox<String> kodebarang_hadi;
    private javax.swing.JTextField namabarang_hadi;
    private javax.swing.JTextField nofaktur_hadi;
    private javax.swing.JTextField pegawai_hadi;
    private javax.swing.JButton save;
    private javax.swing.JButton search;
    private javax.swing.JTextField supplier_hadi;
    private javax.swing.JTable tabel_hadi;
    private javax.swing.JButton tambah;
    private com.toedter.calendar.JDateChooser tanggal_hadi;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
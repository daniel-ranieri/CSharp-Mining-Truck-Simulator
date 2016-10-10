
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

//Daniel Ranieri
//131600214
//27.06.2016

public class Form1 extends javax.swing.JFrame {

    Connection con = null;
    ResultSet rs = null;
    Statement st = null;

    public Form1() {
        initComponents();
        currentDateTime();
        itemsTable();
    }

    //Displaying all the data in the items table/the data that has been entered.
    public void itemsTable() {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/fiona_stanley_database",
                    "root", "");
            String sql = "SELECT bagID AS 'Bag ID', dateTimeFound AS 'Date/Time Found',"
                    + "colour AS 'Colour', category AS 'Category', location.locationName AS 'Location Found',"
                    + "storage.storageLocaiton AS 'Storage', founder.firstName AS 'Founder First Name',"
                    + "founder.lastName AS 'Founder Last Name', founder.contactNumber AS 'Founder Contact No.',"
                    + "staff.team AS 'Team',  items.status AS 'status', items.dateReleased AS 'Date Released', "
                    + "items.releasedBy AS 'Released By' "
                    + "FROM items\n"
                    + "LEFT JOIN location ON items.foundLocation_fk = locationID\n"
                    + "LEFT JOIN storage ON items.storageLocation = storageID\n"
                    + "LEFT JOIN founder ON items.founderID_fk = founderID\n"
                    + "LEFT JOIN staff ON items.staffID_fk = staffID";
            st = con.prepareStatement(sql);
            rs = st.executeQuery(sql);
            ItemsTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Can not load table from database. Please contact system administrator");
        }
    }

    //Method for getting the current date and time into the correct text boxes.
    public void currentDateTime() {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
            Date date = new Date();
            txtReportDate1.setText(dateFormat.format(date));

            DateFormat dateForma = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Date datetime = new Date();
            txtDateReleased.setText(dateForma.format(datetime));

            Calendar cal = Calendar.getInstance();
            SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
            txtFoundReportDate.setText(timeFormat.format(cal.getTime()));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Could not import time from database!");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Tabs = new javax.swing.JTabbedPane();
        LostFoundTab = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        LocationFound = new javax.swing.JLabel();
        CmbItemCategoryFound = new javax.swing.JComboBox();
        ItemCategory1 = new javax.swing.JLabel();
        ItemColour1 = new javax.swing.JLabel();
        CmbItemColourFound = new javax.swing.JComboBox();
        txtFoundersName = new javax.swing.JTextField();
        txtOwnersName1 = new javax.swing.JTextField();
        OwnersName1 = new javax.swing.JLabel();
        ContactNumber1 = new javax.swing.JLabel();
        BagLocation1 = new javax.swing.JLabel();
        txtFoundBagNumber = new javax.swing.JTextField();
        BagNumber1 = new javax.swing.JLabel();
        ReportedTime1 = new javax.swing.JLabel();
        ReportedDate1 = new javax.swing.JLabel();
        txtReportDate1 = new javax.swing.JTextField();
        txtFoundReportDate = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        FoundStaffID1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        LocationFound1 = new javax.swing.JLabel();
        CmbItemCategoryFound1 = new javax.swing.JComboBox();
        CmbItemColourFound1 = new javax.swing.JComboBox();
        TxtFoundContactNumber1 = new javax.swing.JTextField();
        ContactNumber2 = new javax.swing.JLabel();
        FoundHeading2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        FoundHeading3 = new javax.swing.JLabel();
        BagNumber2 = new javax.swing.JLabel();
        txtReturnBagNumber = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDateReleased = new javax.swing.JTextField();
        txtReturnedBy = new javax.swing.JTextField();
        Return = new javax.swing.JButton();
        PatientTrustTab = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        TableItems = new javax.swing.JScrollPane();
        ItemsTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        LocationFound.setText("Location Found:");

        CmbItemCategoryFound.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Chose a Category", "Electronics", "Jewelry", "Money", "Clothing" }));

        ItemCategory1.setText("Item Category:");

        ItemColour1.setText("Item Colour:");

        CmbItemColourFound.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Chose a Colour", "Red", "Green", "Blue", "Yellow", "Black", "White", "Brown", "Purple", "Pink" }));

        OwnersName1.setText("Found First Name:");

        ContactNumber1.setText("Found Last Name:");

        BagLocation1.setText("Bag Storage:");

        BagNumber1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BagNumber1.setText("Bag Number:");

        ReportedTime1.setText("Reported Time:");

        ReportedDate1.setText("Reported Date: ");

        txtReportDate1.setText("0000-00-00");

        txtFoundReportDate.setText("00:00:00");

        jButton3.setText("Add");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        FoundStaffID1.setText("Team (Log by):");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a Team", "Admin Team", "Gold Team", "Red Team", "Green Team", "Blue Team" }));

        LocationFound1.setText("Item Status");

        CmbItemCategoryFound1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Chose a Status", "Lost", "Found", "Returned", "Destroyed" }));

        CmbItemColourFound1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Chose a Location", "Drop Safe", "Monday Shelf", "Tuesday Shelf", "Wednesday Shelf", "Thursday Shelf", "Friday Shelf", "Saturday Shelf", "Sunday Shelf", "Shelf 1", "Shelf 2", "Shelf 3", "Shelf 4", "Shelf 5", "Shelf 6", "Shelf 7", "Shelf 8", "Shelf 9" }));

        ContactNumber2.setText("Contact Number:");

        FoundHeading2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        FoundHeading2.setText("Items Found");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a Location", "Quad A", "Subway", "Cafe", "Cafe 2", "Hall A", "Hall B", "Hall C", "Waiting", "Stairs" }));

        FoundHeading3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        FoundHeading3.setText("Returned To");

        BagNumber2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BagNumber2.setText("Bag Number:");

        jLabel1.setText("Date Release:");

        jLabel2.setText("Returned By:");

        Return.setText("Return Update");
        Return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LostFoundTabLayout = new javax.swing.GroupLayout(LostFoundTab);
        LostFoundTab.setLayout(LostFoundTabLayout);
        LostFoundTabLayout.setHorizontalGroup(
            LostFoundTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LostFoundTabLayout.createSequentialGroup()
                .addGroup(LostFoundTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LostFoundTabLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(LostFoundTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(LostFoundTabLayout.createSequentialGroup()
                                .addGroup(LostFoundTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ReportedDate1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ReportedTime1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(LostFoundTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtReportDate1, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                                    .addComponent(txtFoundReportDate)))
                            .addGroup(LostFoundTabLayout.createSequentialGroup()
                                .addGroup(LostFoundTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(OwnersName1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BagNumber1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BagLocation1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ContactNumber1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ContactNumber2, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGroup(LostFoundTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(LostFoundTabLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(LostFoundTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtFoundBagNumber)
                                            .addComponent(CmbItemColourFound1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtOwnersName1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(LostFoundTabLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(LostFoundTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtFoundersName)
                                            .addComponent(TxtFoundContactNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(29, 29, 29)
                        .addGroup(LostFoundTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(LostFoundTabLayout.createSequentialGroup()
                                .addGroup(LostFoundTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ItemCategory1)
                                    .addComponent(ItemColour1)
                                    .addComponent(LocationFound1))
                                .addGap(22, 22, 22)
                                .addGroup(LostFoundTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CmbItemColourFound, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CmbItemCategoryFound, 0, 138, Short.MAX_VALUE)
                                    .addComponent(CmbItemCategoryFound1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(LostFoundTabLayout.createSequentialGroup()
                                .addComponent(LocationFound)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(LostFoundTabLayout.createSequentialGroup()
                                .addComponent(FoundStaffID1)
                                .addGap(22, 22, 22)
                                .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(LostFoundTabLayout.createSequentialGroup()
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(LostFoundTabLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(FoundHeading2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(LostFoundTabLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(LostFoundTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(LostFoundTabLayout.createSequentialGroup()
                                .addComponent(BagNumber2)
                                .addGap(26, 26, 26)
                                .addComponent(txtReturnBagNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDateReleased))
                            .addGroup(LostFoundTabLayout.createSequentialGroup()
                                .addGroup(LostFoundTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(LostFoundTabLayout.createSequentialGroup()
                                        .addGap(52, 52, 52)
                                        .addComponent(FoundHeading3))
                                    .addGroup(LostFoundTabLayout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(33, 33, 33)
                                        .addComponent(txtReturnedBy, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(76, 76, 76)
                                        .addComponent(Return, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        LostFoundTabLayout.setVerticalGroup(
            LostFoundTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LostFoundTabLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(FoundHeading2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LostFoundTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LostFoundTabLayout.createSequentialGroup()
                        .addGroup(LostFoundTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ReportedDate1)
                            .addComponent(txtReportDate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(LostFoundTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFoundReportDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ReportedTime1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(LostFoundTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFoundBagNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BagNumber1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(LostFoundTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BagLocation1)
                            .addComponent(CmbItemColourFound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(LostFoundTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtOwnersName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OwnersName1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(LostFoundTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFoundersName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ContactNumber1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(LostFoundTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtFoundContactNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ContactNumber2)))
                    .addGroup(LostFoundTabLayout.createSequentialGroup()
                        .addGroup(LostFoundTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ItemColour1)
                            .addComponent(CmbItemColourFound, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(LostFoundTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CmbItemCategoryFound, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ItemCategory1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(LostFoundTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CmbItemCategoryFound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LocationFound1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addGroup(LostFoundTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LocationFound)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(LostFoundTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FoundStaffID1)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(LostFoundTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(LostFoundTabLayout.createSequentialGroup()
                        .addComponent(FoundHeading3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(LostFoundTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtReturnBagNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BagNumber2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(LostFoundTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(txtReturnedBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))
                    .addGroup(LostFoundTabLayout.createSequentialGroup()
                        .addGroup(LostFoundTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtDateReleased, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(Return, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(94, Short.MAX_VALUE))
        );

        Tabs.addTab("Found Item", LostFoundTab);

        javax.swing.GroupLayout PatientTrustTabLayout = new javax.swing.GroupLayout(PatientTrustTab);
        PatientTrustTab.setLayout(PatientTrustTabLayout);
        PatientTrustTabLayout.setHorizontalGroup(
            PatientTrustTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 501, Short.MAX_VALUE)
        );
        PatientTrustTabLayout.setVerticalGroup(
            PatientTrustTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 506, Short.MAX_VALUE)
        );

        Tabs.addTab("Add Lost", PatientTrustTab);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 501, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 506, Short.MAX_VALUE)
        );

        Tabs.addTab("Returned Item", jPanel1);

        Title.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Fiona Stanley: Lost and Found Database");
        Title.setToolTipText("");

        ItemsTable.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        ItemsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        ItemsTable.setColumnSelectionAllowed(true);
        ItemsTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TableItems.setViewportView(ItemsTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TableItems))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(313, 313, 313)
                        .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 747, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 584, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(TableItems))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Tabs)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Button click method for Add: Inserting the data into the database
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/fiona_stanley_database",
                    "root", "");

            Statement stmt = (Statement) con.createStatement();
            int finderContactNumber = Integer.parseInt(TxtFoundContactNumber1.getText());

            String founderQuery = "INSERT INTO founder (firstname, lastname, contactNumber)"
                    + "VALUES(\"" + txtOwnersName1.getText() + "\",\"" + txtFoundersName.getText() + "\",\"" + finderContactNumber + "\");";
            stmt.executeUpdate(founderQuery);

            String founderIDQ = "SELECT founderID FROM founder WHERE contactNumber = \"" + finderContactNumber + "\";";
            ResultSet founderIDResult = stmt.executeQuery(founderIDQ);
            founderIDResult.next();
            int FID = founderIDResult.getInt("founderID");

            String itemQuery = "INSERT INTO items(bagID,dateTimeFound,colour,category,status, staffID_fk, storageLocation, foundLocation_FK, founderID_FK)"
                    + " VALUES(\"" + txtFoundBagNumber.getText() + "\",\"" + txtReportDate1.getText() + " " + txtFoundReportDate.getText()
                    + "\",\"" + CmbItemColourFound.getSelectedItem() + "\",\"" + CmbItemCategoryFound.getSelectedItem()
                    + "\",\"" + CmbItemCategoryFound1.getSelectedItem() + "\",\"" + jComboBox1.getSelectedIndex() + "\",\""
                    + CmbItemColourFound1.getSelectedIndex() + "\",\"" + jComboBox2.getSelectedIndex() + "\",\"" + FID + "\");";
            stmt.executeUpdate(itemQuery);

            JOptionPane.showMessageDialog(null, "Record successfully added to the database!");

        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Could not add to database! SQL or Typing Error. Please Check all boxes are filled correctly.");
        }

        itemsTable();
    }//GEN-LAST:event_jButton3ActionPerformed

    //Button click method for Return Update: Updating the data in the database to 
    //show if there has been an item returned.
    private void ReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnActionPerformed
        Connection con;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/fiona_stanley_database",
                    "root", "");
            Statement stmt = (Statement) con.createStatement();

            String returnQuery = "UPDATE items SET dateReleased=\"" +
                    txtDateReleased.getText() + "\",status=\"Returned\",releasedBy=\"" +
                    txtReturnedBy.getText() + "\" WHERE bagID=\"" +
                    txtReturnBagNumber.getText() + "\"";
            stmt.executeUpdate(returnQuery);

        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Could not add to database! SQL or Typing Error. "
                    + "Please Check all boxes are filled correctly.");
        }
        itemsTable();
    }//GEN-LAST:event_ReturnActionPerformed

    //Main method
    public static void main(String args[]) {

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BagLocation1;
    private javax.swing.JLabel BagNumber1;
    private javax.swing.JLabel BagNumber2;
    private javax.swing.JComboBox CmbItemCategoryFound;
    private javax.swing.JComboBox CmbItemCategoryFound1;
    private javax.swing.JComboBox CmbItemColourFound;
    private javax.swing.JComboBox CmbItemColourFound1;
    private javax.swing.JLabel ContactNumber1;
    private javax.swing.JLabel ContactNumber2;
    private javax.swing.JLabel FoundHeading2;
    private javax.swing.JLabel FoundHeading3;
    private javax.swing.JLabel FoundStaffID1;
    private javax.swing.JLabel ItemCategory1;
    private javax.swing.JLabel ItemColour1;
    private javax.swing.JTable ItemsTable;
    private javax.swing.JLabel LocationFound;
    private javax.swing.JLabel LocationFound1;
    private javax.swing.JPanel LostFoundTab;
    private javax.swing.JLabel OwnersName1;
    private javax.swing.JPanel PatientTrustTab;
    private javax.swing.JLabel ReportedDate1;
    private javax.swing.JLabel ReportedTime1;
    private javax.swing.JButton Return;
    private javax.swing.JScrollPane TableItems;
    private javax.swing.JTabbedPane Tabs;
    private javax.swing.JLabel Title;
    private javax.swing.JTextField TxtFoundContactNumber1;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtDateReleased;
    private javax.swing.JTextField txtFoundBagNumber;
    private javax.swing.JTextField txtFoundReportDate;
    private javax.swing.JTextField txtFoundersName;
    private javax.swing.JTextField txtOwnersName1;
    private javax.swing.JTextField txtReportDate1;
    private javax.swing.JTextField txtReturnBagNumber;
    private javax.swing.JTextField txtReturnedBy;
    // End of variables declaration//GEN-END:variables
}

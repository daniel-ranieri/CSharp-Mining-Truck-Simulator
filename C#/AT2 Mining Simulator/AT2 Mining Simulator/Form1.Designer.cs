namespace AT2_Mining_Simulator
{
    partial class Form1
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.components = new System.ComponentModel.Container();
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(Form1));
            this.listBoxCrusher = new System.Windows.Forms.ListBox();
            this.label9 = new System.Windows.Forms.Label();
            this.listBoxTCrusher = new System.Windows.Forms.ListBox();
            this.label8 = new System.Windows.Forms.Label();
            this.listBoxLoading = new System.Windows.Forms.ListBox();
            this.label7 = new System.Windows.Forms.Label();
            this.listBoxTLoading = new System.Windows.Forms.ListBox();
            this.label6 = new System.Windows.Forms.Label();
            this.listBoxService = new System.Windows.Forms.ListBox();
            this.label5 = new System.Windows.Forms.Label();
            this.groupBox1 = new System.Windows.Forms.GroupBox();
            this.radioService = new System.Windows.Forms.RadioButton();
            this.radioCrusher = new System.Windows.Forms.RadioButton();
            this.radioTCrusher = new System.Windows.Forms.RadioButton();
            this.radioLoading = new System.Windows.Forms.RadioButton();
            this.radioTLoading = new System.Windows.Forms.RadioButton();
            this.radioInactive = new System.Windows.Forms.RadioButton();
            this.label4 = new System.Windows.Forms.Label();
            this.txtTotal = new System.Windows.Forms.TextBox();
            this.label3 = new System.Windows.Forms.Label();
            this.txtLoadCap = new System.Windows.Forms.TextBox();
            this.label2 = new System.Windows.Forms.Label();
            this.txtTruck = new System.Windows.Forms.TextBox();
            this.listBoxTrucks = new System.Windows.Forms.ListBox();
            this.label1 = new System.Windows.Forms.Label();
            this.ID = new System.Windows.Forms.Label();
            this.btnService = new System.Windows.Forms.Button();
            this.btnReturn = new System.Windows.Forms.Button();
            this.menuStrip1 = new System.Windows.Forms.MenuStrip();
            this.fileToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.newToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.closeToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.viewToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.userGuideToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.returnButton = new System.Windows.Forms.ToolTip(this.components);
            this.TLoadingBox = new System.Windows.Forms.ToolTip(this.components);
            this.LoadingBox = new System.Windows.Forms.ToolTip(this.components);
            this.TCrusherBox = new System.Windows.Forms.ToolTip(this.components);
            this.CrusherBox = new System.Windows.Forms.ToolTip(this.components);
            this.ServiceButton = new System.Windows.Forms.ToolTip(this.components);
            this.MainBox = new System.Windows.Forms.ToolTip(this.components);
            this.TextBoxes = new System.Windows.Forms.ToolTip(this.components);
            this.groupBox1.SuspendLayout();
            this.menuStrip1.SuspendLayout();
            this.SuspendLayout();
            // 
            // listBoxCrusher
            // 
            this.listBoxCrusher.FormattingEnabled = true;
            this.listBoxCrusher.Location = new System.Drawing.Point(411, 309);
            this.listBoxCrusher.Name = "listBoxCrusher";
            this.listBoxCrusher.Size = new System.Drawing.Size(127, 134);
            this.listBoxCrusher.TabIndex = 39;
            this.CrusherBox.SetToolTip(this.listBoxCrusher, "Click here to take the top truck in this queue\r\n(Crusher) and put it into the fir" +
        "st queue \r\n(Transit to Loading)");
            this.listBoxCrusher.Click += new System.EventHandler(this.listBoxCrusher_Click);
            // 
            // label9
            // 
            this.label9.AutoSize = true;
            this.label9.Location = new System.Drawing.Point(412, 292);
            this.label9.Name = "label9";
            this.label9.Size = new System.Drawing.Size(78, 13);
            this.label9.TabIndex = 38;
            this.label9.Text = "Crusher Queue";
            // 
            // listBoxTCrusher
            // 
            this.listBoxTCrusher.FormattingEnabled = true;
            this.listBoxTCrusher.Location = new System.Drawing.Point(278, 309);
            this.listBoxTCrusher.Name = "listBoxTCrusher";
            this.listBoxTCrusher.Size = new System.Drawing.Size(127, 134);
            this.listBoxTCrusher.TabIndex = 37;
            this.TCrusherBox.SetToolTip(this.listBoxTCrusher, "Click here to take the top truck in this queue\r\n(Transit To Crusher) and put it i" +
        "nto the next queue \r\n(Crusher)");
            this.listBoxTCrusher.Click += new System.EventHandler(this.listBoxTCrusher_Click);
            // 
            // label8
            // 
            this.label8.AutoSize = true;
            this.label8.Location = new System.Drawing.Point(279, 292);
            this.label8.Name = "label8";
            this.label8.Size = new System.Drawing.Size(90, 13);
            this.label8.TabIndex = 36;
            this.label8.Text = "Transit to Crusher";
            // 
            // listBoxLoading
            // 
            this.listBoxLoading.Location = new System.Drawing.Point(145, 309);
            this.listBoxLoading.Name = "listBoxLoading";
            this.listBoxLoading.Size = new System.Drawing.Size(127, 134);
            this.listBoxLoading.TabIndex = 40;
            this.LoadingBox.SetToolTip(this.listBoxLoading, "Click here to take the top truck in this queue\r\n(Loading) and put it into the nex" +
        "t queue \r\n(Transit Crusher)");
            this.listBoxLoading.Click += new System.EventHandler(this.listBoxLoading_Click);
            // 
            // label7
            // 
            this.label7.AutoSize = true;
            this.label7.Location = new System.Drawing.Point(146, 292);
            this.label7.Name = "label7";
            this.label7.Size = new System.Drawing.Size(80, 13);
            this.label7.TabIndex = 34;
            this.label7.Text = "Loading Queue";
            // 
            // listBoxTLoading
            // 
            this.listBoxTLoading.FormattingEnabled = true;
            this.listBoxTLoading.Location = new System.Drawing.Point(12, 309);
            this.listBoxTLoading.Name = "listBoxTLoading";
            this.listBoxTLoading.Size = new System.Drawing.Size(127, 134);
            this.listBoxTLoading.TabIndex = 33;
            this.TLoadingBox.SetToolTip(this.listBoxTLoading, "Click here to take the top truck in this queue\r\n(Transit to Loading) and put it i" +
        "nto the next queue \r\n(Loading)");
            this.listBoxTLoading.Click += new System.EventHandler(this.listBoxTLoading_Click);
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Location = new System.Drawing.Point(13, 292);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(92, 13);
            this.label6.TabIndex = 32;
            this.label6.Text = "Transit to Loading";
            // 
            // listBoxService
            // 
            this.listBoxService.FormattingEnabled = true;
            this.listBoxService.Location = new System.Drawing.Point(380, 126);
            this.listBoxService.Name = "listBoxService";
            this.listBoxService.Size = new System.Drawing.Size(148, 95);
            this.listBoxService.TabIndex = 31;
            this.listBoxService.DoubleClick += new System.EventHandler(this.listBoxService_SelectedIndexChanged);
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Location = new System.Drawing.Point(425, 106);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(51, 13);
            this.label5.TabIndex = 30;
            this.label5.Text = "Servicing";
            // 
            // groupBox1
            // 
            this.groupBox1.Controls.Add(this.radioService);
            this.groupBox1.Controls.Add(this.radioCrusher);
            this.groupBox1.Controls.Add(this.radioTCrusher);
            this.groupBox1.Controls.Add(this.radioLoading);
            this.groupBox1.Controls.Add(this.radioTLoading);
            this.groupBox1.Controls.Add(this.radioInactive);
            this.groupBox1.Location = new System.Drawing.Point(216, 106);
            this.groupBox1.Name = "groupBox1";
            this.groupBox1.Size = new System.Drawing.Size(146, 167);
            this.groupBox1.TabIndex = 29;
            this.groupBox1.TabStop = false;
            this.groupBox1.Text = "Truck Status";
            // 
            // radioService
            // 
            this.radioService.AutoSize = true;
            this.radioService.Location = new System.Drawing.Point(7, 135);
            this.radioService.Name = "radioService";
            this.radioService.Size = new System.Drawing.Size(61, 17);
            this.radioService.TabIndex = 5;
            this.radioService.TabStop = true;
            this.radioService.Text = "Service";
            this.radioService.UseVisualStyleBackColor = true;
            // 
            // radioCrusher
            // 
            this.radioCrusher.AutoSize = true;
            this.radioCrusher.Location = new System.Drawing.Point(7, 112);
            this.radioCrusher.Name = "radioCrusher";
            this.radioCrusher.Size = new System.Drawing.Size(61, 17);
            this.radioCrusher.TabIndex = 4;
            this.radioCrusher.TabStop = true;
            this.radioCrusher.Text = "Crusher";
            this.radioCrusher.UseVisualStyleBackColor = true;
            // 
            // radioTCrusher
            // 
            this.radioTCrusher.AutoSize = true;
            this.radioTCrusher.Location = new System.Drawing.Point(7, 89);
            this.radioTCrusher.Name = "radioTCrusher";
            this.radioTCrusher.Size = new System.Drawing.Size(108, 17);
            this.radioTCrusher.TabIndex = 3;
            this.radioTCrusher.TabStop = true;
            this.radioTCrusher.Text = "Transit to Crusher";
            this.radioTCrusher.UseVisualStyleBackColor = true;
            // 
            // radioLoading
            // 
            this.radioLoading.AutoSize = true;
            this.radioLoading.Location = new System.Drawing.Point(7, 66);
            this.radioLoading.Name = "radioLoading";
            this.radioLoading.Size = new System.Drawing.Size(63, 17);
            this.radioLoading.TabIndex = 2;
            this.radioLoading.TabStop = true;
            this.radioLoading.Text = "Loading";
            this.radioLoading.UseVisualStyleBackColor = true;
            // 
            // radioTLoading
            // 
            this.radioTLoading.AutoSize = true;
            this.radioTLoading.Location = new System.Drawing.Point(7, 43);
            this.radioTLoading.Name = "radioTLoading";
            this.radioTLoading.Size = new System.Drawing.Size(110, 17);
            this.radioTLoading.TabIndex = 1;
            this.radioTLoading.TabStop = true;
            this.radioTLoading.Text = "Transit to Loading";
            this.radioTLoading.UseVisualStyleBackColor = true;
            // 
            // radioInactive
            // 
            this.radioInactive.AutoSize = true;
            this.radioInactive.Location = new System.Drawing.Point(7, 20);
            this.radioInactive.Name = "radioInactive";
            this.radioInactive.Size = new System.Drawing.Size(63, 17);
            this.radioInactive.TabIndex = 0;
            this.radioInactive.TabStop = true;
            this.radioInactive.Text = "Inactive";
            this.TextBoxes.SetToolTip(this.radioInactive, "Trucks Status.");
            this.radioInactive.UseVisualStyleBackColor = true;
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(425, 50);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(31, 13);
            this.label4.TabIndex = 28;
            this.label4.Text = "Total";
            // 
            // txtTotal
            // 
            this.txtTotal.Location = new System.Drawing.Point(428, 66);
            this.txtTotal.Name = "txtTotal";
            this.txtTotal.Size = new System.Drawing.Size(100, 20);
            this.txtTotal.TabIndex = 27;
            this.TextBoxes.SetToolTip(this.txtTotal, "This text box will show the total amount\r\nof material this truck has moved.");
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(319, 50);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(75, 13);
            this.label3.TabIndex = 26;
            this.label3.Text = "Load Capacity";
            // 
            // txtLoadCap
            // 
            this.txtLoadCap.Location = new System.Drawing.Point(322, 66);
            this.txtLoadCap.Name = "txtLoadCap";
            this.txtLoadCap.Size = new System.Drawing.Size(100, 20);
            this.txtLoadCap.TabIndex = 25;
            this.TextBoxes.SetToolTip(this.txtLoadCap, "This text box will show the load capacity\r\nof the selected truck.");
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(213, 50);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(49, 13);
            this.label2.TabIndex = 24;
            this.label2.Text = "Truck ID";
            // 
            // txtTruck
            // 
            this.txtTruck.Location = new System.Drawing.Point(216, 66);
            this.txtTruck.Name = "txtTruck";
            this.txtTruck.Size = new System.Drawing.Size(100, 20);
            this.txtTruck.TabIndex = 23;
            this.TextBoxes.SetToolTip(this.txtTruck, "This shows the truck ID of the\r\ncurrent selected truck.\r\n");
            // 
            // listBoxTrucks
            // 
            this.listBoxTrucks.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.listBoxTrucks.FormattingEnabled = true;
            this.listBoxTrucks.Location = new System.Drawing.Point(12, 50);
            this.listBoxTrucks.Name = "listBoxTrucks";
            this.listBoxTrucks.Size = new System.Drawing.Size(180, 186);
            this.listBoxTrucks.TabIndex = 22;
            this.MainBox.SetToolTip(this.listBoxTrucks, "Double Click a truck to put it into the transit to\r\nloading queue. You can also s" +
        "elect a truck with one\r\nclick to populate the text boxes to the right.");
            this.listBoxTrucks.SelectedIndexChanged += new System.EventHandler(this.listBoxTrucks_SelectedIndexChanged);
            this.listBoxTrucks.DoubleClick += new System.EventHandler(this.listBoxTrucks_DoubleClick);
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 9F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(58, 32);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(47, 15);
            this.label1.TabIndex = 21;
            this.label1.Text = "Status";
            // 
            // ID
            // 
            this.ID.AutoSize = true;
            this.ID.Font = new System.Drawing.Font("Microsoft Sans Serif", 9F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.ID.Location = new System.Drawing.Point(9, 32);
            this.ID.Name = "ID";
            this.ID.Size = new System.Drawing.Size(21, 15);
            this.ID.TabIndex = 20;
            this.ID.Text = "ID";
            // 
            // btnService
            // 
            this.btnService.Location = new System.Drawing.Point(380, 233);
            this.btnService.Name = "btnService";
            this.btnService.Size = new System.Drawing.Size(148, 32);
            this.btnService.TabIndex = 41;
            this.btnService.Text = "Service";
            this.ServiceButton.SetToolTip(this.btnService, "Click this button to add the selected truck\r\ninto the service box. Granted the tr" +
        "uck is inactive\r\nor the first in the transit to loading queue.");
            this.btnService.UseVisualStyleBackColor = true;
            this.btnService.Click += new System.EventHandler(this.btnService_Click);
            // 
            // btnReturn
            // 
            this.btnReturn.Location = new System.Drawing.Point(12, 242);
            this.btnReturn.Name = "btnReturn";
            this.btnReturn.Size = new System.Drawing.Size(180, 31);
            this.btnReturn.TabIndex = 42;
            this.btnReturn.Text = "Return";
            this.returnButton.SetToolTip(this.btnReturn, "Click this button when you would like to return the selected \r\ntruck to inactive." +
        " (Must be first in the queue Transit to Loading).");
            this.btnReturn.UseVisualStyleBackColor = true;
            this.btnReturn.Click += new System.EventHandler(this.btnReturn_Click);
            // 
            // menuStrip1
            // 
            this.menuStrip1.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.fileToolStripMenuItem,
            this.viewToolStripMenuItem});
            this.menuStrip1.Location = new System.Drawing.Point(0, 0);
            this.menuStrip1.Name = "menuStrip1";
            this.menuStrip1.Size = new System.Drawing.Size(553, 24);
            this.menuStrip1.TabIndex = 43;
            this.menuStrip1.Text = "menuStrip1";
            // 
            // fileToolStripMenuItem
            // 
            this.fileToolStripMenuItem.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.newToolStripMenuItem,
            this.closeToolStripMenuItem});
            this.fileToolStripMenuItem.Name = "fileToolStripMenuItem";
            this.fileToolStripMenuItem.Size = new System.Drawing.Size(37, 20);
            this.fileToolStripMenuItem.Text = "File";
            // 
            // newToolStripMenuItem
            // 
            this.newToolStripMenuItem.Name = "newToolStripMenuItem";
            this.newToolStripMenuItem.Size = new System.Drawing.Size(103, 22);
            this.newToolStripMenuItem.Text = "New";
            this.newToolStripMenuItem.Click += new System.EventHandler(this.newToolStripMenuItem_Click);
            // 
            // closeToolStripMenuItem
            // 
            this.closeToolStripMenuItem.Name = "closeToolStripMenuItem";
            this.closeToolStripMenuItem.Size = new System.Drawing.Size(103, 22);
            this.closeToolStripMenuItem.Text = "Close";
            this.closeToolStripMenuItem.Click += new System.EventHandler(this.closeToolStripMenuItem_Click);
            // 
            // viewToolStripMenuItem
            // 
            this.viewToolStripMenuItem.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.userGuideToolStripMenuItem});
            this.viewToolStripMenuItem.Name = "viewToolStripMenuItem";
            this.viewToolStripMenuItem.Size = new System.Drawing.Size(44, 20);
            this.viewToolStripMenuItem.Text = "View";
            // 
            // userGuideToolStripMenuItem
            // 
            this.userGuideToolStripMenuItem.Name = "userGuideToolStripMenuItem";
            this.userGuideToolStripMenuItem.Size = new System.Drawing.Size(131, 22);
            this.userGuideToolStripMenuItem.Text = "User Guide";
            this.userGuideToolStripMenuItem.Click += new System.EventHandler(this.userGuideToolStripMenuItem_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(553, 454);
            this.Controls.Add(this.btnReturn);
            this.Controls.Add(this.btnService);
            this.Controls.Add(this.listBoxCrusher);
            this.Controls.Add(this.label9);
            this.Controls.Add(this.listBoxTCrusher);
            this.Controls.Add(this.label8);
            this.Controls.Add(this.listBoxLoading);
            this.Controls.Add(this.label7);
            this.Controls.Add(this.listBoxTLoading);
            this.Controls.Add(this.label6);
            this.Controls.Add(this.listBoxService);
            this.Controls.Add(this.label5);
            this.Controls.Add(this.groupBox1);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.txtTotal);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.txtLoadCap);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.txtTruck);
            this.Controls.Add(this.listBoxTrucks);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.ID);
            this.Controls.Add(this.menuStrip1);
            this.Cursor = System.Windows.Forms.Cursors.Default;
            this.Icon = ((System.Drawing.Icon)(resources.GetObject("$this.Icon")));
            this.MainMenuStrip = this.menuStrip1;
            this.Name = "Form1";
            this.Text = "Mining Truck Simulation";
            this.FormClosed += new System.Windows.Forms.FormClosedEventHandler(this.Form1_FormClosed);
            this.Load += new System.EventHandler(this.Form1_Load);
            this.groupBox1.ResumeLayout(false);
            this.groupBox1.PerformLayout();
            this.menuStrip1.ResumeLayout(false);
            this.menuStrip1.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.ListBox listBoxCrusher;
        private System.Windows.Forms.Label label9;
        private System.Windows.Forms.ListBox listBoxTCrusher;
        private System.Windows.Forms.Label label8;
        private System.Windows.Forms.ListBox listBoxLoading;
        private System.Windows.Forms.Label label7;
        private System.Windows.Forms.ListBox listBoxTLoading;
        private System.Windows.Forms.Label label6;
        private System.Windows.Forms.ListBox listBoxService;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.GroupBox groupBox1;
        private System.Windows.Forms.RadioButton radioService;
        private System.Windows.Forms.RadioButton radioCrusher;
        private System.Windows.Forms.RadioButton radioTCrusher;
        private System.Windows.Forms.RadioButton radioLoading;
        private System.Windows.Forms.RadioButton radioTLoading;
        private System.Windows.Forms.RadioButton radioInactive;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.TextBox txtTotal;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.TextBox txtLoadCap;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.TextBox txtTruck;
        private System.Windows.Forms.ListBox listBoxTrucks;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label ID;
        private System.Windows.Forms.Button btnService;
        private System.Windows.Forms.Button btnReturn;
        private System.Windows.Forms.MenuStrip menuStrip1;
        private System.Windows.Forms.ToolStripMenuItem fileToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem newToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem closeToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem viewToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem userGuideToolStripMenuItem;
        private System.Windows.Forms.ToolTip returnButton;
        private System.Windows.Forms.ToolTip TLoadingBox;
        private System.Windows.Forms.ToolTip CrusherBox;
        private System.Windows.Forms.ToolTip TCrusherBox;
        private System.Windows.Forms.ToolTip LoadingBox;
        private System.Windows.Forms.ToolTip TextBoxes;
        private System.Windows.Forms.ToolTip MainBox;
        private System.Windows.Forms.ToolTip ServiceButton;
    }
}


using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Diagnostics;
using System.Drawing;
using System.IO;
using System.Linq;
using System.Runtime.Serialization.Formatters.Binary;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Diagnostics;

///Daniel Ranieri
///131600214
///21.06.16
///AT2: Mining Simulator

///This is a program that will create a list of trucks numbered from 100 to whatever you want
///and allows the user to put the trucks into queues and move them along the queues.
///The user is also allowd to put the trucks into service and make the trucks inactive.
///The user will also be able to recover the truck list from the last use.

namespace AT2_Mining_Simulator
{
    [Serializable()]
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        /// <summary>
        /// Initializing components
        /// </summary>
        static int max = 20;
        Trucks[] Truck = new Trucks[max];
        Queue<Trucks>[] AQueue = new Queue<Trucks>[4];
        BinaryWriter bw;
        BinaryReader br;

        /// <summary>
        /// what will happen when the form loads
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        private void Form1_Load(object sender, EventArgs e)
        {
            clearAll();
            createTrucks();
            createQueues();
            BinaryRead();
            displayTrucks();
        }

        /// <summary>
        /// Calls the binary save method on close
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        private void Form1_FormClosed(object sender, FormClosedEventArgs e)
        {
            BinaryWrite();
        }

        /// <summary>
        /// Method to wipe all lists clean
        /// </summary>
        public void clearAll()
        {
            listBoxTrucks.Items.Clear();
            listBoxTLoading.Items.Clear();
            listBoxTCrusher.Items.Clear();
            listBoxLoading.Items.Clear();
            listBoxService.Items.Clear();
            listBoxCrusher.Items.Clear();
        }

        /// <summary>
        /// Method to load a new instance (New button)
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        private void newToolStripMenuItem_Click(object sender, EventArgs e)
        {
            clearAll();
            createTrucks();
            displayTrucks();
            createQueues();
        }

        /// <summary>
        /// Method to open the user guide (User Guide Button)
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        private void userGuideToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Process newProcess = new Process();
            try
            {
                newProcess.StartInfo.FileName = "";
                newProcess.Start();
            }
            catch (Exception E) { MessageBox.Show("File Not Found. "); }
        }

        /// <summary>
        /// Close button method
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        private void closeToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Close();
        }

        /// <summary>
        /// creates the number of trucks
        /// </summary>
        public void createTrucks()
        {
            try
            {
                for (int i = 0; i < max; i++)
                {
                    Truck[i] = new Trucks();
                    Truck[i].gsTruckID = 100 + i;
                    Truck[i].gsTruckLoadCapacity = 200;
                }
            }
            catch { }
        }

        /// <summary>
        /// creates queues to cover each list box
        /// </summary>
        public void createQueues()
        {
            try
            {
                for (int i = 0; i < 4; i++)
                {
                    AQueue[i] = new Queue<Trucks>();
                }
            }
            catch { }
        }

        /// <summary>
        /// Display the trucks in the main list box with current get and set values
        /// </summary>
        public void displayTrucks()
        {
            try
            {
                listBoxTrucks.Items.Clear();
                for (int i = 0; i < max; i++)
                {
                    listBoxTrucks.Items.Add(Truck[i].gsTruckID + "\t" + Truck[i].gsTruckStatus);
                }
            }
            catch { }
        }

        /// <summary>
        /// Get the information from the listbox and load it into the text boxes
        /// Also making the radio buttons correspond to the truck locations
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        private void listBoxTrucks_SelectedIndexChanged(object sender, EventArgs e)
        {
            try
            {
                int index = listBoxTrucks.SelectedIndex;
                txtTruck.Text = listBoxTrucks.GetItemText(Truck[index].gsTruckID);
                txtLoadCap.Text = listBoxTrucks.GetItemText(Truck[index].gsTruckLoadCapacity);
                txtTotal.Text = listBoxTrucks.GetItemText(Truck[index].gsTruckTotal);

                if (Truck[index].gsTruckStatus == 1)
                {
                    radioTLoading.PerformClick();
                }
                if (Truck[index].gsTruckStatus == 2)
                {
                    radioLoading.PerformClick();
                }
                if (Truck[index].gsTruckStatus == 3)
                {
                    radioTCrusher.PerformClick();
                }
                if (Truck[index].gsTruckStatus == 4)
                {
                    radioCrusher.PerformClick();
                }
                if (Truck[index].gsTruckStatus == 5)
                {
                    radioService.PerformClick();
                }
                if (Truck[index].gsTruckStatus == 0)
                {
                    radioInactive.PerformClick();
                }
            }
            catch { }
        }

        /// <summary>
        /// The method for the double click on the main trucks list
        /// moves the truck to the transit to loading queue and listbox
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        private void listBoxTrucks_DoubleClick(object sender, EventArgs e)
        {
            int index = listBoxTrucks.SelectedIndex;
            if (Truck[index].gsTruckStatus == 0)
            {
                AQueue[0].Enqueue(Truck[index]);
                Truck[index].truckSwitch();
                listBoxTLoading.Items.Add(Truck[index].gsTruckID + "\t" + Truck[index].gsTruckStatus);
            }
            else
            {
                MessageBox.Show("Mate, that wont work. its a duplicate!");
            }
            displayTrucks();
        }

        /// <summary>
        /// The method for the click on the transit to loading box 
        /// trucks list moves the truck to the loading queue and listbox
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        private void listBoxTLoading_Click(object sender, EventArgs e)
        {
            try
            {
                Trucks lastTruck = AQueue[0].Peek();
                AQueue[0].Dequeue();
                listBoxTLoading.Items.Remove(lastTruck.gsTruckID + "\t" + lastTruck.gsTruckStatus);
                AQueue[1].Enqueue(lastTruck);
                lastTruck.truckSwitch();
                listBoxLoading.Items.Add(lastTruck.gsTruckID + "\t" + lastTruck.gsTruckStatus);
                displayTrucks();
            }
            catch { }
        }

        /// <summary>
        /// The method for the click on the loading box 
        /// trucks list moves the truck to the loading queue and listbox
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        private void listBoxLoading_Click(object sender, EventArgs e)
        {
            try
            {
                Trucks lastTruck = AQueue[1].Peek();
                AQueue[1].Dequeue();
                listBoxLoading.Items.Remove(lastTruck.gsTruckID + "\t" + lastTruck.gsTruckStatus);
                AQueue[2].Enqueue(lastTruck);
                lastTruck.truckSwitch();
                listBoxTCrusher.Items.Add(lastTruck.gsTruckID + "\t" + lastTruck.gsTruckStatus);
                displayTrucks();
            }
            catch { }
        }

        /// <summary>
        /// The method for the click on the transit to crusher box 
        /// trucks list moves the truck to the transit to crusher queue and listbox
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        private void listBoxTCrusher_Click(object sender, EventArgs e)
        {
            try
            {
                Trucks lastTruck = AQueue[2].Peek();
                AQueue[2].Dequeue();
                listBoxTCrusher.Items.Remove(lastTruck.gsTruckID + "\t" + lastTruck.gsTruckStatus);
                AQueue[3].Enqueue(lastTruck);
                lastTruck.truckSwitch();
                listBoxCrusher.Items.Add(lastTruck.gsTruckID + "\t" + lastTruck.gsTruckStatus);

                displayTrucks();
            }
            catch { }
        }

        /// <summary>
        /// The method for the click on the crusher box 
        /// trucks list moves the truck to the transit to loading queue and listbox
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        private void listBoxCrusher_Click(object sender, EventArgs e)
        {
            try
            {
                Trucks lastTruck = AQueue[3].Peek();
                AQueue[3].Dequeue();
                listBoxCrusher.Items.Remove(lastTruck.gsTruckID + "\t" + lastTruck.gsTruckStatus);
                AQueue[0].Enqueue(lastTruck);
                lastTruck.truckSwitch();
                listBoxTLoading.Items.Add(lastTruck.gsTruckID + "\t" + lastTruck.gsTruckStatus);
                lastTruck.gsTruckTotal = lastTruck.gsTruckTotal + lastTruck.gsTruckLoadCapacity;

                displayTrucks();
            }
            catch { }
        }

        /// <summary>
        /// the button for when the item in the service box is clicked. This will 
        /// cause the selected item to be deleted from the box on double click
        /// and change the trucks status back to 0
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        private void listBoxService_SelectedIndexChanged(object sender, EventArgs e)
        {
            try
            {
                string itemR = listBoxService.SelectedItem.ToString().Remove(3);
                int index = Int32.Parse(itemR) - 100;
                listBoxService.Items.Remove(Truck[index].gsTruckID + "\t" + Truck[index].gsTruckStatus);
                Truck[index].truckSwitch();

                displayTrucks();
            }
            catch { }
        }

        /// <summary>
        /// This will return a truck to the main box only when the button is clicked
        /// while the truck is in the transit to loading queue at the top.
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        private void btnReturn_Click(object sender, EventArgs e)
        {
            try
            {
                int index = listBoxTrucks.SelectedIndex;
                Trucks lastTruck = AQueue[0].Peek();
                if (lastTruck.gsTruckID == Truck[index].gsTruckID)
                {
                    listBoxTLoading.Items.Remove(Truck[index].gsTruckID + "\t" + Truck[index].gsTruckStatus);
                    Truck[index].gsTruckStatus = 0;
                    AQueue[0].Dequeue();
                }
                displayTrucks();
            }
            catch { }
        }

        /// <summary>
        /// The button for when the service button is clicked. This will make the truck
        /// get added to the service box and change the status to 5
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        private void btnService_Click(object sender, EventArgs e)
        {
            try
            {
                int index = listBoxTrucks.SelectedIndex;
                //Trucks lastTruck = AQueue[0].Peek();
                if(Truck[index].gsTruckStatus == 0)
                {
                Truck[index].gsTruckStatus = 5;
                listBoxService.Items.Add(Truck[index].gsTruckID + "\t" + Truck[index].gsTruckStatus);
                }
                else if (AQueue[0].Peek() == Truck[index])
                {
                    listBoxTLoading.Items.Remove(Truck[index].gsTruckID + "\t" + Truck[index].gsTruckStatus);
                    Truck[index].gsTruckStatus = 5;
                    AQueue[0].Dequeue();
                    listBoxService.Items.Add(Truck[index].gsTruckID + "\t" + Truck[index].gsTruckStatus);
                }
                displayTrucks();
            }
            catch { }
        }

        /// <summary>
        /// Binary Writer method to write the file to a binary format
        /// </summary>
        public void BinaryWrite()
        {
            try
            {
                bw = new BinaryWriter(new FileStream("Trucks.dat", FileMode.Create));
            }
            catch (Exception fe)
            {
                MessageBox.Show(fe.Message + "\n Cannot Write to file.");
                return;
            }

            foreach (Trucks Truck in Truck)
            {
                try
                {
                    bw.Write(Truck.gsTruckID);
                    bw.Write(Truck.gsTruckStatus);
                    bw.Write(Truck.gsTruckTotal);
                }
                catch (Exception fe)
                {
                    return;
                }
            }
            bw.Close();
        }

        /// <summary>
        /// A method to read the file from a binary format
        /// </summary>
        public void BinaryRead()
        {
            listBoxTrucks.Items.Clear();
            try
            {
                br = new BinaryReader(new FileStream("Trucks.dat", FileMode.Open));
            }
            catch (Exception fe)
            {
                MessageBox.Show(fe.Message + "\n Cannot open file for reading");
                return;
            }
            try
            {
                for (int i = 0; i < 20; i++)
                {
                    Truck[i].gsTruckID = br.ReadInt32();
                    Truck[i].gsTruckStatus = br.ReadInt32();
                    Truck[i].gsTruckTotal = br.ReadInt32();
                }
            }
            catch (Exception fe) { }
            br.Close();

            //puts the trucks back into their queues
            for (int i = 0; i < 20; i++)
            {
                switch (Truck[i].gsTruckStatus)
                {
                    case 1:
                        AQueue[0].Enqueue(Truck[i]);
                        listBoxTLoading.Items.Add(Truck[i].gsTruckID + "\t" + Truck[i].gsTruckStatus);
                        break;
                    case 2:
                        AQueue[1].Enqueue(Truck[i]);
                        listBoxLoading.Items.Add(Truck[i].gsTruckID + "\t" + Truck[i].gsTruckStatus);
                        break;
                    case 3:
                        AQueue[2].Enqueue(Truck[i]);
                        listBoxTCrusher.Items.Add(Truck[i].gsTruckID + "\t" + Truck[i].gsTruckStatus);
                        break;
                    case 4:
                        AQueue[3].Enqueue(Truck[i]);
                        listBoxCrusher.Items.Add(Truck[i].gsTruckID + "\t" + Truck[i].gsTruckStatus);
                        break;
                    case 5:
                        listBoxService.Items.Add(Truck[i].gsTruckID + "\t" + Truck[i].gsTruckStatus);
                        break;
                    default: break;
                }
            }
        }
    }
}



using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AT2_Mining_Simulator
{
    class Trucks
    {
        /// <summary>
        /// default truck information
        /// </summary>
        protected int TruckID = 0;
        protected int TruckStatus = 0;
        protected int TruckLoadCapacity = 200;
        protected int TruckTotal = 0;

        /// <summary>
        /// The truck information that will be taken from this class.
        /// </summary>
        public Trucks()
        {
            gsTruckID = 0;
            gsTruckStatus = 0;
            gsTruckLoadCapacity = 0;
            gsTruckTotal = 0;
        }

        /// <summary>
        /// Switch statement for making the truck status 1 more than the case.
        /// </summary>
        /// <returns></returns>
        public int truckSwitch()
        {
            switch (gsTruckStatus)
            {
                case 0: return gsTruckStatus = 1;
                case 1: return gsTruckStatus = 2;
                case 2: return gsTruckStatus = 3;
                case 3: return gsTruckStatus = 4;
                case 4: return gsTruckStatus = 1;
                default: return gsTruckStatus = 0;
            }
        }

        /// <summary>
        /// get set method for each of the truck parameters.
        /// </summary>
        /// <param name="gsTruckID"></param>
        /// <param name="gsTruckStatus"></param>
        /// <param name="gsTruckLoadCapacity"></param>
        /// <param name="gsTruckTotal"></param>
        public Trucks(string gsTruckID, string gsTruckStatus, 
            string gsTruckLoadCapacity, string gsTruckTotal) { }

        public int gsTruckTotal
        {
            get { return TruckTotal; }
            set { TruckTotal = value; }
        }

        public int gsTruckID
        {
            get { return TruckID; }
            set { TruckID = value; }
        }

        public int gsTruckStatus
        {
            get { return TruckStatus; }
            set { TruckStatus = value; }
        }

        public int gsTruckLoadCapacity
        {
            get { return TruckLoadCapacity; }
            set { TruckLoadCapacity = value; }
        }
    }
}

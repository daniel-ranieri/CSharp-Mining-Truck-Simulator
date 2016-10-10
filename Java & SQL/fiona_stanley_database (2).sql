-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jun 30, 2016 at 04:30 AM
-- Server version: 10.1.9-MariaDB
-- PHP Version: 5.6.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `fiona_stanley_database`
--

-- --------------------------------------------------------

--
-- Table structure for table `address`
--

CREATE TABLE `address` (
  `addressID` int(11) NOT NULL,
  `postcode` int(6) DEFAULT NULL,
  `streetName` varchar(30) DEFAULT NULL,
  `streetNumber` int(4) DEFAULT NULL,
  `city` varchar(10) DEFAULT NULL,
  `state` varchar(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `address`
--

INSERT INTO `address` (`addressID`, `postcode`, `streetName`, `streetNumber`, `city`, `state`) VALUES
(1, 6166, 'angry lane', 44, 'perth', 'WA'),
(2, 6416, 'sad road', 55, 'perth', 'WA');

-- --------------------------------------------------------

--
-- Table structure for table `client`
--

CREATE TABLE `client` (
  `clientID` int(11) NOT NULL,
  `firstName` varchar(30) DEFAULT NULL,
  `lastName` varchar(40) DEFAULT NULL,
  `contactNumber` int(10) DEFAULT NULL,
  `driversLicense` int(7) DEFAULT NULL,
  `address_fk` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `client`
--

INSERT INTO `client` (`clientID`, `firstName`, `lastName`, `contactNumber`, `driversLicense`, `address_fk`) VALUES
(1, 'John', 'Christof', 465566554, 6654569, 2),
(62, '', '', 323, NULL, NULL),
(63, '', '', 323, NULL, NULL),
(64, '', '', 324, NULL, NULL),
(65, '', '', 324, NULL, NULL),
(66, '', '', 435345, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `founder`
--

CREATE TABLE `founder` (
  `founderID` int(11) NOT NULL,
  `firstName` varchar(30) DEFAULT NULL,
  `lastName` varchar(40) DEFAULT NULL,
  `contactNumber` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `founder`
--

INSERT INTO `founder` (`founderID`, `firstName`, `lastName`, `contactNumber`) VALUES
(1, 'Luke', 'Johnson', 425236563),
(55, 'ghf', 'gfhfgh', 1213),
(56, 'ghf', 'gfhfgh', 1213),
(57, 'sdfs', 'dsdf', 23423),
(58, 'sdfs', 'dsdf', 23423),
(59, 'fdgf', 'gdgfgd', 5664),
(60, 'sfddfd', 'dsfdsf', 3424),
(61, 'sfdfsdd', 'fsdf', 435345),
(62, 'dan', 'sharpe', 4),
(63, 'dsfdsf', 'dsfdsf', 24324),
(64, 'dfsf', 'dsfsd', 23423),
(65, 'dfsf', 'dsfsd', 23423),
(66, 'Daniel ', 'Good Man', 412324345),
(67, 'Daniel ', 'Good Man', 412324345),
(68, 'Chris', 'Brown', 4232432),
(69, 'John ', 'Maker', 4232432),
(70, 'Chad', 'Smith', 53234564);

-- --------------------------------------------------------

--
-- Table structure for table `items`
--

CREATE TABLE `items` (
  `itemID` int(11) NOT NULL,
  `bagID` varchar(11) DEFAULT NULL,
  `dateTimeFound` datetime DEFAULT NULL,
  `storageLocation` int(5) DEFAULT NULL,
  `colour` varchar(20) DEFAULT NULL,
  `category` varchar(80) DEFAULT NULL,
  `status` varchar(120) DEFAULT NULL,
  `foundLocation_fk` int(5) DEFAULT NULL,
  `staffID_fk` int(11) DEFAULT NULL,
  `clientID_fk` int(11) DEFAULT NULL,
  `founderID_fk` int(11) DEFAULT NULL,
  `patientID_fk` int(11) DEFAULT NULL,
  `dateReleased` date DEFAULT NULL,
  `releasedTo` varchar(25) DEFAULT NULL,
  `releasedBy` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `items`
--

INSERT INTO `items` (`itemID`, `bagID`, `dateTimeFound`, `storageLocation`, `colour`, `category`, `status`, `foundLocation_fk`, `staffID_fk`, `clientID_fk`, `founderID_fk`, `patientID_fk`, `dateReleased`, `releasedTo`, `releasedBy`) VALUES
(13, '423963', '2016-06-30 09:15:20', 1, 'Green', 'Money', 'Found', 4, 2, NULL, 66, NULL, NULL, NULL, NULL),
(14, '7653345', '2016-06-30 09:15:20', 5, 'Green', 'Money', 'Found', 2, 1, NULL, 68, NULL, NULL, NULL, NULL),
(15, '654345', '2016-06-30 09:15:20', 6, 'Black', 'Electronics', 'Found', 6, 5, NULL, 68, NULL, NULL, NULL, NULL),
(16, '423963BR', '2016-06-30 09:27:22', 15, 'Green', 'Electronics', 'Found', 9, 4, NULL, 70, NULL, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `location`
--

CREATE TABLE `location` (
  `locationID` int(5) NOT NULL,
  `locationName` varchar(7) DEFAULT NULL,
  `locationDescription` varchar(150) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `location`
--

INSERT INTO `location` (`locationID`, `locationName`, `locationDescription`) VALUES
(1, 'Quad A', 'Grass Area'),
(2, 'Subway', 'Restaurant'),
(3, 'Cafe', 'Aroma Cafe'),
(4, 'Cafe', 'Caffisimo'),
(5, 'Hall A', 'next to elevators'),
(6, 'Hall B', 'Next to food court'),
(7, 'Hall C', 'Next to '),
(8, 'Waiting', 'Front waiting room'),
(9, 'Stairs', 'Inside stairs');

-- --------------------------------------------------------

--
-- Table structure for table `patient`
--

CREATE TABLE `patient` (
  `patientID` int(11) NOT NULL,
  `NOK` tinyint(1) DEFAULT NULL,
  `firstName` varchar(30) DEFAULT NULL,
  `lastName` varchar(40) DEFAULT NULL,
  `Address_fk` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `patient`
--

INSERT INTO `patient` (`patientID`, `NOK`, `firstName`, `lastName`, `Address_fk`) VALUES
(1, NULL, 'daniel', 'ranieri', 1),
(2, NULL, 'daniel', 'goodman', 2);

-- --------------------------------------------------------

--
-- Table structure for table `staff`
--

CREATE TABLE `staff` (
  `staffID` int(11) NOT NULL,
  `firstName` varchar(30) DEFAULT NULL,
  `lastName` varchar(40) DEFAULT NULL,
  `team` varchar(60) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `staff`
--

INSERT INTO `staff` (`staffID`, `firstName`, `lastName`, `team`) VALUES
(1, NULL, NULL, 'Admin Team'),
(2, NULL, NULL, 'Gold Team'),
(3, NULL, NULL, 'Red Team'),
(4, NULL, NULL, 'Green Team'),
(5, NULL, NULL, 'Blue Team');

-- --------------------------------------------------------

--
-- Table structure for table `storage`
--

CREATE TABLE `storage` (
  `storageID` int(5) NOT NULL,
  `storageLocaiton` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `storage`
--

INSERT INTO `storage` (`storageID`, `storageLocaiton`) VALUES
(1, 'Drop Safe'),
(2, 'Monday Shelf'),
(3, 'Tuesday Shelf'),
(4, 'Wednesday Shelf'),
(5, 'Tuesday Shelf'),
(6, 'Wednesday Shelf'),
(7, 'Thursday Shelf'),
(8, 'Friday Shelf'),
(9, 'Saturday Shelf'),
(10, 'Shelf 1'),
(12, 'Shelf2'),
(13, 'Shelf 3'),
(14, 'Shelf 4'),
(15, 'Shelf 5'),
(16, 'Shelf 6'),
(17, 'Shelf 7'),
(18, 'Shelf 8'),
(19, 'Shelf 9');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `address`
--
ALTER TABLE `address`
  ADD PRIMARY KEY (`addressID`);

--
-- Indexes for table `client`
--
ALTER TABLE `client`
  ADD PRIMARY KEY (`clientID`),
  ADD KEY `address_fk` (`address_fk`);

--
-- Indexes for table `founder`
--
ALTER TABLE `founder`
  ADD PRIMARY KEY (`founderID`);

--
-- Indexes for table `items`
--
ALTER TABLE `items`
  ADD PRIMARY KEY (`itemID`),
  ADD UNIQUE KEY `releasedBy` (`releasedBy`),
  ADD KEY `itemToLocation_idx` (`foundLocation_fk`),
  ADD KEY `itemToStaff_idx` (`staffID_fk`),
  ADD KEY `itemToClient_idx` (`clientID_fk`),
  ADD KEY `itemToFounder_idx` (`founderID_fk`),
  ADD KEY `storageLocation` (`storageLocation`),
  ADD KEY `patientID_fk` (`patientID_fk`),
  ADD KEY `releasedBy_2` (`releasedBy`);

--
-- Indexes for table `location`
--
ALTER TABLE `location`
  ADD PRIMARY KEY (`locationID`);

--
-- Indexes for table `patient`
--
ALTER TABLE `patient`
  ADD PRIMARY KEY (`patientID`),
  ADD KEY `Address_fk` (`Address_fk`);

--
-- Indexes for table `staff`
--
ALTER TABLE `staff`
  ADD PRIMARY KEY (`staffID`);

--
-- Indexes for table `storage`
--
ALTER TABLE `storage`
  ADD PRIMARY KEY (`storageID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `address`
--
ALTER TABLE `address`
  MODIFY `addressID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `client`
--
ALTER TABLE `client`
  MODIFY `clientID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=67;
--
-- AUTO_INCREMENT for table `founder`
--
ALTER TABLE `founder`
  MODIFY `founderID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=71;
--
-- AUTO_INCREMENT for table `items`
--
ALTER TABLE `items`
  MODIFY `itemID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;
--
-- AUTO_INCREMENT for table `location`
--
ALTER TABLE `location`
  MODIFY `locationID` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
--
-- AUTO_INCREMENT for table `patient`
--
ALTER TABLE `patient`
  MODIFY `patientID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `staff`
--
ALTER TABLE `staff`
  MODIFY `staffID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `storage`
--
ALTER TABLE `storage`
  MODIFY `storageID` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `client`
--
ALTER TABLE `client`
  ADD CONSTRAINT `client_ibfk_2` FOREIGN KEY (`address_fk`) REFERENCES `address` (`addressID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `items`
--
ALTER TABLE `items`
  ADD CONSTRAINT `items_ibfk_10` FOREIGN KEY (`clientID_fk`) REFERENCES `client` (`clientID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `items_ibfk_11` FOREIGN KEY (`founderID_fk`) REFERENCES `founder` (`founderID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `items_ibfk_13` FOREIGN KEY (`staffID_fk`) REFERENCES `staff` (`staffID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `items_ibfk_14` FOREIGN KEY (`patientID_fk`) REFERENCES `patient` (`patientID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `items_ibfk_15` FOREIGN KEY (`foundLocation_fk`) REFERENCES `location` (`locationID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `items_ibfk_9` FOREIGN KEY (`storageLocation`) REFERENCES `storage` (`storageID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `patient`
--
ALTER TABLE `patient`
  ADD CONSTRAINT `patient_ibfk_1` FOREIGN KEY (`Address_fk`) REFERENCES `address` (`addressID`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

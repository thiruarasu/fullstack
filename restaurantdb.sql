-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 09, 2024 at 03:55 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `restaurantdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `fooditem`
--

CREATE TABLE `fooditem` (
  `food_item_id` bigint(20) NOT NULL,
  `is_veg` bit(1) NOT NULL,
  `item_description` varchar(255) DEFAULT NULL,
  `item_name` varchar(255) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `qty` int(11) NOT NULL DEFAULT 0,
  `restaurant_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `fooditem`
--

INSERT INTO `fooditem` (`food_item_id`, `is_veg`, `item_description`, `item_name`, `price`, `qty`, `restaurant_id`) VALUES
(1, b'0', 'Dhall cooked with spicy', 'Fry Mongo Dall', 100.5, 0, 1),
(2, b'0', 'Gobi Manjurian Fried Gravy', 'Gobi Manjurian', 150.5, 0, 1);

-- --------------------------------------------------------

--
-- Table structure for table `fooditem_seq`
--

CREATE TABLE `fooditem_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `fooditem_seq`
--

INSERT INTO `fooditem_seq` (`next_val`) VALUES
(101);

-- --------------------------------------------------------

--
-- Table structure for table `orderdetails`
--

CREATE TABLE `orderdetails` (
  `order_id` bigint(20) NOT NULL,
  `restaurant_id` bigint(20) DEFAULT NULL,
  `user_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `orderdetails_seq`
--

CREATE TABLE `orderdetails_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `orderdetails_seq`
--

INSERT INTO `orderdetails_seq` (`next_val`) VALUES
(1);

-- --------------------------------------------------------

--
-- Table structure for table `order_items`
--

CREATE TABLE `order_items` (
  `order_item_id` bigint(20) NOT NULL,
  `food_item_id` bigint(20) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `qty` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `order_items_seq`
--

CREATE TABLE `order_items_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `order_items_seq`
--

INSERT INTO `order_items_seq` (`next_val`) VALUES
(1);

-- --------------------------------------------------------

--
-- Table structure for table `restuarant`
--

CREATE TABLE `restuarant` (
  `id` bigint(20) NOT NULL,
  `city` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `restaurant_name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `restuarant`
--

INSERT INTO `restuarant` (`id`, `city`, `address`, `description`, `restaurant_name`) VALUES
(1, 'CHENNAI', '1, VELACHERI MAIN ROAD,', 'Vegetarian Restaurant', 'ADYAR ANANDHA BHAVAN'),
(2, 'Chennai', '1, USMAN ROAD, PONDI BAZAR, TNAGAR,', 'Vegetarian Restaurant', 'BALAJI BHAVAN'),
(52, 'Chennai', '1, VELACHERRI MAIN ROAD, 2ND CROSS STREET', 'Vegetarian Restaurant', 'BALAJI BHAVAN'),
(53, 'Chennai', '1, VELACHERRI MAIN ROAD, 2ND CROSS STREET', 'NON Vegetarian Restaurant', 'RUCHIE HOTEL'),
(54, 'Chennai', '1, VELACHERRI 2ND MAIN ROAD, 2ND CROSS STREET', 'NON Vegetarian Restaurant', 'THAVASUKUTTI HOTEL');

-- --------------------------------------------------------

--
-- Table structure for table `restuarant_seq`
--

CREATE TABLE `restuarant_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `restuarant_seq`
--

INSERT INTO `restuarant_seq` (`next_val`) VALUES
(151);

-- --------------------------------------------------------

--
-- Table structure for table `userinfo`
--

CREATE TABLE `userinfo` (
  `user_id` bigint(20) NOT NULL,
  `address` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `mobile` bigint(20) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `user_name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `userinfo`
--

INSERT INTO `userinfo` (`user_id`, `address`, `city`, `email`, `mobile`, `password`, `user_name`) VALUES
(1, '1, VELACHERI MAIN ROAD,', 'CHENNAI', 'aras.thiru@gmail.com', 9445246841, '123456', 'THIRUNAVUKKARASU'),
(2, '1, VELACHERI MAIN ROAD,', 'CHENNAI', 'vishnu.thiru@gmail.com', 9445246841, '123456444', 'VISHNU');

-- --------------------------------------------------------

--
-- Table structure for table `userinfo_seq`
--

CREATE TABLE `userinfo_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `userinfo_seq`
--

INSERT INTO `userinfo_seq` (`next_val`) VALUES
(101);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `fooditem`
--
ALTER TABLE `fooditem`
  ADD PRIMARY KEY (`food_item_id`);

--
-- Indexes for table `orderdetails`
--
ALTER TABLE `orderdetails`
  ADD PRIMARY KEY (`order_id`);

--
-- Indexes for table `order_items`
--
ALTER TABLE `order_items`
  ADD PRIMARY KEY (`order_item_id`);

--
-- Indexes for table `restuarant`
--
ALTER TABLE `restuarant`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `userinfo`
--
ALTER TABLE `userinfo`
  ADD PRIMARY KEY (`user_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

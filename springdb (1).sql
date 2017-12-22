-- phpMyAdmin SQL Dump
-- version 4.3.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Dec 22, 2017 at 09:31 AM
-- Server version: 5.6.24
-- PHP Version: 5.5.24

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `springdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `authors`
--

CREATE TABLE IF NOT EXISTS `authors` (
  `authorCode` varchar(30) NOT NULL,
  `authorName` varchar(30) NOT NULL,
  `contactDetail` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `authors`
--

INSERT INTO `authors` (`authorCode`, `authorName`, `contactDetail`) VALUES
('1', 'Shakespeare,William', 'england'),
('2', 'Dantes', 'france'),
('3', 'Dickens,Charles', 'US'),
('4', 'Lewis,C.S', 'US');

-- --------------------------------------------------------

--
-- Table structure for table `books`
--

CREATE TABLE IF NOT EXISTS `books` (
  `isbn` varchar(20) NOT NULL,
  `bookName` varchar(50) NOT NULL,
  `authorCode` varchar(20) NOT NULL,
  `cost` int(10) NOT NULL,
  `bookType` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `books`
--

INSERT INTO `books` (`isbn`, `bookName`, `authorCode`, `cost`, `bookType`) VALUES
('123', 'Macbeth', '1', 700, 'Drama'),
('124', 'Hamlet', '1', 600, 'Drama'),
('125', 'The Chronicles of Narnia Series', '4', 1000, 'children'),
('126', 'The tale of two cities', '3', 600, 'drama'),
('127', 'Don Quixote', '2', 400, 'comedy');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `books`
--
ALTER TABLE `books`
  ADD PRIMARY KEY (`isbn`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

-- phpMyAdmin SQL Dump
-- version 4.3.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jun 29, 2015 at 05:18 AM
-- Server version: 5.6.24
-- PHP Version: 5.6.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `coursematchdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `comment`
--

CREATE TABLE IF NOT EXISTS `comment` (
  `id` int(11) NOT NULL,
  `course_id` bigint(20) NOT NULL,
  `student_id` varchar(255) NOT NULL,
  `comment` varchar(255) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `comment`
--

INSERT INTO `comment` (`id`, `course_id`, `student_id`, `comment`) VALUES
(4, 11, 'mohamed.ragab@tum.de', 'hii'),
(5, 11, 'thomas@tum.de', 'i think otherwise');

-- --------------------------------------------------------

--
-- Table structure for table `course`
--

CREATE TABLE IF NOT EXISTS `course` (
  `id` bigint(20) NOT NULL,
  `professor_name` varchar(255) DEFAULT NULL,
  `chair` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `course`
--

INSERT INTO `course` (`id`, `professor_name`, `chair`, `name`, `description`) VALUES
(1, 'Prof1', 'formal methods', 'modeling', 'no desc'),
(2, 'prof.1', 'software engineering', 'Introduction to Software Engineering', 'fun course for fresh students at the university recommended to begginers'),
(3, 'Prof.2', 'software engineering', 'Patterns', 'software patterns at its best . From MVC to fascade s'),
(4, 'Prof.3', 'informatics', 'Web Services', 'fun A challenging course for those though are interested in web programming'),
(5, 'Prof.1', 'software engineering', 'Introduction to Software application', 'fun course for fresh students at the university recommended to advanced people'),
(6, 'Prof.12', 'formal methods', 'Patterns studies', 'patterns studies for all chairs'),
(7, 'Prof.3', 'informatics', 'Web Services techniques', 'fun A challenging course for those though are interested in theoretical web programming'),
(8, 'Prof.1', 'Database', 'Databases', 'theory of queries'),
(9, 'Prof.5', 'software engineering', 'Project Management', 'how to manage a project'),
(10, 'Prof.3', 'Distributed Systems', 'Distributed Systems', 'fun A challenging course for those though are interested in Distributed systems'),
(11, 'Prof.8', 'Algorithms', 'Algorithms', 'Theory of algorithms');

-- --------------------------------------------------------

--
-- Table structure for table `job`
--

CREATE TABLE IF NOT EXISTS `job` (
  `id` bigint(20) NOT NULL,
  `company_name` varchar(255) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `salary` varchar(255) DEFAULT NULL,
  `begin_time` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `job`
--

INSERT INTO `job` (`id`, `company_name`, `title`, `salary`, `begin_time`, `description`) VALUES
(1, 'front end developer', 'company', 'front end developer', '25', '2014');

-- --------------------------------------------------------

--
-- Table structure for table `overallranking`
--

CREATE TABLE IF NOT EXISTS `overallranking` (
  `id` int(11) NOT NULL,
  `course_id` bigint(20) DEFAULT NULL,
  `fair` double NOT NULL,
  `material` double NOT NULL,
  `fun` double NOT NULL,
  `grade` double NOT NULL,
  `recommend` double NOT NULL,
  `overall_rate` double NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `overallranking`
--

INSERT INTO `overallranking` (`id`, `course_id`, `fair`, `material`, `fun`, `grade`, `recommend`, `overall_rate`) VALUES
(1, 1, 5, 1, 1, 1, 5, 2),
(2, 2, 0, 0, 0, 0, 0, 0),
(3, 3, 0, 1, 1, 1, 1, 0),
(4, 4, 0, 0, 0, 0, 0, 0),
(5, 5, 0, 0, 0, 0, 0, 0),
(6, 6, 0, 0, 0, 0, 0, 0),
(7, 7, 0, 0, 0, 0, 0, 0),
(8, 8, 0, 0, 0, 0, 0, 0),
(9, 9, 0, 0, 0, 0, 0, 0),
(10, 10, 0, 0, 0, 0, 0, 0),
(11, 11, 5, 3, 3, 4, 5, 3);

-- --------------------------------------------------------

--
-- Table structure for table `ranking`
--

CREATE TABLE IF NOT EXISTS `ranking` (
  `id` int(11) NOT NULL,
  `fair` double NOT NULL,
  `material` double NOT NULL,
  `fun` double NOT NULL,
  `recommend` double NOT NULL,
  `course_id` bigint(20) NOT NULL,
  `grade` double NOT NULL,
  `overall_rate` double NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=46 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `ranking`
--

INSERT INTO `ranking` (`id`, `fair`, `material`, `fun`, `recommend`, `course_id`, `grade`, `overall_rate`) VALUES
(2, 0, 0, 0, 0, 2, 0, 0),
(3, 0, 0, 0, 0, 3, 0, 0),
(4, 0, 0, 0, 0, 4, 0, 0),
(5, 0, 0, 0, 0, 5, 0, 0),
(6, 0, 0, 0, 0, 6, 0, 0),
(7, 0, 0, 0, 0, 7, 0, 0),
(8, 0, 0, 0, 0, 8, 0, 0),
(9, 0, 0, 0, 0, 9, 0, 0),
(10, 0, 0, 0, 0, 10, 0, 0),
(11, 0, 0, 0, 0, 11, 0, 0),
(22, 0, 0, 0, 0, 1, 0, 0),
(41, 5, 4, 4, 5, 11, 4, 4),
(42, 5, 2, 2, 5, 11, 4, 3),
(43, 5, 1, 1, 5, 1, 1, 2),
(44, 0, 1, 1, 1, 3, 1, 0),
(45, 5, 1, 1, 5, 1, 1, 2);

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE IF NOT EXISTS `student` (
  `email` varchar(255) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`email`, `name`, `password`) VALUES
('mohamed.ragab@tum.de', 'mohamed ragab', '1234'),
('thomas@tum.de', 'thomas', '1234');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `comment`
--
ALTER TABLE `comment`
  ADD PRIMARY KEY (`id`), ADD KEY `course_id` (`course_id`), ADD KEY `student_id` (`student_id`);

--
-- Indexes for table `course`
--
ALTER TABLE `course`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `job`
--
ALTER TABLE `job`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `overallranking`
--
ALTER TABLE `overallranking`
  ADD PRIMARY KEY (`id`), ADD KEY `course_id` (`course_id`);

--
-- Indexes for table `ranking`
--
ALTER TABLE `ranking`
  ADD PRIMARY KEY (`id`), ADD KEY `course_id` (`course_id`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`email`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `comment`
--
ALTER TABLE `comment`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `overallranking`
--
ALTER TABLE `overallranking`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=12;
--
-- AUTO_INCREMENT for table `ranking`
--
ALTER TABLE `ranking`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=46;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `comment`
--
ALTER TABLE `comment`
ADD CONSTRAINT `comment_ibfk_1` FOREIGN KEY (`course_id`) REFERENCES `course` (`id`);

--
-- Constraints for table `overallranking`
--
ALTER TABLE `overallranking`
ADD CONSTRAINT `overallranking_ibfk_1` FOREIGN KEY (`course_id`) REFERENCES `course` (`id`);

--
-- Constraints for table `ranking`
--
ALTER TABLE `ranking`
ADD CONSTRAINT `ranking_ibfk_1` FOREIGN KEY (`course_id`) REFERENCES `course` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

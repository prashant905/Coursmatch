-- phpMyAdmin SQL Dump
-- version 4.3.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jul 02, 2015 at 05:58 AM
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
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `comment`
--

INSERT INTO `comment` (`id`, `course_id`, `student_id`, `comment`) VALUES
(4, 11, 'mohamed.ragab@tum.de', 'hii'),
(5, 11, 'thomas@tum.de', 'i think otherwise'),
(6, 11, 'mohamed.ragab@tum.de', 'hiiii again thomas testing this is working or not'),
(7, 11, 'thomas@tum.de', 'tags are done '),
(8, 3, 'mohamed.ragab@tum.de', 'best course'),
(9, 3, 'thomas@tum.de', 'awesome');

-- --------------------------------------------------------

--
-- Table structure for table `company`
--

CREATE TABLE IF NOT EXISTS `company` (
  `email` varchar(255) NOT NULL,
  `password` text NOT NULL,
  `name` text NOT NULL,
  `description` text
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `company`
--

INSERT INTO `company` (`email`, `password`, `name`, `description`) VALUES
('apple@coursematch.de', '1234', 'Apple Ltd', 'multinational');

-- --------------------------------------------------------

--
-- Table structure for table `course`
--

CREATE TABLE IF NOT EXISTS `course` (
  `id` bigint(20) NOT NULL,
  `professor_name` varchar(255) DEFAULT NULL,
  `chair` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `tags` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `course`
--

INSERT INTO `course` (`id`, `professor_name`, `chair`, `name`, `description`, `tags`) VALUES
(1, 'Prof1', 'formal methods', 'modeling', 'no desc', 'moe, modelingdata'),
(2, 'prof.1', 'software engineering', 'Introduction to Software Engineering', 'fun course for fresh students at the university recommended to begginers', 'complex'),
(3, 'Prof.2', 'software engineering', 'Patterns', 'software patterns at its best . From MVC to fascade s', 'thomas'),
(4, 'Prof.3', 'informatics', 'Web Services', 'fun A challenging course for those though are interested in web programming', 'fun, easy, playfull'),
(5, 'Prof.1', 'software engineering', 'Introduction to Software application', 'fun course for fresh students at the university recommended to advanced people', ''),
(6, 'Prof.12', 'formal methods', 'Patterns studies', 'patterns studies for all chairs', ''),
(7, 'Prof.3', 'informatics', 'Web Services techniques', 'fun A challenging course for those though are interested in theoretical web programming', 'bedan, 5awal'),
(8, 'Prof.1', 'Database', 'Databases', 'theory of queries', ''),
(9, 'Prof.5', 'software engineering', 'Project Management', 'how to manage a project', 'fun'),
(10, 'Prof.3', 'Distributed Systems', 'Distributed Systems', 'fun A challenging course for those though are interested in Distributed systems', 'boring as shit'),
(11, 'Prof.8', 'Algorithms', 'Algorithms', 'Theory of algorithms', 'easy, easy to understand');

-- --------------------------------------------------------

--
-- Table structure for table `favorite_courses`
--

CREATE TABLE IF NOT EXISTS `favorite_courses` (
  `id` int(11) NOT NULL,
  `course_id` bigint(20) NOT NULL,
  `email` text
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `favorite_courses`
--

INSERT INTO `favorite_courses` (`id`, `course_id`, `email`) VALUES
(10, 4, 'mohamed.ragab@tum.de');

-- --------------------------------------------------------

--
-- Table structure for table `job`
--

CREATE TABLE IF NOT EXISTS `job` (
  `id` int(11) NOT NULL,
  `title` text,
  `salary` text,
  `begin_date` text,
  `description` text,
  `contact` text,
  `link` text,
  `tags` text NOT NULL,
  `company_name` text NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `job`
--

INSERT INTO `job` (`id`, `title`, `salary`, `begin_date`, `description`, `contact`, `link`, `tags`, `company_name`) VALUES
(13, 'IOS Frontend Developer changed', 'IOS Frontend Developer changed', '1st of august 2013', 'development IOS', 'recruit@apple.de', 'www.apple.de/jobs?id=1', 'IOS, Developer', 'Apple Ltd');

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
(3, 3, 2, 3, 3, 1, 3, 2),
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
) ENGINE=InnoDB AUTO_INCREMENT=49 DEFAULT CHARSET=latin1;

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
(45, 5, 1, 1, 5, 1, 1, 2),
(46, 0, 5, 5, 5, 3, 1, 3),
(47, 5, 3, 3, 3, 3, 1, 3),
(48, 5, 3, 3, 3, 3, 1, 3);

-- --------------------------------------------------------

--
-- Table structure for table `schedule`
--

CREATE TABLE IF NOT EXISTS `schedule` (
  `id` int(11) NOT NULL,
  `start_date` datetime NOT NULL,
  `end_date` datetime NOT NULL,
  `room` text NOT NULL,
  `course_id` bigint(20) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `schedule`
--

INSERT INTO `schedule` (`id`, `start_date`, `end_date`, `room`, `course_id`) VALUES
(1, '2015-07-03 07:15:00', '2015-07-03 08:46:00', 'MI HS 1', 1),
(2, '2015-07-10 07:15:00', '2015-07-10 08:46:00', 'MI HS 1', 1),
(3, '2015-07-17 07:15:00', '2015-07-17 08:46:00', 'MI HS 1', 1);

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE IF NOT EXISTS `student` (
  `email` varchar(255) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `course_tags` text NOT NULL,
  `job_tags` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`email`, `name`, `password`, `course_tags`, `job_tags`) VALUES
('mohamed.ragab@tum.de', 'mohamed ragab', '1234', 'easy, thomas', 'IOS'),
('thomas@tum.de', 'thomas', '1234', 'easy', 'developer');

-- --------------------------------------------------------

--
-- Table structure for table `uploads`
--

CREATE TABLE IF NOT EXISTS `uploads` (
  `id` int(11) NOT NULL,
  `course_id` bigint(20) NOT NULL,
  `author` text,
  `source` text,
  `name` text,
  `content` text
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `uploads`
--

INSERT INTO `uploads` (`id`, `course_id`, `author`, `source`, `name`, `content`) VALUES
(1, 1, 'mohamed.ragab@tum.de', 'Link', 'source material', 'www.somelink.com');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `comment`
--
ALTER TABLE `comment`
  ADD PRIMARY KEY (`id`), ADD KEY `course_id` (`course_id`), ADD KEY `student_id` (`student_id`);

--
-- Indexes for table `company`
--
ALTER TABLE `company`
  ADD PRIMARY KEY (`email`);

--
-- Indexes for table `course`
--
ALTER TABLE `course`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `favorite_courses`
--
ALTER TABLE `favorite_courses`
  ADD PRIMARY KEY (`id`), ADD KEY `course_id` (`course_id`);

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
-- Indexes for table `schedule`
--
ALTER TABLE `schedule`
  ADD PRIMARY KEY (`id`), ADD KEY `course_id` (`course_id`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`email`);

--
-- Indexes for table `uploads`
--
ALTER TABLE `uploads`
  ADD PRIMARY KEY (`id`), ADD KEY `course_id` (`course_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `comment`
--
ALTER TABLE `comment`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=10;
--
-- AUTO_INCREMENT for table `favorite_courses`
--
ALTER TABLE `favorite_courses`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=11;
--
-- AUTO_INCREMENT for table `job`
--
ALTER TABLE `job`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=14;
--
-- AUTO_INCREMENT for table `overallranking`
--
ALTER TABLE `overallranking`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=12;
--
-- AUTO_INCREMENT for table `ranking`
--
ALTER TABLE `ranking`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=49;
--
-- AUTO_INCREMENT for table `schedule`
--
ALTER TABLE `schedule`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `uploads`
--
ALTER TABLE `uploads`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `comment`
--
ALTER TABLE `comment`
ADD CONSTRAINT `comment_ibfk_1` FOREIGN KEY (`course_id`) REFERENCES `course` (`id`);

--
-- Constraints for table `favorite_courses`
--
ALTER TABLE `favorite_courses`
ADD CONSTRAINT `favorite_courses_ibfk_1` FOREIGN KEY (`course_id`) REFERENCES `course` (`id`);

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

--
-- Constraints for table `schedule`
--
ALTER TABLE `schedule`
ADD CONSTRAINT `schedule_ibfk_1` FOREIGN KEY (`course_id`) REFERENCES `course` (`id`);

--
-- Constraints for table `uploads`
--
ALTER TABLE `uploads`
ADD CONSTRAINT `uploads_ibfk_1` FOREIGN KEY (`course_id`) REFERENCES `course` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

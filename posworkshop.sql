-- phpMyAdmin SQL Dump
-- version 4.8.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 26, 2019 at 05:27 PM
-- Server version: 10.1.32-MariaDB
-- PHP Version: 7.2.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `posworkshop`
--

-- --------------------------------------------------------

--
-- Table structure for table `barang`
--

CREATE TABLE `barang` (
  `kd_brg` varchar(20) NOT NULL,
  `nama_brg` varchar(25) NOT NULL,
  `jenis_brg` varchar(25) NOT NULL,
  `harga_beli` varchar(10) NOT NULL,
  `harga_jual` varchar(10) NOT NULL,
  `stok_brg` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `barang`
--

INSERT INTO `barang` (`kd_brg`, `nama_brg`, `jenis_brg`, `harga_beli`, `harga_jual`, `stok_brg`) VALUES
('098765456717', 'Potato', 'Makanan', '10000', '12000000', '70');

-- --------------------------------------------------------

--
-- Table structure for table `barang_masuk`
--

CREATE TABLE `barang_masuk` (
  `kd_brg_masuk` varchar(20) NOT NULL,
  `tgl_brg_masuk` varchar(20) NOT NULL,
  `no_pembelian` varchar(20) NOT NULL,
  `tgl_pembelian` varchar(20) NOT NULL,
  `kd_brg` varchar(20) NOT NULL,
  `nama_brg` varchar(25) NOT NULL,
  `jenis` varchar(20) NOT NULL,
  `jumlah` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `barang_masuk`
--

INSERT INTO `barang_masuk` (`kd_brg_masuk`, `tgl_brg_masuk`, `no_pembelian`, `tgl_pembelian`, `kd_brg`, `nama_brg`, `jenis`, `jumlah`) VALUES
('07957395', '2019-02-24', '073953975', '2019-02-01', '01248235', 'Niu Green Tea Madu', 'Minuman Dingin', '99');

-- --------------------------------------------------------

--
-- Table structure for table `pembelian`
--

CREATE TABLE `pembelian` (
  `no_pembelian` varchar(20) NOT NULL,
  `tgl_pembelian` varchar(20) NOT NULL,
  `kd_brg` varchar(20) NOT NULL,
  `nama_brg` varchar(25) NOT NULL,
  `jenis` varchar(25) NOT NULL,
  `harga_beli` varchar(10) NOT NULL,
  `jumlah` varchar(10) NOT NULL,
  `total` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pembelian`
--

INSERT INTO `pembelian` (`no_pembelian`, `tgl_pembelian`, `kd_brg`, `nama_brg`, `jenis`, `harga_beli`, `jumlah`, `total`) VALUES
('047575798', '2019-02-24', '02868905', 'Clear Man', 'Kesehatan Pria', '27000', '5', '10');

-- --------------------------------------------------------

--
-- Table structure for table `penjualan`
--

CREATE TABLE `penjualan` (
  `no_penjualan` varchar(20) NOT NULL,
  `tgl_penjualan` varchar(20) NOT NULL,
  `kd_brg` varchar(20) NOT NULL,
  `nama_brg` varchar(25) NOT NULL,
  `jenis` varchar(10) NOT NULL,
  `harga_jual` varchar(10) NOT NULL,
  `jumlah` varchar(10) NOT NULL,
  `stok_brg` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `penjualan`
--

INSERT INTO `penjualan` (`no_penjualan`, `tgl_penjualan`, `kd_brg`, `nama_brg`, `jenis`, `harga_jual`, `jumlah`, `stok_brg`) VALUES
('09871234678', '2019-02-24', '018712346', 'G. Malkist Keju', 'Cemilan', '9000', '2', '90');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `barang`
--
ALTER TABLE `barang`
  ADD PRIMARY KEY (`kd_brg`);

--
-- Indexes for table `barang_masuk`
--
ALTER TABLE `barang_masuk`
  ADD PRIMARY KEY (`kd_brg_masuk`);

--
-- Indexes for table `pembelian`
--
ALTER TABLE `pembelian`
  ADD PRIMARY KEY (`no_pembelian`);

--
-- Indexes for table `penjualan`
--
ALTER TABLE `penjualan`
  ADD PRIMARY KEY (`no_penjualan`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

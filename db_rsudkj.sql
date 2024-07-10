-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 30, 2024 at 03:36 PM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.0.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_rsudkj`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_dokter`
--

CREATE TABLE `tbl_dokter` (
  `id_dokter` char(10) NOT NULL,
  `nm_dokter` varchar(255) NOT NULL,
  `jenkel` varchar(255) NOT NULL,
  `no_telepon` char(20) NOT NULL,
  `spesialis` varchar(255) NOT NULL,
  `jadwal_praktik` varchar(255) NOT NULL,
  `jam_praktik` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `tbl_dokter`
--

INSERT INTO `tbl_dokter` (`id_dokter`, `nm_dokter`, `jenkel`, `no_telepon`, `spesialis`, `jadwal_praktik`, `jam_praktik`) VALUES
('DKT0001', 'Dr. John Doe', 'Laki-Laki', '081234567890', 'Dokter Umum', 'Senin', '08.00-13.00'),
('DKT0002', 'Dr. Jane Smith', 'Perempuan', '081234567891', 'Dokter Anak', 'Selasa', '09.00-14.00'),
('DKT0003', 'Dr. Michael Johnson', 'Laki-Laki', '081234567892', 'Dokter Bedah', 'Rabu', '10.00-15.00'),
('DKT0004', 'Dr. Sarah Lee', 'Perempuan', '081234567893', 'Dokter Gigi', 'Kamis', '11.00-16.00'),
('DKT0005', 'Dr. David Brown', 'Laki-Laki', '081234567894', 'Dokter Mata', 'Jumat', '12.00-17.00'),
('DKT0006', 'Dr. Emily Davis', 'Perempuan', '081234567895', 'Dokter Jantung', 'Kamis', '08.00-13.00'),
('DKT0007', 'Dr. Robert Wilson', 'Laki-Laki', '081234567896', 'Dokter Paru-paru', 'Jumat', '09.00-14.00'),
('DKT0008', 'Dr. Jessica Martinez', 'Perempuan', '081234567897', 'Dokter Saraf', 'Senin', '10.00-15.00'),
('DKT0009', 'Dr. William Taylor', 'Laki-Laki', '081234567898', 'Dokter Kulit', 'Selasa', '11.00-16.00'),
('DKT0010', 'Dr. Karmanto', 'Laki-Laki', '081573941407', 'Spesialis Saraf', 'Selasa', '08.00-13.00');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_esp`
--

CREATE TABLE `tbl_esp` (
  `id_esp` char(10) NOT NULL,
  `id_pasien` char(10) NOT NULL,
  `id_kunjungan` char(10) NOT NULL,
  `tgl_esp` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- --------------------------------------------------------

--
-- Table structure for table `tbl_kunjungan`
--

CREATE TABLE `tbl_kunjungan` (
  `id_kunjungan` char(10) NOT NULL,
  `id_pasien` char(10) NOT NULL,
  `id_dokter` char(10) NOT NULL,
  `tgl_kunjungan` varchar(255) NOT NULL,
  `keluhan` varchar(255) NOT NULL,
  `diagnosis` varchar(255) NOT NULL,
  `tindakan` varchar(255) NOT NULL,
  `id_obat` char(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `tbl_kunjungan`
--

INSERT INTO `tbl_kunjungan` (`id_kunjungan`, `id_pasien`, `id_dokter`, `tgl_kunjungan`, `keluhan`, `diagnosis`, `tindakan`, `id_obat`) VALUES
('KJ0001', 'PSN0001', 'DKT0001', '23-06-2024', 'Anemia', 'Sakit Kepala', 'Banyak Istirahat, Minum obat penambah darah', 'OBT0002'),
('KJ0002', 'PSN0002', 'DKT0002', '26-06-2024', 'DBD', 'Demam', 'Rawat Inap', 'OBT0001'),
('KJ0003', 'PSN0004', 'DKT0004', '28-06-2024', 'DBD', 'Demam Tinggi', 'Istirahat yang cukup minum obat setelah makan', 'OBT0001'),
('KJ0004', 'PSN0004', 'DKT0005', '30-06-2024', 'DBD', 'Demam', 'Infus dan istirahat, diberikan obat penurun panas', 'OBT0001');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_obat`
--

CREATE TABLE `tbl_obat` (
  `id_obat` char(10) NOT NULL,
  `nm_obat` varchar(255) NOT NULL,
  `jenis_obat` varchar(255) NOT NULL,
  `harga` varchar(255) NOT NULL,
  `keterangan` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `tbl_obat`
--

INSERT INTO `tbl_obat` (`id_obat`, `nm_obat`, `jenis_obat`, `harga`, `keterangan`) VALUES
('OBT0001', 'Paracetamol', 'Antipiretik', '15000', 'Obat penurun demam'),
('OBT0002', 'Amoxicillin', 'Antibiotik', '15750', 'Untuk infeksi bakteri'),
('OBT0003', 'Loratadine', 'Antihistamin', '5200', 'Mengatasi alergi'),
('OBT0004', 'Ibuprofen', 'Antiinflamasi', '8900', 'Meredakan nyeri dan peradangan'),
('OBT0005', 'Omeprazole', 'Antasida', '12300', 'Mengurangi produksi asam lambung'),
('OBT0006', 'Paracetamol', 'Obat Sakit Kepala', '5000', 'Dikonsumsi 3x sehari setelah makan'),
('OBT0007', 'Amoxicillin', 'Antibiotik', '10000', 'Dikonsumsi sesuai petunjuk dokter'),
('OBT0008', 'Loratadine', 'Antihistamin', '8000', 'Dikonsumsi 1x sehari untuk alergi');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_pasien`
--

CREATE TABLE `tbl_pasien` (
  `id_pasien` char(10) NOT NULL,
  `no_bpjs` varchar(255) DEFAULT NULL,
  `nm_pasien` varchar(255) NOT NULL,
  `alamat` varchar(255) NOT NULL,
  `tgl_lahir` varchar(255) NOT NULL,
  `jenkel` varchar(255) NOT NULL,
  `no_telpon` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `tbl_pasien`
--

INSERT INTO `tbl_pasien` (`id_pasien`, `no_bpjs`, `nm_pasien`, `alamat`, `tgl_lahir`, `jenkel`, `no_telpon`) VALUES
('PSN0001', '1234567890', 'Ani', 'Jl. Contoh No. 123', '1990-05-20', 'Perempuan', '081234567890'),
('PSN0002', '2345678901', 'Budi', 'Jl. Contoh No. 456', '1985-10-15', 'Laki-laki', '082345678901'),
('PSN0003', '3456789012', 'Citra', 'Jl. Contoh No. 789', '1998-03-25', 'Perempuan', '083456789012'),
('PSN0004', '', 'Karmanto', 'Jl. Kemang Utara 33', '01-09-2002', 'Laki-Laki', '081573941408');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_pembayaran`
--

CREATE TABLE `tbl_pembayaran` (
  `id_pembayaran` char(10) NOT NULL,
  `tgl_pembayaran` varchar(255) NOT NULL,
  `id_pasien` char(10) NOT NULL,
  `id_kunjungan` char(10) NOT NULL,
  `total_bayar` int(100) NOT NULL,
  `jumlah_bayar` int(100) NOT NULL,
  `kembalian` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `tbl_pembayaran`
--

INSERT INTO `tbl_pembayaran` (`id_pembayaran`, `tgl_pembayaran`, `id_pasien`, `id_kunjungan`, `total_bayar`, `jumlah_bayar`, `kembalian`) VALUES
('PB0001', '23-06-2024', 'PSN0001', 'KJ0001', 78750, 100000, 21250),
('PB0002', '23-06-2024', 'PSN0001', 'KJ0001', 138750, 150000, 11250),
('PB0003', '30-06-2024', 'PSN0003', 'KJ0001', 60000, 100000, 40000);

-- --------------------------------------------------------

--
-- Table structure for table `tbl_pembayarandetail`
--

CREATE TABLE `tbl_pembayarandetail` (
  `id_pembayaran` char(10) NOT NULL,
  `id_resep` char(10) NOT NULL,
  `nama_obat` varchar(255) NOT NULL,
  `jumlah` int(100) NOT NULL,
  `total_harga` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_pembayarandetail`
--

INSERT INTO `tbl_pembayarandetail` (`id_pembayaran`, `id_resep`, `nama_obat`, `jumlah`, `total_harga`) VALUES
('', 'RSP0002', 'Paracetamol', 8, 120000),
('', 'RSP0003', 'Omeprazole', 5, 61500),
('', 'RSP0003', 'Omeprazole', 5, 61500),
('', 'RSP0001', 'Amoxicillin', 5, 78750),
('', 'RSP0001', 'Amoxicillin', 5, 78750),
('', 'RSP0002', 'Paracetamol', 4, 60000),
('', 'RSP0001', 'Amoxicillin', 5, 78750),
('', 'RSP0003', 'Paracetamol', 5, 75000),
('', 'RSP0002', 'Paracetamol', 4, 60000),
('', 'RSP0001', 'Amoxicillin', 5, 78750),
('', 'RSP0002', 'Paracetamol', 4, 60000);

-- --------------------------------------------------------

--
-- Table structure for table `tbl_pengguna`
--

CREATE TABLE `tbl_pengguna` (
  `id_penggua` int(10) NOT NULL,
  `nama` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `tbl_pengguna`
--

INSERT INTO `tbl_pengguna` (`id_penggua`, `nama`, `email`, `username`, `password`) VALUES
(1, 'admin', 'admin@gmail.com', 'admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_perawat`
--

CREATE TABLE `tbl_perawat` (
  `id_perawat` char(10) NOT NULL,
  `nm_perawat` varchar(255) NOT NULL,
  `jenkel` varchar(255) NOT NULL,
  `no_telepon` char(20) NOT NULL,
  `tgl_lahir` varchar(255) NOT NULL,
  `alamat` varchar(255) NOT NULL,
  `jadwal` varchar(255) NOT NULL,
  `jam` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `tbl_perawat`
--

INSERT INTO `tbl_perawat` (`id_perawat`, `nm_perawat`, `jenkel`, `no_telepon`, `tgl_lahir`, `alamat`, `jadwal`, `jam`) VALUES
('PWT0001', 'Anisa Putri', 'Perempuan', '081234567890', '1990-01-01', 'Jl. Kemerdekaan 1', 'Senin', '08.00-13.00'),
('PWT0002', 'Budi Santoso', 'Laki-laki', '081234567891', '1991-02-02', 'Jl. Kemerdekaan 2', 'Selasa', '09.00-14.00'),
('PWT0003', 'Cindy Wijaya', 'Perempuan', '081234567892', '1992-03-03', 'Jl. Kemerdekaan 3', 'Rabu', '10.00-15.00'),
('PWT0004', 'Diah Purnama', 'Perempuan', '081234567893', '1993-04-04', 'Jl. Kemerdekaan 4', 'Kamis', '11.00-16.00'),
('PWT0005', 'Eko Paratama', 'Laki-laki', '081234567894', '1994-05-05', 'Jl. Kemerdekaan 5', 'Jumat', '12.00-17.00'),
('PWT0006', 'Fitriani Sari', 'Perempuan', '081234567895', '1995-06-06', 'Jl. Kemerdekaan 6', 'Kamis', '08.00-13.00'),
('PWT0007', 'Gita Permata', 'Perempuan', '081234567896', '1996-07-07', 'Jl. Kemerdekaan 7', 'Jumat', '09.00-14.00'),
('PWT0008', 'Hadi Nugroho', 'Laki-laki', '081234567897', '1997-08-08', 'Jl. Kemerdekaan 8', 'Senin', '10.00-15.00'),
('PWT0009', 'Indah Cahya', 'Perempuan', '081234567898', '1998-09-09', 'Jl. Kemerdekaan 9', 'Selasa', '11.00-16.00');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_resep`
--

CREATE TABLE `tbl_resep` (
  `id_resep` char(10) NOT NULL,
  `id_kunjungan` char(10) NOT NULL,
  `id_obat` char(10) NOT NULL,
  `jumlah` int(100) NOT NULL,
  `total_harga` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `tbl_resep`
--

INSERT INTO `tbl_resep` (`id_resep`, `id_kunjungan`, `id_obat`, `jumlah`, `total_harga`) VALUES
('RSP0001', 'KJ0001', 'OBT0002', 5, 78750),
('RSP0002', 'KJ0001', 'OBT0001', 4, 60000),
('RSP0003', 'KJ0003', 'OBT0001', 5, 75000),
('RSP0004', 'KJ0004', 'OBT0002', 3, 47250);

-- --------------------------------------------------------

--
-- Table structure for table `tbl_sementara`
--

CREATE TABLE `tbl_sementara` (
  `id_resep` char(10) NOT NULL,
  `nama_obat` varchar(255) NOT NULL,
  `jumlah` int(100) NOT NULL,
  `total_harga` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_dokter`
--
ALTER TABLE `tbl_dokter`
  ADD PRIMARY KEY (`id_dokter`);

--
-- Indexes for table `tbl_esp`
--
ALTER TABLE `tbl_esp`
  ADD PRIMARY KEY (`id_esp`),
  ADD KEY `id_pasien` (`id_pasien`),
  ADD KEY `id_kunjungan` (`id_kunjungan`);

--
-- Indexes for table `tbl_kunjungan`
--
ALTER TABLE `tbl_kunjungan`
  ADD PRIMARY KEY (`id_kunjungan`),
  ADD KEY `id_pasien` (`id_pasien`),
  ADD KEY `id_dokter` (`id_dokter`),
  ADD KEY `id_obat` (`id_obat`);

--
-- Indexes for table `tbl_obat`
--
ALTER TABLE `tbl_obat`
  ADD PRIMARY KEY (`id_obat`);

--
-- Indexes for table `tbl_pasien`
--
ALTER TABLE `tbl_pasien`
  ADD PRIMARY KEY (`id_pasien`);

--
-- Indexes for table `tbl_pembayaran`
--
ALTER TABLE `tbl_pembayaran`
  ADD PRIMARY KEY (`id_pembayaran`),
  ADD KEY `id_kunjungan` (`id_kunjungan`),
  ADD KEY `id_pasien` (`id_pasien`);

--
-- Indexes for table `tbl_pengguna`
--
ALTER TABLE `tbl_pengguna`
  ADD PRIMARY KEY (`id_penggua`);

--
-- Indexes for table `tbl_perawat`
--
ALTER TABLE `tbl_perawat`
  ADD PRIMARY KEY (`id_perawat`);

--
-- Indexes for table `tbl_resep`
--
ALTER TABLE `tbl_resep`
  ADD PRIMARY KEY (`id_resep`),
  ADD KEY `id_obat` (`id_obat`),
  ADD KEY `id_kunjungan` (`id_kunjungan`);

--
-- Indexes for table `tbl_sementara`
--
ALTER TABLE `tbl_sementara`
  ADD PRIMARY KEY (`id_resep`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_pengguna`
--
ALTER TABLE `tbl_pengguna`
  MODIFY `id_penggua` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tbl_esp`
--
ALTER TABLE `tbl_esp`
  ADD CONSTRAINT `tbl_esp_ibfk_1` FOREIGN KEY (`id_pasien`) REFERENCES `tbl_pasien` (`id_pasien`),
  ADD CONSTRAINT `tbl_esp_ibfk_2` FOREIGN KEY (`id_kunjungan`) REFERENCES `tbl_kunjungan` (`id_kunjungan`);

--
-- Constraints for table `tbl_kunjungan`
--
ALTER TABLE `tbl_kunjungan`
  ADD CONSTRAINT `tbl_kunjungan_ibfk_1` FOREIGN KEY (`id_pasien`) REFERENCES `tbl_pasien` (`id_pasien`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `tbl_kunjungan_ibfk_2` FOREIGN KEY (`id_dokter`) REFERENCES `tbl_dokter` (`id_dokter`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `tbl_kunjungan_ibfk_3` FOREIGN KEY (`id_obat`) REFERENCES `tbl_obat` (`id_obat`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `tbl_pembayaran`
--
ALTER TABLE `tbl_pembayaran`
  ADD CONSTRAINT `tbl_pembayaran_ibfk_1` FOREIGN KEY (`id_kunjungan`) REFERENCES `tbl_kunjungan` (`id_kunjungan`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `tbl_pembayaran_ibfk_3` FOREIGN KEY (`id_pasien`) REFERENCES `tbl_pasien` (`id_pasien`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `tbl_resep`
--
ALTER TABLE `tbl_resep`
  ADD CONSTRAINT `tbl_resep_ibfk_1` FOREIGN KEY (`id_obat`) REFERENCES `tbl_obat` (`id_obat`),
  ADD CONSTRAINT `tbl_resep_ibfk_2` FOREIGN KEY (`id_kunjungan`) REFERENCES `tbl_kunjungan` (`id_kunjungan`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

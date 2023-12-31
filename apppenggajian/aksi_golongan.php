<?php

session_start();
include "koneksi.php";

if (!isset($_SESSION['login'])) {
    header('location:login.php');
}

//jika ada get act
if (isset($_GET['act'])) {

    // act insert
    if ($_GET['act'] == 'insert') {
        //proses menyimpan data
        //menyimpan kiriman form ke variabel
        $kode       = $_POST['kodegolongan'];
        $nama       = $_POST['namagolongan'];
        $tunjsi     = $_POST['tunjangansi'];
        $tunjanak   = $_POST['tunjangananak'];
        $uangmakan  = $_POST['uangmakan'];
        $uanglembur = $_POST['uanglembur'];
        $askes      = $_POST['askes'];

        if ($kode == '' || $nama == '' || $tunjsi == '' || $tunjanak == '' || $uangmakan == '' || $uanglembur == '' || $askes == '') {
            header('location:data_golongan.php?view=tambah&e=bl');
        } else {
            //proses query simpan data
            $simpan = mysqli_query($konek, "INSERT INTO golongan(
                kode_golongan, nama_golongan, tunjangan_suami_istri, tunjangan_anak,) VALUES ('$kode','$nama',
                '$gapok','$tunj')");

            if ($simpan) {
                header('location:data_jabatan.php?e=sukses');
            } else {
                header('location:data_jabatan.php?e=gagal');
            }
        }
    }
    //jika act update
    elseif ($_GET['act'] == 'update') {
        //menyimpan kiriman form ke variabel
        $kode = $_POST['kodejabatan'];
        $nama = $_POST['namajabatan'];
        $gapok = $_POST['gapok'];
        $tunj = $_POST['tunjanganjabatan'];

        if ($kode == '' || $nama == '' || $gapok == '' || $tunj == '') {
            header('location:data_jabatan.php?view=tambah&e=b1');
        } else {
            //proses query update data
            $update = mysqli_query($konek, "UPDATE jabatan SET nama_jabatan='$nama', 
            gapok='$gapok',tunjangan_jabatan='$tunj' WHERE kode_jabatan='$kode'");

            if ($update) {
                header('location:data_jabatan.php?e=sukses');
            } else {
                header('location:data_jabatan.php?e=gagal');
            }
        }
    } elseif ($_GET['act'] == 'delete') { //jika act =delete
        $hapus = mysqli_query($konek, "DELETE FROM jabatan WHERE kodejabatan='$_GET[id]'");

        if ($hapus) {
            header('location:data_jabatan.php?e=sukses');
        } else {
            header('location:data_jabatan.php?e=gagal');
        }
    }
}

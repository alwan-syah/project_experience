<?php include "header.php"; ?>
<div class="container">
    <?php
    $view = isset($_GET['view']) ? $_GET['view'] : null;

    switch ($view) {
        default:
    ?>
            <!-- menampilkan pesan -->
            <?php
            if (isset($_GET['e']) && $_GET['e'] == 'sukses') {
            ?>
                <div class="row">
                    <div class="col-md-4 col-md-offset-4">
                        <div class="alert alert-success alert-dissmissible" role="alert">
                            <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                            <strong>Selamat!</strong> Proses Berhasil.
                        </div>
                    </div>
                </div>

            <?php
            } elseif (isset($_GET['e']) && $_GET['e'] == 'gagal') {
            ?>
                <div class="row">
                    <div class="col-md-4 col-md-offset-4">
                        <div class="alert alert-danger alert-dissmissible" role="alert">
                            <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                            <strong>Error!</strong> Proses gagal dilakukan.
                        </div>
                    </div>
                </div>

            <?php
            }
            ?>
            <div class="row">
                <div class="panel panel-primary">
                    <div class="panel-heading">
                        <h3 class="panel-title">
                            Data Golongan
                        </h3>
                    </div>
                    <div class="panel-body">
                        <a href="data_golongan.php?view=tambah" style="margin-bottom: 15px;" class="btn btn-primary">Tambah Data</a>
                        <table class="table table-bordered table-striped">
                            <tr>
                                <th>No</th>
                                <th>Kode</th>
                                <th>Nama Golongan</th>
                                <th>Tunjangan S/I</th>
                                <th>Tunjangan Anak</th>
                                <th>Uang Makan</th>
                                <th>UangLembur</th>
                                <th>Askes</th>
                                <th>Aksi</th>
                            </tr>
                            <?php
                            $sql = mysqli_query($konek, "SELECT * FROM golongan ORDER BY kode_golongan ASC");
                            $no = 1;

                            while ($d = mysqli_fetch_array($sql)) {
                                echo "<tr>
                                <td width='40px' align-'center'>$no</td>
                                <td>$d[kode_golongan]</td>
                                <td>$d[nama_golongan]</td>
                                <td>$d[tunjangan_suami_istri]</td>
                                <td>$d[tunjangan_anak]</td>
                                <td>$d[uang_makan]</td>
                                <td>$d[uang_lembur]</td>
                                <td>$d[askes]</td>
                                <td width='160px' align='center'>
                                <a class='btn btn-warning btn-sm' 
                                href='data_golongan.php?view=edit&id=$d[kode_golongan]'>Edit</a>
                                <a class='btn btn-danger btn-sm' 
                                href='aksi_golongan.php?view=delete&id=$d[kode_golongan]'>Hapus</a>
                                </td>
                                </tr>";
                                $no++;
                            }
                            ?>
                        </table>
                    </div>
                </div>
            </div>
        <?php

            break;
        case "tambah";
            //membuat kode golongan otomatis
            $simbol = "G";
            $query = mysqli_query($konek, "SELECT max(kode_golongan) AS last FROM golongan WHERE kode_golongan LIKE '$simbol%'");
            $data = mysqli_fetch_array($query);

            $kodeterakhir = $data['last'];
            $nomorterakhir = (int)substr($kodeterakhir, 1, 2);
            $nextNomor = $nomorterakhir + 1;
            $nextKode = $simbol . sprintf('%02s', $nextNomor);

        ?>
            <?php
            if (isset($_GET['e']) && $_GET['e'] == 'bl') {
            ?>
                <div class="row">
                    <div class="col-md-8 col-md-offset-2">
                        <div class="alert alert-warning alert-dissmissible" role="alert">
                            <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                            <strong>Peringatan</strong> Form anda belum lengkap, silahkan dilengkapi!.
                        </div>
                    </div>
                </div>

            <?php
            }
            ?>

            <div class="row">
                <div class="panel panel-primary">
                    <div class="panel-heading">
                        <h3 class="panel-title">
                            Tambah Data Golongan
                        </h3>
                    </div>

                    <div class="panel-body">
                        <form method="post" action="aksi_golongan.php?act=insert">
                            <table class="table">
                                <tr>
                                    <td width="160px">Kode Golongan</td>
                                    <td>
                                        <input class="form-control" type="text" name="kodegolongan" value="<?php echo $nextKode; ?>" readonly>
                                    </td>
                                </tr>
                                <tr>
                                    <td>Nama Golongan</td>
                                    <td>
                                        <input class="form-control" type="text" name="namagolongan" required>
                                    </td>
                                </tr>
                                <tr>
                                    <td>Tunjangan S/I</td>
                                    <td>
                                        <input class="form-control" type="number" name="tunjangansi" required>
                                    </td>
                                </tr>
                                <tr>
                                    <td>Tunjangan Anak</td>
                                    <td>
                                        <input class="form-control" type="number" name="tunjangananak" required>
                                    </td>
                                </tr>
                                <tr>
                                    <td>Uang Makan</td>
                                    <td>
                                        <input class="form-control" type="number" name="uangmakan" required>
                                    </td>
                                </tr>
                                <tr>
                                    <td>Uang Lembur</td>
                                    <td>
                                        <input class="form-control" type="number" name="uanglembur" required>
                                    </td>
                                </tr>
                                <tr>
                                    <td>Askes</td>
                                    <td>
                                        <input class="form-control" type="number" name="askes" required>
                                    </td>
                                </tr>
                                <tr>
                                    <td></td>
                                    <td>
                                        <input type="submit" class="btn btn-primary" value="Simpan">
                                        <a class="btn btn-danger" href="data_golongan.php">
                                            Kembali</a>
                                    </td>
                                </tr>
                            </table>
                        </form>
                    </div>
                </div>
            </div>

        <?php
            break;
        case "edit":
            $sqlEdit = mysqli_query($konek, "SELECT * FROM jabatan WHERE kode_jabatan='$_GET[id]'");
            $e = mysqli_fetch_array($sqlEdit);
        ?>

            <div class="row">
                <div class="panel panel-primary">
                    <div class="panel-heading">
                        <h3 class="panel-title">Edit Data Jabatan</h3>
                    </div>
                    <div class="panel-body">
                        <form method="post" action="aksi_jabatan.php?act=update">
                            <table class="table">
                                <tr>
                                    <td width="160">Kode Jabatan</td>
                                    <td>
                                        <input type="text" name="kodejabatan" class="form-control" value="<?php echo $e['kode_jabatan']; ?>" readonly />
                                    </td>
                                </tr>
                                <tr>
                                    <td>Nama Jabatan</td>
                                    <td>
                                        <input type="text" name="namajabatan" class="form-control" value="<?php echo $e['nama_jabatan']; ?>" required />
                                    </td>
                                </tr>
                                <tr>
                                    <td>Gaji Pokok</td>
                                    <td>
                                        <input type="number" name="gapok" class="form-control" value="<?php echo $e['gapok']; ?>" required />
                                    </td>
                                </tr>
                                <tr>
                                    <td>Tunjangan Jabatan</td>
                                    <td>
                                        <input type="number" name="tunjanganjabatan" class="form-control" value="<?php echo $e['tunjangan_jabatan']; ?>" required />
                                    </td>
                                </tr>
                                <tr>
                                    <td></td>
                                    <td>
                                        <input type="submit" value="Update Data" class="btn btn-primary" />
                                        <a href="data_jabatan.php" class="btn btn-danger">Kembali</a>
                                    </td>
                                </tr>
                            </table>
                        </form>
                    </div>
                </div>
            </div>
    <?php
            break;
    }
    ?>
</div>
<?php include "footer.php"; ?>
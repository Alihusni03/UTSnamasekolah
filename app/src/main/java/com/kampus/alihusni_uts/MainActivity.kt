package com.kampus.alihusni_uts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var data: ArrayList<DataModel>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = "sekolah menengah atas di kecamatan brebes"
        //Inisialisasi Array
        data = ArrayList()

        //Simpan data

        data?.add(DataModel(R.drawable.sma1dukuhwaru," SMA NEGRI 1 DUKUHWARU","Jln. Pramuka No. 48 Desa Dukuhwaru, Kecamatan Dukuhwaru, Kabupaten Tegal.",
            "SMA Negeri 1 Dukuhwaru adalah salah satu institusi pendidikan yang berlokasi" +
                    " di Jln. Pramuka No. 48 Desa Dukuhwaru, Kecamatan Dukuhwaru, Kabupaten Tegal. " +
                    "Berdasarkan Surat Kepala Kantor Wilayah Departemen Pendidikan dan " +
                    "Kebudayaan Provinsi Jawa Tengah, Nomor 761/I 03.28/U-1996, Tanggal 5 Juni 1996, " +
                    "tentang pengadaan paket unit gedung baru SMP dan SMA di Kabupaten Tegal untuk" +
                    " tahun anggaran 1996/1997 maka SMA Negeri 1 Dukuhwaru dinyatakan berdiri tanggal 5 Juni 1996."))

        data?.add(DataModel(R.drawable.sma1slawi,"SMA NEGRI 1 SLAWI","JL. KH. WAHID HASYIM NO. 1 - SLAWI ",
            "Sejarah berdirinya SMA Negeri 1 Slawi dilatar belakangai oleh kondisi" +
                    " kemasyarakatan dan kondisi pendidikan saat itu. Dimana tahun 60-an, " +
                    "di Kabupaten Tegal belum ada sekolah lanjutan tingkat atas, sehingga " +
                    "mesyarakat yang ingin besekolah di sekolah lanjutan atas harus keluar " +
                    "Kabupaten Tegal.\n" +
                    "Melihat keadaan yang demikian, para tokoh pendidikan berinisiatif " +
                    "mendirikan Sekolah Mengengah Atas di kota Kecamatan Slawi, dengan " +
                    "membentuk Panitia Pembangunan Gedung Sekolah Lanjutan ( Panitia PGSL ) yang" +
                    " anggotanya terdiri dari unsur : Pendidik, Pemerintah, Pengusaha, ABRI dan " +
                    "Masyarakat, yang diketuai oleh Bapak OEMAR CHASAN ( Patih Kabupaten Tegal ).\n" +
                    "Para perintis berdirinya SMA Negeri 1 Slawi ini sebagian besar sudah meninggalkan " +
                    "kita. Dan yang masih berada di tangan kita adalah : Bapak SAMSURI GANDAKUSUMA, SH.\n" +
                    "Berkat usaha keras Panitia PGSL, pada tanggal : 1 Agustus 1962 berhasil " +
                    "diwujudkan keberadaan Sekolah Menengah Atas ( SMA ).\n"))

        data?.add(DataModel(R.drawable.sma2slawi,"SMA NEGRI 2 SLAWI","Dukuhwringin, Kec. Slawi, Kab. Tegal, Jawa Tengah",
            "SMAN 2 SLAWI adalah salah satu satuan pendidikan dengan jenjang SMA di " +
                    "Dukuhwringin, Kec. Slawi, Kab. Tegal, Jawa Tengah. Dalam menjalankan kegiatannya," +
                    " SMAN 2 SLAWI berada di bawah naungan Kementerian Pendidikan dan Kebudayaan.\n" +
                    "SMAN 2 SLAWI beralamat di JL. RA. Kartini Po Box 22, Dukuhwringin, Kec. Slawi," +
                    " Kab. Tegal, Jawa Tengah, dengan kode pos 52417.\n"))

        data?.add(DataModel(R.drawable.sma3slawi,"SMK NEGRI 3 SLAWI","Kudaile, Kec. Slawi, Kab. Tegal, Jawa Tengah",
            "SMAN 3 SLAWI adalah salah satu satuan pendidikan dengan jenjang SMA di " +
                    "Kudaile, Kec. Slawi, Kab. Tegal, Jawa Tengah. Dalam menjalankan kegiatannya, " +
                    "SMAN 3 SLAWI berada di bawah naungan Kementerian Pendidikan dan Kebudayaan" +
                    " SMAN 3 SLAWI beralamat di JL. PROF. MOH. YAMIN SLAWI, Kudaile, Kec. Slawi," +
                    " Kab. Tegal, Jawa Tengah, dengan kode pos 52413."))

        data?.add(DataModel(R.drawable.smk1slawi,"SMK 1 SLAWI","Jalan Mayjen Sutoyo Kecamatan Slawi, Kabupaten Tegal ",
            "Panitia merumuskan untuk mendirikan SMEA Slawi mengingat di Slawi belum" +
                    " terdapat Sekolah Kejuruan. Dengan bertempat di Desa Preman/Dukuh Wringin" +
                    " Slawi, SMEA membuka 2 kelas dengan jumlah siswa 64 orang guru 10 0rang dan" +
                    " karyawan 2 orang. Karena belum memiliki gedung sekolah sendiri SMEA masih " +
                    "menumpang pada SMA Negeri 1 Slawi. Namun sejak bulan Januari 1967 SMEA pindah" +
                    " di Kagok tepatnya Jalan Mayjen Sutoyo Kecamatan Slawi, Kabupaten Tegal jumlah " +
                    "guru menjadi 10 orang dan karyawan 5 orang. Seiring bertambahnya jumlah guru" +
                    " dan karyawan maka jumlah kelas pun ditambah 5 kelas dengan jumlah siswa 184 " +
                    "orang siswa sebagai kepala SMEA pada saat itu dijabat oleh Bapak Soemardi BA." +
                    " Dan semenjak itu pula status SMEA dinegerikan selama kurun waktu 25 tahun SMEA " +
                    "Negeri Slawi bertempat di Kagok. Namun pada tanggal 1 Juli 1992 SMEA Negeri " +
                    "pindah ke lokasi baru yaitu di Jalan KH Agus Salim Procot Slawi. Lokasi baru " +
                    "ini dibangun berkat bantuan ADB Voced II secara bertahap. Dimulai dari bangunan," +
                    " peralatan praktek, dan perabot dikirim dari Jakarta dan Semarang. Pengiriman " +
                    "terakhir pada bulan januari 1996. Masa jabatan Bapak Soemardi BA. Sebagai " +
                    "kepala SMEA Negeri Slawi sejak berdirinya SMEA sampai dengan 30 April 1994."))

        data?.add(DataModel(R.drawable.smk2slawi,"SMK 2 SLAWI","Kabupaten Tegal ",
            "SMK Negeri 2 Slawi didirikan pada tahun 1969, satu-satunya SMK bidang" +
                    " pertanian yang ada di Kabupaten Tegal, yang terletak tidak jauh dengan " +
                    "pusat kota Slawi, berada di jalur Negara antara Tegal dan Purwokerto. " +
                    "Dikelilingi oleh 4 wilayah Kabupaten/kota yaitu sebelah timur oleh " +
                    "Kabupaten Brebes, sebelah utara oleh Kabupaten Banyumas.\n" +
                    "Atas pertimbangan tersebut diatas, yang didukung oleh pemerintah " +
                    "setempat dan pusat maka didirikan SMK bidang pertanian, dengan " +
                    "harapan dapat memfasilitasi dan terselenggara pendidikan kejuruan " +
                    "pertanian yang dapat mewadahi minat siswa dan orang di wilayah-wilayah " +
                    "tersebut diatas.\n"))

        //Set data to Adapter
        recyclerview.adapter = DataAdapter(data, object : DataAdapter.OnClickListener{
            override fun detail(item: DataModel?) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("gambar", item?.gambar)
                intent.putExtra("nama", item?.nama)
                intent.putExtra("alamat", item?.alamat)
                intent.putExtra("keterangan", item?.keterangan)
                startActivity(intent)
            }

        })


    }
}
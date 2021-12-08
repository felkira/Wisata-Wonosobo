package com.dicoding.wisatawonosobo

import com.dicoding.wisatawonosobo.DestData.destPrice

object DestData {
    private val destNames = arrayOf(
        "Agrowisata Tambi",
        "Air Terjun Sikarim",
        "Arum Jeram Serayu",
        "Batu Pandang Ratapan Angin",
        "Bukit Sidengkeng",
        "Bukit Sikunir",
        "Bukit Siloreng",
        "Curug Drimas",
        "Curug Winong",
        "Gunung Beser",
        "Gunung Lanang",
        "Gunung Prau",
        "Kalianget",
        "Lobang Sewu",
        "Padang Savana Dieng",
        "Puncak Seroja",
        "Telaga Menjer",
        "Telaga Warna")

    private val destPrice = arrayOf(
        "\tLokasi\t\t\t\t:\tTambi, Kejajar\n"+"\tHarga Tiket\t:\tGratis",
        "\tLokasi\t\t\t\t:\tSembungan, Kejajar\n"+"\tHarga Tiket\t:\tRp5000,-",
        "\tLokasi\t\t\t\t:\tRandegan, Sigaluh\n"+"\tHarga Tiket\t:\tRp15000,-",
        "\tLokasi\t\t\t\t:\tSembungan, Kejajar\n"+"\tHarga Tiket\t:\tRp10000,-",
        "\tLokasi\t\t\t\t:\tSembungan, Kejajar\n"+"\tHarga Tiket\t:\tRp3000,-",
        "\tLokasi\t\t\t\t:\tSembungan, Kejajar\n"+"\tHarga Tiket\t:\tRp12000,-",
        "\tLokasi\t\t\t\t:\tSomogede, Wadaslintang\n"+"\tHarga Tiket\t:\tGratis",
        "\tLokasi\t\t\t\t:\tKarangsari, Sapuran\n"+"\tHarga Tiket\t:\tGratis",
        "\tLokasi\t\t\t\t:\tWinongsari, Kaliwiro\n"+"\tHarga Tiket\t:\tRp1000,-",
        "\tLokasi\t\t\t\t:\tLipursari, Leksono\n"+"\tHarga Tiket\t:\tGratis",
        "\tLokasi\t\t\t\t:\tMergolangu, Kalibawang\n"+"\tHarga Tiket\t:\tRp8000,-",
        "\tLokasi\t\t\t\t:\tPranten, Bawang\n"+"\tHarga Tiket\t:\tRp10000,-",
        "\tLokasi\t\t\t\t:\tKalianget, Wonosobo\n"+"\tHarga Tiket\t:\tRp3000,-",
        "\tLokasi\t\t\t\t:\tErorejo, Wadaslintang\n"+"\tHarga Tiket\t:\tRp5000,-",
        "\tLokasi\t\t\t\t:\tDieng Kulon, Batur\n"+"\tHarga Tiket\t:\tRpGratis",
        "\tLokasi\t\t\t\t:\tTlogo, Garung\n"+"\tHarga Tiket\t:\tRp5000,-",
        "\tLokasi\t\t\t\t:\tMaron, Garung\n"+"\tHarga Tiket\t:\tRp3000,-",
        "\tLokasi\t\t\t\t:\tSembungan, Kejajar\n"+"\tHarga Tiket\t:\tRp8000,-")

    private val destDetails = arrayOf(
        "\t\t\tAgrowisata Tambi merupakan salah satu destinasi wisata di Wonosobo yang berupa perkebunan teh terletak pada ketinggian 1.400 meter dari permukaan laut. Sejauh mata memandang kamu akan mendapati panorama hijau yang menyejukkan mata, sesekali ditutupi kabut tipis.\n\n\t\t\tDi tempat ini kamu bisa berjalan-jalan menjelajahi perkebunan teh sembari menyapa penduduk yang sedang memetik teh. Ada juga fasilitas untuk outbond di area perkebunan. Agrowisata Tambi bisa menjadi referensi wisata edukasi yang berwawasan ekologi.",
        "\t\t\tAir Terjun yang terletak di Kecamatan Garung ini menyajikan pesona air terjun alami di tengah udara yang segar. Air terjun setinggi 24 meter yang mengalir di sisi tebing ini memiliki arus air yang deras.\n\n\t\t\tAir yang terpercik dari dentuman air jatuh ke bebatuan akan memberikan sensasi menyegarkan. Air Terjun Sikarim masih belum begitu populer di antara para wisatawan. Namun, justru karena itu Air Terjun Sikarim masih sangat alami dan asri.",
        "\t\t\tBagi kamu penggemar olahraga pemacu adrenalin, Arung Jeram Serayu harus masuk ke dalam daftar destinasi wisata yang wajib dikunjungi. Di tempat ini kamu bisa rafting di jalur sungai yang menantang. Kamu juga bisa menjelajahi sungai sembari menikmati keindahan ekosistem sekitar sungai.\n\n\t\t\tArung Jeram Serayu terletak di daerah Banjarnegara yang memiliki pemandangan alam asri. Jadi, selain menantang adrenalin dengan berarung jeram, kamu sekalian bisa cuci mata dengan panorama hijau yang segar dan menentramkan.",
        "\t\t\tTempat ini sering juga disebut orang sebagai Batu Pandang Dieng. Dari puncak kamu bisa menyaksikan panorama menawan dari Telaga Warna. Selain itu, akan nampak pula deretan pegunungan hijau di kejauhan yang memberikan nuansa damai dan menyejukkan mata.\n\n\t\t\tTempat ini menawarkan spot foto terbaik untuk selfie dan fotografi. Selain itu juga tersedia beberapa wahana seperti jembatan gantung dan flying fox yang menantang nyali. Akses menuju lokasi pun mudah dijangkau dengan kendaraan roda dua atau roda empat.",
        "\t\t\tBukit ini berada di area kawasan wisata Telaga Warna. Lokasi bukit yang strategis akan menampilkan pemandangan menakjubkan berupa panorama Telaga Warna dan Telaga Pengilon. Selain panorama telaga, latar belakang pegunungan dan perbukitan menambah keindahan kawasan ini.\n\n\t\t\tSelain itu, pada kawasan ini terdapat rumah pohon yang dapat digunakan sebagai spot lokasi foto dengan latar belakang berupa pemandangan Telaga Warna. Jika Anda belum puas menjelajah dalam sehari, maka Anda tidak perlu khawatir, karena kawasan ini menyediakan area camping dengan dikelilingi beberapa bunga endemik yang indah.",
        "\t\t\tBukit Sikunir merupakan salah satu tempat terbaik untuk mendapatkan momen golden sunrise atau golden sunset di Wonosobo. Tempat yang berada di Kecamatan Kejajar ini memberikan kamu pengalaman untuk menikmati keindahan panorama ketinggian yang eksotis.\n\n\t\t\tKamu bisa mendapatkan spot foto yang menakjubkan sambil mengagumi deretan pegunungan hijau yang memanjakan mata. Waktu terbaik mengunjungi Bukit Sikunir adalah saat kemarau karena tidak tertutup kabut atau mendung.",
        "\t\t\tIngin mencari panorama yang indah dan spot foto yang instagenic? Mungkin, destinasi wisata ini dapat Anda pertimbangkan. Bukit ini berada pada ketinggian 800 meter. Banyak wisatawan menggunakan tempat ini untuk offroader, baik dengan roda dua atau roda empat.\n\n\t\t\tLokasi ini juga dapat digunakan untuk melihat sunrise. Selain itu, pengunjung dapat mencicipi kuliner tradisional, yaitu sega bucu.",
        "\t\t\tCurug Drimas memiliki tiga lapisan air terjun dengan ketinggian 40 meter, 15 meter, dan 20 meter. Banyak peziarah yang datang untuk mengunjungi beberapa makam Kiai yang berada di sekitarnya. Di dusun sana juga terdapat pentas wayang kulit setiap tahunnya.",
        "\t\t\tCurug Winong menawarkan pengalaman bersenang-senang di air terjun yang segar dan menawan. Curug yang berada di Kecamatan Kaliwiro ini memang terletak di tempat yang tersembunyi dan belum banyak diketahui publik. Namun jangan sampai lewatkan keindahan panoramanya.\n\n\t\t\tCurug Winong mengalir di antara tebing yang berbentuk unik dengan ketinggian mencapai 50m. Suasana di sini masih sangat alami karena belum banyak tersentuh pembangunan. Kamu bisa merasakan basah-basahan di curug ini karena aliran airnya yang deras. Namun pengunjung dilarang mandi karena selain arus deras, tempatnya juga curam dan dalam.",
        "\t\t\tKawasan Gunung Beser di Desa Lipursari dahulu sempat menjadi jalur penting menuju Wonosobo. Saat ini pemerintah setempat berupaya untuk mengelola kawasan tersebut agar bisa menjadi destinasi alam yang menarik.\n\n\t\t\tSelain pemandangan yang indah, puncak Gunung Beser patut untuk dijadikan arena motorcross. Kamu yg suka olahraga menantang, wajib mencobanya ya!",
        "\t\t\tGunung Lanang Mergolangu merupakan salah satu wisata alam yang berada di wilayah Kecamatan Kalibawang, Wonosobo. Tempat yang memiliki ketinggian 600 meter dari permukaan laut ini menyajikan panorama alam ketinggian yang menakjubkan.\n\n\t\t\tKamu bisa merasakan hawa segar dan sejuk di tempat ini. Akses untuk menuju lokasi juga relatif mudah karena jalan sudah beraspal. Namun, untuk bisa menikmati keindahan alam paripurna kamu harus naik ke puncak Gunung Lanang dengan persiapan fisik yang cukup karena lumayan melelahkan.",
        "\t\t\tGunung yang menjadi puncak tertinggi dataran tinggi Dieng ini terkenal akan eksotisme matahari terbit dan terbenam yang sangat menakjubkan. Untuk bisa mendapatkan momen golden sunrise/sunset, kamu perlu mendaki hingga puncak selama dua sampai tiga jam.\n\n\t\t\tDi gunung yang memiliki ketinggian sekitar 2.565 meter dari permukaan laut ini, kamu bisa menikmati keindahan lanskap dataran Dieng yang mempesona. Tempat ini juga menjadi favorit para pendaki karena memiliki jalur pendakian yang tidak terlalu sulit.",
        "\t\t\tBagi kamu yang ingin merasakan sensasi berendam di pemandian air panas, objek wisata satu ini jawabannya. Di Pemandian Air Panas Kalianget kamu bisa bersantai ria di kolam air hangat sembari menikmati pesona alam sekitar.\n\n\t\t\tTempat yang berada di Kecamatan Wonosobo ini sudah memiliki fasilitas yang lumayan lengkap, seperti penginapan, kamar mandi, musholla, dan sebagainya. Akses ke lokasi pun mudah dijangkau dengan kendaraan umum maupun kendaraan pribadi.",
        "\t\t\tLobang Sewu terkenal di kalangan para wisatawan sebagai Grand Canyon lokal ala Wonosobo. Lobang Sewu sendiri merujuk pada bongkahan batu yang berada di tengah permukaan Waduk Wadaslintang.\n\n\t\t\tKamu bisa menyaksikan eksotisme batuan kapur putih yang menawan di Lobang Sewu. Ada banyak spot fotografi yang menarik di berbagi sudut lokasi. Ada juga gasebo untuk bersantai jika kamu lelah berkeliling di kawasan Lobang Sewu.",
        "\t\t\tPadang Savana Dieng menjadi bagian dari wisata Dieng Plateau yang menawarkan keindahan padang ilalang eksotis dan menawan. Meskipun belum banyak wisatawan yang familiar dengan tempat ini, tapi pastikan kamu menjadi saksi keindahan panorama savana yang menawan.\n\n\t\t\tUntuk bisa sampai ke padang savana, kamu harus melakukan pendakian. Sepanjang jalur tracking kamu akan dimanjakan dengan lanskap alami yang menakjubkan. Saat musim kemarau tiba, tempat ini akan memberikan nuansa padang rumput Afrika dengan udara yang tetap sejuk.",
        "\t\t\tBukit Seroja menawarkan keindahan Telaga Menjer yang bisa kamu nikmati dari atas ketinggian. Meskipun perlu mendaki untuk sampai ke tempat ini, namun lelahmu akan terbayar dengan pemandangan alam menakjubkan.\n\n\t\t\tDi tempat ini kamu juga bisa menyaksikan perkebunan teh yang terhampar hijau sejauh mata memandang. Kamu juga bisa bersantai di gazebo dan surau yang disediakan.",
        "\t\t\tTelaga yang memiliki luas sekitar 70 hektar ini menjadi telaga paling luas di Dieng. Telaga ini tersohor di antara para pelancong karena panorama alamnya yang memikat. Telaga Menjer memiliki air berlimpah yang bisa kamu eksplorasi dengan menyewa perahu penduduk.\n\n\t\t\tDi tempat ini juga terdapat berbagai fasilitas untuk outbond dan olahraga. Kamu juga bisa mencicipi kuliner yang dijual di warung dan kedai. Keindahan Telaga Menjer paling pas dinikmati saat golden sunrise/sunset.",
        "\t\t\tTelaga Warna bisa dikatakan sebagai destinasi wisata paling wajib dikunjungi jika kamu mampir ke Wonosobo. Wisata alam yang menjadi ikon Wonosobo ini menyajikan panorama danau yang bisa berubah warna, kadang bisa berwarna kuning, hijau, bahkan berubah warna pelangi.\n\n\t\t\tTelaga yang berada di Kecamatan Kejajar ini bisa diakses dengan kendaraan umum atau pribadi. Telaga Warna bisa menjadi destinasi utama bagi kamu yang ingin menikmati eksotisme alam untuk relaksasi dan menenangkan diri. Keindahannya dijamin tidak akan bisa kamu lupakan.")

    private val destImages = intArrayOf(
        R.drawable.agrowisata_tambi,
        R.drawable.air_terjun_sikarim,
        R.drawable.arum_jeram_serayu,
        R.drawable.batu_pandang_ratapan_angin,
        R.drawable.bukit_sidengkeng,
        R.drawable.bukit_sikunir,
        R.drawable.bukit_siloreng,
        R.drawable.curug_drimas,
        R.drawable.curug_winong,
        R.drawable.gunung_beser,
        R.drawable.gunung_lanang,
        R.drawable.gunung_prau,
        R.drawable.kalianget,
        R.drawable.lobang_sewu,
        R.drawable.padang_savana_dieng,
        R.drawable.puncak_seroja,
        R.drawable.telaga_menjer,
        R.drawable.telaga_warna)

    val listData: ArrayList<Dest>
        get() {
            val list = arrayListOf<Dest>()
            for (position in destNames.indices) {
                val dest = Dest()
                dest.name = destNames[position]
                dest.detail = destDetails[position]
                dest.photo = destImages[position]
                dest.price = destPrice[position]
                list.add(dest)
            }
            return list
        }
}
package com.ananta.ieco

object DestinationsData {
    private val destinationNames = arrayOf(
        "Tangkahan",
        "Taman Nasional Tanjung Puting",
        "Taman Nasional Komodo",
        "Taman Nasional Way Kambas",
        "Raja Ampat",
        "Kawah Ijen",
        "Taman Nasional Gunung Leuser",
        "Pulau Nusa Penida",
        "Taman Nasional Bunaken",
        "Desa Wisate Tembi",
    )

//    private val destinationCity = arrayOf(
//        "Sumatera Utara",
//        "Kalimantan Tengah",
//        "Nusa Tenggara Timur",
//        "Papua Barat",
//        "Jawa Timur",
//        "Aceh",
//        "Bali",
//        "Sulawesi Utara",
//        "Daerah Istimewa Yogyakarta",
//    )

    private val destinationDetails = arrayOf(
        "Kawasan konservasi alam yang sering disebut surga tersembunyi di Sumatera Utara. Destinasi ini memang tergolong kurang populer di Indonesia, akan tetapi bagi wisatawan asing, ekowisata Tangkahan tergolong sangat populer. Selain gajah liar, Tangkahan juga menawarkan pemandangan hutan yang masih alami, urada segar, serta sungai dengan air yang sangat jernih. Jika anda yang suka trekking, river tubing, berkemah, atau mungkin memandikan gajah, destinasi ini sangatlah disarankan untuk dikunjungi!",
        "Taman Nasional Tanjung Puting secara keseluruhan memiliki luas sekitar 415 hektare atau hampir sama luasnya dengan Pulau Bali. Di taman nasional ini ada beberapa tipe ekosistem, mulai dari hutan hujan tropis, dataran rendah, hutan tanah kering, hutan rawa air tawar, hutan bakau, hutan pantai, dan hutan sekunder. Menarik sekali bukan?",
        "Taman Nasional Komodo merupakan destinasi ekowisata yang sangat populer dikalangan masyarakat Indonesia maupun Mancanegara. Taman nasional ini berada di Nusa Tenggara Timur. Sebenarnya, taman nasional ini terdiri dari tiga pulau besar, yakni Pulau Komodo, Pulau Rinca, dan Pulau Padar. Selain menjadi habitat untuk komodo, Taman Nasional Komodo juga menjadi rumah bagi ratusan spesies hewan darat lain. Sebut saja diantaranya adalah ular, kadal, tikus Rinca, kuda, kerbau, babi hutan, kelelawar buah, rusa Timor, dan lebih dari 40 spesies burung. Kemudian, daya tarik Taman Nasional Komodo juga bukan hanya di darat, pemandangan bawah lautnya pun tak kalah menakjubkan. Destinasi ini sangat direkomendasikan untuk dimasukkan kedalam list liburan kalian!",
        "Taman Nasional Way Kambas ini berada di Lampung. Di sini, Anda akan melihat langsung beberapa hewan yang keberadaannya hampir punah sekaligus yang dilindungi, di antaranya adalah harimau sumatera dan badak sumatera. Tidak hanya itu, Taman Nasional Kambas juga biasanya mengadakan pertunjukkan gajah yang bisa kalian tonton!",
        "Raja Ampat yang sering-sering disebut \"Surga Dunia\" ini berada di Papua Barat. Keindahan yang sempurna berupa laut dengan air yang biru, pemandangan bawah air yang sangat indah, dan lanskap perbukitan yang menantang, semua bisa Anda saksikan secara langsung di sinu. Anda bisa duduk santai sambil menatap keindahan alam yang disuguhkan atua bisa menyelam untuk melihat ankea biota laut yang tidak bisa ditemukan di tempat lain.",
        "Kawah Ijen berada di Jawa Timur. Di sini, Anda akan menyaksikan secara langsung fenomena langka yang disebut api biru. Fenomena api biru atau yang sering disebut blue fire ini merupakan fenomena langka yang hanya ada dua di dunia, yaitu di Indonesia dan Islandia. Api biru tersebut tercipta dari gas sulfur yang terbakar saat terpapar udara dari luar. Fenomena api biru semakin menakjubkan dengan semburan merah-jingga pemandangan matahari terbit.",
        "Taman Nasional Gunung Leuser berada di Aceh. Destinasi ekowisata ini bisa dibilang merupakan destinasi all-in-one. Anda dapat melihat pantai, gunung, danau, sungai, dan bahkan sumber air panas. Tidak hanya itu, taman nasional ini juga merupakan rumah bagi flora dan fauna langka, antara lain kucing hutan, siamang, harimau sumatera, badak sumatera, kambing hutan, dan masih banyak lagi! Kegiatan utama yang paling banyak dilakukan wisatawan di taman nasional ini adalah menaklukan Gunung Leuser dengan mendaki. Pendakian gunung ini biasanya akan memakan waktu sekitar 10-14 hari perjalanan. Untuk Anda yang suka mendaki, destinasi ini merupakan destinasi yang sangat cocok untuk Anda kunjungi!",
        "Pulau Nusa Penida, Pulau ini berada di Bali. Pulau kecil ini memiliki daya tarik yang luar biasa berupa pantai pasir putih yang eksotis seperti di Pantai Atuh Nusa Penida, dan pemandangan yang menakjubkan dari atas tebing di bagian selatan Pulau Nusa Penida yang menghadap ke Samudra Hindia. Beberapa desitasi paling populer ynag biasa dikunjungi untuk menyaksikan pemandangan Samudra Hindia adalah Banah Cliff, Bukit Pantai Kelingking Nusa Penida, dan Saren Cliff.",
        "Taman Nasional Bunaken, Sulawesi Utara. Ada banyak sekali terumbu karang yang indah serta puluhan jenis ikan menghuni taman nasional yang terletak di Sulawesi Utara ini. Tak heran, banyak wisatawan yang menyebut Taman Nasional Bunaken sebagai salah satu taman laut paling indah di dunia. Jika anda sangat suka menyelam, Taman Nasional Bunaken merupakan destinasi yang wajib kaliang kunjungi.",
        "Desa Wisata Tembi, Yogyakarta. Di sini, Anda dapat menghirup udara segar, menikmati pemandangan hijau area sawah, dan merasakan secara langsung kearifan budaya lokal. Semakin seru karena Anda bisa berkeliling desa dengan mengendarai andong, becak, kereta mini, atau sepeda ontel. Untuk Anda yang ingin menambah pengalaman bercocok tanam, ada paket wisata khusus, lho! Satu lagi, Desa Wisata Tembi juga punya Museum Rumah Budaya Tembi sebagai daya tarik lainnya. Di museum ini, Anda bisa menemukan berbagai benda pusaka Jawa seperti keris, gamelan, dan masih banyak lagi!",
    )

    private val destinationImages = intArrayOf(
        R.drawable.dummy,
        R.drawable.tanjung_puting,
        R.drawable.taman_nasional_komodo,
        R.drawable.taman_nasional_way,
        R.drawable.raja_ampat,
        R.drawable.kawah_ijen,
        R.drawable.taman_nasional_gunung_leuseur,
        R.drawable.pulau_nusa_penida,
        R.drawable.taman_nasional_bunaken,
        R.drawable.desa_wisata_tembi,
    )

    val listData: ArrayList<Destination>
        get() {
            val list = arrayListOf<Destination>()
            for (position in destinationNames.indices) {
                val destination = Destination()
                destination.name = destinationNames[position]
                destination.detail = destinationDetails[position]
                destination.photo = destinationImages[position]
                list.add(destination)
            }

            return list
        }
}
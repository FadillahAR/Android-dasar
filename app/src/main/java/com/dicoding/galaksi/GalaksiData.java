package com.dicoding.galaksi;
import java.util.ArrayList;

    class GalaksiData {
        private static String[] galaksiNames = {
                "Galaksi Bimasakti",
                "Galaksi Magellan",
                "Galaksi Ursa Mayor",
                "Galaksi Black Eye",
                "Galaksi Andromeda",
                "Galaksi Pusaran Air",
                "Galaksi Roda Biru",
                "Galaksi Sombrero",
                "Galaksi Dolar Perak",
                "Galaksi Centaurus"
        };

        private static String[] galaksiDetails = {
                "Galaksi Bimasakti merupakan galaksi yang ditemukan pada 18 juli 1783. Galaksi ini merupakan galaksi besar yang ditempati oleh manusia saat ini, dimana bumi terdapat didalamnya. Galaksi Bimasakti terdiri dari 400 milyar bintang lebih dengan garis tengah sekitar 130 ribu tahun cahaya.",

                "Galaksi Magellan sering disebut sebagai nama Awan magellan. Dimana awan ini terbagi menjadi dua jenis yaitu Awan magellan Kecil serta besar. Awan ini sesungguhnya adalah dwarf galaksi yang mengorbit pada galaksi Bimasakti. Ukuran mereka adalah 14 ribu tahun cahaya serta 7 ribu tahun cahaya. Jarak antara Awan magellan besar dan juga kecil adalah 160 ribu.",

                "Galaksi Ursa Mayor memiliki nama unik, dimana galaksi ini memiliki jarak hingga 10 juta tahun cahaya dan galaksi ini biasanya sering dikenal dengan nama galaksi beruang besar.",

                "Galaksi Black Eye merupakan salah satu galaksi yang cukup populer, sama halnya dengan galaksi Bimasakti dan lainnya. Galaksi ini ditemukan oleh astronom Prancis yang bernama Charles Messier. Ia menemukan ada yang aneh dalam galaksi ini, yaitu memiliki cincin kabut dan berwarna gelap. Cincin kabut tersebut mengelilingi intinya yang cukup terang. Messier melihat galaksi ini seperti sebuah mata sehingga disebut Black Eye.",

                "Galaksi Andromeda merupakan galaksi yang populer selain Bimasakti. Galaksi andromeda merupakan galaksi besar dengan diameter hampir 200 ribu tahun cahaya, yang berarti memiliki diameter dua kali lipat dibandingkan Galaksi Bimasakti. andromeda sendiri memiliki massa 300 hingga 400 biliun kali masa matahari.",

                "Galaksi Pusaran Air atau biasa disebut messier 51a. Galaksi Pusaran Air merupakan satu galaksi yang paling mudah ditemukan oleh para astronom amatir dan dua galaksi tersebut bahkan bisa anda lihat menggunakan binokular. Galaksi Pusaran memang menjadi target populer para astronom profesional agar bisa dipelajari struktur dan juga memahami lengan spiral yang dihasilkan oleh galaksi atau tata surya ini.",

                "Galaksi Roda Biru memang memiliki nama yang sama dengan bentuk dan warna galaksinya. Galaksi Roda Biru memang tidak terlalu populer, biasa disebut Blue Pin Wheel, galaksi ini memiliki jarak 2 tahun cahaya dengan Galaksi Bimasakti.",

                "Galaksi Sombrero merupakan galaksi yang cukup membingungkan. Dinamakan Sombrero karena galaksi ini berbentuk topi Sombrero milik orang-orang latin. Galaksi ini memiliki bentuk yang spiral, dan juga galaksi yang ada di bagian rasi bintang Virgo. Galaksi ini memang tampak seperti Sombrero namun bukan dalam arti sebenarnya, tetapi jika dilihat dari bumi saja.",

                "Galaksi Dolar Perak atau biasa disebut sebagai Galaxy Silver Coin merupakan galaksi yang berbentuk spiral dengan letak 13 juta tahun cahaya. Galaksi ini terdapat di konstelasi Sculptor yakni Galaksi Starburst yang berarti bahwa saat ini mengalami periode intens pembentukan bintang.",

                "Galaksi Centaurus merupakan galaksi yang biasa dikenal sebagai nama NGC. Galaksi lenticular ini memiliki jarak sekitar 11 juta tahun cahaya. Ini adalah salah satu radio galaksi yang berada dekat dengan Bumi, sehingga inti galaksi aktif telah banyak dipelajari oleh astronom dan peneliti profesional."
        };

        private static int[] galaksiImages = {
                R.drawable.bimasakti,
                R.drawable.magellan,
                R.drawable.ursa_mayor,
                R.drawable.black_eye,
                R.drawable.andromeda,
                R.drawable.pusaran_air,
                R.drawable.roda_biru,
                R.drawable.sombrero,
                R.drawable.dolar_perak,
                R.drawable.centaurus
        };

        static ArrayList<Galaksi> getListData() {
            ArrayList<Galaksi> list = new ArrayList<>();
            for (int position = 0; position < galaksiNames.length; position++) {
                Galaksi galaksi = new Galaksi();
                galaksi.setName(galaksiNames[position]);
                galaksi.setDetail(galaksiDetails[position]);
                galaksi.setPhoto(galaksiImages[position]);
                list.add(galaksi);
            }
            return list;
        }
    }


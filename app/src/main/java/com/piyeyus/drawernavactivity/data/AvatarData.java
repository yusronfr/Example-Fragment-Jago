package com.piyeyus.drawernavactivity.data;

import com.piyeyus.drawernavactivity.R;

import java.util.ArrayList;


public class AvatarData {
    private static String[] avatarNames = {
        "Sambal Goreng Kentang Ati",
        "Ayam Rica Rica Manado",
        "Rendang Sapi Presto",
        "Sate Kambing Guling",
        "Sambal Udang Tempe",
        "Pizza Teflon",
        "Martabak Manis",
        "Perkedel Kentang",
        "Lumpia Isi sayur",
        "Sate Taichan"
};

    private static String[] avatarDetails = {
            "5 butir kentang ukuran sedang\n" +
                    "2 buah ati ampela\n" +
                    "10 buah cabe merah\n" +
                    "5 buah cabe rawit merah\n" +
                    "1 sdt ketumbar\n" +
                    "1/2 sdt merica\n" +
                    "2 butir kemiri\n" +
                    "5 siung bawang putih\n" +
                    "4 siung bawang merah\n" +
                    "1 buah tomat\n" +
                    "1 bungkus santan kara\n" +
                    "Secukupnya garam\n" +
                    "Secukupnya salam sereh\n" +
                    "Secukupnya kaldu/micin\n" +
                    "Secukupnya gula merah\n" +
                    "Secukupnya minyak goreng",
            "1 kg ayam,potong kecil kecil\n" +
                    "Bumbu daun:\n" +
                    "2 batang Daun bawang\n" +
                    "1 genggam Daun kemangi\n" +
                    "1/2 lembar Daun kunyit muda\n" +
                    "4 lembar Daun jeruk muda\n" +
                    "1 lembar Daun pandan\n" +
                    "3 lbr daun salam muda\n" +
                    "3 batang Serai geprek\n" +
                    "Bumbu ulek kasar/copper:\n" +
                    "10 siung bawang merah\n" +
                    "10 siung bawang putih\n" +
                    "50 cabe rawit\n" +
                    "Bumbu halus:\n" +
                    "5 cm Jahe\n" +
                    "7 cm Laos muda\n" +
                    "5 cm Kunyit\n" +
                    "Bumbu iris:\n" +
                    "3 siung Bawang merah",
            "450 gr daging sapi sengkel presto 1/2 matang\n" +
                    "10 gr cabe kering\n" +
                    "10 siung bawang merah\n" +
                    "3 siung bawang putih\n" +
                    "3 iris lengkuas\n" +
                    "2 btg serai\n" +
                    "11/4 inch jahe\n" +
                    "2 biji kelapa parut\n" +
                    "3 sm minyak\n" +
                    "2,5 cm kayu manis\n" +
                    "3 biji kapulaga\n" +
                    "3 lbr daun jeruk buang tulang belakang daun (supaya tidak pahit)\n" +
                    "1 st bubuk kari\n" +
                    "2 ptg asam kandis\n" +
                    "1/2 sm gula\n" +
                    "secukupnya Garam",
            "1/2 kg daging kambing\n" +
                    "1/2 bulatan nenas di blender\n" +
                    "1/2 buah lemon\n" +
                    "3 sdm sauce tiram\n" +
                    "secukupnya garam\n" +
                    "2 sdm margarin\n" +
                    "secukupnya bawang bombay dan paprica",
            "1/2 kg Udang\n" +
                    "1/2 papan Tempe\n" +
                    "secukupnya Garam\n" +
                    "Minyak goreng\n" +
                    "secukupnya Gula\n" +
                    "Bumbu halus\n" +
                    "13 bh Cabe keriting\n" +
                    "5 bh Bawang Merah\n" +
                    "3 siung Bawang Putih\n" +
                    "1/2 bh Tomat",
            "1 sdm gulpas\n" +
                    "1 sdm ragi isntan\n" +
                    "2 sdm minyak goreny\n" +
                    "1 gelas air hangat kuku\n" +
                    "Bahan adonan\n" +
                    "1 sdm garam\n" +
                    "2 gelas tp terigu\n" +
                    "Bahan topping\n" +
                    "250 gr baso (karena sosis pas habis)\n" +
                    "2 buah wortel (jagung pas habis)\n" +
                    "6 siung bawang putih\n" +
                    "6 siung bawang merah\n" +
                    "Minyak secukupnya untuk menumis\n" +
                    "secukupnya Garam\n" +
                    "Kaldu ayam\n" +
                    "Lada bubuk\n" +
                    "Saos (tomat or cabe optional)\n" +
                    "Mayonaise\n" +
                    "Keju parmesan (lebih bagus pakai keju melted atau mozzarella)",
            "250 gram tepung terigu\n" +
                    "100 ml susu kental manis\n" +
                    "1 butir telur\n" +
                    "1/2 sdt garam\n" +
                    "1/2 sdt baking powder\n" +
                    "± 300 ml air\n" +
                    "1/2 sdt baking soda\n" +
                    "Topping :\n" +
                    "Mentega\n" +
                    "Gula pasir\n" +
                    "Meises\n" +
                    "Keju parut\n" +
                    "sesuai selera",
            "5 buah kentang\n" +
                    "200 gram daging cincang\n" +
                    "3 siung bawang putih\n" +
                    "2 batang daun bawang\n" +
                    "secukupnya Garam\n" +
                    "secukupnya Lada\n" +
                    "1 butir telur\n" +
                    "2 sdm terigu",
            "1 buah wortel\n" +
                    "10 buah buncis\n" +
                    "1 bungkus kecil bihun\n" +
                    "1 butir telur\n" +
                    "2 siung bawang putih\n" +
                    "3 sdm saus tiram\n" +
                    "1 sdm soy sauce\n" +
                    "secukupnya Garam\n" +
                    "secukupnya Lada\n" +
                    "Kulit lumpia",
            "500 gram dada ayam fillet\n" +
                    "Bumbu Halus\n" +
                    "1/2 buah bawang bombay\n" +
                    "3 siung bawang merah\n" +
                    "5 siung bawang putih\n" +
                    "secukupnya Garam\n" +
                    "1 sdt Kaldu ayam bubuk secukupnya\n" +
                    "1/2 sdm lada putih halus\n" +
                    "1 sdt Ketumbar bubuk\n" +
                    "Sambal Taichan\n" +
                    "2 buah cabe rawit setan\n" +
                    "3 buah cabe merah besar\n" +
                    "2 buah bawang putih\n" +
                    "Tambahan untuk penyajian\n" +
                    "1 buah jeruk nipis"
    };

    private static int[] avatarImages = {
            R.drawable.sambal_goreng,
            R.drawable.ayamrica,
            R.drawable.rendangsapi,
            R.drawable.satekambing,
            R.drawable.sambaludang,
            R.drawable.pizza,
            R.drawable.martabak,
            R.drawable.perkedel,
            R.drawable.lumpia,
            R.drawable.taichan
    };

    public static ArrayList<Avatar> getListData() {
        ArrayList<Avatar> list = new ArrayList<>();
        for (int position = 0; position < avatarNames.length; position++) {
            Avatar avatar = new Avatar();
            avatar.setName(avatarNames[position]);
            avatar.setDetail(avatarDetails[position]);
            avatar.setPhoto(avatarImages[position]);
            list.add(avatar);
        }
        return  list;
    }
}
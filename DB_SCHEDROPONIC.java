package com.bilcode.schedroponic_2;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Djati on 05/30/18.
 */



public class DB_SCHEDROPONIC extends SQLiteOpenHelper {
    final static String DB_NAME = "db_systemGrow";
    final static String DB_NAME2 = "db_seedPlant";
    final static String DB_NAME3 = "db_pestDiase";
    final static String DB_NAME4 = "db_field";

    DB_SCHEDROPONIC(Context context) {
        super(context, DB_NAME, null, 1);
        // TODO Auto-generated constructor stub
    }


    @Override
    public void onCreate(SQLiteDatabase db) {


//INI ADALAH DATABASE SYSTEM GROW
        String sql_systemGrow = "CREATE TABLE IF NOT EXISTS NavSystemGrow(_id INTEGER PRIMARY KEY AUTOINCREMENT, nama TEXT, def TEXT, imgscheme BLOB, tool TEXT, material TEXT, commodity TEXT, advantage TEXT, disadvantage TEXT, img BLOB)";
        db.execSQL(sql_systemGrow);

        ContentValues valuesSG = new ContentValues();
        valuesSG.put("_id", "1");
        valuesSG.put("nama", "Wick System");
        valuesSG.put("def", "Sistem sumbu ini merupakan metode hidroponik yang paling sederhana. Sistem ini bisa menggunakan bahan-bahan daur ulang seperti botol atau gelas bekas minuman kemasan sebagai wadah untuk nutrisi. Tanaman mendapatkan nutrisi yang diserap melalui sumbu atau kain flanel. Sistemnya seperti kompor minyak tanah. Sistem ini juga seringkali digunakan oleh guru di kelas sebagai bahan eksperimen untuk murid. Tujuannya yaitu untuk menjelaskan bagaimana tumbuhan bertumbuh dan berkembang, sekaligus membuat murid tertarik pada hidroponik. Sumbunya merupakan bagian penting dari sistem ini, karena tanpa penyerab cairan yang baik, tanaman tidak akan mendapatkan kelembaban dan nutrisi yang dibutuhkan. Sumbu yang baik, selain sebagai penyerap cairan yang baik, juga tidak mudah rusak akibat pembusukan. Sistem ini dapat disebut juga sistem sub-irigasi tetes.\n");
        valuesSG.put("imgscheme", R.drawable.png_wicksystem);
        valuesSG.put("tool","Pot atas, Pot bawah (sebagai penampung air), sumbu atau perantara\n");
        valuesSG.put("material", "Rockwool, serat kelapa arangsekam, perlite, vermikulit\n");
        valuesSG.put("commodity", "Sawi, selada, tanaman hias seperti anggretk dan bromeliad.\n");
        valuesSG.put("advantage", "Mudah dirakit dan murah meriah karena dapat memanfaatkan barang bekas seperti botol air mineral. Bisa diaplikasikan tanpa tenaga listrik.\n");
        valuesSG.put("disadvantage", "Pertumbuhan tanaman lama tergantung nutrisi yang diserap oleh akar. Tidak cocok untuk tujuan produksi tanaman sayuran atau buah kormesial.\n");
        valuesSG.put("img", R.drawable.iv_wicksystem);
        db.insert("NavSystemGrow", "_id", valuesSG);

        valuesSG.put("_id", "2");
        valuesSG.put("nama", "NFT ");
        valuesSG.put("def", "Nutrient Film Technique, pada sistem ini nutrisi dipompa ke tanaman melalui aliran air yang tipis, sehingga akar tumbuhan bersentuhan dengan lapisan tipis nutrisi yang mengalir. Ketinggian lapisan air bisa diatur satu sampai dua sentimeter. Keuntungan dari sistem ini, ketika aliran listrik terputus maka cairan nutrisi masih tersisa di dalam sistem. Konstruksi sistem dibuat bertingkat sehingga cairan nutrisi di pompa melalui pipa paling atas kemudian mengalir sampai pipa paling bawah, dan langsung ke wadah penampungan cairan pupuk. Sistem ini banyak disukai karena akar tanaman menyerap lebih banyak oksigen dari udara dibandingkan yang diserap dari larutan nutrisi. Hal ini disebabkan karena hanya ujung akar saja yang bersentuhan dengan larutan nutrisi sehingga tumbuhan mendapatkan lebih banyak oksigen dan hal ini menyebabkan tumbuhan lebih cepat tumbuh dan berkembang.");
        valuesSG.put("imgscheme", R.drawable.png_nft);
        valuesSG.put("tool","Talang air, stirofoam, pompa, rockwool, pipa polivinil klrida, tangki penampung larutan, airstone (pilihan), greenhouse(pilihan).\n");
        valuesSG.put("material", "Rockwool.\n" );
        valuesSG.put("commodity", "Caisim, lettuce, selada, pakcoi, bayam, kangkung.\n");
        valuesSG.put("advantage", "Teknik NFT memudahkan pengendalian pertumbuhan akar tanaman. Kebutuhan air terpenuhi dengan baik, keseragaman nutrisi dan tingkat konsentrasi larutan nutrisi yang dibutuhkan oleh tanaman dapat disesuaikan dengan umur dan jenis tanaman, serta tanaman dapat diusahakan beberapa kali dengan periode tanam yang pendek. Jika menggunakan Greenhouse maka teknik ini dapat meminimalisir serangan hama dan penyakit. Selain itu, dapat melindungi tanaman dari intensitas hujan yang berlebihan.\n");
        valuesSG.put("disadvantage", "Investasi dan biaya perawatan yang mahal, sangat tergantung listrik, penularan penakit ke tanaman lain sangat cepat, pengamatan hama dan penyakit harus dilakukan secara intensif terutama ketika musim hujan.\n");
        valuesSG.put("img", R.drawable.iv_nft);
        db.insert("NavSystemGrow", "_id", valuesSG);

        valuesSG.put("_id", "3");
        valuesSG.put("nama", "EBB & Flow");
        valuesSG.put("def", "Sistem ini disebut juga sistem pasang surut. Pada sistem ini, larutan nutrisi diberikan dengan cara menggenangi wilayah perakaran pada waktu yang ditentukan. Setelah cukup maka larutan nutrisi dialirkan kembali ke wadah penampungan pupuk. Larutan nutrisi akan mengisi/membanjiri sistem sampai mencapai ketinggian dari overflow yang telah disiapkan, sehingga merendam akar tanaman. Tabung overflow harus diatur sekitar 2 inch di bawah permukaan atas media tumbuh.\n");
        valuesSG.put("imgscheme", R.drawable.png_ebb_flow);
        valuesSG.put("tool", "Pot individu, bak penampungan larutan, media tanam padat, pompa, airstone.\n");
        valuesSG.put("material", "Arang sekam, perlite, vermikulit, kerikil.\n" );
        valuesSG.put("commodity", "Pembibitan sayuran daun, bunga pot seperti krisan.\n");
        valuesSG.put("advantage", "Tanaman mendapat air tanpa menggenang.\n");
        valuesSG.put("disadvantage", "Tanaman rentan terkena penyakit busuk akar. Akar tanaman yang tumbuh menggumpal dalam pot individual kerap menangkap genangan larutan nutrisi. Oleh karena itu, kepekatan nutrisi harus sering dicek karena kerap tercampur media padat.\n");
        valuesSG.put("img", R.drawable.iv_ebbflow);
        db.insert("NavSystemGrow", "_id", valuesSG);

        valuesSG.put("_id", "4");
        valuesSG.put("nama", "Drip System");
        valuesSG.put("def", "Sistem ini menggunakan sistem irigasi tetes (drip irrigation system)  untuk mengalirkan nutrisi ke wilayah perakaran melalui selang irigasi dengan menggunakan dripper yang diatur waktunya dengan timer. Media tanam sistem ini yaitu batu apung, sekam bakar, zeolit, atau cocopeat (sabut kelapa), yang berfungsi sebagai tempat akar berkembang dan memperkokoh kedudukan tanaman. Nutrisi hidroponik disimpan di wadah.\n" +
                "Pompa yang disiapkan di dalam wadah akan memompa nutrisi melalui selang irigasi sesuai jadwal yang telah diatur. Cairan nutrisi yang tidak terserap dialirkan kembali melalui drainase yang diletakkan di bagian bawah depan dari setiap pot tanaman. Cairan ini akan kembali ke wadah penampung pupuk. Pengatur waktu bisa diatur untuk 15 menit setiap satu jam.\n");
        valuesSG.put("imgscheme", R.drawable.png_dripsystemm);
        valuesSG.put("tool", "Pompa atau sumber air bertekanan, katup pengatur tekanan, jalur utama nutrisi, pot, media tanam, selang fleksibel seperti sphagetti cube (mengarah ke masing-masing tanaman), stik pengatur atau emiter nutrisi (ujung selang pengatur tetesan), penjepit selang nutrisi (penyaring nutrisi untuk mencegah penyumbatan partikel kecil).\n");
        valuesSG.put("material", "Batu apung, Arang sekam, zeolit, atau cocopeat (sabut kelapa), serbuk gergaji kayu.\n" );
        valuesSG.put("commodity", "Tomat, cabai, paprika, melon, jagung, tebu.\n");
        valuesSG.put("advantage", "Tanaman mendapat pasokan air dan nutrisi secara berkala. Lebih menghemat air dan nutrisi karena diberikan sedikit demi sedikit. Jatah nutrisi seragam untuk semua tanaman (dalam kondisi peralatan normal).\n");
        valuesSG.put("disadvantage", "Oksigen di area perakaran sedikit jika media terlalu padat. Selain itu, nutrisi dan air menjadi banyak \"hilang\" tertahan media atau menguap. Namun dapat diatasi dengan pemilihan media tanam yang tepat seperti arang sekam murni atau dikombinasikan dengan serbuk sabut kelapa. Pengontrolan aliran air dan nutrisi pada selang dan sphagetti cube harus dilakukan secara intensif. Bila tekanan terlalu tinggi, emiter bisa terlempar sehingga tetesan menjadi lebih besar dan banyak. Pengecekan emiter perlu dilakukan setiap hari untuk efisiensi nutrisi.\n");
        valuesSG.put("img", R.drawable.iv_dripsystem);
        db.insert("NavSystemGrow", "_id", valuesSG);

        valuesSG.put("_id", "5");
        valuesSG.put("nama", "Deep Water Culture");
        valuesSG.put("def", "Deep water culture disebut juga sebagai floating raft system (sistem rakit apung) atau metode reservoir. Metode ini sangat sederhana karena akar direndam dalam larutan nutrisi. Pada sistem ini sebaiknya menggunakan pompa udara untuk akuarium untuk memberikan oksigen pada larutan nutrisi. Perlu diingat bahwa pada sistem ini sebaiknya wadahnya tertutup agar pencegah penetrasi sinar matahari ke dalam sistem, sehingga mencegah pertumbuhan alga. Dalam skala besar, wadah nutrisi dibuat dalam bentuk reservoir yang besar, dan tumbuhan diapungkan menggunakan bahan yang mengapung. Sistem ini sangat disukai oleh pemula pelaku hidroponik karena lebih mudah untuk ditangani. Walaupun demikian, para pelaku hidroponik komersialpun menggunakan sistem ini dalam skala besar. Tipe ini dianggap sangat murah dan mudah dibuat. Meskipun konsepnya mudah, dibutuhkan pula kreativitas untuk membuat dan menggunakan sistem ini dari berbagai bahan. \n");
        valuesSG.put("imgscheme", R.drawable.png_deepwaterculturee);
        valuesSG.put("tool", "Stirofoam, wadah penampung larutan, rockwool, pompa, airstone.\n");
        valuesSG.put("material", "Kapas atau rockwool sebagai penahan.\n" );
        valuesSG.put("commodity", "Kangkung, caisim, selada, kentang.\n");
        valuesSG.put("advantage", "Keuntungan utama menggunakan sistem ini yaitu tidak dibutuhkan pompa untuk memompa nutrisi kecuali untuk aerasi. Penggunaan pompa untuk nutrisi bisa menyebabkan penyumbatan pada pompa tersebut apabila menggunakan nutrisi organik. Kemudian tanaman mendapat air dan nutrisi terus menerus. Listrik dapat dimatikan selama kandungan oksigen cukup, sehingga tanaman dapat bertahan lebih lama.\n");
        valuesSG.put("disadvantage", "Kondisi jenuh air dapat membuat tanaman kekurangan oksigen. Untuk mengatasi kendala tersebut, dapat diatasi dengan pemakaian airstone untuk menghasilkan gelembung udara kaya oksigen.\n");
        valuesSG.put("img", R.drawable.iv_deepwaterculture);
        db.insert("NavSystemGrow", "_id", valuesSG);

        valuesSG.put("_id", "6");
        valuesSG.put("nama", "Aeroponic");
        valuesSG.put("def", "Pada sistem ini, tanaman ditumbukan pada udara yang lembab tanpa menggunakan tanah atau medium agregat (geoponik). Kata aeroponik berasal dari bahasa Yunani yaitu aero (udara) dan ponos (daya). Sistem aeroponik berbeda dengan hidroonik konvensional. Pada sistem ini, larutan nutrisi sebagai medium tumbuh dan mengandung mineral-mineral penting untuk pertumbuhan tanaman disemprotkan secara berkala pada akar tanaman. Karena air tetap digunakan untuk mentransmisikan nutrien, maka sistem ini juga dianggap sebagai salah satu tipe hidroponik. Penyemprotan dilakukan menggunakan pompa bertekanan tinggi sehingga menghasilkan butiran-butiran air yang sangat halus melalui sprinkler.\n");
        valuesSG.put("imgscheme", R.drawable.png_aeroponicc);
        valuesSG.put("tool", "Stirofoam, pompa, nozzle, pipa polivinil klorida, wadah larutan nutrisi.\n");
        valuesSG.put("material", "Rockwool atau kapas.\n" );
        valuesSG.put("commodity", "Caisim, selada, sawi, pakcoi, bayam.\n");
        valuesSG.put("advantage", "Tanaman mendapat pasokan air, oksigen, dan nutrisi secara berkala. Lebih menghemat air dan nutrisi. Tanaman lebih mudah menyerap nutrisi karena berukuran molekul kecil.\n");
        valuesSG.put("disadvantage", "Investasi mahal dan sangat tergantung listrik. Nozzle tempat larutan menyemburkan kabut kerap macet karena tersangkut butrian-butiran pupuk yang kurang tercampur dengan baik.\n");
        valuesSG.put("img", R.drawable.iv_aeroponik);
        db.insert("NavSystemGrow", "_id", valuesSG);

        valuesSG.put("_id", "7");
        valuesSG.put("nama", "Aquaponic");
        valuesSG.put("def", "Ada yang menganggap bahwa sistem ini bukan termasuk ke dalam sistem hidroponik, karena tidak menggunakan pupuk dengan nutrisi yang seimbang. Aquaponik menggunakan nutrisi dari air kolam ikan yang sudah mengandung nutrisi yang secara alamiah terbentuk dari sisa kotoran ikan dan pakan ikan yang larut di dalam air. Sistem ini serupa dengan sistem rakit apung ataupun NFT, tetapi sumber nutrisinya berbeda.\n");
        valuesSG.put("imgscheme", R.drawable.png_aquaponicc);
        valuesSG.put("tool", "Talang air, stirofoam, pompa, rockwool, pipa polivinil klrida, kolam ikan, airstone (pilihan).\n");
        valuesSG.put("material", "Rockwool.\n" );
        valuesSG.put("commodity", "Caisim, lettuce, selada, pakcoi, bayam, kangkung.\n");
        valuesSG.put("advantage", "Dapat menghasilkan dua produk sekaligus dalam satu kali proses produksi. Lebih menghemat air serta lahan, dan produk pertanian yang dihasilkan berupa organik.\n");
        valuesSG.put("disadvantage", "Biaya pembuatan sistem lebih mahal, karena banyaknya peralatan yang perlu dibeli. Kemudian dibutuhkan keahlian khusus serta perwatan ekstra agar pertumbuhan ikan dan tanaman sama-sama baik.\n");
        valuesSG.put("img", R.drawable.iv_aquaponik);
        db.insert("NavSystemGrow", "_id", valuesSG);



//INI ADALAH DATABASE SEED AND PLANT
        String sql_seedPlant = "CREATE TABLE IF NOT EXISTS NavSeedPlant(_id INTEGER PRIMARY KEY AUTOINCREMENT, nama TEXT, def TEXT, character TEXT, nutrition TEXT, ageplant TEXT, ageharvest TEXT, readyharvest TEXT, img BLOB)";
        db.execSQL(sql_seedPlant);

        ContentValues valuesSP = new ContentValues();
        valuesSP.put("_id", "1");
        valuesSP.put("nama", "Selada");
        valuesSP.put("def", "Selada adalah jenis sayuran yang paling cocok ditanam dengan sistem hidroponik. Sebab dengan sistem ini Selada dapat tumbuh subur. \n");
        valuesSP.put("character","Selada adalah tanaman daerah beriklim tropis maupun sedang. Dibudidayakan dalam suhu relatif rendah, karena yang dimanfaatkan adalah daunnya, maka suhu yang relatif rendah mencegah pertumbuhan mangarah ke generatif. Suhu tinggi akan memicu pertumbuhan bunga. sedangkan suhu ekstrim dingin memicu pertumbuhan lambat dan merusak daun terluar.  Sejatinya pertumbuhan selada dewasa mencapai 65-130 hari setelah tanam. Namun jika dipanen hingga setua itu akan membuat rasa selada menjadi pahit. Itu sebabnya panen dilakukan ketika tanaman masih relatif muda. Pembiaran tanaman hingga dewasa hanya dilakukan untuk tujuan mendapatkan benih.\n");
        valuesSP.put("nutrition", "pH 6,0-7,0. Suhu 20 Celcius. Ppm 560-840\n");
        valuesSP.put("ageplant", "65-130 hari.\n");
        valuesSP.put("ageharvest", "30-40 hari daei pembenihan\n");
        valuesSP.put("readyharvest", "Daun dewasa hijau cerah, lebar, bergelombang.\n");
        valuesSP.put("img", R.drawable.iv_sp_selada);
        db.insert("NavSeedPlant", "_id", valuesSP);

        valuesSP.put("_id", "2");
        valuesSP.put("nama", "Sawi");
        valuesSP.put("def", "Menanam sawi dengan sistem hidropnik tidak begitu menyita waktu dan juga tidak perlu memerlukan perawatan yang rumit.\n");
        valuesSP.put("character","Sawi hijau (Brassica rapa var. parachinensis L) merupakan jenis sayuran yang cukup populer. Dikenal pula sebagai caisim, caisin, atau sawi bakso, sayuran ini mudah dibudidayakan dan dapat dimakan segar (biasanya dilayukan dengan air panas) atau diolah menjadi asinan. Jenis sayuran ini mudah tumbuh di dataran rendah maupun dataran tinggi. Bila ditanam pada suhu sejuk tumbuhan ini akan cepat berbunga. Karena biasanya dipanen seluruh bagian tubuhnya (kecuali akarnya), dan sifat ini kurang disukai.\n");
        valuesSP.put("nutrition", "pH 5,5-6,5. Suhu 20 Celcius. Ppm 1050-1400\n");
        valuesSP.put("ageplant", "gatau.\n");
        valuesSP.put("ageharvest", "22-30 hari dari pembenihan.\n");
        valuesSP.put("readyharvest", "Daun sawi dewasa berbentuk seperti sendok, oval melebar, tangkai daun hjau cerah, sosok relatif pendek.\n");
        valuesSP.put("img", R.drawable.iv_sp_sawi);
        db.insert("NavSeedPlant", "_id", valuesSP);

        valuesSP.put("_id", "3");
        valuesSP.put("nama", "Bayam");
        valuesSP.put("def", "Bayam merupakan tanaman yang cocok ditanam dengan sistem hidroponik. Dengan menggunakan sistem maka tidak begitu melakukan perawatan ekstra. Akan tetapi cukup diberi nutrisi secara berkala.\n");
        valuesSP.put("character","Bayam adalah salah satu tanaman sayuran yang dapat di budidayakan di dataran rendah dan dataran tinggi.\n");
        valuesSP.put("nutrition", "pH 6,0-7,0. Suhu 20 Celcius. Ppm 1260-1610\n");
        valuesSP.put("ageplant", "gatau.\n");
        valuesSP.put("ageharvest", "25-30 hari dari pembenihan.\n");
        valuesSP.put("readyharvest", "Daun dewasa merekah sempurna, panjang daun dewasa 10-15 cm tergantung jenis.\n");
        valuesSP.put("img", R.drawable.iv_sp_bayam);
        db.insert("NavSeedPlant", "_id", valuesSP);

        valuesSP.put("_id", "4");
        valuesSP.put("nama", "Kangkung");
        valuesSP.put("def", "Kangkung merupakan jenis sayuran yang sangat cocok ditanam dengan sistem hidroponik. Ditambah lagi menanam kangkung dengan hidropnik tidak perlu mengeluarkan biaya yang mahal. Hanya diperlukan ketelatenan dan kesabaran agar memperoleh hasil yang baik.\n");
        valuesSP.put("character","Kankung terdiri dari 2 jenis yakni, kangkung darat dan kangkung air. Namun jenis yang ditanam secara hidroponik yakni kangkung darat. Pada kondisi tertutup atau kekurangan sinar matahari, kangkung tumbuh lancir memanjang. Ia lebih menyukai tempat penanaman yang terbuka  tetapi tidak terlalu terik. Cuaca terlalu panas membuat batang dan daunnya agak keras sehingga kurang enak untuk dikonsumsi.\n");
        valuesSP.put("nutrition", "pH 5,5-6,5. Suhu 20 Celcius. Ppm 1050-1400\n");
        valuesSP.put("ageplant", "gatau\n");
        valuesSP.put("ageharvest", "20-25 hari dari pembenihan.\n");
        valuesSP.put("readyharvest", "Daun dewasa hijau tua, melebar terbuka bentuk segituiga.\n");
        valuesSP.put("img", R.drawable.iv_sp_kangkung);
        db.insert("NavSeedPlant", "_id", valuesSP);




//INI ADALAH DATABASE PEST AND DIASE
        String sql_pestDiase = "CREATE TABLE IF NOT EXISTS NavPestDiase(_id INTEGER PRIMARY KEY AUTOINCREMENT, nama TEXT, def TEXT, img BLOB)";
        db.execSQL(sql_pestDiase);

        ContentValues valuesPD = new ContentValues();
        valuesPD.put("_id", "1");
        valuesPD.put("nama", "Ulat");
        valuesPD.put("def", "Cara memberantas jenis hama ini dengan cara menyemprot daun dengan menggunakan obat pemberantas hama jenis ulat (banyak di jual di toko pertanian), atau bisa juga dengan membuang daun yang sudah rusak yang di sebabkan oleh hama ulat. Untuk hama jenis ini dapat merusak pada malam dan siang hari, dapat di lakukan penyemprotan rutin 1 minggu sekali.\n");
        valuesPD.put("img", R.drawable.iv_pd_ulat);
        db.insert("NavPestDiase", "_id", valuesPD);

        valuesPD.put("_id", "2");
        valuesPD.put("nama", "Serangga");
        valuesPD.put("def", "Jika daun sudah terlanjur terserang oleh hama jenis ini lebih baik kita buang/hilangkan daun tersebut, untuk pencegahan daun terserang serangga dapat di lakukan penyemprotan rutin dengan menggunakan obat pemberantas hama.\n");
        valuesPD.put("img", R.drawable.iv_pd_serangga);
        db.insert("NavPestDiase", "_id", valuesPD);

        valuesPD.put("_id", "3");
        valuesPD.put("nama", "Kutu");
        valuesPD.put("def", "Sistem ini disebut juga sistem pasang surut. Pada sistem ini, larutan nutrisi diberikan dengan cara menggenangi wilayah perakaran pada waktu yang ditentukan. Setelah cukup maka larutan nutrisi dialirkan kembali ke wadah penampungan pupuk. Larutan nutrisi akan mengisi/membanjiri sistem sampai mencapai ketinggian dari overflow yang telah disiapkan, sehingga merendam akar tanaman. Tabung overflow harus diatur sekitar 2 inch di bawah permukaan atas media tumbuh.\n");
        valuesPD.put("img", R.drawable.iv_pd_kutu);
        db.insert("NavPestDiase", "_id", valuesPD);

        valuesPD.put("_id", "4");
        valuesPD.put("nama", "Jamur");
        valuesPD.put("def", "Cara mencegah atau memberantas penyakit jamur pada tanaman dengan cara mengganti media tanam dengan yang baru, singkirkan tanaman yang sudah terlanjur terkena jamur hingga rusak, lakukan penyemprotan secara rutin menggunakan obat semprot jamur.\n");
        valuesPD.put("img", R.drawable.iv_pd_jamur);
        db.insert("NavPestDiase", "_id", valuesPD);






//INI ADALAH DATABASE FIELD LAHAN
        String sql_field = "CREATE TABLE IF NOT EXISTS Field(_id INTEGER PRIMARY KEY AUTOINCREMENT, nama TEXT, step1 TEXT, step2 TEXT, step3 TEXT, img BLOB, img1 BLOB, img2 BLOB, img3 BLOB)";
        db.execSQL(sql_field);

        ContentValues valuesF = new ContentValues();
        valuesF.put("_id", "1");
        valuesF.put("nama", "Bayam");
        valuesF.put("step1", "Siapkan rockwool dengan ukuran 5cm x 5cm. Siapkan Benih bayam, pastikan Benih bayam telah direndam semalaman penuh. Dan siapkan wadah lebar guna menaruh rockwool dan benih.");
        valuesF.put("step2", "Taruh benih yang telah direndam seharian penuh diatas rockwool, masing-masing rockwool berisi 1 benih bayam. Kemudian letakkan rockwool yg telah diisi benih ke dalam wadah lebar yang telah berisi air setinggi 2 cm. ");
        valuesF.put("step3", "Tutup wadah bisa dengan koran, kemudian letakkan di tempat gelap selama 3 hari. DIamkan hingga benih muncul tunas.");
//        valuesF.put("time1", "600000\n");
//        valuesF.put("time2", "600000\n");
//        valuesF.put("time3", "600000\n");
        valuesF.put("img", R.drawable.iv_sp_bayam);
        valuesF.put("img1", R.drawable.iv_sp_bayam);
        valuesF.put("img2", R.drawable.iv_sp_bayam);
        valuesF.put("img3", R.drawable.iv_sp_bayam);
        db.insert("Field", "_id", valuesF);

        valuesF.put("_id", "2");
        valuesF.put("nama", "Kangkung");
        valuesF.put("step1", "Siapkan rockwool dengan ukuran 5cm x 5cm. Siapkan Benih bayam, pastikan Benih bayam telah direndam semalaman penuh. Dan siapkan wadah lebar guna menaruh rockwool dan benih.");
        valuesF.put("step2", "Taruh benih yang telah direndam seharian penuh diatas rockwool, masing-masing rockwool berisi 1 benih bayam. Kemudian letakkan rockwool yg telah diisi benih ke dalam wadah lebar yang telah berisi air setinggi 2 cm. ");
        valuesF.put("step3", "Tutup wadah bisa dengan koran, kemudian letakkan di tempat gelap selama 3 hari. DIamkan hingga benih muncul tunas.");
//        valuesF.put("time1", "600000\n");
//        valuesF.put("time2", "600000\n");
//        valuesF.put("time3", "600000\n");
        valuesF.put("img", R.drawable.iv_sp_kangkung);
        valuesF.put("img1", R.drawable.iv_sp_kangkung);
        valuesF.put("img2", R.drawable.iv_sp_kangkung);
        valuesF.put("img3", R.drawable.iv_sp_kangkung);
        db.insert("Field", "_id", valuesF);

        valuesF.put("_id", "3");
        valuesF.put("nama", "Sawi");
        valuesF.put("step1", "Siapkan rockwool dengan ukuran 5cm x 5cm. Siapkan Benih bayam, pastikan Benih bayam telah direndam semalaman penuh. Dan siapkan wadah lebar guna menaruh rockwool dan benih.");
        valuesF.put("step2", "Taruh benih yang telah direndam seharian penuh diatas rockwool, masing-masing rockwool berisi 1 benih bayam. Kemudian letakkan rockwool yg telah diisi benih ke dalam wadah lebar yang telah berisi air setinggi 2 cm. ");
        valuesF.put("step3", "Tutup wadah bisa dengan koran, kemudian letakkan di tempat gelap selama 3 hari. DIamkan hingga benih muncul tunas.");
//        valuesF.put("time1", "600000\n");
//        valuesF.put("time2", "600000\n");
//        valuesF.put("time3", "600000\n");
        valuesF.put("img", R.drawable.iv_sp_sawi);
        valuesF.put("img1", R.drawable.iv_sp_sawi);
        valuesF.put("img2", R.drawable.iv_sp_sawi);
        valuesF.put("img3", R.drawable.iv_sp_sawi);
        db.insert("Field", "_id", valuesF);

        valuesF.put("_id", "4");
        valuesF.put("nama", "Selada");
        valuesF.put("step1", "Siapkan rockwool dengan ukuran 5cm x 5cm. Siapkan Benih bayam, pastikan Benih bayam telah direndam semalaman penuh. Dan siapkan wadah lebar guna menaruh rockwool dan benih.");
        valuesF.put("step2", "Taruh benih yang telah direndam seharian penuh diatas rockwool, masing-masing rockwool berisi 1 benih bayam. Kemudian letakkan rockwool yg telah diisi benih ke dalam wadah lebar yang telah berisi air setinggi 2 cm. ");
        valuesF.put("step3", "Tutup wadah bisa dengan koran, kemudian letakkan di tempat gelap selama 3 hari. DIamkan hingga benih muncul tunas.");
//        valuesF.put("time1", "600000\n");
//        valuesF.put("time2", "600000\n");
//        valuesF.put("time3", "600000\n");
        valuesF.put("img", R.drawable.iv_sp_selada);
        valuesF.put("img1", R.drawable.iv_sp_selada);
        valuesF.put("img2", R.drawable.iv_sp_selada);
        valuesF.put("img3", R.drawable.iv_sp_selada);
        db.insert("Field", "_id", valuesF);


    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS NavSystemGrow");
        db.execSQL("DROP TABLE IF EXISTS NavSeedPlant");
        db.execSQL("DROP TABLE IF EXISTS NavPestDiase");
        db.execSQL("DROP TABLE IF EXISTS Field");
        onCreate(db);

    }


}
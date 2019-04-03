package hello;

public class Greeting {

    private final long id;
    private final String content;
    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
    public String getData(){
        //
        String jsondata= "[" +
"	{" +
"		\"id\" : 1," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy s10+ plus 512 gb\"," +
"		\"name\" : \"samsung galaxy s10+ plus 512 gb\"," +
"		\"price\" : 8499," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-s10-plus-512gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 2," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy s10+ plus (sm-g975f)\"," +
"		\"name\" : \"samsung galaxy s10+ plus (sm-g975f)\"," +
"		\"price\" : 6529," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-s10-plus.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 3," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy s10 (sm-g973f)\"," +
"		\"name\" : \"samsung galaxy s10 (sm-g973f)\"," +
"		\"price\" : 5499," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-s10.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 4," +
"		\"brand\" : \"huawei\"," +
"		\"model\" : \"mate 20 pro (lya-l09)\"," +
"		\"name\" : \"huawei mate 20 pro (lya-l09)\"," +
"		\"price\" : 5769," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/huawei-mate-20-pro.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 5," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy s10e (sm-g970f)\"," +
"		\"name\" : \"samsung galaxy s10e (sm-g970f)\"," +
"		\"price\" : 4454.8," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-s10e.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 6," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy note 9 tek hat / 512 gb (sm-n960f)\"," +
"		\"name\" : \"samsung galaxy note 9 tek hat / 512 gb (sm-n960f)\"," +
"		\"price\" : 6434," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-note-9-512gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 7," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy note 9 (sm-n960f)\"," +
"		\"name\" : \"samsung galaxy note 9 (sm-n960f)\"," +
"		\"price\" : 5389," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-note9.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 8," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy s9+ (plus) 256 gb\"," +
"		\"name\" : \"samsung galaxy s9+ (plus) 256 gb\"," +
"		\"price\" : 5199," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-s9-plus-256gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 9," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy s9+ (plus) 128 gb\"," +
"		\"name\" : \"samsung galaxy s9+ (plus) 128 gb\"," +
"		\"price\" : 4650," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-s9-plus-128gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 10," +
"		\"brand\" : \"apple\"," +
"		\"model\" : \"iphone xs max 512 gb (mt582tu/a, mt572tu/a, mt562tu/a)\"," +
"		\"name\" : \"apple iphone xs max 512 gb (mt582tu/a, mt572tu/a, mt562tu/a)\"," +
"		\"price\" : 12886.1," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/apple-iphone-xs-max-512gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 11," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy s9+ (plus) (sm-g965f)\"," +
"		\"name\" : \"samsung galaxy s9+ (plus) (sm-g965f)\"," +
"		\"price\" : 4183.9," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-s9-plus.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 12," +
"		\"brand\" : \"apple\"," +
"		\"model\" : \"iphone xs max 256 gb (mt532tu/a, mt542tu/a, mt552tu/a)\"," +
"		\"name\" : \"apple iphone xs max 256 gb (mt532tu/a, mt542tu/a, mt552tu/a)\"," +
"		\"price\" : 11195," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/apple-iphone-xs-max-256gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 13," +
"		\"brand\" : \"huawei\"," +
"		\"model\" : \"mate 20 (hma-l29)\"," +
"		\"name\" : \"huawei mate 20 (hma-l29)\"," +
"		\"price\" : 5249," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/huawei-mate-20.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 14," +
"		\"brand\" : \"apple\"," +
"		\"model\" : \"iphone xs max (mt512tu/a, mt522tu/a, mt502tu/a)\"," +
"		\"name\" : \"apple iphone xs max (mt512tu/a, mt522tu/a, mt502tu/a)\"," +
"		\"price\" : 9584.9," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/apple-iphone-xs-max.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 15," +
"		\"brand\" : \"lg\"," +
"		\"model\" : \"g7 thinq (g710)\"," +
"		\"name\" : \"lg g7 thinq (g710)\"," +
"		\"price\" : 2959," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/lg-g7-thinq.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 16," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy s9 (sm-g960f)\"," +
"		\"name\" : \"samsung galaxy s9 (sm-g960f)\"," +
"		\"price\" : 3734," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-s9.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 17," +
"		\"brand\" : \"huawei\"," +
"		\"model\" : \"p20 pro (clt-l09)\"," +
"		\"name\" : \"huawei p20 pro (clt-l09)\"," +
"		\"price\" : 4599," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/huawei-p20-pro.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 18," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy note 8 (sm-n950f)\"," +
"		\"name\" : \"samsung galaxy note 8 (sm-n950f)\"," +
"		\"price\" : 4490," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-note-8.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 19," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"pocophone f1 128 gb\"," +
"		\"name\" : \"xiaomi pocophone f1 128 gb\"," +
"		\"price\" : 3500," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-pocophone-f1-128gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 20," +
"		\"brand\" : \"oneplus\"," +
"		\"model\" : \"6 128 gb / 8 gb\"," +
"		\"name\" : \"oneplus 6 128 gb / 8 gb\"," +
"		\"price\" : 3939," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/oneplus-6-128gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 21," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"pocophone f1\"," +
"		\"name\" : \"xiaomi pocophone f1\"," +
"		\"price\" : 2879," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/pocophone-f1.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 22," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"mi mix 3\"," +
"		\"name\" : \"xiaomi mi mix 3\"," +
"		\"price\" : 4279.9," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-mi-mix-3.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 23," +
"		\"brand\" : \"asus\"," +
"		\"model\" : \"zenfone 5z (zs620kl)\"," +
"		\"name\" : \"asus zenfone 5z (zs620kl)\"," +
"		\"price\" : 3295," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/asus-zenfone-5z.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 24," +
"		\"brand\" : \"huawei\"," +
"		\"model\" : \"mate 10 pro tek hat / 128 gb (bla-l09)\"," +
"		\"name\" : \"huawei mate 10 pro tek hat / 128 gb (bla-l09)\"," +
"		\"price\" : 4260," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/huawei-mate-10-pro.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 25," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy s8+ plus tek hat (sm-g955f)\"," +
"		\"name\" : \"samsung galaxy s8+ plus tek hat (sm-g955f)\"," +
"		\"price\" : 3349.9," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-s8-plus.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 26," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"mi 8 pro\"," +
"		\"name\" : \"xiaomi mi 8 pro\"," +
"		\"price\" : 3879," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-mi-8-pro.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 27," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"mi 8 128 gb\"," +
"		\"name\" : \"xiaomi mi 8 128 gb\"," +
"		\"price\" : 3200," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-mi-8-128gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 28," +
"		\"brand\" : \"oneplus\"," +
"		\"model\" : \"6 64 gb / 6 gb\"," +
"		\"name\" : \"oneplus 6 64 gb / 6 gb\"," +
"		\"price\" : 3499," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/oneplus-6.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 29," +
"		\"brand\" : \"sony\"," +
"		\"model\" : \"xperia xz premium (g8141)\"," +
"		\"name\" : \"sony xperia xz premium (g8141)\"," +
"		\"price\" : 3499," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/sony-xperia-xz-premium.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 30," +
"		\"brand\" : \"apple\"," +
"		\"model\" : \"iphone xs 64 gb (mt9e2tu/a, mt9g2tu/a, mt9f2tu/a)\"," +
"		\"name\" : \"apple iphone xs 64 gb (mt9e2tu/a, mt9g2tu/a, mt9f2tu/a)\"," +
"		\"price\" : 8780," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/apple-iphone-xs.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 31," +
"		\"brand\" : \"lg\"," +
"		\"model\" : \"v30+ plus tek hat / 128 gb\"," +
"		\"name\" : \"lg v30+ plus tek hat / 128 gb\"," +
"		\"price\" : 2689," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/lg-v30-plus.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 32," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"mi mıx 2s 6 gb / 128 gb\"," +
"		\"name\" : \"xiaomi mi mıx 2s 6 gb / 128 gb\"," +
"		\"price\" : 3499," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-mi-mix-2s-128gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 33," +
"		\"brand\" : \"apple\"," +
"		\"model\" : \"iphone xr 256 gb (mryj2tu/a, mryq2tu/a, mryp2tu/a, mryn2tu/a, mrym2tu/a, mryl2tu/a)\"," +
"		\"name\" : \"apple iphone xr 256 gb (mryj2tu/a, mryq2tu/a, mryp2tu/a, mryn2tu/a, mrym2tu/a, mryl2tu/a)\"," +
"		\"price\" : 7499," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/apple-iphone-xr-256gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 34," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"mi 8 64 gb\"," +
"		\"name\" : \"xiaomi mi 8 64 gb\"," +
"		\"price\" : 3119," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-mi-8.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 35," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"mi mıx 2s\"," +
"		\"name\" : \"xiaomi mi mıx 2s\"," +
"		\"price\" : 2999.9," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-mi-mix-2s.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 36," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy s8 (sm-g950f)\"," +
"		\"name\" : \"samsung galaxy s8 (sm-g950f)\"," +
"		\"price\" : 3129," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-s8.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 37," +
"		\"brand\" : \"apple\"," +
"		\"model\" : \"iphone xr 128 gb (mryd2tu/a, mryh2tu/a, mryg2tu/a, mryf2tu/a, mrye2tu/a, mry92tu/a)\"," +
"		\"name\" : \"apple iphone xr 128 gb (mryd2tu/a, mryh2tu/a, mryg2tu/a, mryf2tu/a, mrye2tu/a, mry92tu/a)\"," +
"		\"price\" : 6749," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/apple-iphone-xr-128gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 38," +
"		\"brand\" : \"meizu\"," +
"		\"model\" : \"16th 8 gb / 128 gb\"," +
"		\"name\" : \"meizu 16th 8 gb / 128 gb\"," +
"		\"price\" : 3700," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/meizu-16-th-128gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 39," +
"		\"brand\" : \"apple\"," +
"		\"model\" : \"iphone xr (mry42tu/a, mrya2tu/a, mry82tu/a, mry72tu/a, mry62tu/a, mry52tu/a)\"," +
"		\"name\" : \"apple iphone xr (mry42tu/a, mrya2tu/a, mry82tu/a, mry72tu/a, mry62tu/a, mry52tu/a)\"," +
"		\"price\" : 6359," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/apple-iphone-xr.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 40," +
"		\"brand\" : \"huawei\"," +
"		\"model\" : \"p20 (eml-l09)\"," +
"		\"name\" : \"huawei p20 (eml-l09)\"," +
"		\"price\" : 3799," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/huawei-p20.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 41," +
"		\"brand\" : \"meizu\"," +
"		\"model\" : \"16th\"," +
"		\"name\" : \"meizu 16th\"," +
"		\"price\" : 2894," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/meizu-16-th.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 42," +
"		\"brand\" : \"oppo\"," +
"		\"model\" : \"rx17 pro\"," +
"		\"name\" : \"oppo rx17 pro\"," +
"		\"price\" : 4994," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/oppo-rx17-pro.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 43," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"mi 6 128 gb / 6 gb\"," +
"		\"name\" : \"xiaomi mi 6 128 gb / 6 gb\"," +
"		\"price\" : 2599," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-mi-6-128gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 44," +
"		\"brand\" : \"oneplus\"," +
"		\"model\" : \"5t 128 gb\"," +
"		\"name\" : \"oneplus 5t 128 gb\"," +
"		\"price\" : 3229," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/oneplus-5t-128gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 45," +
"		\"brand\" : \"honor\"," +
"		\"model\" : \"10 (col-l29)\"," +
"		\"name\" : \"honor 10 (col-l29)\"," +
"		\"price\" : 2789," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/honor-10.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 46," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"redmi note 7\"," +
"		\"name\" : \"xiaomi redmi note 7\"," +
"		\"price\" : 2658.86," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/redmi-note-7.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 47," +
"		\"brand\" : \"lg\"," +
"		\"model\" : \"g6 tek hat (h870)\"," +
"		\"name\" : \"lg g6 tek hat (h870)\"," +
"		\"price\" : 2049," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/lg-g6.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 48," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"mi 6 64 gb / 6 gb\"," +
"		\"name\" : \"xiaomi mi 6 64 gb / 6 gb\"," +
"		\"price\" : 2499," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-mi-6-64gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 49," +
"		\"brand\" : \"nokia\"," +
"		\"model\" : \"8 (ta-1012)\"," +
"		\"name\" : \"nokia 8 (ta-1012)\"," +
"		\"price\" : 2379," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/nokia-8.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 50," +
"		\"brand\" : \"honor\"," +
"		\"model\" : \"play (cor-l29)\"," +
"		\"name\" : \"honor play (cor-l29)\"," +
"		\"price\" : 2199," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/honor-play.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 51," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy s7 edge tek hat (sm-g935f)\"," +
"		\"name\" : \"samsung galaxy s7 edge tek hat (sm-g935f)\"," +
"		\"price\" : 2098," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-s7-edge.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 52," +
"		\"brand\" : \"apple\"," +
"		\"model\" : \"iphone x 256 gb (mqag2tu/a, mqaf2tu/a)\"," +
"		\"name\" : \"apple iphone x 256 gb (mqag2tu/a, mqaf2tu/a)\"," +
"		\"price\" : 8599," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/apple-iphone-x-256gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 53," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy a50 (sm-a505f)\"," +
"		\"name\" : \"samsung galaxy a50 (sm-a505f)\"," +
"		\"price\" : 2478.67," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-a50.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 54," +
"		\"brand\" : \"oneplus\"," +
"		\"model\" : \"5t 64 gb\"," +
"		\"name\" : \"oneplus 5t 64 gb\"," +
"		\"price\" : 2829.9," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/oneplus-5t.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 55," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"mi 6 64 gb / 4 gb\"," +
"		\"name\" : \"xiaomi mi 6 64 gb / 4 gb\"," +
"		\"price\" : 3534.03," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-mi-6.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 56," +
"		\"brand\" : \"lg\"," +
"		\"model\" : \"v20 (h990)\"," +
"		\"name\" : \"lg v20 (h990)\"," +
"		\"price\" : 2159," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/lg-v20.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 57," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy a9 (2018) (sm-a920f)\"," +
"		\"name\" : \"samsung galaxy a9 (2018) (sm-a920f)\"," +
"		\"price\" : 2730.55," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-a9-2018.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 58," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"mi 8 lite 128 gb / 6 gb\"," +
"		\"name\" : \"xiaomi mi 8 lite 128 gb / 6 gb\"," +
"		\"price\" : 2645," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-mi-8-lite-128gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 59," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"mi mıx 2 128 gb\"," +
"		\"name\" : \"xiaomi mi mıx 2 128 gb\"," +
"		\"price\" : 2649," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-mi-mix-2-128gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 60," +
"		\"brand\" : \"lg\"," +
"		\"model\" : \"g7 fit (lm-q850)\"," +
"		\"name\" : \"lg g7 fit (lm-q850)\"," +
"		\"price\" : 2649.9," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/lg-g7-fit.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 61," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"mi 8 se 6 gb / 64 gb\"," +
"		\"name\" : \"xiaomi mi 8 se 6 gb / 64 gb\"," +
"		\"price\" : 2349," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-mi-8-se-6gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 62," +
"		\"brand\" : \"apple\"," +
"		\"model\" : \"iphone x (mqac2tu/a, mqad2tu/a)\"," +
"		\"name\" : \"apple iphone x (mqac2tu/a, mqad2tu/a)\"," +
"		\"price\" : 7548.9," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/apple-iphone-x.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 63," +
"		\"brand\" : \"general\"," +
"		\"model\" : \"mobile gm 9 pro\"," +
"		\"name\" : \"general mobile gm 9 pro\"," +
"		\"price\" : 1649.9," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/general-mobile-gm-9-pro.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 64," +
"		\"brand\" : \"general\"," +
"		\"model\" : \"mobile gm 9 pro d çift hat\"," +
"		\"name\" : \"general mobile gm 9 pro d çift hat\"," +
"		\"price\" : 1669.9," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/general-mobile-gm-9-pro-d.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 65," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"mi mıx 2 64 gb\"," +
"		\"name\" : \"xiaomi mi mıx 2 64 gb\"," +
"		\"price\" : 2539," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-mi-mix-2.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 66," +
"		\"brand\" : \"umıdıgı\"," +
"		\"model\" : \"z2 pro\"," +
"		\"name\" : \"umıdıgı z2 pro\"," +
"		\"price\" : 2249," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/umidigi-z2-pro.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 67," +
"		\"brand\" : \"huawei\"," +
"		\"model\" : \"mate 20 lite (sne-lx1)\"," +
"		\"name\" : \"huawei mate 20 lite (sne-lx1)\"," +
"		\"price\" : 2149," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/huawei-mate-20-lite.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 68," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"mi max 3\"," +
"		\"name\" : \"xiaomi mi max 3\"," +
"		\"price\" : 1979.9," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-mi-max-3.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 69," +
"		\"brand\" : \"huawei\"," +
"		\"model\" : \"p10 tek hat (vtr-l09)\"," +
"		\"name\" : \"huawei p10 tek hat (vtr-l09)\"," +
"		\"price\" : 3219," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/huawei-p10.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 70," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"mi 8 se\"," +
"		\"name\" : \"xiaomi mi 8 se\"," +
"		\"price\" : 2965," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-mi-8-se.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 71," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"redmi note 6 pro 4 gb / 64 gb\"," +
"		\"name\" : \"xiaomi redmi note 6 pro 4 gb / 64 gb\"," +
"		\"price\" : 1599," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-redmi-note-6-pro-64gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 72," +
"		\"brand\" : \"htc\"," +
"		\"model\" : \"u ultra tek hat\"," +
"		\"name\" : \"htc u ultra tek hat\"," +
"		\"price\" : 1869," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/htc-u-ultra.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 73," +
"		\"brand\" : \"honor\"," +
"		\"model\" : \"8x 128 gb\"," +
"		\"name\" : \"honor 8x 128 gb\"," +
"		\"price\" : 1999," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/honor-8x-128gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 74," +
"		\"brand\" : \"honor\"," +
"		\"model\" : \"8x (jsn-l21)\"," +
"		\"name\" : \"honor 8x (jsn-l21)\"," +
"		\"price\" : 1919.63," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/honor-8x.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 75," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy a8+ plus (2018) çift hat (sm-a730f/ds)\"," +
"		\"name\" : \"samsung galaxy a8+ plus (2018) çift hat (sm-a730f/ds)\"," +
"		\"price\" : 2889.01," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-a8plus-plus-2018-duos.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 76," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy a8+ plus (2018) tek hat (sm-a730f)\"," +
"		\"name\" : \"samsung galaxy a8+ plus (2018) tek hat (sm-a730f)\"," +
"		\"price\" : 2555," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-a8-plus-2018.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 77," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"mi 8 lite\"," +
"		\"name\" : \"xiaomi mi 8 lite\"," +
"		\"price\" : 1975," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-mi-8-lite.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 78," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy s7 tek hat (sm-g930f)\"," +
"		\"name\" : \"samsung galaxy s7 tek hat (sm-g930f)\"," +
"		\"price\" : 2199," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-s7.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 79," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"mi note 3 128 gb\"," +
"		\"name\" : \"xiaomi mi note 3 128 gb\"," +
"		\"price\" : 2099," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-mi-note-3-128gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 80," +
"		\"brand\" : \"apple\"," +
"		\"model\" : \"iphone 8 plus (product)red special edition 256 gb (mrta2tu/a)\"," +
"		\"name\" : \"apple iphone 8 plus (product)red special edition 256 gb (mrta2tu/a)\"," +
"		\"price\" : 6499," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/apple-iphone-8-plus-productred-special-edition-256gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 81," +
"		\"brand\" : \"apple\"," +
"		\"model\" : \"iphone 8 plus 256 gb (mq8p2tu/a, mq8q2tu/a, mq8r2tu/a)\"," +
"		\"name\" : \"apple iphone 8 plus 256 gb (mq8p2tu/a, mq8q2tu/a, mq8r2tu/a)\"," +
"		\"price\" : 7314," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/apple-iphone-8-plus-256gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 82," +
"		\"brand\" : \"huawei\"," +
"		\"model\" : \"mate 20 lite çift hat\"," +
"		\"name\" : \"huawei mate 20 lite çift hat\"," +
"		\"price\" : 2178," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/huawei-mate-20-lite-dual.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 83," +
"		\"brand\" : \"honor\"," +
"		\"model\" : \"8x 64 gb (jsn-l22)\"," +
"		\"name\" : \"honor 8x 64 gb (jsn-l22)\"," +
"		\"price\" : 1950," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/honor-8x-jsn-l22.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 84," +
"		\"brand\" : \"asus\"," +
"		\"model\" : \"zenfone 5 (ze620kl)\"," +
"		\"name\" : \"asus zenfone 5 (ze620kl)\"," +
"		\"price\" : 2197," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/asus-zenfone-5-ze620kl.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 85," +
"		\"brand\" : \"meizu\"," +
"		\"model\" : \"16 128 gb\"," +
"		\"name\" : \"meizu 16 128 gb\"," +
"		\"price\" : 2719," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/meizu-16-128gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 86," +
"		\"brand\" : \"nokia\"," +
"		\"model\" : \"7 plus (ta-1055)\"," +
"		\"name\" : \"nokia 7 plus (ta-1055)\"," +
"		\"price\" : 2589," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/nokia-7-plus.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 87," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"mi note 3 64 gb\"," +
"		\"name\" : \"xiaomi mi note 3 64 gb\"," +
"		\"price\" : 2079," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-mi-note-3.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 88," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"redmi note 5 pro 6 gb\"," +
"		\"name\" : \"xiaomi redmi note 5 pro 6 gb\"," +
"		\"price\" : 1789.9," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-redmi-note-5-pro-6gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 89," +
"		\"brand\" : \"oppo\"," +
"		\"model\" : \"f9\"," +
"		\"name\" : \"oppo f9\"," +
"		\"price\" : 2849," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/oppo-f9.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 90," +
"		\"brand\" : \"asus\"," +
"		\"model\" : \"zenfone max pro (zb602kl)\"," +
"		\"name\" : \"asus zenfone max pro (zb602kl)\"," +
"		\"price\" : 1499.9," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/asus-zenfone-max-pro-m1.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 91," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"redmi note 5 64 gb / 4 gb\"," +
"		\"name\" : \"xiaomi redmi note 5 64 gb / 4 gb\"," +
"		\"price\" : 1599," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-redmi-note-5-64gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 92," +
"		\"brand\" : \"meizu\"," +
"		\"model\" : \"16 64 gb\"," +
"		\"name\" : \"meizu 16 64 gb\"," +
"		\"price\" : 2289.9," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/meizu-16.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 93," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy a8 (2018) çift hat (sm-a530f/ds)\"," +
"		\"name\" : \"samsung galaxy a8 (2018) çift hat (sm-a530f/ds)\"," +
"		\"price\" : 2589," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-a8-2018-dual.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 94," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy a8 (2018) tek hat (sm-a530f)\"," +
"		\"name\" : \"samsung galaxy a8 (2018) tek hat (sm-a530f)\"," +
"		\"price\" : 2449," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-a8-2018.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 95," +
"		\"brand\" : \"meizu\"," +
"		\"model\" : \"x8 128 gb\"," +
"		\"name\" : \"meizu x8 128 gb\"," +
"		\"price\" : 2199.9," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/meizu-x8-128gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 96," +
"		\"brand\" : \"apple\"," +
"		\"model\" : \"iphone 8 plus (product)red special edition (mrt92tu/a)\"," +
"		\"name\" : \"apple iphone 8 plus (product)red special edition (mrt92tu/a)\"," +
"		\"price\" : 5999," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/apple-iphone-8-plus-productred-special-edition.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 97," +
"		\"brand\" : \"apple\"," +
"		\"model\" : \"iphone 8 plus 64 gb (mq8l2tu/a, mq8m2tu/a, mq8n2tu/a)\"," +
"		\"name\" : \"apple iphone 8 plus 64 gb (mq8l2tu/a, mq8m2tu/a, mq8n2tu/a)\"," +
"		\"price\" : 5599," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/apple-iphone-8-plus.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 98," +
"		\"brand\" : \"asus\"," +
"		\"model\" : \"zenfone zoom s (ze553kl)\"," +
"		\"name\" : \"asus zenfone zoom s (ze553kl)\"," +
"		\"price\" : 2479.9," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/asus-zenfone-zoom-s.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 99," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"redmi note 5 pro\"," +
"		\"name\" : \"xiaomi redmi note 5 pro\"," +
"		\"price\" : 2199," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-redmi-note-5-pro.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 100," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"mi a2 128 gb\"," +
"		\"name\" : \"xiaomi mi a2 128 gb\"," +
"		\"price\" : 2399," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-mi-a2-128gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 101," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy a30 (sm-a305f)\"," +
"		\"name\" : \"samsung galaxy a30 (sm-a305f)\"," +
"		\"price\" : 2069," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-a30.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 102," +
"		\"brand\" : \"huawei\"," +
"		\"model\" : \"p smart 2019 64 gb (pot-lx1)\"," +
"		\"name\" : \"huawei p smart 2019 64 gb (pot-lx1)\"," +
"		\"price\" : 1689.9," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/huawei-p-smart-2019.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 103," +
"		\"brand\" : \"nokia\"," +
"		\"model\" : \"7.1\"," +
"		\"name\" : \"nokia 7.1\"," +
"		\"price\" : 2799," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/nokia-7-1-64gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 104," +
"		\"brand\" : \"sony\"," +
"		\"model\" : \"xperia xz (f8331)\"," +
"		\"name\" : \"sony xperia xz (f8331)\"," +
"		\"price\" : 2139.9," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/sony-xperia-xz.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 105," +
"		\"brand\" : \"oppo\"," +
"		\"model\" : \"rx17 neo\"," +
"		\"name\" : \"oppo rx17 neo\"," +
"		\"price\" : 2729," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/oppo-rx17-neo.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 106," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy a7 (2018) 128 gb / çift hat (sm-a750f/ds)\"," +
"		\"name\" : \"samsung galaxy a7 (2018) 128 gb / çift hat (sm-a750f/ds)\"," +
"		\"price\" : 2089," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-a7-2018-128gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 107," +
"		\"brand\" : \"asus\"," +
"		\"model\" : \"zenfone 4 (ze554kl)\"," +
"		\"name\" : \"asus zenfone 4 (ze554kl)\"," +
"		\"price\" : 1949," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/asus-zenfone-4.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 108," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy c9 pro (sm-c9000)\"," +
"		\"name\" : \"samsung galaxy c9 pro (sm-c9000)\"," +
"		\"price\" : 2389," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-c9-pro.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 109," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"redmi note 6 pro\"," +
"		\"name\" : \"xiaomi redmi note 6 pro\"," +
"		\"price\" : 1559," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-redmi-note-6-pro.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 110," +
"		\"brand\" : \"apple\"," +
"		\"model\" : \"iphone 7 plus 128 gb (mn4m2tu/a, mn4p2tu/a, mn4v2tu/a, mn4q2tu/a, mn4u2tu/a)\"," +
"		\"name\" : \"apple iphone 7 plus 128 gb (mn4m2tu/a, mn4p2tu/a, mn4v2tu/a, mn4q2tu/a, mn4u2tu/a)\"," +
"		\"price\" : 4949," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/apple-iphone-7-plus-128gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 111," +
"		\"brand\" : \"meizu\"," +
"		\"model\" : \"x8 64 gb\"," +
"		\"name\" : \"meizu x8 64 gb\"," +
"		\"price\" : 1799.9," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/meizu-x8.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 112," +
"		\"brand\" : \"casper\"," +
"		\"model\" : \"vıa a3 plus\"," +
"		\"name\" : \"casper vıa a3 plus\"," +
"		\"price\" : 2399," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/casper-via-a3-plus.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 113," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy a7 (2018) (sm-a750f)\"," +
"		\"name\" : \"samsung galaxy a7 (2018) (sm-a750f)\"," +
"		\"price\" : 1873.9," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-a7-2018.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 114," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy a7 (2018) 64 gb / çift hat\"," +
"		\"name\" : \"samsung galaxy a7 (2018) 64 gb / çift hat\"," +
"		\"price\" : 2299," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-a7-2018-dual.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 115," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"mi a2 64 gb\"," +
"		\"name\" : \"xiaomi mi a2 64 gb\"," +
"		\"price\" : 1783," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-mi-a2-64gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 116," +
"		\"brand\" : \"htc\"," +
"		\"model\" : \"10\"," +
"		\"name\" : \"htc 10\"," +
"		\"price\" : 2099," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/htc-10.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 117," +
"		\"brand\" : \"doogee\"," +
"		\"model\" : \"s60\"," +
"		\"name\" : \"doogee s60\"," +
"		\"price\" : 4499," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/doogee-s60.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 118," +
"		\"brand\" : \"lg\"," +
"		\"model\" : \"g5 (h850)\"," +
"		\"name\" : \"lg g5 (h850)\"," +
"		\"price\" : 1129," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/lg-g5.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 119," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"redmi note 5 32 gb / 3 gb\"," +
"		\"name\" : \"xiaomi redmi note 5 32 gb / 3 gb\"," +
"		\"price\" : 1478," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-redmi-note-5.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 120," +
"		\"brand\" : \"vestel\"," +
"		\"model\" : \"venus z20\"," +
"		\"name\" : \"vestel venus z20\"," +
"		\"price\" : 1370," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/vestel-venus-z20.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 121," +
"		\"brand\" : \"honor\"," +
"		\"model\" : \"10 lite (hry-lx1)\"," +
"		\"name\" : \"honor 10 lite (hry-lx1)\"," +
"		\"price\" : 1505.9," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/honor-10-lite-32gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 122," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"mi a2 lite 64 gb\"," +
"		\"name\" : \"xiaomi mi a2 lite 64 gb\"," +
"		\"price\" : 1488," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-mi-a2-lite-64gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 123," +
"		\"brand\" : \"htc\"," +
"		\"model\" : \"10 evo 32 gb\"," +
"		\"name\" : \"htc 10 evo 32 gb\"," +
"		\"price\" : 1599," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/htc-10-evo-32gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 124," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy m20 (sm-m205f)\"," +
"		\"name\" : \"samsung galaxy m20 (sm-m205f)\"," +
"		\"price\" : 1599," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-m20.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 125," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"mi 5 prime 64 gb\"," +
"		\"name\" : \"xiaomi mi 5 prime 64 gb\"," +
"		\"price\" : 1999," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-mi-5-64gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 126," +
"		\"brand\" : \"huawei\"," +
"		\"model\" : \"p smart 2019 32 gb\"," +
"		\"name\" : \"huawei p smart 2019 32 gb\"," +
"		\"price\" : 1549," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/huawei-p-smart-2019-32gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 127," +
"		\"brand\" : \"meizu\"," +
"		\"model\" : \"note 8\"," +
"		\"name\" : \"meizu note 8\"," +
"		\"price\" : 1499.9," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/meizu-note-8.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 128," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"mi max 2 64 gb\"," +
"		\"name\" : \"xiaomi mi max 2 64 gb\"," +
"		\"price\" : 2099," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-mi-max-2-64gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 129," +
"		\"brand\" : \"zte\"," +
"		\"model\" : \"nubia z17 minis\"," +
"		\"name\" : \"zte nubia z17 minis\"," +
"		\"price\" : 1899," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/zte-nubia-z17-minis.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 130," +
"		\"brand\" : \"vestel\"," +
"		\"model\" : \"venus z30 (20274551)\"," +
"		\"name\" : \"vestel venus z30 (20274551)\"," +
"		\"price\" : 2550," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/vestel-venus-z30.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 131," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"mi 5s 32 gb\"," +
"		\"name\" : \"xiaomi mi 5s 32 gb\"," +
"		\"price\" : 1699," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-mi-5s.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 132," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy m20 çift hat / 32 gb\"," +
"		\"name\" : \"samsung galaxy m20 çift hat / 32 gb\"," +
"		\"price\" : 1459," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-m20-dual.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 133," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"mi a2 32 gb\"," +
"		\"name\" : \"xiaomi mi a2 32 gb\"," +
"		\"price\" : 1587.9," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-mi-a2.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 134," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy c7 pro (sm-c7010)\"," +
"		\"name\" : \"samsung galaxy c7 pro (sm-c7010)\"," +
"		\"price\" : 1485," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-c7-pro.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 135," +
"		\"brand\" : \"apple\"," +
"		\"model\" : \"iphone 7 plus 32 gb (mnqq2tu/a, mnqp2tu/a, mnqm2tu/a, mnqn2tu/a, mqu72tu/a)\"," +
"		\"name\" : \"apple iphone 7 plus 32 gb (mnqq2tu/a, mnqp2tu/a, mnqm2tu/a, mnqn2tu/a, mqu72tu/a)\"," +
"		\"price\" : 3869," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/apple-iphone-7-plus.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 136," +
"		\"brand\" : \"huawei\"," +
"		\"model\" : \"p20 lite (ane-lx1)\"," +
"		\"name\" : \"huawei p20 lite (ane-lx1)\"," +
"		\"price\" : 1783.9," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/huawei-p20-lite.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 137," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"redmi 5 plus 64 gb\"," +
"		\"name\" : \"xiaomi redmi 5 plus 64 gb\"," +
"		\"price\" : 1359," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-redmi-5-plus-64gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 138," +
"		\"brand\" : \"apple\"," +
"		\"model\" : \"iphone 8 (product)red special edition 256 gb (mrrn2tu/a)\"," +
"		\"name\" : \"apple iphone 8 (product)red special edition 256 gb (mrrn2tu/a)\"," +
"		\"price\" : 5439," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/apple-iphone-8-productred-special-edition-256gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 139," +
"		\"brand\" : \"apple\"," +
"		\"model\" : \"iphone 8 256 gb (mq7d2tu/a, mq7e2tu/a, mq7c2tu/a)\"," +
"		\"name\" : \"apple iphone 8 256 gb (mq7d2tu/a, mq7e2tu/a, mq7c2tu/a)\"," +
"		\"price\" : 5535," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/apple-iphone-8-256gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 140," +
"		\"brand\" : \"casper\"," +
"		\"model\" : \"vıa a1 plus 128 gb\"," +
"		\"name\" : \"casper vıa a1 plus 128 gb\"," +
"		\"price\" : 2980," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/casper-via-a1-plus.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 141," +
"		\"brand\" : \"huawei\"," +
"		\"model\" : \"mate 10 lite çift hat (rne-l21)\"," +
"		\"name\" : \"huawei mate 10 lite çift hat (rne-l21)\"," +
"		\"price\" : 1657.9," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/huawei-mate-10-lite-dual.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 142," +
"		\"brand\" : \"huawei\"," +
"		\"model\" : \"mate 10 lite (rne-l01)\"," +
"		\"name\" : \"huawei mate 10 lite (rne-l01)\"," +
"		\"price\" : 1679," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/huawei-mate-10-lite.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 143," +
"		\"brand\" : \"casper\"," +
"		\"model\" : \"vıa a3\"," +
"		\"name\" : \"casper vıa a3\"," +
"		\"price\" : 1379.9," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/casper-via-a3.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 144," +
"		\"brand\" : \"huawei\"," +
"		\"model\" : \"p20 lite çift hat\"," +
"		\"name\" : \"huawei p20 lite çift hat\"," +
"		\"price\" : 1769," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/huawei-p20-lite-dual.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 145," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy a6+ plus (sm-a605f)\"," +
"		\"name\" : \"samsung galaxy a6+ plus (sm-a605f)\"," +
"		\"price\" : 1879," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-a6-plus.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 146," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy a6+ plus çift hat / 64 gb\"," +
"		\"name\" : \"samsung galaxy a6+ plus çift hat / 64 gb\"," +
"		\"price\" : 1780," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-a6-plus-duos.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 147," +
"		\"brand\" : \"honor\"," +
"		\"model\" : \"7x (bnd-l21)\"," +
"		\"name\" : \"honor 7x (bnd-l21)\"," +
"		\"price\" : 2149," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/huawei-honor-7x.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 148," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy note 5 32 gb (sm-n920c)\"," +
"		\"name\" : \"samsung galaxy note 5 32 gb (sm-n920c)\"," +
"		\"price\" : 2650," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-note-5.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 149," +
"		\"brand\" : \"casper\"," +
"		\"model\" : \"vıa a1 plus 64 gb\"," +
"		\"name\" : \"casper vıa a1 plus 64 gb\"," +
"		\"price\" : 1599," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/casper-via-a1-plus-64gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 150," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy a7 (2017) çift hat (sm-a720f/ds)\"," +
"		\"name\" : \"samsung galaxy a7 (2017) çift hat (sm-a720f/ds)\"," +
"		\"price\" : 1749," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-a7-2017-dual-sim.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 151," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy a7 (2017) tek hat (sm-a720f)\"," +
"		\"name\" : \"samsung galaxy a7 (2017) tek hat (sm-a720f)\"," +
"		\"price\" : 1869," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-a7-2017.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 152," +
"		\"brand\" : \"lg\"," +
"		\"model\" : \"q7+ (lmq610)\"," +
"		\"name\" : \"lg q7+ (lmq610)\"," +
"		\"price\" : 1518," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/lg-q7-plus.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 153," +
"		\"brand\" : \"sony\"," +
"		\"model\" : \"xperia z5 dual (e6633)\"," +
"		\"name\" : \"sony xperia z5 dual (e6633)\"," +
"		\"price\" : 1799," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/sony-xperia-z5-dual.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 154," +
"		\"brand\" : \"lenovo\"," +
"		\"model\" : \"moto z (xt1650)\"," +
"		\"name\" : \"lenovo moto z (xt1650)\"," +
"		\"price\" : 1699," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/motorola-moto-z.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 155," +
"		\"brand\" : \"apple\"," +
"		\"model\" : \"iphone 8 (product)red special edition (mrrm2tu/a)\"," +
"		\"name\" : \"apple iphone 8 (product)red special edition (mrrm2tu/a)\"," +
"		\"price\" : 4999," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/apple-iphone-8-productred-special-edition.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 156," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"mi 5x 64 gb\"," +
"		\"name\" : \"xiaomi mi 5x 64 gb\"," +
"		\"price\" : 1519," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-mi-5x-64gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 157," +
"		\"brand\" : \"apple\"," +
"		\"model\" : \"iphone 8 64 gb (mq6g2tu/a, mq6h2tu/a, mq6j2tu/a)\"," +
"		\"name\" : \"apple iphone 8 64 gb (mq6g2tu/a, mq6h2tu/a, mq6j2tu/a)\"," +
"		\"price\" : 4670.55," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/apple-iphone-8.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 158," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"mi a2 lite 32 gb\"," +
"		\"name\" : \"xiaomi mi a2 lite 32 gb\"," +
"		\"price\" : 1349," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-mi-a2-lite.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 159," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"mi a1 64 gb\"," +
"		\"name\" : \"xiaomi mi a1 64 gb\"," +
"		\"price\" : 1449," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-mi-a1.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 160," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy note 5 (dual sım) 32 gb\"," +
"		\"name\" : \"samsung galaxy note 5 (dual sım) 32 gb\"," +
"		\"price\" : 1979.99," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-note-5-dual-sim.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 161," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"redmi s2 64 gb\"," +
"		\"name\" : \"xiaomi redmi s2 64 gb\"," +
"		\"price\" : 1479," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-redmi-s2-64gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 162," +
"		\"brand\" : \"oppo\"," +
"		\"model\" : \"ax7\"," +
"		\"name\" : \"oppo ax7\"," +
"		\"price\" : 1899," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/oppo-ax7.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 163," +
"		\"brand\" : \"sony\"," +
"		\"model\" : \"xperia xa1 plus (g3421)\"," +
"		\"name\" : \"sony xperia xa1 plus (g3421)\"," +
"		\"price\" : 1349.9," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/sony-xperia-xa1-plus.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 164," +
"		\"brand\" : \"blackberry\"," +
"		\"model\" : \"keyone (black edition)\"," +
"		\"name\" : \"blackberry keyone (black edition)\"," +
"		\"price\" : 3799," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/blackberry-keyone-black-edition.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 165," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy j8 64 gb / çift hat\"," +
"		\"name\" : \"samsung galaxy j8 64 gb / çift hat\"," +
"		\"price\" : 1680," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-j8-64gb-4gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 166," +
"		\"brand\" : \"reeder\"," +
"		\"model\" : \"p12 curve\"," +
"		\"name\" : \"reeder p12 curve\"," +
"		\"price\" : 1449," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/reeder-p12-curve.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 167," +
"		\"brand\" : \"lg\"," +
"		\"model\" : \"g5 se tek hat (h840)\"," +
"		\"name\" : \"lg g5 se tek hat (h840)\"," +
"		\"price\" : 1999," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/lg-g5-se.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 168," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy note 4 1.9 ghz / 4g / tek hat (sm-n910c)\"," +
"		\"name\" : \"samsung galaxy note 4 1.9 ghz / 4g / tek hat (sm-n910c)\"," +
"		\"price\" : 1379," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-note-4.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 169," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy j7 pro 64 gb\"," +
"		\"name\" : \"samsung galaxy j7 pro 64 gb\"," +
"		\"price\" : 1639," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-j7-pro-64gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 170," +
"		\"brand\" : \"huawei\"," +
"		\"model\" : \"p9 tek hat (eva-l09)\"," +
"		\"name\" : \"huawei p9 tek hat (eva-l09)\"," +
"		\"price\" : 2719," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/huawei-p9.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 171," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy a5 (2017) çift hat (sm-a520f/ds)\"," +
"		\"name\" : \"samsung galaxy a5 (2017) çift hat (sm-a520f/ds)\"," +
"		\"price\" : 1719," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-a5-2017-dual-sim.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 172," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy a5 (2017) tek hat (sm-a520f)\"," +
"		\"name\" : \"samsung galaxy a5 (2017) tek hat (sm-a520f)\"," +
"		\"price\" : 1899," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-a5-2017.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 173," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"redmi 5 plus\"," +
"		\"name\" : \"xiaomi redmi 5 plus\"," +
"		\"price\" : 1349," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-redmi-5-plus.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 174," +
"		\"brand\" : \"alcatel\"," +
"		\"model\" : \"5v\"," +
"		\"name\" : \"alcatel 5v\"," +
"		\"price\" : 1399," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/alcatel-5v.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 175," +
"		\"brand\" : \"lg\"," +
"		\"model\" : \"g4 tek hat (h815)\"," +
"		\"name\" : \"lg g4 tek hat (h815)\"," +
"		\"price\" : 899.99," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/lg-g4.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 176," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy j8 64 gb\"," +
"		\"name\" : \"samsung galaxy j8 64 gb\"," +
"		\"price\" : 2499," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-j8-64gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 177," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy j8 64 gb / çift hat\"," +
"		\"name\" : \"samsung galaxy j8 64 gb / çift hat\"," +
"		\"price\" : 1865," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-j8-64gb-duos.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 178," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy j7 max (sm-g615f/ds)\"," +
"		\"name\" : \"samsung galaxy j7 max (sm-g615f/ds)\"," +
"		\"price\" : 1750," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-j7-max.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 179," +
"		\"brand\" : \"asus\"," +
"		\"model\" : \"zenfone max m2 (zb633kl)\"," +
"		\"name\" : \"asus zenfone max m2 (zb633kl)\"," +
"		\"price\" : 1599," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/asus-zenfone-max-m2.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 180," +
"		\"brand\" : \"nokia\"," +
"		\"model\" : \"5.1 plus (ta-1108)\"," +
"		\"name\" : \"nokia 5.1 plus (ta-1108)\"," +
"		\"price\" : 2199," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/nokia-5-1-plus.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 181," +
"		\"brand\" : \"casper\"," +
"		\"model\" : \"vıa f2\"," +
"		\"name\" : \"casper vıa f2\"," +
"		\"price\" : 1400," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/casper-via-f2.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 182," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy a6+ plus çift hat / 32 gb\"," +
"		\"name\" : \"samsung galaxy a6+ plus çift hat / 32 gb\"," +
"		\"price\" : 1540," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-a6-plus-32gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 183," +
"		\"brand\" : \"asus\"," +
"		\"model\" : \"zenfone 3 32 gb (ze552kl)\"," +
"		\"name\" : \"asus zenfone 3 32 gb (ze552kl)\"," +
"		\"price\" : 1779," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/asus-zenfone-3.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 184," +
"		\"brand\" : \"apple\"," +
"		\"model\" : \"iphone 7 (product)red special edition 256 gb (mprm2tu/a)\"," +
"		\"name\" : \"apple iphone 7 (product)red special edition 256 gb (mprm2tu/a)\"," +
"		\"price\" : 4699," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/apple-iphone-7-256gb-productred-special-edition.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 185," +
"		\"brand\" : \"asus\"," +
"		\"model\" : \"zenfone max plus (m1) (zb570tl)\"," +
"		\"name\" : \"asus zenfone max plus (m1) (zb570tl)\"," +
"		\"price\" : 1400," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/asus-zenfone-max-plus-m1.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 186," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"mi a1 32 gb\"," +
"		\"name\" : \"xiaomi mi a1 32 gb\"," +
"		\"price\" : 1399," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-mi-a1-32gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 187," +
"		\"brand\" : \"moto\"," +
"		\"model\" : \"g5s plus (xt1803)\"," +
"		\"name\" : \"moto g5s plus (xt1803)\"," +
"		\"price\" : 1349," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/moto-g5s-plus.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 188," +
"		\"brand\" : \"apple\"," +
"		\"model\" : \"iphone 7 256 gb (mn982tu/a, mn9a2tu/a, mn992tu/a, mn9c2tu/a, mn972tu/a)\"," +
"		\"name\" : \"apple iphone 7 256 gb (mn982tu/a, mn9a2tu/a, mn992tu/a, mn9c2tu/a, mn972tu/a)\"," +
"		\"price\" : 4699," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/apple-iphone-7-256gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 189," +
"		\"brand\" : \"general\"," +
"		\"model\" : \"mobile gm 8 64 gb\"," +
"		\"name\" : \"general mobile gm 8 64 gb\"," +
"		\"price\" : 1165," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/general-mobile-gm-8-64gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 190," +
"		\"brand\" : \"general\"," +
"		\"model\" : \"mobile gm 8 64 gb / çift hat / 4 gb\"," +
"		\"name\" : \"general mobile gm 8 64 gb / çift hat / 4 gb\"," +
"		\"price\" : 1165," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/general-mobile-gm-8-64gb-dual.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 191," +
"		\"brand\" : \"honor\"," +
"		\"model\" : \"9 lite (lld-l31)\"," +
"		\"name\" : \"honor 9 lite (lld-l31)\"," +
"		\"price\" : 1329," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/huawei-honor-9-lite.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 192," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy a8 (2016) (sm-a810f/ds)\"," +
"		\"name\" : \"samsung galaxy a8 (2016) (sm-a810f/ds)\"," +
"		\"price\" : 1699," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-a8-2016.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 193," +
"		\"brand\" : \"huawei\"," +
"		\"model\" : \"p smart çift hat\"," +
"		\"name\" : \"huawei p smart çift hat\"," +
"		\"price\" : 1399.9," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/huawei-p-smart-dual.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 194," +
"		\"brand\" : \"huawei\"," +
"		\"model\" : \"p smart (fıg-lx1)\"," +
"		\"name\" : \"huawei p smart (fıg-lx1)\"," +
"		\"price\" : 1519," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/huawei-p-smart.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 195," +
"		\"brand\" : \"huawei\"," +
"		\"model\" : \"p10 lite tek hat / 32 gb (was-lx1a)\"," +
"		\"name\" : \"huawei p10 lite tek hat / 32 gb (was-lx1a)\"," +
"		\"price\" : 1959," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/huawei-p10-lite.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 196," +
"		\"brand\" : \"asus\"," +
"		\"model\" : \"zenfone 4 max (zc554kl)\"," +
"		\"name\" : \"asus zenfone 4 max (zc554kl)\"," +
"		\"price\" : 1179," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/asus-zenfone-4-max.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 197," +
"		\"brand\" : \"lenovo\"," +
"		\"model\" : \"moto z play 32 gb\"," +
"		\"name\" : \"lenovo moto z play 32 gb\"," +
"		\"price\" : 1599," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/lenovo-moto-z-play-32gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 198," +
"		\"brand\" : \"apple\"," +
"		\"model\" : \"iphone 7 128 gb (mn922tu/a, mn952tu/a, mn932tu/a, mn962tu/a, mn942tu/a)\"," +
"		\"name\" : \"apple iphone 7 128 gb (mn922tu/a, mn952tu/a, mn932tu/a, mn962tu/a, mn942tu/a)\"," +
"		\"price\" : 3904," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/apple-iphone-7-128gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 199," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy j7 pro tek hat / 32 gb\"," +
"		\"name\" : \"samsung galaxy j7 pro tek hat / 32 gb\"," +
"		\"price\" : 1449," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-j7-pro-32gb-tek-sim.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 200," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy j8 (sm-j810f)\"," +
"		\"name\" : \"samsung galaxy j8 (sm-j810f)\"," +
"		\"price\" : 1479," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-j8.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 201," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy j6+ plus 64 gb / çift hat\"," +
"		\"name\" : \"samsung galaxy j6+ plus 64 gb / çift hat\"," +
"		\"price\" : 1389," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-j6-plus-64gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 202," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy j7 prime 2 (sm-g611f)\"," +
"		\"name\" : \"samsung galaxy j7 prime 2 (sm-g611f)\"," +
"		\"price\" : 1248.65," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-j7-prime-2.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 203," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy c5 pro (sm-c5010)\"," +
"		\"name\" : \"samsung galaxy c5 pro (sm-c5010)\"," +
"		\"price\" : 2227," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-c5-pro.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 204," +
"		\"brand\" : \"reeder\"," +
"		\"model\" : \"p12s\"," +
"		\"name\" : \"reeder p12s\"," +
"		\"price\" : 1450," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/reeder-p12s.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 205," +
"		\"brand\" : \"vestel\"," +
"		\"model\" : \"venus v6\"," +
"		\"name\" : \"vestel venus v6\"," +
"		\"price\" : 1099," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/vestel-venus-v6.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 206," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"redmi 6 64 gb / 4 gb\"," +
"		\"name\" : \"xiaomi redmi 6 64 gb / 4 gb\"," +
"		\"price\" : 1549," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-redmi-6-64gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 207," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"redmi s2\"," +
"		\"name\" : \"xiaomi redmi s2\"," +
"		\"price\" : 1239," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-redmi-s2.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 208," +
"		\"brand\" : \"htc\"," +
"		\"model\" : \"desire 10 pro 64 gb\"," +
"		\"name\" : \"htc desire 10 pro 64 gb\"," +
"		\"price\" : 1769," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/htc-desire-10-pro-64gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 209," +
"		\"brand\" : \"lg\"," +
"		\"model\" : \"q7 bts edition (lm-q617em)\"," +
"		\"name\" : \"lg q7 bts edition (lm-q617em)\"," +
"		\"price\" : 1386.9," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/lg-q7-bts-edition.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 210," +
"		\"brand\" : \"vestel\"," +
"		\"model\" : \"venus z10\"," +
"		\"name\" : \"vestel venus z10\"," +
"		\"price\" : 1269," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/vestel-venus-z10.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 211," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy j7 pro çift hat / 32 gb\"," +
"		\"name\" : \"samsung galaxy j7 pro çift hat / 32 gb\"," +
"		\"price\" : 1808.84," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-j7-pro-32gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 212," +
"		\"brand\" : \"casper\"," +
"		\"model\" : \"vıa a1 çift hat\"," +
"		\"name\" : \"casper vıa a1 çift hat\"," +
"		\"price\" : 1997.74," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/casper-via-a1-cift-sim.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 213," +
"		\"brand\" : \"casper\"," +
"		\"model\" : \"vıa a1 tek hat\"," +
"		\"name\" : \"casper vıa a1 tek hat\"," +
"		\"price\" : 1289," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/casper-via-a1.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 214," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"redmi 4x 64 gb\"," +
"		\"name\" : \"xiaomi redmi 4x 64 gb\"," +
"		\"price\" : 2298.49," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-redmi-4x-64gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 215," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy j8 32 gb / çift hat\"," +
"		\"name\" : \"samsung galaxy j8 32 gb / çift hat\"," +
"		\"price\" : 1477," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-j8-32gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 216," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy a6 (sm-a600f)\"," +
"		\"name\" : \"samsung galaxy a6 (sm-a600f)\"," +
"		\"price\" : 1869.9," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-a6.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 217," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy a6 çift hat / 64 gb\"," +
"		\"name\" : \"samsung galaxy a6 çift hat / 64 gb\"," +
"		\"price\" : 1571.33," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-a6-duos.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 218," +
"		\"brand\" : \"sony\"," +
"		\"model\" : \"xperia z3 tek hat (d6603)\"," +
"		\"name\" : \"sony xperia z3 tek hat (d6603)\"," +
"		\"price\" : 1049," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/sony-xperia-z3.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 219," +
"		\"brand\" : \"huawei\"," +
"		\"model\" : \"y7 2019\"," +
"		\"name\" : \"huawei y7 2019\"," +
"		\"price\" : 1499.9," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/huawei-y7-2019.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 220," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy j6 çift hat / 64 gb\"," +
"		\"name\" : \"samsung galaxy j6 çift hat / 64 gb\"," +
"		\"price\" : 1279," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-j6-64gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 221," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy j7 prime 2 duos çift hat (sm-g611f/ds)\"," +
"		\"name\" : \"samsung galaxy j7 prime 2 duos çift hat (sm-g611f/ds)\"," +
"		\"price\" : 1285," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-j7-prime-2-duos.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 222," +
"		\"brand\" : \"blackberry\"," +
"		\"model\" : \"keyone\"," +
"		\"name\" : \"blackberry keyone\"," +
"		\"price\" : 2119," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/blackberry-keyone.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 223," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy on7 prime\"," +
"		\"name\" : \"samsung galaxy on7 prime\"," +
"		\"price\" : 1425," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-on7-prime.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 224," +
"		\"brand\" : \"casper\"," +
"		\"model\" : \"vıa g3\"," +
"		\"name\" : \"casper vıa g3\"," +
"		\"price\" : 1259," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/casper-via-g3.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 225," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy s6 edge 32 gb (sm-g925f)\"," +
"		\"name\" : \"samsung galaxy s6 edge 32 gb (sm-g925f)\"," +
"		\"price\" : 1699," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-s6-edge.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 226," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"redmi 6 64 gb / 3 gb\"," +
"		\"name\" : \"xiaomi redmi 6 64 gb / 3 gb\"," +
"		\"price\" : 1189.9," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-redmi-6-64gb-3gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 227," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy c8 32 gb (sm-c7100)\"," +
"		\"name\" : \"samsung galaxy c8 32 gb (sm-c7100)\"," +
"		\"price\" : 1369," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-c8.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 228," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy c7 32 gb (sm-c7000)\"," +
"		\"name\" : \"samsung galaxy c7 32 gb (sm-c7000)\"," +
"		\"price\" : 1519," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-c7.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 229," +
"		\"brand\" : \"huawei\"," +
"		\"model\" : \"mate 20 lite 64 gb 6.3 inç 20 mp akıllı cep telefonu siyah\"," +
"		\"name\" : \"huawei mate 20 lite 64 gb 6.3 inç 20 mp akıllı cep telefonu siyah\"," +
"		\"price\" : 2169," +
"		\"source\" : \"https://www.cimri.com/cep-telefonlari/en-ucuz-huawei-mate-20-lite-64gb-6-3-inc-20-mp-akilli-cep-telefonu-siyah-fiyatlari,96333236\"" +
"	}," +
"	{" +
"		\"id\" : 230," +
"		\"brand\" : \"huawei\"," +
"		\"model\" : \"p20 lite 64 gb 5.84 inç 16 mp akıllı cep telefonu siyah\"," +
"		\"name\" : \"huawei p20 lite 64 gb 5.84 inç 16 mp akıllı cep telefonu siyah\"," +
"		\"price\" : 1769," +
"		\"source\" : \"https://www.cimri.com/cep-telefonlari/en-ucuz-huawei-p20-lite-64gb-siyah-fiyatlari,75180141\"" +
"	}," +
"	{" +
"		\"id\" : 231," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy m20 32gb 6.3 inç 13mp akıllı cep telefonu koyu mavi\"," +
"		\"name\" : \"samsung galaxy m20 32gb 6.3 inç 13mp akıllı cep telefonu koyu mavi\"," +
"		\"price\" : 1464," +
"		\"source\" : \"https://www.cimri.com/cep-telefonlari/en-ucuz-samsung-galaxy-m20-32gb-6-3-inc-13mp-akilli-cep-telefonu-koyu-mavi-fiyatlari,150474716\"" +
"	}," +
"	{" +
"		\"id\" : 232," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"mi 8 lite 128gb 6.26 inç 12mp çift hatlı akıllı cep telefonu siyah\"," +
"		\"name\" : \"xiaomi mi 8 lite 128gb 6.26 inç 12mp çift hatlı akıllı cep telefonu siyah\"," +
"		\"price\" : 2429," +
"		\"source\" : \"https://www.cimri.com/cep-telefonlari/en-ucuz-xiaomi-mi-8-lite-128gb-6-26-inc-12mp-cift-hatli-akilli-cep-telefonu-siyah-fiyatlari,117120421\"" +
"	}," +
"	{" +
"		\"id\" : 233," +
"		\"brand\" : \"huawei\"," +
"		\"model\" : \"p smart 2019 64gb 6.21 inç 13mp akıllı cep telefonu mavi\"," +
"		\"name\" : \"huawei p smart 2019 64gb 6.21 inç 13mp akıllı cep telefonu mavi\"," +
"		\"price\" : 1699," +
"		\"source\" : \"https://www.cimri.com/cep-telefonlari/en-ucuz-huawei-p-smart-2019-64gb-6-21-inc-13mp-akilli-cep-telefonu-mavi-fiyatlari,133829161\"" +
"	}," +
"	{" +
"		\"id\" : 234," +
"		\"brand\" : \"huawei\"," +
"		\"model\" : \"mate 20 lite 64gb 6.3 inç 20 mp akıllı cep telefonu altın\"," +
"		\"name\" : \"huawei mate 20 lite 64gb 6.3 inç 20 mp akıllı cep telefonu altın\"," +
"		\"price\" : 2149," +
"		\"source\" : \"https://www.cimri.com/cep-telefonlari/en-ucuz-huawei-mate-20-lite-64gb-6-3-inc-20-mp-akilli-cep-telefonu-altin-fiyatlari,117386254\"" +
"	}," +
"	{" +
"		\"id\" : 235," +
"		\"brand\" : \"apple\"," +
"		\"model\" : \"iphone 7 32 gb 4.7 inç 12 mp akıllı cep telefonu siyah\"," +
"		\"name\" : \"apple iphone 7 32 gb 4.7 inç 12 mp akıllı cep telefonu siyah\"," +
"		\"price\" : 3152.9," +
"		\"source\" : \"https://www.cimri.com/cep-telefonlari/en-ucuz-apple-iphone-7-32-gb-siyah-fiyatlari,25897420\"" +
"	}," +
"	{" +
"		\"id\" : 236," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"mi 8 lite 64gb 6.26 inç çift hatlı 12mp akıllı cep telefonu siyah\"," +
"		\"name\" : \"xiaomi mi 8 lite 64gb 6.26 inç çift hatlı 12mp akıllı cep telefonu siyah\"," +
"		\"price\" : 1969," +
"		\"source\" : \"https://www.cimri.com/cep-telefonlari/en-ucuz-xiaomi-mi-8-lite-64gb-6-26-inc-cift-hatli-12mp-akilli-cep-telefonu-siyah-fiyatlari,105499420\"" +
"	}," +
"	{" +
"		\"id\" : 237," +
"		\"brand\" : \"apple\"," +
"		\"model\" : \"iphone 7 plus 32 gb 5.5 inç 12 mp akıllı cep telefonu siyah\"," +
"		\"name\" : \"apple iphone 7 plus 32 gb 5.5 inç 12 mp akıllı cep telefonu siyah\"," +
"		\"price\" : 3599," +
"		\"source\" : \"https://www.cimri.com/cep-telefonlari/en-ucuz-apple-iphone-7-plus-32-gb-siyah-fiyatlari,25897383\"" +
"	}," +
"	{" +
"		\"id\" : 238," +
"		\"brand\" : \"huawei\"," +
"		\"model\" : \"p smart 2019 64gb 6.21 inç 13mp akıllı cep telefonu siyah\"," +
"		\"name\" : \"huawei p smart 2019 64gb 6.21 inç 13mp akıllı cep telefonu siyah\"," +
"		\"price\" : 1677," +
"		\"source\" : \"https://www.cimri.com/cep-telefonlari/en-ucuz-huawei-p-smart-2019-64gb-6-21-inc-13mp-akilli-cep-telefonu-siyah-fiyatlari,133829182\"" +
"	}," +
"	{" +
"		\"id\" : 239," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy m20 32gb\"," +
"		\"name\" : \"samsung galaxy m20 32gb\"," +
"		\"price\" : 1464," +
"		\"source\" : \"https://www.cimri.com/cep-telefonlari/en-ucuz-samsung-galaxy-m20-32gb-fiyatlari,a150475398\"" +
"	}," +
"	{" +
"		\"id\" : 240," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"mi 8 128 gb 6.21 inç çift hatlı 12 mp akıllı cep telefonu siyah\"," +
"		\"name\" : \"xiaomi mi 8 128 gb 6.21 inç çift hatlı 12 mp akıllı cep telefonu siyah\"," +
"		\"price\" : 3049," +
"		\"source\" : \"https://www.cimri.com/cep-telefonlari/en-ucuz-xiaomi-mi-8-128gb-6-21-inc-cift-hatli-12-mp-akilli-cep-telefonu-siyah-fiyatlari,94962807\"" +
"	}," +
"	{" +
"		\"id\" : 241," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy note 8 64gb siyah\"," +
"		\"name\" : \"samsung galaxy note 8 64gb siyah\"," +
"		\"price\" : 3839," +
"		\"source\" : \"https://www.cimri.com/cep-telefonlari/en-ucuz-samsung-galaxy-note-8-64gb-siyah-fiyatlari,47650839\"" +
"	}," +
"	{" +
"		\"id\" : 242," +
"		\"brand\" : \"huawei\"," +
"		\"model\" : \"mate 20 pro 128 gb 6.39 inç 40 mp akıllı cep telefonu siyah\"," +
"		\"name\" : \"huawei mate 20 pro 128 gb 6.39 inç 40 mp akıllı cep telefonu siyah\"," +
"		\"price\" : 5739," +
"		\"source\" : \"https://www.cimri.com/cep-telefonlari/en-ucuz-huawei-mate-20-pro-128gb-6-39-inc-40mp-akilli-cep-telefonu-siyah-fiyatlari,110362977\"" +
"	}," +
"	{" +
"		\"id\" : 243," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"mi 8 lite 128gb\"," +
"		\"name\" : \"xiaomi mi 8 lite 128gb\"," +
"		\"price\" : 2429," +
"		\"source\" : \"https://www.cimri.com/cep-telefonlari/en-ucuz-xiaomi-mi-8-lite-128gb-fiyatlari,a130189959\"" +
"	}," +
"	{" +
"		\"id\" : 244," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy j6 plus 32 gb 6.0 inç 13 mp akıllı cep telefonu siyah\"," +
"		\"name\" : \"samsung galaxy j6 plus 32 gb 6.0 inç 13 mp akıllı cep telefonu siyah\"," +
"		\"price\" : 1189.9," +
"		\"source\" : \"https://www.cimri.com/cep-telefonlari/en-ucuz-samsung-galaxy-j6-plus-32gb-6-0-inc-13mp-akilli-cep-telefonu-siyah-fiyatlari,104976009\"" +
"	}," +
"	{" +
"		\"id\" : 245," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy a9 2018 128gb 6.3 inç 24mp akıllı cep telefonu siyah\"," +
"		\"name\" : \"samsung galaxy a9 2018 128gb 6.3 inç 24mp akıllı cep telefonu siyah\"," +
"		\"price\" : 2799," +
"		\"source\" : \"https://www.cimri.com/cep-telefonlari/en-ucuz-samsung-galaxy-a9-2018-128gb-6-3-inc-24mp-akilli-cep-telefonu-siyah-fiyatlari,119865855\"" +
"	}," +
"	{" +
"		\"id\" : 246," +
"		\"brand\" : \"huawei\"," +
"		\"model\" : \"p20 pro 128 gb 6.1 inç 40 mp akıllı cep telefonu siyah\"," +
"		\"name\" : \"huawei p20 pro 128 gb 6.1 inç 40 mp akıllı cep telefonu siyah\"," +
"		\"price\" : 4599," +
"		\"source\" : \"https://www.cimri.com/cep-telefonlari/en-ucuz-huawei-p20-pro-128gb-siyah-fiyatlari,73117710\"" +
"	}," +
"	{" +
"		\"id\" : 247," +
"		\"brand\" : \"apple\"," +
"		\"model\" : \"iphone x 64 gb 5.8 inç 12 mp akıllı cep telefonu uzay grisi\"," +
"		\"name\" : \"apple iphone x 64 gb 5.8 inç 12 mp akıllı cep telefonu uzay grisi\"," +
"		\"price\" : 7645," +
"		\"source\" : \"https://www.cimri.com/cep-telefonlari/en-ucuz-apple-iphone-x-64gb-uzay-grisi-fiyatlari,50633287\"" +
"	}," +
"	{" +
"		\"id\" : 248," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy a7 2018 64 gb 6.0 inç 24 mp akıllı cep telefonu siyah\"," +
"		\"name\" : \"samsung galaxy a7 2018 64 gb 6.0 inç 24 mp akıllı cep telefonu siyah\"," +
"		\"price\" : 1864.9," +
"		\"source\" : \"https://www.cimri.com/cep-telefonlari/en-ucuz-samsung-galaxy-a7-2018-64gb-6-0-inc-24mp-akilli-cep-telefonu-siyah-fiyatlari,107651216\"" +
"	}," +
"	{" +
"		\"id\" : 249," +
"		\"brand\" : \"huawei\"," +
"		\"model\" : \"p20 pro 128 gb 6.1 inç 40 mp akıllı cep telefonu\"," +
"		\"name\" : \"huawei p20 pro 128 gb 6.1 inç 40 mp akıllı cep telefonu\"," +
"		\"price\" : 4599," +
"		\"source\" : \"https://www.cimri.com/cep-telefonlari/en-ucuz-huawei-p20-pro-128gb-fiyatlari,a73117934\"" +
"	}," +
"	{" +
"		\"id\" : 250," +
"		\"brand\" : \"apple\"," +
"		\"model\" : \"iphone 7 32 gb 4.7 inç 12 mp akıllı cep telefonu\"," +
"		\"name\" : \"apple iphone 7 32 gb 4.7 inç 12 mp akıllı cep telefonu\"," +
"		\"price\" : 3152.9," +
"		\"source\" : \"https://www.cimri.com/cep-telefonlari/en-ucuz-apple-iphone-7-32-gb-fiyatlari,a29358021\"" +
"	}," +
"	{" +
"		\"id\" : 251," +
"		\"brand\" : \"huawei\"," +
"		\"model\" : \"mate 20 lite 64 gb 6.3 inç 20 mp akıllı cep telefonu \"," +
"		\"name\" : \"huawei mate 20 lite 64 gb 6.3 inç 20 mp akıllı cep telefonu \"," +
"		\"price\" : 2149," +
"		\"source\" : \"https://www.cimri.com/cep-telefonlari/en-ucuz-huawei-mate-20-lite-64gb-fiyatlari,a101726024\"" +
"	}," +
"	{" +
"		\"id\" : 252," +
"		\"brand\" : \"huawei\"," +
"		\"model\" : \"mate 20 lite 64 gb 6.3 inç 20 mp akıllı cep telefonu mavi\"," +
"		\"name\" : \"huawei mate 20 lite 64 gb 6.3 inç 20 mp akıllı cep telefonu mavi\"," +
"		\"price\" : 2229.9," +
"		\"source\" : \"https://www.cimri.com/cep-telefonlari/en-ucuz-huawei-mate-20-lite-64gb-6-3-inc-20-mp-akilli-cep-telefonu-mavi-fiyatlari,101725938\"" +
"	}," +
"	{" +
"		\"id\" : 253," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"mi 8 lite 128gb 6.26 inç 12mp çift hatlı akıllı cep telefonu mavi\"," +
"		\"name\" : \"xiaomi mi 8 lite 128gb 6.26 inç 12mp çift hatlı akıllı cep telefonu mavi\"," +
"		\"price\" : 2599," +
"		\"source\" : \"https://www.cimri.com/cep-telefonlari/en-ucuz-xiaomi-mi-8-lite-128gb-6-26-inc-12mp-cift-hatli-akilli-cep-telefonu-mavi-fiyatlari,122009765\"" +
"	}," +
"	{" +
"		\"id\" : 254," +
"		\"brand\" : \"huawei\"," +
"		\"model\" : \"p20 lite 64 gb 5.84 inç 16 mp akıllı cep telefonu mavi\"," +
"		\"name\" : \"huawei p20 lite 64 gb 5.84 inç 16 mp akıllı cep telefonu mavi\"," +
"		\"price\" : 1819," +
"		\"source\" : \"https://www.cimri.com/cep-telefonlari/en-ucuz-huawei-p20-lite-64gb-mavi-fiyatlari,75180531\"" +
"	}," +
"	{" +
"		\"id\" : 255," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"mi 8 lite 64gb\"," +
"		\"name\" : \"xiaomi mi 8 lite 64gb\"," +
"		\"price\" : 1969," +
"		\"source\" : \"https://www.cimri.com/cep-telefonlari/en-ucuz-xiaomi-mi-8-lite-64gb-fiyatlari,a105499650\"" +
"	}," +
"	{" +
"		\"id\" : 256," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy note 9 128 gb 6.4 inç 12 mp akıllı cep telefonu\"," +
"		\"name\" : \"samsung galaxy note 9 128 gb 6.4 inç 12 mp akıllı cep telefonu\"," +
"		\"price\" : 5382," +
"		\"source\" : \"https://www.cimri.com/cep-telefonlari/en-ucuz-samsung-galaxy-note-9-128gb-fiyatlari,a97118368\"" +
"	}," +
"	{" +
"		\"id\" : 257," +
"		\"brand\" : \"huawei\"," +
"		\"model\" : \"mate 10 lite 64 gb 5.9 inç çift hatlı 16 mp akıllı cep telefonu siyah\"," +
"		\"name\" : \"huawei mate 10 lite 64 gb 5.9 inç çift hatlı 16 mp akıllı cep telefonu siyah\"," +
"		\"price\" : 1649," +
"		\"source\" : \"https://www.cimri.com/cep-telefonlari/en-ucuz-huawei-mate-10-lite-64gb-siyah-fiyatlari,60584569\"" +
"	}," +
"	{" +
"		\"id\" : 258," +
"		\"brand\" : \"huawei\"," +
"		\"model\" : \"p smart 2019 64gb\"," +
"		\"name\" : \"huawei p smart 2019 64gb\"," +
"		\"price\" : 1677," +
"		\"source\" : \"https://www.cimri.com/cep-telefonlari/en-ucuz-huawei-p-smart-2019-64gb-fiyatlari,a133829249\"" +
"	}," +
"	{" +
"		\"id\" : 259," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy m20 32gb 6.3 inç 13mp akıllı cep telefonu koyu gri\"," +
"		\"name\" : \"samsung galaxy m20 32gb 6.3 inç 13mp akıllı cep telefonu koyu gri\"," +
"		\"price\" : 1464," +
"		\"source\" : \"https://www.cimri.com/cep-telefonlari/en-ucuz-samsung-galaxy-m20-32gb-6-3-inc-13mp-akilli-cep-telefonu-koyu-gri-fiyatlari,150473795\"" +
"	}," +
"	{" +
"		\"id\" : 260," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy note 9 128 gb 6.4 inç 12 mp akıllı cep telefonu mavi\"," +
"		\"name\" : \"samsung galaxy note 9 128 gb 6.4 inç 12 mp akıllı cep telefonu mavi\"," +
"		\"price\" : 5635," +
"		\"source\" : \"https://www.cimri.com/cep-telefonlari/en-ucuz-samsung-galaxy-note-9-128gb-6-4-inc-12mp-akilli-cep-telefonu-mavi-fiyatlari,97118338\"" +
"	}," +
"	{" +
"		\"id\" : 261," +
"		\"brand\" : \"casper\"," +
"		\"model\" : \"vıa g3 32gb\"," +
"		\"name\" : \"casper vıa g3 32gb\"," +
"		\"price\" : 1279," +
"		\"source\" : \"https://www.cimri.com/cep-telefonlari/en-ucuz-casper-via-g3-32gb-fiyatlari,a135400605\"" +
"	}," +
"	{" +
"		\"id\" : 262," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy m20 32gb\"," +
"		\"name\" : \"samsung galaxy m20 32gb\"," +
"		\"price\" : 1464," +
"		\"source\" : \"https://www.cimri.com/cep-telefonlari/en-ucuz-samsung-galaxy-m20-32gb-fiyatlari,a150475398\"" +
"	}," +
"	{" +
"		\"id\" : 263," +
"		\"brand\" : \"oppo\"," +
"		\"model\" : \"rx17 pro 128gb\"," +
"		\"name\" : \"oppo rx17 pro 128gb\"," +
"		\"price\" : 4994," +
"		\"source\" : \"https://www.cimri.com/cep-telefonlari/en-ucuz-oppo-rx17-pro-128gb-fiyatlari,a151510952\"" +
"	}," +
"	{" +
"		\"id\" : 264," +
"		\"brand\" : \"huawei\"," +
"		\"model\" : \"mate 20 lite\"," +
"		\"name\" : \"huawei mate 20 lite\"," +
"		\"price\" : 2219," +
"		\"source\" : \"https://www.akakce.com/cep-telefonu/en-ucuz-huawei-mate-20-lite-fiyati,298095766.html\"" +
"	}," +
"	{" +
"		\"id\" : 265," +
"		\"brand\" : \"huawei\"," +
"		\"model\" : \"p20 lite\"," +
"		\"name\" : \"huawei p20 lite\"," +
"		\"price\" : 1819," +
"		\"source\" : \"https://www.akakce.com/cep-telefonu/en-ucuz-huawei-p20-lite-fiyati,203392931.html\"" +
"	}," +
"	{" +
"		\"id\" : 266," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"mi 8 lite 64gb\"," +
"		\"name\" : \"xiaomi mi 8 lite 64gb\"," +
"		\"price\" : 1698," +
"		\"source\" : \"https://www.akakce.com/cep-telefonu/en-ucuz-xiaomi-mi-8-lite-64gb-fiyati,370809603.html\"" +
"	}," +
"	{" +
"		\"id\" : 267," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy note 9 128gb\"," +
"		\"name\" : \"samsung galaxy note 9 128gb\"," +
"		\"price\" : 4999," +
"		\"source\" : \"https://www.akakce.com/cep-telefonu/en-ucuz-samsung-galaxy-note-9-128gb-fiyati,210254764.html\"" +
"	}," +
"	{" +
"		\"id\" : 268," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy note 8 64gb\"," +
"		\"name\" : \"samsung galaxy note 8 64gb\"," +
"		\"price\" : 3704," +
"		\"source\" : \"https://www.akakce.com/cep-telefonu/en-ucuz-samsung-galaxy-note-8-64gb-fiyati,62036117.html\"" +
"	}," +
"	{" +
"		\"id\" : 269," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"mi 8 lite 128gb\"," +
"		\"name\" : \"xiaomi mi 8 lite 128gb\"," +
"		\"price\" : 1937," +
"		\"source\" : \"https://www.akakce.com/cep-telefonu/en-ucuz-xiaomi-mi-8-lite-128gb-fiyati,334414815.html\"" +
"	}," +
"	{" +
"		\"id\" : 270," +
"		\"brand\" : \"huawei\"," +
"		\"model\" : \"mate 10 lite\"," +
"		\"name\" : \"huawei mate 10 lite\"," +
"		\"price\" : 1599," +
"		\"source\" : \"https://www.akakce.com/cep-telefonu/en-ucuz-huawei-mate-10-lite-fiyati,103399262.html\"" +
"	}," +
"	{" +
"		\"id\" : 271," +
"		\"brand\" : \"huawei\"," +
"		\"model\" : \"p smart\"," +
"		\"name\" : \"huawei p smart\"," +
"		\"price\" : 1289," +
"		\"source\" : \"https://www.akakce.com/cep-telefonu/en-ucuz-huawei-p-smart-fiyati,205797577.html\"" +
"	}," +
"	{" +
"		\"id\" : 272," +
"		\"brand\" : \"huawei\"," +
"		\"model\" : \"mate 20 lite mavi\"," +
"		\"name\" : \"huawei mate 20 lite mavi\"," +
"		\"price\" : 2219," +
"		\"source\" : \"https://www.akakce.com/cep-telefonu/en-ucuz-huawei-mate-20-lite-mavi-fiyati,341815607.html\"" +
"	}," +
"	{" +
"		\"id\" : 273," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"mi a2 lite 64gb\"," +
"		\"name\" : \"xiaomi mi a2 lite 64gb\"," +
"		\"price\" : 1389," +
"		\"source\" : \"https://www.akakce.com/cep-telefonu/en-ucuz-xiaomi-mi-a2-lite-64gb-fiyati,319123049.html\"" +
"	}," +
"	{" +
"		\"id\" : 274," +
"		\"brand\" : \"iphone\"," +
"		\"model\" : \"8 plus 64gb\"," +
"		\"name\" : \"iphone 8 plus 64gb\"," +
"		\"price\" : 5799," +
"		\"source\" : \"https://www.akakce.com/cep-telefonu/en-ucuz-iphone-8-plus-64gb-fiyati,99936014.html\"" +
"	}," +
"	{" +
"		\"id\" : 275," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy a7 2018 64gb\"," +
"		\"name\" : \"samsung galaxy a7 2018 64gb\"," +
"		\"price\" : 1994," +
"		\"source\" : \"https://www.akakce.com/cep-telefonu/en-ucuz-samsung-galaxy-a7-2018-64gb-fiyati,101086164.html\"" +
"	}," +
"	{" +
"		\"id\" : 276," +
"		\"brand\" : \"iphone\"," +
"		\"model\" : \"8 64gb\"," +
"		\"name\" : \"iphone 8 64gb\"," +
"		\"price\" : 4274," +
"		\"source\" : \"https://www.akakce.com/cep-telefonu/en-ucuz-iphone-8-64gb-fiyati,99977410.html\"" +
"	}," +
"	{" +
"		\"id\" : 277," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"mi a2 lite 32gb\"," +
"		\"name\" : \"xiaomi mi a2 lite 32gb\"," +
"		\"price\" : 1227," +
"		\"source\" : \"https://www.akakce.com/cep-telefonu/en-ucuz-xiaomi-mi-a2-lite-32gb-fiyati,266196237.html\"" +
"	}," +
"	{" +
"		\"id\" : 278," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"redmi 5 plus 64gb\"," +
"		\"name\" : \"xiaomi redmi 5 plus 64gb\"," +
"		\"price\" : 1277," +
"		\"source\" : \"https://www.akakce.com/cep-telefonu/en-ucuz-xiaomi-redmi-5-plus-64gb-fiyati,243186726.html\"" +
"	}," +
"	{" +
"		\"id\" : 279," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy s9 plus 64gb\"," +
"		\"name\" : \"samsung galaxy s9 plus 64gb\"," +
"		\"price\" : 3946," +
"		\"source\" : \"https://www.akakce.com/cep-telefonu/en-ucuz-samsung-galaxy-s9-plus-64gb-fiyati,108011459.html\"" +
"	}," +
"	{" +
"		\"id\" : 280," +
"		\"brand\" : \"huawei\"," +
"		\"model\" : \"mate 20 lite siyah\"," +
"		\"name\" : \"huawei mate 20 lite siyah\"," +
"		\"price\" : 2219," +
"		\"source\" : \"https://www.akakce.com/cep-telefonu/en-ucuz-huawei-mate-20-lite-siyah-fiyati,341815606.html\"" +
"	}," +
"	{" +
"		\"id\" : 281," +
"		\"brand\" : \"iphone\"," +
"		\"model\" : \"7 32gb\"," +
"		\"name\" : \"iphone 7 32gb\"," +
"		\"price\" : 3229," +
"		\"source\" : \"https://www.akakce.com/cep-telefonu/en-ucuz-iphone-7-32gb-fiyati,7457514.html\"" +
"	}," +
"	{" +
"		\"id\" : 282," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy j6 plus 32gb\"," +
"		\"name\" : \"samsung galaxy j6 plus 32gb\"," +
"		\"price\" : 1259," +
"		\"source\" : \"https://www.akakce.com/cep-telefonu/en-ucuz-samsung-galaxy-j6-plus-32gb-fiyati,282782870.html\"" +
"	}," +
"	{" +
"		\"id\" : 283," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"mi a2 64gb\"," +
"		\"name\" : \"xiaomi mi a2 64gb\"," +
"		\"price\" : 1579," +
"		\"source\" : \"https://www.akakce.com/cep-telefonu/en-ucuz-xiaomi-mi-a2-64gb-fiyati,306543123.html\"" +
"	}," +
"	{" +
"		\"id\" : 284," +
"		\"brand\" : \"iphone\"," +
"		\"model\" : \"x 64gb\"," +
"		\"name\" : \"iphone x 64gb\"," +
"		\"price\" : 7299," +
"		\"source\" : \"https://www.akakce.com/cep-telefonu/en-ucuz-iphone-x-64gb-fiyati,99936015.html\"" +
"	}," +
"	{" +
"		\"id\" : 285," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy s10+ plus 512 gb\"," +
"		\"name\" : \"samsung galaxy s10+ plus 512 gb\"," +
"		\"price\" : 8499," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-s10-plus-512gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 286," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy s10+ plus (sm-g975f)\"," +
"		\"name\" : \"samsung galaxy s10+ plus (sm-g975f)\"," +
"		\"price\" : 6529," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-s10-plus.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 287," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy s10 (sm-g973f)\"," +
"		\"name\" : \"samsung galaxy s10 (sm-g973f)\"," +
"		\"price\" : 5499," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-s10.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 288," +
"		\"brand\" : \"huawei\"," +
"		\"model\" : \"mate 20 pro (lya-l09)\"," +
"		\"name\" : \"huawei mate 20 pro (lya-l09)\"," +
"		\"price\" : 5769," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/huawei-mate-20-pro.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 289," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy s10e (sm-g970f)\"," +
"		\"name\" : \"samsung galaxy s10e (sm-g970f)\"," +
"		\"price\" : 4454.8," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-s10e.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 290," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy note 9 tek hat / 512 gb (sm-n960f)\"," +
"		\"name\" : \"samsung galaxy note 9 tek hat / 512 gb (sm-n960f)\"," +
"		\"price\" : 6434," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-note-9-512gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 291," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy note 9 (sm-n960f)\"," +
"		\"name\" : \"samsung galaxy note 9 (sm-n960f)\"," +
"		\"price\" : 5389," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-note9.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 292," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy s9+ (plus) 256 gb\"," +
"		\"name\" : \"samsung galaxy s9+ (plus) 256 gb\"," +
"		\"price\" : 5199," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-s9-plus-256gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 293," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy s9+ (plus) 128 gb\"," +
"		\"name\" : \"samsung galaxy s9+ (plus) 128 gb\"," +
"		\"price\" : 4650," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-s9-plus-128gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 294," +
"		\"brand\" : \"apple\"," +
"		\"model\" : \"iphone xs max 512 gb (mt582tu/a, mt572tu/a, mt562tu/a)\"," +
"		\"name\" : \"apple iphone xs max 512 gb (mt582tu/a, mt572tu/a, mt562tu/a)\"," +
"		\"price\" : 12886.1," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/apple-iphone-xs-max-512gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 295," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy s9+ (plus) (sm-g965f)\"," +
"		\"name\" : \"samsung galaxy s9+ (plus) (sm-g965f)\"," +
"		\"price\" : 4183.9," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-s9-plus.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 296," +
"		\"brand\" : \"apple\"," +
"		\"model\" : \"iphone xs max 256 gb (mt532tu/a, mt542tu/a, mt552tu/a)\"," +
"		\"name\" : \"apple iphone xs max 256 gb (mt532tu/a, mt542tu/a, mt552tu/a)\"," +
"		\"price\" : 11195," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/apple-iphone-xs-max-256gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 297," +
"		\"brand\" : \"huawei\"," +
"		\"model\" : \"mate 20 (hma-l29)\"," +
"		\"name\" : \"huawei mate 20 (hma-l29)\"," +
"		\"price\" : 5249," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/huawei-mate-20.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 298," +
"		\"brand\" : \"apple\"," +
"		\"model\" : \"iphone xs max (mt512tu/a, mt522tu/a, mt502tu/a)\"," +
"		\"name\" : \"apple iphone xs max (mt512tu/a, mt522tu/a, mt502tu/a)\"," +
"		\"price\" : 9584.9," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/apple-iphone-xs-max.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 299," +
"		\"brand\" : \"lg\"," +
"		\"model\" : \"g7 thinq (g710)\"," +
"		\"name\" : \"lg g7 thinq (g710)\"," +
"		\"price\" : 2959," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/lg-g7-thinq.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 300," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy s9 (sm-g960f)\"," +
"		\"name\" : \"samsung galaxy s9 (sm-g960f)\"," +
"		\"price\" : 3734," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-s9.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 301," +
"		\"brand\" : \"huawei\"," +
"		\"model\" : \"p20 pro (clt-l09)\"," +
"		\"name\" : \"huawei p20 pro (clt-l09)\"," +
"		\"price\" : 4599," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/huawei-p20-pro.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 302," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy note 8 (sm-n950f)\"," +
"		\"name\" : \"samsung galaxy note 8 (sm-n950f)\"," +
"		\"price\" : 4490," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-note-8.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 303," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"pocophone f1 128 gb\"," +
"		\"name\" : \"xiaomi pocophone f1 128 gb\"," +
"		\"price\" : 3500," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-pocophone-f1-128gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 304," +
"		\"brand\" : \"oneplus\"," +
"		\"model\" : \"6 128 gb / 8 gb\"," +
"		\"name\" : \"oneplus 6 128 gb / 8 gb\"," +
"		\"price\" : 3939," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/oneplus-6-128gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 305," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"pocophone f1\"," +
"		\"name\" : \"xiaomi pocophone f1\"," +
"		\"price\" : 2879," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/pocophone-f1.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 306," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"mi mix 3\"," +
"		\"name\" : \"xiaomi mi mix 3\"," +
"		\"price\" : 4279.9," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-mi-mix-3.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 307," +
"		\"brand\" : \"asus\"," +
"		\"model\" : \"zenfone 5z (zs620kl)\"," +
"		\"name\" : \"asus zenfone 5z (zs620kl)\"," +
"		\"price\" : 3295," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/asus-zenfone-5z.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 308," +
"		\"brand\" : \"huawei\"," +
"		\"model\" : \"mate 10 pro tek hat / 128 gb (bla-l09)\"," +
"		\"name\" : \"huawei mate 10 pro tek hat / 128 gb (bla-l09)\"," +
"		\"price\" : 4260," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/huawei-mate-10-pro.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 309," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy s8+ plus tek hat (sm-g955f)\"," +
"		\"name\" : \"samsung galaxy s8+ plus tek hat (sm-g955f)\"," +
"		\"price\" : 3349.9," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-s8-plus.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 310," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"mi 8 pro\"," +
"		\"name\" : \"xiaomi mi 8 pro\"," +
"		\"price\" : 3879," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-mi-8-pro.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 311," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"mi 8 128 gb\"," +
"		\"name\" : \"xiaomi mi 8 128 gb\"," +
"		\"price\" : 3200," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-mi-8-128gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 312," +
"		\"brand\" : \"oneplus\"," +
"		\"model\" : \"6 64 gb / 6 gb\"," +
"		\"name\" : \"oneplus 6 64 gb / 6 gb\"," +
"		\"price\" : 3499," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/oneplus-6.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 313," +
"		\"brand\" : \"sony\"," +
"		\"model\" : \"xperia xz premium (g8141)\"," +
"		\"name\" : \"sony xperia xz premium (g8141)\"," +
"		\"price\" : 3499," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/sony-xperia-xz-premium.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 314," +
"		\"brand\" : \"apple\"," +
"		\"model\" : \"iphone xs 64 gb (mt9e2tu/a, mt9g2tu/a, mt9f2tu/a)\"," +
"		\"name\" : \"apple iphone xs 64 gb (mt9e2tu/a, mt9g2tu/a, mt9f2tu/a)\"," +
"		\"price\" : 8780," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/apple-iphone-xs.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 315," +
"		\"brand\" : \"lg\"," +
"		\"model\" : \"v30+ plus tek hat / 128 gb\"," +
"		\"name\" : \"lg v30+ plus tek hat / 128 gb\"," +
"		\"price\" : 2689," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/lg-v30-plus.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 316," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"mi mıx 2s 6 gb / 128 gb\"," +
"		\"name\" : \"xiaomi mi mıx 2s 6 gb / 128 gb\"," +
"		\"price\" : 3499," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-mi-mix-2s-128gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 317," +
"		\"brand\" : \"apple\"," +
"		\"model\" : \"iphone xr 256 gb (mryj2tu/a, mryq2tu/a, mryp2tu/a, mryn2tu/a, mrym2tu/a, mryl2tu/a)\"," +
"		\"name\" : \"apple iphone xr 256 gb (mryj2tu/a, mryq2tu/a, mryp2tu/a, mryn2tu/a, mrym2tu/a, mryl2tu/a)\"," +
"		\"price\" : 7499," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/apple-iphone-xr-256gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 318," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"mi 8 64 gb\"," +
"		\"name\" : \"xiaomi mi 8 64 gb\"," +
"		\"price\" : 3119," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-mi-8.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 319," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"mi mıx 2s\"," +
"		\"name\" : \"xiaomi mi mıx 2s\"," +
"		\"price\" : 2999.9," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-mi-mix-2s.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 320," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy s8 (sm-g950f)\"," +
"		\"name\" : \"samsung galaxy s8 (sm-g950f)\"," +
"		\"price\" : 3129," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-s8.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 321," +
"		\"brand\" : \"apple\"," +
"		\"model\" : \"iphone xr 128 gb (mryd2tu/a, mryh2tu/a, mryg2tu/a, mryf2tu/a, mrye2tu/a, mry92tu/a)\"," +
"		\"name\" : \"apple iphone xr 128 gb (mryd2tu/a, mryh2tu/a, mryg2tu/a, mryf2tu/a, mrye2tu/a, mry92tu/a)\"," +
"		\"price\" : 6749," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/apple-iphone-xr-128gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 322," +
"		\"brand\" : \"meizu\"," +
"		\"model\" : \"16th 8 gb / 128 gb\"," +
"		\"name\" : \"meizu 16th 8 gb / 128 gb\"," +
"		\"price\" : 3700," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/meizu-16-th-128gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 323," +
"		\"brand\" : \"apple\"," +
"		\"model\" : \"iphone xr (mry42tu/a, mrya2tu/a, mry82tu/a, mry72tu/a, mry62tu/a, mry52tu/a)\"," +
"		\"name\" : \"apple iphone xr (mry42tu/a, mrya2tu/a, mry82tu/a, mry72tu/a, mry62tu/a, mry52tu/a)\"," +
"		\"price\" : 6359," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/apple-iphone-xr.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 324," +
"		\"brand\" : \"huawei\"," +
"		\"model\" : \"p20 (eml-l09)\"," +
"		\"name\" : \"huawei p20 (eml-l09)\"," +
"		\"price\" : 3799," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/huawei-p20.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 325," +
"		\"brand\" : \"meizu\"," +
"		\"model\" : \"16th\"," +
"		\"name\" : \"meizu 16th\"," +
"		\"price\" : 2894," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/meizu-16-th.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 326," +
"		\"brand\" : \"oppo\"," +
"		\"model\" : \"rx17 pro\"," +
"		\"name\" : \"oppo rx17 pro\"," +
"		\"price\" : 4994," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/oppo-rx17-pro.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 327," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"mi 6 128 gb / 6 gb\"," +
"		\"name\" : \"xiaomi mi 6 128 gb / 6 gb\"," +
"		\"price\" : 2599," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-mi-6-128gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 328," +
"		\"brand\" : \"oneplus\"," +
"		\"model\" : \"5t 128 gb\"," +
"		\"name\" : \"oneplus 5t 128 gb\"," +
"		\"price\" : 3229," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/oneplus-5t-128gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 329," +
"		\"brand\" : \"honor\"," +
"		\"model\" : \"10 (col-l29)\"," +
"		\"name\" : \"honor 10 (col-l29)\"," +
"		\"price\" : 2789," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/honor-10.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 330," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"redmi note 7\"," +
"		\"name\" : \"xiaomi redmi note 7\"," +
"		\"price\" : 2658.86," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/redmi-note-7.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 331," +
"		\"brand\" : \"lg\"," +
"		\"model\" : \"g6 tek hat (h870)\"," +
"		\"name\" : \"lg g6 tek hat (h870)\"," +
"		\"price\" : 2049," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/lg-g6.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 332," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"mi 6 64 gb / 6 gb\"," +
"		\"name\" : \"xiaomi mi 6 64 gb / 6 gb\"," +
"		\"price\" : 2499," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-mi-6-64gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 333," +
"		\"brand\" : \"nokia\"," +
"		\"model\" : \"8 (ta-1012)\"," +
"		\"name\" : \"nokia 8 (ta-1012)\"," +
"		\"price\" : 2379," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/nokia-8.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 334," +
"		\"brand\" : \"honor\"," +
"		\"model\" : \"play (cor-l29)\"," +
"		\"name\" : \"honor play (cor-l29)\"," +
"		\"price\" : 2199," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/honor-play.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 335," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy s7 edge tek hat (sm-g935f)\"," +
"		\"name\" : \"samsung galaxy s7 edge tek hat (sm-g935f)\"," +
"		\"price\" : 2098," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-s7-edge.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 336," +
"		\"brand\" : \"apple\"," +
"		\"model\" : \"iphone x 256 gb (mqag2tu/a, mqaf2tu/a)\"," +
"		\"name\" : \"apple iphone x 256 gb (mqag2tu/a, mqaf2tu/a)\"," +
"		\"price\" : 8599," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/apple-iphone-x-256gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 337," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy a50 (sm-a505f)\"," +
"		\"name\" : \"samsung galaxy a50 (sm-a505f)\"," +
"		\"price\" : 2478.67," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-a50.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 338," +
"		\"brand\" : \"oneplus\"," +
"		\"model\" : \"5t 64 gb\"," +
"		\"name\" : \"oneplus 5t 64 gb\"," +
"		\"price\" : 2829.9," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/oneplus-5t.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 339," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"mi 6 64 gb / 4 gb\"," +
"		\"name\" : \"xiaomi mi 6 64 gb / 4 gb\"," +
"		\"price\" : 3534.03," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-mi-6.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 340," +
"		\"brand\" : \"lg\"," +
"		\"model\" : \"v20 (h990)\"," +
"		\"name\" : \"lg v20 (h990)\"," +
"		\"price\" : 2159," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/lg-v20.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 341," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy a9 (2018) (sm-a920f)\"," +
"		\"name\" : \"samsung galaxy a9 (2018) (sm-a920f)\"," +
"		\"price\" : 2730.55," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-a9-2018.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 342," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"mi 8 lite 128 gb / 6 gb\"," +
"		\"name\" : \"xiaomi mi 8 lite 128 gb / 6 gb\"," +
"		\"price\" : 2645," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-mi-8-lite-128gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 343," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"mi mıx 2 128 gb\"," +
"		\"name\" : \"xiaomi mi mıx 2 128 gb\"," +
"		\"price\" : 2649," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-mi-mix-2-128gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 344," +
"		\"brand\" : \"lg\"," +
"		\"model\" : \"g7 fit (lm-q850)\"," +
"		\"name\" : \"lg g7 fit (lm-q850)\"," +
"		\"price\" : 2649.9," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/lg-g7-fit.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 345," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"mi 8 se 6 gb / 64 gb\"," +
"		\"name\" : \"xiaomi mi 8 se 6 gb / 64 gb\"," +
"		\"price\" : 2349," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-mi-8-se-6gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 346," +
"		\"brand\" : \"apple\"," +
"		\"model\" : \"iphone x (mqac2tu/a, mqad2tu/a)\"," +
"		\"name\" : \"apple iphone x (mqac2tu/a, mqad2tu/a)\"," +
"		\"price\" : 7548.9," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/apple-iphone-x.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 347," +
"		\"brand\" : \"general\"," +
"		\"model\" : \"mobile gm 9 pro\"," +
"		\"name\" : \"general mobile gm 9 pro\"," +
"		\"price\" : 1649.9," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/general-mobile-gm-9-pro.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 348," +
"		\"brand\" : \"general\"," +
"		\"model\" : \"mobile gm 9 pro d çift hat\"," +
"		\"name\" : \"general mobile gm 9 pro d çift hat\"," +
"		\"price\" : 1669.9," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/general-mobile-gm-9-pro-d.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 349," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"mi mıx 2 64 gb\"," +
"		\"name\" : \"xiaomi mi mıx 2 64 gb\"," +
"		\"price\" : 2539," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-mi-mix-2.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 350," +
"		\"brand\" : \"umıdıgı\"," +
"		\"model\" : \"z2 pro\"," +
"		\"name\" : \"umıdıgı z2 pro\"," +
"		\"price\" : 2249," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/umidigi-z2-pro.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 351," +
"		\"brand\" : \"huawei\"," +
"		\"model\" : \"mate 20 lite (sne-lx1)\"," +
"		\"name\" : \"huawei mate 20 lite (sne-lx1)\"," +
"		\"price\" : 2149," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/huawei-mate-20-lite.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 352," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"mi max 3\"," +
"		\"name\" : \"xiaomi mi max 3\"," +
"		\"price\" : 1979.9," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-mi-max-3.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 353," +
"		\"brand\" : \"huawei\"," +
"		\"model\" : \"p10 tek hat (vtr-l09)\"," +
"		\"name\" : \"huawei p10 tek hat (vtr-l09)\"," +
"		\"price\" : 3219," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/huawei-p10.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 354," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"mi 8 se\"," +
"		\"name\" : \"xiaomi mi 8 se\"," +
"		\"price\" : 2965," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-mi-8-se.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 355," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"redmi note 6 pro 4 gb / 64 gb\"," +
"		\"name\" : \"xiaomi redmi note 6 pro 4 gb / 64 gb\"," +
"		\"price\" : 1599," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-redmi-note-6-pro-64gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 356," +
"		\"brand\" : \"htc\"," +
"		\"model\" : \"u ultra tek hat\"," +
"		\"name\" : \"htc u ultra tek hat\"," +
"		\"price\" : 1869," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/htc-u-ultra.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 357," +
"		\"brand\" : \"honor\"," +
"		\"model\" : \"8x 128 gb\"," +
"		\"name\" : \"honor 8x 128 gb\"," +
"		\"price\" : 1999," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/honor-8x-128gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 358," +
"		\"brand\" : \"honor\"," +
"		\"model\" : \"8x (jsn-l21)\"," +
"		\"name\" : \"honor 8x (jsn-l21)\"," +
"		\"price\" : 1919.63," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/honor-8x.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 359," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy a8+ plus (2018) çift hat (sm-a730f/ds)\"," +
"		\"name\" : \"samsung galaxy a8+ plus (2018) çift hat (sm-a730f/ds)\"," +
"		\"price\" : 2889.01," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-a8plus-plus-2018-duos.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 360," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy a8+ plus (2018) tek hat (sm-a730f)\"," +
"		\"name\" : \"samsung galaxy a8+ plus (2018) tek hat (sm-a730f)\"," +
"		\"price\" : 2555," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-a8-plus-2018.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 361," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"mi 8 lite\"," +
"		\"name\" : \"xiaomi mi 8 lite\"," +
"		\"price\" : 1975," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-mi-8-lite.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 362," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy s7 tek hat (sm-g930f)\"," +
"		\"name\" : \"samsung galaxy s7 tek hat (sm-g930f)\"," +
"		\"price\" : 2199," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-s7.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 363," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"mi note 3 128 gb\"," +
"		\"name\" : \"xiaomi mi note 3 128 gb\"," +
"		\"price\" : 2099," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-mi-note-3-128gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 364," +
"		\"brand\" : \"apple\"," +
"		\"model\" : \"iphone 8 plus (product)red special edition 256 gb (mrta2tu/a)\"," +
"		\"name\" : \"apple iphone 8 plus (product)red special edition 256 gb (mrta2tu/a)\"," +
"		\"price\" : 6499," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/apple-iphone-8-plus-productred-special-edition-256gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 365," +
"		\"brand\" : \"apple\"," +
"		\"model\" : \"iphone 8 plus 256 gb (mq8p2tu/a, mq8q2tu/a, mq8r2tu/a)\"," +
"		\"name\" : \"apple iphone 8 plus 256 gb (mq8p2tu/a, mq8q2tu/a, mq8r2tu/a)\"," +
"		\"price\" : 7314," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/apple-iphone-8-plus-256gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 366," +
"		\"brand\" : \"huawei\"," +
"		\"model\" : \"mate 20 lite çift hat\"," +
"		\"name\" : \"huawei mate 20 lite çift hat\"," +
"		\"price\" : 2178," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/huawei-mate-20-lite-dual.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 367," +
"		\"brand\" : \"honor\"," +
"		\"model\" : \"8x 64 gb (jsn-l22)\"," +
"		\"name\" : \"honor 8x 64 gb (jsn-l22)\"," +
"		\"price\" : 1950," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/honor-8x-jsn-l22.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 368," +
"		\"brand\" : \"asus\"," +
"		\"model\" : \"zenfone 5 (ze620kl)\"," +
"		\"name\" : \"asus zenfone 5 (ze620kl)\"," +
"		\"price\" : 2197," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/asus-zenfone-5-ze620kl.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 369," +
"		\"brand\" : \"meizu\"," +
"		\"model\" : \"16 128 gb\"," +
"		\"name\" : \"meizu 16 128 gb\"," +
"		\"price\" : 2719," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/meizu-16-128gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 370," +
"		\"brand\" : \"nokia\"," +
"		\"model\" : \"7 plus (ta-1055)\"," +
"		\"name\" : \"nokia 7 plus (ta-1055)\"," +
"		\"price\" : 2589," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/nokia-7-plus.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 371," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"mi note 3 64 gb\"," +
"		\"name\" : \"xiaomi mi note 3 64 gb\"," +
"		\"price\" : 2079," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-mi-note-3.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 372," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"redmi note 5 pro 6 gb\"," +
"		\"name\" : \"xiaomi redmi note 5 pro 6 gb\"," +
"		\"price\" : 1789.9," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-redmi-note-5-pro-6gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 373," +
"		\"brand\" : \"oppo\"," +
"		\"model\" : \"f9\"," +
"		\"name\" : \"oppo f9\"," +
"		\"price\" : 2849," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/oppo-f9.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 374," +
"		\"brand\" : \"asus\"," +
"		\"model\" : \"zenfone max pro (zb602kl)\"," +
"		\"name\" : \"asus zenfone max pro (zb602kl)\"," +
"		\"price\" : 1499.9," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/asus-zenfone-max-pro-m1.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 375," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"redmi note 5 64 gb / 4 gb\"," +
"		\"name\" : \"xiaomi redmi note 5 64 gb / 4 gb\"," +
"		\"price\" : 1599," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-redmi-note-5-64gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 376," +
"		\"brand\" : \"meizu\"," +
"		\"model\" : \"16 64 gb\"," +
"		\"name\" : \"meizu 16 64 gb\"," +
"		\"price\" : 2289.9," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/meizu-16.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 377," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy a8 (2018) çift hat (sm-a530f/ds)\"," +
"		\"name\" : \"samsung galaxy a8 (2018) çift hat (sm-a530f/ds)\"," +
"		\"price\" : 2589," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-a8-2018-dual.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 378," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy a8 (2018) tek hat (sm-a530f)\"," +
"		\"name\" : \"samsung galaxy a8 (2018) tek hat (sm-a530f)\"," +
"		\"price\" : 2449," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-a8-2018.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 379," +
"		\"brand\" : \"meizu\"," +
"		\"model\" : \"x8 128 gb\"," +
"		\"name\" : \"meizu x8 128 gb\"," +
"		\"price\" : 2199.9," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/meizu-x8-128gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 380," +
"		\"brand\" : \"apple\"," +
"		\"model\" : \"iphone 8 plus (product)red special edition (mrt92tu/a)\"," +
"		\"name\" : \"apple iphone 8 plus (product)red special edition (mrt92tu/a)\"," +
"		\"price\" : 5999," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/apple-iphone-8-plus-productred-special-edition.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 381," +
"		\"brand\" : \"apple\"," +
"		\"model\" : \"iphone 8 plus 64 gb (mq8l2tu/a, mq8m2tu/a, mq8n2tu/a)\"," +
"		\"name\" : \"apple iphone 8 plus 64 gb (mq8l2tu/a, mq8m2tu/a, mq8n2tu/a)\"," +
"		\"price\" : 5599," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/apple-iphone-8-plus.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 382," +
"		\"brand\" : \"asus\"," +
"		\"model\" : \"zenfone zoom s (ze553kl)\"," +
"		\"name\" : \"asus zenfone zoom s (ze553kl)\"," +
"		\"price\" : 2479.9," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/asus-zenfone-zoom-s.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 383," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"redmi note 5 pro\"," +
"		\"name\" : \"xiaomi redmi note 5 pro\"," +
"		\"price\" : 2199," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-redmi-note-5-pro.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 384," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"mi a2 128 gb\"," +
"		\"name\" : \"xiaomi mi a2 128 gb\"," +
"		\"price\" : 2399," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-mi-a2-128gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 385," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy a30 (sm-a305f)\"," +
"		\"name\" : \"samsung galaxy a30 (sm-a305f)\"," +
"		\"price\" : 2069," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-a30.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 386," +
"		\"brand\" : \"huawei\"," +
"		\"model\" : \"p smart 2019 64 gb (pot-lx1)\"," +
"		\"name\" : \"huawei p smart 2019 64 gb (pot-lx1)\"," +
"		\"price\" : 1689.9," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/huawei-p-smart-2019.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 387," +
"		\"brand\" : \"nokia\"," +
"		\"model\" : \"7.1\"," +
"		\"name\" : \"nokia 7.1\"," +
"		\"price\" : 2799," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/nokia-7-1-64gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 388," +
"		\"brand\" : \"sony\"," +
"		\"model\" : \"xperia xz (f8331)\"," +
"		\"name\" : \"sony xperia xz (f8331)\"," +
"		\"price\" : 2139.9," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/sony-xperia-xz.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 389," +
"		\"brand\" : \"oppo\"," +
"		\"model\" : \"rx17 neo\"," +
"		\"name\" : \"oppo rx17 neo\"," +
"		\"price\" : 2729," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/oppo-rx17-neo.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 390," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy a7 (2018) 128 gb / çift hat (sm-a750f/ds)\"," +
"		\"name\" : \"samsung galaxy a7 (2018) 128 gb / çift hat (sm-a750f/ds)\"," +
"		\"price\" : 2089," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-a7-2018-128gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 391," +
"		\"brand\" : \"asus\"," +
"		\"model\" : \"zenfone 4 (ze554kl)\"," +
"		\"name\" : \"asus zenfone 4 (ze554kl)\"," +
"		\"price\" : 1949," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/asus-zenfone-4.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 392," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy c9 pro (sm-c9000)\"," +
"		\"name\" : \"samsung galaxy c9 pro (sm-c9000)\"," +
"		\"price\" : 2389," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-c9-pro.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 393," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"redmi note 6 pro\"," +
"		\"name\" : \"xiaomi redmi note 6 pro\"," +
"		\"price\" : 1559," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-redmi-note-6-pro.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 394," +
"		\"brand\" : \"apple\"," +
"		\"model\" : \"iphone 7 plus 128 gb (mn4m2tu/a, mn4p2tu/a, mn4v2tu/a, mn4q2tu/a, mn4u2tu/a)\"," +
"		\"name\" : \"apple iphone 7 plus 128 gb (mn4m2tu/a, mn4p2tu/a, mn4v2tu/a, mn4q2tu/a, mn4u2tu/a)\"," +
"		\"price\" : 4949," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/apple-iphone-7-plus-128gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 395," +
"		\"brand\" : \"meizu\"," +
"		\"model\" : \"x8 64 gb\"," +
"		\"name\" : \"meizu x8 64 gb\"," +
"		\"price\" : 1799.9," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/meizu-x8.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 396," +
"		\"brand\" : \"casper\"," +
"		\"model\" : \"vıa a3 plus\"," +
"		\"name\" : \"casper vıa a3 plus\"," +
"		\"price\" : 2399," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/casper-via-a3-plus.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 397," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy a7 (2018) (sm-a750f)\"," +
"		\"name\" : \"samsung galaxy a7 (2018) (sm-a750f)\"," +
"		\"price\" : 1873.9," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-a7-2018.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 398," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy a7 (2018) 64 gb / çift hat\"," +
"		\"name\" : \"samsung galaxy a7 (2018) 64 gb / çift hat\"," +
"		\"price\" : 2299," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-a7-2018-dual.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 399," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"mi a2 64 gb\"," +
"		\"name\" : \"xiaomi mi a2 64 gb\"," +
"		\"price\" : 1783," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-mi-a2-64gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 400," +
"		\"brand\" : \"htc\"," +
"		\"model\" : \"10\"," +
"		\"name\" : \"htc 10\"," +
"		\"price\" : 2099," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/htc-10.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 401," +
"		\"brand\" : \"doogee\"," +
"		\"model\" : \"s60\"," +
"		\"name\" : \"doogee s60\"," +
"		\"price\" : 4499," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/doogee-s60.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 402," +
"		\"brand\" : \"lg\"," +
"		\"model\" : \"g5 (h850)\"," +
"		\"name\" : \"lg g5 (h850)\"," +
"		\"price\" : 1129," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/lg-g5.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 403," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"redmi note 5 32 gb / 3 gb\"," +
"		\"name\" : \"xiaomi redmi note 5 32 gb / 3 gb\"," +
"		\"price\" : 1478," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-redmi-note-5.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 404," +
"		\"brand\" : \"vestel\"," +
"		\"model\" : \"venus z20\"," +
"		\"name\" : \"vestel venus z20\"," +
"		\"price\" : 1370," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/vestel-venus-z20.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 405," +
"		\"brand\" : \"honor\"," +
"		\"model\" : \"10 lite (hry-lx1)\"," +
"		\"name\" : \"honor 10 lite (hry-lx1)\"," +
"		\"price\" : 1505.9," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/honor-10-lite-32gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 406," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"mi a2 lite 64 gb\"," +
"		\"name\" : \"xiaomi mi a2 lite 64 gb\"," +
"		\"price\" : 1488," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-mi-a2-lite-64gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 407," +
"		\"brand\" : \"htc\"," +
"		\"model\" : \"10 evo 32 gb\"," +
"		\"name\" : \"htc 10 evo 32 gb\"," +
"		\"price\" : 1599," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/htc-10-evo-32gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 408," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy m20 (sm-m205f)\"," +
"		\"name\" : \"samsung galaxy m20 (sm-m205f)\"," +
"		\"price\" : 1599," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-m20.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 409," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"mi 5 prime 64 gb\"," +
"		\"name\" : \"xiaomi mi 5 prime 64 gb\"," +
"		\"price\" : 1999," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-mi-5-64gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 410," +
"		\"brand\" : \"huawei\"," +
"		\"model\" : \"p smart 2019 32 gb\"," +
"		\"name\" : \"huawei p smart 2019 32 gb\"," +
"		\"price\" : 1549," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/huawei-p-smart-2019-32gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 411," +
"		\"brand\" : \"meizu\"," +
"		\"model\" : \"note 8\"," +
"		\"name\" : \"meizu note 8\"," +
"		\"price\" : 1499.9," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/meizu-note-8.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 412," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"mi max 2 64 gb\"," +
"		\"name\" : \"xiaomi mi max 2 64 gb\"," +
"		\"price\" : 2099," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-mi-max-2-64gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 413," +
"		\"brand\" : \"zte\"," +
"		\"model\" : \"nubia z17 minis\"," +
"		\"name\" : \"zte nubia z17 minis\"," +
"		\"price\" : 1899," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/zte-nubia-z17-minis.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 414," +
"		\"brand\" : \"vestel\"," +
"		\"model\" : \"venus z30 (20274551)\"," +
"		\"name\" : \"vestel venus z30 (20274551)\"," +
"		\"price\" : 2550," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/vestel-venus-z30.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 415," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"mi 5s 32 gb\"," +
"		\"name\" : \"xiaomi mi 5s 32 gb\"," +
"		\"price\" : 1699," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-mi-5s.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 416," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy m20 çift hat / 32 gb\"," +
"		\"name\" : \"samsung galaxy m20 çift hat / 32 gb\"," +
"		\"price\" : 1459," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-m20-dual.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 417," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"mi a2 32 gb\"," +
"		\"name\" : \"xiaomi mi a2 32 gb\"," +
"		\"price\" : 1587.9," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-mi-a2.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 418," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy c7 pro (sm-c7010)\"," +
"		\"name\" : \"samsung galaxy c7 pro (sm-c7010)\"," +
"		\"price\" : 1485," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-c7-pro.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 419," +
"		\"brand\" : \"apple\"," +
"		\"model\" : \"iphone 7 plus 32 gb (mnqq2tu/a, mnqp2tu/a, mnqm2tu/a, mnqn2tu/a, mqu72tu/a)\"," +
"		\"name\" : \"apple iphone 7 plus 32 gb (mnqq2tu/a, mnqp2tu/a, mnqm2tu/a, mnqn2tu/a, mqu72tu/a)\"," +
"		\"price\" : 3869," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/apple-iphone-7-plus.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 420," +
"		\"brand\" : \"huawei\"," +
"		\"model\" : \"p20 lite (ane-lx1)\"," +
"		\"name\" : \"huawei p20 lite (ane-lx1)\"," +
"		\"price\" : 1783.9," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/huawei-p20-lite.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 421," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"redmi 5 plus 64 gb\"," +
"		\"name\" : \"xiaomi redmi 5 plus 64 gb\"," +
"		\"price\" : 1359," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-redmi-5-plus-64gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 422," +
"		\"brand\" : \"apple\"," +
"		\"model\" : \"iphone 8 (product)red special edition 256 gb (mrrn2tu/a)\"," +
"		\"name\" : \"apple iphone 8 (product)red special edition 256 gb (mrrn2tu/a)\"," +
"		\"price\" : 5439," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/apple-iphone-8-productred-special-edition-256gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 423," +
"		\"brand\" : \"apple\"," +
"		\"model\" : \"iphone 8 256 gb (mq7d2tu/a, mq7e2tu/a, mq7c2tu/a)\"," +
"		\"name\" : \"apple iphone 8 256 gb (mq7d2tu/a, mq7e2tu/a, mq7c2tu/a)\"," +
"		\"price\" : 5535," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/apple-iphone-8-256gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 424," +
"		\"brand\" : \"casper\"," +
"		\"model\" : \"vıa a1 plus 128 gb\"," +
"		\"name\" : \"casper vıa a1 plus 128 gb\"," +
"		\"price\" : 2980," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/casper-via-a1-plus.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 425," +
"		\"brand\" : \"huawei\"," +
"		\"model\" : \"mate 10 lite çift hat (rne-l21)\"," +
"		\"name\" : \"huawei mate 10 lite çift hat (rne-l21)\"," +
"		\"price\" : 1657.9," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/huawei-mate-10-lite-dual.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 426," +
"		\"brand\" : \"huawei\"," +
"		\"model\" : \"mate 10 lite (rne-l01)\"," +
"		\"name\" : \"huawei mate 10 lite (rne-l01)\"," +
"		\"price\" : 1679," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/huawei-mate-10-lite.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 427," +
"		\"brand\" : \"casper\"," +
"		\"model\" : \"vıa a3\"," +
"		\"name\" : \"casper vıa a3\"," +
"		\"price\" : 1379.9," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/casper-via-a3.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 428," +
"		\"brand\" : \"huawei\"," +
"		\"model\" : \"p20 lite çift hat\"," +
"		\"name\" : \"huawei p20 lite çift hat\"," +
"		\"price\" : 1769," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/huawei-p20-lite-dual.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 429," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy a6+ plus (sm-a605f)\"," +
"		\"name\" : \"samsung galaxy a6+ plus (sm-a605f)\"," +
"		\"price\" : 1879," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-a6-plus.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 430," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy a6+ plus çift hat / 64 gb\"," +
"		\"name\" : \"samsung galaxy a6+ plus çift hat / 64 gb\"," +
"		\"price\" : 1780," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-a6-plus-duos.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 431," +
"		\"brand\" : \"honor\"," +
"		\"model\" : \"7x (bnd-l21)\"," +
"		\"name\" : \"honor 7x (bnd-l21)\"," +
"		\"price\" : 2149," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/huawei-honor-7x.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 432," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy note 5 32 gb (sm-n920c)\"," +
"		\"name\" : \"samsung galaxy note 5 32 gb (sm-n920c)\"," +
"		\"price\" : 2650," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-note-5.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 433," +
"		\"brand\" : \"casper\"," +
"		\"model\" : \"vıa a1 plus 64 gb\"," +
"		\"name\" : \"casper vıa a1 plus 64 gb\"," +
"		\"price\" : 1599," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/casper-via-a1-plus-64gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 434," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy a7 (2017) çift hat (sm-a720f/ds)\"," +
"		\"name\" : \"samsung galaxy a7 (2017) çift hat (sm-a720f/ds)\"," +
"		\"price\" : 1749," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-a7-2017-dual-sim.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 435," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy a7 (2017) tek hat (sm-a720f)\"," +
"		\"name\" : \"samsung galaxy a7 (2017) tek hat (sm-a720f)\"," +
"		\"price\" : 1869," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-a7-2017.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 436," +
"		\"brand\" : \"lg\"," +
"		\"model\" : \"q7+ (lmq610)\"," +
"		\"name\" : \"lg q7+ (lmq610)\"," +
"		\"price\" : 1518," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/lg-q7-plus.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 437," +
"		\"brand\" : \"sony\"," +
"		\"model\" : \"xperia z5 dual (e6633)\"," +
"		\"name\" : \"sony xperia z5 dual (e6633)\"," +
"		\"price\" : 1799," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/sony-xperia-z5-dual.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 438," +
"		\"brand\" : \"lenovo\"," +
"		\"model\" : \"moto z (xt1650)\"," +
"		\"name\" : \"lenovo moto z (xt1650)\"," +
"		\"price\" : 1699," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/motorola-moto-z.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 439," +
"		\"brand\" : \"apple\"," +
"		\"model\" : \"iphone 8 (product)red special edition (mrrm2tu/a)\"," +
"		\"name\" : \"apple iphone 8 (product)red special edition (mrrm2tu/a)\"," +
"		\"price\" : 4999," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/apple-iphone-8-productred-special-edition.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 440," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"mi 5x 64 gb\"," +
"		\"name\" : \"xiaomi mi 5x 64 gb\"," +
"		\"price\" : 1519," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-mi-5x-64gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 441," +
"		\"brand\" : \"apple\"," +
"		\"model\" : \"iphone 8 64 gb (mq6g2tu/a, mq6h2tu/a, mq6j2tu/a)\"," +
"		\"name\" : \"apple iphone 8 64 gb (mq6g2tu/a, mq6h2tu/a, mq6j2tu/a)\"," +
"		\"price\" : 4670.55," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/apple-iphone-8.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 442," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"mi a2 lite 32 gb\"," +
"		\"name\" : \"xiaomi mi a2 lite 32 gb\"," +
"		\"price\" : 1349," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-mi-a2-lite.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 443," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"mi a1 64 gb\"," +
"		\"name\" : \"xiaomi mi a1 64 gb\"," +
"		\"price\" : 1449," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-mi-a1.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 444," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy note 5 (dual sım) 32 gb\"," +
"		\"name\" : \"samsung galaxy note 5 (dual sım) 32 gb\"," +
"		\"price\" : 1979.99," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-note-5-dual-sim.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 445," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"redmi s2 64 gb\"," +
"		\"name\" : \"xiaomi redmi s2 64 gb\"," +
"		\"price\" : 1479," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-redmi-s2-64gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 446," +
"		\"brand\" : \"oppo\"," +
"		\"model\" : \"ax7\"," +
"		\"name\" : \"oppo ax7\"," +
"		\"price\" : 1899," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/oppo-ax7.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 447," +
"		\"brand\" : \"sony\"," +
"		\"model\" : \"xperia xa1 plus (g3421)\"," +
"		\"name\" : \"sony xperia xa1 plus (g3421)\"," +
"		\"price\" : 1349.9," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/sony-xperia-xa1-plus.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 448," +
"		\"brand\" : \"blackberry\"," +
"		\"model\" : \"keyone (black edition)\"," +
"		\"name\" : \"blackberry keyone (black edition)\"," +
"		\"price\" : 3799," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/blackberry-keyone-black-edition.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 449," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy j8 64 gb / çift hat\"," +
"		\"name\" : \"samsung galaxy j8 64 gb / çift hat\"," +
"		\"price\" : 1680," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-j8-64gb-4gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 450," +
"		\"brand\" : \"reeder\"," +
"		\"model\" : \"p12 curve\"," +
"		\"name\" : \"reeder p12 curve\"," +
"		\"price\" : 1449," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/reeder-p12-curve.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 451," +
"		\"brand\" : \"lg\"," +
"		\"model\" : \"g5 se tek hat (h840)\"," +
"		\"name\" : \"lg g5 se tek hat (h840)\"," +
"		\"price\" : 1999," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/lg-g5-se.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 452," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy note 4 1.9 ghz / 4g / tek hat (sm-n910c)\"," +
"		\"name\" : \"samsung galaxy note 4 1.9 ghz / 4g / tek hat (sm-n910c)\"," +
"		\"price\" : 1379," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-note-4.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 453," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy j7 pro 64 gb\"," +
"		\"name\" : \"samsung galaxy j7 pro 64 gb\"," +
"		\"price\" : 1639," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-j7-pro-64gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 454," +
"		\"brand\" : \"huawei\"," +
"		\"model\" : \"p9 tek hat (eva-l09)\"," +
"		\"name\" : \"huawei p9 tek hat (eva-l09)\"," +
"		\"price\" : 2719," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/huawei-p9.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 455," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy a5 (2017) çift hat (sm-a520f/ds)\"," +
"		\"name\" : \"samsung galaxy a5 (2017) çift hat (sm-a520f/ds)\"," +
"		\"price\" : 1719," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-a5-2017-dual-sim.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 456," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy a5 (2017) tek hat (sm-a520f)\"," +
"		\"name\" : \"samsung galaxy a5 (2017) tek hat (sm-a520f)\"," +
"		\"price\" : 1899," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-a5-2017.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 457," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"redmi 5 plus\"," +
"		\"name\" : \"xiaomi redmi 5 plus\"," +
"		\"price\" : 1349," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-redmi-5-plus.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 458," +
"		\"brand\" : \"alcatel\"," +
"		\"model\" : \"5v\"," +
"		\"name\" : \"alcatel 5v\"," +
"		\"price\" : 1399," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/alcatel-5v.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 459," +
"		\"brand\" : \"lg\"," +
"		\"model\" : \"g4 tek hat (h815)\"," +
"		\"name\" : \"lg g4 tek hat (h815)\"," +
"		\"price\" : 899.99," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/lg-g4.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 460," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy j8 64 gb\"," +
"		\"name\" : \"samsung galaxy j8 64 gb\"," +
"		\"price\" : 2499," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-j8-64gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 461," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy j8 64 gb / çift hat\"," +
"		\"name\" : \"samsung galaxy j8 64 gb / çift hat\"," +
"		\"price\" : 1865," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-j8-64gb-duos.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 462," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy j7 max (sm-g615f/ds)\"," +
"		\"name\" : \"samsung galaxy j7 max (sm-g615f/ds)\"," +
"		\"price\" : 1750," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-j7-max.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 463," +
"		\"brand\" : \"asus\"," +
"		\"model\" : \"zenfone max m2 (zb633kl)\"," +
"		\"name\" : \"asus zenfone max m2 (zb633kl)\"," +
"		\"price\" : 1599," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/asus-zenfone-max-m2.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 464," +
"		\"brand\" : \"nokia\"," +
"		\"model\" : \"5.1 plus (ta-1108)\"," +
"		\"name\" : \"nokia 5.1 plus (ta-1108)\"," +
"		\"price\" : 2199," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/nokia-5-1-plus.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 465," +
"		\"brand\" : \"casper\"," +
"		\"model\" : \"vıa f2\"," +
"		\"name\" : \"casper vıa f2\"," +
"		\"price\" : 1400," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/casper-via-f2.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 466," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy a6+ plus çift hat / 32 gb\"," +
"		\"name\" : \"samsung galaxy a6+ plus çift hat / 32 gb\"," +
"		\"price\" : 1540," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-a6-plus-32gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 467," +
"		\"brand\" : \"asus\"," +
"		\"model\" : \"zenfone 3 32 gb (ze552kl)\"," +
"		\"name\" : \"asus zenfone 3 32 gb (ze552kl)\"," +
"		\"price\" : 1779," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/asus-zenfone-3.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 468," +
"		\"brand\" : \"apple\"," +
"		\"model\" : \"iphone 7 (product)red special edition 256 gb (mprm2tu/a)\"," +
"		\"name\" : \"apple iphone 7 (product)red special edition 256 gb (mprm2tu/a)\"," +
"		\"price\" : 4699," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/apple-iphone-7-256gb-productred-special-edition.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 469," +
"		\"brand\" : \"asus\"," +
"		\"model\" : \"zenfone max plus (m1) (zb570tl)\"," +
"		\"name\" : \"asus zenfone max plus (m1) (zb570tl)\"," +
"		\"price\" : 1400," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/asus-zenfone-max-plus-m1.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 470," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"mi a1 32 gb\"," +
"		\"name\" : \"xiaomi mi a1 32 gb\"," +
"		\"price\" : 1399," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-mi-a1-32gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 471," +
"		\"brand\" : \"moto\"," +
"		\"model\" : \"g5s plus (xt1803)\"," +
"		\"name\" : \"moto g5s plus (xt1803)\"," +
"		\"price\" : 1349," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/moto-g5s-plus.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 472," +
"		\"brand\" : \"apple\"," +
"		\"model\" : \"iphone 7 256 gb (mn982tu/a, mn9a2tu/a, mn992tu/a, mn9c2tu/a, mn972tu/a)\"," +
"		\"name\" : \"apple iphone 7 256 gb (mn982tu/a, mn9a2tu/a, mn992tu/a, mn9c2tu/a, mn972tu/a)\"," +
"		\"price\" : 4699," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/apple-iphone-7-256gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 473," +
"		\"brand\" : \"general\"," +
"		\"model\" : \"mobile gm 8 64 gb\"," +
"		\"name\" : \"general mobile gm 8 64 gb\"," +
"		\"price\" : 1165," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/general-mobile-gm-8-64gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 474," +
"		\"brand\" : \"general\"," +
"		\"model\" : \"mobile gm 8 64 gb / çift hat / 4 gb\"," +
"		\"name\" : \"general mobile gm 8 64 gb / çift hat / 4 gb\"," +
"		\"price\" : 1165," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/general-mobile-gm-8-64gb-dual.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 475," +
"		\"brand\" : \"honor\"," +
"		\"model\" : \"9 lite (lld-l31)\"," +
"		\"name\" : \"honor 9 lite (lld-l31)\"," +
"		\"price\" : 1329," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/huawei-honor-9-lite.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 476," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy a8 (2016) (sm-a810f/ds)\"," +
"		\"name\" : \"samsung galaxy a8 (2016) (sm-a810f/ds)\"," +
"		\"price\" : 1699," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-a8-2016.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 477," +
"		\"brand\" : \"huawei\"," +
"		\"model\" : \"p smart çift hat\"," +
"		\"name\" : \"huawei p smart çift hat\"," +
"		\"price\" : 1399.9," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/huawei-p-smart-dual.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 478," +
"		\"brand\" : \"huawei\"," +
"		\"model\" : \"p smart (fıg-lx1)\"," +
"		\"name\" : \"huawei p smart (fıg-lx1)\"," +
"		\"price\" : 1519," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/huawei-p-smart.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 479," +
"		\"brand\" : \"huawei\"," +
"		\"model\" : \"p10 lite tek hat / 32 gb (was-lx1a)\"," +
"		\"name\" : \"huawei p10 lite tek hat / 32 gb (was-lx1a)\"," +
"		\"price\" : 1959," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/huawei-p10-lite.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 480," +
"		\"brand\" : \"asus\"," +
"		\"model\" : \"zenfone 4 max (zc554kl)\"," +
"		\"name\" : \"asus zenfone 4 max (zc554kl)\"," +
"		\"price\" : 1179," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/asus-zenfone-4-max.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 481," +
"		\"brand\" : \"lenovo\"," +
"		\"model\" : \"moto z play 32 gb\"," +
"		\"name\" : \"lenovo moto z play 32 gb\"," +
"		\"price\" : 1599," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/lenovo-moto-z-play-32gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 482," +
"		\"brand\" : \"apple\"," +
"		\"model\" : \"iphone 7 128 gb (mn922tu/a, mn952tu/a, mn932tu/a, mn962tu/a, mn942tu/a)\"," +
"		\"name\" : \"apple iphone 7 128 gb (mn922tu/a, mn952tu/a, mn932tu/a, mn962tu/a, mn942tu/a)\"," +
"		\"price\" : 3904," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/apple-iphone-7-128gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 483," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy j7 pro tek hat / 32 gb\"," +
"		\"name\" : \"samsung galaxy j7 pro tek hat / 32 gb\"," +
"		\"price\" : 1449," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-j7-pro-32gb-tek-sim.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 484," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy j8 (sm-j810f)\"," +
"		\"name\" : \"samsung galaxy j8 (sm-j810f)\"," +
"		\"price\" : 1479," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-j8.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 485," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy j6+ plus 64 gb / çift hat\"," +
"		\"name\" : \"samsung galaxy j6+ plus 64 gb / çift hat\"," +
"		\"price\" : 1389," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-j6-plus-64gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 486," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy j7 prime 2 (sm-g611f)\"," +
"		\"name\" : \"samsung galaxy j7 prime 2 (sm-g611f)\"," +
"		\"price\" : 1248.65," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-j7-prime-2.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 487," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy c5 pro (sm-c5010)\"," +
"		\"name\" : \"samsung galaxy c5 pro (sm-c5010)\"," +
"		\"price\" : 2227," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-c5-pro.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 488," +
"		\"brand\" : \"reeder\"," +
"		\"model\" : \"p12s\"," +
"		\"name\" : \"reeder p12s\"," +
"		\"price\" : 1450," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/reeder-p12s.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 489," +
"		\"brand\" : \"vestel\"," +
"		\"model\" : \"venus v6\"," +
"		\"name\" : \"vestel venus v6\"," +
"		\"price\" : 1099," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/vestel-venus-v6.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 490," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"redmi 6 64 gb / 4 gb\"," +
"		\"name\" : \"xiaomi redmi 6 64 gb / 4 gb\"," +
"		\"price\" : 1549," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-redmi-6-64gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 491," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"redmi s2\"," +
"		\"name\" : \"xiaomi redmi s2\"," +
"		\"price\" : 1239," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-redmi-s2.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 492," +
"		\"brand\" : \"htc\"," +
"		\"model\" : \"desire 10 pro 64 gb\"," +
"		\"name\" : \"htc desire 10 pro 64 gb\"," +
"		\"price\" : 1769," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/htc-desire-10-pro-64gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 493," +
"		\"brand\" : \"lg\"," +
"		\"model\" : \"q7 bts edition (lm-q617em)\"," +
"		\"name\" : \"lg q7 bts edition (lm-q617em)\"," +
"		\"price\" : 1386.9," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/lg-q7-bts-edition.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 494," +
"		\"brand\" : \"vestel\"," +
"		\"model\" : \"venus z10\"," +
"		\"name\" : \"vestel venus z10\"," +
"		\"price\" : 1269," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/vestel-venus-z10.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 495," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy j7 pro çift hat / 32 gb\"," +
"		\"name\" : \"samsung galaxy j7 pro çift hat / 32 gb\"," +
"		\"price\" : 1808.84," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-j7-pro-32gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 496," +
"		\"brand\" : \"casper\"," +
"		\"model\" : \"vıa a1 çift hat\"," +
"		\"name\" : \"casper vıa a1 çift hat\"," +
"		\"price\" : 1997.74," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/casper-via-a1-cift-sim.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 497," +
"		\"brand\" : \"casper\"," +
"		\"model\" : \"vıa a1 tek hat\"," +
"		\"name\" : \"casper vıa a1 tek hat\"," +
"		\"price\" : 1289," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/casper-via-a1.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 498," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"redmi 4x 64 gb\"," +
"		\"name\" : \"xiaomi redmi 4x 64 gb\"," +
"		\"price\" : 2298.49," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-redmi-4x-64gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 499," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy j8 32 gb / çift hat\"," +
"		\"name\" : \"samsung galaxy j8 32 gb / çift hat\"," +
"		\"price\" : 1477," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-j8-32gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 500," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy a6 (sm-a600f)\"," +
"		\"name\" : \"samsung galaxy a6 (sm-a600f)\"," +
"		\"price\" : 1869.9," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-a6.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 501," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy a6 çift hat / 64 gb\"," +
"		\"name\" : \"samsung galaxy a6 çift hat / 64 gb\"," +
"		\"price\" : 1571.33," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-a6-duos.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 502," +
"		\"brand\" : \"sony\"," +
"		\"model\" : \"xperia z3 tek hat (d6603)\"," +
"		\"name\" : \"sony xperia z3 tek hat (d6603)\"," +
"		\"price\" : 1049," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/sony-xperia-z3.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 503," +
"		\"brand\" : \"huawei\"," +
"		\"model\" : \"y7 2019\"," +
"		\"name\" : \"huawei y7 2019\"," +
"		\"price\" : 1499.9," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/huawei-y7-2019.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 504," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy j6 çift hat / 64 gb\"," +
"		\"name\" : \"samsung galaxy j6 çift hat / 64 gb\"," +
"		\"price\" : 1279," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-j6-64gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 505," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy j7 prime 2 duos çift hat (sm-g611f/ds)\"," +
"		\"name\" : \"samsung galaxy j7 prime 2 duos çift hat (sm-g611f/ds)\"," +
"		\"price\" : 1285," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-j7-prime-2-duos.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 506," +
"		\"brand\" : \"blackberry\"," +
"		\"model\" : \"keyone\"," +
"		\"name\" : \"blackberry keyone\"," +
"		\"price\" : 2119," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/blackberry-keyone.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 507," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy on7 prime\"," +
"		\"name\" : \"samsung galaxy on7 prime\"," +
"		\"price\" : 1425," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-on7-prime.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 508," +
"		\"brand\" : \"casper\"," +
"		\"model\" : \"vıa g3\"," +
"		\"name\" : \"casper vıa g3\"," +
"		\"price\" : 1259," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/casper-via-g3.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 509," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy s6 edge 32 gb (sm-g925f)\"," +
"		\"name\" : \"samsung galaxy s6 edge 32 gb (sm-g925f)\"," +
"		\"price\" : 1699," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-s6-edge.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 510," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"redmi 6 64 gb / 3 gb\"," +
"		\"name\" : \"xiaomi redmi 6 64 gb / 3 gb\"," +
"		\"price\" : 1189.9," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/xiaomi-redmi-6-64gb-3gb.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 511," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy c8 32 gb (sm-c7100)\"," +
"		\"name\" : \"samsung galaxy c8 32 gb (sm-c7100)\"," +
"		\"price\" : 1369," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-c8.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 512," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy c7 32 gb (sm-c7000)\"," +
"		\"name\" : \"samsung galaxy c7 32 gb (sm-c7000)\"," +
"		\"price\" : 1519," +
"		\"source\" : \"https://www.epey.com/akilli-telefonlar/samsung-galaxy-c7.html#fiyatlar\"" +
"	}," +
"	{" +
"		\"id\" : 513," +
"		\"brand\" : \"huawei\"," +
"		\"model\" : \"mate 20 lite 64 gb 6.3 inç 20 mp akıllı cep telefonu siyah\"," +
"		\"name\" : \"huawei mate 20 lite 64 gb 6.3 inç 20 mp akıllı cep telefonu siyah\"," +
"		\"price\" : 2169," +
"		\"source\" : \"https://www.cimri.com/cep-telefonlari/en-ucuz-huawei-mate-20-lite-64gb-6-3-inc-20-mp-akilli-cep-telefonu-siyah-fiyatlari,96333236\"" +
"	}," +
"	{" +
"		\"id\" : 514," +
"		\"brand\" : \"huawei\"," +
"		\"model\" : \"p20 lite 64 gb 5.84 inç 16 mp akıllı cep telefonu siyah\"," +
"		\"name\" : \"huawei p20 lite 64 gb 5.84 inç 16 mp akıllı cep telefonu siyah\"," +
"		\"price\" : 1769," +
"		\"source\" : \"https://www.cimri.com/cep-telefonlari/en-ucuz-huawei-p20-lite-64gb-siyah-fiyatlari,75180141\"" +
"	}," +
"	{" +
"		\"id\" : 515," +
"		\"brand\" : \"samsung\"," +
"		\"model\" : \"galaxy m20 32gb 6.3 inç 13mp akıllı cep telefonu koyu mavi\"," +
"		\"name\" : \"samsung galaxy m20 32gb 6.3 inç 13mp akıllı cep telefonu koyu mavi\"," +
"		\"price\" : 1464," +
"		\"source\" : \"https://www.cimri.com/cep-telefonlari/en-ucuz-samsung-galaxy-m20-32gb-6-3-inc-13mp-akilli-cep-telefonu-koyu-mavi-fiyatlari,150474716\"" +
"	}," +
"	{" +
"		\"id\" : 516," +
"		\"brand\" : \"xiaomi\"," +
"		\"model\" : \"mi 8 lite 128gb 6.26 inç 12mp çift hatlı akıllı cep telefonu siyah\"," +
"		\"name\" : \"xiaomi mi 8 lite 128gb 6.26 inç 12mp çift hatlı akıllı cep telefonu siyah\"," +
"		\"price\" : 2429," +
"		\"source\" : \"https://www.cimri.com/cep-telefonlari/en-ucuz-x";

        //
            return jsondata;
    }

}

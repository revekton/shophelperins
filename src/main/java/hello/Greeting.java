package hello;

public class Greeting {

    private final long id;
    private final String content;
    private final String jsondata;
    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
        jsondata = new StringBuilder()
           .append("[
	{
		"id" : 1,
		"brand" : "samsung",
		"model" : "galaxy s10+ plus 512 gb",
		"name" : "samsung galaxy s10+ plus 512 gb",
		"price" : 8499,
		"source" : "https://www.epey.com/akilli-telefonlar/samsung-galaxy-s10-plus-512gb.html#fiyatlar"
	},
	{
		"id" : 2,
		"brand" : "samsung",
		"model" : "galaxy s10+ plus (sm-g975f)",
		"name" : "samsung galaxy s10+ plus (sm-g975f)",
		"price" : 6529,
		"source" : "https://www.epey.com/akilli-telefonlar/samsung-galaxy-s10-plus.html#fiyatlar"
	},
	{
		"id" : 3,
		"brand" : "samsung",
		"model" : "galaxy s10 (sm-g973f)",
		"name" : "samsung galaxy s10 (sm-g973f)",
		"price" : 5499,
		"source" : "https://www.epey.com/akilli-telefonlar/samsung-galaxy-s10.html#fiyatlar"
	},
	{
		"id" : 4,
		"brand" : "huawei",
		"model" : "mate 20 pro (lya-l09)",
		"name" : "huawei mate 20 pro (lya-l09)",
		"price" : 5769,
		"source" : "https://www.epey.com/akilli-telefonlar/huawei-mate-20-pro.html#fiyatlar"
	},
	{
		"id" : 5,
		"brand" : "samsung",
		"model" : "galaxy s10e (sm-g970f)",
		"name" : "samsung galaxy s10e (sm-g970f)",
		"price" : 4454.8,
		"source" : "https://www.epey.com/akilli-telefonlar/samsung-galaxy-s10e.html#fiyatlar"
	},
")
           .append("{
		"id" : 6,
		"brand" : "samsung",
		"model" : "galaxy note 9 tek hat / 512 gb (sm-n960f)",
		"name" : "samsung galaxy note 9 tek hat / 512 gb (sm-n960f)",
		"price" : 6434,
		"source" : "https://www.epey.com/akilli-telefonlar/samsung-galaxy-note-9-512gb.html#fiyatlar"
	},
	{
		"id" : 7,
		"brand" : "samsung",
		"model" : "galaxy note 9 (sm-n960f)",
		"name" : "samsung galaxy note 9 (sm-n960f)",
		"price" : 5389,
		"source" : "https://www.epey.com/akilli-telefonlar/samsung-galaxy-note9.html#fiyatlar"
	},
	{
		"id" : 8,
		"brand" : "samsung",
		"model" : "galaxy s9+ (plus) 256 gb",
		"name" : "samsung galaxy s9+ (plus) 256 gb",
		"price" : 5199,
		"source" : "https://www.epey.com/akilli-telefonlar/samsung-galaxy-s9-plus-256gb.html#fiyatlar"
	},
	{
		"id" : 9,
		"brand" : "samsung",
		"model" : "galaxy s9+ (plus) 128 gb",
		"name" : "samsung galaxy s9+ (plus) 128 gb",
		"price" : 4650,
		"source" : "https://www.epey.com/akilli-telefonlar/samsung-galaxy-s9-plus-128gb.html#fiyatlar"
	},
	{
		"id" : 10,
		"brand" : "apple",
		"model" : "iphone xs max 512 gb (mt582tu/a, mt572tu/a, mt562tu/a)",
		"name" : "apple iphone xs max 512 gb (mt582tu/a, mt572tu/a, mt562tu/a)",
		"price" : 12886.1,
		"source" : "https://www.epey.com/akilli-telefonlar/apple-iphone-xs-max-512gb.html#fiyatlar"
	},
	{
		"id" : 11,
		"brand" : "samsung",
		"model" : "galaxy s9+ (plus) (sm-g965f)",
		"name" : "samsung galaxy s9+ (plus) (sm-g965f)",
		"price" : 4183.9,
		"source" : "https://www.epey.com/akilli-telefonlar/samsung-galaxy-s9-plus.html#fiyatlar"
	},
	{
		"id" : 12,
		"brand" : "apple",
		"model" : "iphone xs max 256 gb (mt532tu/a, mt542tu/a, mt552tu/a)",
		"name" : "apple iphone xs max 256 gb (mt532tu/a, mt542tu/a, mt552tu/a)",
		"price" : 11195,
		"source" : "https://www.epey.com/akilli-telefonlar/apple-iphone-xs-max-256gb.html#fiyatlar"
	},
	")
           .append("{
		"id" : 13,
		"brand" : "huawei",
		"model" : "mate 20 (hma-l29)",
		"name" : "huawei mate 20 (hma-l29)",
		"price" : 5249,
		"source" : "https://www.epey.com/akilli-telefonlar/huawei-mate-20.html#fiyatlar"
	},
	{
		"id" : 14,
		"brand" : "apple",
		"model" : "iphone xs max (mt512tu/a, mt522tu/a, mt502tu/a)",
		"name" : "apple iphone xs max (mt512tu/a, mt522tu/a, mt502tu/a)",
		"price" : 9584.9,
		"source" : "https://www.epey.com/akilli-telefonlar/apple-iphone-xs-max.html#fiyatlar"
	},
	{
		"id" : 15,
		"brand" : "lg",
		"model" : "g7 thinq (g710)",
		"name" : "lg g7 thinq (g710)",
		"price" : 2959,
		"source" : "https://www.epey.com/akilli-telefonlar/lg-g7-thinq.html#fiyatlar"
	},
	{
		"id" : 16,
		"brand" : "samsung",
		"model" : "galaxy s9 (sm-g960f)",
		"name" : "samsung galaxy s9 (sm-g960f)",
		"price" : 3734,
		"source" : "https://www.epey.com/akilli-telefonlar/samsung-galaxy-s9.html#fiyatlar"
	},
	{
		"id" : 17,
		"brand" : "huawei",
		"model" : "p20 pro (clt-l09)",
		"name" : "huawei p20 pro (clt-l09)",
		"price" : 4599,
		"source" : "https://www.epey.com/akilli-telefonlar/huawei-p20-pro.html#fiyatlar"
	},
	{
		"id" : 18,
		"brand" : "samsung",
		"model" : "galaxy note 8 (sm-n950f)",
		"name" : "samsung galaxy note 8 (sm-n950f)",
		"price" : 4490,
		"source" : "https://www.epey.com/akilli-telefonlar/samsung-galaxy-note-8.html#fiyatlar"
	},
	{
		"id" : 19,
		"brand" : "xiaomi",
		"model" : "pocophone f1 128 gb",
		"name" : "xiaomi pocophone f1 128 gb",
		"price" : 3500,
		"source" : "https://www.epey.com/akilli-telefonlar/xiaomi-pocophone-f1-128gb.html#fiyatlar"
	},
	{
		"id" : 20,
		"brand" : "oneplus",
		"model" : "6 128 gb / 8 gb",
		"name" : "oneplus 6 128 gb / 8 gb",
		"price" : 3939,
		"source" : "https://www.epey.com/akilli-telefonlar/oneplus-6-128gb.html#fiyatlar"
	},
	")
           .append("it was the season of Light, it was the season of Darkness,\n")
           .append("test datas")
           .append("we had everything before us, we had nothing before us")
           .toString();
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
    public String getData(){
    return jsondata;
    }

}

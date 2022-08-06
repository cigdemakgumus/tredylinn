package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class TradyLinnPage {
    public TradyLinnPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='account']")
    public WebElement girisYapUyeOlLink;

    @FindBy(xpath = "(//input[@type='text'])[1]")
    public WebElement emailTextBox;

    @FindBy(xpath = "(//a[text()='Hesabım'])[1]")
    public WebElement hesabimLink;

    @FindBy(xpath = "//a[text()='Store Manager']")
    public WebElement storeManagerLink;

    @FindBy(xpath = "//div[@id='wcfm_menu']//div[15]")
    public WebElement raporlar;

    @FindBy(linkText = "Year")
    public WebElement yearLink;

    @FindBy(linkText = "Last Month")
    public WebElement lastMonthLink;

    @FindBy(linkText = "This Month")
    public WebElement thisMonthLink;

    @FindBy(linkText = "Last 7 Days")
    public WebElement last7DaysLink;

    @FindBy(xpath = "//input[@name='wcfm-date-range']")
    public WebElement customDateRangeTextBox;

    @FindBy(xpath = "(//a[@href=\"https://tradylinn.com/product-category/indirimli-urunler/\"])[4]")
    public WebElement tumunuGorLink;

    @FindBy(xpath = "//select[@name='orderby']")
    public WebElement siralaDropDown;

    @FindBy(xpath = "//select[@class='count form-control']")
    public WebElement showDropDown;

    @FindBy(xpath = "//span[@class='price']")
    public List<WebElement> productsPricesList;

    //sinem pages
    @FindBy(xpath = "//*[text()='Giriş Yap']")
    public static WebElement girisYap;

    @FindBy(xpath = "//input[@id='username']")
    public static WebElement emailButon;

    @FindBy(xpath = "//input[@id='password']")
    public static WebElement passwordButon;

    @FindBy(xpath = "//button[@value='Giriş Yap']")
    public static WebElement girisYap2;

    @FindBy(xpath = "(//*[text()='Hesabım'])[1]")
    public WebElement hesabimButon;

    @FindBy(xpath = "//*[text()='Store Manager']")
    public WebElement storeManagerButon;

    @FindBy(xpath = "(//span[@class='text'])[4]")
    public WebElement urunButon;

    @FindBy(xpath = "//*[text()='Yeni ekle']")
    public WebElement yeniEkleButon;

    @FindBy(xpath = "//*[@id='product_brand']")
    public List<WebElement> brands;

    @FindBy(xpath = "//input[@value='35']")
    public WebElement elegantAutoGroup;

    @FindBy(xpath = "//input[@value='41']")
    public WebElement greenGrass;

    @FindBy(xpath = "//input[@value='46']")
    public WebElement nodeJs;

    @FindBy(xpath = "//input[@value='47']")
    public WebElement ns8;

    @FindBy(xpath = "//input[@value='50']")
    public WebElement red;

    @FindBy(xpath = "//input[@value='52']")
    public WebElement skySuite;

    @FindBy(xpath = "//input[@value='55']")
    public WebElement sterling;

    @FindBy(xpath = "//input[@id='manage_stock']")
    public WebElement manageStock;

    @FindBy(xpath = "//input[@id='stock_qty']")
    public WebElement stockQty;

    @FindBy(xpath = "(//*[text()='Allow Backorders?'])[1]")
    public WebElement allowBackorders;

    @FindBy(xpath = "//*[@id='backorders']")
    public WebElement dropDownBackorders;

    // US005 Tugba Efe

    @FindBy(xpath = "//span[contains(text(),'Giriş Yap')]")
    public WebElement yapGiris;

    @FindBy(id = "menu-item-1074")
    public WebElement hesabimButonu;

    @FindBy(xpath = "//span[@class='text'][normalize-space()='Ürün:% s']")
    public WebElement urunButonn;

    @FindBy(xpath = "//a[@id='add_new_product_dashboard']")
    public WebElement yeniEkleButonu;

    @FindBy(id = "wcfm-products_wrapper")
    public WebElement listeGorunum;

    @FindBy(css = "tr[class='odd'] span[class='product-status product-status-publish']")
    public WebElement statusGorunum;

    @FindBy(css = "tr[class='odd'] span[class='instock']")
    public WebElement stockGorunum;

    @FindBy(css = "tr[class='odd'] td del")
    public WebElement priceGorunum;

    @FindBy(xpath = "//tr[@class='odd']//td[contains(text(),'21 June 2022')]")
    public WebElement dateGorunum;

    @FindBy(xpath = "(//*[text()='Virtual'])[1]")
    public WebElement virtualGorunum;

    @FindBy(xpath = "(//*[text()='Downloadable'])[1]")
    public WebElement downGorunum;

    @FindBy(id = "pro_title")
    public WebElement titleGorunum;

    @FindBy(xpath = "//input[@id='pro_title']")
    public WebElement titleGiris;

    @FindBy(xpath = "(//*[text()='Price (₺)'])[1]")
    public WebElement priceeGorunum;

    @FindBy(xpath = "(//*[text()='Sale Price (₺)'])[1]")
    public WebElement salePriceGorunum;

    @FindBy(id = "featured_img_display")
    public WebElement img;

    @FindBy(xpath = "(//img[@class='placeHolder'])[1]")
    public WebElement dosyaYukle;

    @FindBy(id = "menu-item-browse")
    public WebElement ortamKutuphanesi;

    @FindBy(id = "__wp-uploader-id-1")
    public WebElement dosyaSecinButon;

    @FindBy(xpath = "//button[@class='button media-button button-primary button-large media-button-select']")
    public WebElement sec;

    @FindBy(xpath = "//img[@id='featured_img_display']")
    public WebElement foto;

    @FindBy(xpath = "(//*[text()='Categories'])[1]")
    public WebElement categories;

    @FindBy(xpath = "//input[@value='235']")
    public WebElement besinTakviyeleri;
    @FindBy(xpath = "//input[@value='225']")
    public WebElement cokSatanlar;
    @FindBy(xpath = "//input[@value='230']")
    public WebElement elektrik;
    @FindBy(xpath = "//input[@value='228']")
    public WebElement evYasam;
    @FindBy(xpath = "//input[@value='227']")
    public WebElement indirimli;
    @FindBy(xpath = "//input[@value='232']")
    public WebElement kmf;
    @FindBy(xpath = "//input[@value='231']")
    public WebElement kozmetik;
    @FindBy(xpath = "//input[@value='234']")
    public WebElement modaGiyim;
    @FindBy(xpath = "//input[@value='233']")
    public WebElement oyuncak;
    @FindBy(xpath = "//input[@value='229']")
    public WebElement takiAksesuar;
    @FindBy(xpath = "//input[@value='226']")
    public WebElement yeniUrunler;

    @FindBy(xpath = "(//*[text()='Short Description'])[1]")
    public WebElement shortDescriptionGorunum;
    @FindBy(xpath = "//body[@data-id='excerpt']")
    public WebElement shortDescriptionText;
    @FindBy(xpath = "//body[@data-id='description']")
    public WebElement descriptionText;
    @FindBy(xpath = "(//*[text()='Description'])[1]")
    public WebElement descriptionGorunum;

    // US_013_TC001_Gokhan YAMAN
    @FindBy(xpath = "//span[contains(text(),'Kuponlar')]")
    public WebElement coupons;

    @FindBy(xpath = "//a[@id='add_new_coupon_dashboard']")
    public WebElement addNewCoupon;

    @FindBy(xpath = "//input[@id='title']")
    public WebElement couponCodeBox;

    @FindBy(xpath = "//textarea[@id='description']")
    public WebElement descriptionBox;

    @FindBy(xpath = "//input[@id='coupon_amount']")
    public WebElement couponAmount;

    @FindBy(xpath = "//input[@id='free_shipping']")
    public WebElement checkBoxAllowFreeShipping;

    @FindBy(xpath = "//input[@id='show_on_store']")
    public WebElement checkBoxShowOnStore;

    @FindBy(xpath = "//input[@id='minimum_amount']")
    public WebElement minimumSpendTexBox;

    @FindBy(xpath = "//input[@id='maximum_amount']")
    public WebElement maximumSpendTexBox;

    @FindBy(xpath = "//input[@id='individual_use']")
    public WebElement checkBoxIndividualUseOnly;

    @FindBy(xpath = "//input[@id='exclude_sale_items']")
    public WebElement checkBoxExcludeSaleItems;

    @FindBy(xpath = "//select[@id='exclude_product_categories']")
    public WebElement dropDowmMenuExcludeCategories;

    @FindBy(xpath = "//input[@id='wcfm_coupon_manager_submit_button']")
    public WebElement submitButton;

    @FindBy(xpath = "//*[text()='Coupon Successfully Published.']")
    public WebElement textMessage;

    @FindBy(xpath = "//div[@id='coupons_manage_limit']")
    public WebElement limitButton;

    @FindBy(xpath = "//input[@id='usage_limit']")
    public WebElement usageLimitPerCouponBox;

    @FindBy(xpath = "//input[@id='limit_usage_to_x_items']")
    public WebElement limitUsagetoXItemsBox;

    @FindBy(xpath = "//input[@id='usage_limit_per_user']")
    public WebElement limitUsageForUserBox;

    @FindBy(xpath = "//input[@id='wcfm_coupon_manager_submit_button']")
    public WebElement limitSubmitButton;

    // Enes Ayhan US012
    @FindBy(xpath = "//span[text()='Giriş Yap']")
    public WebElement girisYap_Enes;


    @FindBy(xpath = "//*[text()='Store Manager']")
    public WebElement storeManagerEnes;

    @FindBy(xpath = "(//*[text()='Siparişler'])[1]")
    public WebElement siparislerButonuEnes;

    @FindBy(xpath = "//div[@class='woocommerce-MyAccount-content col-md-9 pt-2']")
    public WebElement siparislerListesiEnes;

    @FindBy(xpath = "(//*[text()='İndirmeler'])[1]")
    public WebElement indirmelerButonuEnes;

    @FindBy(xpath = "//div[@class='woocommerce-MyAccount-content col-md-9 pt-2']")
    public WebElement indirmelerListesiEnes;

    @FindBy(xpath = "//*[text()='Adres']")
    public WebElement adresButonuEnes;

    @FindBy(xpath = "(//div[@class='woocommerce-Address'])[1]")
    public WebElement faturaAdretTablosuEnes;

    @FindBy(xpath = "(//div[@class='woocommerce-Address'])[2]")
    public WebElement gonderimAdretTablosuEnes;

    @FindBy(xpath = "//*[text()='Hesap detayları']")
    public WebElement hesapDetaylariButonuEnes;


    @FindBy(xpath = "//div[@class='woocommerce-MyAccount-content col-md-9 pt-2']")
    public WebElement hesapDetaylariTablosuEnes;

    @FindBy(xpath = "//input[@type='email']")
    public WebElement hesapDetaylari_MailKutusuButonuEnes;

    @FindBy(xpath = "//button[@name='save_account_details']")
    public WebElement hesapDetaylari_degisiklileriKaydetButonuEnes;

    //Enes Ayhan US018

    @FindBy(xpath = "(//span[@class='text'])[8]")
    public WebElement geriOdemeButonuEnes;

    @FindBy(xpath = "//div[@class='dataTables_wrapper']")
    public WebElement geriOdemeTablosuEnes;

    @FindBy(xpath = "//thead//tr")
    public List<WebElement> geriOdemeTablosuBasliklarEnes;

    @FindBy(xpath = "//*[text()='Hesap bilgileri başarıyla değiştirildi.']")
    public WebElement hesapBilgileriDegistiTablosuEnes;

// zulkif US19-US20

    @FindBy(xpath = "//div[12]/a")
    public WebElement takipciler;


    @FindBy(xpath = "//div[17]/a")
    public WebElement incelemeLinki;
    //inceleme  //div[17]/a


    @FindBy(xpath = "//*[@id='wcfm-followers']/tbody/tr[1]/td[1]")
    public WebElement nameYazi;

    @FindBy(xpath = "//*[@id=\"wcfm-followers\"]/tbody/tr[1]/td[2]")
    public WebElement epostaYazi;

    @FindBy(xpath = "//*[@id=\"wcfm-followers\"]/tbody/tr[1]/td[3]/a/span")
    public WebElement islemSilButon;

    @FindBy(xpath = "//a[@id='add_new_product_dashboard']")
    public WebElement productReviews;

    @FindBy(xpath = "(//td//div[@class='wcfmmp-author-meta'])[1]")
    public WebElement author;

    @FindBy(xpath = "(//div[@class='wcfmmp-comments-content'])[1]")
    public WebElement comment;

    @FindBy(xpath = "(//div[@class='star-rating'])[1]")
    public WebElement rating;

    @FindBy(xpath = "//*[@id='wcfm-reviews']/tbody/tr[1]/td[6]")  ////*[@id="wcfm-reviews"]/tbody/tr[2]/td[6]
    public WebElement dated;

    //Erkam locators

    @FindBy(xpath = "//a[@class='login inline-type']")
    public WebElement girisYapErkam;
    @FindBy(xpath = "//input[@class='woocommerce-Input woocommerce-Input--text input-text']")
    public WebElement kullaniciAdi;
    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordErkam;
    @FindBy(xpath = "//button[@class='woocommerce-button button woocommerce-form-login__submit']")
    public WebElement loginButton;
    @FindBy(xpath = "//li[@id='menu-item-1074']")
    public WebElement hesabimButton;
    @FindBy(xpath = "//p[@class='text-uppercase text-center mb-0']")
    public WebElement orders;
    @FindBy(xpath = "//a[@class='btn btn-dark btn-rounded btn-icon-right continue-shopping mb-4 mt-6']")
    public WebElement alisveriseDevam;
    @FindBy(xpath = "(//img[@class='attachment-woocommerce_thumbnail size-woocommerce_thumbnail'])[5]")
    public WebElement abcKitap;
    @FindBy(xpath = "//button[@class='quantity-plus w-icon-plus']")
    public WebElement urunArti;
    @FindBy(xpath = "//button[@class='single_add_to_cart_button button alt']")
    public WebElement sepeteEkle;
    @FindBy(xpath = "//i[@class='w-icon-cart']")
    public WebElement sepetim;
    @FindBy(xpath = "//div[@class='cart-item-meta mini-item-meta']")
    public WebElement viewCart;
    @FindBy(xpath = "//a[@class='button wc-forward']")
    public WebElement sepetiGoruntule;
    @FindBy(xpath = "//input[@class='input-text qty text']")
    public WebElement miktarBar;
    @FindBy(xpath = "//button[@class='btn btn-rounded btn-outline btn-default btn-border-thin wc-action-btn mb-4']")
    public WebElement sepetiYenile;
    @FindBy(xpath = "//a[@class='checkout-button button alt wc-forward']")
    public WebElement odemeSayfasi;
    @FindBy(xpath = "//input[@class='input-text ']")
    public WebElement ad;
    @FindBy(xpath = "//input[@id='billing_last_name']")
    public WebElement soyad;
    @FindBy(xpath = "//input[@id='billing_company']")
    public WebElement firmaAdi;
    @FindBy(xpath = "//input[@id='billing_address_1']")
    public WebElement sokakAdresi;
    @FindBy(xpath = "//input[@id='billing_postcode']")
    public WebElement postaKodu;
    @FindBy(xpath = "//input[@id='billing_city']")
    public WebElement ilce;
    @FindBy(xpath = "//span[@id='select2-billing_state-container']")
    public WebElement sehir;
    @FindBy(xpath = "//li[@id='select2-billing_state-result-86p3-TR01']")
    public WebElement adana;
    @FindBy(xpath = "//li[@id='select2-billing_state-result-d2ec-TR02']")
    public WebElement adıyaman;
    @FindBy(xpath = "//li[@id='select2-billing_state-result-xx8s-TR03']")
    public WebElement afyon;
    @FindBy(xpath = "//input[@id='billing_phone']")
    public WebElement telefonNum;
    @FindBy(xpath = "//input[@id='billing_email']")
    public WebElement ePosta;
    @FindBy(xpath = "//input[@id='wcfmmp_user_location']")
    public WebElement teslimatAdres;
    @FindBy(xpath = "//button[@id='place_order']")
    public WebElement siparisiOnayla;
    @FindBy(xpath = "//button[@class='btn btn-rounded btn-outline btn-default btn-border-thin mb-4 mr-2 clear-cart-button']")
    public WebElement sepetiTemizle;
    @FindBy(xpath = "//p[@class='cart-empty woocommerce-info']")
    public WebElement sepetinizBosYazisi;
    @FindBy(xpath = "//button[@class='btn btn-rounded btn-border-thin btn-outline btn-dark button']")
    public WebElement kuponKullanButton;
    @FindBy(xpath = "//a[@class='btn btn-dark btn-rounded btn-icon-left continue-shopping mb-4 mr-auto']")
    public WebElement alisveriseDevamEtButton;
    @FindBy(xpath = "//p[@class='woocommerce-shipping-destination']")
    public WebElement shippingInfo;
    @FindBy(xpath = "//a[@class='checkout-button button alt wc-forward']")
    public WebElement odemeSayfasinaGit;
    @FindBy(xpath = "//div[@class='woocommerce-billing-fields']")
    public WebElement odemeSayfasiGoruntusu;


    // cigdem locates

    @FindBy(xpath = "//li[@id='menu-item-1074']")
    public WebElement hesabim;
    @FindBy(id = "username")
    public WebElement username;
    @FindBy(id = "password")
    public WebElement password;
    @FindBy(xpath = "//button[@name='login']")
    public WebElement girisButonu;
    @FindBy(xpath = "//a[@href='https://tradylinn.com/store-manager/']")
    public WebElement storeManager;
    @FindBy(xpath = "//span[@class='wcfmfa fa-user-circle']")
    public WebElement musteriler;
    @FindBy(xpath = "(//td[@class='sorting_1'])[1]")
    public WebElement kayitliMusteriIsimleri;
    @FindBy(xpath = "(//tbody//td)[2]")
    public WebElement kayitliMusteriKullaniciIsimleri;
    @FindBy(xpath = "(//tbody//td)[3]")
    public WebElement kayitliMusteriEmailleri;
    @FindBy(xpath = "(//tbody//td)[4]")
    public WebElement kayitliMusteriAdresleri;
    @FindBy(xpath = "(//tbody//td)[6]")
    public WebElement kayitliMusteriHarcamaMiktarlari;
    @FindBy(xpath = "(//tbody//td)[7]")
    public WebElement kayitliMusteriSonSiparisleri;
    @FindBy(xpath = "//a[@class='dt-button buttons-pdf buttons-html5']")
    public WebElement PDFButonu;
    @FindBy(xpath = "//a[@class='dt-button buttons-excel buttons-html5']")
    public WebElement ExcelButonu;
    @FindBy(xpath = "//a[@class='dt-button buttons-csv buttons-html5']")
    public WebElement CSVButonu;
    @FindBy(xpath = "//a[@class='add_new_wcfm_ele_dashboard text_tip']")
    public WebElement yeniEkle;
    @FindBy(id = "user_name")
    public WebElement musteriUserName;
    @FindBy(id = "bstate")
    public WebElement bilState;
    @FindBy(xpath = "//input[@type='checkbox']")
    public WebElement sAB;
    @FindBy(id = "bcity")
    public WebElement bilCity;
    @FindBy(xpath = "//option[@value='TR']")
    public WebElement bilCountry;
    @FindBy(xpath = "(//option[@value='TR'])[2]")
    public WebElement shipCountry;
    @FindBy(xpath = "//input[@id='scity']")
    public WebElement shipCity;
    @FindBy(id = "sstate")
    public WebElement shipState;
    @FindBy(id = "wcfm_customer_submit_button")
    public WebElement submitButonu;
    @FindBy(id = "bfirst_name")
    public WebElement firstname;
    @FindBy(xpath = "//tbody")
    public List<WebElement> tumBody2;

    //9-10-11 US
    @FindBy (xpath = "//h2[@class=\"page-title\"]")
    public WebElement hesabimText;
    @FindBy (xpath = "(//a[@target=\"_blank\"])[2]")
    public WebElement storeManagerText;
    @FindBy(xpath = "//div[@class=\"wcfm_menu_items wcfm_menu_wcfm-products\"]")
    public WebElement urun;
    @FindBy(id = "add_new_product_dashboard")
    public WebElement yeniEkle_Emrah;
    @FindBy(id = "wcfm_products_manage_form_shipping_head")
    public WebElement shipping;
    @FindBy(xpath = "//p[@class=\"weight wcfm_title\"]")
    public WebElement weightText;
    @FindBy(id = "wcfm_products_manage_form_attribute_head")
    public WebElement attributes;
    @FindBy(id = "wcfm_products_manage_form_toptan-urun-gosterme-ayarlari_head")
    public WebElement TUGAyarlari;
    @FindBy(id = "attributes_value_1")
    public WebElement ddColor;
    @FindBy(id = "attributes_value_2")
    public WebElement ddSize;
    @FindBy(id = "attributes_is_active_1")
    public WebElement attributes_Color;
    @FindBy(id = "attributes_is_active_2")
    public WebElement attributes_Size;
    @FindBy(xpath = "//*[@id=\"weight\"]")
    public WebElement shipping_Weight;
    @FindBy(xpath = "//input[@id=\"length\"]")
    public WebElement shipping_Length;
    @FindBy(xpath = "//input[@id=\"width\"]")
    public WebElement shipping_Width;
    @FindBy(xpath = "//input[@id=\"height\"]")
    public WebElement shipping_Height;
    @FindBy(xpath = "//select[@id=\"_wcfmmp_processing_time\"]")
    public WebElement ddProsessingTime;
    @FindBy(xpath = "//select[@id=\"piecetype\"]")
    public WebElement ddPieceType;
    @FindBy(xpath = "//input[@id=\"unitpercart\"]")
    public WebElement unitsPP;
    @FindBy(xpath = "//input[@id=\"minorderqtytr\"]")
    public WebElement minOQuantity;
}

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
//connect db
import java.sql.Connection as Connection
import java.sql.ResultSet as ResultSet
import com.katalon.plugin.keyword.connection.DBType as DBType
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

Connection connection = null

ResultSet cif

connection = CustomKeywords.'com.katalon.plugin.keyword.connection.DatabaseKeywords.createConnection'(DBType.sqlserver, 
    '172.18.136.163', '1433', 'RP_INDIVIDUAL', 'sa', 'UEBzc3cwcmQ=')

//cif = CustomKeywords.'com.katalon.plugin.keyword.connection.DatabaseKeywords.executeQuery'(connection, 'SELECT * FROM CFGEN_ACCOUNT WITH(NOLOCK)')

WebUI.openBrowser('')

WebUI.navigateToUrl('http://172.18.136.165:82/')

WebUI.click(findTestObject('Object Repository/Testing Add Data Monitoring Debitur_170252/Page_BRISIM - BRI Sistem Informasi Manajemen/input_Informasi Login_pn'))

//WebUI.setText(findTestObject('Object Repository/Testing Add Data Monitoring Debitur_170252/Page_BRISIM - BRI Sistem Informasi Manajemen/input_Informasi Login_pn'), 
//    '170252')

WebUI.setText(findTestObject('Object Repository/Testing Add Data Monitoring Debitur_170252/Page_BRISIM - BRI Sistem Informasi Manajemen/input_Informasi Login_pn'),
	'ATUK251')

pass = WebUI.getAttribute(findTestObject('Object Repository/Testing Add Data Monitoring Debitur_170252/Page_BRISIM - BRI Sistem Informasi Manajemen/input_Informasi Login_pn'),
	'value' )

println(pass)

//coba verify data
//WebUI.verifyMatch(findTestData(CFGEN_Test_Data).getValue([CIFNO],1),WebUI.getAttribute(findTestObject('Object Repository/Testing Add Data Monitoring Debitur_170252/Page_BRISIM - BRI Sistem Informasi Manajemen/input_Informasi Login_pn'),
//	'value'))
//WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Object Repository/Testing Add Data Monitoring Debitur_170252/Page_BRISIM - BRI Sistem Informasi Manajemen/input_Informasi Login_pn'),'value'), WebUI.	findTestData('Data Files/CFGEN Test Data'))
//WebUI.verifyMatch(findTestData(‘your/test/data’).getValue(1,1), WebUI.getAttribute(findTestObject(‘your/test/object’), ‘value’ ))
 
WebUI.break


WebUI.setEncryptedText(findTestObject('Object Repository/Testing Add Data Monitoring Debitur_170252/Page_BRISIM - BRI Sistem Informasi Manajemen/input_Informasi Login_password'), 
    'tzH6RvlfSTg=')

WebUI.setText(findTestObject('Object Repository/Testing Add Data Monitoring Debitur_170252/Page_BRISIM - BRI Sistem Informasi Manajemen/input_Informasi Login_captcha'), 
    pass)

WebUI.click(findTestObject('Object Repository/Testing Add Data Monitoring Debitur_170252/Page_BRISIM - BRI Sistem Informasi Manajemen/button_Login'))

WebUI.click(findTestObject('Object Repository/Testing Add Data Monitoring Debitur_170252/Page_BRISIM - BRI Sistem Informasi Manajemen/button_Setuju'))

WebUI.click(findTestObject('Object Repository/Testing Add Data Monitoring Debitur_170252/Page_BRISIM - BRI Sistem Informasi Manajemen/b_Aplikasi Pendukung_arrow fa fa-angle-down'))

WebUI.click(findTestObject('Object Repository/Testing Add Data Monitoring Debitur_170252/Page_BRISIM - BRI Sistem Informasi Manajemen/a_Cash Flow Generator'))

WebUI.click(findTestObject('Object Repository/Testing Add Data Monitoring Debitur_170252/Page_BRI-CFG/a_Monitoring'))

WebUI.click(findTestObject('Object Repository/Testing Add Data Monitoring Debitur_170252/Page_BRI-CFG/a_Monitoring Debitur'))

WebUI.click(findTestObject('Object Repository/Testing Add Data Monitoring Debitur_170252/Page_BRI-CFG/button_Tambah Data'))

WebUI.setText(findTestObject('Object Repository/Testing Add Data Monitoring Debitur_170252/Page_BRI-CFG/input_Cari Berdasarkan CIF_inpSearch'),
    'qwe123')

cifNo = WebUI.getAttribute(findTestObject('Object Repository/Testing Add Data Monitoring Debitur_170252/Page_BRI-CFG/input_Cari Berdasarkan CIF_inpSearch'), 
   "inpSearch" )

//WebUI.setText(findTestObject('Object Repository/Testing Add Data Monitoring Debitur_170252/Page_BRI-CFG/input_Cari Berdasarkan CIF_inpSearch'), 
//    'qwe123')


//WebUI.click(findTestObject('Object Repository/Testing Add Data Monitoring Debitur_170252/Page_BRI-CFG/button_Search'))

WebUI.setText(findTestObject('Object Repository/Testing Add Data Monitoring Debitur_170252/Page_BRI-CFG/input__ket'), cifNo)

//WebUI.click(findTestObject('Object Repository/Testing Add Data Monitoring Debitur_170252/Page_BRI-CFG/button_Simpan'data:image/pjpeg;base64,/9j/4AAQSkZJRgABAQEAYABgAAD/2wBDAAEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQH/2wBDAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQH/wAARCABAAEADASIAAhEBAxEB/8QAHwAAAQUBAQEBAQEAAAAAAAAAAAECAwQFBgcICQoL/8QAtRAAAgEDAwIEAwUFBAQAAAF9AQIDAAQRBRIhMUEGE1FhByJxFDKBkaEII0KxwRVS0fAkM2JyggkKFhcYGRolJicoKSo0NTY3ODk6Q0RFRkdISUpTVFVWV1hZWmNkZWZnaGlqc3R1dnd4eXqDhIWGh4iJipKTlJWWl5iZmqKjpKWmp6ipqrKztLW2t7i5usLDxMXGx8jJytLT1NXW19jZ2uHi4+Tl5ufo6erx8vP09fb3+Pn6/8QAHwEAAwEBAQEBAQEBAQAAAAAAAAECAwQFBgcICQoL/8QAtREAAgECBAQDBAcFBAQAAQJ3AAECAxEEBSExBhJBUQdhcRMiMoEIFEKRobHBCSMzUvAVYnLRChYkNOEl8RcYGRomJygpKjU2Nzg5OkNERUZHSElKU1RVVldYWVpjZGVmZ2hpanN0dXZ3eHl6goOEhYaHiImKkpOUlZaXmJmaoqOkpaanqKmqsrO0tba3uLm6wsPExcbHyMnK0tPU1dbX2Nna4uPk5ebn6Onq8vP09fb3+Pn6/9oADAMBAAIRAxEAPwD+/cdB9B/KlpB0H0H8qWgAr8av22f+Cx3wg/Zz13xZ8GPgf4en/aI/aQ0GWXSL3w7pF3/Zvwy8A67FcfZb+L4heOFE73l/oDR6j/afhHwVZa3q0etaPdeD/Eup+BdVuEvbb7w/bd8f6l8Mv2Rv2ifF+ha3f+G/FFt8KPFui+Cdf0yKeW/0fx/4u06Twh4A1C3Fti4ia18Z67ocrXURDWcaPd5AhJH8jH7M3wV8K/DvwsLGS0kvZdYeczG6lVzBHIjQ28VoHCeRBKjm8aPyvLmluZmC+ZI6SfMcSZ+slowjTjz4iqlKCdrKHNyuTu1tq1vtbrdfa8G8K/6yYqp7ao6WFoNRnKOjnNpNRTs+8b9lLmvpZ/W1h/wXP/bq03SdK8UeIvgn+zlrttBrOhya74V8JaZ8SbTUNQ0AETa1pmh6/qPjvULS28Q6oEvdL0W+tdO8W/2VcW8GqXnhPWLRprRv3K/YR/4KT/AX9vLRby08EPf+CPiz4d0LTte8Y/CLxTd6Vda1Z6bcpYW194h8H63pF3daT478F6brl9Fod5rWnnT/ABB4fu7vQ4fiD4O8B6n4m0HSb38Zpvhj4PvdEtDNeal9utbF7C1luZobnzNNj3S3WmxpLFGhs5beWVI4UWS1gWaWN4zITEnA/DCfRf2Zvi74G+LfgrQHg1XwZr41a6g0q3gGp+IvD2rLLaeN/CttLqMkFiz+LvDc9/YWrXcy6dZ6zJo/iACPUNIsLi38DB8aRWJoUa8akoYirFSc+Vexpz5VGS5W3KScryvZOKfWx9lmvhjUjgsRisJOhCeGw86kYQlOX1ipD3nBqSioXScYtX1cW20mj+uOimqdyq3HzKDwdw5GeGHDD0I69adX6MfjAg6D6D+VLSDoPoP5UtAH5If8FXvj7p3hP4VXHwFOh3txefEvS9F8Q6j4qEssWn+ErTwz8QvDGr6HbS2n2GUavP4yvvD+raDGbW8Q+HXSDVtVtLnT544pPwH8YeLtcstHtrjwjDrd5cKskVqNCsND1DVVS2iEkdvplt4g1HT9Ga+udjvBearNNpcEzNBeWrtcWlzD++n/AAVt+FHjTx18MfBvjTQPDV94l8LfC8eKfEPjxNPvNLhk0vS01LwJrel61dWV5d22o39houpeF01e+/saO5uLWzsLiW8j+wNPu/Cr4YXOkWepC31Ym70e6urm6ksi07RTQlxd2LOUk/1SogeTKqshEnmMyTGM/i/GtfExz6cMRzOjBUHhOanGMPYOlSlLk5ouNa1d11Jy51zc0Ps8sf6Q8N8Bl1fhvCVME1SxVSWIjm3LiJVKjxSxVeNFyjGpfDOeDp4dxhBUvc5anvTk5ym+EHxA+JPiPWrq01ez+JFlp76ZPqelp8VLH4bq2nMtpPcS6Ytx8NPt8dvejLQJHfvdwlZ7eJ7hrqQO3jfxE+LfjWfUrO/1G5+Iej28mrWllp9gPA/hbVvCzwR22ZTqmpaHbX3ijRop7u3a1tL/AFK600Wt1daRfXdvc+G5VlP1j4o8S6/4RntvEfhjQfCt34asrO1bTvC9/e38GpW9pb/bLW7vY7K0injuRqlvNp19HqeovewCxubyC5j0djc3N1zkFr4a8S+Hry88QeG9E03xFaTX89jDZudSsLVIX8wyxz3FvEltNY312JILea3gurdLmKMRIIePDk6tLmxfIpxqO0IOEeWmr0+WUW4NNxs1ouZKSvJ6H3lTC0KlCGAWLXtKMXKbVapJ1Lp+47VE29XeLbSa2tv/AFq/CHxnP8R/hP8ADD4h3VnFp9z48+HvgvxlcWEDNJBZT+J/Dem63NaQO4DvDbyXzQxO4DsiKWAYkV6HXif7NSCP9nX4BxL92P4LfC1B93+DwRoi8bQFx8vG0BcY2gDFe2V+/YZylh6EpO8pUacpPu3BN9F3P47xcI08ViacFaEMRWhFPW0Y1JRir9bJJXEHQfQfyrwv4/8A7Tv7Pf7K/gu5+IP7RPxi8AfCDwtDZ6zd2l3408Q2Omah4hk0HS5tZ1LSfBnh7zJPEXjnxMunwPLZeE/Bula74n1WVobPStIvby5t7eX+G3/god/wcu/tVfFnxf4w+Ev7IFjL+zD8LdGuvEng2+8ZNFoviT45+N/s114n8P3+pf8ACQT2t7ofwrtL/SbjR7zTdP8AANtcePfCPiXS5tX0f4vXsV3bafp/82XxE+JnxF+L3jHVfiH8WviD41+Jvj3xB9gGt+NviD4n1vxj4t1k6Tpllomlf2v4i8RX2paxqP8AZuj6bp2k2QvL2X7Lp1hZ2MJS1tYoV64UpS391b7f1/XQzVP+bR9uvT7v+Af0Ef8ABXn/AIOKNa/bk8H2X7On7MXwt8T/AAe+Eem/EfwF8QNc8c/EPW9HvfHfxWHghtH8XeGvCGt+A/D8WseF/BXh7QviXYQa/dpaeOfH134puPCvg+/hvvCyR654dvuv/ZI/af8ACvxQ+Hekajfl7XXbeOyXWrNLvz7vR9Vijj+16bcK1nC92LK4mlntZHjiGq28sF5DDm5hjk/lg1tZNNvRqP2aW6tzHuuI7Vx9pPlOGgW3t5hDFLlnmLO13CU2IsaSM5KfQXwu+Juv/DzWNF8V+EdVv9H1Kyns5tQt45bb7LrdlFs+06LrNtJDe6fd29zC9xZvNJbXMunzTf2hpbx3UMMw+c4n4WpZ7QpypSjRx2GU/YznzezqxlZujVavKKckpRnFScHdcrjJn3HBnF1XhfFVYyhKrl+KcPrFOKTqU5wa5a9HmfK5KLanBuKqR05ouMT+wy38B/Drxa9z41HijS9bbVre1knute1TV/EOlRx2sMVvappmgDxHY2eg3VvDDDbxS6XBCxNusk7STcij8M/hX4d1H43eCfgz4Q8XPpjfGrxt4f8ADl7NqvilpLLTrKK6luta1Pw3beK/EEGnR3VtpCajfWHhiwvRea9q32fSNGtrrWdUij1K/wDDb9h7xT8d/gV4O/ag/ZS8cS+Pfh38TdFl8Rad4evzZeDfiDp90NZvdM1bwrr1tHrGtfD7UPE3g+7tbnSPGGqWWt6OdS8QaPqf9l6c1o1pBL+OX/BTz4FfE3wt+x1rPjn4m+FrHwdqml/tp/C74T+FtMuvHHhrxl41It/2ePi18TPEl94sg8K6rr9v4NXVrXxL4SfQPB+qavP4ibSYdO8Vahp2i2WtadZ3P57guF81nmdDBZhhcTQw6n7bEVryqUJUYyhKUY1adWdFuq1GC1jKHM5OK5bP9eznjvK1w7XxOV4vD18RGDp4Si5uFWjXrQcfavDVYRqQVJTlUfuqEnBQUmpXX+lvEixxxxoqqiIiIqDCqqqFUKOygAADsMCn1/lxf8E+/wDgvr+3x+w1c+GvBV74+uP2hvgLpDaZpr/Bz423194jk0Pw7Zp4V0lNP+GnxHllm8dfD9NH8JeFh4b8FeH49V174TeFW1XU9Zb4W6zqcrO39yX/AASt/wCCzXwE/wCCoFj4l8LaD4W1r4O/H3wNo914p8W/B7XtWg8U2c/gsa+mj2njHwL46s9M0OHxdolodS8N2XipL/w54X1jwz4k1y30yTSb/RbrQfE+v/sTg4rRXjpZpaWsvkt7fI/meSad9X5/5n+ZL8R1kh+KXxBnXIaTx740bb3HleI78KckdGQqAMAgDnnisS8iV41nUhAMGbjAUnOZcjGBn7+eMHzGI2tnqviYQ3xM+IoYjB8deMlUEjAD6/fsflHUArgZBxjjFcYtyUsv32MBmSdW+YEHcrr1yFzyWBIAYkngsO1JLY2MzUIBPE0JbbIVOyRFid4pkIZZUEqSRb0YK6b0eMuo3KwBrB0q+u4ZSlyy/a48m5EamO3vYgQv22zWR2dYyZYhNbMxmspiI5Glhmtby717S4Wd5I3b95YTvZSO8ySSMoiimtppGVYwZJbWeF5gEwJC4BwAaoXtpH5qSEAKT5kMi4+VtrJlSOuULRsDlXiZonDRsyFgfst/wTu/4Kb/ABH/AGSPg1+01+zhplvDr3gf9o/wlJpvhrTm0ySe68MfEfxJqXhXwd4w1y31Sy1zRrzT4/E/waHi3S4Zo9O8Sajb/ELQfhbd6VaaZpkXi3+2Y/ir8Ktc+MH7Kf7QOu/B/wC3v8Pfht4x+Hnxz+IyaqPsnlap8JdB+IvhfTrfQ4lli/eX3gb44+ONZ8UX/wDYtpBdv4b8CafBdFobhl/HCzvYT58SsJIgwt7qF0+WOVoYpCArfLLE0MiZdWeNvmRmE0csSftx+xL8dNaX4d/EzUbP+zfFF5e+ENa8F/Ej4f6yxbTPGHh/XtPk07UYItPtrmaTTR4h8O6dpd1Y6hJB/YEPjzwvYzL4SvNG0ifRtW+54YhTznKs34aSpQx2J9nj8BNxtPEVcGvaTw06jl0hBewpqO1XETb5YtP57Nqjy/HYDNp88sLSU8HiYq7jRhiWoxrqKX879+Tau4UoLc/DW/sfJnglhfMQJKkkn5WHCbiWLbZEk3O3zMTvJbczV9c/sP8A7Vnif9iz9q34D/tR+E7Y6jqHwe8bW+s6zoqJpQn8U+ANWsLvwv8AEvwXDfazpus22jzeLvh9rPiLQrXXYdOubzQby8tNa02D+0dMsmX5l13To9Hm1fRIpZbhfDms6toa3FxB9lnuF0LUbnSpLiW2866+zyzfZGlktxdXHlO7IJ5sB25+C4WKVUYM6HcCFRnAZRgxvjA6HDDOF5565+HqU5U5VKNSLhOnKVOpCSs4Ti3GUWnqpKV01ume/GUZxjKLUoyipRa1TjKzi09mndW79D//2Q==))
//
//WebUI.acceptAlert()


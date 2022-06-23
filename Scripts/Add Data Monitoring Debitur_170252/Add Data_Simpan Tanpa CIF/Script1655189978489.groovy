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
ResultSet addCif
ResultSet keterangan
ResultSet dokumen

connection = CustomKeywords.'com.katalon.plugin.keyword.connection.DatabaseKeywords.createConnection'(DBType.sqlserver, 
    '172.18.136.163', '1433', 'RP_INDIVIDUAL', 'sa', 'UEBzc3cwcmQ=')

WebUI.openBrowser('')

WebUI.navigateToUrl('http://172.18.136.165:82/')

WebUI.click(findTestObject('Object Repository/Testing Add Data Monitoring Debitur_170252/Page_BRISIM - BRI Sistem Informasi Manajemen/input_Informasi Login_pn'))

WebUI.setText(findTestObject('Object Repository/Testing Add Data Monitoring Debitur_170252/Page_BRISIM - BRI Sistem Informasi Manajemen/input_Informasi Login_pn'),
	'170252')

WebUI.setEncryptedText(findTestObject('Object Repository/Testing Add Data Monitoring Debitur_170252/Page_BRISIM - BRI Sistem Informasi Manajemen/input_Informasi Login_password'),
	'tzH6RvlfSTg=')

WebUI.setText(findTestObject('Object Repository/Testing Add Data Monitoring Debitur_170252/Page_BRISIM - BRI Sistem Informasi Manajemen/input_Informasi Login_captcha'),
	'123')

WebUI.click(findTestObject('Object Repository/Testing Add Data Monitoring Debitur_170252/Page_BRISIM - BRI Sistem Informasi Manajemen/button_Login'))

WebUI.click(findTestObject('Object Repository/Testing Add Data Monitoring Debitur_170252/Page_BRISIM - BRI Sistem Informasi Manajemen/button_Setuju'))

WebUI.click(findTestObject('Object Repository/Testing Add Data Monitoring Debitur_170252/Page_BRISIM - BRI Sistem Informasi Manajemen/b_Aplikasi Pendukung_arrow fa fa-angle-down'))

WebUI.click(findTestObject('Object Repository/Testing Add Data Monitoring Debitur_170252/Page_BRISIM - BRI Sistem Informasi Manajemen/a_Cash Flow Generator'))

WebUI.click(findTestObject('Object Repository/Testing Add Data Monitoring Debitur_170252/Page_BRI-CFG/a_Monitoring'))

WebUI.click(findTestObject('Object Repository/Testing Add Data Monitoring Debitur_170252/Page_BRI-CFG/a_Monitoring Debitur'))

WebUI.click(findTestObject('Object Repository/Testing Add Data Monitoring Debitur_170252/Page_BRI-CFG/button_Tambah Data'))

WebUI.setText(findTestObject('Object Repository/Testing Add Data Monitoring Debitur_170252/Page_BRI-CFG/input_Cari Berdasarkan CIF_inpSearch'),
	'NEPY420')

WebUI.click(findTestObject('Object Repository/Testing Add Data Monitoring Debitur_170252/Page_BRI-CFG/button_Search'))

//Ambil Value cifNo
cifNo = WebUI.getAttribute(findTestObject('Object Repository/Testing Add Data Monitoring Debitur_170252/Page_BRI-CFG/input_Cari Berdasarkan CIF_inpSearch'),
   "value" )
query = "SELECT CIFNO FROM [RP_INDIVIDUAL].[dbo].[CFGEN_ACCOUNT] WHERE CIFNO = '" + cifNo + "'"
print(query)

// Validasi apakah CIF memang benar ada di tabel CFGEN_ACCOUNT
cif = CustomKeywords.'com.katalon.plugin.keyword.connection.DatabaseKeywords.executeQuery'(connection,"SELECT CIFNO FROM [RP_INDIVIDUAL].[dbo].[CFGEN_ACCOUNT] WHERE CIFNO = '" + cifNo + "'")
WebUI.verifyMatch(cifNo,CustomKeywords.'com.katalon.plugin.keyword.connection.ResultSetKeywords.getSingleCellValue'(cif, 1, 'CIFNO'),true)

WebUI.click(findTestObject('Object Repository/Testing Add Data Monitoring Debitur_170252/Page_BRI-CFG/button_Add CIF'))

WebUI.setText(findTestObject('Object Repository/Testing Add Data Monitoring Debitur_170252/Page_BRI-CFG/input__ket'), 'qew')

WebUI.uploadFile(findTestObject('Object Repository/Testing Add Data Monitoring Debitur_170252/Page_BRI-CFG/input__file'), 'D:\\NumbersColoringBook.pdf')


//print(query)
//WebUI.click(findTestObject('Object Repository/Testing Add Data Monitoring Debitur_170252/Page_BRI-CFG/button_Simpan'))

//WebUI.dismissAlert()

//Validasi apakah CIF benar tersimpan di tabel CFGEN_ADD_ACCOUNT
addCif = CustomKeywords.'com.katalon.plugin.keyword.connection.DatabaseKeywords.executeQuery'(connection,"SELECT CIFNO FROM [RP_INDIVIDUAL].[dbo].[CFGEN_ADD_ACCOUNT] WHERE CIFNO = '" + cifNo + "'")
WebUI.verifyMatch(cifNo,CustomKeywords.'com.katalon.plugin.keyword.connection.ResultSetKeywords.getSingleCellValue'(addCif, 1, 'CIFNO'),true)
queryAddCif = "SELECT CIFNO FROM [RP_INDIVIDUAL].[dbo].[CFGEN_ADD_ACCOUNT] WHERE CIFNO = '" + cifNo + "'"
print(queryAddCif)
//Ambil value keterangan / komen
komen = WebUI.getAttribute(findTestObject('Object Repository/Testing Add Data Monitoring Debitur_170252/Page_BRI-CFG/input__ket'), "value")
queryKomen = "SELECT KETERANGAN FROM [RP_INDIVIDUAL].[dbo].[CFGEN_MANUAL_INPUT_FILE]] WHERE KETERANGAN = '" + komen + "'"
print(queryKomen)
//Validasi apakah Keterangan benar tersimpan di tabel [RP_INDIVIDUAL].[dbo].[CFGEN_MANUAL_INPUT_FILE]
addKomen = CustomKeywords.'com.katalon.plugin.keyword.connection.DatabaseKeywords.executeQuery'(connection,"SELECT KETERANGAN FROM [RP_INDIVIDUAL].[dbo].[CFGEN_MANUAL_INPUT_FILE] WHERE KETERANGAN = '" + komen + "'")
WebUI.verifyMatch(komen,CustomKeywords.'com.katalon.plugin.keyword.connection.ResultSetKeywords.getSingleCellValue'(addKomen, 1, 'KETERANGAN'),true)

//Ambil Value Dokumen

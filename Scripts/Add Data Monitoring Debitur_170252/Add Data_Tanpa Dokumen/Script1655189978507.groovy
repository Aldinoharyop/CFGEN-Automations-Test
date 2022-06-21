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
	'ATUK251 ')

WebUI.click(findTestObject('Object Repository/Testing Add Data Monitoring Debitur_170252/Page_BRI-CFG/button_Search'))

WebUI.click(findTestObject('Object Repository/Testing Add Data Monitoring Debitur_170252/Page_BRI-CFG/button_Add CIF'))

WebUI.setText(findTestObject('Object Repository/Testing Add Data Monitoring Debitur_170252/Page_BRI-CFG/input__ket'), 'qew')

WebUI.click(findTestObject('Object Repository/Testing Add Data Monitoring Debitur_170252/Page_BRI-CFG/button_Simpan'))

WebUI.acceptAlert()

WebUI.takeFullPageScreenshot()


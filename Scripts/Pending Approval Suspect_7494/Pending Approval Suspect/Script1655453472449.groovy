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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://172.18.136.165:82/')

WebUI.setText(findTestObject('Object Repository/Approval Suspect_7494/Page_BRISIM - BRI Sistem Informasi Manajemen/input_Informasi Login_pn'), 
    '7494')

WebUI.setEncryptedText(findTestObject('Object Repository/Approval Suspect_7494/Page_BRISIM - BRI Sistem Informasi Manajemen/input_Informasi Login_password'), 
    'tzH6RvlfSTg=')

WebUI.setText(findTestObject('Object Repository/Approval Suspect_7494/Page_BRISIM - BRI Sistem Informasi Manajemen/input_Informasi Login_captcha'), 
    '123')

WebUI.sendKeys(findTestObject('Object Repository/Approval Suspect_7494/Page_BRISIM - BRI Sistem Informasi Manajemen/input_Informasi Login_captcha'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Approval Suspect_7494/Page_BRISIM - BRI Sistem Informasi Manajemen/button_Setuju'))

WebUI.click(findTestObject('Object Repository/Approval Suspect_7494/Page_BRISIM - BRI Sistem Informasi Manajemen/a_Aplikasi Pendukung'))

WebUI.click(findTestObject('Object Repository/Approval Suspect_7494/Page_BRISIM - BRI Sistem Informasi Manajemen/small_Cash Flow Generator'))

WebUI.click(findTestObject('Object Repository/Approval Suspect_7494/Page_BRI-CFG/a_Pending Approval Suspect'))

WebUI.navigateToUrl('http://172.18.136.165:1097/c_suspect_pinca')

WebUI.click(findTestObject('Object Repository/Approval Suspect_7494/Page_BRI-CFG/a_LIHAT'))

WebUI.click(findTestObject('Object Repository/Approval Suspect_7494/Page_BRI-CFG/a_Cashflow'))

WebUI.click(findTestObject('Object Repository/Approval Suspect_7494/Page_BRI-CFG/a_Donwload Excel'))

WebUI.click(findTestObject('Object Repository/Approval Suspect_7494/Page_BRI-CFG/a_Skenario  Sensitivity Income'))

WebUI.click(findTestObject('Object Repository/Approval Suspect_7494/Page_BRI-CFG/a_Analisis Agunan'))

WebUI.click(findTestObject('Object Repository/Approval Suspect_7494/Page_BRI-CFG/a_Dokumen'))

WebUI.click(findTestObject('Object Repository/Approval Suspect_7494/Page_BRI-CFG/a_Info Debitur'))

WebUI.click(findTestObject('Object Repository/Approval Suspect_7494/Page_BRI-CFG/a_Pending Approval Suspect'))


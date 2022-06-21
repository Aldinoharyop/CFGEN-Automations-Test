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

WebUI.setText(findTestObject('Object Repository/Manage Suspect Monitoring_294536/Manage Suspect Account/A Kualitatif 1_BO Penurunan Nilai/input_Informasi Login_pn'), 
    '294536')

WebUI.setEncryptedText(findTestObject('Object Repository/Manage Suspect Monitoring_294536/Manage Suspect Account/A Kualitatif 1_BO Penurunan Nilai/input_Informasi Login_password'), 
    'tzH6RvlfSTg=')

WebUI.setText(findTestObject('Object Repository/Manage Suspect Monitoring_294536/Manage Suspect Account/A Kualitatif 1_BO Penurunan Nilai/input_Informasi Login_captcha'), 
    '123')

WebUI.sendKeys(findTestObject('Object Repository/Manage Suspect Monitoring_294536/Manage Suspect Account/A Kualitatif 1_BO Penurunan Nilai/input_Informasi Login_captcha'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Manage Suspect Monitoring_294536/Manage Suspect Account/A Kualitatif 1_BO Penurunan Nilai/button_Setuju'))

WebUI.click(findTestObject('Object Repository/Manage Suspect Monitoring_294536/Manage Suspect Account/A Kualitatif 1_BO Penurunan Nilai/a_Aplikasi Pendukung'))

WebUI.click(findTestObject('Object Repository/Manage Suspect Monitoring_294536/Manage Suspect Account/A Kualitatif 1_BO Penurunan Nilai/small_Cash Flow Generator'))

WebUI.click(findTestObject('Object Repository/Manage Suspect Monitoring_294536/Manage Suspect Account/A Kualitatif 1_BO Penurunan Nilai/a_Debitur Suspect Cashloan'))

WebUI.click(findTestObject('Object Repository/Manage Suspect Monitoring_294536/Manage Suspect Account/A Kualitatif 1_BO Penurunan Nilai/a_17201501391151'))

WebUI.check(findTestObject('Object Repository/Manage Suspect Monitoring_294536/Manage Suspect Account/A Kualitatif 1_BO Penurunan Nilai/input_Perubahan rating debitur (CRR) menjad_0dd308'))

WebUI.setText(findTestObject('Object Repository/Manage Suspect Monitoring_294536/Manage Suspect Account/A Kualitatif 1_BO Penurunan Nilai/input_Perubahan rating debitur (CRR) menjad_b0e5ae'), 
    'halo')

WebUI.click(findTestObject('Object Repository/Manage Suspect Monitoring_294536/Manage Suspect Account/A Kualitatif 1_BO Penurunan Nilai/button_Next'))

WebUI.navigateToUrl('http://172.18.136.165:1097/c_aag/view_aag')

WebUI.click(findTestObject('Object Repository/Manage Suspect Monitoring_294536/Manage Suspect Account/A Kualitatif 1_BO Penurunan Nilai/button_Next_1'))

WebUI.setText(findTestObject('Object Repository/Manage Suspect Monitoring_294536/Manage Suspect Account/A Kualitatif 1_BO Penurunan Nilai/textarea_asdsaf'), 
    '')

WebUI.setText(findTestObject('Object Repository/Manage Suspect Monitoring_294536/Manage Suspect Account/A Kualitatif 1_BO Penurunan Nilai/textarea_asdsf'), 
    '')

WebUI.setText(findTestObject('Object Repository/Manage Suspect Monitoring_294536/Manage Suspect Account/A Kualitatif 1_BO Penurunan Nilai/textarea_asdsf_1'), 
    '')

WebUI.setText(findTestObject('Object Repository/Manage Suspect Monitoring_294536/Manage Suspect Account/A Kualitatif 1_BO Penurunan Nilai/textarea_asdsf_1_2'), 
    '')

WebUI.setText(findTestObject('Object Repository/Manage Suspect Monitoring_294536/Manage Suspect Account/A Kualitatif 1_BO Penurunan Nilai/textarea_NPW agunan masih mengcover pinjama_6f5880'), 
    '')

WebUI.click(findTestObject('Object Repository/Manage Suspect Monitoring_294536/Manage Suspect Account/A Kualitatif 1_BO Penurunan Nilai/button_Next_1_2'))

// Case Kondisi terisi kurang dari 5

WebUI.setText(findTestObject('Object Repository/Manage Suspect Monitoring_294536/Manage Suspect Account/A Kualitatif 1_BO Penurunan Nilai/textarea_asdsf_1'),
	'Isi 1')

WebUI.setText(findTestObject('Object Repository/Manage Suspect Monitoring_294536/Manage Suspect Account/A Kualitatif 1_BO Penurunan Nilai/textarea_asdsf_1_2'),
	'Isi 2')

WebUI.setText(findTestObject('Object Repository/Manage Suspect Monitoring_294536/Manage Suspect Account/A Kualitatif 1_BO Penurunan Nilai/textarea_NPW agunan masih mengcover pinjama_6f5880'),
	'Isi 3')

WebUI.click(findTestObject('Object Repository/Manage Suspect Monitoring_294536/Manage Suspect Account/A Kualitatif 1_BO Penurunan Nilai/button_Next_1_2'))


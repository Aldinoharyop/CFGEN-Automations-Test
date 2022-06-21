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

WebUI.setText(findTestObject('Object Repository/Manage Suspect Monitoring_294536/Manage Suspect Account/A Kuantitatif/input_Informasi Login_pn'), 
    '294536')

WebUI.setEncryptedText(findTestObject('Object Repository/Manage Suspect Monitoring_294536/Manage Suspect Account/A Kuantitatif/input_Informasi Login_password'), 
    'tzH6RvlfSTg=')

WebUI.setText(findTestObject('Object Repository/Manage Suspect Monitoring_294536/Manage Suspect Account/A Kuantitatif/input_Informasi Login_captcha'), 
    '123')

WebUI.sendKeys(findTestObject('Object Repository/Manage Suspect Monitoring_294536/Manage Suspect Account/A Kuantitatif/input_Informasi Login_captcha'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Manage Suspect Monitoring_294536/Manage Suspect Account/A Kuantitatif/button_Setuju'))

WebUI.click(findTestObject('Object Repository/Manage Suspect Monitoring_294536/Manage Suspect Account/A Kuantitatif/a_Aplikasi Pendukung'))

WebUI.click(findTestObject('Object Repository/Manage Suspect Monitoring_294536/Manage Suspect Account/A Kuantitatif/small_Cash Flow Generator'))

WebUI.click(findTestObject('Object Repository/Manage Suspect Monitoring_294536/Manage Suspect Account/A Kuantitatif/a_Debitur Suspect Cashloan'))

WebUI.click(findTestObject('Object Repository/Manage Suspect Monitoring_294536/Manage Suspect Account/A Kuantitatif/a_17201501391151'))

WebUI.check(findTestObject('Object Repository/Manage Suspect Monitoring_294536/Manage Suspect Account/A Kuantitatif/input_Perubahan rating debitur (CRR) menjad_0dd308'))

WebUI.setText(findTestObject('Object Repository/Manage Suspect Monitoring_294536/Manage Suspect Account/A Kuantitatif/input_Perubahan rating debitur (CRR) menjad_b0e5ae'), 
    'halo')

WebUI.click(findTestObject('Object Repository/Manage Suspect Monitoring_294536/Manage Suspect Account/A Kuantitatif/button_Next'))

WebUI.navigateToUrl('http://172.18.136.165:1097/c_aag/view_aag')

WebUI.click(findTestObject('Object Repository/Manage Suspect Monitoring_294536/Manage Suspect Account/A Kuantitatif/button_Next_1'))

WebUI.setText(findTestObject('Object Repository/Manage Suspect Monitoring_294536/Manage Suspect Account/A Kuantitatif/textarea_asdsaf'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Manage Suspect Monitoring_294536/Manage Suspect Account/A Kuantitatif/textarea_asdsf'), 
    '2')

WebUI.setText(findTestObject('Object Repository/Manage Suspect Monitoring_294536/Manage Suspect Account/A Kuantitatif/textarea_asdsf_1'), 
    '3')

WebUI.setText(findTestObject('Object Repository/Manage Suspect Monitoring_294536/Manage Suspect Account/A Kuantitatif/textarea_asdsf_1_2'), 
    '4')

WebUI.setText(findTestObject('Object Repository/Manage Suspect Monitoring_294536/Manage Suspect Account/A Kuantitatif/textarea_NPW agunan masih mengcover pinjama_6f5880'), 
    '5')

WebUI.click(findTestObject('Object Repository/Manage Suspect Monitoring_294536/Manage Suspect Account/A Kuantitatif/button_Next_1_2'))

WebUI.click(findTestObject('Object Repository/Manage Suspect Monitoring_294536/Manage Suspect Account/A Kuantitatif/button_Next (1)'))

WebUI.navigateToUrl('http://172.18.136.165:1097/c_suspect/view_kontrak#loaded')

WebUI.click(findTestObject('Object Repository/Manage Suspect Monitoring_294536/Manage Suspect Account/A Kuantitatif/span'))

WebUI.setText(findTestObject('Object Repository/Manage Suspect Monitoring_294536/Manage Suspect Account/A Kuantitatif/textarea__alasan'), 
    '123')

WebUI.click(findTestObject('Object Repository/Manage Suspect Monitoring_294536/Manage Suspect Account/A Kuantitatif/input__atasan'))

WebUI.setText(findTestObject('Object Repository/Manage Suspect Monitoring_294536/Manage Suspect Account/A Kuantitatif/input__atasan'), 
    '7494')

WebUI.setText(findTestObject('Object Repository/Manage Suspect Monitoring_294536/Manage Suspect Account/A Kuantitatif/input__pemutus'), 
    '7494')

WebUI.click(findTestObject('Object Repository/Manage Suspect Monitoring_294536/Manage Suspect Account/A Kuantitatif/button_Batal'))

WebUI.click(findTestObject('Object Repository/Manage Suspect Monitoring_294536/Manage Suspect Account/A Kuantitatif/span_1'))

WebUI.click(findTestObject('Object Repository/Manage Suspect Monitoring_294536/Manage Suspect Account/A Kuantitatif/span_1_2'))

WebUI.click(findTestObject('Object Repository/Manage Suspect Monitoring_294536/Manage Suspect Account/A Kuantitatif/span_1_2_3'))

WebUI.click(findTestObject('Object Repository/Manage Suspect Monitoring_294536/Manage Suspect Account/A Kuantitatif/span_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/Manage Suspect Monitoring_294536/Manage Suspect Account/A Kuantitatif/span_1_2_3_4_5'))

WebUI.click(findTestObject('Object Repository/Manage Suspect Monitoring_294536/Manage Suspect Account/A Kuantitatif/span_1_2_3_4_5_6'))

WebUI.click(findTestObject('Object Repository/Manage Suspect Monitoring_294536/Manage Suspect Account/A Kuantitatif/span_1_2_3_4_5_6_7'))

WebUI.click(findTestObject('Object Repository/Manage Suspect Monitoring_294536/Manage Suspect Account/A Kuantitatif/span_1_2_3_4_5_6'))

WebUI.click(findTestObject('Object Repository/Manage Suspect Monitoring_294536/Manage Suspect Account/A Kuantitatif/span_1_2_3_4_5_6_7_8'))

WebUI.click(findTestObject('Object Repository/Manage Suspect Monitoring_294536/Manage Suspect Account/A Kuantitatif/span_1_2_3_4_5_6_7_8_9'))

WebUI.click(findTestObject('Object Repository/Manage Suspect Monitoring_294536/Manage Suspect Account/A Kuantitatif/span_1_2_3_4_5_6_7_8_9_10'))


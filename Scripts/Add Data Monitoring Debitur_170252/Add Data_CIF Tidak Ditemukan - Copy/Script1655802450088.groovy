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


//println(CustomKeywords.'com.katalon.plugin.keyword.connection.ResultSetKeywords.getRowCount'(cif))
//println(CustomKeywords.'com.katalon.plugin.keyword.connection.ResultSetKeywords.getSingleCellValue'(cif, 2, 'CIFNO'))
WebUI.openBrowser('')

WebUI.navigateToUrl('http://172.18.136.165:82/')

WebUI.click(findTestObject('Object Repository/Testing Add Data Monitoring Debitur_170252/Page_BRISIM - BRI Sistem Informasi Manajemen/input_Informasi Login_pn'))

//WebUI.setText(findTestObject('Object Repository/Testing Add Data Monitoring Debitur_170252/Page_BRISIM - BRI Sistem Informasi Manajemen/input_Informasi Login_pn'), 
//    '170252')
WebUI.setText(findTestObject('Object Repository/Testing Add Data Monitoring Debitur_170252/Page_BRISIM - BRI Sistem Informasi Manajemen/input_Informasi Login_pn'), 
    'ATYD813')

pass = WebUI.getAttribute(findTestObject('Object Repository/Testing Add Data Monitoring Debitur_170252/Page_BRISIM - BRI Sistem Informasi Manajemen/input_Informasi Login_pn'), 
    'value')


query = "SELECT CIFNO FROM [RP_INDIVIDUAL].[dbo].[CFGEN_ACCOUNT] WHERE CIFNO = '" + pass + "'"

print(query)

cif = CustomKeywords.'com.katalon.plugin.keyword.connection.DatabaseKeywords.executeQuery'(connection,"SELECT CIFNO FROM [RP_INDIVIDUAL].[dbo].[CFGEN_ACCOUNT] WHERE CIFNO = '" + pass + "'")



println(CustomKeywords.'com.katalon.plugin.keyword.connection.ResultSetKeywords.getSingleCellValue'(cif, 1, 'CIFNO'))
//coba verify data
WebUI.verifyMatch(pass,CustomKeywords.'com.katalon.plugin.keyword.connection.ResultSetKeywords.getSingleCellValue'(cif, 1, 'CIFNO'),true)

WebUI.verifyMatch('Katalon', 'Katalon', false)

println(pass)


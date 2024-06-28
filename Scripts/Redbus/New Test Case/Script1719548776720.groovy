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

WebUI.navigateToUrl('https://www.redbus.in/')

WebUI.takeScreenshotAsCheckpoint('Initial page')

WebUI.setText(findTestObject('Object Repository/Redbus/Page_Bus Ticket Booking Online made Easy, S_c30423/input_concat(India, , s No. 1 Online Bus Ti_2144e2'), 
    'chennai')

WebUI.click(findTestObject('Object Repository/Redbus/Page_Bus Ticket Booking Online made Easy, S_c30423/text_CMBT, Chennai'))

WebUI.setText(findTestObject('Object Repository/Redbus/Page_Bus Ticket Booking Online made Easy, S_c30423/input_Chennai_dest'), 
    'madurai')

WebUI.click(findTestObject('Object Repository/Redbus/Page_Bus Ticket Booking Online made Easy, S_c30423/text_Mattuthavani'))

WebUI.click(findTestObject('Object Repository/Redbus/Page_Bus Ticket Booking Online made Easy, S_c30423/div_Icons_SVG__redone'))

WebUI.click(findTestObject('Object Repository/Redbus/Page_Bus Ticket Booking Online made Easy, S_c30423/div_Icons_SVG__redone'))

WebUI.click(findTestObject('Object Repository/Redbus/Page_Bus Ticket Booking Online made Easy, S_c30423/span_15'))

WebUI.takeScreenshotAsCheckpoint('Data validation')

WebUI.click(findTestObject('Object Repository/Redbus/Page_Bus Ticket Booking Online made Easy, S_c30423/button_SEARCH BUSES'))

WebUI.closeBrowser()


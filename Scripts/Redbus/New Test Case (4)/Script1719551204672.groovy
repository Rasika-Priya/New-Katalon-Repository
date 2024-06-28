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

WebUI.verifyElementText(findTestObject('Object Repository/Redbus/Page_redRail - 3X refund on waitlisted Trai_084b30/div_Step  1Visit redRail and Choose Journey Date'), 
    'Step : 1 Visit redRail and Choose Journey Date')

WebUI.getText(findTestObject('Redbus/Page_redRail - 3X refund on waitlisted Trai_084b30/div_Step  1Visit redRail and Choose Journey Date'))

WebUI.verifyElementText(findTestObject('Object Repository/Redbus/Page_redRail - 3X refund on waitlisted Trai_084b30/div_Step  2Select Class and Look for Availa_9c87c9'), 
    'Step : 2 Select Class and Look for Available Trains')

WebUI.getText(findTestObject('Redbus/Page_redRail - 3X refund on waitlisted Trai_084b30/div_Step  2Select Class and Look for Availa_9c87c9'))

WebUI.verifyElementText(findTestObject('Object Repository/Redbus/Page_redRail - 3X refund on waitlisted Trai_084b30/div_Step  3Add IRCTC User ID and Passenger _462fc3'), 
    'Step : 3 Add IRCTC User ID and Passenger Information')

WebUI.verifyElementText(findTestObject('Object Repository/Redbus/Page_redRail - 3X refund on waitlisted Trai_084b30/div_Step  4Choose a Method for Payment'), 
    'Step : 4 Choose a Method for Payment')

WebUI.getText(findTestObject('Redbus/Page_redRail - 3X refund on waitlisted Trai_084b30/div_Step  4Choose a Method for Payment'))

WebUI.verifyElementText(findTestObject('Object Repository/Redbus/Page_redRail - 3X refund on waitlisted Trai_084b30/div_Step  5Enter IRCTC Password to Confirm Booking'), 
    'Step : 5 Enter IRCTC Password to Confirm Booking')

WebUI.getText(findTestObject('Redbus/Page_redRail - 3X refund on waitlisted Trai_084b30/div_Step  5Enter IRCTC Password to Confirm Booking'))

WebUI.takeScreenshotAsCheckpoint('list')

WebUI.closeBrowser()


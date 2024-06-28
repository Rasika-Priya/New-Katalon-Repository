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

WebUI.click(findTestObject('Object Repository/Redbus/Page_Bus Ticket Booking Online made Easy, S_c30423/div_Account'))

WebUI.click(findTestObject('Object Repository/Redbus/Page_Bus Ticket Booking Online made Easy, S_c30423/div_Help'))

WebUI.switchToWindowTitle('red:Care')

WebUI.click(findTestObject('Object Repository/Redbus/Page_redCare/div_Train Tickets'))

WebUI.click(findTestObject('Object Repository/Redbus/Page_redCare/span_Tatkal FAQs'))

WebUI.click(findTestObject('Object Repository/Redbus/Page_redCare/p_Can I book a train ticket under the Tatka_fa80df'))

WebUI.verifyElementText(findTestObject('Object Repository/Redbus/Page_redCare/span_Yes, you can book Tatkal quota train t_e77db3'), 
    'Yes, you can book Tatkal quota train tickets through redRail. With the convenience of viewing updated trains and their berth availability, it is advisable to complete your online train ticket booking at the earliest through redRail.')

WebUI.getText(findTestObject('Redbus/Page_redCare/span_Yes, you can book Tatkal quota train t_e77db3'))

WebUI.takeScreenshotAsCheckpoint('FAQ')

WebUI.closeBrowser()


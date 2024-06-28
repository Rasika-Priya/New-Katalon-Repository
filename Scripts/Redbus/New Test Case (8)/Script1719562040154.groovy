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

WebUI.click(findTestObject('Object Repository/Redbus/Page_Bus Ticket Booking Online made Easy, S_c30423/a_View All'))

WebUI.switchToWindowTitle('List of RTC Operators in India, Bus Directory, Top Bus Routes - redbus.in')

WebUI.click(findTestObject('Object Repository/Redbus/Page_List of RTC Operators in India, Bus Di_2a7989/a_Home'))

WebUI.click(findTestObject('Object Repository/Redbus/Page_Bus Ticket Booking Online made Easy, S_c30423/a_Book Train Tickets'))

WebUI.click(findTestObject('Object Repository/Redbus/Page_redRail - 3X refund on waitlisted Trai_084b30/div_0 cancellation fee  Instant refund_chec_f55971'))

WebUI.closeBrowser()


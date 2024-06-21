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

WebUI.navigateToUrl('https://jiffyagencyqa.azurewebsites.net/#/Login')

WebUI.setText(findTestObject('Object Repository/login/Page_Login/input_Username_email'), 'Optisol.dwat@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/login/Page_Login/input_Password_password'), 'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/login/Page_Login/button_Sign in'))

WebUI.click(findTestObject('Object Repository/login/Page_Login/span_Password is Invalid'))

WebUI.verifyElementText(findTestObject('Object Repository/login/Page_Login/span_Password is Invalid'), 'Password is Invalid')

WebUI.rightClick(findTestObject('Object Repository/login/Page_Login/span_Password is Invalid'))

WebUI.click(findTestObject('Object Repository/login/Page_Login/div_Username_col-sm-1 col-xs-12'))

WebUI.click(findTestObject('Object Repository/login/Page_Login/button_Sign in'))

WebUI.verifyElementPresent(findTestObject('Object Repository/login/Page_Login/img'), 0)


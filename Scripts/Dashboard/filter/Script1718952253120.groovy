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

WebUI.setText(findTestObject('Object Repository/dashboard/Page_Login/input_Username_email'), 'Zara@yopmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/dashboard/Page_Login/input_Password_password'), 'MHSUC33hkPmEvh0ovFgCGQ==')

WebUI.click(findTestObject('dashboard/Page_Login/button_Sign in'))

WebUI.click(findTestObject('Object Repository/dashboard/Page_Dashboard/button_Filter By'))

WebUI.click(findTestObject('Object Repository/dashboard/Page_Dashboard/a_Employer Onboarding'))

WebUI.verifyElementText(findTestObject('Object Repository/dashboard/Page_Dashboard/button_Employer Onboarding'), 'Employer Onboarding')

WebUI.click(findTestObject('Object Repository/dashboard/Page_Dashboard/i_Sort By_fa fa-caret-down m-l-10'))

WebUI.click(findTestObject('Object Repository/dashboard/Page_Dashboard/a_Participant Onboarding'))

WebUI.verifyElementText(findTestObject('Object Repository/dashboard/Page_Dashboard/button_Participant Onboarding'), 'Participant Onboarding')

WebUI.click(findTestObject('Object Repository/dashboard/Page_Dashboard/button_Participant Onboarding'))

WebUI.click(findTestObject('Object Repository/dashboard/Page_Dashboard/a_Placement'))

WebUI.verifyElementText(findTestObject('Object Repository/dashboard/Page_Dashboard/button_Placement'), 'Placement')

WebUI.click(findTestObject('Object Repository/dashboard/Page_Dashboard/button_Placement'))

WebUI.click(findTestObject('Object Repository/dashboard/Page_Dashboard/a_Post Placement'))

WebUI.verifyElementText(findTestObject('Object Repository/dashboard/Page_Dashboard/button_Post Placement'), 'Post Placement')

WebUI.closeBrowser()


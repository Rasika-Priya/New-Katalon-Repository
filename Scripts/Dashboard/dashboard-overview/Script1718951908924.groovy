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

WebUI.setText(findTestObject('Object Repository/dashboard/Page_Login/input_Password_password1'), 'P@ssword1')

WebUI.click(findTestObject('Object Repository/dashboard/Page_Login/button_Sign in'))

WebUI.click(findTestObject('Object Repository/dashboard/Page_Dashboard/div_Zara Agency'))

WebUI.click(findTestObject('Object Repository/dashboard/Page_Dashboard/div_Zara Agency'))

WebUI.click(findTestObject('Object Repository/dashboard/Page_Dashboard/a_Onboarding'))

WebUI.click(findTestObject('Object Repository/dashboard/Page_Dashboard/a_Onboarding'))

WebUI.click(findTestObject('Object Repository/dashboard/Page_Dashboard/em_Next_fa fa-long-arrow-right'))

WebUI.click(findTestObject('Object Repository/dashboard/Page_Dashboard/em_Next_fa fa-long-arrow-right'))

WebUI.click(findTestObject('Object Repository/dashboard/Page_Dashboard/button_Sort By'))

WebUI.click(findTestObject('Object Repository/dashboard/Page_Dashboard/i_Sort By_fa fa-caret-down m-l-10'))

WebUI.click(findTestObject('Object Repository/dashboard/Page_Dashboard/button_Filter By'))

WebUI.click(findTestObject('Object Repository/dashboard/Page_Dashboard/button_Filter By'))

WebUI.closeBrowser()


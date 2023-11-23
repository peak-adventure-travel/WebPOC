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

WebUI.navigateToUrl('https://test.salesforce.com/')

WebUI.setText(findTestObject('Object Repository/Page_Login  Salesforce/input_Username_username'), 'ruchira.weerakkody@intrepidtravel.com.uat')

WebUI.maximizeWindow()

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login  Salesforce/input_Password_pw'), 'I9Q/GQBZBXWlHZFepYeUng==')

WebUI.click(findTestObject('Object Repository/Page_Login  Salesforce/input_Password_Login'))

WebUI.click(findTestObject('Object Repository/Page_Ruchira Weerakkody  Cases  Salesforce/button_Search'))

WebUI.setText(findTestObject('Object Repository/Page_Ruchira Weerakkody  Cases  Salesforce/input_Search Cases and more_input-122'), 
    'ruchira007@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_ruchira007gmail.com - Search  Salesforce/div_Contacts5 Results1 Result1 Result5 Resu_7ef192'))

WebUI.click(findTestObject('Object Repository/Page_ruchira007gmail.com - Search  Salesforce/a_Ruchira Weerakkody'))

WebUI.click(findTestObject('Object Repository/Page_Ruchira Weerakkody  Contact  Salesforce/span_Wishlist'))

WebUI.closeBrowser()


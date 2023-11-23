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

WebUI.callTestCase(findTestCase('POC/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.deleteAllCookies()

WebUI.click(findTestObject('Page_Small Group Tours  Travel, Big Adventures  Intrepid Travel EN/div_My Wishlist'))

WebUI.click(findTestObject('Page_My wishlist  Intrepid Travel/a_Explore all trips'))

WebUI.waitForElementPresent(findTestObject('Page_Search  Intrepid Travel EN/button_Add to my wishlist'), 0)

WebUI.click(findTestObject('Page_Search  Intrepid Travel EN/button_Add to my wishlist'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_Search  Intrepid Travel EN/button_Not now'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Page_Small Group Tours  Travel, Big Adventures  Intrepid Travel EN/div_My Wishlist'))

WebUI.click(findTestObject('Page_My wishlist  Intrepid Travel/a_Log in'))

WebUI.setText(findTestObject('Page_Login - Intrepid Travel/input_Email_email'), 'ruchira007@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_Login - Intrepid Travel/input_Password_password'), 'I9Q/GQBZBXWlHZFepYeUng==')

WebUI.click(findTestObject('Page_Login - Intrepid Travel/button_Log in to my wishlist'))

WebUI.waitForPageLoad(10)

//WebUI.openBrowser('')
//
//WebUI.navigateToUrl('https://intrepidgroup--uat.sandbox.lightning.force.com/')
//
//WebUI.waitForPageLoad(10)


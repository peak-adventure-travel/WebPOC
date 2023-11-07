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

'Open browser'
WebUI.openBrowser('')

WebUI.deleteAllCookies()

WebUI.delay(5)

WebUI.navigateToUrl('https://uat.www-intrepidtravel-com.intrepidgroup.site/en')

WebUI.authenticate('https://uat.www-intrepidtravel-com.intrepidgroup.site/en', 'intrepid', 'Cbq4JOrG2n2YRrD%Ts4k', 5)

WebUI.waitForElementVisible(findTestObject('Page_Small Group Tours  Travel, Big Adventures  Intrepid Travel EN/input_concat(It, , s time for a new journey)_autocomplete__input'), 
    0)

WebUI.click(findTestObject('Page_Small Group Tours  Travel, Big Adventures  Intrepid Travel EN/span_Search'))

WebUI.waitForElementPresent(findTestObject('Page_Search  Intrepid Travel EN/span_1027 trips found'), 0)

WebUI.click(findTestObject('Page_Search  Intrepid Travel EN/input_Discover your next adventure_autocomplete__input'))

WebUI.setText(findTestObject('Page_Search  Intrepid Travel EN/input_Discover your next adventure_autocomplete__input'), 
    'GMDD')

WebUI.click(findTestObject('Page_Search  Intrepid Travel EN/span_Search'))

WebUI.waitForElementVisible(findTestObject('Page_Search  Intrepid Travel EN/span_1 trip found'), 0)

WebUI.click(findTestObject('Page_Search  Intrepid Travel EN/div_Ultimate Galapagos Central Islands (Grand Daphne)'))

WebUI.waitForElementVisible(findTestObject('Page_Ultimate Galapagos Central Islands (Grand Daphne)  Intrepid Travel EN/Trip Page'), 
    0)

WebUI.delay(10)

WebUI.closeBrowser()


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

WebUI.waitForElementVisible(findTestObject('IntrepidHomePage/AvailSearch'), 0)

WebUI.click(findTestObject('IntrepidHomePage/SearchBox'))

WebUI.clearText(findTestObject('IntrepidHomePage/SearchBox'))

WebUI.setText(findTestObject('IntrepidHomePage/SearchBox'), 'GMDD')

WebUI.click(findTestObject('IntrepidHomePage/button_Search'))

WebUI.waitForElementVisible(findTestObject('Page_Search  Intrepid Travel EN/span_1 trip found'), 0)

WebUI.click(findTestObject('Page_Search  Intrepid Travel EN/div_Ultimate Galapagos Central Islands (Grand Daphne)'))

WebUI.waitForElementVisible(findTestObject('Page_Ultimate Galapagos Central Islands (Grand Daphne)  Intrepid Travel EN/h1_Ultimate Galapagos Central Islands (Grand Daphne)'), 
    0)

WebUI.scrollToElement(findTestObject('Page_Ultimate Galapagos Central Islands (Grand Daphne)  Intrepid Travel EN/TripDetailsandStarRating'), 
    0)

WebUI.click(findTestObject('Page_Ultimate Galapagos Central Islands (Grand Daphne)  Intrepid Travel EN/a_View dates and book'))

WebUI.waitForElementPresent(findTestObject('Page_Ultimate Galapagos Central Islands (Grand Daphne)  Intrepid Travel EN/DandA'), 
    0)

WebUI.click(findTestObject('Page_Ultimate Galapagos Central Islands (Grand Daphne)  Intrepid Travel EN/button_2024'))

WebUI.click(findTestObject('Page_Ultimate Galapagos Central Islands (Grand Daphne)  Intrepid Travel EN/button_Jun'))

WebUI.click(findTestObject('Page_Ultimate Galapagos Central Islands (Grand Daphne)  Intrepid Travel EN/div_Tuesday 4 Tue 4 Jun 2024 Thursday 13       Jun 2024  On sale           Available       USD 7,775 USD 6,244'))

WebUI.scrollToElement(findTestObject('Page_Ultimate Galapagos Central Islands (Grand Daphne)  Intrepid Travel EN/div_Includes      USD 120      in     additional payments'), 
    15)

WebUI.click(findTestObject('Page_Ultimate Galapagos Central Islands (Grand Daphne)  Intrepid Travel EN/a_Continue to booking'))

WebUI.delay(10)


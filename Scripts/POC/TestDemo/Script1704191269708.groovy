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

WebUI.click(findTestObject('Object Repository/Page_Small Group Tours  Travel, Big Adventu_2cd07f/button_Destinations'))

WebUI.click(findTestObject('Object Repository/Page_Small Group Tours  Travel, Big Adventu_2cd07f/button_Asia'))

WebUI.click(findTestObject('Object Repository/Page_Small Group Tours  Travel, Big Adventu_2cd07f/a_Sri Lanka'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Best Sri Lanka Tours  Vacations 202223_5ced44/h1_Sri Lanka Tours  Holidays'), 
    'Sri Lanka Tours & Holidays')

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Best Sri Lanka Tours  Vacations 202223_5ced44/div_Sri Lanka Tours  Holidays_banner__content'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Best Sri Lanka Tours  Vacations 202223_5ced44/img_Ways to travel test route_route__image _60dc72'), 
    0)

WebUI.closeBrowser()


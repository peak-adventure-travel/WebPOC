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

WebUI.click(findTestObject('Object Repository/Page_Small Group Tours  Travel, Big Adventu_2cd07f/h1_Its time for a new journey'))

WebUI.click(findTestObject('Object Repository/Page_Small Group Tours  Travel, Big Adventu_2cd07f/input_concat(It, , s time for a new journey_e04c39'))

WebUI.click(findTestObject('Object Repository/Page_Small Group Tours  Travel, Big Adventu_2cd07f/span_Search'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Search  Intrepid Travel EN/div_Western USA National Parks Loop'), 
    'Western USA National Parks Loop')

WebUI.click(findTestObject('Object Repository/Page_Search  Intrepid Travel EN/div_Western USA National Parks Loop'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Western USA National Parks Loop O  Int_3f072f/h1_Western USA National Parks Loop O'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Western USA National Parks Loop O  Int_3f072f/img_View dates and book_u-cursor--pointer i_e6cbfb'))

WebUI.closeBrowser()


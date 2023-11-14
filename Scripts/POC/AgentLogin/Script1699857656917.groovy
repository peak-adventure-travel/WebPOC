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

WebUI.scrollToElement(findTestObject('IntrepidHomePage/a_Agent login'), 10)

WebUI.click(findTestObject('IntrepidHomePage/a_Agent login'))

WebUI.setText(findTestObject('Intrepid Group Agent Portal/input_Agent_Email_email'), 'ruchira.weerakkody@intrepidtravel.com')

WebUI.setEncryptedText(findTestObject('Intrepid Group Agent Portal/input_Agent_Password_password'), 'tboMEiX3McbIebu5hwc9nQ==')

WebUI.click(findTestObject('Intrepid Group Agent Portal/Agent_button_Log In'))

WebUI.enableSmartWait()


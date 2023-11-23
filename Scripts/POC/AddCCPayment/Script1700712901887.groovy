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

WebUI.setText(findTestObject('Object Repository/Page_Intrepid Travel Booking Engine/input_Cardholder name_transactionFormcardHo_ecd32b'), 
    'Ruchira Weerakkody')

//WebUI.rightClick(findTestObject('Object Repository/Page_Intrepid Travel Booking Engine/div_Pay in full  USD 3,353.00'))
//WebUI.click(findTestObject('Object Repository/Page_Intrepid Travel Booking Engine/fieldset_Payment options   Pay in full  USD_3ddb98'))
//WebUI.verifyElementText(findTestObject('Object Repository/Page_Intrepid Travel Booking Engine/span_3,353.00'), '$3,353.00')
WebUI.click(findTestObject('Object Repository/Page_Intrepid Travel Booking Engine/input_concat(id(, , encryptedCardNumber, , ))_encryptedCardNumber'))

WebUI.setText(findTestObject('Object Repository/Page_Intrepid Travel Booking Engine/input_concat(id(, , encryptedCardNumber, , ))_encryptedCardNumber'), 
    '4111 1111 4555 1142')

WebUI.setText(findTestObject('Object Repository/Page_Intrepid Travel Booking Engine/input_concat(id(, , encryptedExpiryDate, , ))_encryptedExpiryDate'), 
    '03/30')

WebUI.setText(findTestObject('Object Repository/Page_Intrepid Travel Booking Engine/input_concat(id(, , encryptedSecurityCode, , ))_encryptedSecurityCode'), 
    '737')

WebUI.click(findTestObject('Object Repository/Page_Intrepid Travel Booking Engine/div_I have a promo code_checkbox__group'))

WebUI.scrollToElement(findTestObject('Page_Intrepid Travel Booking EnginePaymentPage/div_privacystatement_checkbox__group'), 
    0)

WebUI.click(findTestObject('Page_Intrepid Travel Booking EnginePaymentPage/div_privacystatement_checkbox__group'))

WebUI.click(findTestObject('Page_Intrepid Travel Booking EnginePaymentPage/div_essential trip information_checkbox__group'))

WebUI.scrollToElement(findTestObject('Page_Intrepid Travel Booking EnginePaymentPage/button_Pay Now'), 0)

//WebUI.verifyElementText(findTestObject('Object Repository/Page_Intrepid Travel Booking Engine/span_3,353.00'), '$3,353.00')
//
//WebUI.verifyElementText(findTestObject('Object Repository/Page_Intrepid Travel Booking Engine/span_3,353.00'), '$3,353.00')
WebUI.click(findTestObject('Object Repository/Page_Intrepid Travel Booking Engine/button_Pay Now'))


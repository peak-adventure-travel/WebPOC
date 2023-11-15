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

WebUI.callTestCase(findTestCase('POC/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://uat.www-intrepidtravel-com.intrepidgroup.site/en')

WebUI.waitForElementVisible(findTestObject(null), 0)

WebUI.click(findTestObject('Object Repository/Page_Small Group Tours  Travel, Big Adventu_2cd07f/button_Destinations'))

'Region'
WebUI.click(findTestObject('Object Repository/Page_Small Group Tours  Travel, Big Adventu_2cd07f/button_Asia'))

'Country'
WebUI.click(findTestObject('Object Repository/Page_Small Group Tours  Travel, Big Adventu_2cd07f/a_Sri Lanka'))

'Trip'
WebUI.click(findTestObject('Object Repository/Page_Best Sri Lanka Tours  Vacations 202223_5ced44/span_View trip'))

WebUI.scrollToElement(findTestObject('Page_Cycle Sri Lanka  Intrepid Travel EN/a_View dates and book'), 0)

WebUI.click(findTestObject('Object Repository/Page_Cycle Sri Lanka  Intrepid Travel EN/a_View dates and book'))

WebUI.click(findTestObject('Object Repository/Page_Cycle Sri Lanka  Intrepid Travel EN/button_2024'))

WebUI.click(findTestObject('Object Repository/Page_Cycle Sri Lanka  Intrepid Travel EN/button_Sep'))

WebUI.click(findTestObject('Object Repository/Page_Cycle Sri Lanka  Intrepid Travel EN/div_Friday 4       Oct 2024'))

WebUI.click(findTestObject('Object Repository/Page_Cycle Sri Lanka  Intrepid Travel EN/a_Continue to booking'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Intrepid Travel Booking Engine/select_MrMrsMsMiss'), 'Mr', 
    true)

WebUI.setText(findTestObject('Object Repository/Page_Intrepid Travel Booking Engine/input_First name (as per passport)_bookingF_aca270'), 
    'Ruchira')

WebUI.click(findTestObject('Object Repository/Page_Intrepid Travel Booking Engine/input_First name (as per passport)_bookingF_aca270'))

WebUI.setText(findTestObject('Object Repository/Page_Intrepid Travel Booking Engine/input_Last name (as per passport)_bookingFo_24ba78'), 
    'Weerakkody')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Intrepid Travel Booking Engine/select_123456789101112131415161718192021222_566da4'), 
    '5', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Intrepid Travel Booking Engine/select_January February March April May Jun_0a059c'), 
    '11', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Intrepid Travel Booking Engine/select_202320222021202020192018201720162015_325a87'), 
    '1983', true)

WebUI.setText(findTestObject('Object Repository/Page_Intrepid Travel Booking Engine/input_Email_bookingFormpassengers0emailAddress'), 
    'ruchira007@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Intrepid Travel Booking Engine/input_Contact number_bookingFormpassengers0_52f370'), 
    '+94779132927')

WebUI.setText(findTestObject('Object Repository/Page_Intrepid Travel Booking Engine/input_Address line 1_bookingFormpassengers0_269839'), 
    '21/36 ')

WebUI.setText(findTestObject('Object Repository/Page_Intrepid Travel Booking Engine/input_Address line 2_bookingFormpassengers0_5dce2f'), 
    'Polhengoda Gardens')

WebUI.setText(findTestObject('Object Repository/Page_Intrepid Travel Booking Engine/input_Suburb  Town_bookingFormpassengers0town'), 
    'Colombo 05')

WebUI.setText(findTestObject('Object Repository/Page_Intrepid Travel Booking Engine/input_State  Province_bookingFormpassengers0county'), 
    'Westren')

WebUI.setText(findTestObject('Object Repository/Page_Intrepid Travel Booking Engine/input_Postcode  Zip_bookingFormpassengers0postcode'), 
    '00500')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Intrepid Travel Booking Engine/select_Sri LankaAfghanistanAland IslandsAlb_270f8a'), 
    '', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Intrepid Travel Booking Engine/select_Sri LankaAfghanistanAland IslandsAlb_270f8a'), 
    'LK', true)

WebUI.click(findTestObject('Object Repository/Page_Intrepid Travel Booking Engine/button_Continue'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Intrepid Travel Booking Engine/h4_Would you like your own room'), 
    'Would you like your own room?')

WebUI.click(findTestObject('Object Repository/Page_Intrepid Travel Booking Engine/div_800.00_checkbox__group'))

WebUI.click(findTestObject('Object Repository/Page_Intrepid Travel Booking Engine/h4_Would you like to support the communitie_9ddc31'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Intrepid Travel Booking Engine/h4_Would you like to support the communitie_9ddc31'))

WebUI.click(findTestObject('Object Repository/Page_Intrepid Travel Booking Engine/label_Yes, add                             _0069ff'))

WebUI.click(findTestObject('Object Repository/Page_Intrepid Travel Booking Engine/button_Continue_1'))

WebUI.setText(findTestObject('Object Repository/Page_Intrepid Travel Booking Engine/input_Cardholder name_transactionFormcardHo_ecd32b'), 
    'Ruchira Weerakkody')

WebUI.rightClick(findTestObject('Object Repository/Page_Intrepid Travel Booking Engine/div_Pay in full  USD 3,353.00'))

WebUI.click(findTestObject('Object Repository/Page_Intrepid Travel Booking Engine/fieldset_Payment options   Pay in full  USD_3ddb98'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Intrepid Travel Booking Engine/span_3,353.00'), '$3,353.00')

WebUI.click(findTestObject('Object Repository/Page_Intrepid Travel Booking Engine/input_concat(id(, , encryptedCardNumber, , ))_encryptedCardNumber'))

WebUI.setText(findTestObject('Object Repository/Page_Intrepid Travel Booking Engine/input_concat(id(, , encryptedCardNumber, , ))_encryptedCardNumber'), 
    '4111 1111 4555 1142')

WebUI.setText(findTestObject('Object Repository/Page_Intrepid Travel Booking Engine/input_concat(id(, , encryptedExpiryDate, , ))_encryptedExpiryDate'), 
    '03/30')

WebUI.setText(findTestObject('Object Repository/Page_Intrepid Travel Booking Engine/input_concat(id(, , encryptedSecurityCode, , ))_encryptedSecurityCode'), 
    '737')

WebUI.click(findTestObject('Object Repository/Page_Intrepid Travel Booking Engine/div_I have a promo code_checkbox__group'))

WebUI.click(findTestObject('Object Repository/Page_Intrepid Travel Booking Engine/div_I have a promo code_checkbox__group'))

WebUI.click(findTestObject('Object Repository/Page_Intrepid Travel Booking Engine/div_I have a promo code_checkbox__group'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Intrepid Travel Booking Engine/span_3,353.00'), '$3,353.00')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Intrepid Travel Booking Engine/span_3,353.00'), '$3,353.00')

WebUI.click(findTestObject('Object Repository/Page_Intrepid Travel Booking Engine/button_Pay Now'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Intrepid Travel Booking Engine/h3_Thanks Ruchira,          your booking is_d973c4'), 
    'Thanks Ruchira,\n your booking is confirmed!')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Intrepid Travel Booking Engine/strong_7432621'), '7432621')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Intrepid Travel Booking Engine/span_3,353.00'), '$3,353.00')

WebUI.closeBrowser()


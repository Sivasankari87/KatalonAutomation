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

WebUI.navigateToUrl('https://test.gatsby-driver.com/driver-invite/bb0cd8ac-66c5-4dc7-b232-6acf2e0686fe/operators/4511eceb-02b5-4a76-9792-25befaf50f64')

WebUI.click(findTestObject('Object Repository/Page_Driver Portal - Gatsby/input_First name_givenName'))

WebUI.setText(findTestObject('Object Repository/Page_Driver Portal - Gatsby/input_First name_givenName'), 'siva')

WebUI.setText(findTestObject('Object Repository/Page_Driver Portal - Gatsby/input_Surname_surname'), 'sankari')

WebUI.setText(findTestObject('Object Repository/Page_Driver Portal - Gatsby/input_Email Address_email'), 'sankariselvamuma+sep28dr2@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Driver Portal - Gatsby/input_New Password_newPassword'), 'p4y+y39Ir5Pc2g9xt3QkeQ==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Driver Portal - Gatsby/input_Confirm New Password_reenterPassword'), 
    'p4y+y39Ir5Pc2g9xt3QkeQ==')

WebUI.click(findTestObject('Object Repository/Page_Driver Portal - Gatsby/button_Create'))

WebUI.click(findTestObject('Object Repository/Page_Drivers Portal - Gatsby/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_Drivers Portal - Gatsby/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_Drivers Portal - Gatsby/button_End User Terms'))

WebUI.click(findTestObject('Object Repository/Page_Drivers Portal - Gatsby/button_Accept'))

WebUI.click(findTestObject('Object Repository/Page_Drivers Portal - Gatsby/button_Accept'))

WebUI.click(findTestObject('Object Repository/Page_Drivers Portal - Gatsby/button_Accept'))

WebUI.click(findTestObject('Object Repository/Page_Drivers Portal - Gatsby/button_Take a Selfie'))

WebUI.click(findTestObject('Object Repository/Page_Drivers Portal - Gatsby/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Page_Drivers Portal - Gatsby/button_Take a Selfie'))

WebUI.click(findTestObject('Object Repository/Page_Drivers Portal - Gatsby/button_Take a photo'))

WebUI.click(findTestObject('Object Repository/Page_Drivers Portal - Gatsby/button_Im happy with this'))

WebUI.click(findTestObject('Object Repository/Page_Drivers Portal - Gatsby/button_Take a photo'))

WebUI.click(findTestObject('Object Repository/Page_Drivers Portal - Gatsby/div_Take a photo Cancel'))

WebUI.click(findTestObject('Object Repository/Page_Drivers Portal - Gatsby/button_Take a photo'))

WebUI.click(findTestObject('Object Repository/Page_Drivers Portal - Gatsby/button_Im happy with this'))

WebUI.setText(findTestObject('Object Repository/Page_Drivers Portal - Gatsby/input_Mobile_mat-input-9'), 'w1k2lg')

WebUI.click(findTestObject('Object Repository/Page_Drivers Portal - Gatsby/button_Search'))

WebUI.click(findTestObject('Object Repository/Page_Drivers Portal - Gatsby/div_Select Address'))

WebUI.click(findTestObject('Object Repository/Page_Drivers Portal - Gatsby/span_4 Blackburnes Mews, London, W1K 2LG'))

WebUI.click(findTestObject('Object Repository/Page_Drivers Portal - Gatsby/button_Continue'))

WebUI.setText(findTestObject('Object Repository/Page_Drivers Portal - Gatsby/input_Your details_mat-input-10'), 'asd23sd2323')

WebUI.click(findTestObject('Object Repository/Page_Drivers Portal - Gatsby/input_Your details_mat-input-10'))

WebUI.setText(findTestObject('Object Repository/Page_Drivers Portal - Gatsby/input_Please provide a correct Driver Licen_eecf85'), 
    'sd')

WebUI.click(findTestObject('Object Repository/Page_Drivers Portal - Gatsby/div_Driving License Number'))

WebUI.setText(findTestObject('Object Repository/Page_Drivers Portal - Gatsby/input_Your details_mat-input-10'), 'asd23sd23234fegs332fst232')

WebUI.setText(findTestObject('Object Repository/Page_Drivers Portal - Gatsby/input_Please provide a correct Driver Licen_eecf85'), 
    'sd')

WebUI.click(findTestObject('Object Repository/Page_Drivers Portal - Gatsby/input_Please provide a correct Driver Licen_eecf85'))

WebUI.click(findTestObject('Object Repository/Page_Drivers Portal - Gatsby/input_Your details_mat-input-10'))

WebUI.click(findTestObject('Object Repository/Page_Drivers Portal - Gatsby/div_Your detailsPlease complete your licens_9e12dc'))

WebUI.setText(findTestObject('Object Repository/Page_Drivers Portal - Gatsby/input_Your details_mat-input-10'), '')


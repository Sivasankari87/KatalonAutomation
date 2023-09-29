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

WebUI.navigateToUrl('https://www.tig-test.com/auth/login?return=%2Fauth%2Fhub')

WebUI.setText(findTestObject('Object Repository/Page_Indigo Group Platform/input_Use the form below to log in to your _c66cd7'), 
    'sivasankari.s@optisolbusiness.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Indigo Group Platform/input_Email Address_mat-input-1'), 'sTvX+8wsmBdseydNaJc30A==')

WebUI.click(findTestObject('Object Repository/Page_Indigo Group Platform/button_LOG IN'))

WebUI.click(findTestObject('Object Repository/Page_Indigo Group Platform/mat-icon_expand_more'))

WebUI.setText(findTestObject('Object Repository/Page_Indigo Group Platform/input_test 06831370 212123133_mat-input-2'), 
    'Indigo group')

WebUI.click(findTestObject('Object Repository/Page_Indigo Group Platform/div_Indigo Group'))

WebUI.click(findTestObject('Object Repository/Page_Indigo Group Platform/img_Acl Client Portal_ng-star-inserted'))

WebUI.click(findTestObject('Object Repository/Page_Indigo Group Platform/a_Contractors'))

WebUI.click(findTestObject('Object Repository/Page_Indigo Group Platform/span_add Add'))

WebUI.click(findTestObject('Object Repository/Page_Indigo Group Platform/img'))

WebUI.click(findTestObject('Object Repository/Page_Indigo Group Platform/button_No'))

WebUI.setText(findTestObject('Object Repository/Page_Indigo Group Platform/input_Invite them to Group Platform via ema_0b9ffc'), 
    'Siva test Kat')

WebUI.click(findTestObject('Object Repository/Page_Indigo Group Platform/span_Password_mat-checkbox-inner-container'))

WebUI.click(findTestObject('Object Repository/Page_Indigo Group Platform/span_A K Private Client Limited'))

WebUI.click(findTestObject('Object Repository/Page_Indigo Group Platform/span_Password_mat-checkbox-inner-container'))

WebUI.click(findTestObject('Object Repository/Page_Indigo Group Platform/span_Insurance'))

WebUI.setText(findTestObject('Object Repository/Page_Indigo Group Platform/input_Badge  Process_mat-input-6'), 'sankariselvamuma+kat1cont@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Indigo Group Platform/a_Continue'))

WebUI.click(findTestObject('Object Repository/Page_Indigo Group Platform/span_Invite'))

WebUI.click(findTestObject('Object Repository/Page_Indigo Group Platform/span_Close'))

WebUI.click(findTestObject('Object Repository/Page_Indigo Group Platform/button_Close'))

WebUI.click(findTestObject('Object Repository/Page_Indigo Group Platform/span_Close'))


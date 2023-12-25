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

WebUI.click(findTestObject('Object Repository/Page_Indigo Group Platform/div_Supply Chain Assurance'))

WebUI.click(findTestObject('Object Repository/Page_Indigo Group Platform/a_Contractors'))

WebUI.click(findTestObject('Object Repository/Page_Indigo Group Platform/span_add Subcontractor'))

WebUI.takeAreaScreenshotAsCheckpoint('Checkpoint4', null)

WebUI.click(findTestObject('Object Repository/Page_Indigo Group Platform/div_A Ltd or an LLP company who is'))

WebUI.setText(findTestObject('Object Repository/Page_Indigo Group Platform/input_Check Companies House_mat-input-3'), '54335544')

WebUI.click(findTestObject('Object Repository/Page_Indigo Group Platform/span_Search'))

WebUI.click(findTestObject('Object Repository/Page_Indigo Group Platform/span_Check Companies House'))

WebUI.switchToWindowTitle('Find and update company information - GOV.UK')

WebUI.setText(findTestObject('Object Repository/Page_Find and update company information - GOV.UK/input_Enter company name, number or officer name_q'), 
    'hat')

WebUI.click(findTestObject('Object Repository/Page_Find and update company information - GOV.UK/button_Search'))

WebUI.click(findTestObject('Object Repository/Page_hat - Find and update company informat_286ada/p_03772551 - Incorporated on 18 May 1999'))

WebUI.switchToWindowTitle('Indigo Group Platform')

WebUI.click(findTestObject('Object Repository/Page_Indigo Group Platform/mat-icon_search'))

WebUI.setText(findTestObject('Object Repository/Page_Indigo Group Platform/input_Check Companies House_mat-input-3'), '03772551')

WebUI.click(findTestObject('Object Repository/Page_Indigo Group Platform/span_Search'))

WebUI.click(findTestObject('Object Repository/Page_Indigo Group Platform/a_Continue'))

WebUI.click(findTestObject('Object Repository/Page_Indigo Group Platform/span_Add'))

WebUI.setText(findTestObject('Object Repository/Page_Indigo Group Platform/input_If so, why not invite them to join an_6421ea'), 
    'HAT siva')

WebUI.setText(findTestObject('Object Repository/Page_Indigo Group Platform/input_Telephone number_mat-input-7'), 'sankariselvamuma+katcomp@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Indigo Group Platform/span_Password_mat-checkbox-inner-container'))

WebUI.click(findTestObject('Object Repository/Page_Indigo Group Platform/span_Indigo Group'))

WebUI.click(findTestObject('Object Repository/Page_Indigo Group Platform/span_Password_mat-checkbox-inner-container'))

WebUI.click(findTestObject('Object Repository/Page_Indigo Group Platform/span_The Indigo Website'))

WebUI.click(findTestObject('Object Repository/Page_Indigo Group Platform/span_Invite'))

WebUI.click(findTestObject('Object Repository/Page_Indigo Group Platform/span_OK'))

WebUI.click(findTestObject('Object Repository/Page_Indigo Group Platform/span_Close'))

WebUI.click(findTestObject('Object Repository/Page_Indigo Group Platform/span_Close'))

WebUI.click(findTestObject('Object Repository/Page_Indigo Group Platform/span_Close'))


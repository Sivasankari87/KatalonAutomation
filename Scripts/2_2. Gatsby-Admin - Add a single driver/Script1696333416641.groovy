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

WebUI.navigateToUrl('https://test.gatsby-admin.com/')

WebUI.setText(findTestObject('Object Repository/Page_Admin Portal - Gatsby/input_Email Address_Email Address'), 'sivasankari.s@optisolbusiness.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Admin Portal - Gatsby/input_Forgot your password_Password'), 
    'sTvX+8wsmBdseydNaJc30A==')

WebUI.click(findTestObject('Object Repository/Page_Admin Portal - Gatsby/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Page_Admin Portal - Gatsby/button_Select'))

WebUI.click(findTestObject('Object Repository/Page_Admin Portal - Gatsby/p_Drivers'))

WebUI.click(findTestObject('Object Repository/Page_Admin Portal - Gatsby/button_Select Operator'))

WebUI.click(findTestObject('Object Repository/Page_Admin Portal - Gatsby/button_Andrew1'))

WebUI.click(findTestObject('Object Repository/Page_Admin Portal - Gatsby/div_Add DriversMultipleSingle'))

WebUI.click(findTestObject('Object Repository/Page_Admin Portal - Gatsby/div_Add DriversMultipleSingle'))

WebUI.click(findTestObject('Object Repository/Page_Admin Portal - Gatsby/div_Add DriversMultipleSingle'))

WebUI.click(findTestObject('Object Repository/Page_Admin Portal - Gatsby/div_Add DriversMultipleSingle'))

WebUI.click(findTestObject('Object Repository/Page_Admin Portal - Gatsby/div_Add DriversMultipleSingle'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Admin Portal - Gatsby/div_Add DriversMultipleSingle'))

WebUI.click(findTestObject('Object Repository/Page_Admin Portal - Gatsby/div_Add DriversMultipleSingle'))

WebUI.click(findTestObject('Object Repository/Page_Admin Portal - Gatsby/button_Andrew1_1'))

WebUI.click(findTestObject('Object Repository/Page_Admin Portal - Gatsby/button_Aug 31 operator'))

WebUI.click(findTestObject('Object Repository/Page_Admin Portal - Gatsby/button_Add Drivers'))

WebUI.click(findTestObject('Object Repository/Page_Admin Portal - Gatsby/button_Single'))

WebUI.click(findTestObject('Object Repository/Page_Admin Portal - Gatsby/input_All details are required_mat-input-0'))

WebUI.setText(findTestObject('Object Repository/Page_Admin Portal - Gatsby/input_All details are required_mat-input-0'), 
    'Siva')

WebUI.setText(findTestObject('Object Repository/Page_Admin Portal - Gatsby/input_First name_mat-input-1'), 'Sankari')

WebUI.setText(findTestObject('Object Repository/Page_Admin Portal - Gatsby/input_Last name_mat-input-2'), 'sankariselvamuma+sep28dr2@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Admin Portal - Gatsby/input_Email_mat-input-3'), '445566778900')

WebUI.setText(findTestObject('Object Repository/Page_Admin Portal - Gatsby/input_Mobile_mat-input-17'), 'w1k2lf')

WebUI.click(findTestObject('Object Repository/Page_Admin Portal - Gatsby/button_Search'))

WebUI.click(findTestObject('Object Repository/Page_Admin Portal - Gatsby/span_Search_mat-select-placeholder mat-sele_12f719'))

WebUI.click(findTestObject('Object Repository/Page_Admin Portal - Gatsby/span_Regis Group Plc, 1 Mount Street Mews, _aa5725'))

WebUI.click(findTestObject('Object Repository/Page_Admin Portal - Gatsby/button_Add'))

WebUI.click(findTestObject('Object Repository/Page_Admin Portal - Gatsby/img'))


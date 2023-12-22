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

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_Admin Portal - Gatsby/p_Resolutions'))

WebUI.click(findTestObject('Object Repository/Page_Admin Portal - Gatsby/a_In Progress'))

WebUI.click(findTestObject('Object Repository/Page_Admin Portal - Gatsby/td_29092023 1148'))

WebUI.click(findTestObject('Object Repository/Page_Admin Portal - Gatsby/button_Engagement'))

WebUI.click(findTestObject('Object Repository/Page_Admin Portal - Gatsby/button_Query this answer'))

WebUI.setText(findTestObject('Object Repository/Page_Admin Portal - Gatsby/textarea_Your query_form-control'), 'Test')

WebUI.click(findTestObject('Object Repository/Page_Admin Portal - Gatsby/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Page_Admin Portal - Gatsby/span_Sign Out'))


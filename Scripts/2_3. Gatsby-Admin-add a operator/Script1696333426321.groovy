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

WebUI.click(findTestObject('Page_Admin Portal - Gatsby/a_groupOperators'))

WebUI.click(findTestObject('Object Repository/Page_Admin Portal - Gatsby/img'))

WebUI.setText(findTestObject('Object Repository/Page_Admin Portal - Gatsby/input_All details are required_mat-input-0'), 
    'Siva')

WebUI.setText(findTestObject('Object Repository/Page_Admin Portal - Gatsby/input_First name_mat-input-1'), '342434')

WebUI.click(findTestObject('Page_Admin Portal - Gatsby/div_Licensing Authority Details'))

WebUI.setText(findTestObject('Object Repository/Page_Admin Portal - Gatsby/input_Last name_mat-input-2'), '341324234')

WebUI.setText(findTestObject('Object Repository/Page_Admin Portal - Gatsby/input_Email_mat-input-3'), '32423434')

WebUI.setText(findTestObject('Page_Admin Portal - Gatsby/input_Main number for bookings_mat-input-4'), '')

WebUI.click(findTestObject('Page_Admin Portal - Gatsby/input_Main number for bookings_mat-input-4'))

WebUI.click(findTestObject('Page_Admin Portal - Gatsby/div_Personal details Licensed Operator Name_b3fa72'))

WebUI.setText(findTestObject('Object Repository/Page_Admin Portal - Gatsby/input_Email_mat-input-3'), '445566778900')

WebUI.click(findTestObject('Page_Admin Portal - Gatsby/div_Company Name'))

WebUI.setText(findTestObject('Page_Admin Portal - Gatsby/input_Emergency Contact Number_mat-input-5'), 'Siva')

WebUI.setText(findTestObject('Page_Admin Portal - Gatsby/input_Primary Contact Name_mat-input-12'), 'sankariselvamuma+sep29op1@gmail.com')

WebUI.setText(findTestObject('Page_Admin Portal - Gatsby/input_Primary Contact Email_mat-input-13'), '4455667890')

WebUI.click(findTestObject('Page_Admin Portal - Gatsby/input_Primary Contact Email_mat-input-13'))

WebUI.setText(findTestObject('Page_Admin Portal - Gatsby/input_Primary Contact Email_mat-input-13'), '445566789000')

WebUI.click(findTestObject('Page_Admin Portal - Gatsby/div_Personal details Licensed Operator Name_0fe65d'))

WebUI.setText(findTestObject('Page_Admin Portal - Gatsby/input_County_mat-input-21'), 'w1k2lf')

WebUI.click(findTestObject('Page_Admin Portal - Gatsby/div_Personal details Licensed Operator Name_0fe65d_1'))

WebUI.setText(findTestObject('Page_Admin Portal - Gatsby/input_Data Provider Contact Name_mat-input-25'), '23232332')

WebUI.click(findTestObject('Page_Admin Portal - Gatsby/div_Personal details Licensed Operator Name_0fe65d_1_2'))

WebUI.click(findTestObject('Page_Admin Portal - Gatsby/input_Data Provider Contact Name_mat-input-25'))

WebUI.click(findTestObject('Page_Admin Portal - Gatsby/div_homeHomegavelResolutionsinboxMessagespo_a8968c'))

WebUI.setText(findTestObject('Page_Admin Portal - Gatsby/input_Data Provider Contact Name_mat-input-25'), '445565454')

WebUI.setText(findTestObject('Page_Admin Portal - Gatsby/input_Data Provider Tel Number_mat-input-26'), 'sankariselvamuma+sepdp@gmail.com')

WebUI.click(findTestObject('Page_Admin Portal - Gatsby/button_Choose file'))

WebUI.setText(findTestObject('Page_Admin Portal - Gatsby/input_Secondary Contact Tel Number_mat-input-32'), 'w1k2lf')

WebUI.click(findTestObject('Object Repository/Page_Admin Portal - Gatsby/button_Search'))

WebUI.click(findTestObject('Object Repository/Page_Admin Portal - Gatsby/span_Search_mat-select-placeholder mat-sele_12f719'))

WebUI.click(findTestObject('Page_Admin Portal - Gatsby/span_1 Mount Street Mews, London, W1K 2LF'))

WebUI.setText(findTestObject('Page_Admin Portal - Gatsby/input_Data Provider Email_mat-input-27'), 'w1k2lf')

WebUI.setText(findTestObject('Page_Admin Portal - Gatsby/input_Postcode_mat-input-28'), 'asdfasdf')

WebUI.click(findTestObject('Page_Admin Portal - Gatsby/input_Postcode_mat-input-28'))

WebUI.setText(findTestObject('Page_Admin Portal - Gatsby/input_Address Line 1_mat-input-29'), 'sadfads')

WebUI.setText(findTestObject('Page_Admin Portal - Gatsby/input_Address Line 2_mat-input-30'), 'fadsfa')

WebUI.click(findTestObject('Page_Admin Portal - Gatsby/input_Address Line 2_mat-input-30'))

WebUI.setText(findTestObject('Page_Admin Portal - Gatsby/input_Town_mat-input-31'), 'asdfads')

WebUI.click(findTestObject('Page_Admin Portal - Gatsby/div_Personal details Licensed Operator Name_0fe65d_1_2_3'))

WebUI.click(findTestObject('Page_Admin Portal - Gatsby/div_Data Provider Name'))

WebUI.setText(findTestObject('Page_Admin Portal - Gatsby/input_Postcode_mat-input-22'), 'SDP')

WebUI.setText(findTestObject('Page_Admin Portal - Gatsby/input_Data Provider Name_mat-input-23'), 'asdfasf')

WebUI.click(findTestObject('Page_Admin Portal - Gatsby/input_Data Provider Name_mat-input-23'))

WebUI.setText(findTestObject('Page_Admin Portal - Gatsby/input_Data Provider Company Registration Nu_503c57'), 'asdfsdf')

WebUI.click(findTestObject('Page_Admin Portal - Gatsby/div_Personal details Licensed Operator Name_0fe65d_1_2_3'))

WebUI.setText(findTestObject('Page_Admin Portal - Gatsby/input_Social Media Address_mat-input-11'), 'Test')

WebUI.click(findTestObject('Page_Admin Portal - Gatsby/div_Companies House Number'))

WebUI.setText(findTestObject('Page_Admin Portal - Gatsby/input_Company Name_mat-input-6'), 'asdfsa')

WebUI.click(findTestObject('Page_Admin Portal - Gatsby/input_Company Name_mat-input-6'))

WebUI.setText(findTestObject('Page_Admin Portal - Gatsby/input_Companies House Number_mat-input-7'), 'fasdfas')

WebUI.click(findTestObject('Page_Admin Portal - Gatsby/div_No. of Vehicles Operated'))

WebUI.setText(findTestObject('Page_Admin Portal - Gatsby/input_Trading Name_mat-input-8'), 'dfadsfa')

WebUI.click(findTestObject('Object Repository/Page_Admin Portal - Gatsby/button_Add'))

WebUI.click(findTestObject('Object Repository/Page_Admin Portal - Gatsby/img_1'))

WebUI.click(findTestObject('Object Repository/Page_Admin Portal - Gatsby/span_Sign Out'))


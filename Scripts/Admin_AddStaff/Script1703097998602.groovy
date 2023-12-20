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

WebUI.callTestCase(findTestCase('Login_Admin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://hospitalb.com/hr/employee#step-1')

WebUI.click(findTestObject('Object Repository/Page_Demo Hospital/a_Add Staff'))

WebUI.setText(findTestObject('Object Repository/Page_Demo Hospital/input_full_name'), 'Kat')

WebUI.setText(findTestObject('Object Repository/Page_Demo Hospital/input_user_name'), 'Kat')

WebUI.setText(findTestObject('Object Repository/Page_Demo Hospital/input_father_name'), 'KatF')

WebUI.setText(findTestObject('Object Repository/Page_Demo Hospital/input_mother_name'), 'KatM')

WebUI.click(findTestObject('Object Repository/Page_Demo Hospital/span_Please Select Designation'))

WebUI.setText(findTestObject('Object Repository/Page_Demo Hospital/input_mobile_no'), 'NA')

WebUI.click(findTestObject('Object Repository/Page_Demo Hospital/ul_select2-selection__rendered'))

WebUI.click(findTestObject('Object Repository/Page_Demo Hospital/input_dob'))

WebUI.setText(findTestObject('Object Repository/Page_Demo Hospital/input_dob'), '11/29/1999')

WebUI.click(findTestObject('Object Repository/Page_Demo Hospital/span_Please Select Salary Type'))

WebUI.click(findTestObject('Object Repository/Page_Demo Hospital/span_Select Gender'))

WebUI.setText(findTestObject('Object Repository/Page_Demo Hospital/input_amount'), '10000')

WebUI.click(findTestObject('Object Repository/Page_Demo Hospital/button_Finish'))

WebUI.click(findTestObject('Object Repository/Page_Demo Hospital/button_Next'))

WebUI.setText(findTestObject('Object Repository/Page_Demo Hospital/textarea_present_address'), 'Katadd')

WebUI.setText(findTestObject('Object Repository/Page_Demo Hospital/textarea_permanent_address'), 'KatPAdd')

WebUI.click(findTestObject('Object Repository/Page_Demo Hospital/button_Next'))

WebUI.setText(findTestObject('Object Repository/Page_Demo Hospital/input_email'), 'Kat@kat.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Demo Hospital/input_password'), '31f2kjud0Ne8Pv2p3qXnAg==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Demo Hospital/input_confirm_password'), 'ZnpF11C0Vvcr7AfvYRASnQ==')

WebUI.click(findTestObject('Object Repository/Page_Demo Hospital/button_Finish'))

WebUI.takeScreenshotAsCheckpoint('Added')


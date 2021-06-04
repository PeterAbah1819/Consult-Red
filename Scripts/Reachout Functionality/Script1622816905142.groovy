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

WebUI.navigateToUrl('https://consult.red/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_Consult Red  Making IoT Happen - Embedded Systems  Consultants/a_Allow all cookies'))

WebUI.click(findTestObject('Object Repository/Page_Consult Red  Making IoT Happen - Embedded Systems  Consultants/a_Industries'))

WebUI.click(findTestObject('Object Repository/Page_Industries - Consult Red  Embedded Sys_6a30a0/h3_Media, Technology  Telecommunications'))

WebUI.verifyTextPresent('Media, Technology & Telecommunications', false)

WebUI.click(findTestObject('Object Repository/Page_Media, Technology  Telecommunications _4a50f6/button_work with us'))

WebUI.verifyTextPresent('Industries', false)

WebUI.verifyTextPresent('Our Details', false)

WebUI.verifyTextPresent('Phone', false)

WebUI.verifyTextPresent('Email', false)

WebUI.verifyTextPresent('Offices', false)

WebUI.verifyTextPresent('Send us a message', false)

WebUI.setText(findTestObject('Object Repository/Page_Contact Us - Consult Red  Embedded Sys_b71067/input__input_1'), 'Peter')

WebUI.setText(findTestObject('Object Repository/Page_Contact Us - Consult Red  Embedded Sys_b71067/input__input_2'), 'Abah')

WebUI.setText(findTestObject('Object Repository/Page_Contact Us - Consult Red  Embedded Sys_b71067/input__input_3'), 'peterabah1819@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Contact Us - Consult Red  Embedded Sys_b71067/input_Your Phone Number_input_5'), 
    '08127738594')

WebUI.setText(findTestObject('Object Repository/Page_Contact Us - Consult Red  Embedded Sys_b71067/input_Which one of our services are you int_56f8b4'), 
    'Yes, I am interested in becoming a tester for Consult Red')

WebUI.setText(findTestObject('Object Repository/Page_Contact Us - Consult Red  Embedded Sys_b71067/input__input_4'), 'Hire Me ')

WebUI.setText(findTestObject('Object Repository/Page_Contact Us - Consult Red  Embedded Sys_b71067/textarea__input_6'), 
    'I would love to do what I love doing (Testing) for a team I admire (Consult Red)')

WebUI.click(findTestObject('Object Repository/Page_Contact Us - Consult Red  Embedded Sys_b71067/label_No'))

WebUI.click(findTestObject('Object Repository/Page_Contact Us - Consult Red  Embedded Sys_b71067/input_This field is for validation purposes_6efd53'))

WebUI.verifyTextPresent('There was a problem with your submission. Please review the fields below.', false)

WebUI.click(findTestObject('Object Repository/Page_Consult Red  Making IoT Happen - Embedded Systems  Consultants/img_Skip to content_logo lazyloaded'))

WebUI.click(findTestObject('Object Repository/Page_Consult Red  Making IoT Happen - Embed_98567e/span_Contact Us'))

WebUI.setText(findTestObject('Object Repository/Page_Contact Us - Consult Red  Embedded Sys_b71067/input__input_1'), 'Peter')

WebUI.setText(findTestObject('Object Repository/Page_Contact Us - Consult Red  Embedded Sys_b71067/input__input_2'), 'Abah')

WebUI.setText(findTestObject('Object Repository/Page_Contact Us - Consult Red  Embedded Sys_b71067/input__input_3'), 'peterabah1819@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Contact Us - Consult Red  Embedded Sys_b71067/input_Your Phone Number_input_5'), 
    '08127738594')

WebUI.setText(findTestObject('Object Repository/Page_Contact Us - Consult Red  Embedded Sys_b71067/input_Which one of our services are you int_56f8b4'), 
    'Yes, I am interested in working for Consult Red')

WebUI.setText(findTestObject('Object Repository/Page_Contact Us - Consult Red  Embedded Sys_b71067/input__input_4'), 'QA Tester')

WebUI.setText(findTestObject('Object Repository/Page_Contact Us - Consult Red  Embedded Sys_b71067/textarea__input_6'), 
    'I would love to test more products for Consult Red')

WebUI.click(findTestObject('Object Repository/Page_Contact Us - Consult Red  Embedded Sys_b71067/input_Yes_input_10'))

WebUI.click(findTestObject('Object Repository/Page_Contact Us - Consult Red  Embedded Sys_b71067/label_Please tick the checkbox below'))

WebUI.click(findTestObject('Object Repository/Page_Contact Us - Consult Red  Embedded Sys_b71067/input_This field is for validation purposes_6efd53'))

WebUI.click(findTestObject('Object Repository/Page_Contact Us - Consult Red  Embedded Sys_b71067/h2_There was a problem with your submission_eae921'))

WebUI.closeBrowser()

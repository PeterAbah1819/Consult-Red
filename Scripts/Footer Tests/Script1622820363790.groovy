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

//Open Browser
WebUI.openBrowser('')

//Navigate to Consult Red's url
WebUI.navigateToUrl('https://consult.red/')

//Maximize the url
WebUI.maximizeWindow()

//Click on the cookies prompt to allow
WebUI.click(findTestObject('Object Repository/Page_Consult Red  Making IoT Happen - Embedded Systems  Consultants/a_Allow all cookies'))

//Scroll to Position
WebUI.scrollToPosition(0, 60)

//Click on Homepage at the Footer
WebUI.click(findTestObject('Object Repository/Page_Consult Red  Making IoT Happen - Embed_98567e/a_Homepage'))

//Scroll down 
WebUI.scrollToPosition(0, 60)

//Click on Industries at the Footer
WebUI.click(findTestObject('Object Repository/Page_Consult Red  Making IoT Happen - Embed_98567e/a_Industries'))

//Scroll down
WebUI.scrollToPosition(0, 60)

//Click on Services
WebUI.click(findTestObject('Object Repository/Page_Industries - Consult Red  Embedded Sys_6a30a0/a_Services'))

//Scroll down
WebUI.scrollToPosition(0, 60)

//Click on Insights at the Footer
WebUI.click(findTestObject('Object Repository/Page_Services - Consult Red  Embedded Syste_ce68f1/a_Insights'))

//Scroll down
WebUI.scrollToPosition(0, 60)

//Click on Discover Red at the footer
WebUI.click(findTestObject('Object Repository/Page_Insights - Consult Red  Embedded Syste_2e6805/a_Discover Red'))

//Scroll down
WebUI.scrollToPosition(0, 60)

//Click on Careers at the Footer
WebUI.click(findTestObject('Object Repository/Page_Discover Red - Consult Red  Embedded S_8fe76e/a_Careers'))

//Scroll down
WebUI.scrollToPosition(0, 60)

//Click on Contact Us at the Footer
WebUI.click(findTestObject('Object Repository/Page_Red Embedded Careers - Software Develo_c72d17/a_Contact Us'))

//Scroll down
WebUI.scrollToPosition(0, 60)

//Click Verify Text at footer about how to get in touch to find Consult Red
WebUI.click(findTestObject('Object Repository/Page_Contact Us - Consult Red  Embedded Sys_b71067/p_To get in touch please call one of our of_9a9737'))

//Click Verify Text at footer
WebUI.click(findTestObject('Object Repository/Page_Contact Us - Consult Red  Embedded Sys_b71067/p_e infoconsult.redUK 44 1274 287 700USA 1 _ff41e2'))

//Click Verify Text at footer
WebUI.click(findTestObject('Object Repository/Page_Contact Us - Consult Red  Embedded Sys_b71067/h3_Find Us'))

//Click Verify Text at footer
WebUI.click(findTestObject('Object Repository/Page_Contact Us - Consult Red  Embedded Sys_b71067/div_Consult Red UKThe Wave1 View Croft Road_f5c7e1'))

//Click Verify Text at footer
WebUI.click(findTestObject('Object Repository/Page_Contact Us - Consult Red  Embedded Sys_b71067/img_Consult Red PL_size-medium wp-image-23 _dd5c69'))

//Click Verify Text at footer
WebUI.click(findTestObject('Object Repository/Page_Contact Us - Consult Red  Embedded Sys_b71067/h5_Connected Devices  Systems'))

//Click Verify Text at footer
WebUI.click(findTestObject('Object Repository/Page_Contact Us - Consult Red  Embedded Sys_b71067/p_Red Embedded Consulting Ltd trading as Co_ba3edf'))

//Close Browser
WebUI.closeBrowser()


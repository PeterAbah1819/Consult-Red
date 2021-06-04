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

//Open browser
WebUI.openBrowser('')

//Navigate to Consult Red's URL
WebUI.navigateToUrl('https://consult.red/')

//Maximize the window
WebUI.maximizeWindow()

//Click on Allow Cookies at the Footer
WebUI.click(findTestObject('Object Repository/Page_Consult Red  Making IoT Happen - Embedded Systems  Consultants/a_Allow all cookies'))

//Click on Industries on the Menu Top Bar
WebUI.click(findTestObject('Object Repository/Page_Consult Red  Making IoT Happen - Embed_98567e/a_Industries'))

//Click on Services on the Menu Top Bar
WebUI.click(findTestObject('Object Repository/Page_Industries - Consult Red  Embedded Sys_6a30a0/a_Services'))

//Click on Technology on the Menu Top Bar
WebUI.click(findTestObject('Object Repository/Page_Services - Consult Red  Embedded Syste_ce68f1/a_Technology'))

//Verify that Technology Page Was Opened
WebUI.verifyTextPresent('Technology', false, FailureHandling.CONTINUE_ON_FAILURE)

//Click on Insights on the Menu Top Bar
WebUI.click(findTestObject('Object Repository/Page_Services - Consult Red  Embedded Syste_ce68f1/a_Insights'))

//Click on Discover Red on the Menu Top Bar
WebUI.click(findTestObject('Object Repository/Page_Insights - Consult Red  Embedded Syste_2e6805/a_Discover Red'))

//Click on Careers on the Menu Top Bar
WebUI.click(findTestObject('Object Repository/Page_Discover Red - Consult Red  Embedded S_8fe76e/a_Careers'))

//Setup search parameters on the Careers Page
WebUI.click(findTestObject('Object Repository/Page_Red Embedded Careers - Software Develo_c72d17/svg_Group 23    Search on Consult Red'))

//Click on Contact Us on the Menu Top Bar
WebUI.click(findTestObject('Object Repository/Page_You searched for - Consult Red/span_Contact us'))

//Click on Consult Red Logo on the Menu Top Bar
WebUI.click(findTestObject('Object Repository/Page_Contact Us - Consult Red  Embedded Sys_b71067/img_Skip to content_logo lazyloaded'))

//Click Verify Text on the Home page
WebUI.click(findTestObject('Object Repository/Page_Consult Red  Making IoT Happen - Embed_98567e/h1_Making itIoT happen.       Research  Str_49a63c'))

//Click Verify Text on the Home page
WebUI.click(findTestObject('Object Repository/Page_Consult Red  Making IoT Happen - Embed_98567e/span_Contact Us'))

//Click on Consult Red Logo on the Menu Top Bar
WebUI.click(findTestObject('Object Repository/Page_Contact Us - Consult Red  Embedded Sys_b71067/img_Skip to content_logo lazyloaded'))

//Click Verify Text on the Home page
WebUI.click(findTestObject('Object Repository/Page_Consult Red  Making IoT Happen - Embed_98567e/h2_Featured'))

//Click Read More
WebUI.click(findTestObject('Object Repository/Page_Consult Red  Making IoT Happen - Embed_98567e/div_Read more'))

//Click Read More
WebUI.click(findTestObject('Object Repository/Page_Consult Red  Making IoT Happen - Embed_98567e/span_Read more'))

//Click on Consult Red Logo on the Menu Top Bar
WebUI.click(findTestObject('Object Repository/Page_Consult Red appoints new Chief Commerc_273199/img_Skip to content_logo lazyloaded'))

//Click Verify Text on the Home page
WebUI.click(findTestObject('Object Repository/Page_Consult Red  Making IoT Happen - Embed_98567e/h3_Consult Red pioneers employee-ownership'))

//Click Verify Text on the Home page
WebUI.switchToWindowTitle('Consult Red pioneers employee-ownership (EOT) | Tech R&D')

//Click on Consult Red Logo on the Menu Top Bar
WebUI.click(findTestObject('Object Repository/Page_Consult Red pioneers employee-ownershi_bc0bc6/img_Skip to content_logo lazyloaded'))

//Click Read More
WebUI.click(findTestObject('Object Repository/Page_Consult Red  Making IoT Happen - Embed_98567e/span_Read More (1)'))

//Click Verify Text on the Home page
WebUI.switchToWindowTitle('Consult Red pioneers employee-ownership (EOT) | Tech R&D')

//Click on Consult Red Logo on the Menu Top Bar
WebUI.click(findTestObject('Object Repository/Page_Consult Red pioneers employee-ownershi_bc0bc6/img_Skip to content_logo lazyloaded'))

//Click Verify Text on the Home page
WebUI.click(findTestObject('Object Repository/Page_Consult Red  Making IoT Happen - Embed_98567e/div_Consult Red pioneers employee-ownership_313378'))

//Click Verify Text on the Home page
WebUI.switchToWindowTitle('Consult Red pioneers employee-ownership (EOT) | Tech R&D')

//Click on Consult Red Logo on the Menu Top Bar
WebUI.click(findTestObject('Object Repository/Page_Consult Red pioneers employee-ownershi_bc0bc6/img_Skip to content_logo lazyloaded'))

//Click Verify Text on the Home page
WebUI.click(findTestObject('Object Repository/Page_Consult Red  Making IoT Happen - Embed_98567e/div_Developing worlds first RDK Video Accel_5bdb35'))

//Click Verify Text on the Home page
WebUI.switchToWindowTitle('Accelerating the Accelerator – the first RDK Video Accelerator with an Amlogic SoC - Consult Red')

//Click on Consult Red Logo on the Menu Top Bar
WebUI.click(findTestObject('Object Repository/Page_Accelerating the Accelerator  the firs_5849a8/img_Skip to content_logo lazyloaded'))

//Click Verify Text on the Home page
WebUI.click(findTestObject('Object Repository/Page_Consult Red  Making IoT Happen - Embed_98567e/h3_Developing worlds first RDK Video Accele_73eb6d'))

//Click Verify Text on the Home page
WebUI.switchToWindowTitle('Accelerating the Accelerator – the first RDK Video Accelerator with an Amlogic SoC - Consult Red')

//Click on Consult Red Logo on the Menu Top Bar
WebUI.click(findTestObject('Object Repository/Page_Accelerating the Accelerator  the firs_5849a8/img_Skip to content_logo lazyloaded'))

WebUI.click(findTestObject('Object Repository/Page_Consult Red  Making IoT Happen - Embed_98567e/button_Find out how'))

WebUI.switchToWindowTitle('Accelerating the Accelerator – the first RDK Video Accelerator with an Amlogic SoC - Consult Red')

WebUI.click(findTestObject('Object Repository/Page_Accelerating the Accelerator  the firs_5849a8/img_Skip to content_logo lazyloaded'))

WebUI.click(findTestObject('Object Repository/Page_Consult Red  Making IoT Happen - Embed_98567e/h2_Who we work with'))

WebUI.click(findTestObject('Object Repository/Page_Consult Red  Making IoT Happen - Embed_98567e/h2_Industries'))

WebUI.click(findTestObject('Object Repository/Page_Consult Red  Making IoT Happen - Embed_98567e/h2_Our Services'))

WebUI.click(findTestObject('Object Repository/Page_Consult Red  Making IoT Happen - Embed_98567e/h2_Research  Strategy'))

WebUI.click(findTestObject('Object Repository/Page_Consult Red  Making IoT Happen - Embed_98567e/h2_Why Work with Red'))

WebUI.click(findTestObject('Object Repository/Page_Consult Red  Making IoT Happen - Embed_98567e/h3_Trusted innovation partner'))

WebUI.click(findTestObject('Object Repository/Page_Consult Red  Making IoT Happen - Embed_98567e/h3_End-to-end development'))

WebUI.click(findTestObject('Object Repository/Page_Consult Red  Making IoT Happen - Embed_98567e/h3_Making products SMART'))

WebUI.click(findTestObject('Object Repository/Page_Consult Red  Making IoT Happen - Embed_98567e/button_Talk to an expert'))

WebUI.click(findTestObject('Object Repository/Page_Contact Us - Consult Red  Embedded Sys_b71067/img_Skip to content_logo lazyloaded'))

WebUI.click(findTestObject('Object Repository/Page_Consult Red  Making IoT Happen - Embed_98567e/h2_Careers at Red'))

WebUI.click(findTestObject('Object Repository/Page_Consult Red  Making IoT Happen - Embed_98567e/button_Join us'))

WebUI.click(findTestObject('Object Repository/Page_Red Embedded Careers - Software Develo_c72d17/img_Skip to content_logo lazyloaded'))

WebUI.click(findTestObject('Object Repository/Page_Consult Red  Making IoT Happen - Embed_98567e/h2_Insights'))

WebUI.click(findTestObject('Object Repository/Page_Consult Red  Making IoT Happen - Embed_98567e/h3_Consult Red appoints new Chief Commercia_66c195'))

WebUI.click(findTestObject('Object Repository/Page_Consult Red appoints new Chief Commerc_273199/img_Skip to content_logo lazyloaded'))

WebUI.click(findTestObject('Object Repository/Page_Consult Red  Making IoT Happen - Embed_98567e/h3_Consult Red pioneers employee-ownership_1'))

WebUI.click(findTestObject('Object Repository/Page_Consult Red pioneers employee-ownershi_bc0bc6/img_Skip to content_logo lazyloaded'))

WebUI.click(findTestObject('Object Repository/Page_Consult Red  Making IoT Happen - Embed_98567e/h3_Consult Red becomes a Crown Commercial S_cfb346'))

WebUI.click(findTestObject('Object Repository/Page_Consult Red  Crown Commercial Services_a74b40/img_Skip to content_logo lazyloaded'))

WebUI.closeBrowser()


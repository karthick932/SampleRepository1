/**@generated
 * WARNING � Changes you make to this file may be lost.
 *           File is generated and may be re-generated without warning.
 * @RPT-Core-generated Version 8.6
 */
/******************************************************************
* Licensed Materials - Property of IBM and/or HCL
* Copyright IBM Corporation 2013, 2017. All Rights Reserved.
* Copyright HCL Technologies Ltd. 2017, 2020.  All Rights Reserved.
* 
* U.S. Government Users Restricted Rights - Use, duplication or 
* disclosure restricted by GSA ADP Schedule Contract with IBM Corp.
******************************************************************/
/* TestScript.template - Suitable for collaborative code generation */
package test;

import com.ibm.rational.test.lt.datacorrelation.execution.action.VariableAction;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.DataCorrelationVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.DataVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDCCoreVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDataCorrelationVar;
import com.ibm.rational.test.lt.datacorrelation.execution.proto.ProtoAdapterHandler;
import com.ibm.rational.test.lt.execution.core.impl.LTTestScript;
import com.ibm.rational.test.lt.execution.moeb.action.EndMoebStepBatchAction;
import com.ibm.rational.test.lt.execution.moeb.action.MoebStepBatchAction;
import com.ibm.rational.test.lt.execution.moeb.services.*;
import com.ibm.rational.test.lt.execution.moeb.services.MoebActionFailedEvent;
import com.ibm.rational.test.lt.execution.moeb.services.MoebFatalErrorEvent;
import com.ibm.rational.test.lt.kernel.IDataArea;
import com.ibm.rational.test.lt.kernel.action.IContainer;
import com.ibm.rational.test.lt.kernel.action.impl.KThrow;
import com.ibm.rational.test.lt.kernel.services.*;
import com.ibm.rational.test.lt.kernel.services.RPTEventStructure;

@SuppressWarnings("all")
public class SampleTest1_Test_A1F0E07410D15DB0FC45B43566383761 extends LTTestScript  {

    static ProtoAdapterHandler pa = new ProtoAdapterHandler();
    static {           
        pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.protocol.core.CoreProtoAdapter", "coreAdapter");
pa.addPA("com.ibm.rational.test.lt.execution.moeb.dc.MoebDataAdapter", "com.ibm.rational.test.lt.execution.moeb.action.MoebStepBatchAction");
    }
	
	private DataVar[] vars = new DataVar[1];
	
    
    
	
	public SampleTest1_Test_A1F0E07410D15DB0FC45B43566383761(IContainer container, String invocationId) {
		super(container, "SampleTest1", invocationId, "A1F0E07410D15DB0FC45B43566383761", "/SampleProject1/Tests/SampleTest1.testsuite", "C:/Users/karthick_ba/HCL/devopstest/workspace/SampleTest1/SampleProject1/Tests/SampleTest1.testsuite");
		setArmEnabled(false);
		stopAtYourConvenience=false;
		
	}

    public void execute() {
    	try {
			
	    		if (!isScheduleRun()) setThinkMax(2000);
	
	if (!isScheduleRun() && !isCompoundTestRun()){
this.addEventBehavior(new RPTEventStructure(new RPTFailVPEvent(), new RPTContinueEvent("Content Verification Point failed"), 1, "Content Verification Point failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTConnectEvent(), new RPTContinueEvent("Connection failed"), 1, "Connection failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTAuthenticationEvent(), new RPTContinueEvent("Authentication failed"), 1, "Authentication failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTDataPoolEOFEvent(), new RPTStopUserEvent("End of dataset reached"), 1, "End of dataset reached"));
	this.addEventBehavior(new RPTEventStructure(new RPTTestVerdictFailedEvent(), new RPTContinueEvent("Test verdict was set to fail"), 2, "Test verdict was set to fail"));
	this.addEventBehavior(new RPTEventStructure(new RPTReferenceEvent(), new RPTContinueEvent("Failed to extract reference"), 1, "Failed to extract reference"));
	this.addEventBehavior(new RPTEventStructure(new RPTSubstitutionEvent(), new RPTContinueEvent("Substitution failed"), 1, "Substitution failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTServerTimeoutEvent(), new RPTContinueEvent("Timeout"), 1, "Timeout"));
	this.addEventBehavior(new RPTEventStructure(new RPTDroppedConnectionEvent(), new RPTContinueEvent("Server dropped connection"), 1, "Server dropped connection"));
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeVPFailureEvent(), new RPTContinueEvent("Custom Verification Point failed"), 1, "Custom Verification Point failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeAlertEvent(), new RPTContinueEvent("Custom Code reported an Alert"), 0, "Custom Code reported an Alert"));
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeExceptionEvent(), new RPTStopUserEvent("Custom Code reported an unhandled exception"), 1, "Custom Code reported an unhandled exception"));
	this.addEventBehavior(new RPTEventStructure(new MoebActionFailedEvent(), new RPTContinueEvent("Playback of UI Action failed"), 0, "Playback of UI Action failed"));
	this.addEventBehavior(new RPTEventStructure(new MoebFatalErrorEvent(), new RPTStopUserEvent("Playback of UI step has a fatal error"), 0, "Playback of UI step has a fatal error"));
	}
	
	
	        	this.add(varAction_1(this));
	this.add(applicationContext_1(this));
	this.add(applicationContext_2(this));
	this.add(applicationContext_3(this));
	this.add(applicationContext_4(this));
	this.add(applicationContext_5(this));
	this.add(applicationContext_6(this));
	this.add(applicationContext_7(this));
	this.add(applicationContext_8(this));
	this.add(applicationContext_9(this));
	this.add(applicationContext_10(this));
	this.add(applicationContext_11(this));
	this.add(applicationContext_12(this));
			this.addFinally(new EndMoebStepBatchAction(this));

	    } catch (Throwable e) {
		     log("Test Execution: SampleTest1_Test_A1F0E07410D15DB0FC45B43566383761 ",e);
	    } finally {
	        super.execute();
		}	    
    }
    
	public void preFinish() {
		
		super.preFinish();
	}
	
	public void stop() {
		
		super.stop();
	}	
	
	private VariableAction varAction_1(final IContainer parent) {

	VariableAction vc = new VariableAction(parent, "", "A1F0E07410D15DCEFC45B43566383761");	
			vars[0] = new DataVar("RTW_WebUI_Browser_Selection", "Edge", IDataArea.VIRTUALUSER, "IGNORE", false, false);

		
	vc.add(vars);
	return vc;
	
}
	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_1(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Start jpetstore.aspectran.com",
												  "A1F0E07410E02AC0FC45B43566383761",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"description\":\"Start <b>jpetstore.aspectran.com<\\/b>\",\"to_overriden\":false,\"application_uid\":\"b572127a-b195-4eb5-a73b-cc7b6307e0a2\",\"timeout\":0,\"optionalStep\":false,\"uid\":\"A1F0E07410E02AC0FC45B43566383761\",\"application_package\":\"com.ibm.rational.test.mobile.android.browser\",\"application_name\":\"jpetstore.aspectran.com\",\"application_os\":\"WebUI\",\"isWeb\":false,\"action\":{\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"start\",\"parameters\":[{\"name\":\"activity\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"com.ibm.rational.test.mobile.android.browser.BrowserMainActivity\"},{\"name\":\"rmot_kind_of_launch\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"playback\"},{\"name\":\"starting_url\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"https:\\/\\/jpetstore.aspectran.com\\/\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"1\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceHWActionStep\"}],\"timeout\":10}",
												  "/SampleProject1/Tests/SampleTest1.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_2(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Hyperlink whose Content is Sign In - jpetstore.aspectran.com",
												  "A1F0E07410E533E4FC45B43566383761",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"revealPref\":\"true\",\"description\":\"Click on <b>Hyperlink<\\/b> whose <b>Content<\\/b> is <b>Sign In<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"b572127a-b195-4eb5-a73b-cc7b6307e0a2\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1F0E07410E533E4FC45B43566383761\",\"isWeb\":true,\"action\":{\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"1\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Sign In\"},\"name\":\"content\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:503;left:1279;bottom:559;right:1391\\\", \\\"Geometry\\\": { \\\"height\\\": 56, \\\"width\\\": 112, \\\"x\\\": 1279, \\\"y\\\": 503 }, \\\"Style$array$\\\": \\\"background-color:rgb(248, 249, 250);background-repeat:repeat;color:rgb(0, 0, 0);font-family:\\\\\\\"Open Sans\\\\\\\", system-ui, -apple-system, \\\\\\\"Segoe UI\\\\\\\", Roboto, \\\\\\\"Helvetica Neue\\\\\\\", \\\\\\\"Noto Sans\\\\\\\", \\\\\\\"Liberation Sans\\\\\\\", Arial, sans-serif, \\\\\\\"Apple Color Emoji\\\\\\\", \\\\\\\"Segoe UI Emoji\\\\\\\", \\\\\\\"Segoe UI Symbol\\\\\\\", \\\\\\\"Noto Color Emoji\\\\\\\";font-size:16px;font-style:normal;font-weight:400;line-height:24px;margin-bottom:0px;margin-left:0px;margin-right:8px;margin-top:0px;opacity:1;padding-bottom:6px;padding-left:12px;padding-right:12px;padding-top:6px;text-align:center;text-decoration:none;visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"F8F9FAFF\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 559, \\\"class\\\": \\\"btn btn-outline-light me-2\\\", \\\"color\\\": \\\"000000FF\\\", \\\"content\\\": \\\"Sign In\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"font-family\\\": \\\"\\\\\\\"Open Sans\\\\\\\", system-ui, -apple-system, \\\\\\\"Segoe UI\\\\\\\", Roboto, \\\\\\\"Helvetica Neue\\\\\\\", \\\\\\\"Noto Sans\\\\\\\", \\\\\\\"Liberation Sans\\\\\\\", Arial, sans-serif, \\\\\\\"Apple Color Emoji\\\\\\\", \\\\\\\"Segoe UI Emoji\\\\\\\", \\\\\\\"Segoe UI Symbol\\\\\\\", \\\\\\\"Noto Color Emoji\\\\\\\"\\\", \\\"font-size\\\": 16, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"href\\\": \\\"\\\\\\/account\\\\\\/signonForm\\\", \\\"left\\\": 1279, \\\"line-height\\\": \\\"24\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": 8, \\\"margin-top\\\": 0, \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 6, \\\"padding-left\\\": 12, \\\"padding-right\\\": 12, \\\"padding-top\\\": 6, \\\"proxyClass\\\": \\\"HtmlAProxy\\\", \\\"proxyName\\\": \\\"a\\\", \\\"right\\\": 1391, \\\"tagName\\\": \\\"a\\\", \\\"text-align\\\": \\\"center\\\", \\\"text-decoration\\\": \\\"none\\\", \\\"top\\\": 503, \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"371\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/div[@id='jpetstore-content']\\\\\\/div\\\\\\/div\\\\\\/div[2]\\\\\\/a[2]\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.a\"}}],\"timeout\":10}",
												  "/SampleProject1/Tests/SampleTest1.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_3(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Image button whose Content is Login - jpetstore.aspectran.com",
												  "A1F0E0741113BDE4FC45B43566383761",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1F0E0741113BDE4FC45B43566383761\",\"preferredThinktime\":0,\"thinktime\":3977,\"isWeb\":false,\"description\":\"Think <i>3,977<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"b572127a-b195-4eb5-a73b-cc7b6307e0a2\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Image button<\\/b> whose <b>Content<\\/b> is <b>Login<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"b572127a-b195-4eb5-a73b-cc7b6307e0a2\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1F0E0741113BDE4FC45B43566383761\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Login\"},\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:698;left:894;bottom:754;right:993\\\", \\\"Geometry\\\": { \\\"height\\\": 56, \\\"width\\\": 98, \\\"x\\\": 894, \\\"y\\\": 698 }, \\\"Style$array$\\\": \\\"background-color:rgb(40, 118, 69);background-repeat:repeat;color:rgb(255, 255, 255);font-family:\\\\\\\"Open Sans\\\\\\\", system-ui, -apple-system, \\\\\\\"Segoe UI\\\\\\\", Roboto, \\\\\\\"Helvetica Neue\\\\\\\", \\\\\\\"Noto Sans\\\\\\\", \\\\\\\"Liberation Sans\\\\\\\", Arial, sans-serif, \\\\\\\"Apple Color Emoji\\\\\\\", \\\\\\\"Segoe UI Emoji\\\\\\\", \\\\\\\"Segoe UI Symbol\\\\\\\", \\\\\\\"Noto Color Emoji\\\\\\\";font-size:16px;font-style:normal;font-weight:400;line-height:24px;margin-bottom:0px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:6px;padding-left:12px;padding-right:12px;padding-top:6px;text-align:center;text-decoration:none;visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"287645FF\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 754, \\\"class\\\": \\\"btn btn-success\\\", \\\"color\\\": \\\"FFFFFFFF\\\", \\\"content\\\": \\\"Login\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"font-family\\\": \\\"\\\\\\\"Open Sans\\\\\\\", system-ui, -apple-system, \\\\\\\"Segoe UI\\\\\\\", Roboto, \\\\\\\"Helvetica Neue\\\\\\\", \\\\\\\"Noto Sans\\\\\\\", \\\\\\\"Liberation Sans\\\\\\\", Arial, sans-serif, \\\\\\\"Apple Color Emoji\\\\\\\", \\\\\\\"Segoe UI Emoji\\\\\\\", \\\\\\\"Segoe UI Symbol\\\\\\\", \\\\\\\"Noto Color Emoji\\\\\\\"\\\", \\\"font-size\\\": 16, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"left\\\": 894, \\\"line-height\\\": \\\"24\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 6, \\\"padding-left\\\": 12, \\\"padding-right\\\": 12, \\\"padding-top\\\": 6, \\\"proxyClass\\\": \\\"HtmlSubmitProxy\\\", \\\"proxyName\\\": \\\"button\\\", \\\"right\\\": 993, \\\"tagName\\\": \\\"button\\\", \\\"text-align\\\": \\\"center\\\", \\\"text-decoration\\\": \\\"none\\\", \\\"top\\\": 698, \\\"type\\\": \\\"submit\\\", \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"348\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/div[@id='jpetstore-content']\\\\\\/div[2]\\\\\\/div\\\\\\/div\\\\\\/div\\\\\\/div\\\\\\/form\\\\\\/div[3]\\\\\\/button\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.button\"}}],\"timeout\":10}",
												  "/SampleProject1/Tests/SampleTest1.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_4(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Hyperlink whose Content is Fish located at position 1 - jpetstore.aspectran.com",
												  "A1F0E074116BC8F4FC45B43566383761",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1F0E074116BC8F4FC45B43566383761\",\"preferredThinktime\":0,\"thinktime\":6647,\"isWeb\":false,\"description\":\"Think <i>6,647<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"b572127a-b195-4eb5-a73b-cc7b6307e0a2\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Hyperlink<\\/b> whose <b>Content<\\/b> is <b>Fish<\\/b> located at position 1\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"b572127a-b195-4eb5-a73b-cc7b6307e0a2\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1F0E074116BC8F4FC45B43566383761\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Fish\"},\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:145;left:454;bottom:205;right:523\\\", \\\"Geometry\\\": { \\\"height\\\": 60, \\\"width\\\": 68, \\\"x\\\": 454, \\\"y\\\": 145 }, \\\"Style$array$\\\": \\\"background-color:rgba(0, 0, 0, 0);background-repeat:repeat;color:rgb(255, 255, 255);font-family:\\\\\\\"Open Sans\\\\\\\", system-ui, -apple-system, \\\\\\\"Segoe UI\\\\\\\", Roboto, \\\\\\\"Helvetica Neue\\\\\\\", \\\\\\\"Noto Sans\\\\\\\", \\\\\\\"Liberation Sans\\\\\\\", Arial, sans-serif, \\\\\\\"Apple Color Emoji\\\\\\\", \\\\\\\"Segoe UI Emoji\\\\\\\", \\\\\\\"Segoe UI Symbol\\\\\\\", \\\\\\\"Noto Color Emoji\\\\\\\";font-size:16px;font-style:normal;font-weight:400;line-height:24px;margin-bottom:0px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:8px;padding-left:8px;padding-right:8px;padding-top:8px;text-align:start;text-decoration:none;visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"00000000\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 205, \\\"class\\\": \\\"nav-link px-2 text-white\\\", \\\"color\\\": \\\"FFFFFFFF\\\", \\\"content\\\": \\\"Fish\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"font-family\\\": \\\"\\\\\\\"Open Sans\\\\\\\", system-ui, -apple-system, \\\\\\\"Segoe UI\\\\\\\", Roboto, \\\\\\\"Helvetica Neue\\\\\\\", \\\\\\\"Noto Sans\\\\\\\", \\\\\\\"Liberation Sans\\\\\\\", Arial, sans-serif, \\\\\\\"Apple Color Emoji\\\\\\\", \\\\\\\"Segoe UI Emoji\\\\\\\", \\\\\\\"Segoe UI Symbol\\\\\\\", \\\\\\\"Noto Color Emoji\\\\\\\"\\\", \\\"font-size\\\": 16, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"href\\\": \\\"\\\\\\/categories\\\\\\/FISH\\\", \\\"left\\\": 454, \\\"line-height\\\": \\\"24\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 8, \\\"padding-left\\\": 8, \\\"padding-right\\\": 8, \\\"padding-top\\\": 8, \\\"proxyClass\\\": \\\"HtmlAProxy\\\", \\\"proxyName\\\": \\\"a\\\", \\\"right\\\": 523, \\\"tagName\\\": \\\"a\\\", \\\"text-align\\\": \\\"start\\\", \\\"text-decoration\\\": \\\"none\\\", \\\"top\\\": 145, \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"524\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/div[@id='jpetstore-content']\\\\\\/div\\\\\\/div\\\\\\/div\\\\\\/ul\\\\\\/li\\\\\\/a\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.a\",\"locator\":{\"parameter\":{\"id\":\"9\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TInteger\",\"value\":\"1\"},\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LPosition\"}}}],\"timeout\":10}",
												  "/SampleProject1/Tests/SampleTest1.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_5(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Hyperlink whose Content is FI-SW-01 - jpetstore.aspectran.com",
												  "A1F0E074119C00B4FC45B43566383761",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1F0E074119C00B4FC45B43566383761\",\"preferredThinktime\":0,\"thinktime\":5269,\"isWeb\":false,\"description\":\"Think <i>5,269<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"b572127a-b195-4eb5-a73b-cc7b6307e0a2\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Hyperlink<\\/b> whose <b>Content<\\/b> is <b>FI-SW-01<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"b572127a-b195-4eb5-a73b-cc7b6307e0a2\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1F0E074119C00B4FC45B43566383761\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"FI-SW-01\"},\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:310;left:48;bottom:343;right:145\\\", \\\"Geometry\\\": { \\\"height\\\": 33, \\\"width\\\": 97, \\\"x\\\": 48, \\\"y\\\": 310 }, \\\"Style$array$\\\": \\\"background-color:rgba(0, 0, 0, 0);background-repeat:repeat;color:rgb(22, 106, 148);font-family:\\\\\\\"Open Sans\\\\\\\", system-ui, -apple-system, \\\\\\\"Segoe UI\\\\\\\", Roboto, \\\\\\\"Helvetica Neue\\\\\\\", \\\\\\\"Noto Sans\\\\\\\", \\\\\\\"Liberation Sans\\\\\\\", Arial, sans-serif, \\\\\\\"Apple Color Emoji\\\\\\\", \\\\\\\"Segoe UI Emoji\\\\\\\", \\\\\\\"Segoe UI Symbol\\\\\\\", \\\\\\\"Noto Color Emoji\\\\\\\";font-size:16px;font-style:normal;font-weight:400;line-height:24px;margin-bottom:0px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:0px;padding-left:0px;padding-right:0px;padding-top:0px;text-align:start;text-decoration:none;visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"00000000\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 343, \\\"color\\\": \\\"166A94FF\\\", \\\"content\\\": \\\"FI-SW-01\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"font-family\\\": \\\"\\\\\\\"Open Sans\\\\\\\", system-ui, -apple-system, \\\\\\\"Segoe UI\\\\\\\", Roboto, \\\\\\\"Helvetica Neue\\\\\\\", \\\\\\\"Noto Sans\\\\\\\", \\\\\\\"Liberation Sans\\\\\\\", Arial, sans-serif, \\\\\\\"Apple Color Emoji\\\\\\\", \\\\\\\"Segoe UI Emoji\\\\\\\", \\\\\\\"Segoe UI Symbol\\\\\\\", \\\\\\\"Noto Color Emoji\\\\\\\"\\\", \\\"font-size\\\": 16, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"href\\\": \\\"\\\\\\/products\\\\\\/FI-SW-01\\\", \\\"left\\\": 48, \\\"line-height\\\": \\\"24\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 0, \\\"padding-left\\\": 0, \\\"padding-right\\\": 0, \\\"padding-top\\\": 0, \\\"proxyClass\\\": \\\"HtmlAProxy\\\", \\\"proxyName\\\": \\\"a\\\", \\\"right\\\": 145, \\\"tagName\\\": \\\"a\\\", \\\"text-align\\\": \\\"start\\\", \\\"text-decoration\\\": \\\"none\\\", \\\"top\\\": 310, \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"372\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/div[@id='jpetstore-content']\\\\\\/div[2]\\\\\\/table\\\\\\/tbody\\\\\\/tr\\\\\\/td\\\\\\/a\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.a\"}}],\"timeout\":10}",
												  "/SampleProject1/Tests/SampleTest1.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_6(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Hyperlink whose Url is /cart/addItemToCart?itemId=EST-1 - jpetstore.aspectran.com",
												  "A1F0E07411C3ACF4FC45B43566383761",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1F0E07411C3ACF4FC45B43566383761\",\"preferredThinktime\":0,\"thinktime\":3901,\"isWeb\":false,\"description\":\"Think <i>3,901<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"b572127a-b195-4eb5-a73b-cc7b6307e0a2\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Hyperlink<\\/b> whose <b>Url<\\/b> is <b>\\/cart\\/addItemToCart?itemId=EST-1<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"b572127a-b195-4eb5-a73b-cc7b6307e0a2\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1F0E07411C3ACF4FC45B43566383761\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"href\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"\\/cart\\/addItemToCart?itemId=EST-1\"},\"name\":\"href\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:461;left:1703;bottom:507;right:1840\\\", \\\"Geometry\\\": { \\\"height\\\": 45, \\\"width\\\": 136, \\\"x\\\": 1703, \\\"y\\\": 461 }, \\\"Style$array$\\\": \\\"background-color:rgb(59, 66, 72);background-repeat:repeat;color:rgb(255, 255, 255);font-family:\\\\\\\"Open Sans\\\\\\\", system-ui, -apple-system, \\\\\\\"Segoe UI\\\\\\\", Roboto, \\\\\\\"Helvetica Neue\\\\\\\", \\\\\\\"Noto Sans\\\\\\\", \\\\\\\"Liberation Sans\\\\\\\", Arial, sans-serif, \\\\\\\"Apple Color Emoji\\\\\\\", \\\\\\\"Segoe UI Emoji\\\\\\\", \\\\\\\"Segoe UI Symbol\\\\\\\", \\\\\\\"Noto Color Emoji\\\\\\\";font-size:14px;font-style:normal;font-weight:400;line-height:21px;margin-bottom:0px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:4px;padding-left:8px;padding-right:8px;padding-top:4px;text-align:center;text-decoration:none;visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"3B4248FF\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 507, \\\"class\\\": \\\"btn btn-primary btn-sm\\\", \\\"color\\\": \\\"FFFFFFFF\\\", \\\"content\\\": \\\"Add to Cart\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"font-family\\\": \\\"\\\\\\\"Open Sans\\\\\\\", system-ui, -apple-system, \\\\\\\"Segoe UI\\\\\\\", Roboto, \\\\\\\"Helvetica Neue\\\\\\\", \\\\\\\"Noto Sans\\\\\\\", \\\\\\\"Liberation Sans\\\\\\\", Arial, sans-serif, \\\\\\\"Apple Color Emoji\\\\\\\", \\\\\\\"Segoe UI Emoji\\\\\\\", \\\\\\\"Segoe UI Symbol\\\\\\\", \\\\\\\"Noto Color Emoji\\\\\\\"\\\", \\\"font-size\\\": 14, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"href\\\": \\\"\\\\\\/cart\\\\\\/addItemToCart?itemId=EST-1\\\", \\\"left\\\": 1703, \\\"line-height\\\": \\\"21\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 4, \\\"padding-left\\\": 8, \\\"padding-right\\\": 8, \\\"padding-top\\\": 4, \\\"proxyClass\\\": \\\"HtmlAProxy\\\", \\\"proxyName\\\": \\\"a\\\", \\\"right\\\": 1840, \\\"tagName\\\": \\\"a\\\", \\\"text-align\\\": \\\"center\\\", \\\"text-decoration\\\": \\\"none\\\", \\\"top\\\": 461, \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"386\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/div[@id='jpetstore-content']\\\\\\/div[2]\\\\\\/table\\\\\\/tbody\\\\\\/tr\\\\\\/td[5]\\\\\\/a\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.a\"}}],\"timeout\":10}",
												  "/SampleProject1/Tests/SampleTest1.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_7(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Enter value '3' in Input field whose Label is false - jpetstore.aspectran.com",
												  "A1F0E07411EA95E4FC45B43566383761",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1F0E07411EA95E4FC45B43566383761\",\"preferredThinktime\":0,\"thinktime\":6559,\"isWeb\":false,\"description\":\"Think <i>6,559<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"b572127a-b195-4eb5-a73b-cc7b6307e0a2\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Enter value '<b>3<\\/b>' in <b>Input field<\\/b> whose <b>Label<\\/b> is <b>false<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"b572127a-b195-4eb5-a73b-cc7b6307e0a2\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1F0E07411EA95E4FC45B43566383761\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"oninput\",\"parameters\":[{\"name\":\"newtext\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"3\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"label\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"false\"},\"name\":\"label\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:413;left:839;bottom:458;right:1133\\\", \\\"Geometry\\\": { \\\"height\\\": 45, \\\"width\\\": 293, \\\"x\\\": 839, \\\"y\\\": 413 }, \\\"Style$array$\\\": \\\"background-color:rgb(255, 255, 255);background-repeat:repeat;color:rgb(0, 0, 0);font-family:\\\\\\\"Open Sans\\\\\\\", system-ui, -apple-system, \\\\\\\"Segoe UI\\\\\\\", Roboto, \\\\\\\"Helvetica Neue\\\\\\\", \\\\\\\"Noto Sans\\\\\\\", \\\\\\\"Liberation Sans\\\\\\\", Arial, sans-serif, \\\\\\\"Apple Color Emoji\\\\\\\", \\\\\\\"Segoe UI Emoji\\\\\\\", \\\\\\\"Segoe UI Symbol\\\\\\\", \\\\\\\"Noto Color Emoji\\\\\\\";font-size:16px;font-style:normal;font-weight:400;line-height:24px;margin-bottom:0px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:1px;padding-left:2px;padding-right:2px;padding-top:1px;text-align:start;text-decoration:none;visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"FFFFFFFF\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 458, \\\"color\\\": \\\"000000FF\\\", \\\"content\\\": \\\"\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"font-family\\\": \\\"\\\\\\\"Open Sans\\\\\\\", system-ui, -apple-system, \\\\\\\"Segoe UI\\\\\\\", Roboto, \\\\\\\"Helvetica Neue\\\\\\\", \\\\\\\"Noto Sans\\\\\\\", \\\\\\\"Liberation Sans\\\\\\\", Arial, sans-serif, \\\\\\\"Apple Color Emoji\\\\\\\", \\\\\\\"Segoe UI Emoji\\\\\\\", \\\\\\\"Segoe UI Symbol\\\\\\\", \\\\\\\"Noto Color Emoji\\\\\\\"\\\", \\\"font-size\\\": 16, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"label\\\": \\\"false\\\", \\\"left\\\": 839, \\\"line-height\\\": \\\"24\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"maxlength\\\": \\\"3\\\", \\\"name\\\": \\\"EST-1\\\", \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 1, \\\"padding-left\\\": 2, \\\"padding-right\\\": 2, \\\"padding-top\\\": 1, \\\"proxyClass\\\": \\\"HtmlInput5Proxy\\\", \\\"proxyName\\\": \\\"inputtextfield\\\", \\\"right\\\": 1133, \\\"size\\\": \\\"3\\\", \\\"tagName\\\": \\\"input\\\", \\\"text-align\\\": \\\"start\\\", \\\"text-decoration\\\": \\\"none\\\", \\\"top\\\": 413, \\\"type\\\": \\\"number\\\", \\\"value\\\": \\\"1\\\", \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"454\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/div[@id='jpetstore-content']\\\\\\/div[2]\\\\\\/form\\\\\\/table\\\\\\/tbody\\\\\\/tr\\\\\\/td[5]\\\\\\/input\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.inputtextfield\"}}],\"timeout\":10}",
												  "/SampleProject1/Tests/SampleTest1.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_8(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Image button whose Content is Update Cart - jpetstore.aspectran.com",
												  "A1F0E074121F6184FC45B43566383761",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1F0E074121F6184FC45B43566383761\",\"preferredThinktime\":0,\"thinktime\":740,\"isWeb\":false,\"description\":\"Think <i>740<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"b572127a-b195-4eb5-a73b-cc7b6307e0a2\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Image button<\\/b> whose <b>Content<\\/b> is <b>Update Cart<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"b572127a-b195-4eb5-a73b-cc7b6307e0a2\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1F0E074121F6184FC45B43566383761\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Update Cart\"},\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:486;left:839;bottom:531;right:983\\\", \\\"Geometry\\\": { \\\"height\\\": 45, \\\"width\\\": 144, \\\"x\\\": 839, \\\"y\\\": 486 }, \\\"Style$array$\\\": \\\"background-color:rgb(61, 68, 74);background-repeat:repeat;color:rgb(255, 255, 255);font-family:\\\\\\\"Open Sans\\\\\\\", system-ui, -apple-system, \\\\\\\"Segoe UI\\\\\\\", Roboto, \\\\\\\"Helvetica Neue\\\\\\\", \\\\\\\"Noto Sans\\\\\\\", \\\\\\\"Liberation Sans\\\\\\\", Arial, sans-serif, \\\\\\\"Apple Color Emoji\\\\\\\", \\\\\\\"Segoe UI Emoji\\\\\\\", \\\\\\\"Segoe UI Symbol\\\\\\\", \\\\\\\"Noto Color Emoji\\\\\\\";font-size:14px;font-style:normal;font-weight:400;line-height:21px;margin-bottom:0px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:4px;padding-left:8px;padding-right:8px;padding-top:4px;text-align:center;text-decoration:none;visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"3D444AFF\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 531, \\\"class\\\": \\\"btn btn-primary btn-sm\\\", \\\"color\\\": \\\"FFFFFFFF\\\", \\\"content\\\": \\\"Update Cart\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"font-family\\\": \\\"\\\\\\\"Open Sans\\\\\\\", system-ui, -apple-system, \\\\\\\"Segoe UI\\\\\\\", Roboto, \\\\\\\"Helvetica Neue\\\\\\\", \\\\\\\"Noto Sans\\\\\\\", \\\\\\\"Liberation Sans\\\\\\\", Arial, sans-serif, \\\\\\\"Apple Color Emoji\\\\\\\", \\\\\\\"Segoe UI Emoji\\\\\\\", \\\\\\\"Segoe UI Symbol\\\\\\\", \\\\\\\"Noto Color Emoji\\\\\\\"\\\", \\\"font-size\\\": 14, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"left\\\": 839, \\\"line-height\\\": \\\"21\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 4, \\\"padding-left\\\": 8, \\\"padding-right\\\": 8, \\\"padding-top\\\": 4, \\\"proxyClass\\\": \\\"HtmlSubmitProxy\\\", \\\"proxyName\\\": \\\"button\\\", \\\"right\\\": 983, \\\"tagName\\\": \\\"button\\\", \\\"text-align\\\": \\\"center\\\", \\\"text-decoration\\\": \\\"none\\\", \\\"top\\\": 486, \\\"type\\\": \\\"submit\\\", \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"639\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/div[@id='jpetstore-content']\\\\\\/div[2]\\\\\\/form\\\\\\/table\\\\\\/tfoot\\\\\\/tr\\\\\\/td[2]\\\\\\/button\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.button\"}}],\"timeout\":10}",
												  "/SampleProject1/Tests/SampleTest1.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_9(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Hyperlink whose Content is Proceed to Checkout - jpetstore.aspectran.com",
												  "A1F0E0741249F3F4FC45B43566383761",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1F0E0741249F3F4FC45B43566383761\",\"preferredThinktime\":0,\"thinktime\":486,\"isWeb\":false,\"description\":\"Think <i>486<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"b572127a-b195-4eb5-a73b-cc7b6307e0a2\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Hyperlink<\\/b> whose <b>Content<\\/b> is <b>Proceed to Checkout<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"b572127a-b195-4eb5-a73b-cc7b6307e0a2\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1F0E0741249F3F4FC45B43566383761\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Proceed to Checkout\"},\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:568;left:808;bottom:624;right:1079\\\", \\\"Geometry\\\": { \\\"height\\\": 56, \\\"width\\\": 270, \\\"x\\\": 808, \\\"y\\\": 568 }, \\\"Style$array$\\\": \\\"background-color:rgb(41, 120, 70);background-repeat:repeat;color:rgb(255, 255, 255);font-family:\\\\\\\"Open Sans\\\\\\\", system-ui, -apple-system, \\\\\\\"Segoe UI\\\\\\\", Roboto, \\\\\\\"Helvetica Neue\\\\\\\", \\\\\\\"Noto Sans\\\\\\\", \\\\\\\"Liberation Sans\\\\\\\", Arial, sans-serif, \\\\\\\"Apple Color Emoji\\\\\\\", \\\\\\\"Segoe UI Emoji\\\\\\\", \\\\\\\"Segoe UI Symbol\\\\\\\", \\\\\\\"Noto Color Emoji\\\\\\\";font-size:16px;font-style:normal;font-weight:400;line-height:24px;margin-bottom:0px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:6px;padding-left:12px;padding-right:12px;padding-top:6px;text-align:center;text-decoration:none;visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"297846FF\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 624, \\\"class\\\": \\\"btn btn-success\\\", \\\"color\\\": \\\"FFFFFFFF\\\", \\\"content\\\": \\\"Proceed to Checkout\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"font-family\\\": \\\"\\\\\\\"Open Sans\\\\\\\", system-ui, -apple-system, \\\\\\\"Segoe UI\\\\\\\", Roboto, \\\\\\\"Helvetica Neue\\\\\\\", \\\\\\\"Noto Sans\\\\\\\", \\\\\\\"Liberation Sans\\\\\\\", Arial, sans-serif, \\\\\\\"Apple Color Emoji\\\\\\\", \\\\\\\"Segoe UI Emoji\\\\\\\", \\\\\\\"Segoe UI Symbol\\\\\\\", \\\\\\\"Noto Color Emoji\\\\\\\"\\\", \\\"font-size\\\": 16, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"href\\\": \\\"\\\\\\/order\\\\\\/newOrderForm\\\", \\\"left\\\": 808, \\\"line-height\\\": \\\"24\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 6, \\\"padding-left\\\": 12, \\\"padding-right\\\": 12, \\\"padding-top\\\": 6, \\\"proxyClass\\\": \\\"HtmlAProxy\\\", \\\"proxyName\\\": \\\"a\\\", \\\"right\\\": 1079, \\\"tagName\\\": \\\"a\\\", \\\"text-align\\\": \\\"center\\\", \\\"text-decoration\\\": \\\"none\\\", \\\"top\\\": 568, \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"1003\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/div[@id='jpetstore-content']\\\\\\/div[2]\\\\\\/div[2]\\\\\\/a\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.a\"}}],\"timeout\":10}",
												  "/SampleProject1/Tests/SampleTest1.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_10(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Image button whose Content is Continue - jpetstore.aspectran.com",
												  "A1F0E07412768234FC45B43566383761",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1F0E07412768234FC45B43566383761\",\"preferredThinktime\":0,\"thinktime\":5567,\"isWeb\":false,\"description\":\"Think <i>5,567<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"b572127a-b195-4eb5-a73b-cc7b6307e0a2\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Image button<\\/b> whose <b>Content<\\/b> is <b>Continue<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"b572127a-b195-4eb5-a73b-cc7b6307e0a2\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1F0E07412768234FC45B43566383761\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Continue\"},\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:298;left:814;bottom:354;right:954\\\", \\\"Geometry\\\": { \\\"height\\\": 56, \\\"width\\\": 139, \\\"x\\\": 814, \\\"y\\\": 298 }, \\\"Style$array$\\\": \\\"background-color:rgb(41, 121, 71);background-repeat:repeat;color:rgb(255, 255, 255);font-family:\\\\\\\"Open Sans\\\\\\\", system-ui, -apple-system, \\\\\\\"Segoe UI\\\\\\\", Roboto, \\\\\\\"Helvetica Neue\\\\\\\", \\\\\\\"Noto Sans\\\\\\\", \\\\\\\"Liberation Sans\\\\\\\", Arial, sans-serif, \\\\\\\"Apple Color Emoji\\\\\\\", \\\\\\\"Segoe UI Emoji\\\\\\\", \\\\\\\"Segoe UI Symbol\\\\\\\", \\\\\\\"Noto Color Emoji\\\\\\\";font-size:16px;font-style:normal;font-weight:400;line-height:24px;margin-bottom:0px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:6px;padding-left:12px;padding-right:12px;padding-top:6px;text-align:center;text-decoration:none;visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"297947FF\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 354, \\\"class\\\": \\\"btn btn-success\\\", \\\"color\\\": \\\"FFFFFFFF\\\", \\\"content\\\": \\\"Continue\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"font-family\\\": \\\"\\\\\\\"Open Sans\\\\\\\", system-ui, -apple-system, \\\\\\\"Segoe UI\\\\\\\", Roboto, \\\\\\\"Helvetica Neue\\\\\\\", \\\\\\\"Noto Sans\\\\\\\", \\\\\\\"Liberation Sans\\\\\\\", Arial, sans-serif, \\\\\\\"Apple Color Emoji\\\\\\\", \\\\\\\"Segoe UI Emoji\\\\\\\", \\\\\\\"Segoe UI Symbol\\\\\\\", \\\\\\\"Noto Color Emoji\\\\\\\"\\\", \\\"font-size\\\": 16, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"left\\\": 814, \\\"line-height\\\": \\\"24\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 6, \\\"padding-left\\\": 12, \\\"padding-right\\\": 12, \\\"padding-top\\\": 6, \\\"proxyClass\\\": \\\"HtmlSubmitProxy\\\", \\\"proxyName\\\": \\\"button\\\", \\\"right\\\": 954, \\\"tagName\\\": \\\"button\\\", \\\"text-align\\\": \\\"center\\\", \\\"text-decoration\\\": \\\"none\\\", \\\"top\\\": 298, \\\"type\\\": \\\"submit\\\", \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"543\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/div[@id='jpetstore-content']\\\\\\/div[2]\\\\\\/div\\\\\\/div\\\\\\/form\\\\\\/div\\\\\\/button\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.button\"}}],\"timeout\":10}",
												  "/SampleProject1/Tests/SampleTest1.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_11(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Image button whose Content is Confirm - jpetstore.aspectran.com",
												  "A1F0E07412A33784FC45B43566383761",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1F0E07412A33784FC45B43566383761\",\"preferredThinktime\":0,\"thinktime\":5017,\"isWeb\":false,\"description\":\"Think <i>5,017<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"b572127a-b195-4eb5-a73b-cc7b6307e0a2\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Image button<\\/b> whose <b>Content<\\/b> is <b>Confirm<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"b572127a-b195-4eb5-a73b-cc7b6307e0a2\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1F0E07412A33784FC45B43566383761\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Confirm\"},\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:555;left:831;bottom:611;right:959\\\", \\\"Geometry\\\": { \\\"height\\\": 56, \\\"width\\\": 128, \\\"x\\\": 831, \\\"y\\\": 555 }, \\\"Style$array$\\\": \\\"background-color:rgb(41, 121, 71);background-repeat:repeat;color:rgb(255, 255, 255);font-family:\\\\\\\"Open Sans\\\\\\\", system-ui, -apple-system, \\\\\\\"Segoe UI\\\\\\\", Roboto, \\\\\\\"Helvetica Neue\\\\\\\", \\\\\\\"Noto Sans\\\\\\\", \\\\\\\"Liberation Sans\\\\\\\", Arial, sans-serif, \\\\\\\"Apple Color Emoji\\\\\\\", \\\\\\\"Segoe UI Emoji\\\\\\\", \\\\\\\"Segoe UI Symbol\\\\\\\", \\\\\\\"Noto Color Emoji\\\\\\\";font-size:16px;font-style:normal;font-weight:400;line-height:24px;margin-bottom:0px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:6px;padding-left:12px;padding-right:12px;padding-top:6px;text-align:center;text-decoration:none;visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"297947FF\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 611, \\\"class\\\": \\\"btn btn-success\\\", \\\"color\\\": \\\"FFFFFFFF\\\", \\\"content\\\": \\\"Confirm\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"font-family\\\": \\\"\\\\\\\"Open Sans\\\\\\\", system-ui, -apple-system, \\\\\\\"Segoe UI\\\\\\\", Roboto, \\\\\\\"Helvetica Neue\\\\\\\", \\\\\\\"Noto Sans\\\\\\\", \\\\\\\"Liberation Sans\\\\\\\", Arial, sans-serif, \\\\\\\"Apple Color Emoji\\\\\\\", \\\\\\\"Segoe UI Emoji\\\\\\\", \\\\\\\"Segoe UI Symbol\\\\\\\", \\\\\\\"Noto Color Emoji\\\\\\\"\\\", \\\"font-size\\\": 16, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"left\\\": 831, \\\"line-height\\\": \\\"24\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 6, \\\"padding-left\\\": 12, \\\"padding-right\\\": 12, \\\"padding-top\\\": 6, \\\"proxyClass\\\": \\\"HtmlSubmitProxy\\\", \\\"proxyName\\\": \\\"button\\\", \\\"right\\\": 959, \\\"tagName\\\": \\\"button\\\", \\\"text-align\\\": \\\"center\\\", \\\"text-decoration\\\": \\\"none\\\", \\\"top\\\": 555, \\\"type\\\": \\\"submit\\\", \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"546\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/div[@id='jpetstore-content']\\\\\\/div[2]\\\\\\/div\\\\\\/div\\\\\\/form\\\\\\/div\\\\\\/button\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.button\"}}],\"timeout\":10}",
												  "/SampleProject1/Tests/SampleTest1.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_12(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Close application window - jpetstore.aspectran.com",
												  "A1F0E07412C601C0FC45B43566383761",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"revealPref\":\"true\",\"description\":\"<b>Close<\\/b> application window\",\"to_overriden\":false,\"application_uid\":\"b572127a-b195-4eb5-a73b-cc7b6307e0a2\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1F0E07412C601C0FC45B43566383761\",\"isWeb\":true,\"action\":{\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"close\",\"parameters\":[]},\"sync_policy\":\"DEFAULT\",\"id\":\"1\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceHWActionStep\"}],\"timeout\":10}",
												  "/SampleProject1/Tests/SampleTest1.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

}

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
public class SampleTestScript1_Test_A1F0E0856452B720FC45B43566383761 extends LTTestScript  {

    static ProtoAdapterHandler pa = new ProtoAdapterHandler();
    static {           
        pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.protocol.core.CoreProtoAdapter", "coreAdapter");
pa.addPA("com.ibm.rational.test.lt.execution.moeb.dc.MoebDataAdapter", "com.ibm.rational.test.lt.execution.moeb.action.MoebStepBatchAction");
    }
	
	private DataVar[] vars = new DataVar[1];
	
    
    
	
	public SampleTestScript1_Test_A1F0E0856452B720FC45B43566383761(IContainer container, String invocationId) {
		super(container, "SampleTestScript1", invocationId, "A1F0E0856452B720FC45B43566383761", "/SampleTestProject/Tests/SampleTestScript1.testsuite", "C:/Users/karthick_ba/HCL/devopstest/workspace/SampleTest1/SampleTestProject/Tests/SampleTestScript1.testsuite");
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
			this.addFinally(new EndMoebStepBatchAction(this));

	    } catch (Throwable e) {
		     log("Test Execution: SampleTestScript1_Test_A1F0E0856452B720FC45B43566383761 ",e);
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

	VariableAction vc = new VariableAction(parent, "", "A1F0E0856453536CFC45B43566383761");	
			vars[0] = new DataVar("RTW_WebUI_Browser_Selection", "Edge", IDataArea.VIRTUALUSER, "IGNORE", false, false);

		
	vc.add(vars);
	return vc;
	
}
	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_1(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Start jpetstore.aspectran.com",
												  "A1F0E085646E5570FC45B43566383761",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"description\":\"Start <b>jpetstore.aspectran.com<\\/b>\",\"to_overriden\":false,\"application_uid\":\"b572127a-b195-4eb5-a73b-cc7b6307e0a2\",\"timeout\":0,\"optionalStep\":false,\"uid\":\"A1F0E085646E5570FC45B43566383761\",\"application_package\":\"com.ibm.rational.test.mobile.android.browser\",\"application_name\":\"jpetstore.aspectran.com\",\"application_os\":\"WebUI\",\"isWeb\":false,\"action\":{\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"start\",\"parameters\":[{\"name\":\"activity\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"com.ibm.rational.test.mobile.android.browser.BrowserMainActivity\"},{\"name\":\"rmot_kind_of_launch\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"playback\"},{\"name\":\"starting_url\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"https:\\/\\/jpetstore.aspectran.com\\/\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"1\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceHWActionStep\"}],\"timeout\":10}",
												  "/SampleTestProject/Tests/SampleTestScript1.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_2(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Hyperlink whose Content is Sign In - jpetstore.aspectran.com",
												  "A1F0E08564781974FC45B43566383761",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"revealPref\":\"true\",\"description\":\"Click on <b>Hyperlink<\\/b> whose <b>Content<\\/b> is <b>Sign In<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"b572127a-b195-4eb5-a73b-cc7b6307e0a2\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1F0E08564781974FC45B43566383761\",\"isWeb\":true,\"action\":{\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"1\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Sign In\"},\"name\":\"content\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:503;left:1279;bottom:559;right:1391\\\", \\\"Geometry\\\": { \\\"height\\\": 56, \\\"width\\\": 112, \\\"x\\\": 1279, \\\"y\\\": 503 }, \\\"Style$array$\\\": \\\"background-color:rgb(248, 249, 250);background-repeat:repeat;color:rgb(0, 0, 0);font-family:\\\\\\\"Open Sans\\\\\\\", system-ui, -apple-system, \\\\\\\"Segoe UI\\\\\\\", Roboto, \\\\\\\"Helvetica Neue\\\\\\\", \\\\\\\"Noto Sans\\\\\\\", \\\\\\\"Liberation Sans\\\\\\\", Arial, sans-serif, \\\\\\\"Apple Color Emoji\\\\\\\", \\\\\\\"Segoe UI Emoji\\\\\\\", \\\\\\\"Segoe UI Symbol\\\\\\\", \\\\\\\"Noto Color Emoji\\\\\\\";font-size:16px;font-style:normal;font-weight:400;line-height:24px;margin-bottom:0px;margin-left:0px;margin-right:8px;margin-top:0px;opacity:1;padding-bottom:6px;padding-left:12px;padding-right:12px;padding-top:6px;text-align:center;text-decoration:none;visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"F8F9FAFF\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 559, \\\"class\\\": \\\"btn btn-outline-light me-2\\\", \\\"color\\\": \\\"000000FF\\\", \\\"content\\\": \\\"Sign In\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"font-family\\\": \\\"\\\\\\\"Open Sans\\\\\\\", system-ui, -apple-system, \\\\\\\"Segoe UI\\\\\\\", Roboto, \\\\\\\"Helvetica Neue\\\\\\\", \\\\\\\"Noto Sans\\\\\\\", \\\\\\\"Liberation Sans\\\\\\\", Arial, sans-serif, \\\\\\\"Apple Color Emoji\\\\\\\", \\\\\\\"Segoe UI Emoji\\\\\\\", \\\\\\\"Segoe UI Symbol\\\\\\\", \\\\\\\"Noto Color Emoji\\\\\\\"\\\", \\\"font-size\\\": 16, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"href\\\": \\\"\\\\\\/account\\\\\\/signonForm\\\", \\\"left\\\": 1279, \\\"line-height\\\": \\\"24\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": 8, \\\"margin-top\\\": 0, \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 6, \\\"padding-left\\\": 12, \\\"padding-right\\\": 12, \\\"padding-top\\\": 6, \\\"proxyClass\\\": \\\"HtmlAProxy\\\", \\\"proxyName\\\": \\\"a\\\", \\\"right\\\": 1391, \\\"tagName\\\": \\\"a\\\", \\\"text-align\\\": \\\"center\\\", \\\"text-decoration\\\": \\\"none\\\", \\\"top\\\": 503, \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"371\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/div[@id='jpetstore-content']\\\\\\/div\\\\\\/div\\\\\\/div[2]\\\\\\/a[2]\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.a\"}}],\"timeout\":10}",
												  "/SampleTestProject/Tests/SampleTestScript1.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_3(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Image button whose Content is Login - jpetstore.aspectran.com",
												  "A1F0E085649DA2E2FC45B43566383761",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1F0E085649DA2E2FC45B43566383761\",\"preferredThinktime\":0,\"thinktime\":4018,\"isWeb\":false,\"description\":\"Think <i>4,018<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"b572127a-b195-4eb5-a73b-cc7b6307e0a2\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Image button<\\/b> whose <b>Content<\\/b> is <b>Login<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"b572127a-b195-4eb5-a73b-cc7b6307e0a2\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1F0E085649DA2E2FC45B43566383761\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Login\"},\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:614;left:894;bottom:670;right:993\\\", \\\"Geometry\\\": { \\\"height\\\": 56, \\\"width\\\": 98, \\\"x\\\": 894, \\\"y\\\": 614 }, \\\"Style$array$\\\": \\\"background-color:rgb(41, 121, 71);background-repeat:repeat;color:rgb(255, 255, 255);font-family:\\\\\\\"Open Sans\\\\\\\", system-ui, -apple-system, \\\\\\\"Segoe UI\\\\\\\", Roboto, \\\\\\\"Helvetica Neue\\\\\\\", \\\\\\\"Noto Sans\\\\\\\", \\\\\\\"Liberation Sans\\\\\\\", Arial, sans-serif, \\\\\\\"Apple Color Emoji\\\\\\\", \\\\\\\"Segoe UI Emoji\\\\\\\", \\\\\\\"Segoe UI Symbol\\\\\\\", \\\\\\\"Noto Color Emoji\\\\\\\";font-size:16px;font-style:normal;font-weight:400;line-height:24px;margin-bottom:0px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:6px;padding-left:12px;padding-right:12px;padding-top:6px;text-align:center;text-decoration:none;visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"297947FF\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 670, \\\"class\\\": \\\"btn btn-success\\\", \\\"color\\\": \\\"FFFFFFFF\\\", \\\"content\\\": \\\"Login\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"font-family\\\": \\\"\\\\\\\"Open Sans\\\\\\\", system-ui, -apple-system, \\\\\\\"Segoe UI\\\\\\\", Roboto, \\\\\\\"Helvetica Neue\\\\\\\", \\\\\\\"Noto Sans\\\\\\\", \\\\\\\"Liberation Sans\\\\\\\", Arial, sans-serif, \\\\\\\"Apple Color Emoji\\\\\\\", \\\\\\\"Segoe UI Emoji\\\\\\\", \\\\\\\"Segoe UI Symbol\\\\\\\", \\\\\\\"Noto Color Emoji\\\\\\\"\\\", \\\"font-size\\\": 16, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"left\\\": 894, \\\"line-height\\\": \\\"24\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 6, \\\"padding-left\\\": 12, \\\"padding-right\\\": 12, \\\"padding-top\\\": 6, \\\"proxyClass\\\": \\\"HtmlSubmitProxy\\\", \\\"proxyName\\\": \\\"button\\\", \\\"right\\\": 993, \\\"tagName\\\": \\\"button\\\", \\\"text-align\\\": \\\"center\\\", \\\"text-decoration\\\": \\\"none\\\", \\\"top\\\": 614, \\\"type\\\": \\\"submit\\\", \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"348\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/div[@id='jpetstore-content']\\\\\\/div[2]\\\\\\/div\\\\\\/div\\\\\\/div\\\\\\/div\\\\\\/form\\\\\\/div[3]\\\\\\/button\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.button\"}}],\"timeout\":10}",
												  "/SampleTestProject/Tests/SampleTestScript1.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_4(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Hyperlink whose Content is Fish located at position 2 - jpetstore.aspectran.com",
												  "A1F0E08564AF07F4FC45B43566383761",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1F0E08564AF07F4FC45B43566383761\",\"preferredThinktime\":0,\"thinktime\":2905,\"isWeb\":false,\"description\":\"Think <i>2,905<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"b572127a-b195-4eb5-a73b-cc7b6307e0a2\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Hyperlink<\\/b> whose <b>Content<\\/b> is <b>Fish<\\/b> located at position 2\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"b572127a-b195-4eb5-a73b-cc7b6307e0a2\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1F0E08564AF07F4FC45B43566383761\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Fish\"},\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:708;left:63;bottom:757;right:129\\\", \\\"Geometry\\\": { \\\"height\\\": 49, \\\"width\\\": 66, \\\"x\\\": 63, \\\"y\\\": 708 }, \\\"Style$array$\\\": \\\"background-color:rgba(0, 0, 0, 0);background-repeat:repeat;color:rgb(22, 106, 148);font-family:\\\\\\\"Open Sans\\\\\\\", system-ui, -apple-system, \\\\\\\"Segoe UI\\\\\\\", Roboto, \\\\\\\"Helvetica Neue\\\\\\\", \\\\\\\"Noto Sans\\\\\\\", \\\\\\\"Liberation Sans\\\\\\\", Arial, sans-serif, \\\\\\\"Apple Color Emoji\\\\\\\", \\\\\\\"Segoe UI Emoji\\\\\\\", \\\\\\\"Segoe UI Symbol\\\\\\\", \\\\\\\"Noto Color Emoji\\\\\\\";font-size:24px;font-style:normal;font-weight:500;line-height:28.8px;margin-bottom:0px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:0px;padding-left:0px;padding-right:0px;padding-top:0px;text-align:start;text-decoration:none;visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"00000000\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 757, \\\"color\\\": \\\"166A94FF\\\", \\\"content\\\": \\\"Fish\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"font-family\\\": \\\"\\\\\\\"Open Sans\\\\\\\", system-ui, -apple-system, \\\\\\\"Segoe UI\\\\\\\", Roboto, \\\\\\\"Helvetica Neue\\\\\\\", \\\\\\\"Noto Sans\\\\\\\", \\\\\\\"Liberation Sans\\\\\\\", Arial, sans-serif, \\\\\\\"Apple Color Emoji\\\\\\\", \\\\\\\"Segoe UI Emoji\\\\\\\", \\\\\\\"Segoe UI Symbol\\\\\\\", \\\\\\\"Noto Color Emoji\\\\\\\"\\\", \\\"font-size\\\": 24, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"500\\\", \\\"href\\\": \\\"\\\\\\/categories\\\\\\/FISH\\\", \\\"left\\\": 63, \\\"line-height\\\": \\\"28.8\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 0, \\\"padding-left\\\": 0, \\\"padding-right\\\": 0, \\\"padding-top\\\": 0, \\\"proxyClass\\\": \\\"HtmlAProxy\\\", \\\"proxyName\\\": \\\"a\\\", \\\"right\\\": 129, \\\"tagName\\\": \\\"a\\\", \\\"text-align\\\": \\\"start\\\", \\\"text-decoration\\\": \\\"none\\\", \\\"top\\\": 708, \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"397\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/div[@id='SidebarContent']\\\\\\/h4\\\\\\/a\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.a\",\"locator\":{\"parameter\":{\"id\":\"9\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TInteger\",\"value\":\"2\"},\"id\":\"8\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceLocator\",\"type\":\"LPosition\"}}}],\"timeout\":10}",
												  "/SampleTestProject/Tests/SampleTestScript1.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_5(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Hyperlink whose Content is Fish - jpetstore.aspectran.com",
												  "A1F0E08564BFF801FC45B43566383761",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1F0E08564BFF801FC45B43566383761\",\"preferredThinktime\":0,\"thinktime\":2090,\"isWeb\":false,\"description\":\"Think <i>2,090<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"b572127a-b195-4eb5-a73b-cc7b6307e0a2\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Hyperlink<\\/b> whose <b>Content<\\/b> is <b>Fish<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"b572127a-b195-4eb5-a73b-cc7b6307e0a2\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1F0E08564BFF801FC45B43566383761\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Fish\"},\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:501;left:454;bottom:561;right:523\\\", \\\"Geometry\\\": { \\\"height\\\": 60, \\\"width\\\": 68, \\\"x\\\": 454, \\\"y\\\": 501 }, \\\"Style$array$\\\": \\\"background-color:rgba(0, 0, 0, 0);background-repeat:repeat;color:rgb(255, 255, 255);font-family:\\\\\\\"Open Sans\\\\\\\", system-ui, -apple-system, \\\\\\\"Segoe UI\\\\\\\", Roboto, \\\\\\\"Helvetica Neue\\\\\\\", \\\\\\\"Noto Sans\\\\\\\", \\\\\\\"Liberation Sans\\\\\\\", Arial, sans-serif, \\\\\\\"Apple Color Emoji\\\\\\\", \\\\\\\"Segoe UI Emoji\\\\\\\", \\\\\\\"Segoe UI Symbol\\\\\\\", \\\\\\\"Noto Color Emoji\\\\\\\";font-size:16px;font-style:normal;font-weight:400;line-height:24px;margin-bottom:0px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:8px;padding-left:8px;padding-right:8px;padding-top:8px;text-align:start;text-decoration:none;visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"00000000\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 561, \\\"class\\\": \\\"nav-link px-2 text-white\\\", \\\"color\\\": \\\"FFFFFFFF\\\", \\\"content\\\": \\\"Fish\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"font-family\\\": \\\"\\\\\\\"Open Sans\\\\\\\", system-ui, -apple-system, \\\\\\\"Segoe UI\\\\\\\", Roboto, \\\\\\\"Helvetica Neue\\\\\\\", \\\\\\\"Noto Sans\\\\\\\", \\\\\\\"Liberation Sans\\\\\\\", Arial, sans-serif, \\\\\\\"Apple Color Emoji\\\\\\\", \\\\\\\"Segoe UI Emoji\\\\\\\", \\\\\\\"Segoe UI Symbol\\\\\\\", \\\\\\\"Noto Color Emoji\\\\\\\"\\\", \\\"font-size\\\": 16, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"href\\\": \\\"\\\\\\/categories\\\\\\/FISH\\\", \\\"left\\\": 454, \\\"line-height\\\": \\\"24\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 8, \\\"padding-left\\\": 8, \\\"padding-right\\\": 8, \\\"padding-top\\\": 8, \\\"proxyClass\\\": \\\"HtmlAProxy\\\", \\\"proxyName\\\": \\\"a\\\", \\\"right\\\": 523, \\\"tagName\\\": \\\"a\\\", \\\"text-align\\\": \\\"start\\\", \\\"text-decoration\\\": \\\"none\\\", \\\"top\\\": 501, \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"335\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/div[@id='jpetstore-content']\\\\\\/div\\\\\\/div\\\\\\/div\\\\\\/ul\\\\\\/li\\\\\\/a\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.a\"}}],\"timeout\":10}",
												  "/SampleTestProject/Tests/SampleTestScript1.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_6(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Hyperlink whose Content is FI-SW-01 - jpetstore.aspectran.com",
												  "A1F0E08564D0E7D4FC45B43566383761",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1F0E08564D0E7D4FC45B43566383761\",\"preferredThinktime\":0,\"thinktime\":8023,\"isWeb\":false,\"description\":\"Think <i>8,023<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"b572127a-b195-4eb5-a73b-cc7b6307e0a2\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Hyperlink<\\/b> whose <b>Content<\\/b> is <b>FI-SW-01<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"b572127a-b195-4eb5-a73b-cc7b6307e0a2\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1F0E08564D0E7D4FC45B43566383761\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"FI-SW-01\"},\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:282;left:48;bottom:315;right:145\\\", \\\"Geometry\\\": { \\\"height\\\": 33, \\\"width\\\": 97, \\\"x\\\": 48, \\\"y\\\": 282 }, \\\"Style$array$\\\": \\\"background-color:rgba(0, 0, 0, 0);background-repeat:repeat;color:rgb(22, 106, 148);font-family:\\\\\\\"Open Sans\\\\\\\", system-ui, -apple-system, \\\\\\\"Segoe UI\\\\\\\", Roboto, \\\\\\\"Helvetica Neue\\\\\\\", \\\\\\\"Noto Sans\\\\\\\", \\\\\\\"Liberation Sans\\\\\\\", Arial, sans-serif, \\\\\\\"Apple Color Emoji\\\\\\\", \\\\\\\"Segoe UI Emoji\\\\\\\", \\\\\\\"Segoe UI Symbol\\\\\\\", \\\\\\\"Noto Color Emoji\\\\\\\";font-size:16px;font-style:normal;font-weight:400;line-height:24px;margin-bottom:0px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:0px;padding-left:0px;padding-right:0px;padding-top:0px;text-align:start;text-decoration:none;visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"00000000\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 315, \\\"color\\\": \\\"166A94FF\\\", \\\"content\\\": \\\"FI-SW-01\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"font-family\\\": \\\"\\\\\\\"Open Sans\\\\\\\", system-ui, -apple-system, \\\\\\\"Segoe UI\\\\\\\", Roboto, \\\\\\\"Helvetica Neue\\\\\\\", \\\\\\\"Noto Sans\\\\\\\", \\\\\\\"Liberation Sans\\\\\\\", Arial, sans-serif, \\\\\\\"Apple Color Emoji\\\\\\\", \\\\\\\"Segoe UI Emoji\\\\\\\", \\\\\\\"Segoe UI Symbol\\\\\\\", \\\\\\\"Noto Color Emoji\\\\\\\"\\\", \\\"font-size\\\": 16, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"href\\\": \\\"\\\\\\/products\\\\\\/FI-SW-01\\\", \\\"left\\\": 48, \\\"line-height\\\": \\\"24\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 0, \\\"padding-left\\\": 0, \\\"padding-right\\\": 0, \\\"padding-top\\\": 0, \\\"proxyClass\\\": \\\"HtmlAProxy\\\", \\\"proxyName\\\": \\\"a\\\", \\\"right\\\": 145, \\\"tagName\\\": \\\"a\\\", \\\"text-align\\\": \\\"start\\\", \\\"text-decoration\\\": \\\"none\\\", \\\"top\\\": 282, \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"372\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/div[@id='jpetstore-content']\\\\\\/div[2]\\\\\\/table\\\\\\/tbody\\\\\\/tr\\\\\\/td\\\\\\/a\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.a\"}}],\"timeout\":10}",
												  "/SampleTestProject/Tests/SampleTestScript1.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_7(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Hyperlink whose Url is /cart/addItemToCart?itemId=EST-1 - jpetstore.aspectran.com",
												  "A1F0E08564E05132FC45B43566383761",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1F0E08564E05132FC45B43566383761\",\"preferredThinktime\":0,\"thinktime\":1558,\"isWeb\":false,\"description\":\"Think <i>1,558<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"b572127a-b195-4eb5-a73b-cc7b6307e0a2\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Hyperlink<\\/b> whose <b>Url<\\/b> is <b>\\/cart\\/addItemToCart?itemId=EST-1<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"b572127a-b195-4eb5-a73b-cc7b6307e0a2\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1F0E08564E05132FC45B43566383761\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"href\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"\\/cart\\/addItemToCart?itemId=EST-1\"},\"name\":\"href\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:43;left:1703;bottom:89;right:1840\\\", \\\"Geometry\\\": { \\\"height\\\": 45, \\\"width\\\": 136, \\\"x\\\": 1703, \\\"y\\\": 43 }, \\\"Style$array$\\\": \\\"background-color:rgb(61, 69, 74);background-repeat:repeat;color:rgb(255, 255, 255);font-family:\\\\\\\"Open Sans\\\\\\\", system-ui, -apple-system, \\\\\\\"Segoe UI\\\\\\\", Roboto, \\\\\\\"Helvetica Neue\\\\\\\", \\\\\\\"Noto Sans\\\\\\\", \\\\\\\"Liberation Sans\\\\\\\", Arial, sans-serif, \\\\\\\"Apple Color Emoji\\\\\\\", \\\\\\\"Segoe UI Emoji\\\\\\\", \\\\\\\"Segoe UI Symbol\\\\\\\", \\\\\\\"Noto Color Emoji\\\\\\\";font-size:14px;font-style:normal;font-weight:400;line-height:21px;margin-bottom:0px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:4px;padding-left:8px;padding-right:8px;padding-top:4px;text-align:center;text-decoration:none;visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"3D454AFF\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 89, \\\"class\\\": \\\"btn btn-primary btn-sm\\\", \\\"color\\\": \\\"FFFFFFFF\\\", \\\"content\\\": \\\"Add to Cart\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"font-family\\\": \\\"\\\\\\\"Open Sans\\\\\\\", system-ui, -apple-system, \\\\\\\"Segoe UI\\\\\\\", Roboto, \\\\\\\"Helvetica Neue\\\\\\\", \\\\\\\"Noto Sans\\\\\\\", \\\\\\\"Liberation Sans\\\\\\\", Arial, sans-serif, \\\\\\\"Apple Color Emoji\\\\\\\", \\\\\\\"Segoe UI Emoji\\\\\\\", \\\\\\\"Segoe UI Symbol\\\\\\\", \\\\\\\"Noto Color Emoji\\\\\\\"\\\", \\\"font-size\\\": 14, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"href\\\": \\\"\\\\\\/cart\\\\\\/addItemToCart?itemId=EST-1\\\", \\\"left\\\": 1703, \\\"line-height\\\": \\\"21\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 4, \\\"padding-left\\\": 8, \\\"padding-right\\\": 8, \\\"padding-top\\\": 4, \\\"proxyClass\\\": \\\"HtmlAProxy\\\", \\\"proxyName\\\": \\\"a\\\", \\\"right\\\": 1840, \\\"tagName\\\": \\\"a\\\", \\\"text-align\\\": \\\"center\\\", \\\"text-decoration\\\": \\\"none\\\", \\\"top\\\": 43, \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"386\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/div[@id='jpetstore-content']\\\\\\/div[2]\\\\\\/table\\\\\\/tbody\\\\\\/tr\\\\\\/td[5]\\\\\\/a\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.a\"}}],\"timeout\":10}",
												  "/SampleTestProject/Tests/SampleTestScript1.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_8(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Hyperlink whose Content is Proceed to Checkout - jpetstore.aspectran.com",
												  "A1F0E08564F0F2F4FC45B43566383761",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1F0E08564F0F2F4FC45B43566383761\",\"preferredThinktime\":0,\"thinktime\":2425,\"isWeb\":false,\"description\":\"Think <i>2,425<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"b572127a-b195-4eb5-a73b-cc7b6307e0a2\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Hyperlink<\\/b> whose <b>Content<\\/b> is <b>Proceed to Checkout<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"b572127a-b195-4eb5-a73b-cc7b6307e0a2\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1F0E08564F0F2F4FC45B43566383761\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Proceed to Checkout\"},\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:198;left:808;bottom:254;right:1079\\\", \\\"Geometry\\\": { \\\"height\\\": 56, \\\"width\\\": 270, \\\"x\\\": 808, \\\"y\\\": 198 }, \\\"Style$array$\\\": \\\"background-color:rgb(41, 120, 70);background-repeat:repeat;color:rgb(255, 255, 255);font-family:\\\\\\\"Open Sans\\\\\\\", system-ui, -apple-system, \\\\\\\"Segoe UI\\\\\\\", Roboto, \\\\\\\"Helvetica Neue\\\\\\\", \\\\\\\"Noto Sans\\\\\\\", \\\\\\\"Liberation Sans\\\\\\\", Arial, sans-serif, \\\\\\\"Apple Color Emoji\\\\\\\", \\\\\\\"Segoe UI Emoji\\\\\\\", \\\\\\\"Segoe UI Symbol\\\\\\\", \\\\\\\"Noto Color Emoji\\\\\\\";font-size:16px;font-style:normal;font-weight:400;line-height:24px;margin-bottom:0px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:6px;padding-left:12px;padding-right:12px;padding-top:6px;text-align:center;text-decoration:none;visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"297846FF\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 254, \\\"class\\\": \\\"btn btn-success\\\", \\\"color\\\": \\\"FFFFFFFF\\\", \\\"content\\\": \\\"Proceed to Checkout\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"font-family\\\": \\\"\\\\\\\"Open Sans\\\\\\\", system-ui, -apple-system, \\\\\\\"Segoe UI\\\\\\\", Roboto, \\\\\\\"Helvetica Neue\\\\\\\", \\\\\\\"Noto Sans\\\\\\\", \\\\\\\"Liberation Sans\\\\\\\", Arial, sans-serif, \\\\\\\"Apple Color Emoji\\\\\\\", \\\\\\\"Segoe UI Emoji\\\\\\\", \\\\\\\"Segoe UI Symbol\\\\\\\", \\\\\\\"Noto Color Emoji\\\\\\\"\\\", \\\"font-size\\\": 16, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"href\\\": \\\"\\\\\\/order\\\\\\/newOrderForm\\\", \\\"left\\\": 808, \\\"line-height\\\": \\\"24\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 6, \\\"padding-left\\\": 12, \\\"padding-right\\\": 12, \\\"padding-top\\\": 6, \\\"proxyClass\\\": \\\"HtmlAProxy\\\", \\\"proxyName\\\": \\\"a\\\", \\\"right\\\": 1079, \\\"tagName\\\": \\\"a\\\", \\\"text-align\\\": \\\"center\\\", \\\"text-decoration\\\": \\\"none\\\", \\\"top\\\": 198, \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"475\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/div[@id='jpetstore-content']\\\\\\/div[2]\\\\\\/div[2]\\\\\\/a\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.a\"}}],\"timeout\":10}",
												  "/SampleTestProject/Tests/SampleTestScript1.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_9(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Image button whose Content is Continue - jpetstore.aspectran.com",
												  "A1F0E0856502CD44FC45B43566383761",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1F0E0856502CD44FC45B43566383761\",\"preferredThinktime\":0,\"thinktime\":2796,\"isWeb\":false,\"description\":\"Think <i>2,796<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"b572127a-b195-4eb5-a73b-cc7b6307e0a2\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Image button<\\/b> whose <b>Content<\\/b> is <b>Continue<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"b572127a-b195-4eb5-a73b-cc7b6307e0a2\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1F0E0856502CD44FC45B43566383761\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Continue\"},\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:114;left:814;bottom:170;right:954\\\", \\\"Geometry\\\": { \\\"height\\\": 56, \\\"width\\\": 139, \\\"x\\\": 814, \\\"y\\\": 114 }, \\\"Style$array$\\\": \\\"background-color:rgb(41, 121, 71);background-repeat:repeat;color:rgb(255, 255, 255);font-family:\\\\\\\"Open Sans\\\\\\\", system-ui, -apple-system, \\\\\\\"Segoe UI\\\\\\\", Roboto, \\\\\\\"Helvetica Neue\\\\\\\", \\\\\\\"Noto Sans\\\\\\\", \\\\\\\"Liberation Sans\\\\\\\", Arial, sans-serif, \\\\\\\"Apple Color Emoji\\\\\\\", \\\\\\\"Segoe UI Emoji\\\\\\\", \\\\\\\"Segoe UI Symbol\\\\\\\", \\\\\\\"Noto Color Emoji\\\\\\\";font-size:16px;font-style:normal;font-weight:400;line-height:24px;margin-bottom:0px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:6px;padding-left:12px;padding-right:12px;padding-top:6px;text-align:center;text-decoration:none;visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"297947FF\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 170, \\\"class\\\": \\\"btn btn-success\\\", \\\"color\\\": \\\"FFFFFFFF\\\", \\\"content\\\": \\\"Continue\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"font-family\\\": \\\"\\\\\\\"Open Sans\\\\\\\", system-ui, -apple-system, \\\\\\\"Segoe UI\\\\\\\", Roboto, \\\\\\\"Helvetica Neue\\\\\\\", \\\\\\\"Noto Sans\\\\\\\", \\\\\\\"Liberation Sans\\\\\\\", Arial, sans-serif, \\\\\\\"Apple Color Emoji\\\\\\\", \\\\\\\"Segoe UI Emoji\\\\\\\", \\\\\\\"Segoe UI Symbol\\\\\\\", \\\\\\\"Noto Color Emoji\\\\\\\"\\\", \\\"font-size\\\": 16, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"left\\\": 814, \\\"line-height\\\": \\\"24\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 6, \\\"padding-left\\\": 12, \\\"padding-right\\\": 12, \\\"padding-top\\\": 6, \\\"proxyClass\\\": \\\"HtmlSubmitProxy\\\", \\\"proxyName\\\": \\\"button\\\", \\\"right\\\": 954, \\\"tagName\\\": \\\"button\\\", \\\"text-align\\\": \\\"center\\\", \\\"text-decoration\\\": \\\"none\\\", \\\"top\\\": 114, \\\"type\\\": \\\"submit\\\", \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"543\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/div[@id='jpetstore-content']\\\\\\/div[2]\\\\\\/div\\\\\\/div\\\\\\/form\\\\\\/div\\\\\\/button\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.button\"}}],\"timeout\":10}",
												  "/SampleTestProject/Tests/SampleTestScript1.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_10(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Image button whose Content is Confirm - jpetstore.aspectran.com",
												  "A1F0E0856514CEA4FC45B43566383761",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"optionalStep\":false,\"uid\":\"A1F0E0856514CEA4FC45B43566383761\",\"preferredThinktime\":0,\"thinktime\":3817,\"isWeb\":false,\"description\":\"Think <i>3,817<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"b572127a-b195-4eb5-a73b-cc7b6307e0a2\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Image button<\\/b> whose <b>Content<\\/b> is <b>Confirm<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"b572127a-b195-4eb5-a73b-cc7b6307e0a2\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1F0E0856514CEA4FC45B43566383761\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Confirm\"},\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:114;left:831;bottom:170;right:959\\\", \\\"Geometry\\\": { \\\"height\\\": 56, \\\"width\\\": 128, \\\"x\\\": 831, \\\"y\\\": 114 }, \\\"Style$array$\\\": \\\"background-color:rgb(41, 120, 70);background-repeat:repeat;color:rgb(255, 255, 255);font-family:\\\\\\\"Open Sans\\\\\\\", system-ui, -apple-system, \\\\\\\"Segoe UI\\\\\\\", Roboto, \\\\\\\"Helvetica Neue\\\\\\\", \\\\\\\"Noto Sans\\\\\\\", \\\\\\\"Liberation Sans\\\\\\\", Arial, sans-serif, \\\\\\\"Apple Color Emoji\\\\\\\", \\\\\\\"Segoe UI Emoji\\\\\\\", \\\\\\\"Segoe UI Symbol\\\\\\\", \\\\\\\"Noto Color Emoji\\\\\\\";font-size:16px;font-style:normal;font-weight:400;line-height:24px;margin-bottom:0px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:6px;padding-left:12px;padding-right:12px;padding-top:6px;text-align:center;text-decoration:none;visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"297846FF\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 170, \\\"class\\\": \\\"btn btn-success\\\", \\\"color\\\": \\\"FFFFFFFF\\\", \\\"content\\\": \\\"Confirm\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"font-family\\\": \\\"\\\\\\\"Open Sans\\\\\\\", system-ui, -apple-system, \\\\\\\"Segoe UI\\\\\\\", Roboto, \\\\\\\"Helvetica Neue\\\\\\\", \\\\\\\"Noto Sans\\\\\\\", \\\\\\\"Liberation Sans\\\\\\\", Arial, sans-serif, \\\\\\\"Apple Color Emoji\\\\\\\", \\\\\\\"Segoe UI Emoji\\\\\\\", \\\\\\\"Segoe UI Symbol\\\\\\\", \\\\\\\"Noto Color Emoji\\\\\\\"\\\", \\\"font-size\\\": 16, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"left\\\": 831, \\\"line-height\\\": \\\"24\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 6, \\\"padding-left\\\": 12, \\\"padding-right\\\": 12, \\\"padding-top\\\": 6, \\\"proxyClass\\\": \\\"HtmlSubmitProxy\\\", \\\"proxyName\\\": \\\"button\\\", \\\"right\\\": 959, \\\"tagName\\\": \\\"button\\\", \\\"text-align\\\": \\\"center\\\", \\\"text-decoration\\\": \\\"none\\\", \\\"top\\\": 114, \\\"type\\\": \\\"submit\\\", \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"546\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/div[@id='jpetstore-content']\\\\\\/div[2]\\\\\\/div\\\\\\/div\\\\\\/form\\\\\\/div\\\\\\/button\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.button\"}}],\"timeout\":10}",
												  "/SampleTestProject/Tests/SampleTestScript1.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_11(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Close application window - jpetstore.aspectran.com",
												  "A1F0E0856524D43EFC45B43566383761",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"revealPref\":\"true\",\"description\":\"<b>Close<\\/b> application window\",\"to_overriden\":false,\"application_uid\":\"b572127a-b195-4eb5-a73b-cc7b6307e0a2\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1F0E0856524D43EFC45B43566383761\",\"isWeb\":true,\"action\":{\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"close\",\"parameters\":[]},\"sync_policy\":\"DEFAULT\",\"id\":\"1\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceHWActionStep\"}],\"timeout\":10}",
												  "/SampleTestProject/Tests/SampleTestScript1.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

}

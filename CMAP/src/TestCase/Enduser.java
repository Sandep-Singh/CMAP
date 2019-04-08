package TestCase;

import Baseclass.Login;
import Pages.AdminDashboard;
import Pages.CMAP_Homepage;
import Pages.CaseDetails;
import Pages.Casedashboard;
import Pages.CreateNewCase;
import Pages.ForeignOfficial;
import Pages.FormeandOther;

public class Enduser extends Login{
	
	static Login login = new Login();
	static CMAP_Homepage hpage = new CMAP_Homepage();
	static ForeignOfficial Fo= new ForeignOfficial();
	static FormeandOther me= new FormeandOther();	
	static AdminDashboard adm = new AdminDashboard();
	static CreateNewCase cas = new CreateNewCase();
	static Casedashboard cad = new Casedashboard();
	static CaseDetails CD= new CaseDetails();
	
	
	
	
	public static void main(String[] args) throws Throwable
	{
		login.callchormebrower();
		//login.enduserlogincredentials();
		
	//	Thread.sleep(5000);
		
		//hpage.CMAPtitle();
		//hpage.CasesTab();
		//hpage.ForeignOfficial();
		
		//Fo.DeloittePolicy();
		//Fo.APR920();
		
		//me.createbtn();
		//me.formeradiobutton();
		//me.continuebutton();
		//me.FactsandBackground();
		//me.submitbtn();
		
		login.Adminlogincredentials();
		
		/*
		
		adm.CreateNewCase();
		
		Thread.sleep(4000);
		me.peoplepicker();
		cas.ReportedOn();
		cas.CompanyClient();
		cas.IntakeSource();
		cas.AddJursidction();
		cas.PersonId();
		cas.ReportedBy();
		cas.Priority();
		cas.Me();
		cas.Continue();
		cas.CaseTopics();
		cas.SubTopic();
		cas.SendCreateEmail();
		cas.SummaryKeywords();
		cas.Fbackground();
		cas.pagecsrolldown();
		me.submitbtn();
		cas.CaseCreatedSuccessfullMessage();
		
		*/
	   
		cad.Cases();
		cad.InprocessStatus();
		CD.AttachmentTab();
		CD.CaseDetailsTab();
		CD.WorkflowLogandComment();
		
		//login.close();
	}

}

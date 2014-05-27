/*
 * © Copyright FOCONIS AG, 2014
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at:
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or 
 * implied. See the License for the specific language governing 
 * permissions and limitations under the License.
 * 
 */
package org.openntf.domino.formula.impl;

import org.openntf.domino.formula.FormulaContext;
import org.openntf.domino.formula.FunctionFactory;
import org.openntf.domino.formula.ValueHolder;

import com.ibm.commons.util.NotImplementedException;

/**
 * This class lists ALL available at-Functions (it is inserted at first in the group of functions, so that if you implement a function, this
 * will be overrided)
 * 
 * @author Roland Praml, Foconis AG
 * 
 */
public class NotImplemented extends AtFunction {

	/**
	 * The Factory that returns a set of operators
	 */
	public static class Factory extends FunctionFactory {

		public Factory() {
			super();
			//					Package
			init(new NotImplemented("@Abs", "Prio: HIGH"), 	//					Arithmetic		
					new NotImplemented("@Abstract", "Prio: LO"), //
					new NotImplemented("@AbstractSimple", "Prio: LO"), //
					new NotImplemented("@Accessed", "Prio: HIGH"), //			DocProperties 
					new NotImplemented("@ACos", "Prio: HIGH"), //			 	Arithmetic
					new NotImplemented("@AddToFolder", "Prio: LO"), //			DocProperties
					new NotImplemented("@Adjust", "Prio: HIGH"), //
					new NotImplemented("@AdminECLIsLocked", "Prio: LO"), // 
					new NotImplemented("@All", "Prio: LO"), //					Constants
					new NotImplemented("@AllChildren", "Prio: LO"), //
					new NotImplemented("@AllDescendants", "Prio: LO"), //
					new NotImplemented("@Ascii", "Prio: HIGH"), //
					new NotImplemented("@ASin", "Prio: HIGH"), //  				Arithmetic
					new NotImplemented("@ATan", "Prio: HIGH"), //				Arithmetic
					new NotImplemented("@ATan2", "Prio: HIGH"), //				Arithmetic
					new NotImplemented("@AttachmentLengths", "Prio: MID"), //
					new NotImplemented("@AttachmentModifiedTimes", "Prio: MID"), //
					new NotImplemented("@AttachmentNames", "Prio: MID"), //
					new NotImplemented("@Attachments", "Prio: MID"), //
					new NotImplemented("@Author", "Prio: MID"), //
					new NotImplemented("@Begins", "Prio: HIGH"), //
					new NotImplemented("@BrowserInfo", "Prio: LO"), //
					new NotImplemented("@BusinessDays", "Prio: HIGH"), //
					new NotImplemented("@Certificate", "Prio: LO"), //
					new NotImplemented("@Char", "Prio: HIGH"), //
					new NotImplemented("@CheckAlarms", "Prio: LO"), //
					new NotImplemented("@CheckFormulaSyntax", "Prio: MID"), //
					new NotImplemented("@ClientType", "Prio: LO"), //
					new NotImplemented("@Command", "Prio: LO"), //				NotSupported
					new NotImplemented("@Compare", "Prio: HIGH"), //
					new NotImplemented("@ConfigFile", "Prio: LO"), //
					new NotImplemented("@Contains", "Prio: HIGH"), //
					new NotImplemented("@Cos", "Prio: HIGH"), // 				Arithmetic 
					new NotImplemented("@Count", "Prio: HIGH"), //
					new NotImplemented("@Created", "Prio: MID"), // 			DocProperties 
					new NotImplemented("@Date", "Prio: HIGH"), //
					new NotImplemented("@Day", "Prio: HIGH"), //
					new NotImplemented("@DB2Schema", "Prio: LO"), //
					new NotImplemented("@DbColumn (Domino)", "Prio: HIGH"), //
					new NotImplemented("@DbColumn (ODBC)", "Prio: LO"), //
					new NotImplemented("@DbCommand (ODBC)", "Prio: LO"), //
					new NotImplemented("@DbExists", "Prio: MID"), //
					new NotImplemented("@DbLookup (Domino)", "Prio: HIGH"), //
					new NotImplemented("@DbLookup (ODBC)", "Prio: LO"), //
					new NotImplemented("@DbManager", "Prio: LO"), // ACL-related
					new NotImplemented("@DbName", "Prio: MID"), //
					new NotImplemented("@DbTitle", "Prio: MID"), //
					new NotImplemented("@DDEExecute", "Prio: LO"), //			NotSupported
					new NotImplemented("@DDEInitiate", "Prio: LO"), //			NotSupported
					new NotImplemented("@DDEPoke", "Prio: LO"), //				NotSupported
					new NotImplemented("@DDETerminate", "Prio: LO"), //			NotSupported
					//new NotImplemented("DEFAULT", "Prio: LO"), // parser
					new NotImplemented("@DeleteDocument", "Prio: LO"), //
					new NotImplemented("@DeleteField", "Prio: MID"), //			Constants
					new NotImplemented("@DialogBox", "Prio: LO"), //			NotSupported
					//new NotImplemented("@Do", "Prio: LO"), // parser
					new NotImplemented("@DocChildren", "Prio: LO"), // This Formula does work only in views
					new NotImplemented("@DocDescendants", "Prio: LO"), // This Formula does work only in views
					new NotImplemented("@DocFields", "Prio: HIGH"), // 				DocProperties 
					new NotImplemented("@DocLength", "Prio: MID"), // 				DocProperties
					new NotImplemented("@DocLevel", "Prio: LO"), // This Formula does work only in views
					new NotImplemented("@DocLock", "Prio: LO"), // TODO: Who needs this?
					new NotImplemented("@DocMark", "Prio: LO"), // TODO: Map this to "save???"
					new NotImplemented("@DocNumber", "Prio: LO"), // This Formula does work only in views
					new NotImplemented("@DocOmittedLength", "Prio: LO"), // TODO: Who needs this?
					new NotImplemented("@DocParentNumber", "Prio: LO"), // TODO: Who needs this?
					new NotImplemented("@DocSiblings", "Prio: LO"), // TODO: Who needs this?
					new NotImplemented("@DocumentUniqueID", "Prio: HIGH"), // 		DocProperties: 
					new NotImplemented("@Domain", "Prio: MID"), //
					//new NotImplemented("@DoWhile", "Prio: LO"), // parser
					new NotImplemented("@EditECL", "Prio: LO"), // 					NotSupported
					new NotImplemented("@EditUserECL", "Prio: LO"), // 				NotSupported
					new NotImplemented("@Elements", "Prio: HIGH"), //
					new NotImplemented("@EnableAlarms", "Prio: LO"), //				NotSupported
					new NotImplemented("@Ends", "Prio: HIGH"), //
					//new NotImplemented("ENVIRONMENT", "Prio: LO"), //	parser
					new NotImplemented("@Environment", "Prio: MID"), //
					new NotImplemented("@Error", "Prio: HIGH"), //
					// new NotImplemented("@Eval", "Prio: MID"), // parser
					new NotImplemented("@Exp", "Prio: HIGH"), //					Arithmetic 
					new NotImplemented("@Explode", "Prio: HIGH"), //
					new NotImplemented("@Failure", "Prio: LO"), //
					new NotImplemented("@False", "Prio: HIGH"), //					Constant
					// new NotImplemented("FIELD", "Prio: LO"), // parser
					new NotImplemented("@FileDir", "Prio: LO"), //
					new NotImplemented("@FloatEq", "Prio: HIGH"), //				Arithmetic
					new NotImplemented("@FontList", "Prio: LO"), //					NotSupported
					// new NotImplemented("@For", "Prio: LO"), // parser
					new NotImplemented("@FormLanguage", "Prio: LO"), //
					new NotImplemented("@GetAddressBooks", "Prio: MID"), //
					new NotImplemented("@GetCurrentTimeZone", "Prio: MID"), //
					new NotImplemented("@GetDocField", "Prio: MID"), //
					new NotImplemented("@GetField", "Prio: HIGH"), //
					new NotImplemented("@GetFocusTable", "Prio: LO"), //
					new NotImplemented("@GetHTTPHeader", "Prio: LO"), //
					new NotImplemented("@GetIMContactListGroupNames", "Prio: LO"), //NotSupported
					new NotImplemented("@GetPortsList", "Prio: LO"), //				NotSupporte
					new NotImplemented("@GetProfileField", "Prio: MID"), //
					new NotImplemented("@GetViewInfo", "Prio: LO"), //
					new NotImplemented("@HardDeleteDocument", "Prio: LO"), //
					new NotImplemented("@HashPassword", "Prio: HIGH"), //
					new NotImplemented("@Hour", "Prio: HIGH"), //
					// new NotImplemented("@If", "Prio: LO"), // parser
					// new NotImplemented("@IfError (veraltet)", "Prio: LO"), // parser
					new NotImplemented("@Implode", "Prio: HIGH"), //
					new NotImplemented("@InheritedDocumentUniqueID", "Prio: HIGH"), // DocProperties: 
					new NotImplemented("@Integer", "Prio: HIGH"), //				Arithmetic
					new NotImplemented("@IsAgentEnabled", "Prio: MID"), //
					new NotImplemented("@IsAppInstalled", "Prio: LO"), // Do we implement this. Do we return "server?"
					new NotImplemented("@IsAvailable", "Prio: HIGH"), //
					new NotImplemented("@IsCategory", "Prio: LO"), //
					new NotImplemented("@IsDB2", "Prio: LO"), //
					new NotImplemented("@IsDocBeingEdited", "Prio: LO"), //
					new NotImplemented("@IsDocBeingLoaded", "Prio: LO"), //
					new NotImplemented("@IsDocBeingMailed", "Prio: LO"), //
					new NotImplemented("@IsDocBeingRecalculated", "Prio: LO"), //
					new NotImplemented("@IsDocBeingSaved", "Prio: LO"), //
					new NotImplemented("@IsDocTruncated", "Prio: LO"), //
					new NotImplemented("@IsEmbeddedInsideWCT", "Prio: LO"), //
					new NotImplemented("@IsError", "Prio: HIGH"), //
					new NotImplemented("@IsExpandable", "Prio: LO"), //
					new NotImplemented("@IsMember", "Prio: HIGH"), //
					new NotImplemented("@IsModalHelp", "Prio: LO"), //
					new NotImplemented("@IsNewDoc", "Prio: HIGH"), //				DocProperties
					new NotImplemented("@IsNotMember", "Prio: HIGH"), //
					new NotImplemented("@IsNull", "Prio: HIGH"), //
					new NotImplemented("@IsNumber", "Prio: HIGH"), //
					new NotImplemented("@IsResponseDoc", "Prio: LO"), //			DocProperties
					new NotImplemented("@IsText", "Prio: HIGH"), //
					new NotImplemented("@IsTime", "Prio: HIGH"), //
					new NotImplemented("@IsUnavailable", "Prio: HIGH"), //
					new NotImplemented("@IsUsingJavaElement", "Prio: LO"), // what do we here? return True?
					new NotImplemented("@IsValid", "Prio: LO"), //
					new NotImplemented("@IsVirtualizedDirectory", "Prio: LO"), //
					new NotImplemented("@Keywords", "Prio: HIGH"), //
					new NotImplemented("@LanguagePreference", "Prio: LO"), //
					new NotImplemented("@LaunchApp", "Prio: LO"), //
					new NotImplemented("@LDAPServer", "Prio: LO"), //
					new NotImplemented("@Left", "Prio: HIGH"), //
					new NotImplemented("@LeftBack", "Prio: HIGH"), //
					new NotImplemented("@Length", "Prio: HIGH"), //
					new NotImplemented("@Like", "Prio: HIGH"), //
					new NotImplemented("@Ln", "Prio: HIGH"), //						Arithmetic
					new NotImplemented("@Locale", "Prio: MID"), //
					new NotImplemented("@Log", "Prio: HIGH"), //					Arithmetic
					new NotImplemented("@LowerCase", "Prio: HIGH"), //
					new NotImplemented("@MailDbName", "Prio: MID"), //
					new NotImplemented("@MailEncryptSavedPreference", "Prio: LO"), //
					new NotImplemented("@MailEncryptSentPreference", "Prio: LO"), //
					new NotImplemented("@MailSavePreference", "Prio: LO"), //
					new NotImplemented("@MailSend", "Prio: LO"), //
					new NotImplemented("@MailSignPreference", "Prio: LO"), //
					new NotImplemented("@Matches", "Prio: HIGH"), //
					new NotImplemented("@Max", "Prio: HIGH"), //					Arithmetic
					new NotImplemented("@Member", "Prio: HIGH"), //
					new NotImplemented("@Middle", "Prio: HIGH"), //
					new NotImplemented("@MiddleBack", "Prio: HIGH"), //
					new NotImplemented("@Min", "Prio: HIGH"), //					Arithmetic
					new NotImplemented("@Minute", "Prio: HIGH"), //
					new NotImplemented("@Modified", "Prio: HIGH"), //				DocProperties
					new NotImplemented("@Modulo", "Prio: HIGH"), //					Arithmetic
					new NotImplemented("@Month", "Prio: HIGH"), //
					new NotImplemented("@Name", "Prio: HIGH"), //
					new NotImplemented("@NameLookup", "Prio: LO"), //
					new NotImplemented("@Narrow", "Prio: HIGH"), //
					new NotImplemented("@NewLine", "Prio: HIGH"), //
					new NotImplemented("@No", "Prio: HIGH"), //						Constant
					new NotImplemented("@NoteID", "Prio: HIGH"), //					DocProperties 
					new NotImplemented("@Nothing", "Prio: HIGH"), //				Constant
					new NotImplemented("@Now", "Prio: HIGH"), //
					//new NotImplemented("@OpenInNewWindow", "Prio: LO"), // THIS IS NOT AN @FUNCTION 
					//(listed in designerhelp: Where does this @function work? (Part 1 L -- R)  )
					new NotImplemented("@OptimizeMailAddress", "Prio: HIGH"), //
					new NotImplemented("@OrgDir", "Prio: LO"), //
					new NotImplemented("@Password", "Prio: HIGH"), //
					new NotImplemented("@PasswordQuality", "Prio: HIGH"), //
					new NotImplemented("@Pi", "Prio: HIGH"), //						Arithmetic
					new NotImplemented("@PickList", "Prio: LO"), //
					new NotImplemented("@Platform", "Prio: LO"), //
					new NotImplemented("@PolicyIsFieldLocked", "Prio: LO"), //
					new NotImplemented("@PostedCommand", "Prio: LO"), //
					new NotImplemented("@Power", "Prio: HIGH"), //					Arithmetic
					new NotImplemented("@Prompt", "Prio: LO"), //					NotSupported
					new NotImplemented("@ProperCase", "Prio: HIGH"), //
					new NotImplemented("@Random", "Prio: HIGH"), //					Arithmetic
					new NotImplemented("@RefreshECL", "Prio: LO"), //
					new NotImplemented("@RegQueryValue", "Prio: MID"), //
					//new NotImplemented("REM", "Prio: LO"), // parser
					//new NotImplemented("@Repeat", "Prio: HIGH"), // parser
					new NotImplemented("@Replace", "Prio: HIGH"), //
					new NotImplemented("@ReplaceSubstring", "Prio: HIGH"), //
					new NotImplemented("@ReplicaID", "Prio: HIGH"), //				DocProperties
					new NotImplemented("@Responses", "Prio: HIGH"), //				DocProperties
					//new NotImplemented("@Return", "Prio: HIGH"), // parser
					new NotImplemented("@Right", "Prio: HIGH"), //
					new NotImplemented("@RightBack", "Prio: HIGH"), //
					new NotImplemented("@Round", "Prio: HIGH"), //
					new NotImplemented("@Second", "Prio: HIGH"), //
					//new NotImplemented("SELECT", "Prio: LO"), // parser
					new NotImplemented("@Select", "Prio: HIGH"), //
					new NotImplemented("@ServerAccess", "Prio: MID"), //
					new NotImplemented("@ServerName", "Prio: MID"), //
					new NotImplemented("@Set", "Prio: HIGH"), //
					new NotImplemented("@SetDocField", "Prio: MID"), //
					new NotImplemented("@SetEnvironment", "Prio: MID"), //
					new NotImplemented("@SetField", "Prio: HIGH"), //
					new NotImplemented("@SetHTTPHeader", "Prio: LO"), //
					new NotImplemented("@SetProfileField", "Prio: MID"), //
					new NotImplemented("@SetTargetFrame", "Prio: LO"), //
					new NotImplemented("@SetViewInfo", "Prio: LO"), //
					new NotImplemented("@ShowParentPreview", "Prio: LO"), //
					new NotImplemented("@Sign", "Prio: HIGH"), //
					new NotImplemented("@Sin", "Prio: HIGH"), //					Arithmetic
					//new NotImplemented("@Sort", "Prio: HIGH"), // parser
					new NotImplemented("@Soundex", "Prio: HIGH"), //
					new NotImplemented("@Sqrt", "Prio: HIGH"), //					Arithmetic
					new NotImplemented("@StatusBar", "Prio: LO"), //
					new NotImplemented("@Subset", "Prio: HIGH"), //
					new NotImplemented("@Success", "Prio: HIGH"), //
					new NotImplemented("@Sum", "Prio: HIGH"), //					Arithmetic
					new NotImplemented("@Tan", "Prio: HIGH"), //					Arithmetic
					new NotImplemented("@TemplateVersion", "Prio: MID"), //
					new NotImplemented("@Text", "Prio: HIGH"), //
					new NotImplemented("@TextToNumber", "Prio: HIGH"), //
					new NotImplemented("@TextToTime", "Prio: HIGH"), //
					new NotImplemented("@ThisName", "Prio: MID"), //
					new NotImplemented("@ThisValue", "Prio: MID"), //
					new NotImplemented("@Time", "Prio: HIGH"), //
					new NotImplemented("@TimeMerge", "Prio: HIGH"), //
					new NotImplemented("@TimeToTextInZone", "Prio: HIGH"), //
					new NotImplemented("@TimeZoneToText", "Prio: HIGH"), //
					new NotImplemented("@Today", "Prio: HIGH"), //
					new NotImplemented("@Tomorrow", "Prio: HIGH"), //
					new NotImplemented("@ToNumber", "Prio: HIGH"), //
					new NotImplemented("@ToTime", "Prio: HIGH"), //
					// new NotImplemented("@Transform", "Prio: LO"), // parser
					new NotImplemented("@Trim", "Prio: HIGH"), //
					new NotImplemented("@True", "Prio: HIGH"), //
					new NotImplemented("@Unavailable", "Prio: HIGH"), //
					new NotImplemented("@UndeleteDocument", "Prio: LO"), //
					new NotImplemented("@Unique", "Prio: HIGH"), //
					new NotImplemented("@UpdateFormulaContext", "Prio: LO"), //
					new NotImplemented("@UpperCase", "Prio: HIGH"), //
					new NotImplemented("@URLDecode", "Prio: HIGH"), //
					new NotImplemented("@URLEncode", "Prio: HIGH"), //
					new NotImplemented("@URLGetHeader", "Prio: HIGH"), //
					new NotImplemented("@URLHistory", "Prio: HIGH"), //
					new NotImplemented("@URLOpen", "Prio: HIGH"), //
					new NotImplemented("@URLQueryString", "Prio: HIGH"), //
					new NotImplemented("@UserAccess", "Prio: HIGH"), //
					new NotImplemented("@UserName", "Prio: HIGH"), //
					new NotImplemented("@UserNameLanguage", "Prio: HIGH"), //
					new NotImplemented("@UserNamesList", "Prio: HIGH"), //
					new NotImplemented("@UserPrivileges", "Prio: HIGH"), //
					new NotImplemented("@UserRoles", "Prio: HIGH"), //
					// new NotImplemented("@V2If", "Prio: HIGH"), // parser
					new NotImplemented("@V3UserName", "Prio: MID"), //
					new NotImplemented("@V4UserAccess", "Prio: MID"), //
					new NotImplemented("@ValidateInternetAddress", "Prio: MID"), //
					new NotImplemented("@VerifyPassword", "Prio: HIGH"), //
					new NotImplemented("@Version", "Prio: HIGH"), //
					new NotImplemented("@ViewShowThisUnread", "Prio: LO"), //
					new NotImplemented("@ViewTitle", "Prio: LO"), //
					new NotImplemented("@WebDBName", "Prio: MID"), //
					new NotImplemented("@Weekday", "Prio: HIGH"), //
					// new NotImplemented("@While", "Prio: LO"), // parser
					new NotImplemented("@Wide", "Prio: HIGH"), //
					new NotImplemented("@Word", "Prio: HIGH"), //
					new NotImplemented("@Year", "Prio: HIGH"), //
					new NotImplemented("@Yes", "Prio: HIGH"), //
					new NotImplemented("@Yesterday", "Prio: HIGH"), //
					new NotImplemented("@Zone", "Prio: HIGH") //
			// 
			);
		}
	}

	private String comment;

	private NotImplemented(final String image) {
		this(image, null);
	}

	/**
	 * The constructor. Operators shoud be constructed via Operator.Factory
	 * 
	 * @param operation
	 * @param image
	 */
	private NotImplemented(final String image, final String comment) {
		super(image);
		this.comment = comment;
	}

	/**
	 * Evaluates the operator
	 */
	public ValueHolder evaluate(final FormulaContext ctx, final ValueHolder[] params) {
		throw new NotImplementedException("Function '" + getImage() + "' is not implemented");
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		if (comment == null) {
			return super.toString();
		}
		return super.toString() + " //" + comment;
	}

	public boolean checkParamCount(final int i) {
		return true;
	}

}
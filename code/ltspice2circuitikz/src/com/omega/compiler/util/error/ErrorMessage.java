package com.omega.compiler.util.error;

import org.antlr.runtime.Token;

public class ErrorMessage {
	public static String getErrorMessageFromCode(String errMsg, Error code, Token tk) {

		switch (code) {
		case VERSION_ERROR:
			errMsg += "Expected version number '4' but found version number equal to '" + tk.getText() + "'.";
			break;
		case WINDOWOPTION_ERROR:
			errMsg += "Windows Option '" + tk.getText() + "' is not valid.";
			break;
		case IOPINATTR_ERROR:
			errMsg += "IO Pin Attribute '" + tk.getText() + "' is not valid.";
			break;
		case SYMBOLTYPE_ERROR:
			errMsg += "Symbol Type '" + tk.getText() + "' is not valid.";
			break;
		case ROTATIONTYPE_ERROR:
			errMsg += "Rotation Type '" + tk.getText() + "' is not valid.";
			break;
		case MIRRORTYPE_ERROR:
			errMsg += "Mirror Type '" + tk.getText() + "' is not valid.";
			break;
		case ROTMIRR_ERROR:
			errMsg += "Rotation/Mirror Type '" + tk.getText() + "' is not valid.";
			break;
		case SYMATTRTYPE_ERROR:
			errMsg += "SYMATTR Type '" + tk.getText() + "' is not valid.";
			break;
		case DESCRIPTION_ERROR:
			errMsg += "Description Type '" + tk.getText() + "' is not valid.";
			break;
		case DESCRIPTION_NOT_ALLOWED:
			errMsg += "Description Type not allowed for symbol '" + tk.getText() + "'.";
			break;
		case DESCRIPTION_POLARIZED_ERROR:
			errMsg += "Description Type '" + tk.getText() + "' is not valid: expected Polarized Capacitor.";
			break;
		case DESCRIPTION_POLARIZED_NOCAPACITOR_ERROR:
			errMsg += "Description Type of '" + tk.getText() + "' is not valid: expected also Capacitor.";
			break;
		case TYPE_ERROR:
			errMsg += "Type value '" + tk.getText() + "' is not valid.";
			break;
		case SPICELINEVALUE_ERROR:
			errMsg += "SpiceLine value '" + tk.getText() + "' is not valid.";
			break;
		case SYMBOLTYPENULL_ERROR:
			errMsg += "The symbol attribute '" + tk.getText() + "' has no symbol reference.";
			break;
		case MISS_TYPEATTR_ERROR:
			errMsg += "Missing type attribute for previous symbol '" + tk.getText() + "'.";
			break;
		case MISS_DESCATTR_ERROR:
			errMsg += "Missing desc attribute for previous symbol '" + tk.getText() + "'.";
			break;
		case SYMBOLTYPE_TO_IMPLEMENT:
			errMsg += "Symbol Type '" + tk.getText() + "' has not been implemented yet.";
			break;
		default:
			errMsg += "Message error not defined, please contact support.";

		}

		return errMsg;
	}
}

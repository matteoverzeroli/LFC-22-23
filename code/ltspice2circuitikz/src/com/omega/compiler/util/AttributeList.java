package com.omega.compiler.util;

import java.util.Arrays;
import java.util.List;

/**
 * 
 * Contains lists of permitted attribute for windows options, IO pin, mirror and
 * rotation type, symbol attribute, description attribute and attribute of
 * capacitors, resistors, inductances and parasitic effects
 *
 */
public class AttributeList {
	private static List<String> listWindowsOptions = Arrays.asList("Invisibile", "Center", "Left", "Right", "Top",
			"Bottom", "VCenter", "VLeft", "VRight", "VTop", "VBottom");
	private static List<String> listIOPinAttr = Arrays.asList("In", "Out", "BiDir");
	private static List<String> listSymbolType = Arrays.asList("res", "res2", "cap", "ind", "ind2", "diode", "schottky",
			"zener",  "LED",  "voltage", "polcap", "varactor");
	private static List<String> listSymbolToImplement = Arrays.asList("TVSdiode", "pnp", "pnp2", "pnp4", "npn", 
			"npn2", "npn3", "npn4","current", "nmos", "nmos4", "pmos");
	private static List<String> listMirrorType = Arrays.asList("M0", "M90", "M180", "M270");
	private static List<String> listRotType = Arrays.asList("R0", "R90", "R180", "R270");
	private static List<String> listSymAttr = Arrays.asList("InstName", "Description", "Type", "Value", "SpiceLine");
	private static List<String> listDescAttr = Arrays.asList("Diode", "Capacitor", "Polarized");
	private static List<String> listCapAttribute = Arrays.asList("V", "Irms", "Lser", "mfg", "pn", "type");
	private static List<String> listIndAttribute = Arrays.asList("Ipk", "mfg", "pn");
	private static List<String> listParAttribute = Arrays.asList("Rser", "Rpar", "Cpar");
	private static List<String> listRAttribute = Arrays.asList("tol", "pwr");

	public static List<String> getListWindowsOptions() {
		return listWindowsOptions;
	}

	public static void setListWindowsOptions(List<String> listWindowsOptions) {
		AttributeList.listWindowsOptions = listWindowsOptions;
	}

	public static List<String> getListIOPinAttr() {
		return listIOPinAttr;
	}

	public static void setListIOPinAttr(List<String> listIOPinAttr) {
		AttributeList.listIOPinAttr = listIOPinAttr;
	}

	public static List<String> getListSymbolType() {
		return listSymbolType;
	}

	public static void setListSymbolType(List<String> listSymbolType) {
		AttributeList.listSymbolType = listSymbolType;
	}

	public static List<String> getListMirrorType() {
		return listMirrorType;
	}

	public static void setListMirrorType(List<String> listMirrorType) {
		AttributeList.listMirrorType = listMirrorType;
	}

	public static List<String> getListRotType() {
		return listRotType;
	}

	public static void setListRotType(List<String> listRotType) {
		AttributeList.listRotType = listRotType;
	}

	public static List<String> getListSymAttr() {
		return listSymAttr;
	}

	public static void setListSymAttr(List<String> listSymAttr) {
		AttributeList.listSymAttr = listSymAttr;
	}

	public static List<String> getListDescAttr() {
		return listDescAttr;
	}

	public static void setListDescAttr(List<String> listDescAttr) {
		AttributeList.listDescAttr = listDescAttr;
	}

	public static List<String> getListCapAttribute() {
		return listCapAttribute;
	}

	public static void setListCapAttribute(List<String> listCapAttribute) {
		AttributeList.listCapAttribute = listCapAttribute;
	}

	public static List<String> getListIndAttribute() {
		return listIndAttribute;
	}

	public static void setListIndAttribute(List<String> listIndAttribute) {
		AttributeList.listIndAttribute = listIndAttribute;
	}

	public static List<String> getListParAttribute() {
		return listParAttribute;
	}

	public static void setListParAttribute(List<String> listParAttribute) {
		AttributeList.listParAttribute = listParAttribute;
	}

	public static List<String> getListRAttribute() {
		return listRAttribute;
	}

	public static void setListRAttribute(List<String> listRAttribute) {
		AttributeList.listRAttribute = listRAttribute;
	}
	
	public static List<String> getListSymbolToImplement() {
		return listSymbolToImplement;
	}

	public static void setListSymbolToImplement(List<String> listSymbolToImplement) {
		AttributeList.listSymbolToImplement = listSymbolToImplement;
	}
}

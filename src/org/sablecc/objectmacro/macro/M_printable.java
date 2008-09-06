/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.macro;

import java.util.LinkedList;
import java.util.List;

public class M_printable
        extends Macro {

    private final List<Macro> e_expand0 = new LinkedList<Macro>();

    public M_printable() {

    }

    public M_package newM_package(
            String p_package_name) {

        M_package v_package = new M_package(p_package_name);
        this.e_expand0.add(v_package);
        return v_package;
    }

    @Override
    public void appendTo(
            StringBuilder sb) {

        sb.append("/* This file was generated by SableCC's ObjectMacro. */");
        sb.append(System.getProperty("line.separator"));
        for (Macro v_Macro : this.e_expand0) {
            v_Macro.appendTo(sb);
        }
        sb.append(System.getProperty("line.separator"));
        sb.append("abstract class Printable {");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("  public abstract void appendTo(StringBuilder sb);");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("  public String toString() {");
        sb.append(System.getProperty("line.separator"));
        sb.append("    StringBuilder sb = new StringBuilder();");
        sb.append(System.getProperty("line.separator"));
        sb.append("    appendTo(sb);");
        sb.append(System.getProperty("line.separator"));
        sb.append("    return sb.toString();");
        sb.append(System.getProperty("line.separator"));
        sb.append("  }");
        sb.append(System.getProperty("line.separator"));
        sb.append("}");
        sb.append(System.getProperty("line.separator"));
    }

}

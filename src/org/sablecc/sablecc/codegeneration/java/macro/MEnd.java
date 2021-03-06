/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.sablecc.codegeneration.java.macro;

import java.util.*;

public class MEnd {

    private final List<Object> eDefaultPackage_SpecifiedPackage = new LinkedList<Object>();

    public MEnd() {

    }

    public MDefaultPackage newDefaultPackage(
            String pLanguageName) {

        MDefaultPackage lDefaultPackage = new MDefaultPackage(pLanguageName);
        this.eDefaultPackage_SpecifiedPackage.add(lDefaultPackage);
        return lDefaultPackage;
    }

    public MSpecifiedPackage newSpecifiedPackage(
            String pLanguageName,
            String pPackage) {

        MSpecifiedPackage lSpecifiedPackage = new MSpecifiedPackage(
                pLanguageName, pPackage);
        this.eDefaultPackage_SpecifiedPackage.add(lSpecifiedPackage);
        return lSpecifiedPackage;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(new MHeader().toString());
        if (this.eDefaultPackage_SpecifiedPackage.size() > 0) {
            sb.append(System.getProperty("line.separator"));
        }
        for (Object oDefaultPackage_SpecifiedPackage : this.eDefaultPackage_SpecifiedPackage) {
            sb.append(oDefaultPackage_SpecifiedPackage.toString());
        }
        sb.append(System.getProperty("line.separator"));
        sb.append("public class End");
        sb.append(System.getProperty("line.separator"));
        sb.append("    extends Token {");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("  public End(int line, int pos) {");
        sb.append(System.getProperty("line.separator"));
        sb.append("    super(\"\", line, pos);");
        sb.append(System.getProperty("line.separator"));
        sb.append("  }");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("  @Override");
        sb.append(System.getProperty("line.separator"));
        sb.append("  public Type getType() {");
        sb.append(System.getProperty("line.separator"));
        sb.append("    return Type.TEnd;");
        sb.append(System.getProperty("line.separator"));
        sb.append("  }");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("  @Override");
        sb.append(System.getProperty("line.separator"));
        sb.append("  InternalType getInternalType() {");
        sb.append(System.getProperty("line.separator"));
        sb.append("    return InternalType.TEnd;");
        sb.append(System.getProperty("line.separator"));
        sb.append("  }");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("  @Override");
        sb.append(System.getProperty("line.separator"));
        sb.append("  public void apply(Walker walker) {");
        sb.append(System.getProperty("line.separator"));
        sb.append("    walker.defaultIn(this);");
        sb.append(System.getProperty("line.separator"));
        sb.append("    walker.defaultCase(this);");
        sb.append(System.getProperty("line.separator"));
        sb.append("    walker.defaultOut(this);");
        sb.append(System.getProperty("line.separator"));
        sb.append("  }");
        sb.append(System.getProperty("line.separator"));
        sb.append("}");
        sb.append(System.getProperty("line.separator"));
        return sb.toString();
    }

}

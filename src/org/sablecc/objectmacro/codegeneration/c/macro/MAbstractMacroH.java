/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.codegeneration.c.macro;

public class MAbstractMacroH {

    public MAbstractMacroH() {

    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(new MHeader().toString());
        sb.append(System.getProperty("line.separator"));
        sb.append("#ifndef MAbstractMacro_H");
        sb.append(System.getProperty("line.separator"));
        sb.append("#define MAbstractMacro_H");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("struct MAbstractMacro {");
        sb.append(System.getProperty("line.separator"));
        sb.append("  char* (*toString)(void*);");
        sb.append(System.getProperty("line.separator"));
        sb.append("  void (*free)(void*);");
        sb.append(System.getProperty("line.separator"));
        sb.append("};");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("#endif");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        return sb.toString();
    }

}

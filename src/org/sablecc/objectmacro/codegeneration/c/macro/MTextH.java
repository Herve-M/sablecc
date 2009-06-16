/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.codegeneration.c.macro;

import java.util.LinkedList;
import java.util.List;

public class MTextH {

    private final MFile mFile;

    private final List<Object> eInclude = new LinkedList<Object>();

    private final List<Object> eParamField_SelfRefH_AncestorField = new LinkedList<Object>();

    private final List<Object> eParamParam_AncestorParam = new LinkedList<Object>();

    private final List<Object> eParamPrototype = new LinkedList<Object>();

    private final List<Object> eParamRefPrototype = new LinkedList<Object>();

    MTextH(
            MFile mFile) {

        if (mFile == null) {
            throw new NullPointerException();
        }
        this.mFile = mFile;
    }

    public MInclude newInclude(
            String pPname) {

        MInclude lInclude = new MInclude(pPname);
        this.eInclude.add(lInclude);
        return lInclude;
    }

    public MParamField newParamField(
            String pPname) {

        MParamField lParamField = new MParamField(pPname);
        this.eParamField_SelfRefH_AncestorField.add(lParamField);
        return lParamField;
    }

    public MSelfRefH newSelfRefH() {

        MSelfRefH lSelfRefH = new MSelfRefH(this.mFile);
        this.eParamField_SelfRefH_AncestorField.add(lSelfRefH);
        return lSelfRefH;
    }

    public MAncestorField newAncestorField(
            String pPname) {

        MAncestorField lAncestorField = new MAncestorField(pPname);
        this.eParamField_SelfRefH_AncestorField.add(lAncestorField);
        return lAncestorField;
    }

    public MParamParam newParamParam(
            String pPname) {

        MParamParam lParamParam = new MParamParam(pPname);
        this.eParamParam_AncestorParam.add(lParamParam);
        return lParamParam;
    }

    public MAncestorParam newAncestorParam(
            String pPname) {

        MAncestorParam lAncestorParam = new MAncestorParam(pPname);
        this.eParamParam_AncestorParam.add(lAncestorParam);
        return lAncestorParam;
    }

    public MParamPrototype newParamPrototype(
            String pPname) {

        MParamPrototype lParamPrototype = new MParamPrototype(pPname,
                this.mFile);
        this.eParamPrototype.add(lParamPrototype);
        return lParamPrototype;
    }

    public MParamRefPrototype newParamRefPrototype(
            String pPname) {

        MParamRefPrototype lParamRefPrototype = new MParamRefPrototype(pPname,
                this.mFile);
        this.eParamRefPrototype.add(lParamRefPrototype);
        return lParamRefPrototype;
    }

    private String rName() {

        return this.mFile.pName();
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(new MHeader().toString());
        sb.append(System.getProperty("line.separator"));
        sb.append("#ifndef M");
        sb.append(rName());
        sb.append("_H");
        sb.append(System.getProperty("line.separator"));
        sb.append("#define M");
        sb.append(rName());
        sb.append("_H");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("#include <stdlib.h>");
        sb.append(System.getProperty("line.separator"));
        sb.append("#include <string.h>");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("#include \"MList.h\"");
        sb.append(System.getProperty("line.separator"));
        sb.append("#include \"MAbstractMacro.h\"");
        sb.append(System.getProperty("line.separator"));
        for (Object oInclude : this.eInclude) {
            sb.append(oInclude.toString());
        }
        sb.append(System.getProperty("line.separator"));
        sb.append("typedef struct M");
        sb.append(rName());
        sb.append(" {");
        sb.append(System.getProperty("line.separator"));
        sb.append("  char* (*toString)(void*);");
        sb.append(System.getProperty("line.separator"));
        sb.append("  void (*free)(void*);");
        sb.append(System.getProperty("line.separator"));
        for (Object oParamField_SelfRefH_AncestorField : this.eParamField_SelfRefH_AncestorField) {
            sb.append(oParamField_SelfRefH_AncestorField.toString());
        }
        sb.append("}M");
        sb.append(rName());
        sb.append(";");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("M");
        sb.append(rName());
        sb.append("* M");
        sb.append(rName());
        sb.append("_init(");
        {
            boolean first = true;
            for (Object oParamParam_AncestorParam : this.eParamParam_AncestorParam) {
                if (first) {
                    first = false;
                }
                else {
                    sb.append(", ");
                }
                sb.append(oParamParam_AncestorParam.toString());
            }
        }
        sb.append(");");
        sb.append(System.getProperty("line.separator"));
        sb.append("void M");
        sb.append(rName());
        sb.append("_free(M");
        sb.append(rName());
        sb.append("* m");
        sb.append(rName());
        sb.append(");");
        sb.append(System.getProperty("line.separator"));
        {
            boolean first = true;
            for (Object oParamPrototype : this.eParamPrototype) {
                if (first) {
                    first = false;
                }
                else {
                    sb.append(System.getProperty("line.separator"));
                }
                sb.append(oParamPrototype.toString());
            }
        }
        {
            boolean first = true;
            for (Object oParamRefPrototype : this.eParamRefPrototype) {
                if (first) {
                    first = false;
                }
                else {
                    sb.append(System.getProperty("line.separator"));
                }
                sb.append(oParamRefPrototype.toString());
            }
        }
        sb.append("char* M");
        sb.append(rName());
        sb.append("_toString(M");
        sb.append(rName());
        sb.append("* m");
        sb.append(rName());
        sb.append(");");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("#endif");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        return sb.toString();
    }

}

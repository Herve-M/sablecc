/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.codegeneration.c.macro;

import java.util.LinkedList;
import java.util.List;

public class MBeforeOne {

    private final MFile mFile;

    private final MExpandInsertPart mExpandInsertPart;

    private final List<Object> eTextInsert = new LinkedList<Object>();

    private final List<Object> eInlineText_ParamInsert_TextInsertStr = new LinkedList<Object>();

    private final List<Object> eTextInsertDest = new LinkedList<Object>();

    MBeforeOne(
            MFile mFile,
            MExpandInsertPart mExpandInsertPart) {

        if (mFile == null) {
            throw new NullPointerException();
        }
        this.mFile = mFile;
        if (mExpandInsertPart == null) {
            throw new NullPointerException();
        }
        this.mExpandInsertPart = mExpandInsertPart;
    }

    public MTextInsert newTextInsert(
            String pSname) {

        MTextInsert lTextInsert = new MTextInsert(pSname);
        this.eTextInsert.add(lTextInsert);
        return lTextInsert;
    }

    public MInlineText newInlineText() {

        MInlineText lInlineText = new MInlineText();
        this.eInlineText_ParamInsert_TextInsertStr.add(lInlineText);
        return lInlineText;
    }

    public MParamInsert newParamInsert(
            String pPname) {

        MParamInsert lParamInsert = new MParamInsert(pPname);
        this.eInlineText_ParamInsert_TextInsertStr.add(lParamInsert);
        return lParamInsert;
    }

    public MTextInsertStr newTextInsertStr(
            String pSname) {

        MTextInsertStr lTextInsertStr = new MTextInsertStr(pSname);
        this.eInlineText_ParamInsert_TextInsertStr.add(lTextInsertStr);
        return lTextInsertStr;
    }

    public MTextInsertDest newTextInsertDest(
            String pSname) {

        MTextInsertDest lTextInsertDest = new MTextInsertDest(pSname);
        this.eTextInsertDest.add(lTextInsertDest);
        return lTextInsertDest;
    }

    private String rName() {

        return this.mFile.pName();
    }

    private String rPname() {

        return this.mExpandInsertPart.pPname();
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("  if(m");
        sb.append(rName());
        sb.append("->_e");
        sb.append(rPname());
        sb.append("_->_size_ == 1) {");
        sb.append(System.getProperty("line.separator"));
        sb.append("  ");
        for (Object oTextInsert : this.eTextInsert) {
            sb.append(oTextInsert.toString());
        }
        sb.append("    size += MList_pushback(lsb, strdup(");
        if (this.eInlineText_ParamInsert_TextInsertStr.size() == 0) {
            sb.append("\"\"");
        }
        for (Object oInlineText_ParamInsert_TextInsertStr : this.eInlineText_ParamInsert_TextInsertStr) {
            sb.append(oInlineText_ParamInsert_TextInsertStr.toString());
        }
        sb.append("));");
        sb.append(System.getProperty("line.separator"));
        sb.append("  ");
        for (Object oTextInsertDest : this.eTextInsertDest) {
            sb.append(oTextInsertDest.toString());
        }
        sb.append("  }");
        sb.append(System.getProperty("line.separator"));
        return sb.toString();
    }

}

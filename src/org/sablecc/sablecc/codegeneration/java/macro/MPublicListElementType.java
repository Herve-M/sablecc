/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.sablecc.codegeneration.java.macro;

public class MPublicListElementType {

    private final String pElementType;

    private final MPublicListElementType mPublicListElementType = this;

    MPublicListElementType(
            String pElementType) {

        if (pElementType == null) {
            throw new NullPointerException();
        }
        this.pElementType = pElementType;
    }

    String pElementType() {

        return this.pElementType;
    }

    private String rElementType() {

        return this.mPublicListElementType.pElementType();
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("NodeList<N");
        sb.append(rElementType());
        sb.append(">");
        return sb.toString();
    }

}

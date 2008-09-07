/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.macro;

import java.util.LinkedList;
import java.util.List;

public class M_expand_append
        extends Macro {

    // ---- constructor ----

    M_expand_append(
            Macro parent,
            String p_expand_name) {

        this.parent = parent;
        this.p_expand_name = p_expand_name;
    }

    // ---- parent ----

    private final Macro parent;

    @Override
    Macro get_parent() {

        return this.parent;
    }

    // ---- parameters ----

    private final String p_expand_name;

    String get_local_p_expand_name() {

        return this.p_expand_name;
    }

    // ---- expands ----

    private final List<Macro> e_expand_23 = new LinkedList<Macro>();

    private final List<Macro> e_expand_24 = new LinkedList<Macro>();

    private final List<Macro> e_expand_25 = new LinkedList<Macro>();

    private final List<Macro> e_expand_26 = new LinkedList<Macro>();

    private final List<Macro> e_expand_27 = new LinkedList<Macro>();

    private final List<Macro> e_expand_28 = new LinkedList<Macro>();

    private final List<Macro> e_expand_29 = new LinkedList<Macro>();

    private final List<Macro> e_expand_30 = new LinkedList<Macro>();

    // ---- parameter accessors ----

    private String cached_p_expand_name;

    private String get_p_expand_name() {

        String result = this.cached_p_expand_name;

        if (result == null) {
            Macro current = this;

            while (!(current instanceof M_expand_append)) {
                current = current.get_parent();
            }

            result = ((M_expand_append) current).get_local_p_expand_name();
            this.cached_p_expand_name = result;
        }

        return result;
    }

    // ---- macro creators ----

    public M_expand_append_none_string_part new_expand_append_none_string_part(
            String p_none_string_part) {

        M_expand_append_none_string_part result = new M_expand_append_none_string_part(
                this, p_none_string_part);
        this.e_expand_23.add(result);
        return result;
    }

    public M_expand_append_none_text_block new_expand_append_none_text_block(
            String p_text_block_name) {

        M_expand_append_none_text_block result = new M_expand_append_none_text_block(
                this, p_text_block_name);
        this.e_expand_24.add(result);
        return result;
    }

    public M_expand_append_before_first_string_part new_expand_append_before_first_string_part(
            String p_before_first_string_part) {

        M_expand_append_before_first_string_part result = new M_expand_append_before_first_string_part(
                this, p_before_first_string_part);
        this.e_expand_25.add(result);
        return result;
    }

    public M_expand_append_before_first_text_block new_expand_append_before_first_text_block(
            String p_text_block_name) {

        M_expand_append_before_first_text_block result = new M_expand_append_before_first_text_block(
                this, p_text_block_name);
        this.e_expand_26.add(result);
        return result;
    }

    public M_expand_append_separator_string_part new_expand_append_separator_string_part(
            String p_separator_string_part) {

        M_expand_append_separator_string_part result = new M_expand_append_separator_string_part(
                this, p_separator_string_part);
        this.e_expand_27.add(result);
        return result;
    }

    public M_expand_append_separator_text_block new_expand_append_separator_text_block(
            String p_text_block_name) {

        M_expand_append_separator_text_block result = new M_expand_append_separator_text_block(
                this, p_text_block_name);
        this.e_expand_28.add(result);
        return result;
    }

    public M_expand_append_after_last_string_part new_expand_append_after_last_string_part(
            String p_after_last_string_part) {

        M_expand_append_after_last_string_part result = new M_expand_append_after_last_string_part(
                this, p_after_last_string_part);
        this.e_expand_29.add(result);
        return result;
    }

    public M_expand_append_after_last_text_block new_expand_append_after_last_text_block(
            String p_text_block_name) {

        M_expand_append_after_last_text_block result = new M_expand_append_after_last_text_block(
                this, p_text_block_name);
        this.e_expand_30.add(result);
        return result;
    }

    // ---- appendTo ----

    @Override
    public void appendTo(
            StringBuilder sb) {

        sb.append("    if(e_");

        sb.append(get_p_expand_name());

        sb.append(".size() == 0) {");

        sb.append(EOL);

        if (this.e_expand_23.size() == 0) {
        }
        else {
            boolean first = true;
            for (Macro macro : this.e_expand_23) {
                if (first) {
                    first = false;
                }
                else {
                }
                macro.appendTo(sb);
            }
        }

        if (this.e_expand_24.size() == 0) {
        }
        else {
            boolean first = true;
            for (Macro macro : this.e_expand_24) {
                if (first) {
                    first = false;
                }
                else {
                }
                macro.appendTo(sb);
            }
        }

        sb.append("    }");

        sb.append(EOL);

        sb.append("    else {");

        sb.append(EOL);

        sb.append("      boolean first = true;");

        sb.append(EOL);

        sb.append("      for(Macro macro : e_");

        sb.append(get_p_expand_name());

        sb.append(") {");

        sb.append(EOL);

        sb.append("        if(first) {");

        sb.append(EOL);

        sb.append("          first = false;");

        sb.append(EOL);

        if (this.e_expand_25.size() == 0) {
        }
        else {
            boolean first = true;
            for (Macro macro : this.e_expand_25) {
                if (first) {
                    first = false;
                }
                else {
                }
                macro.appendTo(sb);
            }
        }

        if (this.e_expand_26.size() == 0) {
        }
        else {
            boolean first = true;
            for (Macro macro : this.e_expand_26) {
                if (first) {
                    first = false;
                }
                else {
                }
                macro.appendTo(sb);
            }
        }

        sb.append("        }");

        sb.append(EOL);

        sb.append("        else {");

        sb.append(EOL);

        if (this.e_expand_27.size() == 0) {
        }
        else {
            boolean first = true;
            for (Macro macro : this.e_expand_27) {
                if (first) {
                    first = false;
                }
                else {
                }
                macro.appendTo(sb);
            }
        }

        if (this.e_expand_28.size() == 0) {
        }
        else {
            boolean first = true;
            for (Macro macro : this.e_expand_28) {
                if (first) {
                    first = false;
                }
                else {
                }
                macro.appendTo(sb);
            }
        }

        sb.append("        }");

        sb.append(EOL);

        sb.append("        macro.appendTo(sb);");

        sb.append(EOL);

        sb.append("      }");

        sb.append(EOL);

        if (this.e_expand_29.size() == 0) {
        }
        else {
            boolean first = true;
            for (Macro macro : this.e_expand_29) {
                if (first) {
                    first = false;
                }
                else {
                }
                macro.appendTo(sb);
            }
        }

        if (this.e_expand_30.size() == 0) {
        }
        else {
            boolean first = true;
            for (Macro macro : this.e_expand_30) {
                if (first) {
                    first = false;
                }
                else {
                }
                macro.appendTo(sb);
            }
        }

        sb.append("    }");

        sb.append(EOL);
    }

}

package osmedile.intellij.stringmanip.styles;

import osmedile.intellij.stringmanip.AbstractStringManipAction;

public class ToHyphenCaseAction extends AbstractStringManipAction {

    public String transform(String s) {
        Style from = Style.from(s);
        if (from == Style.HYPHEN_LOWERCASE) {
            return Style.UNDERSCORE_LOWERCASE.transform(from, s);
        }
        return Style.HYPHEN_LOWERCASE.transform(from, s);
    }

}

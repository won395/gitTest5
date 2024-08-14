package test02;

import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class JTextFieldLimit extends PlainDocument {
    private int limit = 36;

    public void insertString(int offset, String str, javax.swing.text.AttributeSet attr) throws BadLocationException {
        if(str == null) return;
        if(getLength() + str.length() <= limit) {
            super.insertString(offset, str, attr);
        }
    }
}

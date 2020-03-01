package Adapter.excercise.main;

import Adapter.excercise.Doc.Doc;
import Adapter.excercise.Doc.DocImpl;
import Adapter.excercise.html.Html;
import Adapter.excercise.html.HtmlImpl;
import Adapter.excercise.txt.Txt;
import Adapter.excercise.txt.TxtImpl;

public class Main {
    public static void main(String[] args) {
        Doc doc = new DocImpl();
        Html html = new HtmlImpl();
        Txt txt = new TxtImpl();

        doc.convert();
        html.convert();
        txt.convert();
    }
}

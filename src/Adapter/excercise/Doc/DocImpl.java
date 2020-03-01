package Adapter.excercise.Doc;

import Adapter.excercise.Doc.Doc;

public class DocImpl implements Doc {
    @Override
    public void convert() {
        System.out.println("Przepisano z Doc na Pdf. ");
    }
}

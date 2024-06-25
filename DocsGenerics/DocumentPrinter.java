package DocsGenerics;

public class DocumentPrinter<Doc extends Document> {
    

    Doc document;

    public DocumentPrinter(Doc document) {
        this.document = document;
    }

    public void print() {
        System.out.println(this.document);
    }
   
}

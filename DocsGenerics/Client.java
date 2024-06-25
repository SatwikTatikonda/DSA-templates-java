package DocsGenerics;

public class Client {

    public static void main(String[] args) {
        
        PDF pdf = new PDF("i am pdf");
        CSV csv = new CSV("i am CSV");
        SpecialPdf sPdf=new SpecialPdf("i am special PDF");
        
        DocumentPrinter<PDF>  pdfObj=new DocumentPrinter<>(pdf);
        pdfObj.print();
        
        DocumentPrinter<CSV> csvObj = new DocumentPrinter<>(csv);
        csvObj.print();

        DocumentPrinter<SpecialPdf> spObj = new DocumentPrinter<>(sPdf);
        spObj.print();



    }
    
}

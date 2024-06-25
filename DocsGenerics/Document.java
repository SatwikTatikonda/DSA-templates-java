package DocsGenerics;

public abstract class Document {
    
    String content;

    public Document(String content) {
        this.content = content;
    }

    public String toString() {
        return "content " + content;
    }
}

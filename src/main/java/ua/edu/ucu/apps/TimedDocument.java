package ua.edu.ucu.apps;

import lombok.Getter;

@Getter
public class TimedDocument implements Document{
    private Document document;
    private String gcsPath;

    public TimedDocument(Document document) {
        this.document = document;
        this.gcsPath = document.getGcsPath();
    }

    public String parse() {
        double startTime = System.currentTimeMillis();
        if (!(document instanceof CachedDocument)) {
            document = new CachedDocument(document);

        }
        String documentText = document.parse();
        double finishTime = System.currentTimeMillis();
        System.out.println("Time taken to process file: "
            + (finishTime - startTime) / 1000
            + " seconds");
        return documentText;

    }
}

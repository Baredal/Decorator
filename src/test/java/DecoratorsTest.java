import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.edu.ucu.apps.CachedDocument;
import ua.edu.ucu.apps.DatabaseConnection;
import ua.edu.ucu.apps.Document;
import ua.edu.ucu.apps.SmartDocument;
import ua.edu.ucu.apps.TimedDocument;

import org.junit.jupiter.api.Assertions;

public class DecoratorsTest {
    private String gcsPath = "gs://oop_course_photo_read/1232.jpg";



    @Test
    public void testParse() {
        // cachedDocument reads via google OCR and write down to database and if present returns from database
        Document cachedDocument = new CachedDocument(new TimedDocument(new SmartDocument(gcsPath))); 
        // smartDocument always reads via google OCR
        Document smarDocument = new SmartDocument(gcsPath);
        String resCache = cachedDocument.parse();
        String resSmart = smarDocument.parse();
        Assertions.assertEquals(resCache, resSmart);
    }
    
}

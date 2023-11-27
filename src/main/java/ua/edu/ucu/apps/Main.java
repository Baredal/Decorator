package ua.edu.ucu.apps;

public class Main {
    public static void main(String[] args) {
        Document doc = new SmartDocument("gs://oop_course_photo_read/test_pivo.jpg");

        Document timedDoc = new TimedDocument(doc);
        Document cache = new CachedDocument(timedDoc);
        System.out.println(cache.parse());

    }
}                                                                                                                                                                           

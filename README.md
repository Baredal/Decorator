### Decorator <br>
Зчитує зображення на гугл клауд через google vision OCR та записує до бази даних <br>
SmartDocument створює запит до OCR <br>
CachedDocument викликає TimedDocument, якщо спочатку він був TimedDocument і перевіряє чи є текст в базі даних і повертає його, якщо ні - викликає SmartDocument і записує текст до бази даних <br>
TimedDocument створяє екземляр CachedDocument (якщо він таким не є) і робить заміри часу <br>
Це потрібно для того, щоб коректно працювало викликання декораторів в обох напрямках CachedDocument(TimedDocument) <br>
і TimedDocument(CachedDocument) 

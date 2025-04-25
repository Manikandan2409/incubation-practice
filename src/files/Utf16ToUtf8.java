package files;
import java.io.*;

public class Utf16ToUtf8 {
    public static void main(String[] args) throws IOException {
        String data = " हिंदी या आधुनिक मानक हिंदी विश्व की एक प्रमुख भाषा है और भारत की एक राजभाषा है। केंद्रीय स्तर पर भारत में सह-आधिकारिक भाषा अंग्रेजी है। आधुनिक मानक हिंदी में संस्कृत के तत्सम तथा तद्भव शब्दों का प्रयोग अधिक है और अरबी–फारसी ..."; // UTF-16 string

        // Create OutputStreamWriter with UTF-8 encoding
        try (OutputStreamWriter writer = new OutputStreamWriter(
                new FileOutputStream("output.txt"), "UTF-8")) {
            writer.write(data);
        }

        System.out.println("File written with UTF-8 encoding.");


        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(new FileInputStream("output.txt"), "UTF-8"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Read: " + line); // decoded back to UTF-16 in memory
            }
        }
    }
}

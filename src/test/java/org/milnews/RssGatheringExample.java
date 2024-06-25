package org.milnews;

import org.milnews.rss.Rss;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;

public class RssGatheringExample {

    public void testRss() throws JAXBException {
        String exampleRssContents = readFile("/samples/defnews.rss.xml");

        JAXBContext context = JAXBContext.newInstance(Rss.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        Rss r = (Rss) unmarshaller.unmarshal(new StringReader(exampleRssContents));
        System.out.println(r.toString());

    }

    public static void main(String[] args) {
try {
    new RssGatheringExample().testRss();
}catch (Exception e){
    throw new RuntimeException(e);
}

    }

    private String readFile(String rawFileName) {
        String fileName = getClass().getResource(rawFileName).getFile();
        String result = "";
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                result += line;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return result;
    }

}

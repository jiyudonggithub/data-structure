package day0510.entity;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.List;

@SuppressWarnings("all")
public class Demo01 {
    public static void main(String[] args) {
        try {
            File file = new File("src/com/oak/entity/File.xml");
            SAXReader reader = new SAXReader();
            Document read = reader.read(file);
            Element element = read.getRootElement();
            List<Element> elements = element.elements();
            for (Element element2 : elements) {
                List<Element> elements2 = element2.elements();
                for (Element element3 : elements2) {
                    System.out.println(element3.getName());
                    System.out.println(element3.getText());
                    System.out.println("++++++++++++");
                }
            }

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }


}

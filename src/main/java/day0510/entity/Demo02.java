package day0510.entity;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.List;

@SuppressWarnings("all")
public class Demo02 {
    public static void main(String[] args) {
        try {
            File file = new File("src/com/oak/entity/book.xml");
            SAXReader reader = new SAXReader();
            Document read = reader.read(file);
            Element element = read.getRootElement();
            Element element2 = element.element("author");
            Attribute attribute = element2.attribute(1);
            List<Attribute> attributes = element2.attributes();
            for (Attribute attribute2 : attributes) {
                System.out.println(attribute2.getName());
                System.out.println(attribute2.getValue());
            }
            System.out.println(element2.getName());
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 */

import java.io.InputStream;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class DOM {

    public static void main(String[] args) throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = factory.newDocumentBuilder();
        InputStream xmlStream = DOM.class.getResourceAsStream("users.xml");
        Document doc = docBuilder.parse(xmlStream);
        NodeList list = doc.getElementsByTagName("*");
                    System.out.println("ID\tName\tPassword\tTemplate ID");

        for (int i = 0; i < list.getLength(); i++) {
            Element element = (Element) list.item(i);
            String nodeName = element.getNodeName();

             if (nodeName.equals("id")) {
                System.out.print( element.getChildNodes().item(0).getNodeValue()+"\t");

            } else if (nodeName.equals("name")) {
                System.out.print(element.getChildNodes().item(0).getNodeValue()+"\t");

            }else if (nodeName.equals("pass")) {
                System.out.print(element.getChildNodes().item(0).getNodeValue()+"\t\t");

            }else if (nodeName.equals("templateid")) {
                System.out.println(element.getChildNodes().item(0).getNodeValue()+"\t");

            }
        }

    }
}


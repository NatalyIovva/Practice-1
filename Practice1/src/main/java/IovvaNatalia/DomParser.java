package IovvaNatalia;

import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

public class DomParser {
    public static void main(String[] args) {

        try {
            File inputFile = new File("company.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("department");
            System.out.println("----------------------------");

            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                System.out.println("\nCurrent Element :" + nNode.getNodeName());

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    System.out.println("Department Name : "
                            + eElement.getAttribute("name"));
                    System.out.println("Department Id : "
                            + eElement.getAttribute("depId"));
                    System.out.println("----------------------------");
                    NodeList n1List = eElement.getElementsByTagName("employee");
                    for (int count = 0; count < n1List.getLength(); count++) {
                        Node n1Node = n1List.item(count);
                        System.out.println("\nCurrent Element :" + n1Node.getNodeName());
                        if (n1Node.getNodeType() == Node.ELEMENT_NODE) {
                            Element e1Element = (Element) n1Node;
                            System.out.println("Employee Id : "
                                    + e1Element.getAttribute("empId"));
                            System.out.println("Last Name : "
                                    + eElement
                                    .getElementsByTagName("lastName")
                                    .item(count)
                                    .getTextContent());
                            System.out.println("First Name : "
                                    + eElement
                                    .getElementsByTagName("firstName")
                                    .item(count)
                                    .getTextContent());
                            System.out.println("Birth Date : "
                                    + eElement
                                    .getElementsByTagName("birthDate")
                                    .item(count)
                                    .getTextContent());
                            System.out.println("Position : "
                                    + eElement
                                    .getElementsByTagName("position")
                                    .item(count)
                                    .getTextContent());
                            NodeList n2List = e1Element.getElementsByTagName("skills");
                            for (int count1 = 0; count1 < n2List.getLength(); count1++) {
                                Node n2Node = n2List.item(count1);
                                if (n2Node.getNodeType() == Node.ELEMENT_NODE) {
                                    Element e2Element = (Element) n2Node;
                                    NodeList n3List = e2Element.getElementsByTagName("skill");
                                    for (int count2 = 0; count2 < n3List.getLength(); count2++) {
                                        System.out.println("Skill : "
                                                + e2Element
                                                .getElementsByTagName("skill")
                                                .item(count2)
                                                .getTextContent());

                                    }
                                }
                            }

                            System.out.println("Manager id : "
                                    + eElement
                                    .getElementsByTagName("managerId")
                                    .item(count)
                                    .getTextContent());
                        }
                    }

                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

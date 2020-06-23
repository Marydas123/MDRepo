package test;

import java.io.File;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.transform.stream.StreamSource;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

public class XmlStringParse {

	/**
	 * @param agrgs
	 */
	public static void main(String agrgs[]) {
		String xml = "<message>HELLO!</message>";
		/*
		 * DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		 * DocumentBuilder db = null; try { db = dbf.newDocumentBuilder(); InputSource
		 * is = new InputSource(); is.setCharacterStream(new StringReader(xml)); try {
		 * Document doc = db.parse(is); String message =
		 * doc.getDocumentElement().getTextContent(); System.out.println(message); }
		 * catch (SAXException e) { // handle SAXException } catch (IOException e) { //
		 * handle IOException } } catch (Par serConfigurationException e1) { // handle
		 * ParserConfigurationException }
		 */
		// parse();

		marshalll();

	}

	/**
	 * 
	 */
	@SuppressWarnings("null")
	private static void marshalll() {
		File file = new File("employee.xml");
		JAXBContext jaxbContext = null;
		try {
			jaxbContext = JAXBContext.newInstance(XmlStringParse.class);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Unmarshaller unmarshaller = null;
		XMLStreamReader xsr  = null;
		try {
			 XMLInputFactory xif = XMLInputFactory.newFactory();
		        xif.setProperty(XMLInputFactory.SUPPORT_DTD, false);
		        try {
					xsr = xif.createXMLStreamReader(new StreamSource("employee.xml"));
				} catch (XMLStreamException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			//unmarshaller.setProperty(javax.xml.XMLConstants.ACCESS_EXTERNAL_DTD, Boolean.TRUE);
			unmarshaller = jaxbContext.createUnmarshaller();
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Employee employee = null;
		try {
			employee = (Employee) unmarshaller.unmarshal(xsr);
			unmarshaller.setProperty(javax.xml.XMLConstants.ACCESS_EXTERNAL_DTD, Boolean.TRUE);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(employee);
	}

	private static void parse() {
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();

		DocumentBuilder builder = null;

		try {
			builder = builderFactory.newDocumentBuilder();
		} catch (ParserConfigurationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		File f = new File("D:\\employee.xml");
		try {
			Document doc = builder.parse(f);
			Node name = doc.getElementsByTagName("das").item(0).getAttributes().getNamedItem("name");
			System.out.println(name.getNodeValue());
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

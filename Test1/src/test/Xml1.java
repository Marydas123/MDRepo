package test;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.w3c.dom.Document;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

public class Xml1 {
	
	public static boolean validateWithDTDUsingDOM(String xml) 
		    throws ParserConfigurationException, IOException
		  {
		    try {
		      DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		      factory.setValidating(false);
		      factory.setNamespaceAware(true);

		      DocumentBuilder builder = factory.newDocumentBuilder();

		      builder.setErrorHandler(
		          new ErrorHandler() {
		           

					@Override
					public void error(SAXParseException arg0) throws SAXException {
						// TODO Auto-generated method stub
						System.out.println("error : " + arg0.getMessage());
						
					}

					@Override
					public void fatalError(SAXParseException arg0) throws SAXException {
						// TODO Auto-generated method stub
						System.out.println("fatal : " + arg0.getMessage());
						
					}

					@Override
					public void warning(SAXParseException arg0) throws SAXException {
						// TODO Auto-generated method stub
						System.out.println("WARNING : " + arg0.getMessage());
						
					}
		          }
		          );
		   
		      Document doc = builder.parse(new File("employee.xml"));
				DOMSource source = new DOMSource(doc);
				//now use a transformer to add the DTD element
				TransformerFactory tf = TransformerFactory.newInstance();
				Transformer transformer = null;
				try {
					transformer = tf.newTransformer();
				} catch (TransformerConfigurationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				transformer.setOutputProperty(OutputKeys.DOCTYPE_SYSTEM, "D:\\employee.dtd");
				StringWriter writer = new StringWriter();
				StreamResult result = new StreamResult(writer);
				try {
					  
					transformer.transform(source, result);
				} catch (TransformerException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				//finally parse the result. 
				//this will throw an exception if the doc is invalid
				builder.parse(new InputSource(new StringReader(writer.toString())));
		     // builder.parse(new InputSource(xml));
		      return true;
		    }
		    catch (ParserConfigurationException pce) {
		      throw pce;
		    } 
		    catch (IOException io) {
		      throw io;
		    }
		    catch (SAXException se){
		      return false;
		    }
		    
		    
		   
		  }
	//parse file into DOM
	
		  
		  // validate using SAX (DTD as defined in the XML)
	/*
	 * public static boolean validateWithDTDUsingSAX(String xml) throws
	 * ParserConfigurationException, IOException { try {
	 * 
	 * SAXParserFactory factory = SAXParserFactory.newInstance();
	 * factory.setValidating(true); factory.setNamespaceAware(true);
	 * 
	 * SAXParser parser = factory.newSAXParser();
	 * 
	 * XMLReader reader = parser.getXMLReader(); reader.setErrorHandler( new
	 * ErrorHandler() { public void warning(SAXParseException e) throws SAXException
	 * { System.out.println("WARNING : " + e.getMessage()); // do nothing }
	 * 
	 * public void error(SAXParseException e) throws SAXException {
	 * System.out.println("ERROR : " + e.getMessage()); throw e; }
	 * 
	 * public void fatalError(SAXParseException e) throws SAXException {
	 * System.out.println("FATAL : " + e.getMessage()); throw e; } } );
	 * reader.parse(new InputSource( xml )); return true; } catch
	 * (ParserConfigurationException pce) { throw pce; } catch (IOException io) {
	 * throw io; } catch (SAXException se){ return false; } }
	 */
		  public static void main (String args[]) throws Exception{ 
		    
		    System.out.println(Xml1.validateWithDTDUsingDOM("employee.xml"));
		   // System.out.println(XMLUtils.validateWithDTDUsingSAX("c:/temp/howto.xml"));
		    /*
		      output :
		               true
		               true
		    */           
		  }

}

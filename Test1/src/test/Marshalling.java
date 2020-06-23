package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.Address;
import com.Student;

public class Marshalling {

		// TODO Auto-generated method stub
		public static void main(String[] args) throws Exception {
			File f = new File("D:\\/abc.text/");
			Writer pw =new PrintWriter(f);
			((PrintWriter) pw).println("hvjdfasjdjasgd");
			((PrintWriter) pw).println("bdshasdi");
			pw.write(100);
			pw.close();
			Writer r = new FileWriter("mbhj");
		 InputStreamReader fr = new FileReader(f);
			Reader br = new BufferedReader(fr);
			String l = ((BufferedReader) br).readLine();
			while(l != null) {
				System.out.println(l);
				l = ((BufferedReader) br).readLine();
			}
			
	       
	    
	}

}

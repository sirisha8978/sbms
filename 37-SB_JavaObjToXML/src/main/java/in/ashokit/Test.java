package in.ashokit;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringWriter;

public class Test {

    public static void main(String[] args) {

    	
      Student student = new Student(1, "siri", "siri@gmail.com");
      
        // Convert Student object to XML string
        String xmlString = convertToXml(student);
       System.out.println("XML representation of student:");
       System.out.println(xmlString);
        
        // Save Student object to XML file
        saveStudentToXmlFile(student, "student.xml");
    }

	private static void saveStudentToXmlFile(Student student, String string) {
		// TODO Auto-generated method stub
		
	}

	private static String convertToXml(Student student) {
		// TODO Auto-generated method stub
		return null;
	}
    	


     }

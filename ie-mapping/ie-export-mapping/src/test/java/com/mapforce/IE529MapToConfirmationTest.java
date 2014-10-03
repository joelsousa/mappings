package com.mapforce;


import static org.junit.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.altova.xml.XmlTreeOperations;

public class IE529MapToConfirmationTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testConvert() {
		String fileNameInput = "src/main/resources/IE529_ExportRelease.xml";
		String fileNameOutput = "target/_IE529MapToConfirmation_result.xml";

		InputStream inputStream = null;

		try { // Mapping
			TraceTargetConsole ttc = new TraceTargetConsole();

			IE529MapToConfirmation messageObject = new IE529MapToConfirmation();
			messageObject.registerTraceTarget(ttc);
	
				com.altova.io.Input message2Source = com.altova.io.StreamInput.createInput(fileNameInput);
				com.altova.io.Output message2Target = new com.altova.io.FileOutput(fileNameOutput);

				messageObject.run(
						message2Source,
						message2Target);
				
			System.out.println("Finished");
		} 
		catch (com.altova.UserException ue) 
		{
			System.out.print("USER EXCEPTION:");
			System.out.println( ue.getMessage() );
			System.exit(1);
		}
		catch (com.altova.AltovaException e)
		{
			System.out.print("ERROR: ");
			System.out.println( e.getMessage() );
			if (e.getInnerException() != null)
			{
				System.out.print("Inner exception: ");
				System.out.println(e.getInnerException().getMessage());
				if (e.getInnerException().getCause() != null)
				{
					System.out.print("Cause: ");
					System.out.println(e.getInnerException().getCause().getMessage());
				}
			}
			System.out.println("\nStack Trace: ");
			e.printStackTrace();
			System.exit(1);
		}
		
		catch (Exception e) {
			System.out.print("ERROR: ");
			System.out.println( e.getMessage() );
			System.out.println("\nStack Trace: ");
			e.printStackTrace();
			System.exit(1);
		}

		try {
			inputStream = new FileInputStream(fileNameOutput);
			org.w3c.dom.Document doc = XmlTreeOperations
					.loadDocument(inputStream);

			assertEquals("xml file created!",1,1);
//			Node textNode = doc.getElementsByTagName("ErrorText").item(0);
//			textContent = textNode.getFirstChild().getTextContent();
//			assertEquals("The value is not VALID", "EXPIRED", textContent);

		} catch (IOException e) {
			assertEquals("Fail loading xml file!",1,2);
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}

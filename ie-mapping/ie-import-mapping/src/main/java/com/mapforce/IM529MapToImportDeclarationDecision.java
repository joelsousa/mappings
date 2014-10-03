/**
 * IM529MapToImportDeclarationDecision.java
 *
 * This file was generated by MapForce 2014r2sp1.
 *
 * YOU SHOULD NOT MODIFY THIS FILE, BECAUSE IT WILL BE
 * OVERWRITTEN WHEN YOU RE-RUN CODE GENERATION.
 *
 * Refer to the MapForce Documentation for further details.
 * http://www.altova.com/mapforce
 */
package com.mapforce;
import com.altova.mapforce.*;
import com.altova.types.*;
import com.altova.xml.*;
import java.util.*;

public class IM529MapToImportDeclarationDecision extends com.altova.TraceProvider 
{
	private boolean runDoesCloseAll = true;
	public void setCloseObjectsAfterRun(boolean c) {runDoesCloseAll = c;}
	public boolean getCloseObjectsAfterRun() {return runDoesCloseAll;}

	
	static class main implements IEnumerable
	{
		com.altova.mapforce.IMFNode var1_instance_IM529;
	
		public main(com.altova.mapforce.IMFNode var1_instance_IM529)
		{
			this.var1_instance_IM529 = var1_instance_IM529;
		}

		public IEnumerator enumerator() {return new Enumerator(this);}
		
		public static class Enumerator implements IEnumerator
		{
			int pos = 0;
			int state = 2;
			Object current;
			main closure;
			com.altova.mapforce.IEnumerable var2_filter_elements_qname;
			public Enumerator(main closure) 
			{
				this.closure = closure;
			}
			
			public Object current() {return current;}
			
			public int position() {return pos;}
			
			public boolean moveNext() throws Exception
			{
				while (state != 0)
				{
					switch (state) 
					{
					case 2:	if (moveNext_2()) return true; break;
 					}
				}
				return false;
			}

			private boolean moveNext_2() throws Exception {
				state = 0;				
				var2_filter_elements_qname = new com.altova.functions.Core.SequenceCache(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("ImportRelease", "http://www.ros.ie/schemas/customs/IM529/v1"), closure.var1_instance_IM529));
				current = com.altova.functions.Core.createElement(com.altova.functions.Core.createQName("ImportDeclarationDecision", ""), (new seq1_join(var2_filter_elements_qname)));
				pos++;
				return true;
			}

			
			public void close()
			{
				try
				{
				}
				catch (Exception e)
				{
				}
			}
		}
				
	}
	static class seq1_join implements IEnumerable
	{
		com.altova.mapforce.IEnumerable var1_filter_elements_qname;
	
		public seq1_join(com.altova.mapforce.IEnumerable var1_filter_elements_qname)
		{
			this.var1_filter_elements_qname = var1_filter_elements_qname;
		}

		public IEnumerator enumerator() {return new Enumerator(this);}
		
		public static class Enumerator implements IEnumerator
		{
			int pos = 0;
			int state = 1;
			Object current;
			seq1_join closure;
			public Enumerator(seq1_join closure) 
			{
				this.closure = closure;
			}
			
			public Object current() {return current;}
			
			public int position() {return pos;}
			
			public boolean moveNext() throws Exception
			{
				while (state != 0)
				{
					switch (state) 
					{
					case 1:	if (moveNext_1()) return true; break;
					case 2:	if (moveNext_2()) return true; break;
 					}
				}
				return false;
			}

			private boolean moveNext_1() throws Exception {
				state = 2;				
				current = com.altova.functions.Core.createAttribute(com.altova.functions.Core.createQName("xsi:noNamespaceSchemaLocation", "http://www.w3.org/2001/XMLSchema-instance"), com.altova.functions.Core.box("C:/Users/moredata/Desktop/KCXMapping/import/IM529MapToImportDeclarationDecision/ImportDeclarationDecision.xsd"));
				pos++;
				return true;
			}
			private boolean moveNext_2() throws Exception {
				state = 0;				
				if (!(com.altova.functions.Core.exists(closure.var1_filter_elements_qname))) {state = 0; return false; }
				current = com.altova.functions.Core.createElement(com.altova.functions.Core.createQName("GoodsDeclaration", ""), (new seq2_join(closure.var1_filter_elements_qname)));
				pos++;
				return true;
			}

			
			public void close()
			{
				try
				{
				}
				catch (Exception e)
				{
				}
			}
		}
				
	}
	static class seq2_join implements IEnumerable
	{
		com.altova.mapforce.IEnumerable var1_filter_elements_qname;
	
		public seq2_join(com.altova.mapforce.IEnumerable var1_filter_elements_qname)
		{
			this.var1_filter_elements_qname = var1_filter_elements_qname;
		}

		public IEnumerator enumerator() {return new Enumerator(this);}
		
		public static class Enumerator implements IEnumerator
		{
			int pos = 0;
			int state = 1;
			Object current;
			seq2_join closure;
			IEnumerator var2_filter_elements_qname;
			public Enumerator(seq2_join closure) 
			{
				this.closure = closure;
			}
			
			public Object current() {return current;}
			
			public int position() {return pos;}
			
			public boolean moveNext() throws Exception
			{
				while (state != 0)
				{
					switch (state) 
					{
					case 1:	if (moveNext_1()) return true; break;
					case 6:	if (moveNext_6()) return true; break;
					case 9:	if (moveNext_9()) return true; break;
					case 12:	if (moveNext_12()) return true; break;
					case 17:	if (moveNext_17()) return true; break;
					case 18:	if (moveNext_18()) return true; break;
					case 19:	if (moveNext_19()) return true; break;
 					}
				}
				return false;
			}

			private boolean moveNext_1() throws Exception {
				state = 6;				
				if (!(com.altova.functions.Core.exists(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("Ucr", "http://www.ros.ie/schemas/customs/IM529/v1"), (com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("GoodsShipment", "http://www.ros.ie/schemas/customs/IM529/v1"), (com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("Declaration", "http://www.ros.ie/schemas/customs/IM529/v1"), (com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("ImportCustomsDeclaration", "http://www.ros.ie/schemas/customs/IM529/v1"), (com.altova.mapforce.IMFNode)com.altova.functions.Core.first(closure.var1_filter_elements_qname))))))))))) {state = 6; return false; }
				if (!(com.altova.functions.Core.exists(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("TraderReferenceIdentifier", "http://www.ros.ie/schemas/customs/IM529/v1"), (com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("Ucr", "http://www.ros.ie/schemas/customs/IM529/v1"), (com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("GoodsShipment", "http://www.ros.ie/schemas/customs/IM529/v1"), (com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("Declaration", "http://www.ros.ie/schemas/customs/IM529/v1"), (com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("ImportCustomsDeclaration", "http://www.ros.ie/schemas/customs/IM529/v1"), (com.altova.mapforce.IMFNode)com.altova.functions.Core.first(closure.var1_filter_elements_qname))))))))))))) {state = 6; return false; }
				current = com.altova.functions.Core.createElement(com.altova.functions.Core.createQName("ReferenceNumber", ""), com.altova.functions.Core.box(com.altova.CoreTypes.nodeToString((com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("TraderReferenceIdentifier", "http://www.ros.ie/schemas/customs/IM529/v1"), (com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("Ucr", "http://www.ros.ie/schemas/customs/IM529/v1"), (com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("GoodsShipment", "http://www.ros.ie/schemas/customs/IM529/v1"), (com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("Declaration", "http://www.ros.ie/schemas/customs/IM529/v1"), (com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("ImportCustomsDeclaration", "http://www.ros.ie/schemas/customs/IM529/v1"), (com.altova.mapforce.IMFNode)com.altova.functions.Core.first(closure.var1_filter_elements_qname))))))))))))));
				pos++;
				return true;
			}
			private boolean moveNext_6() throws Exception {
				state = 9;				
				if (!(com.altova.functions.Core.exists(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("CustomsReferenceIdentifier", "http://www.ros.ie/schemas/customs/IM529/v1"), (com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("Declaration", "http://www.ros.ie/schemas/customs/IM529/v1"), (com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("ImportCustomsDeclaration", "http://www.ros.ie/schemas/customs/IM529/v1"), (com.altova.mapforce.IMFNode)com.altova.functions.Core.first(closure.var1_filter_elements_qname))))))))) {state = 9; return false; }
				current = com.altova.functions.Core.createElement(com.altova.functions.Core.createQName("TemporaryMRN", ""), com.altova.functions.Core.box(com.altova.CoreTypes.nodeToString((com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("CustomsReferenceIdentifier", "http://www.ros.ie/schemas/customs/IM529/v1"), (com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("Declaration", "http://www.ros.ie/schemas/customs/IM529/v1"), (com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("ImportCustomsDeclaration", "http://www.ros.ie/schemas/customs/IM529/v1"), (com.altova.mapforce.IMFNode)com.altova.functions.Core.first(closure.var1_filter_elements_qname))))))))));
				pos++;
				return true;
			}
			private boolean moveNext_9() throws Exception {
				state = 12;				
				if (!(com.altova.functions.Core.exists(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("DeclarationOfficeIdentifier", "http://www.ros.ie/schemas/customs/IM529/v1"), (com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("Declaration", "http://www.ros.ie/schemas/customs/IM529/v1"), (com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("ImportCustomsDeclaration", "http://www.ros.ie/schemas/customs/IM529/v1"), (com.altova.mapforce.IMFNode)com.altova.functions.Core.first(closure.var1_filter_elements_qname))))))))) {state = 12; return false; }
				current = com.altova.functions.Core.createElement(com.altova.functions.Core.createQName("RegistrationNumber", ""), com.altova.functions.Core.box(com.altova.CoreTypes.nodeToString((com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("DeclarationOfficeIdentifier", "http://www.ros.ie/schemas/customs/IM529/v1"), (com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("Declaration", "http://www.ros.ie/schemas/customs/IM529/v1"), (com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("ImportCustomsDeclaration", "http://www.ros.ie/schemas/customs/IM529/v1"), (com.altova.mapforce.IMFNode)com.altova.functions.Core.first(closure.var1_filter_elements_qname))))))))));
				pos++;
				return true;
			}
			private boolean moveNext_12() throws Exception {
				state = 17;				
				if (!(com.altova.functions.Core.exists(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("EntryCustomsOffice", "http://www.ros.ie/schemas/customs/IM529/v1"), (com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("GoodsShipment", "http://www.ros.ie/schemas/customs/IM529/v1"), (com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("Declaration", "http://www.ros.ie/schemas/customs/IM529/v1"), (com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("ImportCustomsDeclaration", "http://www.ros.ie/schemas/customs/IM529/v1"), (com.altova.mapforce.IMFNode)com.altova.functions.Core.first(closure.var1_filter_elements_qname))))))))))) {state = 17; return false; }
				if (!(com.altova.functions.Core.exists(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("CodeIdentifier", "http://www.ros.ie/schemas/customs/IM529/v1"), (com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("EntryCustomsOffice", "http://www.ros.ie/schemas/customs/IM529/v1"), (com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("GoodsShipment", "http://www.ros.ie/schemas/customs/IM529/v1"), (com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("Declaration", "http://www.ros.ie/schemas/customs/IM529/v1"), (com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("ImportCustomsDeclaration", "http://www.ros.ie/schemas/customs/IM529/v1"), (com.altova.mapforce.IMFNode)com.altova.functions.Core.first(closure.var1_filter_elements_qname))))))))))))) {state = 17; return false; }
				current = com.altova.functions.Core.createElement(com.altova.functions.Core.createQName("CustomsClerkName", ""), com.altova.functions.Core.box(com.altova.CoreTypes.nodeToString((com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("CodeIdentifier", "http://www.ros.ie/schemas/customs/IM529/v1"), (com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("EntryCustomsOffice", "http://www.ros.ie/schemas/customs/IM529/v1"), (com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("GoodsShipment", "http://www.ros.ie/schemas/customs/IM529/v1"), (com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("Declaration", "http://www.ros.ie/schemas/customs/IM529/v1"), (com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("ImportCustomsDeclaration", "http://www.ros.ie/schemas/customs/IM529/v1"), (com.altova.mapforce.IMFNode)com.altova.functions.Core.first(closure.var1_filter_elements_qname))))))))))))));
				pos++;
				return true;
			}
			private boolean moveNext_17() throws Exception {
				state = 18;				
				var2_filter_elements_qname = (com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("CustomsGoodsItem", "http://www.ros.ie/schemas/customs/IM529/v1"), (com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("GoodsShipment", "http://www.ros.ie/schemas/customs/IM529/v1"), (com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("Declaration", "http://www.ros.ie/schemas/customs/IM529/v1"), (com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("ImportCustomsDeclaration", "http://www.ros.ie/schemas/customs/IM529/v1"), (com.altova.mapforce.IMFNode)com.altova.functions.Core.first(closure.var1_filter_elements_qname))))))))).enumerator();
				return false;
			}
			private boolean moveNext_18() throws Exception {
				state = 18;				
				if (!var2_filter_elements_qname.moveNext()) {state = 19; return false; }
				current = com.altova.functions.Core.createElement(com.altova.functions.Core.createQName("GoodsItem", ""), (new seq3_join(((com.altova.mapforce.IMFNode)(var2_filter_elements_qname.current())), closure.var1_filter_elements_qname)));
				pos++;
				return true;
			}
			private boolean moveNext_19() throws Exception {
				state = 0;				
				var2_filter_elements_qname.close(); var2_filter_elements_qname = null;
				return false;
			}

			
			public void close()
			{
				try
				{
				var2_filter_elements_qname.close(); var2_filter_elements_qname = null;
				}
				catch (Exception e)
				{
				}
			}
		}
				
	}
	static class seq3_join implements IEnumerable
	{
		com.altova.mapforce.IMFNode var1_current;
		com.altova.mapforce.IEnumerable var2_filter_elements_qname;
	
		public seq3_join(com.altova.mapforce.IMFNode var1_current, com.altova.mapforce.IEnumerable var2_filter_elements_qname)
		{
			this.var1_current = var1_current;
			this.var2_filter_elements_qname = var2_filter_elements_qname;
		}

		public IEnumerator enumerator() {return new Enumerator(this);}
		
		public static class Enumerator implements IEnumerator
		{
			int pos = 0;
			int state = 1;
			Object current;
			seq3_join closure;
			public Enumerator(seq3_join closure) 
			{
				this.closure = closure;
			}
			
			public Object current() {return current;}
			
			public int position() {return pos;}
			
			public boolean moveNext() throws Exception
			{
				while (state != 0)
				{
					switch (state) 
					{
					case 1:	if (moveNext_1()) return true; break;
					case 4:	if (moveNext_4()) return true; break;
					case 7:	if (moveNext_7()) return true; break;
					case 8:	if (moveNext_8()) return true; break;
					case 11:	if (moveNext_11()) return true; break;
					case 16:	if (moveNext_16()) return true; break;
 					}
				}
				return false;
			}

			private boolean moveNext_1() throws Exception {
				state = 4;				
				if (!(com.altova.functions.Core.exists(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("SequenceIdentifier", "http://www.ros.ie/schemas/customs/IM529/v1"), closure.var1_current)))) {state = 4; return false; }
				current = com.altova.functions.Core.createElement(com.altova.functions.Core.createQName("ItemNumber", ""), com.altova.functions.Core.box(com.altova.CoreTypes.integerToString(com.altova.CoreTypes.decimalToInteger(com.altova.CoreTypes.parseDecimal(com.altova.CoreTypes.nodeToString((com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("SequenceIdentifier", "http://www.ros.ie/schemas/customs/IM529/v1"), closure.var1_current))))))));
				pos++;
				return true;
			}
			private boolean moveNext_4() throws Exception {
				state = 7;				
				if (!(com.altova.functions.Core.exists(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("AcceptanceDate", "http://www.ros.ie/schemas/customs/IM529/v1"), (com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("Declaration", "http://www.ros.ie/schemas/customs/IM529/v1"), (com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("ImportCustomsDeclaration", "http://www.ros.ie/schemas/customs/IM529/v1"), (com.altova.mapforce.IMFNode)com.altova.functions.Core.first(closure.var2_filter_elements_qname))))))))) {state = 7; return false; }
				current = com.altova.functions.Core.createElement(com.altova.functions.Core.createQName("AcceptanceDate", ""), com.altova.functions.Core.box(com.altova.CoreTypes.nodeToString((com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("AcceptanceDate", "http://www.ros.ie/schemas/customs/IM529/v1"), (com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("Declaration", "http://www.ros.ie/schemas/customs/IM529/v1"), (com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("ImportCustomsDeclaration", "http://www.ros.ie/schemas/customs/IM529/v1"), (com.altova.mapforce.IMFNode)com.altova.functions.Core.first(closure.var2_filter_elements_qname))))))))));
				pos++;
				return true;
			}
			private boolean moveNext_7() throws Exception {
				state = 8;				
				current = com.altova.functions.Core.createElement(com.altova.functions.Core.createQName("ReleaseDate", ""), com.altova.functions.Core.box(com.altova.CoreTypes.nodeToString((com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("ImportReleaseIssueDate", "http://www.ros.ie/schemas/customs/IM529/v1"), (com.altova.mapforce.IMFNode)com.altova.functions.Core.first(closure.var2_filter_elements_qname))))));
				pos++;
				return true;
			}
			private boolean moveNext_8() throws Exception {
				state = 11;				
				if (!(com.altova.functions.Core.exists(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("TypeCode", "http://www.ros.ie/schemas/customs/IM529/v1"), (com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("Declaration", "http://www.ros.ie/schemas/customs/IM529/v1"), (com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("ImportCustomsDeclaration", "http://www.ros.ie/schemas/customs/IM529/v1"), (com.altova.mapforce.IMFNode)com.altova.functions.Core.first(closure.var2_filter_elements_qname))))))))) {state = 11; return false; }
				current = com.altova.functions.Core.createElement(com.altova.functions.Core.createQName("AcceptanceCode", ""), com.altova.functions.Core.box(com.altova.CoreTypes.nodeToString((com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("TypeCode", "http://www.ros.ie/schemas/customs/IM529/v1"), (com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("Declaration", "http://www.ros.ie/schemas/customs/IM529/v1"), (com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("ImportCustomsDeclaration", "http://www.ros.ie/schemas/customs/IM529/v1"), (com.altova.mapforce.IMFNode)com.altova.functions.Core.first(closure.var2_filter_elements_qname))))))))));
				pos++;
				return true;
			}
			private boolean moveNext_11() throws Exception {
				state = 16;				
				if (!(com.altova.functions.Core.exists(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("CustomsProcedure", "http://www.ros.ie/schemas/customs/IM529/v1"), closure.var1_current)))) {state = 16; return false; }
				if (!(com.altova.functions.Core.exists(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("CurrentCode", "http://www.ros.ie/schemas/customs/IM529/v1"), (com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("CustomsProcedure", "http://www.ros.ie/schemas/customs/IM529/v1"), closure.var1_current)))))) {state = 16; return false; }
				current = com.altova.functions.Core.createElement(com.altova.functions.Core.createQName("RulingsCode", ""), com.altova.functions.Core.box(com.altova.CoreTypes.nodeToString((com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("CurrentCode", "http://www.ros.ie/schemas/customs/IM529/v1"), (com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("CustomsProcedure", "http://www.ros.ie/schemas/customs/IM529/v1"), closure.var1_current)))))));
				pos++;
				return true;
			}
			private boolean moveNext_16() throws Exception {
				state = 0;				
				if (!(com.altova.functions.Core.exists(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("Commodity", "http://www.ros.ie/schemas/customs/IM529/v1"), closure.var1_current)))) {state = 0; return false; }
				if (!(com.altova.functions.Core.exists(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("DescriptionText", "http://www.ros.ie/schemas/customs/IM529/v1"), (com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("Commodity", "http://www.ros.ie/schemas/customs/IM529/v1"), closure.var1_current)))))) {state = 0; return false; }
				current = com.altova.functions.Core.createElement(com.altova.functions.Core.createQName("Text", ""), com.altova.functions.Core.box(com.altova.CoreTypes.nodeToString((com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("DescriptionText", "http://www.ros.ie/schemas/customs/IM529/v1"), (com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("Commodity", "http://www.ros.ie/schemas/customs/IM529/v1"), closure.var1_current)))))));
				pos++;
				return true;
			}

			
			public void close()
			{
				try
				{
				}
				catch (Exception e)
				{
				}
			}
		}
				
	}
	static class Outer implements IEnumerable
	{
		com.altova.mapforce.IMFNode var1_instance_IM529;
	
		public Outer(com.altova.mapforce.IMFNode var1_instance_IM529)
		{
			this.var1_instance_IM529 = var1_instance_IM529;
		}

		public IEnumerator enumerator() {return new Enumerator(this);}
		
		public static class Enumerator implements IEnumerator
		{
			int pos = 0;
			int state = 1;
			Object current;
			Outer closure;
			IEnumerator var2_box;
			public Enumerator(Outer closure) 
			{
				this.closure = closure;
			}
			
			public Object current() {return current;}
			
			public int position() {return pos;}
			
			public boolean moveNext() throws Exception
			{
				while (state != 0)
				{
					switch (state) 
					{
					case 1:	if (moveNext_1()) return true; break;
					case 2:	if (moveNext_2()) return true; break;
					case 3:	if (moveNext_3()) return true; break;
 					}
				}
				return false;
			}

			private boolean moveNext_1() throws Exception {
				state = 2;				
				var2_box = ((new main(closure.var1_instance_IM529))).enumerator();
				return false;
			}
			private boolean moveNext_2() throws Exception {
				state = 2;				
				if (!var2_box.moveNext()) {state = 3; return false; }
				current = var2_box.current();
				pos++;
				return true;
			}
			private boolean moveNext_3() throws Exception {
				state = 0;				
				var2_box.close(); var2_box = null;
				return false;
			}

			
			public void close()
			{
				try
				{
				var2_box.close(); var2_box = null;
				}
				catch (Exception e)
				{
				}
			}
		}
				
	}



	// instances
	protected org.w3c.dom.Node varIM5293Instance;

	public void run(String IM5293SourceFilename, String ImportDeclarationDecision2TargetFilename) throws Exception {
		// open source streams
		writeTrace("Loading " + IM5293SourceFilename + "...\n");
		com.altova.io.FileInput IM5293Source = new com.altova.io.FileInput(IM5293SourceFilename);
		// open target stream
		com.altova.io.FileOutput ImportDeclarationDecision2Target = new com.altova.io.FileOutput(ImportDeclarationDecision2TargetFilename);

		// run
		run(IM5293Source, ImportDeclarationDecision2Target);

		// close source streams
		IM5293Source.close();
		// close target stream
		writeTrace("Saving " + ImportDeclarationDecision2TargetFilename + "...\n");
		ImportDeclarationDecision2Target.close();
	}


	// main entry point

	public void run(com.altova.io.Input IM5293Source, com.altova.io.Output ImportDeclarationDecision2Target) throws Exception {
		// Open the source(s)
		org.w3c.dom.Document doc_IM5293 = XmlTreeOperations.loadDocument(IM5293Source);
		varIM5293Instance = doc_IM5293;
		if (runDoesCloseAll)
			IM5293Source.close();

		// Create the target
		org.w3c.dom.Document ImportDeclarationDecision2Doc = (ImportDeclarationDecision2Target.getType() == com.altova.io.Output.IO_DOM) ? ImportDeclarationDecision2Target.getDocument() : XmlTreeOperations.createDocument();

		// Execute mapping

		main mapping = new main(new com.altova.xml.DOMDocumentAsMFNodeAdapter(varIM5293Instance, IM5293Source.getFilename()));

		com.altova.xml.MFDOMWriter.write(mapping, ImportDeclarationDecision2Doc);
		// Close the target
		XmlTreeOperations.saveDocument(ImportDeclarationDecision2Doc, ImportDeclarationDecision2Target, "UTF-8", false, false, true);

		
		if (runDoesCloseAll)
		{
			IM5293Source.close();
			ImportDeclarationDecision2Target.close();
		}
	}



}

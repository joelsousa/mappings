/**
 * NCTSDeclarationRejectedMapToIE16.java
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

public class NCTSDeclarationRejectedMapToIE16 extends com.altova.TraceProvider 
{
	private boolean runDoesCloseAll = true;
	public void setCloseObjectsAfterRun(boolean c) {runDoesCloseAll = c;}
	public boolean getCloseObjectsAfterRun() {return runDoesCloseAll;}

	
	static class main implements IEnumerable
	{
		com.altova.mapforce.IMFNode var1_instance_NCTSDeclarationRejected;
	
		public main(com.altova.mapforce.IMFNode var1_instance_NCTSDeclarationRejected)
		{
			this.var1_instance_NCTSDeclarationRejected = var1_instance_NCTSDeclarationRejected;
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
				var2_filter_elements_qname = new com.altova.functions.Core.SequenceCache(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("NCTSDeclarationRejected", ""), closure.var1_instance_NCTSDeclarationRejected));
				current = com.altova.functions.Core.createElement(com.altova.functions.Core.createQName("RESPONS", ""), (new seq1_join(var2_filter_elements_qname)));
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
					case 6:	if (moveNext_6()) return true; break;
 					}
				}
				return false;
			}

			private boolean moveNext_1() throws Exception {
				state = 2;				
				current = com.altova.functions.Core.createAttribute(com.altova.functions.Core.createQName("xsi:noNamespaceSchemaLocation", "http://www.w3.org/2001/XMLSchema-instance"), com.altova.functions.Core.box("C:/Users/moredata8/Desktop/KCXMapping/KCXMappingCountries_FR/NCTSDeclarationRejectedMapToIE16/IE16.xsd"));
				pos++;
				return true;
			}
			private boolean moveNext_2() throws Exception {
				state = 6;				
				if (!(com.altova.functions.Core.exists(closure.var1_filter_elements_qname))) {state = 0; return false; }
				if (!(com.altova.functions.Core.exists(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("ReferenceNumber", ""), (com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("GoodsDeclaration", ""), (com.altova.mapforce.IMFNode)com.altova.functions.Core.first(closure.var1_filter_elements_qname))))))) {state = 6; return false; }
				current = com.altova.functions.Core.createElement(com.altova.functions.Core.createQName("LRN", ""), com.altova.functions.Core.box(com.altova.CoreTypes.nodeToString((com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("ReferenceNumber", ""), (com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("GoodsDeclaration", ""), (com.altova.mapforce.IMFNode)com.altova.functions.Core.first(closure.var1_filter_elements_qname))))))));
				pos++;
				return true;
			}
			private boolean moveNext_6() throws Exception {
				state = 0;				
				current = com.altova.functions.Core.createElement(com.altova.functions.Core.createQName("IE16", ""), (new seq2_join(closure.var1_filter_elements_qname)));
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
					case 2:	if (moveNext_2()) return true; break;
					case 3:	if (moveNext_3()) return true; break;
					case 4:	if (moveNext_4()) return true; break;
					case 6:	if (moveNext_6()) return true; break;
					case 7:	if (moveNext_7()) return true; break;
 					}
				}
				return false;
			}

			private boolean moveNext_1() throws Exception {
				state = 2;				
				current = com.altova.functions.Core.createElement(com.altova.functions.Core.createQName("DREJET", ""), (new seq3_cond_box(closure.var1_filter_elements_qname)));
				pos++;
				return true;
			}
			private boolean moveNext_2() throws Exception {
				state = 3;				
				var2_filter_elements_qname = (com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("Error", ""), (com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("GoodsDeclaration", ""), (com.altova.mapforce.IMFNode)com.altova.functions.Core.first(closure.var1_filter_elements_qname))))).enumerator();
				return false;
			}
			private boolean moveNext_3() throws Exception {
				state = 3;				
				if (!var2_filter_elements_qname.moveNext()) {state = 4; return false; }
				current = com.altova.functions.Core.createElement(com.altova.functions.Core.createQName("CDERR", ""), com.altova.functions.Core.box(com.altova.CoreTypes.nodeToString((com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("Code", ""), ((com.altova.mapforce.IMFNode)(var2_filter_elements_qname.current())))))));
				pos++;
				return true;
			}
			private boolean moveNext_4() throws Exception {
				state = 6;				
				var2_filter_elements_qname.close(); var2_filter_elements_qname = null;
				current = com.altova.functions.Core.createElement(com.altova.functions.Core.createQName("LIBERR", ""), (new seq4_map(closure.var1_filter_elements_qname)));
				pos++;
				return true;
			}
			private boolean moveNext_6() throws Exception {
				state = 7;				
				current = com.altova.functions.Core.createElement(com.altova.functions.Core.createQName("VALOR", ""), (new seq6_map(closure.var1_filter_elements_qname)));
				pos++;
				return true;
			}
			private boolean moveNext_7() throws Exception {
				state = 0;				
				current = com.altova.functions.Core.createElement(com.altova.functions.Core.createQName("INDERR", ""), (new seq8_map(closure.var1_filter_elements_qname)));
				pos++;
				return true;
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
	static class seq3_cond_box implements IEnumerable
	{
		com.altova.mapforce.IEnumerable var1_filter_elements_qname;
	
		public seq3_cond_box(com.altova.mapforce.IEnumerable var1_filter_elements_qname)
		{
			this.var1_filter_elements_qname = var1_filter_elements_qname;
		}

		public IEnumerator enumerator() {return new Enumerator(this);}
		
		public static class Enumerator implements IEnumerator
		{
			int pos = 0;
			int state = 1;
			Object current;
			seq3_cond_box closure;
			public Enumerator(seq3_cond_box closure) 
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
 					}
				}
				return false;
			}

			private boolean moveNext_1() throws Exception {
				state = 0;				
				if (!(com.altova.functions.Core.exists(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("ArrivalRejectionDate", ""), (com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("GoodsDeclaration", ""), (com.altova.mapforce.IMFNode)com.altova.functions.Core.first(closure.var1_filter_elements_qname))))))) {state = 0; return false; }
				current = com.altova.functions.Core.createElement(com.altova.functions.Core.createQName("DTVAL", ""), com.altova.functions.Core.box(com.altova.CoreTypes.nodeToString((com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("ArrivalRejectionDate", ""), (com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("GoodsDeclaration", ""), (com.altova.mapforce.IMFNode)com.altova.functions.Core.first(closure.var1_filter_elements_qname))))))));
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
	static class seq4_map implements IEnumerable
	{
		com.altova.mapforce.IEnumerable var1_filter_elements_qname;
	
		public seq4_map(com.altova.mapforce.IEnumerable var1_filter_elements_qname)
		{
			this.var1_filter_elements_qname = var1_filter_elements_qname;
		}

		public IEnumerator enumerator() {return new Enumerator(this);}
		
		public static class Enumerator implements IEnumerator
		{
			int pos = 0;
			int state = 1;
			Object current;
			seq4_map closure;
			IEnumerator var2_filter;
			public Enumerator(seq4_map closure) 
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
				var2_filter = ((new seq5_filter(closure.var1_filter_elements_qname))).enumerator();
				return false;
			}
			private boolean moveNext_2() throws Exception {
				state = 2;				
				if (!var2_filter.moveNext()) {state = 3; return false; }
				current = com.altova.functions.Core.createElement(com.altova.functions.Core.createQName("TXTERR", ""), com.altova.functions.Core.box(com.altova.CoreTypes.nodeToString((com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("Text", ""), ((com.altova.mapforce.IMFNode)(var2_filter.current())))))));
				pos++;
				return true;
			}
			private boolean moveNext_3() throws Exception {
				state = 0;				
				var2_filter.close(); var2_filter = null;
				return false;
			}

			
			public void close()
			{
				try
				{
				var2_filter.close(); var2_filter = null;
				}
				catch (Exception e)
				{
				}
			}
		}
				
	}
	static class seq5_filter implements IEnumerable
	{
		com.altova.mapforce.IEnumerable var1_filter_elements_qname;
	
		public seq5_filter(com.altova.mapforce.IEnumerable var1_filter_elements_qname)
		{
			this.var1_filter_elements_qname = var1_filter_elements_qname;
		}

		public IEnumerator enumerator() {return new Enumerator(this);}
		
		public static class Enumerator implements IEnumerator
		{
			int pos = 0;
			int state = 1;
			Object current;
			seq5_filter closure;
			IEnumerator var2_filter_elements_qname;
			public Enumerator(seq5_filter closure) 
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
				var2_filter_elements_qname = (com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("Error", ""), (com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("GoodsDeclaration", ""), (com.altova.mapforce.IMFNode)com.altova.functions.Core.first(closure.var1_filter_elements_qname))))).enumerator();
				return false;
			}
			private boolean moveNext_2() throws Exception {
				state = 2;				
				if (!var2_filter_elements_qname.moveNext()) {state = 3; return false; }
				if (!(com.altova.functions.Core.exists(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("Text", ""), ((com.altova.mapforce.IMFNode)(var2_filter_elements_qname.current())))))) {state = 2; return false; }
				current = var2_filter_elements_qname.current();
				pos++;
				return true;
			}
			private boolean moveNext_3() throws Exception {
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
	static class seq6_map implements IEnumerable
	{
		com.altova.mapforce.IEnumerable var1_filter_elements_qname;
	
		public seq6_map(com.altova.mapforce.IEnumerable var1_filter_elements_qname)
		{
			this.var1_filter_elements_qname = var1_filter_elements_qname;
		}

		public IEnumerator enumerator() {return new Enumerator(this);}
		
		public static class Enumerator implements IEnumerator
		{
			int pos = 0;
			int state = 1;
			Object current;
			seq6_map closure;
			IEnumerator var2_filter;
			public Enumerator(seq6_map closure) 
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
				var2_filter = ((new seq7_filter(closure.var1_filter_elements_qname))).enumerator();
				return false;
			}
			private boolean moveNext_2() throws Exception {
				state = 2;				
				if (!var2_filter.moveNext()) {state = 3; return false; }
				current = com.altova.functions.Core.createElement(com.altova.functions.Core.createQName("TXTVALOR", ""), com.altova.functions.Core.box(com.altova.CoreTypes.nodeToString((com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("Number", ""), ((com.altova.mapforce.IMFNode)(var2_filter.current())))))));
				pos++;
				return true;
			}
			private boolean moveNext_3() throws Exception {
				state = 0;				
				var2_filter.close(); var2_filter = null;
				return false;
			}

			
			public void close()
			{
				try
				{
				var2_filter.close(); var2_filter = null;
				}
				catch (Exception e)
				{
				}
			}
		}
				
	}
	static class seq7_filter implements IEnumerable
	{
		com.altova.mapforce.IEnumerable var1_filter_elements_qname;
	
		public seq7_filter(com.altova.mapforce.IEnumerable var1_filter_elements_qname)
		{
			this.var1_filter_elements_qname = var1_filter_elements_qname;
		}

		public IEnumerator enumerator() {return new Enumerator(this);}
		
		public static class Enumerator implements IEnumerator
		{
			int pos = 0;
			int state = 1;
			Object current;
			seq7_filter closure;
			IEnumerator var2_filter_elements_qname;
			public Enumerator(seq7_filter closure) 
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
				var2_filter_elements_qname = (com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("Error", ""), (com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("GoodsDeclaration", ""), (com.altova.mapforce.IMFNode)com.altova.functions.Core.first(closure.var1_filter_elements_qname))))).enumerator();
				return false;
			}
			private boolean moveNext_2() throws Exception {
				state = 2;				
				if (!var2_filter_elements_qname.moveNext()) {state = 3; return false; }
				if (!(com.altova.functions.Core.exists(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("Number", ""), ((com.altova.mapforce.IMFNode)(var2_filter_elements_qname.current())))))) {state = 2; return false; }
				current = var2_filter_elements_qname.current();
				pos++;
				return true;
			}
			private boolean moveNext_3() throws Exception {
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
	static class seq8_map implements IEnumerable
	{
		com.altova.mapforce.IEnumerable var1_filter_elements_qname;
	
		public seq8_map(com.altova.mapforce.IEnumerable var1_filter_elements_qname)
		{
			this.var1_filter_elements_qname = var1_filter_elements_qname;
		}

		public IEnumerator enumerator() {return new Enumerator(this);}
		
		public static class Enumerator implements IEnumerator
		{
			int pos = 0;
			int state = 1;
			Object current;
			seq8_map closure;
			IEnumerator var2_filter;
			public Enumerator(seq8_map closure) 
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
				var2_filter = ((new seq9_filter(closure.var1_filter_elements_qname))).enumerator();
				return false;
			}
			private boolean moveNext_2() throws Exception {
				state = 2;				
				if (!var2_filter.moveNext()) {state = 3; return false; }
				current = com.altova.functions.Core.createElement(com.altova.functions.Core.createQName("TXTINDERR", ""), com.altova.functions.Core.box(com.altova.CoreTypes.nodeToString((com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("Pointer", ""), ((com.altova.mapforce.IMFNode)(var2_filter.current())))))));
				pos++;
				return true;
			}
			private boolean moveNext_3() throws Exception {
				state = 0;				
				var2_filter.close(); var2_filter = null;
				return false;
			}

			
			public void close()
			{
				try
				{
				var2_filter.close(); var2_filter = null;
				}
				catch (Exception e)
				{
				}
			}
		}
				
	}
	static class seq9_filter implements IEnumerable
	{
		com.altova.mapforce.IEnumerable var1_filter_elements_qname;
	
		public seq9_filter(com.altova.mapforce.IEnumerable var1_filter_elements_qname)
		{
			this.var1_filter_elements_qname = var1_filter_elements_qname;
		}

		public IEnumerator enumerator() {return new Enumerator(this);}
		
		public static class Enumerator implements IEnumerator
		{
			int pos = 0;
			int state = 1;
			Object current;
			seq9_filter closure;
			IEnumerator var2_filter_elements_qname;
			public Enumerator(seq9_filter closure) 
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
				var2_filter_elements_qname = (com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("Error", ""), (com.altova.mapforce.IMFNode)com.altova.functions.Core.first(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("GoodsDeclaration", ""), (com.altova.mapforce.IMFNode)com.altova.functions.Core.first(closure.var1_filter_elements_qname))))).enumerator();
				return false;
			}
			private boolean moveNext_2() throws Exception {
				state = 2;				
				if (!var2_filter_elements_qname.moveNext()) {state = 3; return false; }
				if (!(com.altova.functions.Core.exists(com.altova.functions.Core.filterElements(com.altova.functions.Core.createQName("Pointer", ""), ((com.altova.mapforce.IMFNode)(var2_filter_elements_qname.current())))))) {state = 2; return false; }
				current = var2_filter_elements_qname.current();
				pos++;
				return true;
			}
			private boolean moveNext_3() throws Exception {
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
	static class Outer implements IEnumerable
	{
		com.altova.mapforce.IMFNode var1_instance_NCTSDeclarationRejected;
	
		public Outer(com.altova.mapforce.IMFNode var1_instance_NCTSDeclarationRejected)
		{
			this.var1_instance_NCTSDeclarationRejected = var1_instance_NCTSDeclarationRejected;
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
				var2_box = ((new main(closure.var1_instance_NCTSDeclarationRejected))).enumerator();
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
	protected org.w3c.dom.Node varNCTSDeclarationRejected3Instance;

	public void run(String NCTSDeclarationRejected3SourceFilename, String IE162TargetFilename) throws Exception {
		// open source streams
		writeTrace("Loading " + NCTSDeclarationRejected3SourceFilename + "...\n");
		com.altova.io.FileInput NCTSDeclarationRejected3Source = new com.altova.io.FileInput(NCTSDeclarationRejected3SourceFilename);
		// open target stream
		com.altova.io.FileOutput IE162Target = new com.altova.io.FileOutput(IE162TargetFilename);

		// run
		run(NCTSDeclarationRejected3Source, IE162Target);

		// close source streams
		NCTSDeclarationRejected3Source.close();
		// close target stream
		writeTrace("Saving " + IE162TargetFilename + "...\n");
		IE162Target.close();
	}


	// main entry point

	public void run(com.altova.io.Input NCTSDeclarationRejected3Source, com.altova.io.Output IE162Target) throws Exception {
		// Open the source(s)
		org.w3c.dom.Document doc_NCTSDeclarationRejected3 = XmlTreeOperations.loadDocument(NCTSDeclarationRejected3Source);
		varNCTSDeclarationRejected3Instance = doc_NCTSDeclarationRejected3;
		if (runDoesCloseAll)
			NCTSDeclarationRejected3Source.close();

		// Create the target
		org.w3c.dom.Document IE162Doc = (IE162Target.getType() == com.altova.io.Output.IO_DOM) ? IE162Target.getDocument() : XmlTreeOperations.createDocument();

		// Execute mapping

		main mapping = new main(new com.altova.xml.DOMDocumentAsMFNodeAdapter(varNCTSDeclarationRejected3Instance, NCTSDeclarationRejected3Source.getFilename()));

		com.altova.xml.MFDOMWriter.write(mapping, IE162Doc);
		// Close the target
		XmlTreeOperations.saveDocument(IE162Doc, IE162Target, "UTF-8", false, false, true);

		
		if (runDoesCloseAll)
		{
			NCTSDeclarationRejected3Source.close();
			IE162Target.close();
		}
	}



}

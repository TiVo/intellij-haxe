/*
 * Copyright 2000-2013 JetBrains s.r.o.
 * Copyright 2014-2018 AS3Boyan
 * Copyright 2014-2014 Elias Ku
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by Haxe 3.4.7
package haxe.io;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Output extends haxe.lang.HxObject
{
	public Output(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Output()
	{
		//line 30 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
		Output.__hx_ctor_haxe_io_Output(this);
	}
	
	
	public static void __hx_ctor_haxe_io_Output(Output __hx_this)
	{
	}
	
	
	public void writeByte(int c)
	{
		//line 47 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
		throw haxe.lang.HaxeException.wrap("Not implemented");
	}
	
	
	public int writeBytes(Bytes s, int pos, int len)
	{
		//line 59 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
		if (( ( ( pos < 0 ) || ( len < 0 ) ) || ( ( pos + len ) > s.length ) )) 
		{
			//line 60 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
			throw haxe.lang.HaxeException.wrap(Error.OutsideBounds);
		}
		
		//line 62 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
		byte[] b = s.b;
		//line 63 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
		int k = len;
		//line 64 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
		while (( k > 0 ))
		{
			//line 74 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
			this.writeByte(((int) (b[pos]) ));
			//line 76 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
			 ++ pos;
			//line 77 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
			 -- k;
		}
		
		//line 79 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
		return len;
	}
	
	
	public void write(Bytes s)
	{
		//line 107 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
		int l = s.length;
		//line 108 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
		int p = 0;
		//line 109 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
		while (( l > 0 ))
		{
			//line 110 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
			int k = this.writeBytes(s, p, l);
			//line 111 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
			if (( k == 0 )) 
			{
				//line 111 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
				throw haxe.lang.HaxeException.wrap(Error.Blocked);
			}
			
			//line 112 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
			p += k;
			//line 113 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
			l -= k;
		}
		
	}
	
	
	public void writeFullBytes(Bytes s, int pos, int len)
	{
		//line 123 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
		while (( len > 0 ))
		{
			//line 124 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
			int k = this.writeBytes(s, pos, len);
			//line 125 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
			pos += k;
			//line 126 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
			len -= k;
		}
		
	}
	
	
	public void writeString(String s)
	{
		//line 282 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
		Bytes b = Bytes.ofString(s);
		//line 284 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
		this.writeFullBytes(b, 0, b.length);
	}
	
	
	@Override public Object __hx_getField(String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 30 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
		{
			//line 30 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
			boolean __temp_executeDef1 = true;
			//line 30 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
			switch (field.hashCode())
			{
				case 1412235472:
				{
					//line 30 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
					if (field.equals("writeString")) 
					{
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
						__temp_executeDef1 = false;
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "writeString")) );
					}
					
					//line 30 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
					break;
				}
				
				
				case -1406851705:
				{
					//line 30 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
					if (field.equals("writeByte")) 
					{
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
						__temp_executeDef1 = false;
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "writeByte")) );
					}
					
					//line 30 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
					break;
				}
				
				
				case 1188045309:
				{
					//line 30 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
					if (field.equals("writeFullBytes")) 
					{
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
						__temp_executeDef1 = false;
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "writeFullBytes")) );
					}
					
					//line 30 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
					break;
				}
				
				
				case -662729780:
				{
					//line 30 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
					if (field.equals("writeBytes")) 
					{
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
						__temp_executeDef1 = false;
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "writeBytes")) );
					}
					
					//line 30 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
					break;
				}
				
				
				case 113399775:
				{
					//line 30 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
					if (field.equals("write")) 
					{
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
						__temp_executeDef1 = false;
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "write")) );
					}
					
					//line 30 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
					break;
				}
				
				
			}
			
			//line 30 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
			if (__temp_executeDef1) 
			{
				//line 30 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 30 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public Object __hx_invokeField(String field, haxe.root.Array dynargs)
	{
		//line 30 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
		{
			//line 30 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
			boolean __temp_executeDef1 = true;
			//line 30 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
			switch (field.hashCode())
			{
				case 1412235472:
				{
					//line 30 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
					if (field.equals("writeString")) 
					{
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
						__temp_executeDef1 = false;
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
						this.writeString(haxe.lang.Runtime.toString(dynargs.__get(0)));
					}
					
					//line 30 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
					break;
				}
				
				
				case -1406851705:
				{
					//line 30 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
					if (field.equals("writeByte")) 
					{
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
						__temp_executeDef1 = false;
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
						this.writeByte(((int) (haxe.lang.Runtime.toInt(dynargs.__get(0))) ));
					}
					
					//line 30 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
					break;
				}
				
				
				case 1188045309:
				{
					//line 30 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
					if (field.equals("writeFullBytes")) 
					{
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
						__temp_executeDef1 = false;
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
						this.writeFullBytes(((Bytes) (dynargs.__get(0)) ), ((int) (haxe.lang.Runtime.toInt(dynargs.__get(1))) ), ((int) (haxe.lang.Runtime.toInt(dynargs.__get(2))) ));
					}
					
					//line 30 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
					break;
				}
				
				
				case -662729780:
				{
					//line 30 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
					if (field.equals("writeBytes")) 
					{
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
						__temp_executeDef1 = false;
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
						return this.writeBytes(((Bytes) (dynargs.__get(0)) ), ((int) (haxe.lang.Runtime.toInt(dynargs.__get(1))) ), ((int) (haxe.lang.Runtime.toInt(dynargs.__get(2))) ));
					}
					
					//line 30 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
					break;
				}
				
				
				case 113399775:
				{
					//line 30 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
					if (field.equals("write")) 
					{
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
						__temp_executeDef1 = false;
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
						this.write(((Bytes) (dynargs.__get(0)) ));
					}
					
					//line 30 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
					break;
				}
				
				
			}
			
			//line 30 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
			if (__temp_executeDef1) 
			{
				//line 30 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 30 "C:\\HaxeToolkit\\haxe\\std\\haxe\\io\\Output.hx"
		return null;
	}
	
	
}


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
package haxe.java.io;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class NativeInput extends haxe.io.Input
{
	public NativeInput(haxe.lang.EmptyObject empty)
	{
		//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
		super(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public NativeInput(java.io.InputStream stream)
	{
		//line 33 "C:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
		NativeInput.__hx_ctor_haxe_java_io_NativeInput(this, stream);
	}
	
	
	public static void __hx_ctor_haxe_java_io_NativeInput(NativeInput __hx_this, java.io.InputStream stream)
	{
		//line 35 "C:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
		__hx_this.stream = stream;
	}
	
	
	public java.io.InputStream stream;
	
	@Override public int readByte()
	{
		//line 40 "C:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
		int ret = 0;
		//line 43 "C:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
		try 
		{
			//line 43 "C:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
			ret = this.stream.read();
		}
		catch (java.io.IOException e)
		{
			//line 46 "C:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
			haxe.lang.Exceptions.setException(e);
			//line 46 "C:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
			throw haxe.lang.HaxeException.wrap(haxe.io.Error.Custom(e));
		}
		
		
		//line 48 "C:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
		if (( ret == -1 )) 
		{
			//line 49 "C:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
			throw haxe.lang.HaxeException.wrap(new haxe.io.Eof());
		}
		
		//line 50 "C:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
		return ret;
	}
	
	
	@Override public int readBytes(haxe.io.Bytes s, int pos, int len)
	{
		//line 55 "C:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
		int ret = 0;
		//line 58 "C:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
		try 
		{
			//line 58 "C:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
			ret = this.stream.read(((byte[]) (s.b) ), ((int) (pos) ), ((int) (len) ));
		}
		catch (java.io.EOFException e)
		{
			//line 62 "C:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
			haxe.lang.Exceptions.setException(e);
			//line 62 "C:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
			throw haxe.lang.HaxeException.wrap(new haxe.io.Eof());
		}
		
		catch (java.io.IOException e1)
		{
			//line 66 "C:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
			haxe.lang.Exceptions.setException(e1);
			//line 66 "C:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
			throw haxe.lang.HaxeException.wrap(haxe.io.Error.Custom(e1));
		}
		
		
		//line 69 "C:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
		if (( ret == -1 )) 
		{
			//line 70 "C:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
			throw haxe.lang.HaxeException.wrap(new haxe.io.Eof());
		}
		
		//line 71 "C:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
		return ret;
	}
	
	
	@Override public Object __hx_setField(String field, Object value, boolean handleProperties)
	{
		//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
		{
			//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
			boolean __temp_executeDef1 = true;
			//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
			switch (field.hashCode())
			{
				case -891990144:
				{
					//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
					if (field.equals("stream")) 
					{
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
						__temp_executeDef1 = false;
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
						this.stream = ((java.io.InputStream) (value) );
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
						return value;
					}
					
					//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
					break;
				}
				
				
			}
			
			//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
			if (__temp_executeDef1) 
			{
				//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public Object __hx_getField(String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
		{
			//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
			boolean __temp_executeDef1 = true;
			//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
			switch (field.hashCode())
			{
				case -1140063115:
				{
					//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
					if (field.equals("readBytes")) 
					{
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
						__temp_executeDef1 = false;
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "readBytes")) );
					}
					
					//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
					break;
				}
				
				
				case -891990144:
				{
					//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
					if (field.equals("stream")) 
					{
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
						__temp_executeDef1 = false;
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
						return this.stream;
					}
					
					//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
					break;
				}
				
				
				case -868060226:
				{
					//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
					if (field.equals("readByte")) 
					{
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
						__temp_executeDef1 = false;
						//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "readByte")) );
					}
					
					//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
					break;
				}
				
				
			}
			
			//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
			if (__temp_executeDef1) 
			{
				//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<String> baseArr)
	{
		//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
		baseArr.push("stream");
		//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\io\\NativeInput.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


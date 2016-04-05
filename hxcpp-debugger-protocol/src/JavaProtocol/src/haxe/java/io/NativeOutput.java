// Generated by Haxe
package haxe.java.io;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class NativeOutput extends haxe.io.Output
{
	public NativeOutput(haxe.lang.EmptyObject empty)
	{
		//line 30 "/usr/local/lib/haxe/std/java/io/NativeOutput.hx"
		super(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public NativeOutput(java.io.OutputStream stream)
	{
		//line 33 "/usr/local/lib/haxe/std/java/io/NativeOutput.hx"
		haxe.java.io.NativeOutput.__hx_ctor_haxe_java_io_NativeOutput(this, stream);
	}
	
	
	public static void __hx_ctor_haxe_java_io_NativeOutput(haxe.java.io.NativeOutput __temp_me30, java.io.OutputStream stream)
	{
		//line 35 "/usr/local/lib/haxe/std/java/io/NativeOutput.hx"
		__temp_me30.stream = stream;
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 30 "/usr/local/lib/haxe/std/java/io/NativeOutput.hx"
		return new haxe.java.io.NativeOutput(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 30 "/usr/local/lib/haxe/std/java/io/NativeOutput.hx"
		return new haxe.java.io.NativeOutput(((java.io.OutputStream) (arr.__get(0)) ));
	}
	
	
	public java.io.OutputStream stream;
	
	@Override public void writeByte(int c)
	{
		//line 42 "/usr/local/lib/haxe/std/java/io/NativeOutput.hx"
		try 
		{
			//line 42 "/usr/local/lib/haxe/std/java/io/NativeOutput.hx"
			this.stream.write(((int) (c) ));
		}
		catch (java.io.EOFException e)
		{
			//line 46 "/usr/local/lib/haxe/std/java/io/NativeOutput.hx"
			haxe.lang.Exceptions.setException(e);
			//line 46 "/usr/local/lib/haxe/std/java/io/NativeOutput.hx"
			throw haxe.lang.HaxeException.wrap(new haxe.io.Eof());
		}
		
		catch (java.io.IOException e1)
		{
			//line 50 "/usr/local/lib/haxe/std/java/io/NativeOutput.hx"
			haxe.lang.Exceptions.setException(e1);
			//line 50 "/usr/local/lib/haxe/std/java/io/NativeOutput.hx"
			throw haxe.lang.HaxeException.wrap(haxe.io.Error.Custom(e1));
		}
		
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 30 "/usr/local/lib/haxe/std/java/io/NativeOutput.hx"
		{
			//line 30 "/usr/local/lib/haxe/std/java/io/NativeOutput.hx"
			boolean __temp_executeDef1 = true;
			//line 30 "/usr/local/lib/haxe/std/java/io/NativeOutput.hx"
			switch (field.hashCode())
			{
				case -891990144:
				{
					//line 30 "/usr/local/lib/haxe/std/java/io/NativeOutput.hx"
					if (field.equals("stream")) 
					{
						//line 30 "/usr/local/lib/haxe/std/java/io/NativeOutput.hx"
						__temp_executeDef1 = false;
						//line 30 "/usr/local/lib/haxe/std/java/io/NativeOutput.hx"
						this.stream = ((java.io.OutputStream) (value) );
						//line 30 "/usr/local/lib/haxe/std/java/io/NativeOutput.hx"
						return value;
					}
					
					//line 30 "/usr/local/lib/haxe/std/java/io/NativeOutput.hx"
					break;
				}
				
				
			}
			
			//line 30 "/usr/local/lib/haxe/std/java/io/NativeOutput.hx"
			if (__temp_executeDef1) 
			{
				//line 30 "/usr/local/lib/haxe/std/java/io/NativeOutput.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 30 "/usr/local/lib/haxe/std/java/io/NativeOutput.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 30 "/usr/local/lib/haxe/std/java/io/NativeOutput.hx"
		{
			//line 30 "/usr/local/lib/haxe/std/java/io/NativeOutput.hx"
			boolean __temp_executeDef1 = true;
			//line 30 "/usr/local/lib/haxe/std/java/io/NativeOutput.hx"
			switch (field.hashCode())
			{
				case -1406851705:
				{
					//line 30 "/usr/local/lib/haxe/std/java/io/NativeOutput.hx"
					if (field.equals("writeByte")) 
					{
						//line 30 "/usr/local/lib/haxe/std/java/io/NativeOutput.hx"
						__temp_executeDef1 = false;
						//line 30 "/usr/local/lib/haxe/std/java/io/NativeOutput.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "writeByte")) );
					}
					
					//line 30 "/usr/local/lib/haxe/std/java/io/NativeOutput.hx"
					break;
				}
				
				
				case -891990144:
				{
					//line 30 "/usr/local/lib/haxe/std/java/io/NativeOutput.hx"
					if (field.equals("stream")) 
					{
						//line 30 "/usr/local/lib/haxe/std/java/io/NativeOutput.hx"
						__temp_executeDef1 = false;
						//line 30 "/usr/local/lib/haxe/std/java/io/NativeOutput.hx"
						return this.stream;
					}
					
					//line 30 "/usr/local/lib/haxe/std/java/io/NativeOutput.hx"
					break;
				}
				
				
			}
			
			//line 30 "/usr/local/lib/haxe/std/java/io/NativeOutput.hx"
			if (__temp_executeDef1) 
			{
				//line 30 "/usr/local/lib/haxe/std/java/io/NativeOutput.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 30 "/usr/local/lib/haxe/std/java/io/NativeOutput.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 30 "/usr/local/lib/haxe/std/java/io/NativeOutput.hx"
		baseArr.push("stream");
		//line 30 "/usr/local/lib/haxe/std/java/io/NativeOutput.hx"
		{
			//line 30 "/usr/local/lib/haxe/std/java/io/NativeOutput.hx"
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}



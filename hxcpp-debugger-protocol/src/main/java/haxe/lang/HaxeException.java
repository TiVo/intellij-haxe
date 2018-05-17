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
package haxe.lang;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class HaxeException extends RuntimeException
{
	public static final long serialVersionUID = 5956463319488556322L;public HaxeException(Object obj, String msg, Throwable cause)
	{
		//line 49 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\Exceptions.hx"
		super(msg, cause);
		//line 51 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\Exceptions.hx"
		if (( obj instanceof HaxeException ))
		{
			//line 53 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\Exceptions.hx"
			HaxeException _obj = ((HaxeException) (obj) );
			//line 54 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\Exceptions.hx"
			obj = _obj.getObject();
		}
		
		//line 57 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\Exceptions.hx"
		this.obj = obj;
	}
	
	
	public static RuntimeException wrap(Object obj)
	{
		//line 88 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\Exceptions.hx"
		RuntimeException ret = null;
		//line 89 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\Exceptions.hx"
		if (( obj instanceof RuntimeException ))
		{
			//line 90 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\Exceptions.hx"
			ret = ((RuntimeException) (obj) );
		}
		else
		{
			//line 91 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\Exceptions.hx"
			if (( obj instanceof String ))
			{
				//line 92 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\Exceptions.hx"
				ret = new HaxeException(obj, Runtime.toString(obj), null);
			}
			else
			{
				//line 93 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\Exceptions.hx"
				if (( obj instanceof Throwable ))
				{
					//line 94 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\Exceptions.hx"
					ret = new HaxeException(obj, haxe.root.Std.string(obj), ((Throwable) (obj) ));
				}
				else
				{
					//line 96 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\Exceptions.hx"
					ret = new HaxeException(obj, haxe.root.Std.string(obj), null);
				}
				
			}
			
		}
		
		//line 97 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\Exceptions.hx"
		return ret;
	}
	
	
	public Object obj;
	
	public Object getObject()
	{
		//line 62 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\Exceptions.hx"
		return this.obj;
	}
	
	
	@Override public Throwable fillInStackTrace()
	{
		//line 68 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\Exceptions.hx"
		return this;
	}
	
	
	@Override public String toString()
	{
		//line 74 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\Exceptions.hx"
		return ( "Haxe Exception: " + haxe.root.Std.string(this.obj) );
	}
	
	
	@Override public String getMessage()
	{
		//line 79 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\Exceptions.hx"
		String _g = super.getMessage();
		//line 81 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\Exceptions.hx"
		if (( _g == null )) 
		{
			//line 81 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\Exceptions.hx"
			return haxe.root.Std.string(this.obj);
		}
		else
		{
			//line 82 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\Exceptions.hx"
			String message = _g;
			//line 82 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\Exceptions.hx"
			return message;
		}
		
	}
	
	
}


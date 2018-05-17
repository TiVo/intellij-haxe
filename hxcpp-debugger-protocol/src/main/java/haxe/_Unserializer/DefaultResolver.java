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
package haxe._Unserializer;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class DefaultResolver extends haxe.lang.HxObject
{
	public DefaultResolver(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public DefaultResolver()
	{
		//line 476 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Unserializer.hx"
		DefaultResolver.__hx_ctor_haxe__Unserializer_DefaultResolver(this);
	}
	
	
	public static void __hx_ctor_haxe__Unserializer_DefaultResolver(DefaultResolver __hx_this)
	{
	}
	
	
	public final Class resolveClass(String name)
	{
		//line 477 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Unserializer.hx"
		return Type.resolveClass(name);
	}
	
	
	public final Class resolveEnum(String name)
	{
		//line 478 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Unserializer.hx"
		return Type.resolveEnum(name);
	}
	
	
	@Override public Object __hx_getField(String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 475 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Unserializer.hx"
		{
			//line 475 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Unserializer.hx"
			boolean __temp_executeDef1 = true;
			//line 475 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Unserializer.hx"
			switch (field.hashCode())
			{
				case 1952363789:
				{
					//line 475 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Unserializer.hx"
					if (field.equals("resolveEnum")) 
					{
						//line 475 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Unserializer.hx"
						__temp_executeDef1 = false;
						//line 475 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Unserializer.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "resolveEnum")) );
					}
					
					//line 475 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Unserializer.hx"
					break;
				}
				
				
				case 391809772:
				{
					//line 475 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Unserializer.hx"
					if (field.equals("resolveClass")) 
					{
						//line 475 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Unserializer.hx"
						__temp_executeDef1 = false;
						//line 475 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Unserializer.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "resolveClass")) );
					}
					
					//line 475 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Unserializer.hx"
					break;
				}
				
				
			}
			
			//line 475 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Unserializer.hx"
			if (__temp_executeDef1) 
			{
				//line 475 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Unserializer.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 475 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Unserializer.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public Object __hx_invokeField(String field, Array dynargs)
	{
		//line 475 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Unserializer.hx"
		{
			//line 475 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Unserializer.hx"
			boolean __temp_executeDef1 = true;
			//line 475 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Unserializer.hx"
			switch (field.hashCode())
			{
				case 1952363789:
				{
					//line 475 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Unserializer.hx"
					if (field.equals("resolveEnum")) 
					{
						//line 475 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Unserializer.hx"
						__temp_executeDef1 = false;
						//line 475 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Unserializer.hx"
						return this.resolveEnum(haxe.lang.Runtime.toString(dynargs.__get(0)));
					}
					
					//line 475 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Unserializer.hx"
					break;
				}
				
				
				case 391809772:
				{
					//line 475 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Unserializer.hx"
					if (field.equals("resolveClass")) 
					{
						//line 475 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Unserializer.hx"
						__temp_executeDef1 = false;
						//line 475 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Unserializer.hx"
						return this.resolveClass(haxe.lang.Runtime.toString(dynargs.__get(0)));
					}
					
					//line 475 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Unserializer.hx"
					break;
				}
				
				
			}
			
			//line 475 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Unserializer.hx"
			if (__temp_executeDef1) 
			{
				//line 475 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Unserializer.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			else
			{
				//line 475 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Unserializer.hx"
				throw null;
			}
			
		}
		
	}
	
	
}


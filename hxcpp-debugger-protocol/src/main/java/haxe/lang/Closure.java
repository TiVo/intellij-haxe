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
public class Closure extends haxe.lang.VarArgsBase
{
	public Closure(Object obj, String field)
	{
		//line 71 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\Function.hx"
		super(-1, -1);
		//line 72 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\Function.hx"
		this.obj = obj;
		//line 73 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\Function.hx"
		this.field = field;
	}
	
	
	public Object obj;
	
	public String field;
	
	@Override public Object __hx_invokeDynamic(haxe.root.Array dynArgs)
	{
		//line 78 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\Function.hx"
		return haxe.lang.Runtime.callField(this.obj, this.field, dynArgs);
	}
	
	
	@Override public boolean equals(Object obj)
	{
		//line 83 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\Function.hx"
		if (( obj == null )) 
		{
			//line 84 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\Function.hx"
			return false;
		}
		
		//line 86 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\Function.hx"
		Closure c = ((Closure) (obj) );
		//line 87 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\Function.hx"
		if (haxe.lang.Runtime.eq(c.obj, this.obj)) 
		{
			//line 87 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\Function.hx"
			return haxe.lang.Runtime.valEq(c.field, this.field);
		}
		else
		{
			//line 87 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\Function.hx"
			return false;
		}
		
	}
	
	
	@Override public int hashCode()
	{
		//line 92 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\Function.hx"
		return ( ((int) (haxe.lang.Runtime.toInt(this.obj.hashCode())) ) ^ ((int) (this.field.hashCode()) ) );
	}
	
	
}


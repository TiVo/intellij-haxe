// Generated by Haxe 4.0.0-preview.5+7eb789f54
package debugger;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class StructuredValue extends haxe.lang.ParamEnum
{
	public StructuredValue(int index, java.lang.Object[] params)
	{
		//line 256 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		super(index, params);
	}
	
	
	public static final java.lang.String[] __hx_constructs = new java.lang.String[]{"Elided", "Single", "List"};
	
	public static debugger.StructuredValue Elided(debugger.StructuredValueType type, java.lang.String getExpression)
	{
		//line 325 "C:\\HaxeToolkit\\haxe\\lib\\hxcpp-debugger\\git\\debugger\\IController.hx"
		return new debugger.StructuredValue(0, new java.lang.Object[]{type, getExpression});
	}
	
	
	public static debugger.StructuredValue Single(debugger.StructuredValueType type, java.lang.String value)
	{
		//line 327 "C:\\HaxeToolkit\\haxe\\lib\\hxcpp-debugger\\git\\debugger\\IController.hx"
		return new debugger.StructuredValue(1, new java.lang.Object[]{type, value});
	}
	
	
	public static debugger.StructuredValue List(debugger.StructuredValueListType type, debugger.StructuredValueList list)
	{
		//line 329 "C:\\HaxeToolkit\\haxe\\lib\\hxcpp-debugger\\git\\debugger\\IController.hx"
		return new debugger.StructuredValue(2, new java.lang.Object[]{type, list});
	}
	
	
	@Override public java.lang.String getTag()
	{
		//line 320 "C:\\HaxeToolkit\\haxe\\lib\\hxcpp-debugger\\git\\debugger\\IController.hx"
		return debugger.StructuredValue.__hx_constructs[this.index];
	}
	
	
}



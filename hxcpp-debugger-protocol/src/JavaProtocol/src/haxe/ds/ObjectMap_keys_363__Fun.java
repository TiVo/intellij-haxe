// Generated by Haxe
package haxe.ds;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class ObjectMap_keys_363__Fun<V, K> extends haxe.lang.Function
{
	public ObjectMap_keys_363__Fun(int len, int[] i, haxe.ds.ObjectMap<K, V> _g2)
	{
		//line 363 "/usr/local/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
		super(0, 0);
		//line 363 "/usr/local/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
		this.len = len;
		//line 363 "/usr/local/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
		this.i = i;
		//line 363 "/usr/local/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
		this._g2 = _g2;
	}
	
	
	@Override public java.lang.Object __hx_invoke0_o()
	{
		//line 364 "/usr/local/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
		{
			//line 364 "/usr/local/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
			int _g1 = this.i[0];
			//line 364 "/usr/local/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
			int _g = this.len;
			//line 364 "/usr/local/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
			while (( _g1 < _g ))
			{
				//line 364 "/usr/local/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
				int j = _g1++;
				//line 366 "/usr/local/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
				if (( (( this._g2.hashes[j] & -2 )) != 0 )) 
				{
					//line 368 "/usr/local/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					this.i[0] = j;
					//line 369 "/usr/local/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
					return true;
				}
				
			}
			
		}
		
		//line 372 "/usr/local/lib/haxe/std/java/_std/haxe/ds/ObjectMap.hx"
		return false;
	}
	
	
	public int len;
	
	public int[] i;
	
	public haxe.ds.ObjectMap<K, V> _g2;
	
}


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
package haxe.root;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Sys extends haxe.lang.HxObject
{
	public Sys(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Sys()
	{
		//line 27 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
		Sys.__hx_ctor__Sys(this);
	}
	
	
	public static void __hx_ctor__Sys(Sys __hx_this)
	{
	}
	
	
	public static String[] _args;
	
	public static haxe.ds.StringMap<String> _env;
	
	public static String _sysName;
	
	public static void print(Object v)
	{
		//line 34 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
		System.out.print(((Object) (v) ));
	}
	
	
	public static void println(Object v)
	{
		//line 39 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
		System.out.println(((Object) (v) ));
	}
	
	
	public static haxe.root.Array<String> args()
	{
		//line 44 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
		if (( Sys._args == null ))
		{
			//line 45 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
			return new haxe.root.Array<String>(new String[]{});
		}
		
		//line 46 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
		return haxe.java.Lib.array_String(Sys._args);
	}
	
	
	public static String getEnv(String s)
	{
		//line 51 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
		return System.getenv(haxe.lang.Runtime.toString(s));
	}
	
	
	public static void putEnv(String s, String v)
	{
		//line 57 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
		throw haxe.lang.HaxeException.wrap("Not implemented in this platform");
	}
	
	
	public static haxe.ds.StringMap<String> environment()
	{
		//line 62 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
		if (( Sys._env != null ))
		{
			//line 63 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
			return ((haxe.ds.StringMap<String>) (Sys._env) );
		}
		
		//line 64 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
		haxe.ds.StringMap<String> _env = Sys._env = new haxe.ds.StringMap<String>();
		//line 65 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
		{
			//line 65 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
			java.util.Iterator<java.util.Map.Entry<String, String>> mv = System.getenv().entrySet().iterator();
			//line 65 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
			while (mv.hasNext())
			{
				//line 65 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
				java.util.Map.Entry<String, String> mv1 = mv.next();
				//line 67 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
				_env.set(mv1.getKey(), mv1.getValue());
			}
			
		}
		
		//line 70 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
		return ((haxe.ds.StringMap<String>) (_env) );
	}
	
	
	public static void sleep(double seconds)
	{
		//line 76 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
		try 
		{
			//line 76 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
			Thread.sleep(((long) (( seconds * 1000 )) ));
		}
		catch (Throwable __temp_catchallException1)
		{
			//line 76 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
			haxe.lang.Exceptions.setException(__temp_catchallException1);
			//line 78 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
			Object __temp_catchall2 = __temp_catchallException1;
			//line 78 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
			if (( __temp_catchall2 instanceof haxe.lang.HaxeException )) 
			{
				//line 78 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
				__temp_catchall2 = ((haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
			}
			
			//line 78 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
			{
				//line 78 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
				Object e = __temp_catchall2;
				//line 78 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
				throw haxe.lang.HaxeException.wrap(e);
			}
			
		}
		
		
	}
	
	
	public static boolean setTimeLocale(String loc)
	{
		//line 83 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
		return false;
	}
	
	
	public static String getCwd()
	{
		//line 88 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
		return haxe.lang.StringExt.substr(new java.io.File(haxe.lang.Runtime.toString(".")).getAbsolutePath(), 0, -1);
	}
	
	
	public static void setCwd(String s)
	{
		//line 94 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
		throw haxe.lang.HaxeException.wrap("not implemented");
	}
	
	
	public static String systemName()
	{
		//line 99 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
		if (( Sys._sysName != null ))
		{
			//line 99 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
			return Sys._sysName;
		}
		
		//line 100 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
		String sname = System.getProperty(haxe.lang.Runtime.toString("os.name")).toLowerCase();
		//line 101 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
		if (( haxe.lang.StringExt.indexOf(sname, "win", null) >= 0 )) 
		{
			//line 102 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
			return Sys._sysName = "Windows";
		}
		
		//line 103 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
		if (( haxe.lang.StringExt.indexOf(sname, "mac", null) >= 0 )) 
		{
			//line 104 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
			return Sys._sysName = "Mac";
		}
		
		//line 105 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
		if (( haxe.lang.StringExt.indexOf(sname, "nux", null) >= 0 )) 
		{
			//line 106 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
			return Sys._sysName = "Linux";
		}
		
		//line 107 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
		if (( haxe.lang.StringExt.indexOf(sname, "nix", null) >= 0 )) 
		{
			//line 108 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
			return Sys._sysName = "BSD";
		}
		
		//line 110 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
		return Sys._sysName = System.getProperty(haxe.lang.Runtime.toString("os.name"));
	}
	
	
	public static int command(String cmd, haxe.root.Array<String> args)
	{
		//line 114 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
		try 
		{
			//line 115 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
			ProcessBuilder pb = sys.io.Process.createProcessBuilder(cmd, args);
			//line 117 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
			pb.redirectErrorStream(((boolean) (true) ));
			//line 122 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
			Process proc = pb.start();
			//line 124 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
			haxe.java.io.NativeInput reader = new haxe.java.io.NativeInput(((java.io.InputStream) (proc.getInputStream()) ));
			//line 127 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
			try 
			{
				//line 127 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
				while (true)
				{
					//line 128 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
					String ln = reader.readLine();
					//line 129 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
					System.out.println(((Object) (ln) ));
				}
				
			}
			catch (Throwable __temp_catchallException1)
			{
				//line 127 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
				haxe.lang.Exceptions.setException(__temp_catchallException1);
				//line 132 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
				Object __temp_catchall2 = __temp_catchallException1;
				//line 132 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
				if (( __temp_catchall2 instanceof haxe.lang.HaxeException )) 
				{
					//line 132 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
					__temp_catchall2 = ((haxe.lang.HaxeException) (__temp_catchallException1) ).obj;
				}
				
				//line 132 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
				if (( __temp_catchall2 instanceof haxe.io.Eof )) 
				{
					//line 132 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
					haxe.io.Eof e = ((haxe.io.Eof) (__temp_catchall2) );
					//line 132 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
					{
					}
					
				}
				else
				{
					//line 132 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
					throw haxe.lang.HaxeException.wrap(__temp_catchallException1);
				}
				
			}
			
			
			//line 134 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
			proc.waitFor();
			//line 135 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
			int exitCode = proc.exitValue();
			//line 136 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
			proc.destroy();
			//line 137 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
			return exitCode;
		}
		catch (Throwable typedException)
		{
			//line 113 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
			throw haxe.lang.HaxeException.wrap(typedException);
		}
		
		
	}
	
	
	public static void exit(int code)
	{
		//line 142 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
		System.exit(((int) (code) ));
	}
	
	
	public static double time()
	{
		//line 147 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
		return (((double) (System.currentTimeMillis()) ) / 1000 );
	}
	
	
	public static double cpuTime()
	{
		//line 152 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
		return (((double) (System.nanoTime()) ) / 1000000000 );
	}
	
	
	public static String executablePath()
	{
		//line 157 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
		return Sys.getCwd();
	}
	
	
	public static String programPath()
	{
		//line 161 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
		try 
		{
			//line 161 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
			return ((Class) (((Class) (Sys.class) )) ).getProtectionDomain().getCodeSource().getLocation().toURI().getPath();
		}
		catch (Throwable typedException)
		{
			//line 160 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
			throw haxe.lang.HaxeException.wrap(typedException);
		}
		
		
	}
	
	
	public static int getChar(boolean echo)
	{
		//line 170 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
		throw haxe.lang.HaxeException.wrap("Not implemented");
	}
	
	
	public static haxe.io.Input stdin()
	{
		//line 175 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
		java.io.InputStream _in = ((java.io.InputStream) (haxe.lang.Runtime.getField(System.class, "in", false)) );
		//line 176 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
		return new haxe.java.io.NativeInput(((java.io.InputStream) (_in) ));
	}
	
	
	public static haxe.io.Output stdout()
	{
		//line 181 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
		return new haxe.java.io.NativeOutput(((java.io.OutputStream) (System.out) ));
	}
	
	
	public static haxe.io.Output stderr()
	{
		//line 186 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\Sys.hx"
		return new haxe.java.io.NativeOutput(((java.io.OutputStream) (System.err) ));
	}
	
	
}


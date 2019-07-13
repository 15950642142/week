package com.bw.spp;

import java.util.Collection;
import java.util.Map;

public class AssertUtil {

		public static void isTrue(boolean exp,String message){
			if(!exp){
				throw new CRuntimeException(message);
			}
		}
		
		public static void isFalse(boolean exp,String message){
			if(exp){
				throw new CRuntimeException(message);
			}
		}
		//断言对象不为空；
		public static void isNotNull(Object exp,String message){
			if(exp==null){
				throw new CRuntimeException(message);
			}
		}
		public static void isNotNull2(String exp,String message){
			if(exp==null||exp.length()==0){
				throw new CRuntimeException(message);
			}
		}
		
		//断言对象为空；
				public static void isNull(Object exp,String message){
					if(!(exp==null)){
						throw new CRuntimeException(message);
					}
				}
				public static void isNull2(String exp,String message){
					if(exp.length()>0){
						throw new CRuntimeException(message);
					}
				}
		
			public static void collectionNotNull(Collection<?> col,String message){
				if(col==null||col.size()==0){
					throw new CRuntimeException(message);
				}
			}
			
			//断言 Map 集合不为空，没有元素也算空； 
			public static void mapNotNull(Map<?, ?>map,String message){
				if(map == null||map.size()==0){
					throw new CRuntimeException(message);
				}
			}
			
			 //断言字符串必须有值，去掉空格后，长度必须大于 0； 
		public static void isLength(String exp,String message){
			String s = exp.replaceAll(" ", "");
			if(!(s.length()>0)){
				throw new CRuntimeException(message);
			}
		}
		
		//断言值必须是正数(值大于 0)； 
		public static void absInt(int exp,String message){
			if(exp<=0){
				throw new CRuntimeException(message);
			}
		}
	
}

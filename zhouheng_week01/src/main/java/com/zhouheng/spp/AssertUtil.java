package com.zhouheng.spp;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Map;

public class AssertUtil {

	
		public static void isTrue(boolean condition,String message){
			if(!condition){
				throw new ERuntimeException(message);
			}
		}
		
		
		public static void isFalse(boolean condition,String message){
			if(condition){
				throw new ERuntimeException(message);
			}
		}
		
		public static void notNull(Object obj, String message){
			if(obj==null){
				throw new ERuntimeException(message);
			}
		}
		public static void isNull(Object obj, String message){
			if(!(obj==null)){
				throw new ERuntimeException(message);
			}
		}
		
		public static void notEmpty(Collection<?> coll, String message){
					
			if(coll==null || coll.size()==0){
				throw new ERuntimeException(message);
			}
		}
		
		public static void notEmpty(Map<?,?> map, String message){
			if(map==null||map.size()==0){
				throw new ERuntimeException(message);
			}
			}
		
		public static void hasText(String condition, String message){
					String s = condition.replace(" ", "");
					if(s.length()==0){
						throw new ERuntimeException(message);
					}
			}
		
		public static void greaterThanZero(int value, String message){
				if(value<0){
					throw new ERuntimeException(message);
				}
			}



		

}

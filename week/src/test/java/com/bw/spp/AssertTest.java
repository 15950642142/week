package com.bw.spp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class AssertTest {

		@Test
		public void funTest1(){
			try {
				AssertUtil.isTrue(true, "这不是一个true");
			} catch (CRuntimeException e) {
				e.printStackTrace();
			}
		}
		
	
		
		@Test
		public void funTest2(){
			try {
				AssertUtil.isTrue(false, "这不是一个true");
			} catch (CRuntimeException e) {
				e.printStackTrace();
			}
		}
		
		@Test
		public void funTest3(){
			try {
				AssertUtil.isFalse(true, "这不是一个false");
			} catch (CRuntimeException e) {
				e.printStackTrace();
			}
		} 
		
		@Test
		public void funTest4(){
			try {
				AssertUtil.isFalse(false, "这不是一个false");
			} catch (CRuntimeException e) {
				e.printStackTrace();
			}
		} 
		
		@Test
		public void funTest5(){
			try {
				String s=null;
				AssertUtil.isNotNull(s, "这是一个空的");
			} catch (CRuntimeException e) {
				e.printStackTrace();
			}
		}
		@Test
		public void funTest6(){
			try {
				String s="aaa";
				AssertUtil.isNotNull(s, "这是一个空的");
			} catch (CRuntimeException e) {
				e.printStackTrace();
			}
		}
		
		@Test
		public void funTest7(){
			try {
				String s=null;
				AssertUtil.isNull(s, "这不是一个空的");
			} catch (CRuntimeException e) {
				e.printStackTrace();
			}
		}
		@Test
		public void funTest8(){
			try {
				String s="aaa";
				AssertUtil.isNull(s, "这不是一个空的");
			} catch (CRuntimeException e) {
				e.printStackTrace();
			}
		}
		
		@Test
		public void funTest9(){
			try {
				ArrayList<Integer> list = new ArrayList<Integer>();
				
				AssertUtil.collectionNotNull(list, "这是一个空的colection");
				
			} catch (CRuntimeException e) {
				e.printStackTrace();
			}
		}
		@Test
		public void funTest10(){
			try {
				ArrayList<Integer> list = new ArrayList<Integer>();
				list.add(5);
				AssertUtil.collectionNotNull(list, "这是一个空的colection");
				
			} catch (CRuntimeException e) {
				e.printStackTrace();
			}
		}
		
		@Test
		public void funTest11(){
			try {
				Map<?, ?> map = new HashMap<Object, Object>();
				
				AssertUtil.mapNotNull(map, "这是一个空的map");
				
			} catch (CRuntimeException e) {
				e.printStackTrace();
			}
		}
		@Test
		public void funTest12(){
			try {
				Map<String,String> map = new HashMap<String, String>();
				map.put("a", "12");
				AssertUtil.mapNotNull(map, "这是一个空的map");
				
			} catch (CRuntimeException e) {
				e.printStackTrace();
			}
		}
		
		@Test
		public void funTest13(){
			try {
				String str=" ";
				AssertUtil.isLength(str, "这个字符串没有长度");
			} catch (CRuntimeException e) {
				e.printStackTrace();
			}
		}
		@Test
		public void funTest14(){
			try {
				String str="a b c";
				AssertUtil.isLength(str, "这个字符串没有长度");
				
			} catch (CRuntimeException e) {
				e.printStackTrace();
			}
		}
		
		@Test
		public void funTest15(){
			try {
				int n=-5;
				AssertUtil.absInt(n, "这个数不是正数");
				
			} catch (CRuntimeException e) {
				e.printStackTrace();
			}
		}
		@Test
		public void funTest16(){
			try {
				int n=5;
				AssertUtil.absInt(n, "这个数不是正数");
				
			} catch (CRuntimeException e) {
				e.printStackTrace();
			}
		}
}

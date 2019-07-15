package com.zhouheng.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.zhouheng.spp.AssertUtil;
import com.zhouheng.spp.ERuntimeException;

public class AssertTest {

	@Test
	public void testDemo1(){
		try {
			AssertUtil.isTrue(true, "这不是一个true");
			
		} catch (ERuntimeException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testDemo2(){
		try {
			AssertUtil.isTrue(false, "这不是一个true");
			
		} catch (ERuntimeException e) {
			e.printStackTrace();
		}
	}
	@Test
	public void testDemo3(){
		try {
			AssertUtil.isFalse(false, "这不是一个false");
			
		} catch (ERuntimeException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testDemo4(){
		try {
			AssertUtil.isFalse(true, "这不是一个false");
			
		} catch (ERuntimeException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testDemo5(){
		try {
			String s = new String("55");
			
			AssertUtil.notNull(s, "断言对象为空");
			
		} catch (ERuntimeException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testDemo6(){
		try {
			String s = null;
			
			AssertUtil.notNull(s, "断言对象为空");
			
		} catch (ERuntimeException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testDemo7(){
		try {
			String s = null;
			
			AssertUtil.isNull(s, "断言对象不为空");
			
		} catch (ERuntimeException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testDemo8(){
		try {
			String s = new String("55");
			
			AssertUtil.isNull(s, "断言对象不为空");
			
		} catch (ERuntimeException e) {
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void testDemo9(){
		try {
			ArrayList<Integer> list = new ArrayList<Integer>();
			list.add(5);
			AssertUtil.notEmpty(list, "断言集合为空");
			
		} catch (ERuntimeException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testDemo10(){
		try {
			ArrayList<Integer> list = new ArrayList<Integer>();
			
			AssertUtil.notEmpty(list, "断言集合为空");
			
		} catch (ERuntimeException e) {
			e.printStackTrace();
		}
	}
	

	@Test
	public void testDemo11(){
		try {
			Map<String, String> map = new HashMap<String, String>();
			map.put("zs", "123");
			
			AssertUtil.notEmpty(map, "map集合为空");
			
		} catch (ERuntimeException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testDemo12(){
		try {
			Map<String, String> map = new HashMap<String, String>();
			
			
			AssertUtil.notEmpty(map, "map集合为空");
			
		} catch (ERuntimeException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testDemo13(){
		try {
			String s = "a b c";
			
			
			AssertUtil.hasText(s, "断言字符串没有值");
			
		} catch (ERuntimeException e) {
			e.printStackTrace();
		}
	}
	@Test
	public void testDemo14(){
		try {
			String s = " ";
			
			
			AssertUtil.hasText(s, "断言字符串没有值");
			
		} catch (ERuntimeException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testDemo15(){
		try {
			
			
			
			AssertUtil.greaterThanZero(5, "断言值必须大于0");
			
		} catch (ERuntimeException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testDemo16(){
		try {
			
			
			
			AssertUtil.greaterThanZero(-5, "断言值必须大于0");
			
		} catch (ERuntimeException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
}

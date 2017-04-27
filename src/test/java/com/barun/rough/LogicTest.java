/**
 * 
 */
package com.barun.rough;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections4.CollectionUtils;
import org.junit.Test;

import com.barun.rough.model.A;
import com.barun.rough.model.B;
import com.barun.rough.model.C;
import com.barun.rough.model.D;

/**
 * @author bibhu
 *
 */
public class LogicTest {

	@Test
	public void testLogic(){
		D d = populateD();
		Map<String,String> map = new HashMap<String,String>();
		map.put("ABC", "Green");
		//map.put("DEF", "Orange");
		map.put("GHI", "Red");
		String str= findValue(map,d);
		assertEquals("Red", str);
		
		
	}
	@Test
	public void testLogic1(){
		D d = populateD();
		/*System.out.println(d.getA());
		System.out.println(d.getBs());
		System.out.println(d.getCs());*/
		Map<String,String> map = new HashMap<String,String>();
		map.put("ABC", "Apple");
		map.put("DEF", "Orange");
		map.put("GHI", "Papaya");
		String str= findValue(map,d);
		assertEquals("Papaya", str);
		
		
	}
	
	private String findValue(Map<String, String> map, D d) {
		Map<String,String> resultedMap = null;
		List<B> bs = d.getBs();
		List<List<C>> cs = d.getCs();
		if(null != cs && null != bs){
			resultedMap = findReleventMap(map, bs, cs);
			return resultedMap.get("GHI");
		}
		return null;
	}
	/**
	 * @param map
	 * @param actualResult
	 * @param bs
	 * @param cs
	 */
	private Map<String,String> findReleventMap(Map<String, String> map,  List<B> bs,
			List<List<C>> cs) {
		Map<String, String> actualResult = new HashMap<String,String>();
		for(int i=1; i <= cs.size();i++){
			for(B b: bs){
				for(List<C> listC : cs){
					for(C c: listC){
						if(b.getId() == c.getForeignKey() && c.getRecord() == i){
							actualResult.put(b.getColumn(), c.getValue());
						}
					}
				}
			}
			if(CollectionUtils.containsAll(actualResult.values(),map.values())){
				return actualResult;
			}
		}
		return Collections.emptyMap();
	}
	public D populateD(){
		D d = new D();
		A a = new A();
		a.setId("1");
		a.setName("App1");
		d.setA(a );
		
		List<B> bs = new ArrayList<B>();
		B b = new B();
		b.setId("11");
		b.setColumn("ABC");
		b.setRemark("ABC");
		bs.add(b );
		
		B b1 = new B();
		b1.setId("12");
		b1.setColumn("DEF");
		b1.setRemark("DEF");
		bs.add(b1);
		
		B b2 = new B();
		b2.setId("13");
		b2.setColumn("GHI");
		b2.setRemark("GHI");
		bs.add(b2);
		
		d.setBs(bs);
		
		List<List<C>> cs = new ArrayList<List<C>>();
		
		List<C> e = new ArrayList<C>();
		C f = new C();
		f.setId("201");
		f.setRecord(1);
		f.setValue("Apple");
		f.setForeignKey("11");
		e.add(f );
		C f1 = new C();
		f1.setId("202");
		f1.setRecord(1);
		f1.setValue("Orange");
		f1.setForeignKey("12");
		e.add(f1);
		C f2 = new C();
		f2.setId("203");
		f2.setRecord(1);
		f2.setValue("Papaya");
		f2.setForeignKey("13");
		e.add(f2);
		
		cs.add(e);
		
		List<C> g = new ArrayList<C>();
		C h = new C();
		h.setId("211");
		h.setRecord(2);
		h.setValue("Green");
		h.setForeignKey("11");
		g.add(h);
		C h1 = new C();
		h1.setId("212");
		h1.setRecord(2);
		h1.setValue("Orange");
		h1.setForeignKey("12");
		g.add(h1);
		C h2 = new C();
		h2.setId("213");
		h2.setRecord(2);
		h2.setValue("Red");
		h2.setForeignKey("13");
		g.add(h2);
		cs.add(g);
		
		
		d.setCs(cs );
		return d;
		
	}
}

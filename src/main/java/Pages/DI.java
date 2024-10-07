package Pages;

import java.util.HashMap;

public class DI {
	
	public HashMap<String,Integer> hm;
	
	
	
	public DI()
	{
		hm=new HashMap<String,Integer>();
	}
	
	public void setData(String key, int value)
	{
		hm.put(key, value);
	}
	
	public Integer getData(String key)
	{
		return hm.get(key);
	}
	
	

}

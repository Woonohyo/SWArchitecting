package grayBox;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root
public class Configuration {
	
	@Element
	private String sortingMethod;
	
	public Configuration(String sortingMethod)
	{
		this.sortingMethod = sortingMethod;
	}
	
	public String getMethod()
	{
		return this.sortingMethod;
	}
}


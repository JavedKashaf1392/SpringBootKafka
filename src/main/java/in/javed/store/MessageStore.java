package in.javed.store;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class MessageStore {
	
	private List<String> list=new ArrayList<String>();
	
	
	public void addData(String message) {
		list.add(message);
	}
	
	public String readAll() {
		return list.toString();
	}

}

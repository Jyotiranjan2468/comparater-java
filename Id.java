package comparater;

import java.util.Comparator;

public class Id implements Comparator<Emp> {

	@Override
	public int compare(Emp o1, Emp o2) {
		return o1.getId()-o2.getId();
	}
	
}

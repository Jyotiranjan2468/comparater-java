package comparater;

import java.util.ArrayList;
import java.util.Collections;

public class comparater {
	public static void main(String[] args) {
		ArrayList<Emp> list=new ArrayList<>();
		list.add(new Emp(10,"bapi","bbsr"));
		list.add(new Emp(15,"papi","mumbai"));
		list.add(new Emp(12,"rakesh","banglore"));
		list.add(new Emp(9,"dheru","hydrabade"));
		System.out.println(list);
		Collections.sort(list,new Id());
		System.out.println(list);
	}

}

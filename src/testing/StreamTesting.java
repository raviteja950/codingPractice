package testing;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTesting {

	public static void main(String[] args) {
		
		String s[]= {"nextgen.xml","nextgen1.xml"};
		
		List<String> r= Arrays.stream(s)
				.filter(e ->e.endsWith(".xml"))
				.map(e -> e.replaceAll(".xml", ""))
				.collect(Collectors.toList());
		
		System.out.println(r);

	}

}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Base {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do {
			String input = br.readLine().trim();
			StringTokenizer st = new StringTokenizer(input);

			String s1 = st.nextToken();
			String s2 = st.nextToken().replace(" ", "");

			HashMap<Integer, Integer> map1 = new HashMap<>();
			HashMap<Integer, Integer> map2 = new HashMap<>();

			int base1 = 0;
			int base2 = 0;

			for (int j = 2; j <= 36; j++) {
				try {
					int c = Integer.parseInt(s1, j);
					map1.put(j, c);
				} catch (Exception e) {

				}
			}

			for (int j = 2; j <= 36; j++) {
				try {
					int d = Integer.parseInt(s2, j);
					map2.put(j, d);
				} catch (Exception e) {

				}
			}

			for (int i = 0; i <= map1.size(); i++) {
				for (int j = 0; j <= map2.size(); j++) {
					if (map1.get(i) == map2.get(j)) {
						if (base1 == 0 || base2 == 0) {
							base1 = i;
							base2 = j;
						}
						break;
					}
				}
			}

			if (base1 != 0 && base2 != 0) {
				System.out.println(s1 + " (base " + base1 + ") = " + s2 + " (base " + base2 + ")");
			} else {
				System.out.println(s1 + " is not equal to " + s2 + " in any base 2..36");
			}

		} while (true);

	}

}

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
		public static List<Integer> solution(String[] name, int[] yearning, String[][] photo) {
			int[] answer = {};
			List<Integer> result = new ArrayList<>();

			Map<String, Integer> map = new HashMap<>();

			for (int i = 0; i < name.length; i++) {
				map.put(name[i], yearning[i]);
			}

			for (int i = 0; i < photo.length; i++) {
				int value = 0;
				for (String str : photo[i]) {
					Integer yearningValue = map.getOrDefault(str, 0);
					value += yearningValue.intValue();
				}
				result.add(value);
			}

			return result;
		}
	}
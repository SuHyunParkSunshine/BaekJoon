import java.util.HashMap;
import java.util.Map;

class Solution {
	public String[] solution(String[] players, String[] callings) {	
		
		// HashMap Setting
		Map<String, Integer> indexMap = new HashMap<>();
		for(int i = 0; i < players.length; i++) {
			indexMap.put(players[i], i);
		}
		
		for(String calledPlayer : callings) {
			int index = indexMap.get(calledPlayer);
			
			// players 배열 갱신
			String front = players[index - 1];
			
			players[index - 1] = calledPlayer;
			players[index] = front;
			
			//indexMap 갱신
			indexMap.put(calledPlayer, index - 1);
			indexMap.put(front, index);
		}
		return players;
	}
}
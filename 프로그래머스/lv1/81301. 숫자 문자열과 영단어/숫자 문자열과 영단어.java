class Solution {
	public int solution(String s) {
		
		String [] eWords = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"}; 
		
		for(int i=0; i < eWords.length; i++) {
			s = s.replace(eWords[i], Integer.toString(i));
			
		}
		int answer = Integer.parseInt(s);
		
		return answer;				
	}
	
}
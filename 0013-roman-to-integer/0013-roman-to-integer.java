class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> romanNumerals = new HashMap<>();
        romanNumerals.put('I', 1);
        romanNumerals.put('V', 5);
        romanNumerals.put('X', 10);
        romanNumerals.put('L', 50);
        romanNumerals.put('C', 100);
        romanNumerals.put('D', 500);
        romanNumerals.put('M', 1000);

        int result = 0;
        for(int i = 0; i < s.length(); i++){
            int current = romanNumerals.get(s.charAt(i));
            int next = (i + 1 < s.length()) ? romanNumerals.get(s.charAt(i + 1)) : 0;
            result += (current < next) ? -current : current;
        }
        return result;
    }
}
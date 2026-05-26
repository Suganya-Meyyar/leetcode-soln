class Solution {
    public int numberOfSpecialChars(String word) {
        int len = word.length();
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<len;i++){
            char ch = word.charAt(i);
            set.add(ch);
        }
        int count=0;
        for(char ch : set){
            if(Character.isUpperCase(ch)){
                char c = Character.toLowerCase(ch);
                if(set.contains(c))
                count++;
            }


        }
        return count;
    }
}
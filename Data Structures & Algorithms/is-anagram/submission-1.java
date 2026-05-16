class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        Map<Character,Integer> countS=new HashMap<>();
        Map<Character,Integer> countT=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch1=s.charAt(i);
            countS.put(ch1,countS.getOrDefault(ch1,0)+1);
            char ch2=t.charAt(i);
            countT.put(ch2,countT.getOrDefault(ch2,0)+1);
        }
        return countS.equals(countT);
    }
}

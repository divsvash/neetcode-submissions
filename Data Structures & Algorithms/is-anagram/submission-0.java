class Solution {
    public boolean isAnagram(String s, String t) {
    int sl=s.length(); int tl= t.length();
    int count[]= new int[26];
    if(sl!=tl){ return false;}
    else{ 
    for(int i=0;i<sl;i++){ int index= s.charAt(i)-'a'; count[index]++;}
    for(int i=0;i<sl;i++){ int index= t.charAt(i)-'a'; count[index]--;}}
    for(int i=0;i<26;i++){ if(count[i]!=0) return false;}
   return true;
}
     }

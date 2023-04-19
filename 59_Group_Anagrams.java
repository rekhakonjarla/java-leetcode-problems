
59. Group Anagrams

solution:-

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
     Map<String, List<String>> map = new HashMap<>();
     for(String str : strs){
         Map<Character, Integer> countMap = new TreeMap<>();
         for(int i=0; i<str.length(); i++){
             countMap.put(str.charAt(i), countMap.getOrDefault(str.charAt(i),0)+1);
         }
         String s = "";
         for(Map.Entry<Character,Integer> entry : countMap.entrySet()){
             s = s + entry.getKey() + entry.getValue();
         }
         
         List<String> l = map.getOrDefault(s, new ArrayList<>());
         l.add(str);
         map.put(s,l);
     }
    
    return new ArrayList<>(map.values());
    }
}
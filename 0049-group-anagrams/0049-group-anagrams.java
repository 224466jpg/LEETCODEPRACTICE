class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>>anagram = new HashMap<>();
        for(String str : strs){
            char[] chararr = str.toCharArray();
            Arrays.sort(chararr);
        
        String sortedlist = new String(chararr);
        List<String>list;
        if(anagram.containsKey(sortedlist)){
             list = anagram.get(sortedlist);
        }
        else{
            list = new ArrayList<>();
        }
        list.add(str);
        anagram.put(sortedlist, list);
        }
        List<List<String>> list = new ArrayList<>();
        Set<Map.Entry<String ,<List<String>>>> sett = anagram.entrySet();
        for(Map.Entry<String ,<List(<String>> entry:set){
            ans.add(entry.getValue());

    }
    return ans;




    }
}
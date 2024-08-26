class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i<words.length;i++){
            String a = words[i];
            for(int j=0;j<a.length();j++){
                if(a.charAt(j)==x){
                    list.add(i);
                    break;
                }
            }
        }
        return list;
    }
}
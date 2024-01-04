package Day11;

public class MaxWordsInSentences {
    public static void main(String[] args) {
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        Solution obj = new Solution();
        System.out.println(obj.mostWordsFound(sentences));
    }
}
class Solution {
    public int mostWordsFound(String[] sentences) {
        int len=sentences.length;
        int max=1;
        for(int i=0;i<len;i++){
            int c=1;
            for(int j=0;j<sentences[i].length();j++){
                if(sentences[i].charAt(j)==' '){
                    c++;
                }
            }
            if(c>max){
                max=c;
            }
        }
        return max;
    }
}
package Day11;

public class RestoreString {
    public static void main(String[] args) {
        String s="codeleet";
        int[] indices={4,5,6,7,0,2,1,3};
        System.out.println(restoreString(s,indices));
    }
    public static String restoreString(String s, int[] indices) {
        int len=s.length();
        String ns="";
        int i,j;
        for(i=0;i<len;i++){
            for(j=0;j<len;j++){
                if(i==indices[j]){
                    break;
                }
            }
            ns+=s.charAt(j);
        }
        return ns;
    }
}
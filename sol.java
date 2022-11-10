class Solution {
    public String removeDuplicates(String s) {
        if(s.length()==1)
            return s;
        StringBuilder st = new StringBuilder(s);
        for(int i=0;i<st.length()-1;i++){
            if(st.charAt(i)==st.charAt(i+1)&&i==0){
                st.delete(i,i+2);
                i=-1;
            }
            else if(st.charAt(i)==st.charAt(i+1)){
                st.delete(i,i+2);
                i -= 2;
            }
        }
        return st.toString();
    }
}

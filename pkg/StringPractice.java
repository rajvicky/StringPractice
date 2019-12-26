import java.util.Arrays;

class StringPractice{
    public static void main(String []args){
        String st=new String ("Durga");
        System.out.println(st.hashCode());
        st.concat("bhai");
        System.out.println(st.hashCode());
        String st2="Durga";
        st = st + "bc";
        System.out.println(st.hashCode());
         boolean status=st.equals(st2);
         boolean op=st==st2;
         StringBuffer st1=new StringBuffer("Durga");
         StringBuffer St3=new StringBuffer("Durga");
         //StringBuffer st4=new StringBuffer(null);
         boolean sta=st1.equals(St3);
         System.out.println(st1==St3);
         System.out.println(st.hashCode());
         Arrays.sort(a);
         //StringBuffer stf="Hi";
         //* Check String Constant Pool
         /* If you are using string literal in string it will be created separate 
         string pool for string literalin java,
         
         */ 
    }
}
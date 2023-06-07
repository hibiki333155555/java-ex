
public class ComputeInitials {
    public static void main(String[] args){
        String s = "";
        String a = args[0];
        String ABC = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < a.length(); i++) {
            String arg = a.substring(i, i + 1);
            if(ABC.contains(arg)) s += arg;
        }
        System.out.println("My initials are: " + s);
    }
}

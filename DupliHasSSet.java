import java.util.*;

public class DupliHasSSet{
    public static boolean Dupli(int Num[]) {
        HashSet <Integer> Set =  new HashSet<>();

        for(int i =0; i <Num.length; i++) {
            if(Set.contains(Num[i])) {
                return true;
            } else {
                Set.add(Num[i]);
            }
        }

        return false;
    }

    public static void main(String args []) {
        int Num[] = {1,2,3,3,2,1};
        System.out.print(Dupli(Num));
    }

}
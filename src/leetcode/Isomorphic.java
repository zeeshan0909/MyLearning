package leetcode;

class Demoss {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;

        int[] fs = new int[256]; // Mapping for characters in s
        int[] ss = new int[256]; // Mapping for characters in t

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if (fs[sChar] != ss[tChar])
                return false;

            if (fs[sChar] == 0 && ss[tChar] == 0) {
                fs[sChar] = i + 1;
                ss[tChar] = i + 1;
            }
        }
        return true;
    }
}

public class Isomorphic {
    public static void main(String[] args) {
        Demoss ref = new Demoss();
        String ss = "egg";
        String tt = "add";
        boolean b = ref.isIsomorphic(ss, tt);
        System.out.println(b);
    }
}

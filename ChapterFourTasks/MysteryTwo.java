public class MysteryTwo {
    public static void main(String[] args) {
        int count = 1;
        while (count <= 20) {
            System.out.println(count % 3 == 1 ? "########" : "++++++++");
            ++count;
        } 
    } 
}

//prints "########" when remainder is 1 and "++++++++" when it is not

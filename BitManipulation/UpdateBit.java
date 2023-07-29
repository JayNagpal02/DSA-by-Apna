package BitManipulation;

/**
 * if bit is '1' then convert to '0'
 * else if bit is '0' then convert to '1'
 */
public class UpdateBit {
    public static void main(String[] args) {
        int n = 5;
        int pos = 1;
        int bitmask = 1 << pos;

        if ((bitmask & n) == 0) {
            // set
            int newN = bitmask | n;
            System.out.println(newN);
        } else {
            // clear
            int newN = (~(bitmask) & n);
            System.out.println(newN);
        }
    }
}

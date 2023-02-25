package sort_string;

public class swapString {
    public static String[] arrStr = { "aba", "hello", "cat", "apple", "helli", "call", "Apple" };

    public static void swap(int count) {
        String tmpString = "";
        tmpString = arrStr[count];
        arrStr[count] = arrStr[count + 1];
        arrStr[count + 1] = tmpString;
    }

    public static void main(String args[]) {
        int length = arrStr.length;
        int count = 0;
        int l = 0;
        outerloop: for (int i = 0; i < length; i++) {
            innerloop: while (true) {
                if (count < length - 1) {
                    if (arrStr[count].charAt(l) > arrStr[count + 1].charAt(l)) {
                        swap(count);
                        l = 0;
                    } else if (arrStr[count].charAt(l) == arrStr[count + 1].charAt(l)) {
                        l++;
                        continue innerloop;
                    } else {
                        l = 0;
                    }
                    count++;
                } else {
                    count = 0;
                    continue outerloop;
                }
            }

        }
        for (String item : arrStr) {
            System.out.println(item);
        }
    }
}

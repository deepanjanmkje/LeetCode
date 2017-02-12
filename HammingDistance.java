public class HammingDistance {
    public int hammingDistance(int x, int y) {
        StringBuilder xStr = new StringBuilder(Integer.toBinaryString(x));
        StringBuilder yStr = new StringBuilder(Integer.toBinaryString(y));
        // Calculate the difference in bits
        int hamDist = Math.abs(xStr.length() - yStr.length());
        // Prepend missing 0 bits in smaller number for easy comparison
        if (xStr.length() < yStr.length()) {
            xStr = prependMissingBits(xStr, hamDist);
        } else {
            yStr = prependMissingBits(yStr, hamDist);
        }
        hamDist = 0;
        // Loop through all the bits and do a one to one comparison
        for (int i = 0; i < xStr.length(); i++) {
            if (xStr.charAt(i) != yStr.charAt(i)) {
                hamDist++;
            }
        }
        return hamDist;
    }
    
    public StringBuilder prependMissingBits(StringBuilder temp, int hamDist) {
        // Insert missing bits in the beginning
        for (int i = 0; i < hamDist; i++) {
            temp.insert(0, "0");
        }
        return temp;
    }
}
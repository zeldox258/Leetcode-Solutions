
class Solution {
    public String validIPAddress(String queryIP) {
        if (queryIP.contains(".")) {
            String[] parts = queryIP.split("\\.", -1);
            if (parts.length != 4) return "Neither";
            for (String p : parts) {
                if (p.isEmpty() || p.length() > 3) return "Neither";
                if (p.length() > 1 && p.charAt(0) == '0') return "Neither";
                for (char c : p.toCharArray()) if (!Character.isDigit(c)) return "Neither";
                if (Integer.parseInt(p) > 255) return "Neither";
            }
            return "IPv4";
        } else if (queryIP.contains(":")) {
            String[] parts = queryIP.split(":", -1);
            if (parts.length != 8) return "Neither";
            for (String p : parts) {
                if (p.isEmpty() || p.length() > 4) return "Neither";
                for (char c : p.toCharArray()) {
                    char lc = Character.toLowerCase(c);
                    if (!Character.isDigit(c) && (lc < 'a' || lc > 'f')) return "Neither";
                }
            }
            return "IPv6";
        }
        return "Neither";
    }
}

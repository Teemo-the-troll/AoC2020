public class Password {
    int min;
    int max;
    char passChar;
    String password;
    boolean isValid;

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public char getPassChar() {
        return passChar;
    }

    public String getPassword() {
        return password;
    }

    public boolean isValid() {
        return isValid;
    }

    private boolean validify(int min, int max, char passChar, String pass) {
        int count = (int) pass.chars().filter(ch -> ch == passChar).count();
        return (count <= max && count >= min);
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }

    public Password(int min, int max, char passChar, String password) {
        this.min = min;
        this.max = max;
        this.passChar = passChar;
        this.password = password;
        this.isValid = validify(this.min, this.max, this.passChar, this.password);
    }
}

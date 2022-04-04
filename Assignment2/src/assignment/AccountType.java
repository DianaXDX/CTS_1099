package assignment;

public enum AccountType {
    STANDARD(1), BUDGET(2), PREMIUM(3), SUPER_PREMIUM(4);

    int type;

    private AccountType(int type) {
        this.type = type;
    }
}

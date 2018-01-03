public  class Money implements Expression {
    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    Money times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

    String currency() {
        return currency;
    }

    protected static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    protected static Money frank(int amount) {
        return new Money(amount, "CHF");
    }

    Expression plus(Money addend) {
        return new Sum(this, addend);
    }

    @Override
    public boolean equals(Object obj) {
        Money money = (Money) obj;
        return amount == money.amount && currency().equals(money.currency());
    }

    @Override
    public String toString() {
        return amount + " " + currency;
    }
}

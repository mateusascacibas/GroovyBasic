class Account {
    BigDecimal balance = 0
    String type

    public void deposit(BigDecimal balance){
      this.balance = balance
    }

    public void withdraw(BigDecimal sub){
            this.balance = this.balance - sub
    }

}

class AccountExample2 {
    BigDecimal balance = 0.0

    public void deposit(BigDecimal value){
        if(value > 0){
            this.balance += value
        }else{
           throw new Exception("Deposite um valor maior que 0.")
        }
    }

    public void depositList(List<BigDecimal> value){
        def i = 0
        while (i < value.size()){
            this.balance += value[i]
            i++
        }
    }

    static void main(String[] args) {
        AccountExample2 account = new AccountExample2()
        print("Depositando 10.99:\n")
        account.deposit(10.99)
        print("Valor atual: ${account.balance}\n")
        print("Depositando 0\n")
        account.deposit(0)
        print("\nDepositando uma lista de valores: (2.99, 3.00, 4.02)\n")
        List<BigDecimal> listBig = [2.99, 3.00, 4.02]
        account.depositList(listBig)
        print("\nValor atual: ${account.balance}")

    }


}

public class Main {
    public static void main(String[] args){
        int clientBalance = 100;
        int balanceReplenishment = 3450;
        int clientBonus = balanceReplenishment/100;
        if (balanceReplenishment>1000){
            System.out.println(clientBalance + balanceReplenishment + clientBonus);
        }
        else {
            System.out.println(clientBalance + balanceReplenishment);
        }
    }
}

package Week4;

public class Exercise77 {
    public static void main(String[] args) {
        //Exercise 77: Lyyra-card
        //Exercise 77.1: Class skeleton
        //Exercise 77.2: Paying with card
        //Exercise 77.3: Balance nonnegative
        //Exercise 77.4: Loading money to card
        //Exercise 77.5: Loading a negative amount
        //Exercise 77.6: Multiple cards

        LyyraCard card = new LyyraCard(50);
        System.out.println(card);

        card.payEconomical();
        System.out.println(card);

        card.payGourmet();
        card.payEconomical();
        System.out.println(card);

        LyyraCard card1 = new LyyraCard(5);
        System.out.println("\n" + card1);
        card1.payGourmet();
        System.out.println(card1);

        card1.payGourmet();
        System.out.println(card1);

        LyyraCard card2 = new LyyraCard(10);
        System.out.println("\n" + card2);

        card2.loadMoney(15);
        System.out.println(card2);

        card2.loadMoney(10);
        System.out.println(card2);

        card2.loadMoney(200);
        System.out.println(card2);

        LyyraCard card3 = new LyyraCard(10);
        System.out.println("\nPekka: " + card3);

        card3.loadMoney(-15);
        System.out.println("Pekka: " + card3);

        System.out.println("\n");

        LyyraCard cardPekka = new LyyraCard(20);
        LyyraCard cardBrian = new LyyraCard(30);

        cardPekka.payGourmet();
        cardBrian.payEconomical();

        System.out.println(cardPekka);
        System.out.println(cardBrian);

        cardPekka.loadMoney(20);
        cardBrian.payGourmet();

        System.out.println(cardPekka);
        System.out.println(cardBrian);

        cardPekka.payEconomical();
        cardPekka.payEconomical();

        cardBrian.loadMoney(50);

        System.out.println(cardPekka);
        System.out.println(cardBrian);

    }
}

class LyyraCard {
    private double balance;

    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;
    }

    public String toString() {
        return "The card has " + this.balance + " euros";
    }

    public void payEconomical() {
        if (this.balance >= 2.50) {
            this.balance = this.balance -  2.50;
        }
    }

    public void payGourmet() {
        if (this.balance >= 4.00) {
            this.balance = this.balance -  4.00;
        }
    }

    public void loadMoney(double amount) {
        if (amount >= 0) {
            this.balance += amount;
            if (this.balance > 150.00) {
                this.balance = 150.00;
            }
        }
    }
}

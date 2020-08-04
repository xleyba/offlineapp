package data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Payment {

    @Id
    private String payment_id;      // unique string idenঞfier
    private int account_id;         // foreign key to accounts table
    private String payment_type;    // text possible values are “online” and “offline”
    private String credit_card;     // string with some payment informaঞon
    private int amount;             // integer with price amount.
    private Date created_at;        // timestamp with creaঞon date. only in database

    public Payment() {}

    public Payment(String payment_id, int account_id, String payment_type, String credit_card, int amount) {
        this.payment_id = payment_id;
        this.account_id = account_id;
        this.payment_type = payment_type;
        this.credit_card = credit_card;
        this.amount = amount;
    }

    public String getPayment_id() {
        return payment_id;
    }

    public void setPayment_id(String payment_id) {
        this.payment_id = payment_id;
    }

    public int getAccount_id() {
        return account_id;
    }

    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }

    public String getPayment_type() {
        return payment_type;
    }

    public void setPayment_type(String payment_type) {
        this.payment_type = payment_type;
    }

    public String getCredit_card() {
        return credit_card;
    }

    public void setCredit_card(String credit_card) {
        this.credit_card = credit_card;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    @Override
    public String toString() {
        String msg = "Payment id: " + this.payment_id + " Payment type: " + this.payment_type;
        return msg;
    }
}

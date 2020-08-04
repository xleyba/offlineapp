package net.javier.offlineapp.data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "payments")
public class Payment {

    @Id
    private String payment_id;      // unique string idenঞfier
    private int account_id;         // foreign key to accounts table
    private String payment_type;    // text possible values are “online” and “offline”
    private String credit_card;     // string with some payment informaঞon
    private int amount;             // integer with price amount.
    private Timestamp created_on;   // timestamp with creaঞon date. only in database

    public Payment() {}

    public Payment(String payment_id) {
        this.payment_id = payment_id;
    }

    public String getPayment_id() {
        return payment_id;
    }

    public void setPayment_id(String payment_id) {
        this.payment_id = payment_id;
    }

    public Payment(String payment_id, int account_id, String payment_type, String credit_card, int amount) {
        Date date= new Date();

        this.payment_id = payment_id;
        this.account_id = account_id;
        this.payment_type = payment_type;
        this.credit_card = credit_card;
        this.amount = amount;
        this.created_on = new Timestamp(date.getTime());
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

    public Timestamp getCreated_on() {
        return created_on;
    }

    public void setCreated_at(Timestamp created_on) {
        this.created_on = created_on;
    }

    @Override
    public String toString() {
        String msg = "Payment id: " + this.payment_id + " Payment type: " + this.payment_type;
        return msg;
    }
}

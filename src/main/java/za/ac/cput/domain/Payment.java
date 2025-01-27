package za.ac.cput.domain;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/*
Online Shopping System
Lihle Langa 217181147
entity for Payment
 */
@Entity
public class Payment implements Serializable {
    @Id
    @NotNull
    @Column(name = "payment_id")
    private String paymentId;
    @NotNull
    //@Embedded
    private String paymentDate;
    private String paymentTime;
    private String paymentTotal;
    private String paymentDetails;


    protected Payment(){}

    public Payment(Builder builder){
        this.paymentId = builder.paymentId;
        this.paymentDate = builder.paymentDate;
        this.paymentTime = builder.paymentTime;
        this.paymentTotal = builder.paymentTotal;
        this.paymentDetails = builder.paymentDetails;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public String getPaymentTime() {
        return paymentTime;
    }

    public String getPaymentTotal() {
        return paymentTotal;
    }

    public String getPaymentDetails() {
        return paymentDetails;
    }

    @Override
    public String toString(){
        return "Payment{"+ "PaymentID='" + paymentId + '\'' +
                ", PaymentDate='" + paymentDate + '\'' +
                ", PaymentTime='" + paymentTime + '\'' +
                ", PaymentTotal='" + paymentTotal +'\'' +
                ", Payment Details+ '" + paymentDetails + "}";

    }

    //my Builder;
    public static class Builder{
        private String paymentId;
        private String paymentDate;
        private String paymentTime;
        private String paymentTotal;
        private String paymentDetails;

        public Builder setPaymentId(String paymentId){
            this.paymentId = paymentId;
            return this;
        }
        public Builder setPaymentDate(String paymentDate){
            this.paymentDate = paymentDate;
            return this;
        }
        public Builder setPaymentTime(String paymentTime){
            this.paymentTime = paymentTime;
            return this;
        }
        public Builder setPaymentTotal(String paymentTotal){
            this.paymentTotal = paymentTotal;
            return this;
        }
        public Builder setPaymentDetails(String paymentDetails){
            this.paymentDetails = paymentDetails;
            return this;
        }


        public Builder copy(Payment payment){
            this.paymentId = payment.paymentId;
            this.paymentDate = payment.paymentDate;
            this.paymentTime = payment.paymentTime;
            this.paymentTotal = payment.paymentTotal;
            this.paymentDetails = payment.paymentDetails;
            return this;

        }

        public Payment build(){
            return new Payment(this);
        }

    }


}

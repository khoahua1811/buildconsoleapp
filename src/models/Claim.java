package models;

import java.util.Date;
import java.util.List;

public class Claim {
    private String id;
    private Date claimDate;
    private String insuredPerson;
    private String cardNumber;
    private Date examDate;
    private List<String> documents;
    private double claimAmount;
    private ClaimStatus status;
    private String receiverBankingInfo;
    public String getId() {
        return id;
    }

    public Claim(String id, Date claimDate, String insuredPerson, String cardNumber, Date examDate, List<String> documents, double claimAmount, ClaimStatus status, String receiverBankingInfo) {
        this.id = id;
        this.claimDate = claimDate;
        this.insuredPerson = insuredPerson;
        this.cardNumber = cardNumber;
        this.examDate = examDate;
        this.documents = documents;
        this.claimAmount = claimAmount;
        this.status = status;
        this.receiverBankingInfo = receiverBankingInfo;
    }

    // Getters and setters for all fields

    public enum ClaimStatus {
        NEW, PROCESSING, DONE
    }
}

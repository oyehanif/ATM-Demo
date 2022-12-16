package com.example.atmdemo;

public class modal {
    String widAmount;
    String twoThousand;
    String fiveHundred;
    String oneHundred;

    public modal(String widAmount, String twoThousand, String fiveHundred, String oneHundred) {
        this.widAmount = widAmount;
        this.twoThousand = twoThousand;
        this.fiveHundred = fiveHundred;
        this.oneHundred = oneHundred;
    }

    public String getWidAmount() {
        return widAmount;
    }

    public void setWidAmount(String widAmount) {
        this.widAmount = widAmount;
    }

    public String getTwoThousand() {
        return twoThousand;
    }

    public void setTwoThousand(String twoThousand) {
        this.twoThousand = twoThousand;
    }

    public String getFiveHundred() {
        return fiveHundred;
    }

    public void setFiveHundred(String fiveHundred) {
        this.fiveHundred = fiveHundred;
    }

    public String getOneHundred() {
        return oneHundred;
    }

    public void setOneHundred(String oneHundred) {
        this.oneHundred = oneHundred;
    }
}

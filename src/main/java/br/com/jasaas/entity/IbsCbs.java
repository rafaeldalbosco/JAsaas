package br.com.jasaas.entity;

import com.google.gson.annotations.Expose;

public class IbsCbs {
    @Expose
    private String nbsCode;
    @Expose
    private String nationalServiceCode;
    @Expose
    private String taxSituation;
    @Expose
    private String taxClassification;
    @Expose
    private String operationIndicatorCode;

    public IbsCbs() {
    }

    public IbsCbs(String nbsCode, String nationalServiceCode, String taxSituation, String taxClassification, String operationIndicatorCode) {
        this.nbsCode = nbsCode;
        this.nationalServiceCode = nationalServiceCode;
        this.taxSituation = taxSituation;
        this.taxClassification = taxClassification;
        this.operationIndicatorCode = operationIndicatorCode;
    }
    
    public String getNbsCode() {
        return nbsCode;
    }

    public void setNbsCode(String nbsCode) {
        this.nbsCode = nbsCode;
    }

    public String getNationalServiceCode() {
        return nationalServiceCode;
    }

    public void setNationalServiceCode(String nationalServiceCode) {
        this.nationalServiceCode = nationalServiceCode;
    }

    public String getTaxSituation() {
        return taxSituation;
    }

    public void setTaxSituation(String taxSituation) {
        this.taxSituation = taxSituation;
    }

    public String getTaxClassification() {
        return taxClassification;
    }

    public void setTaxClassification(String taxClassification) {
        this.taxClassification = taxClassification;
    }

    public String getOperationIndicatorCode() {
        return operationIndicatorCode;
    }

    public void setOperationIndicatorCode(String operationIndicatorCode) {
        this.operationIndicatorCode = operationIndicatorCode;
    }
}

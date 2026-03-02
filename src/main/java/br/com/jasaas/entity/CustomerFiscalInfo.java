package br.com.jasaas.entity;

import br.com.jasaas.util.StringUtils;
import com.google.gson.annotations.Expose;

public class CustomerFiscalInfo extends AsaasEntity {
    @Expose
    private String object = "customerFiscalInfo";
    @Expose
    private String email;
    @Expose
    private String municipalInscription;
    @Expose
    private String stateInscription;
    @Expose
    private Boolean simplesNacional;
    @Expose
    private Boolean culturalProjectsPromoter;
    @Expose
    private String cnae;
    @Expose
    private String specialTaxRegime;
    @Expose
    private String serviceListItem;
    @Expose
    private String rpsSerie;
    @Expose
    private Integer rpsNumber;
    @Expose
    private Integer loteNumber;
    @Expose
    private String username;
    @Expose
    private String password;
    @Expose(serialize = false)
    private Boolean passwordSent;
    @Expose
    private String accessToken;
    @Expose(serialize = false)
    private Boolean accessTokenSent;
    @Expose
    private String certificateFile;
    @Expose
    private String certificatePassword;
    @Expose(serialize = false)
    private Boolean certificateSent;

    public CustomerFiscalInfo() {
    }

    public CustomerFiscalInfo(String object, String email, String municipalInscription, String stateInscription,
                              Boolean simplesNacional, Boolean culturalProjectsPromoter, String cnae, String specialTaxRegime,
                              String serviceListItem, String rpsSerie, Integer rpsNumber, Integer loteNumber,
                              String username, String password, Boolean passwordSent, String accessToken, Boolean accessTokenSent,
                              String certificateFile, String certificatePassword, Boolean certificateSent) {
        this.object = object;
        this.email = email;
        this.municipalInscription = municipalInscription;
        this.stateInscription = stateInscription;
        this.simplesNacional = simplesNacional;
        this.culturalProjectsPromoter = culturalProjectsPromoter;
        this.cnae = cnae;
        this.specialTaxRegime = specialTaxRegime;
        this.serviceListItem = serviceListItem;
        this.rpsSerie = rpsSerie;
        this.rpsNumber = rpsNumber;
        this.loteNumber = loteNumber;
        this.username = username;
        this.password = password;
        this.passwordSent = passwordSent;
        this.accessToken = accessToken;
        this.accessTokenSent = accessTokenSent;
        this.certificateFile = certificateFile;
        this.certificatePassword = certificatePassword;
        this.certificateSent = certificateSent;
    }

    @Override
    public Object getId() {
        return email;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = StringUtils.removerAcentos(object);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = StringUtils.removerAcentos(email);
    }

    public String getMunicipalInscription() {
        return municipalInscription;
    }

    public void setMunicipalInscription(String municipalInscription) {
        this.municipalInscription = StringUtils.removerAcentos(municipalInscription);
    }

    public String getStateInscription() {
        return stateInscription;
    }

    public void setStateInscription(String stateInscription) {
        this.stateInscription = StringUtils.removerAcentos(stateInscription);
    }

    public Boolean getSimplesNacional() {
        return simplesNacional;
    }

    public void setSimplesNacional(Boolean simplesNacional) {
        this.simplesNacional = simplesNacional;
    }

    public Boolean getCulturalProjectsPromoter() {
        return culturalProjectsPromoter;
    }

    public void setCulturalProjectsPromoter(Boolean culturalProjectsPromoter) {
        this.culturalProjectsPromoter = culturalProjectsPromoter;
    }

    public String getCnae() {
        return cnae;
    }

    public void setCnae(String cnae) {
        this.cnae = StringUtils.removerAcentos(cnae);
    }

    public String getSpecialTaxRegime() {
        return specialTaxRegime;
    }

    public void setSpecialTaxRegime(String specialTaxRegime) {
        this.specialTaxRegime = StringUtils.removerAcentos(specialTaxRegime);
    }

    public String getServiceListItem() {
        return serviceListItem;
    }

    public void setServiceListItem(String serviceListItem) {
        this.serviceListItem = StringUtils.removerAcentos(serviceListItem);
    }

    public String getRpsSerie() {
        return rpsSerie;
    }

    public void setRpsSerie(String rpsSerie) {
        this.rpsSerie = StringUtils.removerAcentos(rpsSerie);
    }

    public Integer getRpsNumber() {
        return rpsNumber;
    }

    public void setRpsNumber(Integer rpsNumber) {
        this.rpsNumber = rpsNumber;
    }

    public Integer getLoteNumber() {
        return loteNumber;
    }

    public void setLoteNumber(Integer loteNumber) {
        this.loteNumber = loteNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = StringUtils.removerAcentos(username);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = StringUtils.removerAcentos(password);
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = StringUtils.removerAcentos(accessToken);
    }

    public String getCertificateFile() {
        return certificateFile;
    }

    public void setCertificateFile(String certificateFile) {
        this.certificateFile = StringUtils.removerAcentos(certificateFile);
    }

    public String getCertificatePassword() {
        return certificatePassword;
    }

    public void setCertificatePassword(String certificatePassword) {
        this.certificatePassword = StringUtils.removerAcentos(certificatePassword);
    }

    public Boolean getPasswordSent() {
        return passwordSent;
    }

    public Boolean getAccessTokenSent() {
        return accessTokenSent;
    }

    public Boolean getCertificateSent() {
        return certificateSent;
    }
}
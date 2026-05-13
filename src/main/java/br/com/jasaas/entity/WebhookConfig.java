/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jasaas.entity;

import com.google.gson.annotations.Expose;

import java.util.List;

/**
 *
 * @author atendimento
 */
public class WebhookConfig extends AsaasEntity<String> {

    @Expose(serialize = false)
    private String id;
    @Expose
    private String name;
    @Expose
    private String url;
    @Expose
    private String email;
    @Expose
    private Boolean interrupted;
    @Expose
    private Boolean enabled;
    @Expose
    private Integer apiVersion = 3;
    @Expose
    private String authToken;
    @Expose
    private String sendType;
    @Expose
    private List<String> events;
    @Expose(serialize = false)
    private Boolean hasAuthToken;
    @Expose(serialize = false)
    private Integer penalizedRequestsCount;

    /**
     *
     * @return Identificador unico do webhook
     */
    @Override
    public String getId() {
        return id;
    }

    /**
     *
     * @param id Identificador unico do webhook
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     *
     * @return Nome configurado para o webhook
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name Nome configurado para o webhook
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return URL que receberá as informações de sincronização
     */
    public String getUrl() {
        return url;
    }

    /**
     *
     * @param url URL que receberá as informações de sincronização
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     *
     * @return Email para receber as notificações em caso de erros na fila
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email Email para receber as notificações em caso de erros na fila
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @return Situação da fila de sincronização
     */
    public Boolean getInterrupted() {
        return interrupted;
    }

    /**
     *
     * @param interrupted Situação da fila de sincronização
     */
    public void setInterrupted(Boolean interrupted) {
        this.interrupted = interrupted;
    }

    /**
     *
     * @return Habilitar ou não o webhook
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     *
     * @param enabled Habilitar ou não o webhook
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     *
     * @return Versão utilizada da API.
     */
    public Integer getApiVersion() {
        return apiVersion;
    }

    /**
     *
     * @param apiVersion Versão utilizada da API.
     */
    public void setApiVersion(Integer apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    /**
     *
     * @return Tipo de envio do webhook
     */
    public String getSendType() {
        return sendType;
    }

    /**
     *
     * @param sendType Tipo de envio do webhook
     */
    public void setSendType(String sendType) {
        this.sendType = sendType;
    }

    /**
     *
     * @return Eventos associados ao webhook
     */
    public List<String> getEvents() {
        return events;
    }

    /**
     *
     * @param events Eventos associados ao webhook
     */
    public void setEvents(List<String> events) {
        this.events = events;
    }

    /**
     *
     * @return Indica se o webhook possui token de autenticacao
     */
    public Boolean getHasAuthToken() {
        return hasAuthToken;
    }

    /**
     *
     * @param hasAuthToken Indica se o webhook possui token de autenticacao
     */
    public void setHasAuthToken(Boolean hasAuthToken) {
        this.hasAuthToken = hasAuthToken;
    }

    /**
     *
     * @return Quantidade de requisicoes penalizadas do webhook
     */
    public Integer getPenalizedRequestsCount() {
        return penalizedRequestsCount;
    }

    /**
     *
     * @param penalizedRequestsCount Quantidade de requisicoes penalizadas do webhook
     */
    public void setPenalizedRequestsCount(Integer penalizedRequestsCount) {
        this.penalizedRequestsCount = penalizedRequestsCount;
    }

    @Override
    public String toString() {
        return "WebhookConfig{" + "id=" + id + ", name=" + name + ", url=" + url + ", email=" + email + ", interrupted=" + interrupted + ", enabled=" + enabled + ", apiVersion=" + apiVersion + ", sendType=" + sendType + ", events=" + events + ", hasAuthToken=" + hasAuthToken + ", penalizedRequestsCount=" + penalizedRequestsCount + '}';
    }
}

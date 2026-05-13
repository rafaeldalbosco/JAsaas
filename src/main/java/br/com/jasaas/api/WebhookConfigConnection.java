/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jasaas.api;

import br.com.jasaas.adapter.AdapterConnection;
import br.com.jasaas.entity.WebhookConfig;
import br.com.jasaas.entity.meta.MetaWebhookConfig;
import br.com.jasaas.enumeration.EndpointEnum;
import br.com.jasaas.enumeration.EnvironmentAsaas;
import br.com.jasaas.exception.ConnectionException;

import java.util.List;

/**
 *
 * @author atendimento
 */
public class WebhookConfigConnection extends AsaasConnection<WebhookConfig, Object> {

    public WebhookConfigConnection(AdapterConnection httpClient, EnvironmentAsaas environmentAsaas) {
        super(environmentAsaas, httpClient, EndpointEnum.WEBHOOK);
        this.metaGenericClass = MetaWebhookConfig.class;
    }

    public WebhookConfig get() throws ConnectionException {
        List<WebhookConfig> webhooks = getAll();
        if (webhooks == null || webhooks.isEmpty()) {
            return null;
        }
        return webhooks.get(0);
    }

    public WebhookConfig createWebhookConfig(WebhookConfig webhookConfig) throws ConnectionException {
        return create(webhookConfig);
    }

    public WebhookConfig updateWebhookConfig(WebhookConfig webhookConfig) throws ConnectionException {
        return updatePut(webhookConfig);
    }

    @Override
    public WebhookConfig update(WebhookConfig webhookConfig) throws ConnectionException {
        return updatePut(webhookConfig);
    }

    public WebhookConfig createWebhookPayment(WebhookConfig webhookConfig) throws ConnectionException {
        return create(webhookConfig);
    }

    public WebhookConfig createWebhoookInvoice(WebhookConfig entity) throws ConnectionException {
        return create(entity);
    }

    public WebhookConfig createWebhoookTransfer(WebhookConfig entity) throws ConnectionException {
        return create(entity);
    }

    public WebhookConfig createWebhoookBill(WebhookConfig entity) throws ConnectionException {
        return create(entity);
    }

    public WebhookConfig createWebhoookAnticipation(WebhookConfig entity) throws ConnectionException {
        return create(entity);
    }

    public WebhookConfig createWebhoookMobilePhoneRecharge(WebhookConfig entity) throws ConnectionException {
        return create(entity);
    }

}

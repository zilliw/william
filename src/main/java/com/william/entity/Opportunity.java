package com.william.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Opportunity {
    @Id @GeneratedValue
    private Long id;
    private String code;
    private String childCode;
    private String client;
    private String name;
    private String division;
    private String responsible;
    private String delivery;
    private String status;
    /*
    statut= en cours, solde, annule, supprime. Enum ?
    prestation: prestation projet, abonnement
    departement: observatoire, fluide,
    responsable projet: william azis,
    **/

    public Opportunity() {}

    public Opportunity(String name) {
        this.name = name;
    }

            public Long getId() {
                return this.id;
            }
            public String getCode() {
                return this.code;
            }
            public String getChildCode() {
                return this.childCode;
            }
            public String getClient() {
                return this.client;
            }
            public String getName() {
                return this.name;
            }
            public String getDivision() {
                return this.division;
            }
            public String getResponsible() {
                return this.responsible;
            }
            public String getDelivery() {
                return this.delivery;
            }
            public String getStatus() {
                return this.status;
            }

            public void setId(Long id) {
                this.id = id;
            }
            public void setCode(String code) {
                this.code = code;
            }
            public void setChildCode(String childCode) {
                this.childCode = childCode;
            }
            public void setClient(String client) {
                this.client = client;
            }
            public void setName(String name) {
                this.name = name;
            }
            public void setDivision(String division) {
                this.division = division;
            }
            public void setResponsible(String responsible) {
                this.responsible = responsible;
            }
            public void setDelivery(String delivery) {
                this.delivery = delivery;
            }
            public void setStatus(String status) {
                this.status = status;
            }
}

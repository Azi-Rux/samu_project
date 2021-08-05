package com.example.samu.model;

public class DossPrimResult {
    private Long id;
    private String etatDossier;

    public DossPrimResult(Long id, String etatDossier) {
        this.id = id;
        this.etatDossier = etatDossier;
    }

    public DossPrimResult() {
    }

    @Override
    public String toString() {
        return "DossPrimResult{" +
                "id=" + id +
                ", etatDossier='" + etatDossier + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public String getEtatDossier() {
        return etatDossier;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setEtatDossier(String etatDossier) {
        this.etatDossier = etatDossier;
    }
}

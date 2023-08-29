package com.iphone.model;

public class Pagina {
    private String hmtl;
    private String url;

    public Pagina() {

    }

    public Pagina(String html, String url) {
        this.hmtl = html;
        this.url = url;
    }

    public String getHmtl() {
        return hmtl;
    }

    public void setHmtl(String hmtl) {
        this.hmtl = hmtl;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

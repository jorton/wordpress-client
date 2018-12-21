package org.chobit.wp;

/**
 * @author robin
 */
public final class WPConfig {

    private int blogId;

    private String xmlRpcUrl;

    private String username;

    private String password;

    private boolean trustAll;

    WPConfig() {
    }

    public int getBlogId() {
        return blogId;
    }

    public void setBlogId(int blogId) {
        this.blogId = blogId;
    }

    public String getXmlRpcUrl() {
        return xmlRpcUrl;
    }

    public void setXmlRpcUrl(String xmlRpcUrl) {
        this.xmlRpcUrl = xmlRpcUrl;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isTrustAll() {
        return trustAll;
    }

    public void setTrustAll(boolean trustAll) {
        this.trustAll = trustAll;
    }
}
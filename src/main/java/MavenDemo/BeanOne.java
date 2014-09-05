package main.java.MavenDemo;

import java.io.Serializable;

/**
 * Created by kumar on 9/6/14.
 */
public class BeanOne implements Serializable {
    public int m_iId = 0;
    public String m_sName = "";
    public String m_sCompany = "";

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getName() + "{");
        sb.append("id: " + m_iId + ",");
        sb.append("name: " + m_sName + ",");
        sb.append("company: " + m_sCompany + ",");
        sb.append("}");
        return sb.toString();
    }

    public int getId() {
        return m_iId;
    }

    public void setId(int id) {
        this.m_iId = id;
    }

    public String getName() {
        return m_sName;
    }

    public void setName(String name) {
        this.m_sName = name;
    }

    public String getCompany() {
        return m_sCompany;
    }

    public void setCompany(String company) {
        this.m_sCompany = company;
    }
}

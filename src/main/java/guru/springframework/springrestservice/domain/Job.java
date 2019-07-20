
package guru.springframework.springrestservice.domain;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Job implements Serializable
{

    private String title;
    private String company;
    private final static long serialVersionUID = -4985150429002262656L;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

}

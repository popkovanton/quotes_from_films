package popkovanton.quotes_from_films.data;


import android.graphics.Color;

import java.util.Date;
import java.util.List;

public class ModelItemQuotes {

    private boolean ok;
    private int id;
    private String quote;
    private int createdBy;
    private List tagList;
    private String label;
    private Color color;
    private Date createdAt;

    public ModelItemQuotes(boolean ok, int id, String quote, int createdBy) {
        this.ok = ok;
        this.id = id;
        this.quote = quote;
        this.createdBy = createdBy;
    }

    public boolean isOk() {
        return ok;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }
}

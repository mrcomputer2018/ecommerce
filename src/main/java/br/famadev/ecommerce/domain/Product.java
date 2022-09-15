package br.famadev.ecommerce.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUUCTS")
public class Product extends AbstractEntity<Long>{
    private String title;
    private String description;
    private Integer pages;

    // getters e setters
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Integer getPages() {
        return pages;
    }
    public void setPages(Integer pages) {
        this.pages = pages;
    }
}

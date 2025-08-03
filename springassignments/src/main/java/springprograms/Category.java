package springprograms;

import org.springframework.stereotype.Component;

@Component
public class Category {
	private int categoryId = 1000;
    private String categoryName = "Electronics";

    public int getCategoryId() {
        return categoryId;
    }
    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
    public String getCategoryName() {
        return categoryName;
    }
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

}

import java.util.ArrayList;

public class Category {
    public int categoryID;
    public String name;
    public String description;
    public ArrayList<Category> subCategories; // recursive structure

    // Constructor đầy đủ
    public Category(int categoryID, String name, String description) {
        this.categoryID = categoryID;
        this.name = name;
        this.description = description;
        this.subCategories = new ArrayList<>();
    }

    // Constructor đơn giản (chỉ có name)
    public Category(String name) {
    this.name = name;
    this.description = null;
    this.subCategories = new ArrayList<>(); // tránh NPE khi gọi toString()/displayInfo()
}

    // Thêm sub-category
    public void addSubCategory(Category subCategory) {
        subCategories.add(subCategory);
    }

    // Hiển thị thông tin (đệ quy, đúng format bạn yêu cầu)

    @Override
    public String toString() {
        return "Category {" +
                "ID: " + categoryID +
                ", Name: " + name +
                ", Description: " + description +
                ", Sub Categories: " + subCategories.size() +
                '}';
    }
}


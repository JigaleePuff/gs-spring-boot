public class Product {
    private int id;
    private String name;
    private String description;
    private double price;
    private double rating;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getRating() {
        return rating;
    }
    public void setRating(double rating) {
        this.rating = rating;
    }
    
    // Added Getters and setters
}

public class Consumption {
    private int id;
    private int productId;
    private int userId;
    private int quantity;
    private LocalDateTime timestamp;
    
    // Getters and setters
}

public class Exchange {
    private int id;
    private int senderUserId;
    private int receiverUserId;
    private int productGivenId;
    private int productReceivedId;
    private LocalDateTime timestamp;
    
    // Getters and setters
}


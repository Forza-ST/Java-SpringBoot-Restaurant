package com.forza.restaurant.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.ArrayList;
import java.util.List;

@Controller
public class MenuController {

    @GetMapping("/menu")
    public String menu(Model model) {
        // Add menu items to the model
        model.addAttribute("appetizers", getAppetizers());
        model.addAttribute("mainCourses", getMainCourses());
        model.addAttribute("desserts", getDesserts());
        
        return "menu";
    }
    
    private List<MenuItem> getAppetizers() {
        List<MenuItem> items = new ArrayList<>();
        items.add(new MenuItem("Crispy Calamari", "Lightly fried squid served with marinara sauce and lemon wedges", 15.99, "/images/menu/calamari.jpg"));
        items.add(new MenuItem("Beef Carpaccio", "Thinly sliced raw beef with arugula, capers, and parmesan shavings", 16.99, "/images/menu/carpaccio.jpg"));
        return items;
    }
    
    private List<MenuItem> getMainCourses() {
        List<MenuItem> items = new ArrayList<>();
        items.add(new MenuItem("Osso Buco", "Braised veal shanks with saffron risotto and gremolata", 38.99, "/images/menu/ossobuco.jpg"));
        items.add(new MenuItem("Ribeye Fiorentina", "Grilled 16oz ribeye with rosemary potatoes and seasonal vegetables", 42.99, "/images/menu/ribeye.jpg"));
        items.add(new MenuItem("Mediterranean Seabass", "Pan-seared seabass with cherry tomatoes, olives, and white wine sauce", 36.99, "/images/menu/seabass.jpg"));
        return items;
    }
    
    private List<MenuItem> getDesserts() {
        List<MenuItem> items = new ArrayList<>();
        items.add(new MenuItem("Classic Tiramisu", "Layers of coffee-soaked ladyfingers and mascarpone cream", 10.99, "/images/menu/tiramisu.jpg"));
        items.add(new MenuItem("Vanilla Panna Cotta", "Silky cream dessert with berry compote", 9.99, "/images/menu/pannacotta.jpg"));
        items.add(new MenuItem("Sicilian Cannoli", "Crispy pastry shells filled with sweet ricotta and chocolate chips", 8.99, "/images/menu/cannoli.jpg"));
        return items;
    }
    
    // Inner class to represent a menu item
    public static class MenuItem {
        private String name;
        private String description;
        private double price;
        private String imageUrl;
        
        public MenuItem(String name, String description, double price, String imageUrl) {
            this.name = name;
            this.description = description;
            this.price = price;
            this.imageUrl = imageUrl;
        }
        
        public String getName() { return name; }
        public String getDescription() { return description; }
        public double getPrice() { return price; }
        public String getImageUrl() { return imageUrl; }
    }
}

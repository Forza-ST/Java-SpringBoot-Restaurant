package com.forza.restaurant.service;

import com.forza.restaurant.model.MenuItem;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;

@Service
public class MenuService {
    public List<MenuItem> getAppetizers() {
        List<MenuItem> appetizers = new ArrayList<>();
        
        MenuItem bruschetta = new MenuItem();
        bruschetta.setName("Bruschetta");
        bruschetta.setDescription("Grilled bread rubbed with garlic, topped with fresh tomatoes, basil, and olive oil");
        bruschetta.setPrice(12.99);
        bruschetta.setCategory("appetizer");
        
        MenuItem calamari = new MenuItem();
        calamari.setName("Crispy Calamari");
        calamari.setDescription("Lightly fried squid served with marinara sauce and lemon wedges");
        calamari.setPrice(15.99);
        calamari.setCategory("appetizer");
        
        MenuItem carpaccio = new MenuItem();
        carpaccio.setName("Beef Carpaccio");
        carpaccio.setDescription("Thinly sliced raw beef with arugula, capers, and parmesan shavings");
        carpaccio.setPrice(16.99);
        carpaccio.setCategory("appetizer");
        
        appetizers.add(bruschetta);
        appetizers.add(calamari);
        appetizers.add(carpaccio);
        
        return appetizers;
    }

    public List<MenuItem> getMainCourses() {
        List<MenuItem> mainCourses = new ArrayList<>();
        
        MenuItem ossobuco = new MenuItem();
        ossobuco.setName("Osso Buco");
        ossobuco.setDescription("Braised veal shanks with saffron risotto and gremolata");
        ossobuco.setPrice(38.99);
        ossobuco.setCategory("main");
        
        MenuItem ribeye = new MenuItem();
        ribeye.setName("Ribeye Fiorentina");
        ribeye.setDescription("Grilled 16oz ribeye with rosemary potatoes and seasonal vegetables");
        ribeye.setPrice(42.99);
        ribeye.setCategory("main");
        
        MenuItem seabass = new MenuItem();
        seabass.setName("Mediterranean Seabass");
        seabass.setDescription("Pan-seared seabass with cherry tomatoes, olives, and white wine sauce");
        seabass.setPrice(36.99);
        seabass.setCategory("main");
        
        mainCourses.add(ossobuco);
        mainCourses.add(ribeye);
        mainCourses.add(seabass);
        
        return mainCourses;
    }

    public List<MenuItem> getDesserts() {
        List<MenuItem> desserts = new ArrayList<>();
        
        MenuItem tiramisu = new MenuItem();
        tiramisu.setName("Classic Tiramisu");
        tiramisu.setDescription("Layers of coffee-soaked ladyfingers and mascarpone cream");
        tiramisu.setPrice(10.99);
        tiramisu.setCategory("dessert");
        
        MenuItem pannaCotta = new MenuItem();
        pannaCotta.setName("Vanilla Panna Cotta");
        pannaCotta.setDescription("Silky cream dessert with berry compote");
        pannaCotta.setPrice(9.99);
        pannaCotta.setCategory("dessert");
        
        MenuItem cannoli = new MenuItem();
        cannoli.setName("Sicilian Cannoli");
        cannoli.setDescription("Crispy pastry shells filled with sweet ricotta and chocolate chips");
        cannoli.setPrice(8.99);
        cannoli.setCategory("dessert");
        
        desserts.add(tiramisu);
        desserts.add(pannaCotta);
        desserts.add(cannoli);
        
        return desserts;
    }
}

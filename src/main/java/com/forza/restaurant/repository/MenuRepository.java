package com.forza.restaurant.repository;

import com.forza.restaurant.model.MenuItem;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface MenuRepository {
    List<MenuItem> findByCategory(String category);
    MenuItem save(MenuItem menuItem);
    void deleteById(Long id);
}

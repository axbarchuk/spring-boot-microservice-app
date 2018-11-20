package ax.barchuk.menu.service.impl;

import ax.barchuk.menu.domain.MenuItem;
import ax.barchuk.menu.service.MenuService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {

    private static List<MenuItem> menu = new ArrayList<>();
    static {
        menu.add(new MenuItem("Coffee", 2.5));
        menu.add(new MenuItem("Croissant", 1.0));
        menu.add(new MenuItem("Biscuit", 1.5));
    }

    @Override
    public MenuItem get(String name) {
        return menu.stream()
                .filter(item -> item.getName().equals(name))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Menu item by specified name does not exist."));
    }

    @Override
    public List<MenuItem> getAll() {
        return menu;
    }
}

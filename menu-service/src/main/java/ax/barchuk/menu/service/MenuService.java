package ax.barchuk.menu.service;

import ax.barchuk.menu.domain.MenuItem;

import java.util.List;

public interface MenuService {

    MenuItem get(String name);
    List<MenuItem> getAll();

}

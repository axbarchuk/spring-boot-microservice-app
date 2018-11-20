package ax.barchuk.menu.controller;

import ax.barchuk.menu.domain.MenuItem;
import ax.barchuk.menu.service.MenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/menu")
@RequiredArgsConstructor
public class MenuController {

    private final MenuService menuService;

    @GetMapping("/{name}")
    public MenuItem get(@PathVariable String name) {
        return menuService.get(name);
    }

    @GetMapping
    public List<MenuItem> getAll() {
        return menuService.getAll();
    }

}

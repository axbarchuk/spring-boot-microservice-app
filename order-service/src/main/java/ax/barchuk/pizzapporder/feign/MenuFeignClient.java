package ax.barchuk.pizzapporder.feign;

import ax.barchuk.pizzapporder.domain.MenuItem;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "menu-service")
@RequestMapping("/menu")
public interface MenuFeignClient {

    @GetMapping("/{name}")
    MenuItem get(@PathVariable String name);

}

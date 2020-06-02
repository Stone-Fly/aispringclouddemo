package com.alageek.feign;

import com.alageek.entity.Menu;
import com.alageek.entity.MenuVO;
import com.alageek.entity.Type;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@FeignClient(value = "menu")
public interface MenuFeign {
    @GetMapping("/menu/findAll/{index}/{limit}")
    public MenuVO findAll(@PathVariable("index") int index, @PathVariable("limit") int limit);
    @DeleteMapping("/menu/deleteById/{id}")
    public void deleteById(@PathVariable("id") long id);
    @GetMapping("/menu/findTypes")
    public List<Type> findTypes();
    @PostMapping("/menu/save")
    public void save(Menu menu);
    @PostMapping("/menu/update")
    public void update(Menu menu);
    @GetMapping("/menu/findById/{id}")
    public Menu findById(@PathVariable("id") long id);
}

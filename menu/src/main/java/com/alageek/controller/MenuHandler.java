package com.alageek.controller;

import com.alageek.entity.Menu;
import com.alageek.entity.MenuVO;
import com.alageek.entity.Type;
import com.alageek.repository.MenuRepository;
import com.alageek.repository.TypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menu")
public class MenuHandler {

    @Autowired
    private MenuRepository menuRepository;
    @Autowired
    private TypeRepository typeRepository;

    @Value("${server.port}")
    private String port;

    @GetMapping("/index")
    public String index(){
        return "port: " + this.port;
    }

    @GetMapping("/findAll/{index}/{limit}")
    public MenuVO findAll(@PathVariable("index") int index,@PathVariable("limit") int limit){
        return new MenuVO(0,"",menuRepository.count(), menuRepository.findAll(index, limit));
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") long id){
        menuRepository.deleteById(id);
    }

    @GetMapping("/findTypes")
    public List<Type> findTypes(){
        return typeRepository.findAll();
    }

    @PostMapping("/save")
    public void save(@RequestBody Menu menu){
        menuRepository.save(menu);
    }

    @PostMapping("/update")
    public void update(@RequestBody Menu menu){
        menuRepository.update(menu);
    }

    @GetMapping("/findById/{id}")
    public Menu findById(@PathVariable("id") long id){
        return menuRepository.findById(id);
    }

}

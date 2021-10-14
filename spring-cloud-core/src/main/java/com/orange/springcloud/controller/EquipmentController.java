package com.orange.springcloud.controller;

import com.orange.springcloud.pojo.Equipment;
import com.orange.springcloud.service.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EquipmentController {

    @Autowired
    private EquipmentService equipmentService;

    @PostMapping("/equipment/add")
    public boolean add(@RequestBody Equipment equipment){
        System.out.println("id:"+equipment.getId()+"name:"+equipment.getEquipmentName()+"type:"+equipment.getEquipmentType());
        return equipmentService.add(equipment);
    }

    @DeleteMapping("/equipment/delete/{id}")
    public boolean deleteById(@PathVariable("id")Long id){
        return equipmentService.deleteById(id);
    }

    @PutMapping("/equipment/update")
    public boolean updateById(@RequestBody Equipment equipment){
        return equipmentService.updateById(equipment);
    }

    @GetMapping("/equipment/query/{id}")
    public Equipment queryById(@PathVariable("id")Long id){
        return equipmentService.queryById(id);
    }

    @GetMapping("/equipment/list")
    public List<Equipment> queryAll(){
        return equipmentService.queryAll();
    }
}

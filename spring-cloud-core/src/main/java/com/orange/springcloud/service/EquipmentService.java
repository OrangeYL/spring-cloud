package com.orange.springcloud.service;

import com.orange.springcloud.pojo.Equipment;
import org.springframework.stereotype.Service;

import java.util.List;


public interface EquipmentService {
    public boolean add(Equipment equipment);
    public boolean deleteById(Long id);
    public boolean updateById(Equipment equipment);
    public Equipment queryById(Long id);
    public List<Equipment> queryAll();
}

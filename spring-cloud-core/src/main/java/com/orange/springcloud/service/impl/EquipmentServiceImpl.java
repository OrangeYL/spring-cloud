package com.orange.springcloud.service.impl;

import com.orange.springcloud.mapper.EquipmentMapper;
import com.orange.springcloud.pojo.Equipment;
import com.orange.springcloud.service.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipmentServiceImpl implements EquipmentService {

    @Autowired
    private EquipmentMapper equipmentMapper;


    @Override
    public boolean add(Equipment equipment) {
        return equipmentMapper.add(equipment);
    }

    @Override
    public boolean deleteById(Long id) {
        return equipmentMapper.deleteById(id);
    }

    @Override
    public boolean updateById(Equipment equipment) {
        return equipmentMapper.updateById(equipment);
    }

    @Override
    public Equipment queryById(Long id) {
        return equipmentMapper.queryById(id);
    }

    @Override
    public List<Equipment> queryAll() {
        return equipmentMapper.queryAll();
    }
}

package com.orange.springcloud.mapper;

import com.orange.springcloud.pojo.Equipment;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EquipmentMapper {

    public boolean add(Equipment equipment);
    public boolean deleteById(Long id);
    public boolean updateById(Equipment equipment);
    public Equipment queryById(Long id);
    public List<Equipment> queryAll();
}

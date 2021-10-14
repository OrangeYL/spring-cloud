package com.orange.springcloud.controller;


import com.orange.springcloud.Equipment_Consumer;
import com.orange.springcloud.pojo.Equipment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class EquipmentController {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${service-url.nacos-user-service}")
    private String serverURL;

    @PostMapping("/consumer/equipment/add")
    public boolean add(@RequestBody Equipment equipment){

        return restTemplate.postForObject(serverURL+"/equipment/add",equipment,Boolean.class);
    }

    @DeleteMapping("/consumer/equipment/delete/{id}")
    public boolean delete(@PathVariable("id")Long id){

      restTemplate.delete(serverURL+"/equipment/delete/"+id);
      return true;
    }

    @PutMapping("/consumer/equipment/update")
    public boolean update(@RequestBody Equipment equipment){

        //return restTemplate.postForObject(serverURL+"/equipment/update",equipment,Boolean.class);
        String url=serverURL+"/equipment/update";
       restTemplate.put(url,equipment);
       return true;
    }
    @GetMapping("/consumer/equipment/query/{id}")
    public Equipment query(@PathVariable("id")Long id){

        return restTemplate.getForObject(serverURL+"/equipment/query/"+id,Equipment.class);
    }
    @GetMapping("/consumer/equipment/list")
    public List<Equipment> queryAll(){

        return restTemplate.getForObject(serverURL+"/equipment/list",List.class);
    }


}
package com.bigdata.controller;

import com.bigdata.entity.Clazz;
import com.bigdata.service.ClazzService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clazz")
@CrossOrigin
public class ClazzController {

    @Resource
    private ClazzService clazzService;

    /**
     * 查询全部班级列表
     */
    @GetMapping("/list")
    public List<Clazz> list() {
        return clazzService.findAll();
    }

    /**
     * 根据ID查询班级
     */
    @GetMapping("/{id}")
    public Clazz getById(@PathVariable Integer id) {
        return clazzService.findById(id);
    }

    /**
     * 新增班级
     */
    @PostMapping("/add")
    public Integer add(Clazz clazz) {
        return clazzService.add(clazz);
    }

    /**
     * 修改班级信息
     */
    @PostMapping("/update")
    public Integer update(Clazz clazz) {
        return clazzService.update(clazz);
    }

    /**
     * 删除班级
     */
    @DeleteMapping("/{id}")
    public Integer delete(@PathVariable Integer id) {
        return clazzService.deleteById(id);
    }
}
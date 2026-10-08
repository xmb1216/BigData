package com.bigdata.service.Impl;

import com.bigdata.entity.Student;
import com.bigdata.mapper.StudentMapper;
import com.bigdata.service.StudentService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentMapper studentMapper;

    @Override
    public List<Student> findAll() {
        return studentMapper.findAll();
    }

    @Override
    public List<Student> findByClassId(Integer classId) {
        return studentMapper.findByClassId(classId);
    }

    @Override
    public Student findById(Integer id) {
        return studentMapper.findById(id);
    }

    @Override
    public int add(Student student) {
        return studentMapper.insert(student);
    }

    @Override
    public int update(Student student) {
        return studentMapper.update(student);
    }

    @Override
    public int deleteById(Integer id) {
        return studentMapper.deleteById(id);
    }
}
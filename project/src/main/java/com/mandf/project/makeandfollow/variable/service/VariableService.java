package com.mandf.project.makeandfollow.variable.service;

import com.mandf.project.makeandfollow.variable.mapper.VariableMapper;
import com.mandf.project.makeandfollow.variable.model.Variable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VariableService {

    private final VariableMapper variableMapper;

    public VariableService(VariableMapper variableMapper){
        this.variableMapper = variableMapper;
    }

    public List<Variable> getAllVariables(){
        return variableMapper.findAll();
    }

    public List<Variable> getVariablesByMaker(String userUid){
        return variableMapper.findByUser(userUid);
    }
}

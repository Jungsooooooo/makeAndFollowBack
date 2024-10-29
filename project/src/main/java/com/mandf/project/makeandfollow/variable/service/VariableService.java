package com.mandf.project.makeandfollow.variable.service;

import com.mandf.project.makeandfollow.variable.dto.VariableRequestDto;
import com.mandf.project.makeandfollow.variable.dto.VariableWithCompanyUserUidRequestDto;
import com.mandf.project.makeandfollow.variable.mapper.VariableMapper;
import com.mandf.project.makeandfollow.variable.model.Variable;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VariableService {

    private final VariableMapper variableMapper;

    public List<Variable> getAllVariables() {
        return variableMapper.findAll();
    }

    public List<Variable> getVariablesByMaker(String userUid) {

        return variableMapper.findByUser(userUid);
    }

    public int insertVariable(VariableRequestDto variableRequestDto) throws Exception {
        int result = 0;
        try {
            result = variableMapper.insertVariable(variableRequestDto);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public int insertVariableWithCompanyUserUid(VariableWithCompanyUserUidRequestDto variableWithCompanyUserUidRequestDto) throws Exception {
        int result = 0;
        try {
            result = variableMapper.insertVariableWithCompanyUserUid(variableWithCompanyUserUidRequestDto);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}

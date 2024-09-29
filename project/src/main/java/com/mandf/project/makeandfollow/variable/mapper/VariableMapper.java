package com.mandf.project.makeandfollow.variable.mapper;

import com.mandf.project.makeandfollow.variable.dto.VariableRequestDto;
import com.mandf.project.makeandfollow.variable.model.Variable;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface VariableMapper {

    List<Variable> findAll();

    List<Variable> findByUser(String userUid);

    int insertVariable(VariableRequestDto variableRequestDto);
}

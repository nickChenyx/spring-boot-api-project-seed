package com.company.project.service.impl;

import com.company.project.dao.TagMapper;
import com.company.project.model.Tag;
import com.company.project.service.TagService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2017/10/10.
 */
@Service
@Transactional
public class TagServiceImpl extends AbstractService<Tag> implements TagService {
    @Resource
    private TagMapper tagMapper;

}

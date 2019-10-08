package com.spring.sxf.study.springtradeservice.serviceimpl;

import com.spring.sxf.study.springtradedao.entry.Blog;
import com.spring.sxf.study.springtradedao.entry.BlogExample;
import com.spring.sxf.study.springtradedao.mapper.BlogMapper;
import com.spring.sxf.study.springtradeservice.service.BlogService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author <a href="mailto:shangxiaofei@meituan.com">尚晓飞</a>
 * @date 3:28 PM 2019/9/26
 */
@Service
public class BlogServiceImpl implements BlogService {


    @Autowired
    private BlogMapper blogMapper;

    @Transactional(rollbackFor=Exception.class)
    @Override
    public boolean addBlog(Blog blog) {
        return blogMapper.insert(blog) > 0;
    }


    @Override
    public List<Blog> queryBlogs(String name) {
        BlogExample blogExample=new BlogExample();
        BlogExample.Criteria criteria=  blogExample.createCriteria();
        criteria.andNameEqualTo(name);
        return blogMapper.selectByExample(blogExample);
    }
}

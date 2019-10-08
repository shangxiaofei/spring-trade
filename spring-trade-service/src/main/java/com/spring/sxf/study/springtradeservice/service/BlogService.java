package com.spring.sxf.study.springtradeservice.service;

import com.spring.sxf.study.springtradedao.entry.Blog;

import java.util.List;

/**
 * @author <a href="mailto:shangxiaofei@meituan.com">尚晓飞</a>
 * @date 3:27 PM 2019/9/26
 */
public interface BlogService {

    boolean addBlog(Blog blog);

    List<Blog> queryBlogs(String name);
}

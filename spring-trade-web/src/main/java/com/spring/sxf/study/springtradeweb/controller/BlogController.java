package com.spring.sxf.study.springtradeweb.controller;

import com.spring.sxf.study.springtradedao.entry.Blog;
import com.spring.sxf.study.springtradeservice.service.BlogService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

import lombok.extern.slf4j.Slf4j;

/**
 * @author <a href="mailto:shangxiaofei@meituan.com">尚晓飞</a>
 * @date 3:30 PM 2019/9/26
 */
@Slf4j
@Controller
@RequestMapping("/blog")
public class BlogController {

    @Value("${env.envDesc}")
    private String envDesc;

    @Autowired
    private BlogService blogService;


    @RequestMapping("/env")
    @ResponseBody
    public String testEnv(){
        log.info("current envDesc:{}",envDesc);
        return envDesc;
    }

    @RequestMapping("/add")
    @ResponseBody
    public String addBlog(String name,String context){
        log.info("addBlog name:{},context:{}",name,context);
        Blog blog=new Blog();
        blog.setName(name);
        blog.setContext(context);
        blog.setCreateDateTime(new Date());
        blogService.addBlog(blog);
        System.out.println("生成的博客的id为:"+blog.getId());
        return "添加成功";
    }


    @RequestMapping("/query")
    @ResponseBody
    public String queryBlog(String name){
        log.info("queryBlog name:{}",name);
        List<Blog> blogList=blogService.queryBlogs(name);
        if(!CollectionUtils.isEmpty(blogList)){
            for(Blog b:blogList){
                System.out.println("博客信息:id=["+b.getId()+"] name=["+b.getName()+"] context=["+b.getContext()+"] createTime=["+ b.getCreateDateTime()+"]");
            }
        }else{
            System.out.println("博客信息为空");
        }
        return "查询成功";
    }


}

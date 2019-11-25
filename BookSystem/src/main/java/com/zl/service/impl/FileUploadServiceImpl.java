package com.zl.service.impl;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.zl.pojo.Book;

import com.zl.service.FileUploadService;
@Service
public class FileUploadServiceImpl implements FileUploadService {

	@Override
	public Book fileUploadBook(Book book, CommonsMultipartFile fimg) {
			//判断用户是否传图片
			if(fimg.getSize()>0) {
				//获取原始文件名称
				String oldFileName=fimg.getOriginalFilename();//aaa.png
				//随机生成新文件名称
				String newFileName=UUID.randomUUID().toString()+oldFileName.substring(oldFileName.lastIndexOf("."));
				//创建新文件
				File newFile=new File("D://apache-tomcat-8.5.34/webapps/img/"+newFileName);
				//把上传的数据复制到新文件中
				try {
					fimg.transferTo(newFile);
				} catch (IllegalStateException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				//设置图片路径
				book.setTupian("../img/"+newFileName);
			}
			return book;
		}

	}

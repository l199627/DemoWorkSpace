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
			//�ж��û��Ƿ�ͼƬ
			if(fimg.getSize()>0) {
				//��ȡԭʼ�ļ�����
				String oldFileName=fimg.getOriginalFilename();//aaa.png
				//����������ļ�����
				String newFileName=UUID.randomUUID().toString()+oldFileName.substring(oldFileName.lastIndexOf("."));
				//�������ļ�
				File newFile=new File("D://apache-tomcat-8.5.34/webapps/img/"+newFileName);
				//���ϴ������ݸ��Ƶ����ļ���
				try {
					fimg.transferTo(newFile);
				} catch (IllegalStateException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				//����ͼƬ·��
				book.setTupian("../img/"+newFileName);
			}
			return book;
		}

	}

package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.DizhiMapper;
import com.accp.dao.KehuMapper;
import com.accp.domain.Dizhi;
import com.accp.domain.DizhiExample;
import com.accp.domain.Kehu;



@Service
@Transactional
public class kehuservice {
		
	@Autowired
	KehuMapper kh;
	
	@Autowired 
	
	DizhiMapper dz;
	
	//查询
	public Kehu find(Integer userid) {
		Kehu k=kh.selectByPrimaryKey(userid);
		DizhiExample e=new DizhiExample();
		e.createCriteria().andUseridEqualTo(k.getUserid());
		List<Dizhi> dz1=dz.selectByExample(e);
//		k.setDz(dz1);		
		return k;
	}
	
//	//保存
//	public int create(Kehu k) {
//		int count = kh.insert(k);
//		if(count>0) {
//			for(Dizhi d :k.getDz()) {
//				d.setId(k.getUserid());
//				dz.insert(d);
//			}
//		}
//		return count;
//	}
	
	
	public int insert(Kehu k) {
		return kh.insert(k);
	}
}

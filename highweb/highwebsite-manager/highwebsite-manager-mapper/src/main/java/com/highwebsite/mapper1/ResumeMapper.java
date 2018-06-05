package com.highwebsite.mapper1;

import java.util.List;

import com.highwebsite.pojo.T_CAND_IN_1;
import com.highwebsite.pojo.T_CAND_IN_2;
import com.highwebsite.pojo.T_CAND_IN_3;

public interface ResumeMapper {

	//根据用户名(手机号)查询用户的基本信息(关联查询T_CAND_IN_2和DOA_T_USER
	public T_CAND_IN_2 findUserInformationByPhone(String phone);
	//读取目前状况(T_CAND_IN_1.null1)
	public String findPresentCondition(String phone);
	//更新目前状况(T_CAND_IN_2.nulyl3)
	public void updatePresentCondition(String null3);
	
	//通过phone查询对应T_CAND_IN_1数据表的详细信息
	public T_CAND_IN_1 findT_CAND_IN_1ByPhone(String phone);
	
	//向T_CAND_IN_1插入工作经历1，插入之前判断公司名称是否为空
	public void updateJobexperience1(T_CAND_IN_1 t_CAND_IN_1);
	//向T_CAND_IN_1插入工作经历2，插入之前判断公司名称是否为空
	public void updateJobexperience2(T_CAND_IN_1 t_CAND_IN_1);
	//查询公司1和公司2名称是否为空,两个公司名字用逗号连接，ajax再以逗号分割
	public T_CAND_IN_1 findCompanysIsNull(String null4);
	//根据公司名字和手机查询对应的工作经历
	public T_CAND_IN_1 findT_CAND_IN_1ByPhoneandCompany1(T_CAND_IN_1 t_CAND_IN_1);
	//根据公司名字和手机查询对应的工作经历
	public T_CAND_IN_1 findT_CAND_IN_1ByPhoneandCompany2(T_CAND_IN_1 t_CAND_IN_1);
	
	//查询学校1和学校2名称是否为空,两个学校名字用逗号连接，ajax再以逗号分割
	public T_CAND_IN_1 findSchoolsIsNull(String phone);
	//向T_CAND_IN_1插入学校1，插入之前判断学校1名称是否为空
	public void updateschool1(T_CAND_IN_1 t_CAND_IN_1);
	//向T_CAND_IN_1插入工作学校2，插入之前判断学校2名称是否为空
	public void updateschool2(T_CAND_IN_1 t_CAND_IN_1);
	//根据学校名字和手机查询对应的学校经历
	public T_CAND_IN_1 findT_CAND_IN_1ByPhoneandSchool1(T_CAND_IN_1 t_CAND_IN_1);
	//根据学校名字和手机查询对应的学校经历
	public T_CAND_IN_1 findT_CAND_IN_1ByPhoneandSchool2(T_CAND_IN_1 t_CAND_IN_1);
	
	//根据电话查询项目详细信息
	public List<T_CAND_IN_3> findProjectByPhone(String phone); 
	//根据项目名称更新项目信息
	public void UpdateProjectById(T_CAND_IN_3 t_CAND_IN_3);
	//根据手机号插入一个项目信息
	public void InsertProjectByPhone(T_CAND_IN_3 t_CAND_IN_3);
	//根据id查询一个项目信息
	public T_CAND_IN_3 findProjectById(int id);
	
	//根据电话查询作品详细信息
	public List<T_CAND_IN_3> findOpusByPhone(String phone);
	//根据作品名称更新作品信息
	public void UpdateOpusById(T_CAND_IN_3 t_CAND_IN_3);
	//根据id查询作品信息
	public T_CAND_IN_3 findOpusById(int id);
	//带手机号插入一条作品信息
	public void InsertOpusByPhone(T_CAND_IN_3 t_CAND_IN_3);
	
	//根据手机号查询自我描述
	public String findself_descriptionByNull4(String phone);
	//根据手机号更新自我描述
	public void updateself_descriptionByNull4(T_CAND_IN_1 t_CAND_IN_1);
	
	//根据手机号查询出期望工作的详细信息
	public T_CAND_IN_1 findexpectedByNull4(String phone);
	//根据手机号更新期望工作的详细信息
	public void updateexpectedByNull4(T_CAND_IN_1 t_CAND_IN_1);
}

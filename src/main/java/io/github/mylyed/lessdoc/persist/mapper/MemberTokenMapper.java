package io.github.mylyed.lessdoc.persist.mapper;

import io.github.mylyed.lessdoc.persist.entity.MemberToken;
import io.github.mylyed.lessdoc.persist.entity.MemberTokenExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberTokenMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table md_member_token
     *
     * @mbg.generated Fri May 10 23:30:51 CST 2019
     */
    long countByExample(MemberTokenExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table md_member_token
     *
     * @mbg.generated Fri May 10 23:30:51 CST 2019
     */
    int deleteByExample(MemberTokenExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table md_member_token
     *
     * @mbg.generated Fri May 10 23:30:51 CST 2019
     */
    int deleteByPrimaryKey(Integer tokenId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table md_member_token
     *
     * @mbg.generated Fri May 10 23:30:51 CST 2019
     */
    int insert(MemberToken record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table md_member_token
     *
     * @mbg.generated Fri May 10 23:30:51 CST 2019
     */
    int insertSelective(MemberToken record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table md_member_token
     *
     * @mbg.generated Fri May 10 23:30:51 CST 2019
     */
    List<MemberToken> selectByExample(MemberTokenExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table md_member_token
     *
     * @mbg.generated Fri May 10 23:30:51 CST 2019
     */
    MemberToken selectByPrimaryKey(Integer tokenId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table md_member_token
     *
     * @mbg.generated Fri May 10 23:30:51 CST 2019
     */
    int updateByExampleSelective(@Param("record") MemberToken record, @Param("example") MemberTokenExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table md_member_token
     *
     * @mbg.generated Fri May 10 23:30:51 CST 2019
     */
    int updateByExample(@Param("record") MemberToken record, @Param("example") MemberTokenExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table md_member_token
     *
     * @mbg.generated Fri May 10 23:30:51 CST 2019
     */
    int updateByPrimaryKeySelective(MemberToken record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table md_member_token
     *
     * @mbg.generated Fri May 10 23:30:51 CST 2019
     */
    int updateByPrimaryKey(MemberToken record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table md_member_token
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    MemberToken selectOneByExample(MemberTokenExample example);
}
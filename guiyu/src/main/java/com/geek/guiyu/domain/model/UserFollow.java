package com.geek.guiyu.domain.model;

import java.io.Serializable;
import java.util.Date;

public class UserFollow implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_follow.id
     *
     * @mbggenerated Tue Mar 17 23:14:16 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_follow.create_time
     *
     * @mbggenerated Tue Mar 17 23:14:16 CST 2020
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_follow.update_time
     *
     * @mbggenerated Tue Mar 17 23:14:16 CST 2020
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_follow.deleted
     *
     * @mbggenerated Tue Mar 17 23:14:16 CST 2020
     */
    private Byte deleted;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_follow.fans_id
     *
     * @mbggenerated Tue Mar 17 23:14:16 CST 2020
     */
    private Integer fansId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_follow.follow_id
     *
     * @mbggenerated Tue Mar 17 23:14:16 CST 2020
     */
    private Integer followId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_follow
     *
     * @mbggenerated Tue Mar 17 23:14:16 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_follow.id
     *
     * @return the value of user_follow.id
     *
     * @mbggenerated Tue Mar 17 23:14:16 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_follow.id
     *
     * @param id the value for user_follow.id
     *
     * @mbggenerated Tue Mar 17 23:14:16 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_follow.create_time
     *
     * @return the value of user_follow.create_time
     *
     * @mbggenerated Tue Mar 17 23:14:16 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_follow.create_time
     *
     * @param createTime the value for user_follow.create_time
     *
     * @mbggenerated Tue Mar 17 23:14:16 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_follow.update_time
     *
     * @return the value of user_follow.update_time
     *
     * @mbggenerated Tue Mar 17 23:14:16 CST 2020
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_follow.update_time
     *
     * @param updateTime the value for user_follow.update_time
     *
     * @mbggenerated Tue Mar 17 23:14:16 CST 2020
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_follow.deleted
     *
     * @return the value of user_follow.deleted
     *
     * @mbggenerated Tue Mar 17 23:14:16 CST 2020
     */
    public Byte getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_follow.deleted
     *
     * @param deleted the value for user_follow.deleted
     *
     * @mbggenerated Tue Mar 17 23:14:16 CST 2020
     */
    public void setDeleted(Byte deleted) {
        this.deleted = deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_follow.fans_id
     *
     * @return the value of user_follow.fans_id
     *
     * @mbggenerated Tue Mar 17 23:14:16 CST 2020
     */
    public Integer getFansId() {
        return fansId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_follow.fans_id
     *
     * @param fansId the value for user_follow.fans_id
     *
     * @mbggenerated Tue Mar 17 23:14:16 CST 2020
     */
    public void setFansId(Integer fansId) {
        this.fansId = fansId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_follow.follow_id
     *
     * @return the value of user_follow.follow_id
     *
     * @mbggenerated Tue Mar 17 23:14:16 CST 2020
     */
    public Integer getFollowId() {
        return followId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_follow.follow_id
     *
     * @param followId the value for user_follow.follow_id
     *
     * @mbggenerated Tue Mar 17 23:14:16 CST 2020
     */
    public void setFollowId(Integer followId) {
        this.followId = followId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_follow
     *
     * @mbggenerated Tue Mar 17 23:14:16 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", deleted=").append(deleted);
        sb.append(", fansId=").append(fansId);
        sb.append(", followId=").append(followId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
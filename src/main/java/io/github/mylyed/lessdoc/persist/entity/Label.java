package io.github.mylyed.lessdoc.persist.entity;

import java.io.Serializable;

public class Label implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column md_label.label_id
     *
     * @mbg.generated Fri May 10 23:30:51 CST 2019
     */
    private Integer labelId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column md_label.label_name
     *
     * @mbg.generated Fri May 10 23:30:51 CST 2019
     */
    private String labelName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column md_label.book_number
     *
     * @mbg.generated Fri May 10 23:30:51 CST 2019
     */
    private Integer bookNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table md_label
     *
     * @mbg.generated Fri May 10 23:30:51 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column md_label.label_id
     *
     * @return the value of md_label.label_id
     *
     * @mbg.generated Fri May 10 23:30:51 CST 2019
     */
    public Integer getLabelId() {
        return labelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column md_label.label_id
     *
     * @param labelId the value for md_label.label_id
     *
     * @mbg.generated Fri May 10 23:30:51 CST 2019
     */
    public void setLabelId(Integer labelId) {
        this.labelId = labelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column md_label.label_name
     *
     * @return the value of md_label.label_name
     *
     * @mbg.generated Fri May 10 23:30:51 CST 2019
     */
    public String getLabelName() {
        return labelName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column md_label.label_name
     *
     * @param labelName the value for md_label.label_name
     *
     * @mbg.generated Fri May 10 23:30:51 CST 2019
     */
    public void setLabelName(String labelName) {
        this.labelName = labelName == null ? null : labelName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column md_label.book_number
     *
     * @return the value of md_label.book_number
     *
     * @mbg.generated Fri May 10 23:30:51 CST 2019
     */
    public Integer getBookNumber() {
        return bookNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column md_label.book_number
     *
     * @param bookNumber the value for md_label.book_number
     *
     * @mbg.generated Fri May 10 23:30:51 CST 2019
     */
    public void setBookNumber(Integer bookNumber) {
        this.bookNumber = bookNumber;
    }
}
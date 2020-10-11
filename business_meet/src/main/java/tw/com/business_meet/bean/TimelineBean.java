package tw.com.business_meet.bean;

import org.springframework.format.annotation.DateTimeFormat;
import tw.com.business_meet.vo.ActivityInvite;
import tw.com.business_meet.vo.ActivityLabel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class TimelineBean {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    private Integer timelineNo;
    private String matchmakerId;
    private String friendId;
    private String place;
    private String title;
    private String remark;
    private Integer timelinePropertiesNo;
    private String color;
    private Date createDate;
    private String createDateStr;
    private Date modifyDate;
    private String modifyDateStr;
//    @DateTimeFormat(pattern = "MMM dd, yyyy a hh:mm")
    private Date startDate;
    private String startDateStr;
//    @DateTimeFormat(pattern = "MMM dd, yyyy a hh:mm")
    private Date endDate;
    private String endDateStr;
    private ActivityLabelBean activityLabelBean;
    private List<ActivityInviteBean> activityInviteBeanList;
    private Integer statusCode;

    public Integer getTimelineNo() {
        return timelineNo;
    }

    public void setTimelineNo(Integer timelineNo) {
        this.timelineNo = timelineNo;
    }

    public String getMatchmakerId() {
        return matchmakerId;
    }

    public void setMatchmakerId(String matchmakerId) {
        this.matchmakerId = matchmakerId;
    }

    public String getFriendId() {
        return friendId;
    }

    public void setFriendId(String friendId) {
        this.friendId = friendId;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getTimelinePropertiesNo() {
        return timelinePropertiesNo;
    }

    public void setTimelinePropertiesNo(Integer timelinePropertiesNo) {
        this.timelinePropertiesNo = timelinePropertiesNo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreateDateStr() {
        return createDateStr;
    }

    public void setCreateDateStr(String createDateStr) {
        this.createDateStr = createDateStr;
    }

    public String getModifyDateStr() {
        return modifyDateStr;
    }

    public void setModifyDateStr(String modifyDateStr) {
        this.modifyDateStr = modifyDateStr;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }


    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setStartDate(String startDate) {
        try {
            this.startDate = simpleDateFormat.parse(startDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public String getStartDateStr() {
        return startDateStr;
    }

    public void setStartDateStr(String startDateStr) {
        this.startDateStr = startDateStr;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }  public void setEndDate(String endDate) {
        try {
            this.endDate = simpleDateFormat.parse(endDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public String getEndDateStr() {
        return endDateStr;
    }

    public void setEndDateStr(String endDateStr) {
        this.endDateStr = endDateStr;
    }

    public ActivityLabelBean getActivityLabelBean() {
        return activityLabelBean;
    }

    public void setActivityLabelBean(ActivityLabelBean activityLabelBean) {
        this.activityLabelBean = activityLabelBean;
    }

    public List<ActivityInviteBean> getActivityInviteBeanList() {
        return activityInviteBeanList;
    }

    public void setActivityInviteBeanList(List<ActivityInviteBean> activityInviteBeanList) {
        this.activityInviteBeanList = activityInviteBeanList;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }
}

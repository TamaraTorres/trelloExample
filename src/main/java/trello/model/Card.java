package trello.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties({ "badges", "due" , "descData","dueReminder", "email","idAttachmentCover", "attachmentsByType"})


public class Card
{

    public String[] attachments;

    private String[] idLabels;

    private String shortUrl;

    private String dueComplete;

    private String dateLastActivity;

    private String idList;

    private String[] idMembersVoted;

    private String shortLink;

    private String subscribed;

    private String pos;

    private String[] idChecklists;

    private String[] stickers;

    private String id;

    private String limits;

    private String idBoard;

    private String[] checkItemStates;

    private String url;

    private String[] labels;

    private String[] idMembers;

    private String idShort;

    private String due;

    private String idAttachmentCover;

    private String name;

    private String closed;

    private String manualCoverAttachment;

    private String desc;

    public String[] getAttachments ()
    {
        return attachments;
    }

    public void setAttachments (String[] attachments)
    {
        this.attachments = attachments;
    }

    public String[] getIdLabels ()
    {
        return idLabels;
    }

    public void setIdLabels (String[] idLabels)
    {
        this.idLabels = idLabels;
    }

    public String getShortUrl ()
    {
        return shortUrl;
    }

    public void setShortUrl (String shortUrl)
    {
        this.shortUrl = shortUrl;
    }

    public String getDueComplete ()
    {
        return dueComplete;
    }

    public void setDueComplete (String dueComplete)
    {
        this.dueComplete = dueComplete;
    }

    public String getDateLastActivity ()
    {
        return dateLastActivity;
    }

    public void setDateLastActivity (String dateLastActivity)
    {
        this.dateLastActivity = dateLastActivity;
    }

    public String getIdList ()
    {
        return idList;
    }

    public void setIdList (String idList)
    {
        this.idList = idList;
    }

    public String[] getIdMembersVoted ()
    {
        return idMembersVoted;
    }

    public void setIdMembersVoted (String[] idMembersVoted)
    {
        this.idMembersVoted = idMembersVoted;
    }

    public String getShortLink ()
    {
        return shortLink;
    }

    public void setShortLink (String shortLink)
    {
        this.shortLink = shortLink;
    }


    public String getSubscribed ()
    {
        return subscribed;
    }

    public void setSubscribed (String subscribed)
    {
        this.subscribed = subscribed;
    }

    public String getPos ()
    {
        return pos;
    }

    public void setPos (String pos)
    {
        this.pos = pos;
    }

    public String[] getIdChecklists ()
    {
        return idChecklists;
    }

    public void setIdChecklists (String[] idChecklists)
    {
        this.idChecklists = idChecklists;
    }

    public String[] getStickers ()
    {
        return stickers;
    }

    public void setStickers (String[] stickers)
    {
        this.stickers = stickers;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getLimits ()
    {
        return limits;
    }

    public void setLimits (String limits)
    {
        this.limits = limits;
    }

    public String getIdBoard ()
    {
        return idBoard;
    }

    public void setIdBoard (String idBoard)
    {
        this.idBoard = idBoard;
    }

    public String[] getCheckItemStates ()
    {
        return checkItemStates;
    }

    public void setCheckItemStates (String[] checkItemStates)
    {
        this.checkItemStates = checkItemStates;
    }

    public String getUrl ()
    {
        return url;
    }

    public void setUrl (String url)
    {
        this.url = url;
    }

    public String[] getLabels ()
    {
        return labels;
    }

    public void setLabels (String[] labels)
    {
        this.labels = labels;
    }


    public String[] getIdMembers ()
    {
        return idMembers;
    }

    public void setIdMembers (String[] idMembers)
    {
        this.idMembers = idMembers;
    }

    public String getIdShort ()
    {
        return idShort;
    }

    public void setIdShort (String idShort)
    {
        this.idShort = idShort;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getClosed ()
    {
        return closed;
    }

    public void setClosed (String closed)
    {
        this.closed = closed;
    }

    public String getManualCoverAttachment ()
    {
        return manualCoverAttachment;
    }

    public void setManualCoverAttachment (String manualCoverAttachment)
    {
        this.manualCoverAttachment = manualCoverAttachment;
    }

    public String getDesc ()
    {
        return desc;
    }

    public void setDesc (String desc)
    {
        this.desc = desc;
    }


}